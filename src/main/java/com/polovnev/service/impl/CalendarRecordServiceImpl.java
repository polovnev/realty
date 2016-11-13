package com.polovnev.service.impl;

import com.polovnev.dao.CalendarRecordDao;
import com.polovnev.model.CalendarRecord;
import com.polovnev.service.CalendarRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CalendarRecordServiceImpl implements CalendarRecordService {

    @Autowired
    private CalendarRecordDao calendarRecordDao;

    @Override
    public List<CalendarRecord> getCalendarRecordsDaoByRealtyId(int realtyId) {
        return calendarRecordDao.getCalendarRecordsDaoByRealtyId(realtyId);
    }

    @Override
    public void saveCalendarRecord(CalendarRecord calendarRecord) {
        calendarRecordDao.saveCalendarRecord(calendarRecord);
    }
}
