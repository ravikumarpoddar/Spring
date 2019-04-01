package com.app.mvc.DAO;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.app.mvc.DTO.BookingDTO;
@Repository
public class BookingDAO {
	
	@Autowired
	private SessionFactory sf;
	// hibernate or jdbc  to save the data
	public void book(BookingDTO dto) {
		System.out.println("inside DAO layer");
		//components of hibernate
		Session sess=sf.openSession();
		sess.save(dto);
		sess.beginTransaction().commit();
	}
	
	//load the data from the database
	public List<BookingDTO> loadFromDB() {
		return sf.openSession().createCriteria(BookingDTO.class).list();
	}
	
	// update the record
	public void updateRecord(BookingDTO dto) {
		Session sess=sf.openSession();
		sess.update(dto);
		sess.beginTransaction().commit();
	}
	//delete the record
	
	public void deleteRecord(int ticket) {
		Session sess=sf.openSession();
		BookingDTO book=sess.load(BookingDTO.class, ticket);
		sess.delete(book);
		sess.beginTransaction().commit();
	}
	 public BookingDTO edit(int ticket){
		 Session sess=sf.openSession();
		              BookingDTO booking=sess.load(BookingDTO.class,ticket);
		                  return booking;
		              
	 }
	
	
	
}
