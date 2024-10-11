package com.yash.services;

import com.yash.DAO.ExerciseDAO;
import com.yash.pojo.Exercise;

import java.util.List;

public class ExerciseServices {
    private ExerciseDAO exerciseDAO;

    public ExerciseServices() {
        exerciseDAO = new ExerciseDAO();
    }

    public void addExercise(Exercise exercise) {
        exerciseDAO.addExercise(exercise);
    }

    public List<Exercise> getExercisesByWorkoutPlanId(int workoutPlanId) {
        return exerciseDAO.getExercisesByWorkoutPlanId(workoutPlanId);
    }

    public void updateExercise(Exercise exercise) {
        exerciseDAO.updateExercise(exercise);
    }

    public void deleteExercise(int id) {
        exerciseDAO.deleteExercise(id);
    }
}