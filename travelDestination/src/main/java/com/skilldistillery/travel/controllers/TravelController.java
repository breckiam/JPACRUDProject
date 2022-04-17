package com.skilldistillery.travel.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.skilldistillery.travel.data.TravelDAO;
import com.skilldistillery.travel.entities.Destination;

@Controller
public class TravelController {

	@Autowired
	private TravelDAO dao;
	
	@RequestMapping(path= {"/", "home.do"})
	public String home(Model model) {
		model.addAttribute("DEBUG", dao.findById(1));
		return "index";
	}
	
	
	@RequestMapping(path="citySearch.do", method = RequestMethod.POST)
	public ModelAndView citySearch(String city) {
		Destination dest = dao.findByCityName(city);
		ModelAndView mv = new ModelAndView();
		
		mv.addObject("dest", dest);
		mv.setViewName("result");
		
		return mv;
	}

	@RequestMapping(path="idSearch.do", method = RequestMethod.POST)
	public ModelAndView idSearch(int id) {
		Destination dest = dao.findById(id);
		ModelAndView mv = new ModelAndView();
		
		mv.addObject("dest", dest);
		mv.setViewName("result");
		
		return mv;
	}
}
