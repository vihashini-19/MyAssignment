package org.collage;

public class Student extends Department {
	public void studentName() {
		System.out.println("Student Name: Varunavi");
	}
	public void studentDept() {
		System.out.println("Student Departname: ECE");
	}
	public void studentId() {
		System.out.println("Student Id: EC1482");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collage col=new Collage();
		col.collageCode();
		col.collageRank();
		
		Department dept=new Department();
		dept.deptName();
		dept.collageCode();
		dept.collageName();
		dept.collageRank();
		
		Student stu=new Student();
		stu.studentName();
		stu.studentDept();
		stu.studentId();
		stu.collageCode();
		stu.collageName();
		stu.collageRank();
		stu.deptName();
	}

}
