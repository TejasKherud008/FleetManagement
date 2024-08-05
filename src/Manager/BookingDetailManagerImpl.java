package com.example.demo.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.BookingDetail;
import com.example.demo.repositories.BookingDetailRepository;

@Service
public class BookingDetailManagerImpl implements BookingDetailManager {
	
	@Autowired
	private BookingDetailRepository bookingDetailRepository;
	
	@Override
	public List<BookingDetail> getAllBookingDetails(){
		return bookingDetailRepository.findAll();
	}
	
	@Override
	public BookingDetail saveBookingDetail(BookingDetail bookingDetail) {
		return bookingDetailRepository.save(bookingDetail);
	}
	
	
	@Override
	public BookingDetail getBookingDetailById(Long id) {
		Optional<BookingDetail> bookingDetail = bookingDetailRepository.findById(id);
		return bookingDetail.orElse(null);
	}
	
	@Override
	public void deleteBookingDetail(Long id) {
		bookingDetailRepository.deleteById(id);
	}
	
	

}