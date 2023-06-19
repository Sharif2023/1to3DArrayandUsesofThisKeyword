/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab02;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Test {

    public static void main(String[] args) {
       
        Scanner input=new Scanner(System.in);
        System.out.println("Enter id,name and cgpa:");
        int a=input.nextInt();
        input.nextLine();
        String b=input.nextLine();
        double c=input.nextDouble();
         Student s1 = new Student(101,"A",3.5);
       // s1.input(a,b,c);
        s1.display();

        Student s2 = new Student(102,"B");
       // s2.input(102, "B", 3.52);
        s2.display();
        Student s3 = new Student();
       // s2.input(102, "B", 3.52);
        //s3.display();

    }
}
