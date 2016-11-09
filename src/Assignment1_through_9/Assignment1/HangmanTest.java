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
	
	@Test(expected=NullPointerException.class)
	public void testPuzzleNullException(){
		assertEquals(-1, Hangman.hangman(null, "abc", 5));
	}
	
	@Test(expected=NullPointerException.class)
	public void testGuessNullException(){
		assertEquals(-1, Hangman.hangman("abc", null, 5));
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testIllegalLimit(){
		assertEquals(-1, Hangman.hangman("abc", "cat", -1));
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testIllegalLimit2(){
		assertEquals(5, Hangman.hangman("abc", "cat", -1));
	}

}
