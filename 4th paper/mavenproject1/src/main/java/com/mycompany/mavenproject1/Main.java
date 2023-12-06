/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author hp
 */
public class Main {
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("Shibli");
        p.display();

        Person s = new Student();
        s.setName("Raza");
        s.display();

        Person u = new UGStudent();
        u.setName("Ahmad");
        u.display();
        Person p2 = new Student("Asjad",112,12);
        p2.display();
        
        Person p3 =  new Person("Shibli");
        
        p2.compareto(p3);
        
    }
}
