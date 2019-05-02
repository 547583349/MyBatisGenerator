package com.wangyi.entity;

import java.util.Date;

public class CarGroup {
    private String id;

    private String lineName;

    private String cleaningCrew1;

    private String cleaningCrew2;

    private String cleaningCrewName1;

    private String cleaningCrewName2;

    private String driver;

    private String carNumber;

    private String carNo;

    private String escortName1;

    private String escortName2;

    private String escortId1;

    private String escortId2;

    private Date startTime;

    private String newDriver;

    private String newPerson;

    private String classes;

    private String newDriverName;

    private String newPersonName;

    private String taskDate;

    private String isSendWeixinMsg;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getLineName() {
        return lineName;
    }

    public void setLineName(String lineName) {
        this.lineName = lineName == null ? null : lineName.trim();
    }

    public String getCleaningCrew1() {
        return cleaningCrew1;
    }

    public void setCleaningCrew1(String cleaningCrew1) {
        this.cleaningCrew1 = cleaningCrew1 == null ? null : cleaningCrew1.trim();
    }

    public String getCleaningCrew2() {
        return cleaningCrew2;
    }

    public void setCleaningCrew2(String cleaningCrew2) {
        this.cleaningCrew2 = cleaningCrew2 == null ? null : cleaningCrew2.trim();
    }

    public String getCleaningCrewName1() {
        return cleaningCrewName1;
    }

    public void setCleaningCrewName1(String cleaningCrewName1) {
        this.cleaningCrewName1 = cleaningCrewName1 == null ? null : cleaningCrewName1.trim();
    }

    public String getCleaningCrewName2() {
        return cleaningCrewName2;
    }

    public void setCleaningCrewName2(String cleaningCrewName2) {
        this.cleaningCrewName2 = cleaningCrewName2 == null ? null : cleaningCrewName2.trim();
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver == null ? null : driver.trim();
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber == null ? null : carNumber.trim();
    }

    public String getCarNo() {
        return carNo;
    }

    public void setCarNo(String carNo) {
        this.carNo = carNo == null ? null : carNo.trim();
    }

    public String getEscortName1() {
        return escortName1;
    }

    public void setEscortName1(String escortName1) {
        this.escortName1 = escortName1 == null ? null : escortName1.trim();
    }

    public String getEscortName2() {
        return escortName2;
    }

    public void setEscortName2(String escortName2) {
        this.escortName2 = escortName2 == null ? null : escortName2.trim();
    }

    public String getEscortId1() {
        return escortId1;
    }

    public void setEscortId1(String escortId1) {
        this.escortId1 = escortId1 == null ? null : escortId1.trim();
    }

    public String getEscortId2() {
        return escortId2;
    }

    public void setEscortId2(String escortId2) {
        this.escortId2 = escortId2 == null ? null : escortId2.trim();
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public String getNewDriver() {
        return newDriver;
    }

    public void setNewDriver(String newDriver) {
        this.newDriver = newDriver == null ? null : newDriver.trim();
    }

    public String getNewPerson() {
        return newPerson;
    }

    public void setNewPerson(String newPerson) {
        this.newPerson = newPerson == null ? null : newPerson.trim();
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes == null ? null : classes.trim();
    }

    public String getNewDriverName() {
        return newDriverName;
    }

    public void setNewDriverName(String newDriverName) {
        this.newDriverName = newDriverName == null ? null : newDriverName.trim();
    }

    public String getNewPersonName() {
        return newPersonName;
    }

    public void setNewPersonName(String newPersonName) {
        this.newPersonName = newPersonName == null ? null : newPersonName.trim();
    }

    public String getTaskDate() {
        return taskDate;
    }

    public void setTaskDate(String taskDate) {
        this.taskDate = taskDate == null ? null : taskDate.trim();
    }

    public String getIsSendWeixinMsg() {
        return isSendWeixinMsg;
    }

    public void setIsSendWeixinMsg(String isSendWeixinMsg) {
        this.isSendWeixinMsg = isSendWeixinMsg == null ? null : isSendWeixinMsg.trim();
    }
}