package com.divya.GuesserGame;

import java.util.Scanner;

class LowException extends Exception{
	LowException(String msg)
	{
		super(msg);
	}
}
class HighException extends Exception{
	HighException(String msg)
	{
		super(msg);
	}
}

//-------------------------------------------------------------------------------------

class GuesserA
{
	int guessNum;
	public int guessNumber()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Guesser, kindly guess the number ");
		guessNum = sc.nextInt();
		return guessNum;
	}
}

//----------------------------------------------------------------------------------------

class PlayerA{
	int pGuessNum;
	String pName = "Divya Prakash";
	
	
	public int pGuessNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.println(pName +"  kindly guess the number");
		pGuessNum = sc.nextInt();
		return pGuessNum;
	}
}

//----------------------------------------------------------------------------------------

class UmpireA{
	int numFromGuesser;
	int numFromPlayer;
	
	public void collectNumFromGuesser()
	{
		Guesser g = new Guesser();
		numFromGuesser = g.guessNumber();
	}
	public void collectNumFromPlayer()
	{
		Player p = new Player();
		numFromPlayer = p.pGuessNumber();
	}
	
	public void compare() throws Exception
	{
			if(numFromPlayer == numFromGuesser)
			{
				System.out.println("You won the match.");
			}
			else if(numFromPlayer > numFromGuesser)
			{
				throw new HighException("Too high");
			}
			else
			{
				throw new LowException("Too low");
			}
			
	}
}

//----------------------------------------------------------------------------------


class testApp{
	public void initiate()
	{
		UmpireA u = new UmpireA();
		u.collectNumFromGuesser();
		try {
			u.collectNumFromPlayer();
			u.compare();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			try {
				u.collectNumFromPlayer();
				u.compare();
			}catch(Exception f) {
				System.out.println(f.getMessage());
				try {
					u.collectNumFromPlayer();
					u.compare();
				}catch(Exception g) {
					System.out.println(g.getMessage());
					try {
						u.collectNumFromPlayer();
						u.compare();
					}catch(Exception h) {
						System.out.println(h.getMessage());
						try {
							u.collectNumFromPlayer();
							u.compare();
						}catch(Exception i) {
							System.out.println(i.getMessage());
							System.out.println("You lost the match");
						}
					}
				}
			}
		}
		finally {
			System.out.println("Thank you for using my application");
			
		}
		
	}
}

//---------------------------------------------------------------------------------------

public class GuessTheGameAnother {

	public static void main(String[] args) throws Exception {
		
		testApp ta = new testApp();
		ta.initiate();
		

				
		
	}

}
