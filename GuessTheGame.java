package com.divya.GuesserGame;


import java.util.Scanner;

class Guesser{
	int guessNum;
	public int guessNumber()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Guesser, kindly guess the number ");
		guessNum = sc.nextInt();
		return guessNum;
	}
}

//---------------------------------------------------------------------------------------

class Player{
	int pGuessNum;
	
	public int pGuessNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Player kindly guess the number");
		pGuessNum = sc.nextInt();
		return pGuessNum;
	}
}

//---------------------------------------------------------------------------------------

class Umpire{
	static String pName1;
	static String pName2;
	static String pName3;
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
	
	static
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st player name :-  ");
		pName1 = sc.nextLine();
		System.out.println("Enter 2nd player name :-  ");
		pName2 = sc.nextLine();
		System.out.println("Enter 3rd player name :-  ");
		pName3 = sc.nextLine();
	}
	
	public static void printName()
	{
		System.out.println("1st player Name  :-  " + pName1);
		System.out.println("2nd player Name  :-  " + pName2);
		System.out.println("3rd player Name  :-  " + pName3);
	}
	public void collectNumFromGuesser()
	{
		Guesser g = new Guesser();
		numFromGuesser = g.guessNumber();
	}
	public void collectNumFromPlayer()
	{
		Player p1 = new Player();
		Player p2 = new Player();
		Player p3 = new Player();
		numFromPlayer1 = p1.pGuessNumber();
		numFromPlayer2 = p2.pGuessNumber();
		numFromPlayer3 = p3.pGuessNumber();
	}
	
	public void compare()
	{
		if(numFromGuesser == numFromPlayer1)
		{
			if(numFromGuesser == numFromPlayer2 && numFromGuesser == numFromPlayer3) {
				System.out.println("Match Tied");
			}else if(numFromGuesser == numFromPlayer2)
			{
				System.out.println(pName1 + " and " + pName2 +" won the game");
			}
			else if(numFromGuesser == numFromPlayer3)
			{
				System.out.println(pName1 + " and " + pName3 + " won the game");
			}
			else {
				System.out.println(pName1 + " won the game");				
			}
		}
		else if(numFromGuesser == numFromPlayer2)
		{
			if(numFromGuesser == numFromPlayer3)
			{
				System.out.println(pName2 + " and " + pName3 + " won the game");
			}
			else {
				System.out.println(pName2 + " won the game");				
			}
		}
		else if(numFromGuesser == numFromPlayer3)
		{
			System.out.println(pName3 + " won the game");
		}
		else
		{
			System.out.println("Game lost ! Try again");
		}
	}
}

//---------------------------------------------------------------------------------------

public class GuessTheGame {

	public static void main(String[] args) {
		
		Umpire u = new Umpire();
		try {
			u.collectNumFromGuesser();			
			u.collectNumFromPlayer();
		}catch(Exception e)
		{
			System.out.println("Invalid input");
			System.exit(0);
		}
		u.compare();

		
		
		
		
		
		
	}

}
