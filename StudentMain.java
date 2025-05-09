package com.blc.elc;

public class StudentMain {

	public static void main(String[] args) {
		Student student=new Student();
		student.setStudentDetails("puji",77,90);
		String res=student.getStudentDetails();
		System.out.println(res);
		

	}

}
