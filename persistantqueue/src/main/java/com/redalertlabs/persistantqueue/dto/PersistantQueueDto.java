package com.redalertlabs.persistantqueue.dto;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

public class PersistantQueueDto {
    private String eventName;
    private Date startTime;

    private int processCompletionTime;

    private String status;

    private int eventPriority;

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

    public PersistantQueueDto() {

    }

    public PersistantQueueDto(String eventName, Date startTime, int processCompletionTime, String status, int eventPriority, Date endTime) {
        this.eventName = eventName;

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
                ", startTime=" + startTime +
                ", processCompletionTime=" + processCompletionTime +
                ", status='" + status + '\'' +
                ", eventPriority=" + eventPriority +
                ", endTime=" + endTime +
                '}';
    }
}
