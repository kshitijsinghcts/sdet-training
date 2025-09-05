package com.example.springrestapp.flights;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/flights")
public class FlightController {
    FlightRepository flightRepository;

    public FlightController(FlightRepository flightRepository) {
        this.flightRepository = flightRepository;
    }

    // Define REST endpoints here
    // Get all flights
    @GetMapping("/")
    public List<Flight> getAllFlights() {
        return flightRepository.getAllFlights();
    }

    // Get flight by flight number
    @GetMapping("/{flightNumber}")
    public Flight getFlightByNumber(@PathVariable String flightNumber) {
        return flightRepository.getFlightByNumber(flightNumber);
    }

    // Add a new flight
    @PostMapping("/add")
    public void addFlight(@RequestBody Flight flight) {
        flightRepository.addFlight(flight);
    }
}
