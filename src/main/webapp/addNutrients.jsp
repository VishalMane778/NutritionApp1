<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Nutrients</title>
</head>
<body>

<h1>Add Nutrient</h1>


<form action="nutrients" method="post">

Nutrient name: <input type="text" name="nutrientName"> <br> <br>
Nutrient calorie: <input type="number" name="nutrientCalorie"> <br> <br>
Nutrient carbs: <input type="number" name="nutrientCarbs"> <br> <br>
Nutrient sugar: <input type="number" name="nutrientSugar"> <br> <br>
Nutrient fat: <input type="number" name="nutrientFat"> <br> <br>
Nutrient protein: <input type="number" name="nutrientProtein"> <br> <br>
Nutrient Description: <input type="text" name="nutrientDescription"> <br> <br>
<input type="submit" value="Submit" >

</form>

</body>
</html>