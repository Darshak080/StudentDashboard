package com.example.dashboard;

public class Student {

    private String name;
    private int image;
    private String rollNumber;
    private int age;
    private String mobileNumber;
    private String emailAddress;
    private String className;
    private String city;

    public Student(String name, int image, String rollNumber, int age, String mobileNumber, String emailAddress, String className, String city) {
        this.name = name;
        this.image = image;
        this.rollNumber = rollNumber;
        this.age = age;
        this.mobileNumber = mobileNumber;
        this.emailAddress = emailAddress;
        this.className = className;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
