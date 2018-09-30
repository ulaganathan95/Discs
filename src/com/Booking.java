package com;

public abstract class Booking {
	protected int noOfTickets;

	protected double movieRate;

	protected int maxTicketsAllowed;

	protected double totalCharge;

	public Booking(int noOfTickets, double movieRate, int maxTicketsAllowed, double totalCharge) {
		super();
		this.noOfTickets = noOfTickets;
		this.movieRate = movieRate;
		this.maxTicketsAllowed = maxTicketsAllowed;
		this.totalCharge = totalCharge;
	}

	public int getNoOfTickets() {
		return noOfTickets;
	}

	public void setNoOfTickets(int noOfTickets) {
		this.noOfTickets = noOfTickets;
	}

	public double getMovieRate() {
		return movieRate;
	}

	public void setMovieRate(double movieRate) {
		this.movieRate = movieRate;
	}

	public int getMaxTicketsAllowed() {
		return maxTicketsAllowed;
	}

	public void setMaxTicketsAllowed(int maxTicketsAllowed) {
		this.maxTicketsAllowed = maxTicketsAllowed;
	}

	public double getTotalCharge() {
		return totalCharge;
	}

	public void setTotalCharge(double totalCharge) {
		this.totalCharge = totalCharge;
	}

	public abstract void calculateTicket();

}
