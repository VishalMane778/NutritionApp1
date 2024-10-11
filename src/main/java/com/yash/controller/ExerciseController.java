package com.yash.controller;

import com.yash.pojo.Exercise;
import com.yash.services.ExerciseServices;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/exercise")
public class ExerciseController extends HttpServlet {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ExerciseServices exerciseService;

    public void init() {
        exerciseService = new ExerciseServices();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	
    	// method for showing data 

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");

        if ("add".equals(action)) {
            String name = req.getParameter("name");
            int sets = Integer.parseInt(req.getParameter("sets"));
            int reps = Integer.parseInt(req.getParameter("reps"));
            int workoutPlanId = Integer.parseInt(req.getParameter("workoutPlanId"));

            Exercise exercise = new Exercise();
            exercise.setName(name);
            exercise.setSets(sets);
            exercise.setReps(reps);
            exercise.setWorkoutPlanId(workoutPlanId);
            req.getRequestDispatcher("/viewExercises.jsp").forward(req, resp);

            exerciseService.addExercise(exercise);
            
        }

        int workoutPlanId = Integer.parseInt(req.getParameter("workoutPlanId"));
        resp.sendRedirect("exercise?action=list&workoutPlanId=" + workoutPlanId);
        
    }
}
