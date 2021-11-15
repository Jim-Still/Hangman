# Personal Side Project - Hangman Command Line App

This is a one class, purely Java exercise in having a little fun. Hangman is surprisingly complex when you start digging into it.


## Technology Used

Java (IntelliJ)


## Lessons Learned

We tackled this one in vertical slices, which I think was helpful for visualizing the flow of data whole tackling a project like this for the first time. We started with the getBalance() method, and worked our way from the database to the command line app all the way through on that one method. Once we completed that, it was easier to see how all the individual layers worked together to put the contents of the database on the user's screen.


### The Game:

1. The program selects a word at random from a String array.
2. It then hides the chosen word behind *asteriks*.
3. The user guesses a letter, one at a time.
4. If the guess is correct, the letter is revealed & the user continues.
5. If it's incorrect, our poor stickman protaganist gets a little more fleshed out, & a little closer to dead.
6. In the end, you either guess all the correct letters to the word or Mr. Stickman is left swinging in the wind. Don't let him down!


### Still To Add

A do while loop to implement a "Would You Like To Play Again? Y/N" interface
