package org.student;

import org.college.College;
import org.department.Department;

public class Student {

	public void studentName() {
		System.out.println("Student Name: Name");

	}

	public void studentDept() {
		System.out.println("Student Dept: CS");
	}

	public void studentId() {
		System.out.println("Student Id: 317");
	}

	public static void main(String[] args) {
		College obj = new College();
		obj.collegeCode();
		obj.collegeName();
		obj.collegeRank();

		Department obj2 = new Department();
		obj2.collegeCode();
		obj2.collegeName();
		obj2.collegeRank();

		Student obj3 = new Student();
		obj3.studentDept();
		obj3.studentId();
		obj3.studentName();

	}
}