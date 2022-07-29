package com.bridgelabz.employeewage;

public class CompanyEmpWage{
    String companyName = "";
    int wagePerHour = 0;
    int fullDayHour = 0;
    int partDayHour = 0;
    int totalWorkDay = 0;
    int totalWorkHour = 0;

    int dayCount = 1;
    int hourCount = 0;
    int dayPresent = 0;

    int totalWage =0;

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getWagePerHour() {
        return wagePerHour;
    }

    public void setWagePerHour(int wagePerHour) {
        this.wagePerHour = wagePerHour;
    }

    public int getFullDayHour() {
        return fullDayHour;
    }

    public void setFullDayHour(int fullDayHour) {
        this.fullDayHour = fullDayHour;
    }

    public int getPartDayHour() {
        return partDayHour;
    }

    public void setPartDayHour(int partDayHour) {
        this.partDayHour = partDayHour;
    }

    public int getTotalWorkDay() {
        return totalWorkDay;
    }

    public void setTotalWorkDay(int totalWorkDay) {
        this.totalWorkDay = totalWorkDay;
    }

    public int getTotalWorkHour() {
        return totalWorkHour;
    }

    public void setTotalWorkHour(int totalWorkHour) {
        this.totalWorkHour = totalWorkHour;
    }

    public void setDayCount(int dayCount) {
        this.dayCount = dayCount;
    }

    public void setHourCount(int hourCount) {
        this.hourCount = hourCount;
    }

    public void setDayPresent(int dayPresent) {
        this.dayPresent = dayPresent;
    }

    public void setTotalWage(int totalWage) {
        this.totalWage = totalWage;
    }


    CompanyEmpWage(){

    }



}