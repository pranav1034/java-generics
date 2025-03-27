package com.bridgelabz.flightscheduling;
import java.util.ArrayList;

class FlightManager<T> {
    private ArrayList<Flight<T>> flights = new ArrayList<>();

    public void addFlight(Flight<T> flight) {
        flights.add(flight);
    }

    public void displayAllFlights() {
        for (Flight<T> flight : flights) {
            flight.displayFlightInfo();
        }
    }
}

