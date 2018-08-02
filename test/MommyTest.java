import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class MommyTest {

    Mommy actualWord = new Mommy();

    @Test
    public void should_return_blank_when_given_blank() {
       assertEquals(" ",actualWord.toMommy(" ") );

    }

    @Test
    public void should_return_mommy_when_given_one_vowel() {
        assertEquals("mommy",actualWord.toMommy("a"));
    }

    @Test
    public void should_given_original_when_given_b() {
        assertEquals("b",actualWord.toMommy("b"));
    }

    @Test
    public void should_return_hmommys_when_given_has() {
        assertEquals("hmommys",actualWord.toMommy("has"));
    }

    @Test
    public void should_return_hard_when_given_hard_with_25_percent_vowels() {
        assertEquals("hard",actualWord.toMommy("hard"));
    }
}
