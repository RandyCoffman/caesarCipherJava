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
            case "encrypt": case "e":
                newMessage.encrypt(message,shiftNum);
                break;
            case "decrypt": case "d":
                newMessage.decrypt(message,shiftNum);
                break;
            default:
                System.out.println("invalid input!");
                main(null);
        }
        System.out.println("Do you want to do another message?");
        String redoChoice = sc.nextLine();
        switch(redoChoice.toLowerCase()) {
            case "yes": case "y":
                main(null);
                break;
            default:
                System.exit(0);
        }
    }
}
