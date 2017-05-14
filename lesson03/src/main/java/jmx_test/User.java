package jmx_test;

public class User implements UserMBean {

    private String name;

    private String sureName;

    private int age;

    public User(String name, String sureName, int age) {
        this.name = name;
        this.sureName = sureName;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSureName() {
        return sureName;
    }

    public void setSureName(String sureName) {
        this.sureName = sureName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void createUserDefault() {
        User user = new User("Ivan", "Ivanov", 30);
        System.out.println(user);
    }

    @Override
    public String toString() {
        return "User{" +
            "name='" + name + '\'' +
            ", sureName='" + sureName + '\'' +
            ", age='" + age + '\'' +
            '}';
    }
}
