package com.polovnev.service;

import com.polovnev.model.CalendarRecord;

import java.util.List;

public interface CalendarRecordService {

    List<CalendarRecord> getCalendarRecordsDaoByRealtyId(int realtyId);

    void saveCalendarRecord(CalendarRecord calendarRecord);
}
