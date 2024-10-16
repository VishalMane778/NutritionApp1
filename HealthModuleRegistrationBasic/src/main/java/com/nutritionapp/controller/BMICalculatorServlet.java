package com.nutritionapp.controller;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/calculateBMI")
public class BMICalculatorServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

	@Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String weight = request.getParameter("weight");
        String height = request.getParameter("height");

        double weightKg = Double.parseDouble(weight);
        double heightMeters = Double.parseDouble(height) / 100;

        double bmi = weightKg / (heightMeters * heightMeters);
        String bmiCategory;

        if (bmi < 18.5) {
            bmiCategory = "Underweight";
        } else if (bmi >= 18.5 && bmi < 24.9) {
            bmiCategory = "Normal";
        } else if (bmi >= 25 && bmi < 29.9) {
            bmiCategory = "Overweight";
        } else {
            bmiCategory = "Obese";
        }

        request.setAttribute("bmiValue", bmi);
        request.setAttribute("bmiCategory", bmiCategory);
        request.getRequestDispatcher("bmiResult.jsp").forward(request, response);
    }
}
