package com.bridgelabz.flightscheduling;

public class FlightSystem {
    public static void main(String[] args) {
        Flight<Integer> flight1 = new Flight<>(101, "London", "Mumbai");
        Flight<String> flight2 = new Flight<>("A02", "New Delhi", "Beijing");

        Booking<Integer> booking1 = new Booking<>(101, flight1, "Pranav");
        Booking<String> booking2 = new Booking<>("B102", flight2, "Nikhil");

        booking1.displayBookingInfo();
        System.out.println();
        booking2.displayBookingInfo();

        System.out.println("\nFlight details: ");
        FlightManager<Integer> manager = new FlightManager<>();
        manager.addFlight(flight1);
        manager.displayAllFlights();
    }

}
