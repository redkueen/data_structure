package com.xqh.data_structure.hashmap_research;

public class User {
    long id;
    String username;
    String password;
    boolean sex;
    double salary;

    public User(){

    }

    public User(Long id, String username, String password, boolean sex, double salary){
        this.id = id;
        this.username = username;
        this.password = password;
        this.sex = sex;
        this.salary = salary;
    }
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

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

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
