package com.wangyi.entity;

import java.util.Date;

public class Gun {
    private String id;

    private String gunCode;

    private String gunNum;

    private String internalNum;

    private Date buyDate;

    private String gunType;

    private String gunStatus;

    private String createUserId;

    private Date updateDate;

    private String remark;

    private String manMark;

    private Integer useCount;

    private String isClean;

    private String isCheck;

    private Date cleanDate;

    private Date checkDate;

    private String operaterId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getGunCode() {
        return gunCode;
    }

    public void setGunCode(String gunCode) {
        this.gunCode = gunCode == null ? null : gunCode.trim();
    }

    public String getGunNum() {
        return gunNum;
    }

    public void setGunNum(String gunNum) {
        this.gunNum = gunNum == null ? null : gunNum.trim();
    }

    public String getInternalNum() {
        return internalNum;
    }

    public void setInternalNum(String internalNum) {
        this.internalNum = internalNum == null ? null : internalNum.trim();
    }

    public Date getBuyDate() {
        return buyDate;
    }

    public void setBuyDate(Date buyDate) {
        this.buyDate = buyDate;
    }

    public String getGunType() {
        return gunType;
    }

    public void setGunType(String gunType) {
        this.gunType = gunType == null ? null : gunType.trim();
    }

    public String getGunStatus() {
        return gunStatus;
    }

    public void setGunStatus(String gunStatus) {
        this.gunStatus = gunStatus == null ? null : gunStatus.trim();
    }

    public String getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId == null ? null : createUserId.trim();
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getManMark() {
        return manMark;
    }

    public void setManMark(String manMark) {
        this.manMark = manMark == null ? null : manMark.trim();
    }

    public Integer getUseCount() {
        return useCount;
    }

    public void setUseCount(Integer useCount) {
        this.useCount = useCount;
    }

    public String getIsClean() {
        return isClean;
    }

    public void setIsClean(String isClean) {
        this.isClean = isClean == null ? null : isClean.trim();
    }

    public String getIsCheck() {
        return isCheck;
    }

    public void setIsCheck(String isCheck) {
        this.isCheck = isCheck == null ? null : isCheck.trim();
    }

    public Date getCleanDate() {
        return cleanDate;
    }

    public void setCleanDate(Date cleanDate) {
        this.cleanDate = cleanDate;
    }

    public Date getCheckDate() {
        return checkDate;
    }

    public void setCheckDate(Date checkDate) {
        this.checkDate = checkDate;
    }

    public String getOperaterId() {
        return operaterId;
    }

    public void setOperaterId(String operaterId) {
        this.operaterId = operaterId == null ? null : operaterId.trim();
    }
}