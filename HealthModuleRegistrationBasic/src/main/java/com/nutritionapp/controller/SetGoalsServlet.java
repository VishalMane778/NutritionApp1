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
import java.sql.ResultSet;
import java.sql.SQLException;

@WebServlet("/setGoals")
public class SetGoalsServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

	@Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String goalType = request.getParameter("goalType"); // e.g., weight loss or muscle gain
        String goalValue = request.getParameter("goalValue"); // value from slider
        String timeframe = request.getParameter("timeframe");

        User user = (User ) request.getSession().getAttribute("user");
        if (user == null) {
            // Handle the case where the user is not logged in
            response.sendRedirect("goalsSet.jsp");
            return;
        }
        
        

        try (Connection connection = DBConnection.getConnection()) {
            String query = "INSERT INTO user_goals (user_id, goal_type, goal_value, timeframe) VALUES (?, ?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, user.getId());
            statement.setString(2, goalType);
            statement.setString(3, goalValue);
            statement.setString(4, timeframe);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        response.sendRedirect("goalsSet.jsp");
    }
}
