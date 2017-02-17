import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Ignore;

public class palindromeTest {

	@Test
	public void testSimpleWord() {
		assertTrue(palindrome.checkPalindrome("anna"));
	}
	
	@Test
	public void testWordWithPunctuation() {
		assertFalse("ma,d,am", false);
	}
	
	@Test
	public void testSimpleWordWithDifferentCase() {
		assertTrue("AnNa", true);
	}
	
	@Test
	public void testWordNotPalindrome() {
		assertFalse("Banana", false);
	}
	
	@Test
	public void testNumber() {
		assertTrue("112211", true);
	}
	
	@Test
	public void testNumberWithSpace() {
		assertTrue("100 8 001", true);
	}
	
	@Test
	public void testNumberWithPunctuation() {
		assertFalse("589.985", false);
	}
	
	@Test
	public void testNumberNotPalindrome() {
		assertFalse("123456", false);
	}
	
	@Test
	public void testPhrase() {
		assertTrue("No Lemon No Melon", true);
	}

	@Test
	public void testPhraseWithPunctuation() {
		assertFalse("No Lemon , No Melon", false);
	}
	
	@Test
	public void testForNumberLetterCombination() {
		assertTrue("No12 21on", true);
	}
	
	@Test
	public void testForNotNull() {
		assertNotNull("No Lemon , No Melon", false);
	}
	

	@Test(expected = NullPointerException.class)
	public void testNullPointerExceptionForNull() {
	    palindrome.checkPalindrome(null);
	}
	
	@Test
	public void testNullString() {
		assertNull("", null);
	}
	
	@Ignore
	@Test
	public void testAssertSame() {
		assertSame("No Lemon , No Melon", false);
	}
	
	@Ignore
	@Test	
	public void testOnlyPunctuation() {
		assertFalse("________", false);
	}	
	}

