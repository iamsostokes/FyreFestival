package com.company;

public class UserMenu {

    public void showMainMenu () {
        System.out.println("Would you like to (or 1234 for secret Admin menu) \n" +
                "1. Register for the Fyre Festival \n" +
                "2. Look up a account");
    }

    public void showAdmin () {
        System.out.println("Welcom Admin");
        System.out.println("What would you like to do?\n" +
                "1. Vew all Attendees \n" +
                "2. Look up Attendee \n" +
                "3. Cancel registration\n" +
                "4. Assign VIP status\n" +
                "5. View by State \n" +
                "6. View by arrival date");
    }

}


