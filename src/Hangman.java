/*
 * pre:      puzzle != null, guesses != null, limit >=0
 * post:     returns the number of the guess that solves the 
 *           puzzle within the given limit on incorrect guesses.  
 *           If the puzzle is not solved within the limit, returns -1.
 *           e.g. 
 *              hangman ("cat", "abct", 1) is 4  (solved)
 *              hangman ("cat", "abct", 0) is -1 (hit the limit)
 *              hangman ("cat", "abcd", 5) is -1 (gave up)
 *              
 *    For this assignment, Alex Duan, Pyoung Kang Kim and Daniel Quintero collaborated.
 *    Alex wrote the code for the hangman method, Pyoung wrote the JUnit test suite,
 *    and Daniel helped to debug the hangman method and checked code coverage.
*/
public class Hangman {
	
	static public int hangman (String puzzle, String guesses, int limit) 
	{
		if(puzzle==null)
			throw new NullPointerException("Puzzle Cannot be null");
		if(guesses==null)
			throw new NullPointerException("Guesses Cannot be null");
		if(!(limit >=0))
			throw new IllegalArgumentException("Limit must be >= 0");

		char g[]=guesses.toCharArray();
		String regex = new String();
		int wrong = 0;
		int guess = 0;
		for(int i = 0; i < guesses.length(); i++)
		{
			if(puzzle.matches((".*"+g[i]+".*")) && !regex.matches(".*"+g[i]+".*"))
			{
				guess++;
				regex += g[i];
				if(puzzle.matches("["+regex+"]*"))
				{
					return guess + wrong;
				}
			}
			else if (!regex.matches(".*"+g[i]+".*"))
			{
				if(wrong == limit)
				{
					return -1;
				}
				wrong++;
			}
		}
		return -1;
	}
	
}
