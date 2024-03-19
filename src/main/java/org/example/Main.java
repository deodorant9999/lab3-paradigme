package org.example;

import ro.ulbs.paradigme.lab3.util.PasswordMaker;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        PasswordMaker passwordMaker = null;
        passwordMaker= PasswordMaker.getInstance("bogdan");
        String password;
        if(passwordMaker!=null) {
            password = passwordMaker.generatePassword();
            System.out.println(password);
        }
    }
}