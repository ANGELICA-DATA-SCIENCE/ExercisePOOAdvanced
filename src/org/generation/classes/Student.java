package org.generation.classes;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.generation.exceptions.StudentNotFoundException;

public class Student
{
    private String name;

    private String id;
    private static int total=0;

    private int age;

	private final List<Course> courseList = new ArrayList<>();

    public Student( String name, String id, int age)
    {
        this.name = name;
        this.id = id;
        this.age = age;
      
    }
    

	public String getName() {
		return name;
	}

	public void setName(String name) throws StudentNotFoundException {
		this.name = null;
		if(name != null) {
			this.name=name;
		}else {
			throw new StudentNotFoundException();
		}
	}//setName

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}


	public String getId() {
		return id;
	}

	public static int getTotal() {
		return total;
	}

	public List<Course> getCourseList() {
		return courseList;
	}


	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", age=" + age + ", courseList=" + courseList + "]";
	}
}

