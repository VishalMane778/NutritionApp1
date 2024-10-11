package com.yash.pojo;

public class Exercise {
    private int id;
    private int workoutPlanId;
    private String name;
    private int sets;
    private int reps;

    public Exercise() {}

    public Exercise( int workoutPlanId, String name, int sets, int reps) {
       
        this.workoutPlanId = workoutPlanId;
        this.name = name;
        this.sets = sets;
        this.reps = reps;
    }

    public int getId() {
    	return id;
    	}
    
    public void setId(int id) {
    	this.id = id; 
    	}
    

    public int getWorkoutPlanId() {
    	return workoutPlanId;
    	}
    
    public void setWorkoutPlanId(int workoutPlanId) { 
    	this.workoutPlanId = workoutPlanId;
    	}

    public String getName() {
    	return name; 
    	}
    
    public void setName(String name) { 
    	this.name = name;
    	}

    public int getSets() {
    	return sets;
    	}
    
    public void setSets(int sets) { 
    	this.sets = sets; 
    	}
    

    public int getReps() { 
    	return reps;
    	}
    
    public void setReps(int reps) { 
    	this.reps = reps; 
    	}
    
}
