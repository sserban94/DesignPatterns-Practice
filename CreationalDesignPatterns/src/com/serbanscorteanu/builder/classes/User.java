package com.serbanscorteanu.builder.classes;

public class User {
    private final String firstName; // mandatory
    private final String lastName;  // mandatory
    private final String phoneNumber;
    private final String address;
    private final String email;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public User(UserBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.address = builder.address;
        this.phoneNumber = builder.phoneNumber;
        this.email = builder.email;
    }

    public static class UserBuilder {
        private final String firstName; // mandatory
        private final String lastName;  // mandatory
        private String phoneNumber;
        private String address;
        private String email;


        public UserBuilder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public UserBuilder phoneNumber(String phoneNumber){
            this.phoneNumber = phoneNumber;
            return this;
        }

        public UserBuilder address(String address){
            this.address = address;
            return this;
        }

        public UserBuilder email(String email){
            this.email = email;
            return this;
        }

        public User build(){
            User user = new User(this);
            return user;
        }
    }
}


























