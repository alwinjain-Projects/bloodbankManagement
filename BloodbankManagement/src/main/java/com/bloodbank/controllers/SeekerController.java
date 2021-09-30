package com.bloodbank.controllers;

import java.util.List;
import java.util.Optional;

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
public class SeekerController {

	@Autowired
	IService seekerService;

	@RequestMapping(value = "/patientForm")
	public ModelAndView patientForm() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("patientform");
		return mv;
	}

	@RequestMapping(value = "/addPatient")
	public ModelAndView addPatient(Seeker seeker) {
		ModelAndView mv = new ModelAndView();
		seekerService.insertSeeker(seeker);
		mv.setViewName("thankyou");
		return mv;
	}
	
	@RequestMapping(value="/addSeeker")
	public ModelAndView addBloodBank(Seeker seeker) 
	{
		ModelAndView mv = new ModelAndView();
		seekerService.insertSeekerDetails(seeker);
		mv.setViewName("thankyou");
		return mv;
	}
	
	@RequestMapping(value="/viewpatientdetails")
	public ModelAndView viewPatientDetails(Model model) 
	{
		ModelAndView mv = new ModelAndView();
		List<Seeker> list = seekerService.viewSeekerDetails();
		mv.setViewName("viewPatientDetails");
		model.addAttribute("list",list);
		return mv;
	}
	
	@RequestMapping(path = "/delete/{id}")
	public String deleteSeekerById(Model model, @PathVariable("id") int id)

	{

		seekerService.deleteSeekerById(id);
		return "redirect:/viewpatientdetails";
	}

	}
