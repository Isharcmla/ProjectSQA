package org.apache.commons.lang;

import org.junit.Test;
import static org.junit.Assert.*;

public class WordUtilsTest {

    @Test
    public void testConstructor() {
        assertNotNull(new WordUtils());
    }

    @Test
    public void testWrap_StringInt() {
        assertNull(WordUtils.wrap(null, 20));
        assertEquals("", WordUtils.wrap("", 20));
        assertEquals("Here is" + SystemUtils.LINE_SEPARATOR + "a line", WordUtils.wrap("Here is a line", 10));
        assertEquals("Here is" + SystemUtils.LINE_SEPARATOR + "a line", WordUtils.wrap("Here is a line", -1));
    }

    @Test
    public void testWrap_StringIntStringBoolean() {
        assertNull(WordUtils.wrap(null, 20, "\n", false));
        assertEquals("", WordUtils.wrap("", 20, "\n", false));
        
        // Custom newLineStr is null -> fallback to SystemUtils.LINE_SEPARATOR
        assertEquals("Here is" + SystemUtils.LINE_SEPARATOR + "a line", WordUtils.wrap("Here is a line", 10, null, false));

        // wrapLength < 1
        assertEquals("H\ne\nr\ne", WordUtils.wrap("Here", 0, "\n", true));

        // Leading spaces stripping
        assertEquals("Here\nis\na line", WordUtils.wrap("Here   is a line", 6, "\n", false));

        // Normal wrapping at space
        assertEquals("Here is\na line", WordUtils.wrap("Here is a line", 10, "\n", false));

        // Long word wrapLongWords = true
        assertEquals("Here is\naverylong\nwordthatg\noeson", WordUtils.wrap("Here is averylongwordthatgoeson", 10, "\n", true));

        // Long word wrapLongWords = false, with subsequent space
        assertEquals("Here is\naverylongwordthatgoeson\nand more", WordUtils.wrap("Here is averylongwordthatgoeson and more", 10, "\n", false));

        // Long word wrapLongWords = false, at the end of string (no subsequent space)
        assertEquals("Here is\naverylongwordthatgoeson", WordUtils.wrap("Here is averylongwordthatgoeson", 10, "\n", false));
    }

    @Test
    public void testCapitalize_String() {
        assertNull(WordUtils.capitalize(null));
        assertEquals("", WordUtils.capitalize(""));
        assertEquals("I Am Fine", WordUtils.capitalize("i am fine"));
        assertEquals("I Am FINE", WordUtils.capitalize("i am FINE"));
        assertEquals("  I  Am  ", WordUtils.capitalize("  i  am  "));
    }

    @Test
    public void testCapitalize_StringCharArray() {
        assertNull(WordUtils.capitalize(null, new char[]{' '}));
        assertEquals("", WordUtils.capitalize("", new char[]{' '}));
        assertEquals("i am fine", WordUtils.capitalize("i am fine", new char[0]));
        assertEquals("I Am Fine", WordUtils.capitalize("i am fine", null));
        assertEquals("I aM.Fine", WordUtils.capitalize("i aM.fine", new char[]{'.'}));
        assertEquals("I-Am-Fine", WordUtils.capitalize("i-am-fine", new char[]{'-'}));
        assertEquals("I.Am-Fine", WordUtils.capitalize("i.am-fine", new char[]{'.', '-'}));
    }

    @Test
    public void testCapitalizeFully_String() {
        assertNull(WordUtils.capitalizeFully(null));
        assertEquals("", WordUtils.capitalizeFully(""));
        assertEquals("I Am Fine", WordUtils.capitalizeFully("i am FINE"));
    }

    @Test
    public void testCapitalizeFully_StringCharArray() {
        assertNull(WordUtils.capitalizeFully(null, new char[]{' '}));
        assertEquals("", WordUtils.capitalizeFully("", new char[]{' '}));
        assertEquals("i aM.FINE", WordUtils.capitalizeFully("i aM.FINE", new char[0]));
        assertEquals("I Am Fine", WordUtils.capitalizeFully("i aM.FINE", null));
        assertEquals("I am.Fine", WordUtils.capitalizeFully("i aM.FINE", new char[]{'.'}));
    }

