package com.uprad.ims.frsProject;

public class Main {
    public static void main(String[] args) {
        Ticket regularTicket = new RegularTicket("1308", "Bhopal",
                "Delhi", "DepartureDateTime", "ArrivalDateTime",
                "13F", 7000, false, null, null, "lunch");

        Ticket touristTicket = new TouristTicket("01993", "India", "France",
                "DepartureDateTime", "ArrivalDateTIme",
                "14F", 30000, false, null, null,
                "Dubai Hotel", new String[]{""});

        printTicketDetails(regularTicket);
        printTicketDetails(touristTicket);
    }

    public static void printTicketDetails(Ticket ticket) {
        System.out.println(ticket.getPnr());
    }
}
