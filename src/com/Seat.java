package com;

public class Seat {

	protected String seatType;
	protected int seatNo;
	protected String seatStatus;
	public String getSeatType() {
		return seatType;
	}
	public void setSeatType(String seatType) {
		this.seatType = seatType;
	}
	public int getSeatNo() {
		return seatNo;
	}
	public void setSeatNo(int seatNo) {
		this.seatNo = seatNo;
	}
	public String getSeatStatus() {
		return seatStatus;
	}
	public void setSeatStatus(String seatStatus) {
		this.seatStatus = seatStatus;
	}
	public Seat(String seatType, int seatNo, String seatStatus) {
		super();
		this.seatType = seatType;
		this.seatNo = seatNo;
		this.seatStatus = seatStatus;
	}
	
	
	
}
