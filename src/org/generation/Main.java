package org.generation;

import org.generation.classes.Student;
import org.generation.classes.StudentService;
import org.generation.exceptions.StudentNotFoundException;

public class Main {

    public static void main(String[] args) throws StudentNotFoundException {
	    StudentService studentService = new StudentService();
	    //TODO refactor this code to use encapsulation inside studentsService
        studentService.addStudent( new Student( "Carlos", "1030", 31 ) );
        studentService.addStudent(new Student( "Ian", "1040", 28 ) );
        studentService.addStudent(new Student( "Elise", "1050", 26 ) );
        studentService.addStudent(new Student( "Santiago", "1020", 33 ) );

        studentService.enrollStudents( "Math", "1030" );
        
        studentService.enrollStudents("");
        System.out.println(studentService);
    }//main

	private static void studentService(String string) {
		// TODO Auto-generated method stub
		
	}
}//class Main
