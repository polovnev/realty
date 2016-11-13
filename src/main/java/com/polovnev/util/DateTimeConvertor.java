package com.polovnev.util;


import org.springframework.stereotype.Component;

import java.sql.Date;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;

@Component
public class DateTimeConvertor {

    public Date getDateFromString(String dateStr) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
        return new Date(format.parse(dateStr).getTime());
    }

    public Time getTimeFromString(String timeStr) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("h:mm");
        long ms = sdf.parse(timeStr).getTime();
        return new Time(ms);
    }

}
