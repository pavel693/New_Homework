package com.reflection;

import com.entity.Company;
import com.entity.Person;
import com.entity.User;
import java.lang.reflect.Field;

public class ReflectionMain {

    public static void main(String[] args) throws IllegalAccessException {
        Company company = new Company("New Company");
        User user = new User("Java", 15, company);
        Person person = new Person();

        ReflectionMain reflectionMain = new ReflectionMain();
        reflectionMain.mapping(user, person);

        System.out.println(person);
    }

    public Object mapping(Object first, Object second) throws IllegalAccessException {
        Field[] firstFields = first.getClass().getDeclaredFields();
        Field[] secondFields = second.getClass().getDeclaredFields();
        for (Field firstField : firstFields) {
            for (Field secondField : secondFields) {
                if (firstField.getType() == secondField.getType()) {
                    firstField.setAccessible(true);
                    secondField.setAccessible(true);
                    secondField.set(second, firstField.get(first));
                }
            }
        }
        return second;
    }
}














