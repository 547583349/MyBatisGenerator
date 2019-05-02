package com.wangyi.entity;

public class CarGroupWithBLOBs extends CarGroup {
    private String driverName;

    private String lineRemarks;

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName == null ? null : driverName.trim();
    }

    public String getLineRemarks() {
        return lineRemarks;
    }

    public void setLineRemarks(String lineRemarks) {
        this.lineRemarks = lineRemarks == null ? null : lineRemarks.trim();
    }
}