/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author hp
 */
public class Person {
     private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name) {
        this();
        this.name = name;
    }

    public Person(int age){
        this();
        this.age = age;
    }

    public Person(){
        this.name = "Default";
        this.age = -1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void compareto(Person p){
        if((this.name).compareTo(p.name) == 1){
            System.out.println("1st is greater!!!!!");
        }
        else{
            System.out.println("2nd is greater!!!!!!!!!!1");
        }
    }

    public void display(){
        System.out.println("Name is " + this.getName() +"\nAge is " + this.getAge());
    }
}
