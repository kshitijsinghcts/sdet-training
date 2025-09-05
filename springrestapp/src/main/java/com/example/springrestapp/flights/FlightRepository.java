package com.example.springrestapp.flights;

import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository
public class FlightRepository {
    List<Flight> flights = new ArrayList<>();

    // Sample data initialization
    public FlightRepository() {
        flights.add(new Flight("AA101", AirLines.AMERICAN_AIRLINES.name(), "New York", "Los Angeles", 300.00));
        flights.add(new Flight("DL202", AirLines.DELTA_AIR_LINES.name(), "Atlanta", "San Francisco", 350.00));
        flights.add(new Flight("UA303", AirLines.UNITED_AIRLINES.name(), "Chicago", "Miami", 250.00));
        flights.add(new Flight("SW404", AirLines.SOUTHWEST_AIRLINES.name(), "Dallas", "Orlando", 200.00));
        flights.add(new Flight("AS505", AirLines.ALASKA_AIRLINES.name(), "Seattle", "Denver", 280.00));
    }

    // CRUD operations
    // Get all flights
    public List<Flight> getAllFlights() {
        return flights;
    }

    // Get flight by flight number
    public Flight getFlightByNumber(String flightNumber) {
        return flights.stream()
                .filter(flight -> flight.getFlightNumber().equals(flightNumber))
                .findFirst()
                .orElse(null);
    }

    // Add a new flight
    public void addFlight(Flight flight) {
        flights.add(flight);
    }

    // Update an existing flight
    public void updateFlight(String flightNumber, Flight updatedFlight) {
        for (int i = 0; i < flights.size(); i++) {
            if (flights.get(i).getFlightNumber().equals(flightNumber)) {
                flights.set(i, updatedFlight);
                return;
            }
        }
    }

    // Delete a flight
    public void deleteFlight(String flightNumber) {
        flights.removeIf(flight -> flight.getFlightNumber().equals(flightNumber));
    }
}
