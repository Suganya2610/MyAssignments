package week2.day3;

public class StudentsOverLoading {
	
	public void getStudentInfo(int id) {
		System.out.println("Student id: " + id);
	}
	
	public void getStudentInfo(int id, String name) {
		System.out.println("Student id and name: " + id + " and " + name);
	}
	
	public void getStudentInfo(String email, String phonenumber) {
		System.out.println("Student email and phonenumber: " + email + " and " + phonenumber);
	}


	public static void main(String[] args) {

		StudentsOverLoading sd = new StudentsOverLoading();
		sd.getStudentInfo(4);
		sd.getStudentInfo(5, "Suganya");
		sd.getStudentInfo("inya26@gmail.com", "7598353944");
	}

}
