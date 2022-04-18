package com.skilldistillery.travel.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.skilldistillery.travel.data.TravelDAO;
import com.skilldistillery.travel.entities.Destination;

@Controller
public class TravelController {

	@Autowired
	private TravelDAO dao;
	
	@RequestMapping(path= {"/", "home.do"})
	public String home(Model model) {
		model.addAttribute("destList", dao.showAll());
		return "index";
	}
	
	@RequestMapping(path= "add.do")
	public String addPage(Model model) {
		model.addAttribute("Destination", new Destination());
		return "adddestination";
	}
	
	
	@RequestMapping(path="citySearch.do", method = RequestMethod.POST)
	public String citySearch(String city, RedirectAttributes redir) {
		Destination dest = dao.findByCityName(city);
		
		redir.addFlashAttribute("dest", dest);
		
		return "redirect:resultRedir.do";
	}

	@RequestMapping(path="idSearch.do", method = RequestMethod.POST)
	public String idSearch(int id, RedirectAttributes redir) {
		Destination dest = dao.findById(id);
		
		redir.addFlashAttribute("dest", dest);
		
		
		return "redirect:resultRedir.do";
	}
	
	@RequestMapping(path="addDest.do", method = RequestMethod.POST)
	public String addDestination(Destination dest, RedirectAttributes redir) {
		
		redir.addFlashAttribute("dest", dao.createDestination(dest));
		
		return "redirect:resultRedir.do";
	}
	
	@RequestMapping(path="delete.do", method = RequestMethod.POST)
	public String delete(int id,RedirectAttributes redir) {
		redir.addFlashAttribute("isDeleted", dao.deleteDestination(id));
		return "redirect:deleteRedir.do";
	}
	
	@RequestMapping(path="deleteRedir.do", method = RequestMethod.GET)
	public ModelAndView deleteResult() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("deleted");
		return mv;
	}
	
	@RequestMapping(path="edit.do", method = RequestMethod.POST)
	public ModelAndView edit(int id, RedirectAttributes redir) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("dest", dao.findById(id));
		mv.setViewName("edit");
		return mv;
	}
	
	
	@RequestMapping(path="editDest.do", method = RequestMethod.POST)
	public String editPage(Destination dest, RedirectAttributes redir) {
		redir.addFlashAttribute("dest", dest);
		return "redirect:resultRedir.do";
	}
	
	@RequestMapping(path="resultRedir.do", method = RequestMethod.GET)
	public ModelAndView result() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("result");;
		return mv;
	}
	
}
