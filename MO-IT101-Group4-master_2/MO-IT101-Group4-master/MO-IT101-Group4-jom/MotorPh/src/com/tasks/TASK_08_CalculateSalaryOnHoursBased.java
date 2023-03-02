package com.tasks;

public class TASK_08_CalculateSalaryOnHoursBased {
    static double calculateSalary(double hourlyRate, double hoursWorked) {
        double salary = hourlyRate * hoursWorked;
        return salary;
    }

    public static void main(String[] args) {
        //  Jose Crisostomo Hourly Rate
        double hourlyRate  = 373.04;
        //  Jose Crisostomo Hours Worked from 10/24 to 10/28
        double hoursWorked = 45;

        System.out.println(calculateSalary(hourlyRate,hoursWorked));

    }
}

