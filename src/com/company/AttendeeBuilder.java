package com.company;

import java.util.Scanner;

public class AttendeeBuilder  {

    public void registerAttendee(int attendeeID, AttendeeDirectory attendeeDirectory) {
        Attendee attendee = new Attendee();
        Scanner scan = new Scanner(System.in);


        System.out.println("What is the name for registration?");
        String name = scan.nextLine();
        attendee.setName(name);

        System.out.println("What is the address for this registration?");
        String address = scan.nextLine();
        attendee.setAddress(address);

        System.out.println("What is the arrive date?");
        String date = scan.nextLine();
        attendee.setArrivalDate(date);

        System.out.println("Any special request?");
        String request = scan.nextLine();
        attendee.setSpecialRequest(request);

        //set ID
        attendee.setIdNumber(attendeeID);

        System.out.println("What state are you from?");
        String state = scan.nextLine();
        attendee.setState(state);

        attendeeDirectory.addAttendee(attendee);

        System.out.println("You are now registered with ID: " + attendeeID);

    }

}
