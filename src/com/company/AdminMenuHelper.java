package com.company;

import java.util.Scanner;

public class AdminMenuHelper {

public void handleMenuRequest(String userInput, AttendeeDirectory attendeeDirectory, Scanner scan){
    if (userInput.equals("1")) {

    } else if (userInput.equals("2")) {
        System.out.println("What is the id that you would like to look up?");
        int adminInput =scan.nextInt();
        attendeeDirectory.getAttendeeInfoByID(adminInput);

    } else if (userInput.equals("3")) {

    } else if (userInput.equals("4")) {

    } else if (userInput.equals("5")) {

    } else if (userInput.equals("6")) {

    } else {
        System.out.println("Please enter a valid input.");
    }
}

}
