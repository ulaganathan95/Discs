package com;

import java.util.ArrayList;

public class CounterBooking extends Booking{

	public CounterBooking(int noOfTickets, double movieRate, int maxTicketsAllowed, double totalCharge) {
		super(noOfTickets, movieRate, maxTicketsAllowed, totalCharge);
	}

	@Override
	public void calculateTicket() {
		double TotalCharge=this.noOfTickets*this.movieRate;
		
	}


	
	
	
}
