package com.example.System_G_Portal.model.dao;


import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name ="ticket_info_card")
public class TicketInfo {
    @Id
    @GeneratedValue
    private int id;
    private String ticket_id;
    private String surgery_name;
    private String date;
    private String time;
    private String doctor_name;
    private String hospital_name;
    private String priority;
    private String status;
    private int item_count;
    private String assigned_agent;

    public TicketInfo() {

    }

    public TicketInfo(int id, String ticket_id, String surgery_name, String date, String time, String doctor_name, String hospital_name, String priority, String status, int item_count, String assigned_agent){
        this.id = id;
        this.ticket_id = ticket_id;
        this.surgery_name = surgery_name;
        this.date = date;
        this.time = time;
        this.doctor_name = doctor_name;
        this.hospital_name = hospital_name;
        this.priority = priority;
        this.status = status;
        this.item_count = item_count;
        this.assigned_agent = assigned_agent;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTicket_id() {
        return ticket_id;
    }

    public void setTicket_id(String ticket_id) {
        this.ticket_id = ticket_id;
    }

    public String getSurgery_name() {
        return surgery_name;
    }

    public void setSurgery_name(String surgery_name) {
        this.surgery_name = surgery_name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDoctor_name() {
        return doctor_name;
    }

    public void setDoctor_name(String doctor_name) {
        this.doctor_name = doctor_name;
    }

    public String getHospital_name() {
        return hospital_name;
    }

    public void setHospital_name(String hospital_name) {
        this.hospital_name = hospital_name;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getItem_count() {
        return item_count;
    }

    public void setItem_count(int item_count) {
        this.item_count = item_count;
    }

    public String getAssigned_agent() {
        return assigned_agent;
    }

    public void setAssigned_agent(String assigned_agent) {
        this.assigned_agent = assigned_agent;
    }
}
