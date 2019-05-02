package com.wangyi.entity;

public class DeviceWithBLOBs extends Device {
    private String organizationId;

    private String address;

    private String notes;

    private String payCardAddress;

    public String getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId == null ? null : organizationId.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes == null ? null : notes.trim();
    }

    public String getPayCardAddress() {
        return payCardAddress;
    }

    public void setPayCardAddress(String payCardAddress) {
        this.payCardAddress = payCardAddress == null ? null : payCardAddress.trim();
    }
}