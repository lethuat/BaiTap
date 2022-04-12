
public class StudentMark implements  IStudentMark{
	
	
	String FullName,Class;
	int ID,Semester;
	float AverageMark;
	int [] subjectMarkList = new int [5];
	@Override
	public void display() {
		System.out.println("fullName:" +FullName);
		System.out.println("class: " +Class);
		System.out.println("id :" +ID);
		System.out.println("semester:" +Semester);
		System.out.println("averageMark " +AverageMark);
		
		
	}
	void calculate() {
		for(int i : subjectMarkList) {
			AverageMark +=i;
		}
		AverageMark /= subjectMarkList.length;
	}
}
