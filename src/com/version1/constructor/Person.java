package com.version1.constructor;


/*
* structure of constructor is
*
* access_modifier constructor_name(){
*
* }
*
* 1. constructor name should be as like as class name
* 2. it don't have any return typ;
* */

public class Person {


    //Constructor

    public int aaa;
    public double b;
    public Long f;
    public float age;
    public int num;
    public Person(){
        System.out.println("this is from person constructor...");
    }

    public Person(int a){
        System.out.println("this is from parameterized constructor....");
    }

    public Person(float age){
        // while parameter name and field name are same, then we use this keyword to differentiate them.
        this.age=age;
    }


    // Method
    public void showName(){
        //System.out.println("Md Kabila");


        Student as= new Student();


        System.out.println(as.getStudentDetails());
    }


}
