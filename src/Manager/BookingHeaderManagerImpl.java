package com.example.demo.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.entities.BookingHeader;
import com.example.demo.repositories.BookingHeaderRepository;

import java.util.List;
import java.util.Optional;

@Service
public class BookingHeaderManagerImpl implements BookingHeaderManager {

    @Autowired
    private BookingHeaderRepository bookingHeaderRepository;

    @Override
    public List<BookingHeader> getAllBookings() {
        return bookingHeaderRepository.findAll();
    }

    @Override
    public Optional<BookingHeader> getBookingById(Long id) {
        return bookingHeaderRepository.findById(id);
    }

    @Override
    public BookingHeader createBooking(BookingHeader bookingHeader) {
        return bookingHeaderRepository.save(bookingHeader);
    }

    @Override
    public Optional<BookingHeader> updateBooking(Long id, BookingHeader bookingDetails) {
        return bookingHeaderRepository.findById(id).map(booking -> {
            booking.setDate(bookingDetails.getDate());
//            booking.setCustId(bookingDetails.getCustId());
            booking.setStartDate(bookingDetails.getStartDate());
            booking.setEndDate(bookingDetails.getEndDate());
//            booking.setCarTypeId(bookingDetails.getCarTypeId());
//            booking.setCustomerName(bookingDetails.getCustomerName());
//            booking.setCustomerAddress(bookingDetails.getCustomerAddress());
//            booking.setCustomerState(bookingDetails.getCustomerState());
//            booking.setCustomerPin(bookingDetails.getCustomerPin());
            booking.setRateDaily(bookingDetails.getRateDaily());
            booking.setRateWeekly(bookingDetails.getRateWeekly());
            booking.setRateMonthly(bookingDetails.getRateMonthly());
            return bookingHeaderRepository.save(booking);
        });
    }

    @Override
    public boolean deleteBooking(Long id) {
        if (bookingHeaderRepository.existsById(id)) {
            bookingHeaderRepository.deleteById(id);
            return true;
        } else {
            return false;
        }
    }
}