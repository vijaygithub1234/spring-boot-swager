package com.example.firstswagerdemo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.firstswagerdemo.request.Passenger;
import com.example.firstswagerdemo.response.Ticket;

@RestController
public class JetAirwaysController {

	@PostMapping(value={"/ticketBooking"},consumes = {"application/xml"},produces = {"application/json"})
	public ResponseEntity<Ticket> bookTicket(@RequestBody Passenger passenger)
	{
//		model.addAttribute("desc","welcome to jetairways");
		
		Ticket ticket=new Ticket();
		       
		   ticket.setFrom(passenger.getFrom());
		   ticket.setTo(passenger.getTo());
		
		
		return new ResponseEntity<>(ticket,HttpStatus.CREATED);
	}
}
