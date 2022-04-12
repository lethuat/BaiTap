import java.util.ArrayList;
import java.util.Scanner;

public class TestStudentMark {
	static ArrayList<StudentMark> studentMarkList = new ArrayList<StudentMark>();
	static Scanner input = new Scanner(System.in);

	static void menu() {
		System.out.println("1. Insert new student");
		System.out.println("2. View list of student's marks");
		System.out.println("3. Average mark");
		System.out.println("4. Exit");
	}

	static void insertNewstudentMark() {
		StudentMark studentMark = new StudentMark();
		studentMark.ID = studentMarkList.size() + 1;
		
		System.out.print("Input name: ");	
		input.nextLine();
		studentMark.FullName = input.nextLine();
		
		System.out.print("Input Class: ");
		studentMark.Class = input.nextLine();

		System.out.print("Input semester: ");
		studentMark.Semester = input.nextInt();

		System.out.println("Input 5 subject mark: ");
		for (int i = 0; i < studentMark.subjectMarkList.length; i++) {

			System.out.printf("Subject mark %d:", i + 1);	
			studentMark.subjectMarkList[i] = input.nextInt();
		}
		studentMarkList.add(studentMark);
		

	}

	static void viewListofStudentMark() {
		if (studentMarkList.isEmpty()) {
			System.out.println("No StudentMark");
		} else {
			for (StudentMark StudentMark : studentMarkList) {
				StudentMark.display();
			}
		}
	}

	static void averatePrice1() {
		if (studentMarkList.isEmpty()) {
			System.out.println("No StudentMark");
		} else {
			for (StudentMark StudentMark : studentMarkList) {
				StudentMark.calculate();
				StudentMark.display();
			}
		}
	}

	public static void main(String[] args) {
		menu();

		while (true) {
			System.out.println("please enter an option: ");
			switch (input.nextInt()) {
			case 1:
				insertNewstudentMark();
				break;

			case 2:
				viewListofStudentMark();
				break;
			case 3:
				averatePrice1();
			case 4:
				return;
			}
		}
	}
}
