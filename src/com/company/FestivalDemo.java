package com.company;

import java.util.Scanner;

public class FestivalDemo {

    public static void main(String[] args) {
	// write your code here

        UserMenu menu = new UserMenu();
        AttendeeDirectory attendeeDirectory = new AttendeeDirectory();
        AttendeeBuilder attendeeBuilder = new AttendeeBuilder();
        AdminMenuHelper adminMenuHelper = new AdminMenuHelper();

        Scanner scan = new Scanner(System.in);
        String userInput;

        final String register = "1";
        final String lookUpAccount = "2";
        final String exit = "3";
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
                  break;
              case lookUpAccount:
                  System.out.println("Please enter your Attendee ID");
                  int inputID = scan.nextInt();
                  attendeeDirectory.getAttendeeInfoByID(inputID);
                  break;
              case isAnAdmin:

                  boolean continueAdminMenu;
                  do{
                      continueAdminMenu = true;

                       menu.showAdmin();
                       userInput = scan.nextLine();

                      if(userInput.equals("6")){
                          continueAdminMenu = false;
                      } else {
                          adminMenuHelper.handleMenuRequest(userInput, attendeeDirectory, scan);
                      }

                   }while(continueAdminMenu);
                  break;
              case exit:
                  shouldContinue = false;
                  System.out.println("Goodbye");
                  break;
              default:
                  break;
          }
      }while(shouldContinue);
    }
}
