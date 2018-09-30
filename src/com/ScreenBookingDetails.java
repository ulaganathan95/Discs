package com;

import java.sql.Time;
import java.util.ArrayList;

public class ScreenBookingDetails {

	
	protected ArrayList<Seat> seatDetails;
	protected ArrayList<Booking> bookingDetails;
	protected String screenName;
	protected int seatCapacity;
	protected String movieName;
	protected Time showTime;
	public ScreenBookingDetails(ArrayList<Seat> seatDetails, ArrayList<Booking> bookingDetails, String screenName,
			int seatCapacity, String movieName, Time showTime) {
		super();
		this.seatDetails = seatDetails;
		this.bookingDetails = bookingDetails;
		this.screenName = screenName;
		this.seatCapacity = seatCapacity;
		this.movieName = movieName;
		this.showTime = showTime;
	}
	public ScreenBookingDetails() {
		super();
	}
	public ArrayList<Seat> getSeatDetails() {
		return seatDetails;
	}
	public void setSeatDetails(ArrayList<Seat> seatDetails) {
		this.seatDetails = seatDetails;
	}
	public ArrayList<Booking> getBookingDetails() {
		return bookingDetails;
	}
	public void setBookingDetails(ArrayList<Booking> bookingDetails) {
		this.bookingDetails = bookingDetails;
	}
	public String getScreenName() {
		return screenName;
	}
	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}
	public int getSeatCapacity() {
		return seatCapacity;
	}
	public void setSeatCapacity(int seatCapacity) {
		this.seatCapacity = seatCapacity;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public Time getShowTime() {
		return showTime;
	}
	public void setShowTime(Time showTime) {
		this.showTime = showTime;
	}
	public void addBooking(Booking booking)
	{
		bookingDetails.add(booking);
	}
	 public void addSeats(Seat seat)
	 {
		 seatDetails.add(seat);
	 }
	
}
