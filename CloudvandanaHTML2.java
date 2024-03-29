<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Survey Form</title>
    <link rel="stylesheet" href="styles.css">
</head>

<body>
    <div class="form-container">
        <form id="survey-form">
            <label for="first-name">First Name:</label>
            <input type="text" id="first-name" required><br>

            <label for="last-name">Last Name:</label>
            <input type="text" id="last-name" required><br>

            <label for="dob">Date of Birth:</label>
            <input type="date" id="dob" required><br>

            <label for="country">Country:</label>
            <select id="country" required>
                <option value="usa">USA</option>
                <option value="canada">Canada</option>
                <option value="uk">UK</option>
                <!-- Add more countries as needed -->
            </select><br>

            <label>Gender:</label>
            <input type="checkbox" id="male"> Male
            <input type="checkbox" id="female"> Female<br>

            <label for="profession">Profession:</label>
            <input type="text" id="profession" required><br>

            <label for="email">Email:</label>
            <input type="email" id="email" required><br>

            <label for="mobile">Mobile Number:</label>
            <input type="tel" id="mobile" required><br>

            <button type="button" id="submit-btn">Submit</button>
            <button type="reset" id="reset-btn">Reset</button>
        </form>
    </div>

    <div class="popup" id="popup">
        <div class="popup-content" id="popup-content">
            <span class="close" id="close-btn">&times;</span>
            <div id="popup-text"></div>
        </div>
    </div>

    <script src="script.js"></script>
</body>

</html>
