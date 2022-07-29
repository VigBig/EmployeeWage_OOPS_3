package com.bridgelabz.employeewage;

public class EmpWageBuilder implements WageCalculate{

    @Override
    public void totalWage(CompanyEmpWage[] arr){

        int dayCount = WageCalculate.dayCount;
        int hourCount = WageCalculate.hourCount;
        int totalWage = WageCalculate.totalWage;
        int dayPresent = WageCalculate.dayPresent;

        for(int i = 0 ; i<arr.length;i++) {
            while (dayCount <= arr[i].totalWorkDay && hourCount <= arr[i].totalWorkHour) {

                int dailyWage = 0;
                int attendance = (int) (Math.random() * 10) % 3;

                switch (attendance) {
                    case 1:

                        if(hourCount + arr[i].fullDayHour <= arr[i].totalWorkHour){

//                            System.out.println("Employee is present Full Time");
                            hourCount = hourCount + arr[i].fullDayHour;
                            dailyWage = arr[i].wagePerHour * arr[i].fullDayHour;
                            dayPresent++;

                        }
                        break;
                    case 2:

                        if(hourCount + arr[i].partDayHour <= arr[i].totalWorkHour){

//                            System.out.println("Employee is present Part Time");
                            hourCount = hourCount + arr[i].partDayHour;
                            dailyWage = arr[i].wagePerHour * arr[i].partDayHour;
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


            System.out.println("For company " + arr[i].companyName + ". \n" +
                    "In one month of " + (dayCount - 1) + " working days, \n"
                    + "employees present for " + dayPresent + " days and \n"
                    + "worked for " + hourCount + " hours. \n" +
                    "earn wages: " + totalWage +"\n");

            arr[i].setTotalWage(totalWage);
            dayCount = WageCalculate.dayCount;
            hourCount = WageCalculate.hourCount;
            dayPresent = WageCalculate.dayPresent;

        }

    }
}
