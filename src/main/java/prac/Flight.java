package prac;

import java.util.ArrayList;
import java.util.List;

public class Flight {
	private String id;
	private String flightType;
	private List<Passenger> passengerList = new ArrayList<Passenger>();

	public Flight(String id, String flightType) {
		this.id = id;
		this.flightType = flightType;
	}

	public String getId() {
		return id;
	}

	public String getFlightType() {
		return flightType;
	}

	public List<Passenger> getPassengerList() {
		return passengerList;
	}

	public boolean addPassenger(Passenger passenger) {
		switch (flightType) {
		case "Economy":
			return passengerList.add(passenger);
		case "Business":
			if (passenger.isVip()) {
				return passengerList.add(passenger);
			}
			return false;
		default:
			throw new RuntimeException("unknown type : flight type");
		}
	}

	public boolean removePassenger(Passenger passenger) {
		switch (flightType) {
		case "Economy":
			if (!passenger.isVip()) {
				return passengerList.remove(passenger);
			}
			return false;
		case "Business":
			return false;
		default:
			throw new RuntimeException("unknown type : flight type");
		}
	}

}
