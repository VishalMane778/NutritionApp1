package com.yash.dao;

import java.util.List;

import com.yash.pojo.Nutrient;

public interface NutrientDao {
	void addNutrient(Nutrient nutrient);
	List<Nutrient> getAllNutrients();
}
