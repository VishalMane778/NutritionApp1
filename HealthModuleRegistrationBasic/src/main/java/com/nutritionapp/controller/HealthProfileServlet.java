package com.nutritionapp.controller;



import com.nutritionapp.model.User;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@WebServlet("/saveProfile")
public class HealthProfileServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // You might want to redirect to the form page here
        response.sendRedirect("healthProfile.jsp"); // Redirect to the form
    }

	@Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String age = request.getParameter("age");
        String weight = request.getParameter("weight");
        String height = request.getParameter("height");
        String activityLevel = request.getParameter("activityLevel");

        User user = new User(Integer.parseInt(age), Double.parseDouble(weight), Double.parseDouble(height), activityLevel);

        try (Connection connection = DBConnection.getConnection()) {
            String query = "INSERT INTO user_profile(age, weight, height, activity_level) VALUES (?, ?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, user.getAge());
            statement.setDouble(2, user.getWeight());
            statement.setDouble(3, user.getHeight());
            statement.setString(4, user.getActivityLevel());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        request.getSession().setAttribute("user", user);

        response.sendRedirect("profileSaved.jsp");
    }
   
}
