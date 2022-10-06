package Employee_Wage_Computation_Day3;

import java.util.Random;

public class Employee_Wage {

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation");
		System.out.println();

		// Employee attendance check
		Random inp = new Random();
		int isPresent = inp.nextInt(2);
		
		System.out.println("Attendance : ");
		if (isPresent == 0)
			System.out.println("Employee is Present");
		else
			System.out.println("Employee is Absent");
	}

}
