package jmx_test;

public interface UserMBean {

    public String getName();

    public void setName(String name);

    public String getSureName();

    public void setSureName(String sureName);

    public int getAge();

    public void setAge(int age);

    public void createUserDefault();

    @Override
    public String toString();
}
