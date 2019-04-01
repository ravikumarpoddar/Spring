package com.app.mvc.controller;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.app.mvc.DTO.BookingDTO;
import com.app.mvc.service.BookingService;

@Controller
@RequestMapping("/")
public class BookingController implements Serializable{

	@Autowired
	private BookingService service;
	//1 request = 1method 
	@RequestMapping(value="/booking.do",method=RequestMethod.POST)
	public ModelAndView bookFlight(@ModelAttribute BookingDTO dto) {
		//call the method and pass the dto
		service.book(dto);
		ModelAndView model=new ModelAndView();
		// success.jsp
		model.setViewName("success");
		//sending dynamic data
		model.addObject("dest", dto.getDestination());
		model.addObject("date", dto.getDate());
		return model;
		
	}
	
	
	
	//load the data
	
	@RequestMapping( value="/load.do",method=RequestMethod.GET)
	public ModelAndView loadFromService() {
		System.out.println("entering load in controller");
List<BookingDTO> bookings=service.loadFromDAO();
	ModelAndView model=new ModelAndView();
	model.setViewName("AllBookings");
	model.addObject("bookings", bookings);
		return model;
		
	}

	//update the record
	@RequestMapping(value="/update.do", method=RequestMethod.GET)
	
	public void updateRecord(@ModelAttribute BookingDTO dto) {
		System.out.println("inside update");
		System.out.println(dto.getTicketNo());
		service.updateRecord(dto);
	}
	
	@RequestMapping(value="/delete.do")
	public void deleteRecord(@RequestParam("ticket") int ticket) {
		System.out.println(ticket);
		service.deleteData(ticket);
		
	}
	@RequestMapping("/edit.do")
	  public ModelAndView edit(@RequestParam("ticket") int ticket){
		  ModelAndView model=  new ModelAndView();
		  model.setViewName("update");
			model.addObject("booking",  service.edit(ticket));
				return model;
	  }
	
	
	
	

	
	
}
