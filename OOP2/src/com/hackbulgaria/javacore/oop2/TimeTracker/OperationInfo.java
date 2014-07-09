package com.hackbulgaria.javacore.oop2.TimeTracker;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OperationInfo {

    private String operationName;
    private long startTime;
    private long endTime;
    private List<Date> updatesList = new ArrayList<>();

    public OperationInfo(String operationName) {
        this.operationName = operationName;

    }


    public String getOperationName() {
        return operationName;
    }

    public void setOperationName(String operationName) {
        this.operationName = operationName;
    }

    public List<Date> getList() {
        return updatesList;
    }

    public void setList(List<Date> list) {
        this.updatesList = list;
    }

    public long getStartCurrentTime() {
        return startTime;
    }

    public void setStartTime(long startCurrentTime) {
        this.startTime = startCurrentTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndCurrentTime(long endCurrentTime) {
        this.endTime = endCurrentTime;
    }

    public void addElementToList(Date date) {
        updatesList.add(date);
    }
}
