package com.tasks;

public class TASK_09_ApplyGovernmentDeductions {

    static float SSS_Contribution(int salary){
        int [] min_Range = {
                 3_250,
                 3_750,
                 4_250,
                 4_750,
                 5_250,
                 5_750,
                 6_250,
                 6_750,
                 7_250,
                 7_750,
                 8_250,
                 8_750,
                 9_250,
                 9_750,
                10_250,
                10_750,
                11_250,
                11_750,
                12_250,
                12_750,
                13_250,
                13_750,
                14_250,
                14_750,
                15_250,
                15_750,
                16_250,
                16_750,
                17_250,
                17_750,
                18_250,
                18_750,
                19_250,
                19_750,
                20_250,
                20_750,
                21_250,
                21_750,
                22_250,
                22_750,
                23_250,
                23_750,
                24_250,
                24_750
        };
        int [] max_Range = {
                 3_750,
                 4_250,
                 4_750,
                 5_250,
                 5_750,
                 6_250,
                 6_750,
                 7_250,
                 7_750,
                 8_250,
                 8_750,
                 9_250,
                 9_750,
                10_250,
                10_750,
                11_250,
                11_750,
                12_250,
                12_750,
                13_250,
                13_750,
                14_250,
                14_750,
                15_250,
                15_750,
                16_250,
                16_750,
                17_250,
                17_750,
                18_250,
                18_750,
                19_250,
                19_750,
                20_250,
                20_750,
                21_250,
                21_750,
                22_250,
                22_750,
                23_250,
                23_750,
                24_250,
                24_750,
        };
        float [] contribution_value = {
                  135.00f,
                  157.50f,
                  180.00f,
                  202.50f,
                  225.00f,
                  247.50f,
                  270.00f,
                  292.50f,
                  315.00f,
                  337.50f,
                  360.00f,
                  382.50f,
                  405.00f,
                  427.50f,
                  450.00f,
                  472.50f,
                  495.00f,
                  517.50f,
                  540.00f,
                  562.50f,
                  585.00f,
                  607.50f,
                  630.00f,
                  652.50f,
                  675.00f,
                  697.50f,
                  720.00f,
                  742.50f,
                  765.00f,
                  787.50f,
                  810.00f,
                  832.50f,
                  855.00f,
                  877.50f,
                  900.00f,
                  922.50f,
                  945.00f,
                  967.50f,
                  990.00f,
                1_012.50f,
                1_035.00f,
                1_057.50f,
                1_080.00f,
                1_102.50f,
                1_125.00f,
        };

        double monthlysalary = 20000;
        float contribution = 0;

        for (int i = 0; i < contribution_value.length; i++) {
            if (monthlysalary < 3250) {
                contribution = 135.00f;
                break;
            }
            if (monthlysalary > 24250) {
                contribution = 1125.00f;
                break;
            }
            if (monthlysalary >= min_Range[i] && monthlysalary <= max_Range[i]) {
                contribution = contribution_value[i + 1];
                break;
            }
        }
        System.out.println("MINIMUM: " + min_Range.length);
        System.out.println("MAXIMUM: "  + max_Range.length);
        System.out.println("VALUE  : "  + contribution_value.length);
        System.out.println("Result = "  + contribution);
        return contribution;
    }
    static float PhilHealth_Contribution(int salary){
        float contribution = 0;
        if (salary < 10000) contribution = 300;
        if (salary > 10000 && salary <= 59999) contribution = salary * 0.03f;
        if (salary >= 60000) contribution = 1800;
        return contribution;
    }
    static float PagIbig_Contribution(int salary){
        float contribution = 0;
        if (salary > 1000 & salary < 1500) contribution = salary * 0.03f;
        else contribution = salary * 0.04f;
        return contribution > 100 ? contribution = 100 : contribution;
    }



    public static void main(String[] args) {
        System.out.println(SSS_Contribution(16700));
        System.out.println(PhilHealth_Contribution(16700));
        System.out.println(PagIbig_Contribution(16700));
    }
}
