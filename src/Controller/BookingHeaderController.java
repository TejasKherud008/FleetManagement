package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import com.example.demo.Services.BookingHeaderManager;
import com.example.demo.entities.BookingHeader;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/bookings")
public class BookingHeaderController {

    @Autowired
    private BookingHeaderManager bookingHeaderService;

    @GetMapping
    public List<BookingHeader> getAllBookings() {
        return bookingHeaderService.getAllBookings();
    }

    @GetMapping("/{id}")
    public ResponseEntity<BookingHeader> getBookingById(@PathVariable Long id) {
        Optional<BookingHeader> bookingHeader = bookingHeaderService.getBookingById(id);
        return bookingHeader.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public BookingHeader createBooking(@RequestBody BookingHeader bookingHeader) {
        return bookingHeaderService.createBooking(bookingHeader);
    }

    @PutMapping("/{id}")
    public ResponseEntity<BookingHeader> updateBooking(@PathVariable Long id, @RequestBody BookingHeader bookingDetails) {
        Optional<BookingHeader> updatedBooking = bookingHeaderService.updateBooking(id, bookingDetails);
        return updatedBooking.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBooking(@PathVariable Long id) {
        if (bookingHeaderService.deleteBooking(id)) {
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}