package com.company;
/*Enter the variables for a students name, studentid, major, department in a class room. Once variables are declared, use Encapsulation (getters and setters)
to allow other classes to gain access to the variables set in this class*/

public class Student {

    private String name;
    private int studentid;
    private String major;
    private String department;

    public Student() {
    }

    public Student(String name, int studentid, String major, String department) {
        this.name = name;
        this.studentid = studentid;
        this.major = major;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentid() {
        return studentid;
    }

    public void setStudentid(int studentid) {
        this.studentid = studentid;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
