package com.example.demo.Services;

import java.util.List;

import com.example.demo.entities.BookingDetail;

public interface BookingDetailManager {
	List<BookingDetail> getAllBookingDetails();
	BookingDetail saveBookingDetail(BookingDetail bookingDetail);
	BookingDetail getBookingDetailById(Long id);
	void deleteBookingDetail(Long id);

}