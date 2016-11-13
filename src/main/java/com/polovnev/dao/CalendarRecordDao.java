package com.polovnev.dao;


import com.polovnev.model.CalendarRecord;

import java.util.List;

public interface CalendarRecordDao {

    List<CalendarRecord> getCalendarRecordsDaoByRealtyId(int realtyId);

    void saveCalendarRecord(CalendarRecord calendarRecord);
}
