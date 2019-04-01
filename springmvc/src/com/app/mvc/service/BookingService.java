package com.app.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.app.mvc.DAO.BookingDAO;
import com.app.mvc.DTO.BookingDTO;
@Service
public class BookingService {
	@Autowired
	private BookingDAO dao;

	//method(dto)
	public void book(BookingDTO dto) {
		System.out.println("inside service layer");
		System.out.println(dto.getSource());
		//send the data to DAO
		dao.book(dto);
	}
	
	//load the data
	public List<BookingDTO> loadFromDAO() {
		return dao.loadFromDB();
	}
	
	//update the record
	
	public void updateRecord(BookingDTO dto) {
		dao.updateRecord(dto);
	}
	
	//delete record
	public void deleteData(int ticket) {
		dao.deleteRecord(ticket);
	}
	public BookingDTO edit(int ticket){
		return dao.edit(ticket);
	}
	
}
