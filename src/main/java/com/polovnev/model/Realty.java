package com.polovnev.model;

import javax.persistence.*;

import java.util.List;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name="realty")
public class Realty {

    private int id;
    private String name;
    private User user;
    private List<CalendarRecord> calendarRecords;

    @Id
    @GeneratedValue(strategy=IDENTITY)
    @Column(name="realty_id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name="realty_name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @ManyToOne
    @JoinColumn(name="user")
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy="realty", cascade=CascadeType.ALL, orphanRemoval=true)
    public List<CalendarRecord> getCalendarRecords() {
        return calendarRecords;
    }

    public void setCalendarRecords(List<CalendarRecord> calendarRecords) {
        this.calendarRecords = calendarRecords;
    }
}
