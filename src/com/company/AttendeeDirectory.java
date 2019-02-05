package com.company;

import java.util.ArrayList;

public class AttendeeDirectory {

    ArrayList<Attendee> directory = new ArrayList<>();


    public AttendeeDirectory(){
        Attendee attendee1 = new Attendee();
        attendee1.setName("Ja Rule");
        attendee1.setIdNumber(5555);
        attendee1.setState("NY");
        attendee1.setVIP(false);

        Attendee attendee2 = new Attendee();
        attendee2.setName("Billy");
        attendee2.setIdNumber(5556);
        attendee2.setState("NY");
        attendee2.setVIP(true);

        directory.add(attendee1);


        directory.add(attendee2);

    }


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


    public void cancelAttendeeByID(int attendeeID) {


        for(int i = 0; i < directory.size(); i++){
            if(directory.get(i).getIdNumber() == attendeeID){
                directory.remove(i);
                System.out.println("The registration with ID " + attendeeID + " has been canceled.");

            }
        }


    }

    public void makeAttendeeVIP(int attendeeID) {
        for (int i=0; i < directory.size(); i++){
            if (directory.get(i).getIdNumber() == attendeeID){
                directory.get(i).setVIP(true);
                System.out.println("Attendee with ID of " + attendeeID + " has been given VIP status.");
            }
        }

    }

    public void getAttendeeByState(String attendeeState) {
        for (int i=0; i < directory.size(); i++){
            if (directory.get(i).getState().equals(attendeeState)){
                directory.get(i).printDetails();
            }
        }
    }



}
