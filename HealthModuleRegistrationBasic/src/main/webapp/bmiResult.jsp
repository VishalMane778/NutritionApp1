<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>BMI Result</title>
    <link rel="stylesheet" href="css/style.css">
</head>
<body>
    <h1>Your BMI Result</h1>
    <p>Your BMI: <strong><%= request.getAttribute("bmiValue") %></strong></p>
    <p>Category: <strong><%= request.getAttribute("bmiCategory") %></strong></p>

    <p>
        <a href="bmiCalculation.jsp">Calculate Again</a>
        
        <a href="setGoals.jsp">Set your Goal</a>
        
    </p>
</body>
</html>
