// a program to that simulates a multiple question trivia game
package game;

import java.util.*;
// creation class with class name called Game its method called gamestart with static keyword 
public class Game {
	static void gamestart() {
		System.out.println("WELCOME TO TRIVIA GAME"); // line statement welcoming user to play a game
		System.out.println("GAME INSTRUCTION\n");
		System.out.println("In this game computer is gonna present you a questions with five multiple answers if\n"
				+ "you choose right answer computer break the code and notify you correct answer if \nyou choose wrong answer"
				+ "computer will inform you incorrect answer if you want to \nplay again you will type yes and computer present you"
				+ " another question with also five\nmultiple answers and chose one of them, if you want to quit you will type no");
		System.out.println("\n");
		System.out.println("Welcome again, quiz has started");
		// start of the timing with variable name start with long datatype
		long start = System.currentTimeMillis();
		// collection of questions by array initialisation with array name called questions that allocates the questions
		String[] questions = {"When was the first computer invented\n", "Who is known as the father of computers?\n", "When was the first 1 GB disk drive released in the world?\n","What was the name of the first IBM computer?\n","What type of application are availabe with a source code to modify and add features to it?\n"};
		// Accessing the each questions into questions Array name by its index
		System.out.println(questions[0]);
		// printing multiple answers
		System.out.println("1. 1943\n2. 1940\n3. 1980\n4. 1975\n5. 1999\n");
		// using scanner package to get input from user
		Scanner obj = new Scanner(System.in);
		{
			// statement inform user to choose answer from multiple choices given
		System.out.println("choose the answer from the above multiple choices");
		// creation of response variable to store the answer entered by user
		int response = obj.nextInt();
		// if condition to check if user whether input 1 or not if its 1 compiler immediately print correct answer, if it's not 1 print incorrect answer
		if (response == 1)
		{
			System.out.println("correct answer");
		}
		else
		{
			System.out.println("incorrect answer");
		}
		// end of the timing with variable name end with long datatype
		long end = System.currentTimeMillis();
	       System.out.println("Time taken to answer this question in seconds is: " + (end - start)/1000 + " s");
		}
		System.out.println("Do you want to play again");
		System.out.println("1. yes , 2. no");
		// reusing of obj as object name of scanner to let user input his/her choice
		obj = new Scanner(System.in);
		// creation of choice variable to store the answer entered by user
		int choice = obj.nextInt();
		// if condition to check whether user has chosen 1 for yes or 2 for no, if user has chosen 1 other question will be presented to him/her directly, if s(he) has chosen 2 computer will stop presenting him a question, will prompt him a statement thank you for playing, see you
		if (choice == 1) {
			long a = System.currentTimeMillis();
			//printing next question using its index
			System.out.println(questions[1]);
			// printing multiple answers
			System.out.println("1. Patchu Patrick\n2. Charles Babbage\n3. Kc claude\n4. MN clever\n5. Sam sameel\n");
			// reusing of obj as object name of scanner to let user input his/her answer
			obj = new Scanner(System.in);
			{
			System.out.println("choose the answer from the above multiple choices");
			int response = obj.nextInt();
			// if condition to check if user whether input 4 or not if its 4 compiler immediately print correct answer, if it's not 4 print incorrect answer
			if (response == 2)
			{
				System.out.println("correct answer");
			}
			else
			{
				System.out.println("incorrect answer");
				}
			long end = System.currentTimeMillis();
		       System.out.println("Time taken to answer this question in seconds is: " + (end - a)/1000 + " s");
			}
			}
		else {
			System.out.println("Thank you for playing, see you");
			System.exit(0);
		}
		System.out.println("Do you want to play again");
		System.out.println("1. yes , 2. no");
		// reusing of obj as object name of scanner to let user input his/her choice
		obj = new Scanner(System.in);
		// creation of choice variable to store the answer entered by user
		int chc = obj.nextInt();
		// if condition to check whether user has chosen 1 for yes or 2 for no, if user has chosen 1 other question will be presented to him/her directly, if s(he) has chosen 2 computer will stop presenting him a question, will prompt him a statement thank you for playing, see you
		if (chc == 1) {
			long a = System.currentTimeMillis();
			//printing next question using its index
			System.out.println(questions[2]);
			// printing multiple answers
			System.out.println("1. 1943\n2. 1920\n3. 1980\n4. 1965\n5. 1982\n");
			// reusing of obj as object name of scanner to let user input his/her answer
			obj = new Scanner(System.in);
			{
			System.out.println("choose the answer from the above multiple choices");
			int response = obj.nextInt();
			// if condition to check if user whether input 4 or not if its 4 compiler immediately print correct answer, if it's not 4 print incorrect answer
			if (response == 3)
			{
				System.out.println("correct answer");
			}
			else
			{
				System.out.println("incorrect answer");
				}
			long end = System.currentTimeMillis();
		       System.out.println("Time taken to answer this question in seconds is: " + (end - a)/1000 + " s");
			}
			}
			else {
				System.out.println("Thank you for playing, see you");
				System.exit(0);
			}
		System.out.println("Do you want to play again");
		System.out.println("1. yes , 2. no");
		// reusing of obj as object name of scanner to let user input his/her choice
		obj = new Scanner(System.in);
		// creation of choice variable to store the answer entered by user
		int ch = obj.nextInt();
		// if condition to check whether user has chosen 1 for yes or 2 for no, if user has chosen 1 other question will be presented to him/her directly, if s(he) has chosen 2 computer will stop presenting him a question, will prompt him a statement thank you for playing, see you
		if (ch == 1) {
			long strt = System.currentTimeMillis();
			//printing next question using its index
			System.out.println(questions[3]);
			// printing multiple answers
			System.out.println("1. IBM2 150\n2. IBM\n3. IBM5 120\n4. IBM5 150\n5. IBM5 123\n");
			// reusing of obj as object name of scanner to let user input his/her answer
			obj = new Scanner(System.in);
			{
			System.out.println("choose the answer from the above multiple choices");
			int response = obj.nextInt();
			// if condition to check if user whether input 4 or not if its 4 compiler immediately print correct answer, if it's not 4 print incorrect answer
			if (response == 4)
			{
				System.out.println("correct answer");
			}
			else
			{
				System.out.println("incorrect answer");
				}
			long end = System.currentTimeMillis();
		       System.out.println("Time taken to answer this question in seconds is: " + (end - strt)/1000 + " s");
			}
			}
			else {
				System.out.println("Thank you for playing, see you");
				System.exit(0);
			}
		System.out.println("Do you want to play again");
		System.out.println("1. yes , 2. no");
		// reusing of obj as object name of scanner to let user input his/her choice
		obj = new Scanner(System.in);
		// creation of choice variable to store the answer entered by user
		int chs = obj.nextInt();
		// if condition to check whether user has chosen 1 for yes or 2 for no, if user has chosen 1 other question will be presented to him/her directly, if s(he) has chosen 2 computer will stop presenting him a question, will prompt him a statement thank you for playing, see you
		if (chs == 1) {
			long strt = System.currentTimeMillis();
			//printing next question using its index
			System.out.println(questions[3]);
			// printing multiple answers
			System.out.println("1. off-the shelf software\n2. free Ware\n3. Share Ware\n4. Bespoke Software\n5. Opensource application\n");
			// reusing of obj as object name of scanner to let user input his/her answer
			obj = new Scanner(System.in);
			{
			System.out.println("choose the answer from the above multiple choices");
			int response = obj.nextInt();
			// if condition to check if user whether input 4 or not if its 4 compiler immediately print correct answer, if it's not 4 print incorrect answer
			if (response == 5)
			{
				System.out.println("correct answer");
			}
			else
			{
				System.out.println("incorrect answer");
				}
			long end = System.currentTimeMillis();
		       System.out.println("Time taken to answer this question in seconds is: " + (end - strt)/1000 + " s");
			}
			}
			else {
				System.out.println("Thank you for playing, see you");
			}
		}
	// Main method
	public static void main(String[] args) {	
		gamestart();// method calling
	}
}
