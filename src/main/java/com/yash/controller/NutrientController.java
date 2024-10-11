package com.yash.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yash.pojo.Nutrient;
import com.yash.services.NutrientService;
import com.yash.services.NutrientServiceImpl;


// <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

@WebServlet("/nutrients")
public class NutrientController extends HttpServlet{
	NutrientService nutrientService = new NutrientServiceImpl();
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Nutrient nutrient = new Nutrient();
		
//		String nutrientName = req.getParameter("nutrientName");
		
		nutrient.setNutrientName(req.getParameter("nutrientName"));
		nutrient.setNutrientCalorie(Double.parseDouble(req.getParameter("nutrientCalorie")));
		nutrient.setNutrientCarbs(Double.parseDouble(req.getParameter("nutrientCarbs")));
		nutrient.setNutrientSugar(Double.parseDouble(req.getParameter("nutrientSugar")));
		nutrient.setNutrientFat(Double.parseDouble(req.getParameter("nutrientFat")));
		nutrient.setNutrientProtein(Double.parseDouble(req.getParameter("nutrientProtein")));
		nutrient.setNutrientDescription(req.getParameter("nutrientDescription"));
		
		nutrientService.addNutrient(nutrient);
		
		resp.sendRedirect("nutrients");
		
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<Nutrient> nutrients = nutrientService.getAllNutrients();
		req.setAttribute("nutrients", nutrients);
		req.getRequestDispatcher("viewNutrients.jsp").forward(req, resp);
		
		
	}

}
