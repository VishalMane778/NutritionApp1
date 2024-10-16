<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>BMI Calculator</title>
    <link rel="stylesheet" href="css/style.css">
</head>
<body>
    <h1>BMI Calculator</h1>
    <form action="calculateBMI" method="post">
        <label for="weight">Weight (kg):</label>
        <input type="number" id="weight" name="weight" required><br><br>

        <label for="height">Height (cm):</label>
        <input type="number" id="height" name="height" required><br><br>

        <button type="submit">Calculate BMI</button>
    </form>
</body>
</html>
