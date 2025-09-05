package com.example.springrestapp.flights;

public class Flight {
    private String flightNumber;
    private String airline;
    private String departure;
    private String arrival;
    private double price;

    public Flight(String flightNumber, String airline, String departure, String arrival, double price) {
        this.flightNumber = flightNumber;
        this.airline = airline;
        this.departure = departure;
        this.arrival = arrival;
        this.price = price;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getArrival() {
        return arrival;
    }

    public void setArrival(String arrival) {
        this.arrival = arrival;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Flight [flightNumber=" + flightNumber + ", airline=" + airline + ", departure=" + departure
                + ", arrival=" + arrival + ", price=" + price + "]";
    }

}