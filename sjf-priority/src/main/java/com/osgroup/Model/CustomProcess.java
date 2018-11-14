package com.osgroup.Model;

import java.util.Comparator;

public class CustomProcess {
    private String jobName;
    private int arrivalTime;
    private int burstTime;
    private int priorityNumber;

    public CustomProcess(String jobName, int arrivalTime, int burstTime, int priorityNumber) {
        this.jobName = jobName;
        this.arrivalTime = arrivalTime;
        this.burstTime = burstTime;
        this.priorityNumber = priorityNumber;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public int getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(int arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public int getBurstTime() {
        return burstTime;
    }

    public void setBurstTime(int burstTime) {
        this.burstTime = burstTime;
    }

    public int getPriorityNumber() {
        return priorityNumber;
    }

    public void setPriorityNumber(int priorityNumber) {
        this.priorityNumber = priorityNumber;
    }

    @Override
    public String toString() {
        return "CustomProcess{" +
                "jobName='" + jobName + '\'' +
                ", arrivalTime=" + arrivalTime +
                ", burstTime=" + burstTime +
                ", priorityNumber=" + priorityNumber +
                '}';
    }

}
