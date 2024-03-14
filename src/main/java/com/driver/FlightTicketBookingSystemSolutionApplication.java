package com.driver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

@SpringBootApplication
@ComponentScan(excludeFilters = {
		@ComponentScan.Filter(type = FilterType.REGEX, pattern = "com\\.driver\\.FlightBookingController")
})
public class FlightTicketBookingSystemSolutionApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlightTicketBookingSystemSolutionApplication.class, args);
	}
	 @Bean
	    public FlightRepository flightRepository() {
	        return new InMemoryFlightRepository();
	    }

	    @Bean
	    public FlightBookingService flightBookingService(FlightRepository flightRepository) {
	        return new FlightBookingServiceImpl(flightRepository);
	    }

	    @Bean
	    public FlightBookingController flightBookingController(FlightBookingService flightBookingService) {
	        return new FlightBookingController(flightBookingService);
	    }

}
