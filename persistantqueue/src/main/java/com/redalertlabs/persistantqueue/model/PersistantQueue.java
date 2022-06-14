package com.redalertlabs.persistantqueue.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.xml.crypto.Data;
import java.util.Date;

@Entity
@Table
public class PersistantQueue {
    @Id
    @GeneratedValue(generator="system-uuid")
    @GenericGenerator(name="system-uuid", strategy = "uuid")
  //  @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private String iD;
    @Column
    private String eventName;

    @Column
    private Date startTime;
    @Column
    private int processCompletionTime;
    @Column
    private String status;
    @Column
    private int eventPriority;
    @Column
    private Date endTime;

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getiD() {
        return iD;
    }

    public void setiD(String iD) {
        this.iD = iD;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public int getProcessCompletionTime() {
        return processCompletionTime;
    }

    public void setProcessCompletionTime(int processCompletionTime) {
        this.processCompletionTime = processCompletionTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getEventPriority() {
        return eventPriority;
    }

    public void setEventPriority(int eventPriority) {
        this.eventPriority = eventPriority;
    }

    public PersistantQueue() {

    }

    public PersistantQueue(String eventName, String iD, Date startTime, int processCompletionTime, String status, int eventPriority, Date endTime) {
        this.eventName = eventName;
        this.iD = iD;
        this.startTime = startTime;
        this.processCompletionTime = processCompletionTime;
        this.status = status;
        this.eventPriority = eventPriority;
        this.endTime = endTime;
    }

    @Override
    public String toString() {
        return "PersistantQueue{" +
                "eventName='" + eventName + '\'' +
                ", iD='" + iD + '\'' +
                ", startTime=" + startTime +
                ", processCompletionTime=" + processCompletionTime +
                ", status='" + status + '\'' +
                ", eventPriority=" + eventPriority +
                ", endTime=" + endTime +
                '}';
    }
}
