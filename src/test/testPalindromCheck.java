package test;

import com.company.PalindromCheck;
import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Created by pavlo on 11.03.17.
 */
public class testPalindromCheck {

    @Test
    public void testIsPalindrom () {
         assertTrue(PalindromCheck.isPalindrom("12321"));
    }

    @Test
    public void testIsPalindromFalse() {
        assertFalse(PalindromCheck.isPalindrom("12345"));
    }

    @Test(expected = NumberFormatException.class)
    public void testIsPalindromException() {
        PalindromCheck.isPalindrom("123.321");
    }

}
