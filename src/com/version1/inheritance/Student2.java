package com.version1.inheritance;

public class Student2 extends Student1{

    public int roll;
    public String name;

    public Student2() {
        super();
        System.out.println("this is from student 2");
    }

    public String semester;

    // Method Overloading
    // How to do method overloading
        // 1. size of parameter
        // 2. type of parameter

    public int sum(int a, int b, int c){
        return a+b+c*2;
    }

    public String showStudentDetails(float a){
        return "from student 2";
    }

    public int showStudentDetails(float name, float b){

        return 2;
    }
}
