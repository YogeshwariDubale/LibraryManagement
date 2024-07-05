package com.yogeshwari.library.dao;
import java.util.List;

import com.yogeshwari.library.entity.Student;

public interface StudentDao {
	String registerStudent(Student student);
	public Student getStudentById(Integer studentId);
        boolean studentLogin(Integer studentId,String studentPassword);
        List<Student> getAllStudent();
        List<Student> getStudentByName(String studentName);

}
