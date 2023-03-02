package com.tasks;
import java.util.stream.*;
import java.util.Date;
import java.util.EmptyStackException;
import java.util.stream.Stream;

public class TASK_07_UseTheCorrectDataTypes {
        int Employee_Number;
        String Last_Name;
        String First_Name;
        String   Birthday;
        String Address;
        String Phone_Number;
        String SSS_Number;
        String Philhealth_Number;
        String TIN_Number;
        String PagIbig_Number;
        String Status;
        String Position;
        String Immediate_Supervisor	;
        int Basic_Salary;
        int Rice_Subsidy	;
        int Phone_Allowance;
        int Clothing_Allowance;
        int Gross_SemiMonthlyRate;
        float Hourly_Rate;

    public int getEmployee_Number() {
        return Employee_Number;
    }

    public void setEmployee_Number(int employee_Number) {
        Employee_Number = employee_Number;
    }

    public String getLast_Name() {
        return Last_Name;
    }

    public void setLast_Name(String last_Name) {
        Last_Name = last_Name;
    }

    public String getFirst_Name() {
        return First_Name;
    }

    public void setFirst_Name(String first_Name) {
        First_Name = first_Name;
    }

    public String getBirthday() {
        return Birthday;
    }

    public void setBirthday(String birthday) {
        Birthday = birthday;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getPhone_Number() {
        return Phone_Number;
    }

    public void setPhone_Number(String phone_Number) {
        Phone_Number = phone_Number;
    }

    public String getSSS_Number() {
        return SSS_Number;
    }

    public void setSSS_Number(String SSS_Number) {
        this.SSS_Number = SSS_Number;
    }

    public String getPhilhealth_Number() {
        return Philhealth_Number;
    }

    public void setPhilhealth_Number(String philhealth_Number) {
        Philhealth_Number = philhealth_Number;
    }

    public String getTIN_Number() {
        return TIN_Number;
    }

    public void setTIN_Number(String TIN_Number) {
        this.TIN_Number = TIN_Number;
    }

    public String getPagIbig_Number() {
        return PagIbig_Number;
    }

    public void setPagIbig_Number(String pagIbig_Number) {
        PagIbig_Number = pagIbig_Number;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public String getPosition() {
        return Position;
    }

    public void setPosition(String position) {
        Position = position;
    }

    public String getImmediate_Supervisor() {
        return Immediate_Supervisor;
    }

    public void setImmediate_Supervisor(String immediate_Supervisor) {
        Immediate_Supervisor = immediate_Supervisor;
    }

    public int getBasic_Salary() {
        return Basic_Salary;
    }

    public void setBasic_Salary(int basic_Salary) {
        Basic_Salary = basic_Salary;
    }

    public int getRice_Subsidy() {
        return Rice_Subsidy;
    }

    public void setRice_Subsidy(int rice_Subsidy) {
        Rice_Subsidy = rice_Subsidy;
    }

    public int getPhone_Allowance() {
        return Phone_Allowance;
    }

    public void setPhone_Allowance(int phone_Allowance) {
        Phone_Allowance = phone_Allowance;
    }

    public int getClothing_Allowance() {
        return Clothing_Allowance;
    }

    public void setClothing_Allowance(int clothing_Allowance) {
        Clothing_Allowance = clothing_Allowance;
    }

    public int getGross_SemiMonthlyRate() {
        return Gross_SemiMonthlyRate;
    }

    public void setGross_SemiMonthlyRate(int gross_SemiMonthlyRate) {
        Gross_SemiMonthlyRate = gross_SemiMonthlyRate;
    }

    public float getHourly_Rate() {
        return Hourly_Rate;
    }

    public void setHourly_Rate(float hourly_Rate) {
        Hourly_Rate = hourly_Rate;
    }


//    MAIN
    public static void main(String[] args) {
        TASK_07_UseTheCorrectDataTypes data = new TASK_07_UseTheCorrectDataTypes();
//      Set Show Profile
        data.setEmployee_Number(10001);
        data.setFirst_Name("Jose");
        data.setLast_Name("Crisostomo");
        data.setBirthday("February 14, 1988");
        data.setAddress("17/85 Stracke Via Suite 042, Poblacion, Las Piñas 4783 Dinagat Islands ");
//      Set Bank Numbers
        data.setSSS_Number("49-1632020-8");
        data.setPhilhealth_Number("382189453145");
        data.setTIN_Number("317-674-022-000");
        data.setPagIbig_Number("441093369646");
//      Set Worker Info
        data.setStatus("Regular");
        data.setPosition("HR Manager");
        data.setImmediate_Supervisor("N/A");
//      Set Allowances
        data.setRice_Subsidy(1_500);
        data.setPhone_Allowance(1000);
        data.setClothing_Allowance(1000);
//      Set Salary
        data.setBasic_Salary(62_670);
        data.setGross_SemiMonthlyRate(31_335);
        data.setHourly_Rate(373.04f);

        String [][] arrEmployeeNumber10001 =
            {
                /*
                 |    GET SHOW PROFILE ARRAY
                 |       OUTER[0]
                 |             INNER [0] = Employee Number
                 |             INNER [1] = First Name
                 |             INNER [2] = Last Name
                 |             INNER [3] = Birthday
                 |             INNER [4] = Address
                 */
                {
                    String.valueOf(data.getEmployee_Number()),
                    data.getFirst_Name(),
                    data.getLast_Name(),
                    data.getBirthday(),
                    data.getAddress()
                },
                /*
                 |    GET BANK ARRAY
                 |       OUTER[1]
                 |             INNER [0] = SSS_Number
                 |             INNER [1] = Philhealth_Number
                 |             INNER [2] = TIN_Number
                 |             INNER [3] = PagIbig_Number
                 */
                {
                    data.getSSS_Number(),
                    data.getPhilhealth_Number(),
                    data.getTIN_Number(),
                    data.getPagIbig_Number()
                },
                /*
                 |    GET WORKER INFO
                 |       OUTER[2]
                 |             INNER [0] = Status
                 |             INNER [1] = Position
                 |             INNER [2] = Immediate Supervisor
                 */
                {
                    data.getStatus() ,
                    data.getPosition() ,
                    data.getImmediate_Supervisor()
                },
                /*
                 |    GET ALLOWANCES
                 |       OUTER[3]
                 |             INNER [0] = Rice Subsidy
                 |             INNER [1] = Phone Allowance
                 |             INNER [2] = Clothing Allowance
                 */
                {
                    String.valueOf(data.getRice_Subsidy()),
                    String.valueOf(data.getPhone_Allowance()),
                    String.valueOf(data.getClothing_Allowance())
                },
                /*
                 |    GET SALARY
                 |       OUTER[4]
                 |             INNER [0] = Basic Salary
                 |             INNER [1] = Semi-Monthly Rate
                 |             INNER [2] = Hourly Rate
                 */
                {
                    String.valueOf(data.getBasic_Salary()),
                    String.valueOf(data.getGross_SemiMonthlyRate()),
                    String.valueOf(data.getHourly_Rate())
                }
        };

    /*
     |
     >> Print The Multi Dimensional Array
     |
     */
        for (String [] outer:
             arrEmployeeNumber10001) {
            for (String inner:
                 outer) {
                System.out.println(inner);
            }
        }
    }
}
