package learn.hibernate.com.learn.hibernate;

import java.util.Scanner;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {

	@Id
	int roll;
	String name;
	double cgpa;
	int yop;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int roll, String name, double cgpa, int yop) {
		super();
		this.roll = roll;
		this.name = name;
		this.cgpa = cgpa;
		this.yop = yop;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getCgpa() {
		return cgpa;
	}
	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}
	public int getYop() {
		return yop;
	}
	public void setYop(int yop) {
		this.yop = yop;
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", cgpa=" + cgpa + ", yop=" + yop + "]";
	}
	
	

}
