# headFirst
Projects and exercises using Head First Java 2nd Edition

Just a location for me to keep code from the exercises in the book

I might move the chapter 14 Quiz Card exercises into its own repo...

Known Issues
Chapter 14 - Quiz Card Builder creates a blank card when you save the deck. This causes an exception to be thrown when loading the deck
into the Quiz Card Player.

*Fixed* Removed the code in the Save ActionListener that creates a blank card. This might also be a UX process issue because I click 'Next Card' before going into the File Menu and saving my deck.

Chapter 14 - Quiz Card Player throws an 'IndexOutOfBoundsException' if you open a susequent deck.
