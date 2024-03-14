package com.driver;

public class Flight {
	 private int id;
	    private String flightNumber;
	    private String origin;
	    private String destination;
	    private double price;
	    private int capacity;
	    private int availableSeats;

	    public Flight() {
	        // your code goes here
	    }

	    public Flight(int id, String flightNumber, String origin, String destination, double price, int capacity, int availableSeats) {
	    	// your code goes here
			this.id = id;
			this.flightNumber = flightNumber;
			this.origin = origin;
			this.destination = destination;
			this.price = price;
			this.capacity = capacity;
			this.availableSeats = availableSeats;
	    }

	    // Getters and Setters

	    public int getId() {
	    	// your code goes here
	        return id;
	    }

	    public void setId(int id) {
	    	// your code goes here
	        this.id = id;
	    }

	    public String getFlightNumber() {
	    	// your code goes here
	        return flightNumber;
	    }

	    public void setFlightNumber(String flightNumber) {
	    	// your code goes here
			this.flightNumber = flightNumber;
	    }

	    public String getOrigin() {
	    	// your code goes here
	        return origin;
	    }

	    public void setOrigin(String origin) {
	    	// your code goes here
			this.origin = origin;
	    }

	    public String getDestination() {
	    	// your code goes here
	        return destination;
	    }

	    public void setDestination(String destination) {
	    	// your code goes here
			this.destination = destination;
	    }

	    public double getPrice() {
	    	// your code goes here
	        return price;
	    }

	    public void setPrice(double price) {
	    	// your code goes here
			this.price=price;
	    }

	    public int getCapacity() {
	    	// your code goes here
	        return capacity;
	    }

	    public void setCapacity(int capacity) {
	    	// your code goes here
			this.capacity=capacity;
	    }

	    public int getAvailableSeats() {
	    	// your code goes here
	        return availableSeats;
	    }

	    public void setAvailableSeats(int availableSeats) {
	    	// your code goes here
			this.availableSeats=availableSeats;
	    }

}
