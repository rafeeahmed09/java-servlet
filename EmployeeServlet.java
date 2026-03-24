package Company;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/NewEmployee")
public class EmployeeServlet extends HttpServlet {

        private EmployeeJDBC employeeJDBC = new EmployeeJDBC();

        protected void doPost(HttpServletRequest request, HttpServletResponse response)
                throws ServletException, IOException {

            String firstName = request.getParameter("firstName");
            String lastName = request.getParameter("lastName");
            String email = request.getParameter("email");
            String address = request.getParameter("address");
            String contact = request.getParameter("contact");
            String password = request.getParameter("password");

            Employee employee = new Employee();
            employee.setFirstName(firstName);
            employee.setLastName(lastName);
            employee.setEmail(email);
            employee.setAddress(address);
            employee.setContact(contact);
            employee.setPassword(password);

            try {
                int result = employeeJDBC.insertEmployee(employee);
                if (result > 0) {
                    response.sendRedirect("Login.html?success=true");
                } else {
                    response.sendRedirect("signup.html?failed=true");
                }
            } catch (Exception e) {
                e.printStackTrace();
                response.sendRedirect("signup.html?error=true");
            }
        }
}
