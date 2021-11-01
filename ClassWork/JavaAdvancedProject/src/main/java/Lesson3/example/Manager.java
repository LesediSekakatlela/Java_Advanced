/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson3.example;

/**
 *
 * @author admin
 */
public class Manager extends Employee{
    private String departmentName;
    
    public Manager(String name, int Id, String Email, int phoneNumber) {
        super(name,Id, Email, phoneNumber);
        this.departmentName = departmentName;
    }

    public String getDepartmentName() {
        return departmentName;
    }
    
    
}
