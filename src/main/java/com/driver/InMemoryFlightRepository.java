package com.driver;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InMemoryFlightRepository implements FlightRepository {

	 private final Map<Integer, Flight> flights;
	    private final Map<Integer, FlightBooking> bookings;
	    private int bookingId;

	    public InMemoryFlightRepository() {
	    	// your code goes here
			flights=new HashMap<>();
			bookings=new HashMap<>();
	    }

	    @Override
	    public List<Flight> searchFlights(String origin, String destination) {
	        List<Flight> result = new ArrayList<>();
	        // your code goes here
			for (Flight flight : flights.values()) {
				if (flight.getOrigin().equalsIgnoreCase(origin) && flight.getDestination().equalsIgnoreCase(destination)) {
					result.add(flight);
				}
			}
	        return result;
	    }

	    @Override
	    public Flight getFlightById(int id) {
	    	// your code goes here
	        return flights.get(id);
	    }

	    @Override
	    public void bookFlight(FlightBooking booking) {
	    	// your code goes here
			Flight flight = booking.getFlight();
			int numTickets = booking.getNumTickets();
			int availableSeats = flight.getAvailableSeats();
			if (numTickets <= availableSeats) {
				// Update available seats
				flight.setAvailableSeats(availableSeats - numTickets);
				// Generate booking ID and add booking to repository
				booking.setId(++bookingId);
				bookings.put(bookingId, booking);
			} else {
				throw new IllegalArgumentException("Not enough available seats for booking");
			}
	    }
}
