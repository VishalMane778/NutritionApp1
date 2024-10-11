package com.yash.services;

import java.util.List;

import com.yash.dao.NutrientDaoImpl;
import com.yash.pojo.Nutrient;

public class NutrientServiceImpl implements NutrientService{
	NutrientDaoImpl addNutrientDaoImpl = new NutrientDaoImpl();

	@Override
	public void addNutrient(Nutrient nutrient) {
		addNutrientDaoImpl.addNutrient(nutrient);
	}

	@Override
	public List<Nutrient> getAllNutrients() {
		return addNutrientDaoImpl.getAllNutrients() ;
	}

}
