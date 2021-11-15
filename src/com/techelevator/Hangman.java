package com.techelevator;

import java.util.Random;
import java.util.Scanner;

//Everything works really well, BUT
//If you enter 'Y' on play again, you can get caught in an infinite loop

public class Hangman {

    private static final String[] words = {"banana", "boulder", "forest", "toxic", "decompose", "planet ", "scientist", "special",
            "antidisestablishmentarianism", "cheesecake", "array", "challenge", "birthday", "wombat", "java", "radio", "head",
            "peanut", "obstreperous", "dog", "kitten", "ravioli", "vitamin", "alien", "surfer", "guitar", "fancy", "rodeo",
            "dramatic", "mysterious", "obscene", "shaggy", "glistening", "cushion", "murky", "halloween", "spooky", "done"};
    private static final Random random = new Random();
    private static final String randomWord = words[random.nextInt(words.length)];
    private static String hiddenWord = new String(randomWord.toCharArray()).replaceAll(".","*");
    private static int numGuess = 0;
    private static final Scanner scanner = new Scanner(System.in);



    public static void main(String[] args) {

            System.out.println("");
            System.out.println(" ***********************");
            System.out.println(" * Welcome to Hangman! *");
            System.out.println(" ***********************");
            System.out.println("");
            System.out.println(" |                    |");
            System.out.println("\\|/ Here's your word \\|/");
            System.out.println(" V (hidden of course) V");
            System.out.println("");

            while (numGuess < 6 ) {
                System.out.println("");
                System.out.println(hiddenWord);
                System.out.print("Guess a letter: ");

                String guess = scanner.next().toLowerCase();
                game(guess);
                }
            }


   public static void game(String guess) {

       String updatedRandom = "";

       for (int i = 0; i < randomWord.length(); i++) {
           if (randomWord.charAt(i) == guess.charAt(0)) {
               updatedRandom += guess.charAt(0);
           } else if (hiddenWord.charAt(i) != '*') {
               updatedRandom += randomWord.charAt(i);
           } else {
               updatedRandom += "*";
           }
       }
       if (hiddenWord.equals(updatedRandom)) {
           numGuess++;
           drawHang();
       } else {
           hiddenWord = updatedRandom;
       }
       if (hiddenWord.equals(randomWord)) {
           System.out.println("");
           System.out.println("You got it!");
           System.out.println("Your word was:");
           System.out.println("(¯`·._.·(¯`·._.· " + randomWord +" ·._.·´¯)·._.·´¯)");
           scanner.close();
           System.exit(0);
       }
   }


    public static void drawHang(){

        if (numGuess == 1) {
            System.out.println("");
            System.out.println("No dice. Try again, please.");
            System.out.println(" ____________");
            System.out.println(" |         _|_");
            System.out.println(" |        /   \\");
            System.out.println(" |        \\_ _/ ");
            System.out.println(" |           ");
            System.out.println(" |           ");
            System.out.println(" |           ");
            System.out.println(" |           ");
            System.out.println(" |           ");
            System.out.println("_|_");
        }
        if (numGuess ==2) {
            System.out.println("");
            System.out.println("Oh noooo. That's another one wrong. Give it another go.");
            System.out.println(" ____________");
            System.out.println(" |         _|_");
            System.out.println(" |        /   \\");
            System.out.println(" |        \\_ _/ ");
            System.out.println(" |          |");
            System.out.println(" |          |");
            System.out.println(" |          |");
            System.out.println(" |           ");
            System.out.println(" |           ");
            System.out.println("_|_");
        }
        if (numGuess == 3) {
            System.out.println("");
            System.out.println("Incorrect, but our little stick friend still has a chance. Hit me with another guess.");
            System.out.println(" ____________");
            System.out.println(" |         _|_");
            System.out.println(" |        /   \\");
            System.out.println(" |        \\_ _/ ");
            System.out.println(" |          |");
            System.out.println(" |          |");
            System.out.println(" |          |");
            System.out.println(" |         / ");
            System.out.println(" |        /   ");
            System.out.println("_|_");
        }

        if (numGuess == 4) {
            System.out.println("");
            System.out.println("Ok, ok, the odds are stacked against you at this point, but that shouldn't keep you from trying again.");
            System.out.println(" ____________");
            System.out.println(" |         _|_");
            System.out.println(" |        /   \\");
            System.out.println(" |        \\_ _/ ");
            System.out.println(" |          |");
            System.out.println(" |          |");
            System.out.println(" |          |");
            System.out.println(" |         / \\");
            System.out.println(" |        /   \\");
            System.out.println("_|_");
        }

        if (numGuess == 5) {
            System.out.println("");
            System.out.println("Oof. You're just not very good at this, are you? One more chance before Mr. Stickman dies due to your incompetence.");
            System.out.println(" ____________");
            System.out.println(" |         _|_");
            System.out.println(" |        /   \\");
            System.out.println(" |        \\_ _/ ");
            System.out.println(" |         /|");
            System.out.println(" |        / |");
            System.out.println(" |          |");
            System.out.println(" |         / \\");
            System.out.println(" |        /   \\");
            System.out.println("_|_");
        }

        if (numGuess ==6) {
            System.out.println("");
            System.out.println("This stick dude died for you. Hope you're happy.");
            System.out.println(" ____________");
            System.out.println(" |         _|_");
            System.out.println(" |        /X X\\");
            System.out.println(" |        \\_u_/ ");
            System.out.println(" |         /|\\");
            System.out.println(" |        / | \\");
            System.out.println(" |          |");
            System.out.println(" |         / \\");
            System.out.println(" |        /   \\");
            System.out.println("_|_");
            System.out.println("");
            System.out.println("GAME OVER LOSER");
            System.out.println("Your word was:");
            System.out.println("(¯`·._.·(¯`·._.· " + randomWord +" ·._.·´¯)·._.·´¯)");

            scanner.close();
            System.exit(0);
        }
    }
}
