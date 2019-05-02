package com.wangyi.entity;

import java.util.Date;

public class ClearErrinfo {
    private String errinfoId;

    private String lineSn;

    private String orgid;

    private String termid;

    private String errorLocationnote1;

    private String errorLocationnote2;

    private String errorLocationnote3;

    private String errorLocationnote4;

    private String errorLocationnote5;

    private String errorLocationnote6;

    private String excuteWay;

    private String excuteWaynote1;

    private String excuteWaynote2;

    private String excuteMan;

    private Date techArriveTime;

    private Date techLeaveTime;

    private String techName;

    private String techPhone;

    private String mistakeCard;

    private String mistakeCash;

    private Date mistakeCashTime;

    private String swCardNo;

    private Date arriveTime;

    private Date leaveTime;

    private String nextTaskNote;

    public ClearErrinfo(String errinfoId, String lineSn, String orgid, String termid, String errorLocationnote1, String errorLocationnote2, String errorLocationnote3, String errorLocationnote4, String errorLocationnote5, String errorLocationnote6, String excuteWay, String excuteWaynote1, String excuteWaynote2, String excuteMan, Date techArriveTime, Date techLeaveTime, String techName, String techPhone, String mistakeCard, String mistakeCash, Date mistakeCashTime, String swCardNo, Date arriveTime, Date leaveTime, String nextTaskNote) {
        this.errinfoId = errinfoId;
        this.lineSn = lineSn;
        this.orgid = orgid;
        this.termid = termid;
        this.errorLocationnote1 = errorLocationnote1;
        this.errorLocationnote2 = errorLocationnote2;
        this.errorLocationnote3 = errorLocationnote3;
        this.errorLocationnote4 = errorLocationnote4;
        this.errorLocationnote5 = errorLocationnote5;
        this.errorLocationnote6 = errorLocationnote6;
        this.excuteWay = excuteWay;
        this.excuteWaynote1 = excuteWaynote1;
        this.excuteWaynote2 = excuteWaynote2;
        this.excuteMan = excuteMan;
        this.techArriveTime = techArriveTime;
        this.techLeaveTime = techLeaveTime;
        this.techName = techName;
        this.techPhone = techPhone;
        this.mistakeCard = mistakeCard;
        this.mistakeCash = mistakeCash;
        this.mistakeCashTime = mistakeCashTime;
        this.swCardNo = swCardNo;
        this.arriveTime = arriveTime;
        this.leaveTime = leaveTime;
        this.nextTaskNote = nextTaskNote;
    }

    public ClearErrinfo() {
        super();
    }

    public String getErrinfoId() {
        return errinfoId;
    }

    public void setErrinfoId(String errinfoId) {
        this.errinfoId = errinfoId == null ? null : errinfoId.trim();
    }

    public String getLineSn() {
        return lineSn;
    }

    public void setLineSn(String lineSn) {
        this.lineSn = lineSn == null ? null : lineSn.trim();
    }

    public String getOrgid() {
        return orgid;
    }

    public void setOrgid(String orgid) {
        this.orgid = orgid == null ? null : orgid.trim();
    }

    public String getTermid() {
        return termid;
    }

    public void setTermid(String termid) {
        this.termid = termid == null ? null : termid.trim();
    }

    public String getErrorLocationnote1() {
        return errorLocationnote1;
    }

    public void setErrorLocationnote1(String errorLocationnote1) {
        this.errorLocationnote1 = errorLocationnote1 == null ? null : errorLocationnote1.trim();
    }

    public String getErrorLocationnote2() {
        return errorLocationnote2;
    }

    public void setErrorLocationnote2(String errorLocationnote2) {
        this.errorLocationnote2 = errorLocationnote2 == null ? null : errorLocationnote2.trim();
    }

    public String getErrorLocationnote3() {
        return errorLocationnote3;
    }

