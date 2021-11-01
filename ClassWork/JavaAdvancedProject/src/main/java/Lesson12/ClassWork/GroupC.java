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
public class GroupC extends Students{

    private boolean attendance;
    
    public GroupC(String firstName, String lastName, int age, String email, String repositoryURL, boolean attendance) {
        super(firstName, lastName, age, email, repositoryURL);
        this.attendance = attendance;
    }

    public boolean getAttendance() {
        return attendance;
    }

    public void setAttendance(boolean attendance) {
        this.attendance = attendance;
    }
     @Override   
    public void display() {
        super.display();
        System.out.println("Attendance: " + getAttendance());
    }
    
}
