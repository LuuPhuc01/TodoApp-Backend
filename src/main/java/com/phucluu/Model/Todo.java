package com.phucluu.Model;

import jakarta.persistence.*;

import java.util.Date;


@Entity
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String works;
    private  boolean isCompleted;
    private String priority;
    @Temporal(TemporalType.TIMESTAMP)
    private Date initDay;

    public Todo(Integer id,
                String works,
                boolean isCompleted,
                String priority,
                Date initDay) {
        this.id = id;
        this.works = works;
        this.isCompleted = isCompleted;
        this.priority = priority;
        this.initDay = initDay;
    }

    @Override
    public String toString() {
        return "Todo{" +
                "id=" + id +
                ", works='" + works + '\'' +
                ", isCompleted=" + isCompleted +
                ", priority='" + priority + '\'' +
                ", initDay=" + initDay +
                '}';
    }
    public Date getInitDay() {
        return initDay;
    }

    public Integer getId() {
        return id;
    }

    public void setInitDay(Date initDay) {
        this.initDay = initDay;
    }

    public Todo() {
    }

    public String getWorks() {
        return works;
    }

    public void setWorks(String works) {
        this.works = works;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }
}
