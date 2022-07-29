package com.bridgelabz.employeewage;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmpWageBuilder implements WageCalculate{
    Scanner sc = new Scanner(System.in);

    List<CompanyEmpWage> companyEmpWageList = new ArrayList<>();

    public void addDetails(int listSize){

        for(int i=0; i<listSize;i++){

            CompanyEmpWage companyEmpWage = new CompanyEmpWage();
            System.out.println("Enter Company "+ (i+1) +" Details:");

            System.out.println("Enter Company Name:");
            String companyName = sc.next();
            companyEmpWage.setCompanyName(companyName);
            System.out.println("Enter Wage per Hour:");
            int wagePerHour = sc.nextInt();
            companyEmpWage.setWagePerHour(wagePerHour);
            System.out.println("Enter Hours for Full Day's work:");
            int fullDayHour = sc.nextInt();
            companyEmpWage.setFullDayHour(fullDayHour);
            System.out.println("Enter Hours for Part Time's work:");
            int partDayHour = sc.nextInt();
            companyEmpWage.setPartDayHour(partDayHour);
            System.out.println("Enter Total No. of Working Days in a Month:");
            int totalWorkDay = sc.nextInt();
            companyEmpWage.setTotalWorkDay(totalWorkDay);
            System.out.println("Enter Total No. of Working Hours in a Month:");
            int totalWorkHour = sc.nextInt();
            companyEmpWage.setTotalWorkHour(totalWorkHour);

            companyEmpWageList.add(companyEmpWage);

        }

    }
    @Override
    public void calculateTotalWage(){

        int dayCount = WageCalculate.dayCount;
        int hourCount = WageCalculate.hourCount;
        int totalWage = WageCalculate.totalWage;
        int dayPresent = WageCalculate.dayPresent;

        for(CompanyEmpWage company: companyEmpWageList) {
            while (dayCount <= company.totalWorkDay && hourCount <= company.totalWorkHour) {

                int dailyWage = 0;
                int attendance = (int) (Math.random() * 10) % 3;

                switch (attendance) {
                    case 1:

                        if(hourCount + company.fullDayHour <= company.totalWorkHour){

//                            System.out.println("Employee is present Full Time");
                            hourCount = hourCount + company.fullDayHour;
                            dailyWage = company.wagePerHour * company.fullDayHour;
                            dayPresent++;

                        }
                        break;
                    case 2:

                        if(hourCount + company.partDayHour <= company.totalWorkHour){

//                            System.out.println("Employee is present Part Time");
                            hourCount = hourCount + company.partDayHour;
                            dailyWage = company.wagePerHour * company.partDayHour;
                            dayPresent++;

                        }
                        break;
                    default:
//                        System.out.println("Employee is absent");
                }

//                System.out.println("Daily Wage on Day :" + dayCount + " is :" + dailyWage);
                totalWage = totalWage + dailyWage;
                dayCount++;
            }

            company.setTotalWage(totalWage);
            dayCount = WageCalculate.dayCount;
            company.setHourCount(hourCount);
            company.setDayPresent(dayPresent);
            hourCount = WageCalculate.hourCount;
            dayPresent = WageCalculate.dayPresent;

        }

    }
    @Override
    public void getTotalWage(){
        System.out.println("*******************************************");

        for(CompanyEmpWage company:companyEmpWageList) {
            System.out.println("For company " + company.companyName + ". \n" +
                    "In one month of " + company.totalWorkDay + " working days:\n"
                    + "employees present for " + company.dayPresent + " days and \n"
                    + "worked for " + company.hourCount + " hours \n" +
                    "earn total wages of : " + company.totalWage + "\n");
        }

        System.out.println("*******************************************");

    }

}
