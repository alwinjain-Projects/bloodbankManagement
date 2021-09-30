package com.bloodbank.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bloodbank.models.BloodBank;
import com.bloodbank.models.Seeker;
import com.bloodbank.services.IService;

@Controller
public class BloodBankController {
	@Autowired
	IService bloodBankService;
	
	@RequestMapping(value="/bloodbank")
	public ModelAndView bloodBank() 
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("bloodbank");
		return mv;
	}
	
	@RequestMapping(value="/addBloodBank")
	public ModelAndView addBloodBank(BloodBank bloodBank) 
	{
		ModelAndView mv = new ModelAndView();
		bloodBankService.insertBloodBank(bloodBank);
		mv.setViewName("thankyou");
		return mv;
	}
	
	@RequestMapping(value="/viewbloodbanks")
	public ModelAndView viewBloodBankDetails(Model model) 
	{
		ModelAndView mv = new ModelAndView();
		List<BloodBank> list = bloodBankService.viewBloodBankDetails();
		mv.setViewName("viewBloodBankDetails");
		model.addAttribute("list",list);
		return mv;
	}
	
	@RequestMapping(path = "/deleteBB/{id}")
	public String deleteBloodBankById(Model model, @PathVariable("id") int id)

	{

		bloodBankService.deleteBloodBankById(id);
		return "redirect:/viewbloodbanks";
	}


}
