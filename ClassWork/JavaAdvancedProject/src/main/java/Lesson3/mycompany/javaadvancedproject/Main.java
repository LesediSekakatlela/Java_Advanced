/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson3.mycompany.javaadvancedproject;
import Lesson3.example.Admin;
import Lesson3.example.Employee;
import Lesson3.example.Manager;
/**
 *
 * @author admin
 */
public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager("John", 950301, "john@gmail.com", 01235647);
        Admin admin = new Admin("Heino", 210563, "h@gmail.com", 0456453);
        
        
        manager.printEmployee();
        admin.printEmployee();
        System.out.println();
    }
}
