package com.company;

import java.util.Scanner;

public class AdminMenuHelper {

    int adminInput;
    String adminStringInput;
public void handleMenuRequest(String userInput, AttendeeDirectory attendeeDirectory, Scanner scan){
    if (userInput.equals("1")) {
        System.out.println("Here is a list of all of the Attendees.");
        attendeeDirectory.viewALLAttendees();

    } else if (userInput.equals("2")) {
        System.out.println("What is the id that you would like to look up?");
        adminInput =scan.nextInt();
        scan.nextLine();
        attendeeDirectory.getAttendeeInfoByID(adminInput);

    } else if (userInput.equals("3")) {

        System.out.println("Enter the Attendee ID number that you would like to cancel?");
        adminInput = scan.nextInt();
        scan.nextLine();
        attendeeDirectory.cancelAttendeeByID(adminInput);

    } else if (userInput.equals("4")) {

        System.out.println("Enter the Attendee ID number that you would like to make VIP?");
        adminInput = scan.nextInt();
        scan.nextLine();
        attendeeDirectory.makeAttendeeVIP(adminInput);

    } else if (userInput.equals("5")) {

        System.out.println("What State? Please enter the state abbreviation.");
        adminStringInput = scan.nextLine();
        attendeeDirectory.getAttendeeByState(adminStringInput);

    } else if (userInput.equals("6")) {

    } else {
        System.out.println("Please enter a valid input.");
    }
}

}
