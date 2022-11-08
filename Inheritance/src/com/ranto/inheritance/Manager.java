package com.ranto.inheritance;

public class Manager extends Employee {
    String[] projects;

    public Manager(int id, String name, String dept, double salary, String[] projects) {
        super(id, name, dept, salary);
        this.projects = projects;
    }

    @Override
    protected void work() {
        super.work();
        System.out.println("Manager is managing ");
        for (String project : projects) {
            System.out.println(project);
        }
    }
}
