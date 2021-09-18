package week3day1;

public class AssignmentStudent {

	public void getStudentInfo(int Id) {
		System.out.println("Student ID : " + Id);
	}

	public void getStudentInfo(int Id, String name) {
		System.out.println("Student2 ID " + Id + " and Name " + name);
	}

	public void getStudentInfo(String email, long phnum) {
		System.out.println("Student2 email : " + email);
		System.out.println("Student phnum : " + phnum);
	}

	public static void main(String[] args) {

		AssignmentStudent obj = new AssignmentStudent();
		obj.getStudentInfo(307);
		obj.getStudentInfo(308, "Jisha");
		obj.getStudentInfo("jishachaji@gmail.com", 7010756688l);

	}

}
