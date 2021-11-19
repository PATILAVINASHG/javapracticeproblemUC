public class EmployeeWageUC6 {
         //constant
    static final int IS_FULLTIME_PRESENT = 1;
    static final int IS_PART_TIME =2;
    static final int SALARY_PER_HOUR = 20;
    static final int TOTAL_WORKING_DAY = 20;

    public static void main(String[] args) {
        //variabble
        int empHour = 0, empWage = 0, totalempwage = 0;
         for (int day = 0; day < TOTAL_WORKING_DAY; day++) {
         int empCheck =(int)(Math.floor(Math.random() * 10) % 3);
	
         switch (empCheck) {
                case IS_FULLTIME_PRESENT :
                        empHour = 8;
                break;
                case IS_PART_TIME :
                        empHour = 4;
                break;
                default :
                        empHour =0;
                break;
                }
	empWage = empHour * SALARY_PER_HOUR;
	totalempwage += empWage;
	System.out.println("Employee wage: " + empWage);
	}
         System.out.println("total Employed wages: " +totalempwage);
        }

}
