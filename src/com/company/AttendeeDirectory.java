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

}
