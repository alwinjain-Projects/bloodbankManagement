package com.bloodbank.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bloodbank.models.BloodStock;
import com.bloodbank.models.Seeker;
import com.bloodbank.services.IService;

@Controller
public class BloodStockController {
	
	@Autowired
	IService bloodStockService;

	@RequestMapping(value = "/bloodstock")
	public ModelAndView bloodStock() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("bloodstock");
		return mv;
	}

	@RequestMapping(value = "/addbloodstock")
	public ModelAndView addBloodStock(BloodStock bloodStock) {
		ModelAndView mv = new ModelAndView();
		bloodStockService.insertBloodStock(bloodStock);
		mv.setViewName("thankyou");
		return mv;
	}
	
	

	
	@RequestMapping(value="/viewbloodstock")
	public ModelAndView viewBloodStock(Model model) 
	{
		ModelAndView mv = new ModelAndView();
		List<BloodStock> list = bloodStockService.viewBloodStockInfo();
		mv.setViewName("viewBloodStock");
		model.addAttribute("list",list);
		return mv;
	}
	
	@RequestMapping(path = "/deleteBS/{id}")
	public String deleteBloodStockById(Model model, @PathVariable("id") int id)

	{

		bloodStockService.deleteBloodStockById(id);
		return "redirect:/viewbloodstock";
	}


}
