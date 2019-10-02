package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here


        Scanner input = new Scanner(System.in);
        Random rand= new Random();

        System.out.println("How many students would you like to add?");
        int num = input.nextInt();

        Student[] students= new Student[num];
//        students[0]=

        System.out.println("Enter your " + num + " here: ");
        input.nextLine();
        for (int i = 0; i < students.length; i++) {
            students[i]= getStudent(input);

        }

        printArray(students);

    }
    public static Student getStudent(Scanner input){
        Student student=new Student(); //creating an object of the Student class
        System.out.println("Whats student name? ");
        String name=input.nextLine();
        student.setName(name);
//        students[0]=name;
        System.out.println("What's the student ID num");
        int id=input.nextInt();
        student.setStudentid(id);
//        students[1]=String.valueOf(id);
        input.nextLine();
        System.out.println("What's the student major: ");
        String major=input.nextLine();
        student.setMajor(major);
//        students[2]=major;
        System.out.println("What's the student department: ");
        String dept=input.nextLine();
        student.setDepartment(dept);
//        students[3]=dept;
        return student;
    }

    public static void printArray(Student[] display) {
//        int num = display.length;
        System.out.print("The numbers you entered are: ");

        for (int i = 0; i < display.length; i++) {

            System.out.print("\nName: "+display[i].getName() + "\nID Number:  "+display[i].getStudentid()+ "\nMajor: "+display[i].getMajor()+ "\nDepartment: "+ display[i].getDepartment());
        }

    }
}


























//        Scanner input = new Scanner(System.in);
//
//        //allow user  input;
//        System.out.println("How many numbers do you want to enter?");
//        int num = input.nextInt();
//
//        int array[] = new int[num];
//
//        System.out.println("Enter the " + num + " numbers now.");
//
//        for (int i = 0 ; i < array.length; i++ ) {
//            array[i] = input.nextInt();
//        }
//
//        //you notice that now the elements have been stored in the array .. array[]
//
//        System.out.println("These are the numbers you have entered.");
//        printArray(array);
//
//        input.close();
//
//    }
//
//    //this method prints the elements in an array......
//    //if this case is true, then that's enough to prove to you that the user input has  //been stored in an array!!!!!!!
//    public static void printArray(int arr[]){
//
//        int n = arr.length;
//
//        for (int i = 0; i < n; i++) {
//            System.out.print(arr[i] + " ");
////        }
//    }
//
//}