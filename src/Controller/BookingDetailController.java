package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Services.BookingDetailManager;
import com.example.demo.entities.BookingDetail;



@RestController
@RequestMapping("/api/bookings")
public class BookingDetailController {
	
	@Autowired
	private BookingDetailManager bookingDetailService;
	

    // Get all booking details
    @GetMapping("/details")
    public ResponseEntity<List<BookingDetail>> getAllBookingDetails() {
        List<BookingDetail> bookingDetails = bookingDetailService.getAllBookingDetails();
        return new ResponseEntity<>(bookingDetails, HttpStatus.OK);
    }

    // Get booking detail by ID
    @GetMapping("/details/{id}")
    public ResponseEntity<BookingDetail> getBookingDetailById(@PathVariable("id") Long id) {
        BookingDetail bookingDetail = bookingDetailService.getBookingDetailById(id);
        if (bookingDetail != null) {
            return new ResponseEntity<>(bookingDetail, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // Create a new booking detail
    @PostMapping("/details")
    public ResponseEntity<BookingDetail> createBookingDetail(@RequestBody BookingDetail bookingDetail) {
        BookingDetail savedBookingDetail = bookingDetailService.saveBookingDetail(bookingDetail);
        return new ResponseEntity<>(savedBookingDetail, HttpStatus.CREATED);
    }

    // Update an existing booking detail
    @PutMapping("/details/{id}")
    public ResponseEntity<BookingDetail> updateBookingDetail(@PathVariable("id") Long id, @RequestBody BookingDetail bookingDetail) {
        BookingDetail existingBookingDetail = bookingDetailService.getBookingDetailById(id);
        if (existingBookingDetail != null) {
            bookingDetail.setId(id);
            BookingDetail updatedBookingDetail = bookingDetailService.saveBookingDetail(bookingDetail);
            return new ResponseEntity<>(updatedBookingDetail, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // Delete a booking detail
    @DeleteMapping("/details/{id}")
    public ResponseEntity<Void> deleteBookingDetail(@PathVariable("id") Long id) {
        BookingDetail existingBookingDetail = bookingDetailService.getBookingDetailById(id);
        if (existingBookingDetail != null) {
            bookingDetailService.deleteBookingDetail(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
	
	

}