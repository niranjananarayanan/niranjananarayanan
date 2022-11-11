import java.util.*;

class Guesser
{
	int guessNum;
	
	int guessNum()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Guesser kindly give a number to guess");
		guessNum=scan.nextInt();
		System.out.println();
		return guessNum;
	}	
}

class Player
{
	int guessNum;
	
	int guessNum()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Player please Enter the Number");
		guessNum=scan.nextInt();
		return guessNum;
	}
}

class Umpire
{
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
	
	void collectNumFromGuesser()
	{
		Guesser g=new Guesser();
		numFromGuesser=g.guessNum();
	}
	void collectNumFromPlayers()
	{
		Player p1=new Player();
		Player p2=new Player();
		Player p3=new Player();
		numFromPlayer1=p1.guessNum();
		numFromPlayer2=p2.guessNum();
		numFromPlayer3=p3.guessNum();
	}
	void compare()
	{
		int trials=3;
		while(trials>=1)
		{
			if(numFromGuesser==numFromPlayer1)
			{
				if(numFromGuesser==numFromPlayer2 && numFromGuesser==numFromPlayer3)
				{
					System.out.println("All players won the game");
					break;
				}
				else if(numFromGuesser==numFromPlayer2)
				{
					System.out.println();
					System.out.println("Player 1 & Player2 won");
					System.out.println();
					if(--trials!=0)
					{
						System.out.println();
						System.out.println("Player 3 "+ trials+" attempt");
						if(numFromPlayer3<numFromGuesser)
							System.out.println("Player 3 kindly guess higher than "+ numFromPlayer3+ " lower than or equal to 9" );
						else
							System.out.println("Player 3 kindly guess lower than "+ numFromPlayer3+ " higher than or equal to 0" );
						Player sp3=new Player();
						numFromPlayer3=sp3.guessNum();
					}
					else if(trials==0)
					{
						System.out.println("Attempts exhauseted!" );
						System.out.println();
						System.out.println("Congratulations Winners!");
						System.out.println();
						System.out.println("You can now Start a Fresh name!");
					}
					continue;
				}
				else if(numFromGuesser==numFromPlayer3)
				{
					System.out.println();
					System.out.println("Player 1 & Player3 won");
					System.out.println();
					if(--trials!=0)
					{
						System.out.println("Player 2  have "+ trials+" attempt");
						if(numFromPlayer2<numFromGuesser)
							System.out.println("Player 2 kindly guess higher than "+ numFromPlayer2+ " lower than or equal to 9" );
						else
							System.out.println("Player 2 kindly guess lower than "+ numFromPlayer2+ " higher than or equal to 0" );
						Player sp2=new Player();
						numFromPlayer2=sp2.guessNum();
					}
					else if(trials==0)
					{
						System.out.println("Attempts exhauseted!" );
						System.out.println();
						System.out.println("Congratulations Winners!");
						System.out.println();
						System.out.println("You can now Start a Fresh name!");
					}
					continue;
				}
				else
				{
					System.out.println();
					System.out.println("Player 1 won the game");
					System.out.println();
					if(--trials!=0)
					{
						System.out.println("Player 2 & Player3 have "+ trials+" attempt");
						if(numFromPlayer2<numFromGuesser)
							System.out.println("Player 2 kindly guess higher than "+ numFromPlayer2+ " lower than or equal to 9" );
						else
							System.out.println("Player 2 kindly guess lower than "+ numFromPlayer2+ " higher than or equal to 0" );
						Player sp2=new Player();
						numFromPlayer2=sp2.guessNum();
						if(numFromPlayer3<numFromGuesser)
							System.out.println("Player 3 kindly guess higher than "+ numFromPlayer3+ " lower than or equal to 9" );
						else
							System.out.println("Player 3 kindly guess lower than "+ numFromPlayer3+ " higher than or equal to 0" );
						Player sp3=new Player();
						numFromPlayer3=sp3.guessNum();
					}
					else if(trials==0)
					{
						System.out.println("Attempts exhauseted!" );
						System.out.println();
						System.out.println("Congratulations Winners!");
						System.out.println();
						System.out.println("You can now Start a Fresh name!");
					}
					continue;
				}
			}
			else if(numFromGuesser==numFromPlayer2)
			{
				if(numFromGuesser==numFromPlayer3)
				{
					System.out.println();
					System.out.println("Player 2 & Player3 won");
					System.out.println();
					if(--trials!=0)
					{
						System.out.println("Player 1 "+ trials+" attempt");
						if(numFromPlayer1<numFromGuesser)
							System.out.println("Player 1 kindly guess higher than "+ numFromPlayer1+ " lower than or equal to 9" );
						else
							System.out.println("Player 1 kindly guess lower than "+ numFromPlayer1+ " higher than or equal to 0" );
						Player sp1=new Player();
							numFromPlayer1=sp1.guessNum();
					}
					else if(trials==0)
					{
						System.out.println("Attempts exhauseted!" );
						System.out.println();
						System.out.println("Congratulations Winners!");
						System.out.println();
						System.out.println("You can now Start a Fresh name!");
					}
							continue;
				}
				else if(numFromGuesser==numFromPlayer1)
				{
					System.out.println();
					System.out.println("Player 2 & Player 1 won");
					System.out.println();
					if(--trials!=0)
					{
						System.out.println("Player 3 "+ trials+" attempt");
						if(numFromPlayer3<numFromGuesser)
							System.out.println("Player 3 kindly guess higher than "+ numFromPlayer3+ " lower than or equal to 9" );
						else
							System.out.println("Player 3 kindly guess lower than "+ numFromPlayer3+ " higher than or equal to 0" );
						Player sp3=new Player();
						numFromPlayer3=sp3.guessNum();
					}
					else if(trials==0)
					{
						System.out.println("Attempts exhauseted!" );
						System.out.println();
						System.out.println("Congratulations Winners!");
						System.out.println();
						System.out.println("You can now Start a Fresh name!");
					}
					continue;
				}
				else
				{
					System.out.println();
					System.out.println("Player 2 won the game");
					System.out.println();
					if(--trials!=0)
					{
						System.out.println("Player 1 & Player3 have "+ trials+" attempt");
						if(numFromPlayer1<numFromGuesser)
							System.out.println("Player 1 kindly guess higher than "+ numFromPlayer1+ " lower than or equal to 9" );
						else
							System.out.println("Player 1 kindly guess lower than "+ numFromPlayer1+ " higher than or equal to 0" );
						Player sp1=new Player();
						numFromPlayer1=sp1.guessNum();
						if(numFromPlayer3<numFromGuesser)
							System.out.println("Player 3 kindly guess higher than "+ numFromPlayer3+ " lower than or equal to 9" );
						else
							System.out.println("Player 3 kindly guess tlower than "+ numFromPlayer3+ " higher than or equal to 0" );
						Player sp3=new Player();
						numFromPlayer3=sp3.guessNum();
					}
					else if(trials==0)
					{
						System.out.println("Attempts exhauseted!" );
						System.out.println();
						System.out.println("Congratulations Winners!");
						System.out.println();
						System.out.println("You can now Start a Fresh name!");
					}
					continue;
				}
			}
			else if(numFromGuesser==numFromPlayer3)
			{
				System.out.println();
				System.out.println("Player 3 won the game");
				System.out.println();
				if(--trials!=0)
				{
					System.out.println("Player 1 & Player 2 have "+ trials+" attempt");
					if(numFromPlayer1<numFromGuesser)
						System.out.println("Player 1 kindly guess higher than "+ numFromPlayer1+ " lower than or equal to 9" );
					else
						System.out.println("Player 1 kindly guess lower than "+ numFromPlayer1+ " higher than or equal to 0" );
					Player sp1=new Player();
						numFromPlayer1=sp1.guessNum();
					if(numFromPlayer2<numFromGuesser)
						System.out.println("Player 2 kindly guess higher than "+ numFromPlayer2+ " lower than or equal to 9" );
					else
					System.out.println("Player 2 kindly guess lower than "+ numFromPlayer2+ " higher than or equal to 0" );
					Player sp2=new Player();
					numFromPlayer2=sp2.guessNum();
				}
				else if(trials==0)
				{
					System.out.println("Attempts exhauseted!" );
					System.out.println();
					System.out.println("Congratulations Winners!");
					System.out.println();
					System.out.println("You can now Start a Fresh name!");
				}
				continue;
			}
			else
			{
				System.out.println();
				System.out.println("Game lost Try Again!");
				System.out.println();
				if(--trials!=0)
				{
					System.out.println("All players have "+ trials + " attempt");
					if(numFromPlayer1<numFromGuesser)
						System.out.println("Player 1 kindly guess the higher than "+ numFromPlayer1+ " lower than or equal to 9" );
					else
						System.out.println("Player 1 kindly guess the lower than "+ numFromPlayer1+ " higher than or equal to 0" );
					Player sp1=new Player();
					numFromPlayer1=sp1.guessNum();
					if(numFromPlayer2<numFromGuesser)
						System.out.println("Player 2 kindly guess the higher than "+ numFromPlayer2+ " lower than or equal to 9" );
					else
						System.out.println("Player 2 kindly guess the lower than "+ numFromPlayer2+ " higher than or equal to 0" );
					Player sp2=new Player();
					numFromPlayer2=sp2.guessNum();
					if(numFromPlayer3<numFromGuesser)
						System.out.println("Player 3 kindly guess the higher than "+ numFromPlayer3+ " lower than or equal to 9" );
					else
						System.out.println("Player 3 kindly guess the lower than "+ numFromPlayer3+ " higher than or equal to 0" );
					Player sp3=new Player();
					numFromPlayer3=sp3.guessNum();
				}
				else if(trials==0)
				{
					System.out.println("Attempts exhauseted!" );
					System.out.println();
					System.out.println("Congratulations Winners!");
					System.out.println();
					System.out.println("You can now Start a Fresh Game!");
				}
				continue;
			}
			
		}
		
	}
	
}

public class GuessTheNumberGame {

	public static void main(String[] args) {

		System.out.println("Launching the Guessing Number Game");
		System.out.println();
		System.out.println("The number used are between 0 and 9");
		System.out.println();
		
		Umpire u=new Umpire();
		
		u.collectNumFromGuesser();
		
		u.collectNumFromPlayers();
		
		u.compare();
		
	}

}