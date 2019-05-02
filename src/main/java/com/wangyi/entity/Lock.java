package com.wangyi.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Lock {
    private String id;

    private Date createTime;

    private Date updateTime;

    private String active;

    private String activeInfo;

    private Date activeTime;

    private String atmSn;

    private String lockId;

    private String lockCode;

    private BigDecimal status;

    private String orgId;

    private String hasIbt;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active == null ? null : active.trim();
    }

    public String getActiveInfo() {
        return activeInfo;
    }

    public void setActiveInfo(String activeInfo) {
        this.activeInfo = activeInfo == null ? null : activeInfo.trim();
    }

    public Date getActiveTime() {
        return activeTime;
    }

    public void setActiveTime(Date activeTime) {
        this.activeTime = activeTime;
    }

    public String getAtmSn() {
        return atmSn;
    }

    public void setAtmSn(String atmSn) {
        this.atmSn = atmSn == null ? null : atmSn.trim();
    }

    public String getLockId() {
        return lockId;
    }

    public void setLockId(String lockId) {
        this.lockId = lockId == null ? null : lockId.trim();
    }

    public String getLockCode() {
        return lockCode;
    }

    public void setLockCode(String lockCode) {
        this.lockCode = lockCode == null ? null : lockCode.trim();
    }

    public BigDecimal getStatus() {
        return status;
    }

    public void setStatus(BigDecimal status) {
        this.status = status;
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId == null ? null : orgId.trim();
    }

    public String getHasIbt() {
        return hasIbt;
    }

    public void setHasIbt(String hasIbt) {
        this.hasIbt = hasIbt == null ? null : hasIbt.trim();
    }
}