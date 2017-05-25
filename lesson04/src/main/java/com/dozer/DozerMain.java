package com.dozer;

import com.entity.Company;
import com.entity.Person;
import com.entity.User;
import org.dozer.DozerBeanMapperSingletonWrapper;
import org.dozer.Mapper;

public class DozerMain {

    public static void main(String[] args) {
        Company company = new Company("New Company");
        User user = new User("Java", 15, company);

        Mapper mapper = DozerBeanMapperSingletonWrapper.getInstance();
        Person person = mapper.map(user, Person.class);

        System.out.println(user);
        System.out.println(person);
    }
}
