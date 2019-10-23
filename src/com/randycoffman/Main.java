package com.randycoffman;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        messages newMessage = new messages();
        System.out.println("Input the message");
        String message = sc.nextLine();
        System.out.println("Input encryption key (1-26)");
        int shiftNum = sc.nextInt();
        sc.nextLine();
        System.out.println("Do you want to encrypt or decrypt the message?");
        String choice = sc.nextLine();
        switch(choice.toLowerCase()) {
            case "encrypt":
                newMessage.encrypt(message,shiftNum);
                break;
            case "decrypt":
                newMessage.decrypt(message,shiftNum);
                break;
            default:
                main(null);
        }
    }
}
