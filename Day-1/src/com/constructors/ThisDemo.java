package com.constructors;

public class ThisDemo {
	public static void main(String[] args) {
		System.out.println("I am from Main Method");
		Trainee trainee = new Trainee(103, "Jay", "JAVA", "Dallas",
				"San Antonio");
		System.out.println(trainee);
		trainee.displayTraineeDetails();

		Trainee trainee2 = new Trainee(102, "JP", "Devops");
		trainee2.displayTraineeDetails();

		System.out.println("End of Main Method");
	}
}
