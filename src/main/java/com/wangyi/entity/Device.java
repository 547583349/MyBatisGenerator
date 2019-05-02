package com.wangyi.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Device {
    private String id;

    private String deviceNumber;

    private String lockType;

    private String status;

    private String unlockType;

    private String shortAddress;

    private String areaId;

    private String deviceName;

    private String transferbox;

    private String deviceType;

    private String cashboxModel;

    private String openTime;

    private String closeTime;

    private BigDecimal lastCash;

    private String lastBox;

    private String qrcode;

    private Date weaningTime;

    private Date restartTime;

    private String deviceRoom;

    private String lockId;

    private String isUrban;

    private String interCity;

    private Date pickUpTime;

    private String deviceBelong;

    private String devicePro;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getDeviceNumber() {
        return deviceNumber;
    }

    public void setDeviceNumber(String deviceNumber) {
        this.deviceNumber = deviceNumber == null ? null : deviceNumber.trim();
    }

    public String getLockType() {
        return lockType;
    }

    public void setLockType(String lockType) {
        this.lockType = lockType == null ? null : lockType.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getUnlockType() {
        return unlockType;
    }

    public void setUnlockType(String unlockType) {
        this.unlockType = unlockType == null ? null : unlockType.trim();
    }

    public String getShortAddress() {
        return shortAddress;
    }

    public void setShortAddress(String shortAddress) {
        this.shortAddress = shortAddress == null ? null : shortAddress.trim();
    }

    public String getAreaId() {
        return areaId;
    }

    public void setAreaId(String areaId) {
        this.areaId = areaId == null ? null : areaId.trim();
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName == null ? null : deviceName.trim();
    }

    public String getTransferbox() {
        return transferbox;
    }

    public void setTransferbox(String transferbox) {
        this.transferbox = transferbox == null ? null : transferbox.trim();
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType == null ? null : deviceType.trim();
    }

    public String getCashboxModel() {
        return cashboxModel;
    }

    public void setCashboxModel(String cashboxModel) {
        this.cashboxModel = cashboxModel == null ? null : cashboxModel.trim();
    }

    public String getOpenTime() {
        return openTime;
    }

    public void setOpenTime(String openTime) {
        this.openTime = openTime == null ? null : openTime.trim();
    }

    public String getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(String closeTime) {
        this.closeTime = closeTime == null ? null : closeTime.trim();
    }

    public BigDecimal getLastCash() {
        return lastCash;
    }

    public void setLastCash(BigDecimal lastCash) {
        this.lastCash = lastCash;
    }

    public String getLastBox() {
        return lastBox;
    }

    public void setLastBox(String lastBox) {
        this.lastBox = lastBox == null ? null : lastBox.trim();
    }

    public String getQrcode() {
        return qrcode;
    }

    public void setQrcode(String qrcode) {
        this.qrcode = qrcode == null ? null : qrcode.trim();
    }

    public Date getWeaningTime() {
        return weaningTime;
    }

    public void setWeaningTime(Date weaningTime) {
        this.weaningTime = weaningTime;
    }

    public Date getRestartTime() {
        return restartTime;
    }

    public void setRestartTime(Date restartTime) {
        this.restartTime = restartTime;
    }

    public String getDeviceRoom() {
        return deviceRoom;
    }

    public void setDeviceRoom(String deviceRoom) {
        this.deviceRoom = deviceRoom == null ? null : deviceRoom.trim();
    }

    public String getLockId() {
        return lockId;
    }

    public void setLockId(String lockId) {
        this.lockId = lockId == null ? null : lockId.trim();
    }

    public String getIsUrban() {
        return isUrban;
    }

    public void setIsUrban(String isUrban) {
        this.isUrban = isUrban == null ? null : isUrban.trim();
    }

    public String getInterCity() {
        return interCity;
    }

    public void setInterCity(String interCity) {
        this.interCity = interCity == null ? null : interCity.trim();
    }

    public Date getPickUpTime() {
        return pickUpTime;
    }

    public void setPickUpTime(Date pickUpTime) {
        this.pickUpTime = pickUpTime;
    }

    public String getDeviceBelong() {
        return deviceBelong;
    }

    public void setDeviceBelong(String deviceBelong) {
        this.deviceBelong = deviceBelong == null ? null : deviceBelong.trim();
    }

    public String getDevicePro() {
        return devicePro;
    }

    public void setDevicePro(String devicePro) {
        this.devicePro = devicePro == null ? null : devicePro.trim();
    }
}