    @Test
    public void testUncapitalize_String() {
        assertNull(WordUtils.uncapitalize(null));
        assertEquals("", WordUtils.uncapitalize(""));
        assertEquals("i am fine", WordUtils.uncapitalize("I Am Fine"));
        assertEquals("i am fINE", WordUtils.uncapitalize("I Am FINE"));
    }

    @Test
    public void testUncapitalize_StringCharArray() {
        assertNull(WordUtils.uncapitalize(null, new char[]{' '}));
        assertEquals("", WordUtils.uncapitalize("", new char[]{' '}));
        assertEquals("I AM.FINE", WordUtils.uncapitalize("I AM.FINE", new char[0]));
        assertEquals("i aM.fINE", WordUtils.uncapitalize("I AM.FINE", null));
        assertEquals("i AM.fINE", WordUtils.uncapitalize("I AM.FINE", new char[]{'.'}));
        assertEquals("i-aM-fINE", WordUtils.uncapitalize("I-AM-FINE", new char[]{'-'}));
    }

    @Test
    public void testSwapCase() {
        assertNull(WordUtils.swapCase(null));
        assertEquals("", WordUtils.swapCase(""));
        assertEquals("tHE DOG HAS A bone", WordUtils.swapCase("The dog has a BONE"));
        assertEquals("tHE  dOG", WordUtils.swapCase("The  Dog"));
        assertEquals("1234", WordUtils.swapCase("1234"));
        
        // TitleCase character check using Unicode 'ǅ' (U+01C5: LATIN CAPITAL LETTER D WITH SMALL LETTER Z WITH CARON)
        // Character.isTitleCase('\u01C5') returns true; toLowerCase yields '\u01C6'
        assertEquals("\u01C6", WordUtils.swapCase("\u01C5"));
    }

    @Test
    public void testInitials_String() {
        assertNull(WordUtils.initials(null));
        assertEquals("", WordUtils.initials(""));
        assertEquals("BJL", WordUtils.initials("Ben John Lee"));
        assertEquals("BJ", WordUtils.initials("Ben J.Lee"));
    }

    @Test
    public void testInitials_StringCharArray() {
        assertNull(WordUtils.initials(null, new char[]{' '}));
        assertEquals("", WordUtils.initials("", new char[]{' '}));
        assertEquals("", WordUtils.initials("Ben John Lee", new char[0]));
        assertEquals("BJL", WordUtils.initials("Ben John Lee", null));
        assertEquals("BJ", WordUtils.initials("Ben J.Lee", null));
        assertEquals("BJL", WordUtils.initials("Ben J.Lee", new char[]{' ', '.'}));
        assertEquals("BJL", WordUtils.initials("  Ben   John   Lee  ", new char[]{' '}));
    }

    @Test
    public void testAbbreviate() {
        assertNull(WordUtils.abbreviate(null, 1, -1, ""));
        assertEquals("", WordUtils.abbreviate("", 0, 5, ""));

        // upper == -1 or upper > str.length()
        assertEquals("0123456789", WordUtils.abbreviate("0123456789", 0, -1, null));
        assertEquals("0123456789", WordUtils.abbreviate("0123456789", 0, 20, null));

        // upper < lower -> upper = lower
        assertEquals("01234", WordUtils.abbreviate("0123456789", 5, 2, ""));

        // index == -1 (no space found) and upper == str.length()
        assertEquals("0123456789", WordUtils.abbreviate("0123456789", 5, -1, "..."));

        // index == -1 (no space found) and upper != str.length()
        assertEquals("01234...", WordUtils.abbreviate("0123456789", 5, 5, "..."));
        assertEquals("01234", WordUtils.abbreviate("0123456789", 5, 5, null)); // appendToEnd is null

        // index > upper
        assertEquals("01234...", WordUtils.abbreviate("01234 6789", 2, 5, "..."));

        // index <= upper
        assertEquals("012 45...", WordUtils.abbreviate("012 45 789", 4, 8, "..."));
        assertEquals("012 45", WordUtils.abbreviate("012 45 789", 4, 8, null));
    }
}
