package com.bridgelabz.employeewage;

import java.util.Scanner;

public class EmployeeWage {

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");

        CompanyEmpWage[] arr;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of companies you would like to enter?");
        int arrayLength = sc.nextInt();

        arr = new CompanyEmpWage[arrayLength];


        for(int i = 0 ; i<arrayLength; i++) {
            System.out.println("Enter Company "+ (i+1) +" Details:");

            System.out.println("Enter Company Name:");
            String companyName = sc.next();

            System.out.println("Enter Wage per Hour:");
            int wagePerHour = sc.nextInt();

            System.out.println("Enter Hours for Full Day's work:");
            int fullDayHour = sc.nextInt();

            System.out.println("Enter Hours for Part Time's work:");
            int partDayHour = sc.nextInt();

            System.out.println("Enter Total No. of Working Days in a Month:");
            int totalWorkDay = sc.nextInt();

            System.out.println("Enter Total No. of Working Hours in a Month:");
            int totalWorkHour = sc.nextInt();

            arr[i] = new CompanyEmpWage(companyName,wagePerHour,fullDayHour,partDayHour,totalWorkDay,totalWorkHour);

        }
        EmpWageBuilder ewb = new EmpWageBuilder();
        ewb.totalWage(arr);
    }
}