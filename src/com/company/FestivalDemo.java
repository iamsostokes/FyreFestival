package com.company;

import java.util.Scanner;

public class FestivalDemo {

    public static void main(String[] args) {
	// write your code here

        UserMenu menu = new UserMenu();
        AttendeeDirectory attendeeDirectory = new AttendeeDirectory();
        AttendeeBuilder attendeeBuilder = new AttendeeBuilder();
        Scanner scan = new Scanner(System.in);
        String userInput;

        final String register = "1";
        final String lookUpAccount = "2";
        final String isAnAdmin = "1234";
        boolean shouldContinue = true;

        int attendeeID = 1000;

      do {
          menu.showMainMenu();
          userInput = scan.nextLine();

          switch (userInput) {
              case register:
                  attendeeBuilder.registerAttendee(attendeeID, attendeeDirectory);
                  attendeeID++;
                  attendeeDirectory.print();
                  break;
              case lookUpAccount:
                  System.out.println("Please enter your Attendee ID");
                  int inputID = scan.nextInt();
                  attendeeDirectory.getAttendeeInfoByID(inputID);
                  break;
              case isAnAdmin:
                  break;
              default:
                  break;
          }
      }while(shouldContinue);
    }
}
