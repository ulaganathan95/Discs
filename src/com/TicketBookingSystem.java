package com;

import java.util.ArrayList;

public class TicketBookingSystem {

	protected ArrayList<ScreenBookingDetails> screenList;

	public void addScreens(ScreenBookingDetails screenBookingDetails) {
		screenList.add(screenBookingDetails);
	}

	public void bookSingleTicket(String screenName, int seatNo, Booking booking) {
		for (ScreenBookingDetails s : screenList) {
			if (s.getScreenName() == screenName) {
				
			}
		}

	}

}
