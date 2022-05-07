package com.serbanscorteanu.builder.main;

import com.serbanscorteanu.builder.classes.User;

public class Main {
    public static void main(String[] args) {
        User user1 = new User.UserBuilder("Serban", "Scorteanu")
                .address("Bucuresti")
                .email("serban.scorteanu@gmail.com")
                .phoneNumber("007")
                .build();

        User user2 = new User.UserBuilder("John", "Doe")
                .email("john.doe@yahoo.com")
                .build();

        System.out.println(user1);
        System.out.println();
        System.out.println(user2);
    }
}
