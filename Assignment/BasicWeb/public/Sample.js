function validateForm() {
    var username = document.getElementById('username').value;
    var email = document.getElementById('email').value;
    var password = document.getElementById('password').value;
    var errorMessage = document.getElementById('error-message');


    errorMessage.textContent = '';

    // Validate username
    if (username.trim() === '') {
        errorMessage.textContent = 'Username cannot be empty';
        return errorMessage;
    }

    // Validate email
    var emailPattern = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
    if (!emailPattern.test(email)) {
        errorMessage.textContent = 'Enter a valid email address';
         return errorMessage;
        
    }

    // Validate password
    if (password.length < 6) {
        errorMessage.textContent = 'Password must be at least 6 characters long';
         return errorMessage;
       
    }

    // If all validations pass
    alert('Sign-up successful!\nUsername: ' + username + '\nEmail: ' + email);
}
