B STREET CASINO INSTRUCTION MANUAL

--- 
Overview:

The Casino class has the program’s main method. Games within the casino are implemented as various game objects. This permits overall adaptability as new games are added to the casino.

The Deck class, which makes use of Card and Ace objects, can be used in the implementation of different card games. As new games are added, the Hand (i.e. the player) and Dealer objects can be treated as parent classes that extend to the specific needs of whatever game they’re being used for.

Currently, the following games are offered:
     
     - Blackjack
        Includes heuristic auto play algorithm that optimizes the dealer’s score

---

When one starts up the program, they will see the following casino home screen text:

      Welcome to B Street Casino, now with these games: 
       - Blackjack

Type a game name to play OR "quit" to exit.

At this point, the user has entered the casino. The user can do one of two things: type “[game name]”.” into the console, or “quit” to stop the program. At any point in the program, if the user inputs an invalid command, the console will print 

  
    Please enter a valid input

and prompt the user to enter another command. Additionally, commands can be validly entered with miscapitalization (i.e. “blACkjACK”).

Once the user enters a game (namely, Blackjack), the following text is printed to the console:


    Welcome to Blackjack! The Rules:
	    - Type “hand" to see your cards. 
	    - Type "val" for a numeric value of your hand.
        - Aces are initially valued at 1. You can toggle the value of an ace between 1 and 11 with the  
          command "ace".
	    - You can either "hit" to get another card, or "stay" to end your turn.

The user is then given the opportunity to initiate a new game of Blackjack or exit the Blackjack game with the following text:


    Type "new game" or "quit".

If the user enters “quit,” the user is then taken back to the casino home screen. If the user enters “new game,” Blackjack begins.

Before the user has an opportunity to play, the program executes an algorithm that optimizes the dealer’s hand. First, it is given two cards. Following typical casino rules, if the sum of the cards is below 17, the dealer hits. If it is above that value, the dealer stays. For the dealer, aces are always worth 1 unless the dealer gets Blackjack (an ace and a face card), in which case his hand is valued at 21.

The game starts with the user receiving two cards:

    The dealer has dealt you two cards: 3 club, 2 heart

The user then has the following command options, which will be illustrated with the above example:
    - hand: Prints each card in the user’s hand
            3 club, 2 heart
     - val: Prints a number value for the user’s hand
            5
    - hit: Adds another card to the user’s hand
            7 heart added to hand
    - stay: Ends the game. 
    
The program then determines whether the user or the dealer won. The following results may show up on the console.

    1. Dealer's Hand: [see hand], valued at [hand value]
       Your hand: [see hand], valued at [hand value more than dealer]
			
       You beat the house! Congratulations!
    
    2. Dealer's Hand: [see hand], valued at [hand value]
       Your hand: [see hand], valued at [hand value less than dealer]

       Dealer wins!
    
    3. Dealer's Hand: [see hand], valued at [hand value]
       Your hand: [see hand], valued at [hand value equal to dealer]

       It's a tie!
    
    4. Hand value: [hand value]. You busted -- you lose!

    5. Dealer's Hand: [see hand, valued at [busting value]
       Your hand: [see hand], valued at [hand value]

       Dealer busted -- you win!
    
    
If at any point in the program the user busts, the game ends and the following prints to the console:

    Hand value: [hand value]. You busted -- you lose!

Aces are a special card in Blackjack, and can have both the value of 1 or 11. In this program, they are initially valued at 1. Users can use the “ace” command to toggle the value of an ace. For each ace a user has in their hand, the following flow of commands will occur:

    ace
    Ace of [suit] valued at: [initial value]
    Change value? "confirm" or type "no"

If the user enters “confirm,” the following will be printed to the text console

    Ace of [suit] now valued at: [new value]

If “no,” then 

    Ace of [suit] valued at: [initial value]

will be printed. If an ace was just added to the user’s hand, initial value is 1, and the new value would be 11. After that point, initial value is whatever the user has set the ace to, and new value is just the opposite of initial value.

After the game, the program offers the following text to the user:

    Play again? Type "new game" or "quit"

At this point, the user can initiate another game of Blackjack or quit back to the casino home screen.
