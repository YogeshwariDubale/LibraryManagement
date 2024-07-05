package com.yogeshwari.library.service;
import java.util.List;

import com.yogeshwari.library.entity.Student;

public interface StudentService {
	String registerStudent(Student student);
	Student getStudentById(Integer studentId);
	boolean studentLogin(Integer studentId, String studentPassword);
	List<Student> getAllStudent();
    List<Student> getStudentByName(String studentName);

}
