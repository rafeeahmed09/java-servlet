<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Employee Portal</title>
  <link rel="stylesheet" href="style.css">
</head>
<body>
  <main class="auth-page">
    <section class="auth-card">
      <p class="eyebrow">Company Portal</p>
      <h1>Employee Portal</h1>
      <p class="subtitle">Use the links below to sign in or create a new account.</p>

      <% String login = request.getParameter("login"); %>
      <% if ("success".equals(login)) { %>
      <div class="alert success">Login successful.</div>
      <% } %>

      <a class="primary-link" href="Login.html">Open Login</a>
      <a class="secondary-button" href="signup.html">Create Account</a>
    </section>
  </main>
</body>
</html>
