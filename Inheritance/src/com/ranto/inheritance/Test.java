package com.ranto.inheritance;

public class Test {
    public static void main(String[] args) {
        String[] projects = new String[]{"Flight Reservation", "Check In"};
        Manager manager = new Manager(1, "John", "Travel", 100000, projects);
        System.out.println(manager.id);
        System.out.println(manager.name);
        System.out.println(manager.dept);
        System.out.println(manager.salary);
        manager.work();

        Developer developer = new Developer(1, "Nhoj", "Travel", 200000, "Full Stack Java Developer");
        developer.work();
    }
}
