package com.lesson02;

public class User {

    private String name;

    private String surname;

    private int age;

    private Role role;

    public User(String name, String surname, int age, Role role) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.role = role;
    }

    public void findPermission() {
        switch (getRole()) {
            case USER:
                System.out.println("this user have permission of USER");
                break;
            case ADMIN:
                System.out.println("This user have permission of ADMIN");
                break;
            case SUPER_USER:
                System.out.println("This user have permission of SUPER_USER");
                break;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
