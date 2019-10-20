package com.randycoffman;

public class decryptMessage {
    private char alphabet;
    private String oldText = "";

    public void decrypt (String message, int shiftBy) {
        System.out.println("message is: " + message);
        System.out.println("shiftNum is: " + shiftBy);

        for(int i=0; i < message.length();i++) {
            // Shifts one character at a time
            char alphabet = message.charAt(i);
            // If alphabet is between a and z
            if(alphabet >= 'a' && alphabet <= 'z') {
                // Shifts alphabet
                alphabet = (char) (alphabet - shiftBy);
                // Shifts when alphabet is lesser than 'a'
                if(alphabet < 'a') {
                    // Shifts to 'a' again
                    alphabet = (char) (alphabet-'a'+'z'+1);
                }
                oldText = oldText + alphabet;
            } else if(alphabet >= 'A' && alphabet <= 'Z') { // If alphabet is between A and Z
                // Shifts alphabet
                alphabet = (char) (alphabet - shiftBy);
                // Shifts when alphabet is lesser than 'A'
                if (alphabet < 'A') {
                    // reshift to starting position
                    alphabet = (char) (alphabet-'A'+'Z'+1);
                }
                oldText = oldText + alphabet;
            } else {
                oldText = oldText + alphabet;
            }
        }
        System.out.println("Decrypted message: " + oldText);
    }
}