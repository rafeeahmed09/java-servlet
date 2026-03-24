<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Sign Up</title>
  <link rel="stylesheet" href="style.css">
</head>
<body>
  <main class="login-page">
    <section class="login-card">
      <h1>Create Account</h1>
      <p class="subtitle">Fill in the details to sign up</p>

      <form action="NewEmployee" method="post" class="login-from">
        <label for="FirstName">First Name</label>
        <input type="text" name="firstName" id="FirstName" placeholder="Enter First Name" required>

        <label for="LastName">Last Name</label>
        <input type="text" name="lastname" id="lastname" placeholder="Enter last name" required>

        <label for="email">Email</label>
        <input type="Email" name="email" id="email" placeholder="Enter email" required>

        <label for="Address">Address</label>
        <input type="text" name="address" id="address" placeholder="Enter address" required>

        <label for="Contact">Contact</label>
        <input type="text" name="Contact" id="Contact" placeholder="Enter Contact" required>

        <label for="Password">Password</label>
        <input type="password" name="Password" id="Password" placeholder="Enter Password" required>

        <button type="submit" class="primary-button">Sign Up</button>
      </form>

      <p class="signup-text">Already have an account?</p>
      <a class="secondary-button" href="Login.html">Back to login</a>
    </section>
  </main>
</body>
</html>
