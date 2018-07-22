package com.cg.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cg.beans.Trainee;
import com.cg.service.TraineeService;



@Controller
public class ActionController {
	@Autowired(required=true)
	TraineeService service;

	
	@RequestMapping(value="/addTrainee",method=RequestMethod.POST)
public ModelAndView getUpdate(@ModelAttribute("trainee") Trainee trainee) {
			trainee = service.addDetails(trainee);
			ModelAndView modelAndView = new ModelAndView("addSucessPage", "trainee", trainee);
			return modelAndView;
		
	}
	@RequestMapping(value="/delTrainee",method=RequestMethod.POST)
public ModelAndView getDelete(@ModelAttribute("trainee") Trainee trainee) {
			service.delete(trainee.getTraineeId());
			ModelAndView modelAndView = new ModelAndView("delSucessPage");
			return modelAndView;
		
	}
	@RequestMapping(value="/viewAll")
	public ModelAndView getAllDetails() {
				List<Trainee> list=service.getAllDetails();
				ModelAndView modelAndView = new ModelAndView("viewAllPage", "trainee", list);
				return modelAndView;
			
		}

}
