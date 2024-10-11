package com.yash.DAO;

import com.yash.pojo.Exercise;
import com.yash.util.DBUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ExerciseDAO {

    public void addExercise(Exercise exercise) {
        try (Connection connection = DBUtil.getConnection()) {
            String query = "INSERT INTO exercises (name, sets, reps) VALUES (?, ?, ?)";
            System.out.println("Connection Established");
            PreparedStatement stmt = connection.prepareStatement(query);
//            stmt.setInt(1, exercise.getWorkoutPlanId());
            stmt.setString(1, exercise.getName());
            stmt.setInt(2, exercise.getSets());
            stmt.setInt(3, exercise.getReps());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Exercise> getExercisesByWorkoutPlanId(int workoutPlanId) {
        List<Exercise> exercises = new ArrayList<>();
        try (Connection connection = DBUtil.getConnection()) {
            String query = "SELECT * FROM exercises WHERE workout_plan_id = ?";
            PreparedStatement stmt = connection.prepareStatement(query);
            stmt.setInt(1, workoutPlanId);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Exercise exercise = new Exercise(
                    rs.getInt("workout_plan_id"),
                    rs.getString("name"),
                    rs.getInt("sets"),
                    rs.getInt("reps")
                );
                exercises.add(exercise);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return exercises;
    }

    public void updateExercise(Exercise exercise) {
        try (Connection connection = DBUtil.getConnection()) {
            String query = "UPDATE exercises SET name = ?, sets = ?, reps = ? WHERE id = ?";
            PreparedStatement stmt = connection.prepareStatement(query);
            stmt.setString(1, exercise.getName());
            stmt.setInt(2, exercise.getSets());
            stmt.setInt(3, exercise.getReps());
            stmt.setInt(4, exercise.getId());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteExercise(int id) {
        try (Connection connection = DBUtil.getConnection()) {
            String query = "DELETE FROM exercises WHERE id = ?";
            PreparedStatement stmt = connection.prepareStatement(query);
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}