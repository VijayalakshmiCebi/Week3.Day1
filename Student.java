package org.student;

import org.college.College;
import org.department.Department;

public class Student extends Department {
	public void studentName() {
		System.out.println("Vijayalakshmi");

	}

	public void studentDept() {
		System.out.println("Industrial Engg");

	}

	public void studentId() {
		System.out.println("12356");
	}

	public static void main(String[] args) {
		System.out.println("calling college methods");
		College C = new College();
		C.collegeCode();
		C.collegeName();
		C.collegeRank();
		System.out.println("Calling Department methods");
		Department D = new Department();
		D.deptName();
		D.collegeCode();
		D.collegeName();
		D.collegeRank();
		System.out.println("Calling Student methods");
		Student S = new Student();
		S.studentName();
		S.studentId();
		S.studentDept();
		S.collegeName();
		S.collegeCode();
		S.collegeRank();
		S.deptName();

	}

}
