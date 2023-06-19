/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab02;

/**
 *
 * @author Admin
 */
public class Student {
    int id;
    String name;
    double cgpa;
    
    Student(){
        System.out.println("No record to show");
        
    }
     Student(int id, String name){
        this.id=id;
        this.name=name;
        
    }
    Student(int id, String name, double cgpa){
        this.id=id;
        this.name=name;
        this.cgpa=cgpa;
    }
//    void input(int id, String name, double cgpa){
//        this.id=id;
//        this.name=name;
//        this.cgpa=cgpa;
//    }
    void display(){
        System.out.println("ID="+id);
        System.out.println("Name="+name);
        System.out.println("CGPA="+cgpa);
    }
}
