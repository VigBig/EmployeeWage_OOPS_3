package com.bridgelabz.employeewage;

public class CompanyEmpWage{
    String companyName = "";
    int wagePerHour = 0;
    int fullDayHour = 0;
    int partDayHour = 0;
    int totalWorkDay = 0;
    int totalWorkHour = 0;

    int totalWage =0;

    public void setTotalWage(int totalWage) {
        this.totalWage = totalWage;
    }


    CompanyEmpWage(){

    }

    CompanyEmpWage(String companyName,int wagePerHour,int fullDayHour,int partDayHour,int totalWorkDay,int totalWorkHour){
        this.companyName = companyName;

        this.wagePerHour =wagePerHour;

        this.fullDayHour =fullDayHour;

        this.partDayHour=partDayHour;

        this.totalWorkDay=totalWorkDay;

        this.totalWorkHour =totalWorkHour;


    }


}