    public void setErrorLocationnote3(String errorLocationnote3) {
        this.errorLocationnote3 = errorLocationnote3 == null ? null : errorLocationnote3.trim();
    }

    public String getErrorLocationnote4() {
        return errorLocationnote4;
    }

    public void setErrorLocationnote4(String errorLocationnote4) {
        this.errorLocationnote4 = errorLocationnote4 == null ? null : errorLocationnote4.trim();
    }

    public String getErrorLocationnote5() {
        return errorLocationnote5;
    }

    public void setErrorLocationnote5(String errorLocationnote5) {
        this.errorLocationnote5 = errorLocationnote5 == null ? null : errorLocationnote5.trim();
    }

    public String getErrorLocationnote6() {
        return errorLocationnote6;
    }

    public void setErrorLocationnote6(String errorLocationnote6) {
        this.errorLocationnote6 = errorLocationnote6 == null ? null : errorLocationnote6.trim();
    }

    public String getExcuteWay() {
        return excuteWay;
    }

    public void setExcuteWay(String excuteWay) {
        this.excuteWay = excuteWay == null ? null : excuteWay.trim();
    }

    public String getExcuteWaynote1() {
        return excuteWaynote1;
    }

    public void setExcuteWaynote1(String excuteWaynote1) {
        this.excuteWaynote1 = excuteWaynote1 == null ? null : excuteWaynote1.trim();
    }

    public String getExcuteWaynote2() {
        return excuteWaynote2;
    }

    public void setExcuteWaynote2(String excuteWaynote2) {
        this.excuteWaynote2 = excuteWaynote2 == null ? null : excuteWaynote2.trim();
    }

    public String getExcuteMan() {
        return excuteMan;
    }

    public void setExcuteMan(String excuteMan) {
        this.excuteMan = excuteMan == null ? null : excuteMan.trim();
    }

    public Date getTechArriveTime() {
        return techArriveTime;
    }

    public void setTechArriveTime(Date techArriveTime) {
        this.techArriveTime = techArriveTime;
    }

    public Date getTechLeaveTime() {
        return techLeaveTime;
    }

    public void setTechLeaveTime(Date techLeaveTime) {
        this.techLeaveTime = techLeaveTime;
    }

    public String getTechName() {
        return techName;
    }

    public void setTechName(String techName) {
        this.techName = techName == null ? null : techName.trim();
    }

    public String getTechPhone() {
        return techPhone;
    }

    public void setTechPhone(String techPhone) {
        this.techPhone = techPhone == null ? null : techPhone.trim();
    }

    public String getMistakeCard() {
        return mistakeCard;
    }

    public void setMistakeCard(String mistakeCard) {
        this.mistakeCard = mistakeCard == null ? null : mistakeCard.trim();
    }

    public String getMistakeCash() {
        return mistakeCash;
    }

    public void setMistakeCash(String mistakeCash) {
        this.mistakeCash = mistakeCash == null ? null : mistakeCash.trim();
    }

    public Date getMistakeCashTime() {
        return mistakeCashTime;
    }

    public void setMistakeCashTime(Date mistakeCashTime) {
        this.mistakeCashTime = mistakeCashTime;
    }

    public String getSwCardNo() {
        return swCardNo;
    }

    public void setSwCardNo(String swCardNo) {
        this.swCardNo = swCardNo == null ? null : swCardNo.trim();
    }

    public Date getArriveTime() {
        return arriveTime;
    }

    public void setArriveTime(Date arriveTime) {
        this.arriveTime = arriveTime;
    }

    public Date getLeaveTime() {
        return leaveTime;
    }

    public void setLeaveTime(Date leaveTime) {
        this.leaveTime = leaveTime;
    }

    public String getNextTaskNote() {
        return nextTaskNote;
    }

    public void setNextTaskNote(String nextTaskNote) {
        this.nextTaskNote = nextTaskNote == null ? null : nextTaskNote.trim();
    }
}