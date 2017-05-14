package com.lesson02;

public class MainClass {

    public static void main(String[] args) {
        User user = new User("Vasya", "Ivanov", 25, Role.USER);
        User admin = new User("Alex", "Alexandrov", 25, Role.ADMIN);
        User superUser = new User("Igor", "Petrov", 25, Role.SUPER_USER);

        user.findPermission();
        admin.findPermission();
        superUser.findPermission();
    }
}
