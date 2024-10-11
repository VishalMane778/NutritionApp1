package com.yash.services;

import java.util.List;

import com.yash.pojo.Nutrient;

public interface NutrientService {
	void addNutrient(Nutrient nutrient);
	List<Nutrient> getAllNutrients();
}
