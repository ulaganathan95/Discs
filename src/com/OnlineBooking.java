package com;

public class OnlineBooking extends Booking {
	protected double additionalCharge;

	public double getAdditionalCharge() {
		return additionalCharge;
	}

	public void setAddtionalCharge(double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}

	public OnlineBooking(int noOfTickets, double movieRate, int maxTicketsAllowed, double totalCharge,double additionalCharge) {
		super(noOfTickets, movieRate, maxTicketsAllowed, totalCharge);
		this.additionalCharge=additionalCharge;
	}

	@Override
	public void calculateTicket() {
		double TotalCharge=(noOfTickets*movieRate)+additionalCharge;
	}

	
}
