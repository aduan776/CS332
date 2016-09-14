import static org.junit.Assert.*;

import org.junit.Test;

public class HangmanTest {

	
	@Test
	public void testSolvedPerfectTries() {
		assertEquals(5, Hangman.hangman("woman", "nawom3", 0));
	}
	
	@Test
	public void testSolvedNonePerfectTries() {
		assertEquals(6, Hangman.hangman("woman", "nawo3m", 1));
	}

	@Test
	public void testHitTheLimit(){
		assertEquals(-1, Hangman.hangman("", "man", 0));
	}
	
	@Test
	public void testGiveUp()
	{
		assertEquals(-1, Hangman.hangman("cat", "abc", 5));
	}
	
	@Test
	public void ignoreDuplicateGuesses()
	{
		assertEquals(5, Hangman.hangman("woman", "nnnnaaaawwwwoooommmm3", 0));
	}

}
