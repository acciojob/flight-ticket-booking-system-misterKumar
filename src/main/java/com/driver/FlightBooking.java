package com.driver;

public class FlightBooking {
	private int id;
    private Flight flight;
    private String passengerName;
    private int numTickets;

    public FlightBooking() {
    	// your code goes here
    }

    public FlightBooking(int id, Flight flight, String passengerName, int numTickets) {
    	// your code goes here
        this.id = id;
        this.flight = flight;
        this.passengerName = passengerName;
        this.numTickets = numTickets;
    }

    // Getters and Setters

    public int getId() {
    	// your code goes here
        return id;
    }

    public void setId(int id) {
    	// your code goes here
        this.id=id;
    }

    public Flight getFlight() {
    	// your code goes here
        return flight;
    }

    public void setFlight(Flight flight) {
    	// your code goes here
        this.flight=flight;
    }

    public String getPassengerName() {
    	// your code goes here
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
    	// your code goes here
        this.passengerName=passengerName;
    }

    public int getNumTickets() {
    	// your code goes here
        return numTickets;
    }

    public void setNumTickets(int numTickets) {
    	// your code goes here
        this.numTickets=numTickets;
    }

}
