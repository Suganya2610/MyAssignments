package org.student;

import org.department.Department;

public class Student extends Department{
	
	public void studentName() {
		System.out.println("The student Name in student class");
	}
	
	public void studentDept() {
		System.out.println("The student Dept in student class");
	}
	
	public void studentId() {
		System.out.println("The student Id in student class");
	}
	
	public static void main(String[] args) {
		Student sd = new Student();
		sd.studentName();
		sd.studentDept();
		sd.studentId();
		sd.collegeName();
		sd.collegeCode();
		sd.collegeRank();
		sd.deptName();
	}


}
