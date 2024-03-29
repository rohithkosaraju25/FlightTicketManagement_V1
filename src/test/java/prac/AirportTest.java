package prac;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AirportTest {

	@Test
	public void testAirport(){
		Flight economyFlight = new Flight("1","Economy");
		Flight businessFlight = new Flight("1","Business");
		
		Passenger john = new Passenger("John",true);
		Passenger mike = new Passenger("Mike",false);
		
		assertEquals(true, economyFlight.addPassenger(john));
		assertEquals(false, economyFlight.removePassenger(john));
		assertEquals(true, businessFlight.addPassenger(john));
		assertEquals(false, businessFlight.removePassenger(john));
		
		assertEquals(true, economyFlight.addPassenger(mike));
		assertEquals(true, economyFlight.removePassenger(mike));
		assertEquals(false, businessFlight.addPassenger(mike));
		assertEquals(false, businessFlight.removePassenger(mike));
	}

}
