package com.example.javier.phonecalllogger;

import java.util.Date;

public class PhoneCall {

    private String type, number;
    private Date start, end;

    public PhoneCall(String type, String number, Date start, Date end) {
        this.type = type;
        this.number = number;
        this.start = start;
        this.end = end;
    }
}
