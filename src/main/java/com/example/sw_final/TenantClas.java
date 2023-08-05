package com.example.sw_final;

public class TenantClas
{

    private String username;
    private   String password;
    private  String gender;
    private  int id;
    private  int phonenumber;
private  int age;
private  String universityMajors;


    public String getUsername() {

        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public String getGender() {
        return gender ;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getid() {
        return id;
    }

    public void setid(int id) {
        this.id = id;
    }

    public int getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(int phonenumber) {
        this.phonenumber = phonenumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getUniversityMajors() {
        return universityMajors;
    }

    public void setUniversityMajors(String universityMajors) {
        this.universityMajors = universityMajors;
    }
}
