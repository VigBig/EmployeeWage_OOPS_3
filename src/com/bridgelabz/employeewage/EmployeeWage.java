package com.bridgelabz.employeewage;

import java.util.Scanner;

public class EmployeeWage {

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");

        EmpWageBuilder empWageBuilder = new EmpWageBuilder();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of companies you would like to enter?");
        int numberOfCompanies = sc.nextInt();

        empWageBuilder.addDetails(numberOfCompanies);


        empWageBuilder.totalWage();
    }
}