<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.List, com.yash.pojo.Nutrient"%>
    
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>View Nutrients</title>
<style>
    table {
        width: 100%;
        border-collapse: collapse;
    }
    th, td {
        border: 1px solid black;
        padding: 8px;
        text-align: left;
    }
    th {
        background-color: #f2f2f2;
        font-weight: bold;
    }
    tfoot td {
        border-top: 2px solid black;
        text-align: center;
    }
</style>
</head>
<body>

<h1>Add Nutrient</h1>

<form action="nutrients" method="post">
    Nutrient name: <input type="text" name="nutrientName"> <br><br>
    Nutrient calorie: <input type="number" name="nutrientCalorie"> <br> <br>
	Nutrient carbs: <input type="number" name="nutrientCarbs"> <br> <br>
	Nutrient sugar: <input type="number" name="nutrientSugar"> <br> <br>
	Nutrient fat: <input type="number" name="nutrientFat"> <br> <br>
	Nutrient protein: <input type="number" name="nutrientProtein"> <br> <br>
	Nutrient Description: <input type="text" name="nutrientDescription"> <br> <br>
    <input type="submit" value="Submit">
</form>

<h1>Nutrients List</h1>

<table>
<thead>
        <tr>
        	<th>Sr. No</th>
            <th>Nutrient Name</th>
            <th>Calorie</th>
            <th>Carbs</th>
            <th>Sugar</th>
            <th>Fat</th>
            <th>Protein</th>
            <th>Description</th>
            <th colspan="2">Action</th>
        </tr>
    </thead>
    <tbody>
    <%
        List<Nutrient> nutrients = (List<Nutrient>) request.getAttribute("nutrients");
        if (nutrients != null) {
        	int serialNo = 1;
            for (Nutrient nutrient : nutrients) {
    %>
    		<tr>
    			<td><%= serialNo %></td>
                <td><%= nutrient.getNutrientName() %></td>
                <td><%= nutrient.getNutrientCalorie() %></td>
                <td><%= nutrient.getNutrientCarbs() %></td>
                <td><%= nutrient.getNutrientSugar() %></td>
                <td><%= nutrient.getNutrientFat() %></td>
                <td><%= nutrient.getNutrientProtein() %></td>
                <td><%= nutrient.getNutrientDescription() %></td>
                <td>Edit</td>
            	<td>Delete</td>
            </tr>
    <%
    serialNo++;
            }
        }
    %>
 </tbody>
</table>

</body>
</html>
