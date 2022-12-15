package ua.hillelPro;

import ua.hillelPro.entity.User;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        User user = new User();
        user.setAge(10);
        user.setName("Nico");
        user.setSurname("NICO");
        System.out.println(user.getName());
        System.out.println(user.getSurname());
        System.out.println(user.getAge());
    }
}