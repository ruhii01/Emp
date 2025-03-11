function validateForm() {
    let name = document.getElementById("name").value;
    let age = document.getElementById("age").value;
    let gender = document.getElementById("gender").value;
    let studentClass = document.getElementById("class").value;
    let email = document.getElementById("email").value;
    let phone = document.getElementById("phone").value;

    // Check if all fields are filled
    if (name == "" || age == "" || gender == "" || studentClass == "" || email == "" || phone == "") {
        alert("Please fill in all the fields.");
        return false;
    }

    // Validate email format
    let emailPattern = /^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,4}$/;
    if (!emailPattern.test(email)) {
        alert("Please enter a valid email address.");
        return false;
    }

    // Validate phone number format (10 digits)
    let phonePattern = /^[0-9]{10}$/;
    if (!phonePattern.test(phone)) {
        alert("Please enter a valid 10-digit phone number.");
        return false;
    }

    // If everything is valid
    alert("Registration successful!");
    return true;
}

