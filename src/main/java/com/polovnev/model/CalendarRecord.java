package com.polovnev.model;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name="calendar_record")
public class CalendarRecord {

    private int id;
    private String clientName;
    private String clientSurname;
    private String clientPatronimyc;
    private String phone;
    private Date date;
    private Time time;
    private Realty realty;

    @Id
    @GeneratedValue(strategy=IDENTITY)
    @Column(name="calendar_record_id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name="client_name")
    public String getClientName() {
        return clientName;
    }


    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    @Column(name="client_surname")
    public String getClientSurname() {
        return clientSurname;
    }

    public void setClientSurname(String clientSurname) {
        this.clientSurname = clientSurname;
    }

    @Column(name="client_patronimyc")
    public String getClientPatronimyc() {
        return clientPatronimyc;
    }

    public void setClientPatronimyc(String clientPatronimyc) {
        this.clientPatronimyc = clientPatronimyc;
    }

    @Column(name = "client_phone")
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Column(name="date")
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Column(name="time")
    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    @ManyToOne
    @JoinColumn(name="realty")
    public Realty getRealty() {
        return realty;
    }

    public void setRealty(Realty realty) {
        this.realty = realty;
    }
}
