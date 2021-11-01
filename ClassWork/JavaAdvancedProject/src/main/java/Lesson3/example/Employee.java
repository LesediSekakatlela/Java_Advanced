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
public class Employee {
    private String name;
    private int Id;
    private String Email;
    private int phoneNumber;

    public Employee(String name, int Id, String Email, int phoneNumber) {
        this.name = name;
        this.Id = Id;
        this.Email = Email;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    public void printEmployee() {
        System.out.println("Employee Name: " + getName());
        System.out.println("Employee ID: " + getId());
        System.out.println("Employee Email: " + getEmail());
        System.out.println("Employee PhoneNumber: " + getPhoneNumber() + "\n");
    }
}
