package com.randycoffman;

@SuppressWarnings({"SpellCheckingInspection", "StringConcatenationInLoop"})
public class messages {

    private String newText = "";

    public void encrypt (String message, int shiftBy) {

        for(int i=0; i < message.length();i++) {
            // Shifts one character at a time
            char alphabet = message.charAt(i);

            // If alphabet lies between a and z
            if(alphabet >= 'a' && alphabet <= 'z') {
                // Shifts alphabet
                alphabet = (char) (alphabet + shiftBy);
                // If alphabet is bigger than 'z'
                if(alphabet > 'z') {
                    // Shifts to 'a' again
                    alphabet = (char) (alphabet +'a'-'z'-1);
                }
                newText = newText + alphabet;
            } else if(alphabet >= 'A' && alphabet <= 'Z') { // If alphabet lies between 'A'and 'Z'
                // Shift alphabet
                alphabet = (char) (alphabet + shiftBy);

                // If alphabet is bigger than 'Z'
                if(alphabet > 'Z') {
                    // Shifts to 'A' again
                    alphabet = (char) (alphabet +'A'-'Z'-1);
                }
                newText = newText + alphabet;
            } else {
                newText = newText + alphabet;
            }
        }
        System.out.println("Encrypted text is: " + newText);
    }

    public void decrypt (String message, int shiftBy) {

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
                newText = newText + alphabet;
            } else if(alphabet >= 'A' && alphabet <= 'Z') { // If alphabet is between A and Z
                // Shifts alphabet
                alphabet = (char) (alphabet - shiftBy);
                // Shifts when alphabet is lesser than 'A'
                if (alphabet < 'A') {
                    // Shifts to starting position
                    alphabet = (char) (alphabet-'A'+'Z'+1);
                }
                newText = newText + alphabet;
            } else {
                newText = newText + alphabet;
            }
        }
        System.out.println("Decrypted message: " + newText);
    }
}
