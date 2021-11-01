/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson12.ClassWork;

/**
 *
 * @author admin
 */
public class Main {
    public static void main(String[] args) {
        Students std1 = new GroupC( "Jack", "Walker", 21, "jack@gmail.com", "jack@gmail.com",true);
        Students std2 = new GroupC( "Heino", "Du Plessie", 26, "heino@gmail.com", "heino@gmail.com",false);
        Students std3 = new GroupC( "Moabi", "Litsoane", 21, "moabi@gmail.com", "moabi@gmail.com",true);
        Students std4= new GroupC( "Paul", "Black", 30, "p@gmail.com", "paul@gmail.com",true);
        
        if (std2 instanceof GroupC) {
            ((GroupC)std2).setAttendance(true);
        }
        
        Students[] theStudents = {std1, std2, std3, std4};
        for (Students std : theStudents) {
            std.display();
            System.out.println("\n");
        }
    }
}
