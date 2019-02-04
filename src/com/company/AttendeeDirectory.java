package com.company;

import java.util.ArrayList;

public class AttendeeDirectory {

    ArrayList<Attendee> directory = new ArrayList<>();

    public void addAttendee (Attendee attendee) {
        directory.add(attendee);
    }

    public void print() {
        System.out.println(directory);
    }

    public void getAttendeeInfoByID(int attendeeID){

        for(int i = 0; i < directory.size(); i++){
            if(directory.get(i).getIdNumber() == attendeeID){
                System.out.println("Name: " + directory.get(i).getName() +
                                    "Address: " + directory.get(i).getAddress() +
                                    "Arrival Date: " + directory.get(i).getArrivalDate() +
                                    "Special Requests: " + directory.get(i).getSpecialRequest() +
                                    "ID Number: " + directory.get(i).getIdNumber() +
                                    "VIP Status: " + directory.get(i).isVIP() +
                                    "Home State: " + directory.get(i).getState());
            }
        }

    }
}
