<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Exercise</title>
</head>
<body>

<h1> Add your custom exercise </h1>

<form action="exercise" method="post">
    <input type="hidden" name="action" value="add">
    <input type="hidden" name="workoutPlanId" value = "1"> 
    <input type="text" name="name" placeholder="Exercise Name" required><br> <br>
    <input type="number" min = "1" name="sets" placeholder="Sets" required><br> <br>
    <input type="number" min = "1" name="reps" placeholder="Reps" required><br> <br>
    <input type="submit" value="Add Exercise">
</form>


</body>
</html>