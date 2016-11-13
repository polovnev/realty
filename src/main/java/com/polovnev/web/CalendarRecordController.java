package com.polovnev.web;

import com.polovnev.dao.CalendarRecordDao;
import com.polovnev.dao.RealtyDao;
import com.polovnev.model.CalendarRecord;
import com.polovnev.model.Realty;
import com.polovnev.service.CalendarRecordService;
import com.polovnev.service.RealtyService;
import com.polovnev.util.DateTimeConvertor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.sql.Date;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

@Controller
@RequestMapping("/calendarRecord")
public class CalendarRecordController {

    @Autowired
    private CalendarRecordService calendarRecordService;

    @Autowired
    private RealtyService realtyService;

    @Autowired
    private DateTimeConvertor dateTimeConvertor;

    @RequestMapping(value = "/show", method = RequestMethod.GET)
    public String getCalendarRecords(ModelMap model, @RequestParam("id") int id) {
        List<CalendarRecord> calendarRecords = calendarRecordService.getCalendarRecordsDaoByRealtyId(id);
        model.addAttribute("calendarRecords", calendarRecords);
        return "calendarRecords";
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String addCalendarRecord(ModelMap model) {
        List<Realty> realties = realtyService.getAllRealties();
        model.addAttribute("realties",realties);
        return "addCalendarRecord";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addCalendarRecord(@RequestParam("realty") int realtyId,
                                    @RequestParam("client_name") String client_name,
                                    @RequestParam("client_patronimyc") String client_patronimyc,
                                    @RequestParam("client_surname") String client_surname,
                                    @RequestParam("phone") String phone, @RequestParam("date") String dateStr,
                                    @RequestParam("time") String timeStr) throws ParseException {
        Time time = dateTimeConvertor.getTimeFromString(timeStr);
        Date date = dateTimeConvertor.getDateFromString(dateStr);
        Realty realty = realtyService.getRealtyById(realtyId);
        CalendarRecord calendarRecord = new CalendarRecord();
        calendarRecord.setClientName(client_name);
        calendarRecord.setClientPatronimyc(client_patronimyc);
        calendarRecord.setClientSurname(client_surname);
        calendarRecord.setPhone(phone);
        calendarRecord.setDate(date);
        calendarRecord.setTime(time);
        calendarRecord.setRealty(realty);

        calendarRecordService.saveCalendarRecord(calendarRecord);

        return "index";
    }
}