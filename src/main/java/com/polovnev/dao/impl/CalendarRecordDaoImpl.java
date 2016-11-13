package com.polovnev.dao.impl;

import com.polovnev.dao.CalendarRecordDao;
import com.polovnev.model.CalendarRecord;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class CalendarRecordDaoImpl extends AbstractDaoImpl implements CalendarRecordDao {

    @Override
    public List<CalendarRecord> getCalendarRecordsDaoByRealtyId(int realtyId) {
        return getSession().createQuery("from CalendarRecord where realty = " + realtyId).list();
    }

    @Override
    public void saveCalendarRecord(CalendarRecord calendarRecord) {
        getSession().save(calendarRecord);
    }
}
