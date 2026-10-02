package org.mockito.internal.matchers;

import org.hamcrest.Description;
import org.hamcrest.StringDescription;
import org.junit.Test;

import static org.junit.Assert.*;

public class SameTest {

    @Test
    public void testMatches_sameObjectReference_returnsTrue() {
        Object obj = new Object();
        Same same = new Same(obj);
        assertTrue(same.matches(obj));
    }

    @Test
    public void testMatches_differentObjectReference_returnsFalse() {
        Object wanted = new Object();
        Object actual = new Object();
        Same same = new Same(wanted);
        assertFalse(same.matches(actual));
    }

    @Test
    public void testMatches_bothNull_returnsTrue() {
        Same same = new Same(null);
        assertTrue(same.matches(null));
    }

    @Test
    public void testMatches_wantedNullActualNotNull_returnsFalse() {
        Same same = new Same(null);
        assertFalse(same.matches(new Object()));
    }

    @Test
    public void testMatches_wantedNotNullActualNull_returnsFalse() {
        Same same = new Same(new Object());
        assertFalse(same.matches(null));
    }

    @Test
    public void testMatches_sameStringLiteral_returnsTrue() {
        String s = "hello";
        Same same = new Same(s);
        assertTrue(same.matches(s));
    }

    @Test
    public void testMatches_equalButDifferentStringObjects_returnsFalse() {
        String wanted = new String("hello");
        String actual = new String("hello");
        Same same = new Same(wanted);
        assertFalse(same.matches(actual));
    }

    @Test
    public void testDescribeTo_stringWanted_appendsQuotedText() {
        Same same = new Same("hello");
        Description description = new StringDescription();
        same.describeTo(description);
        assertEquals("same(\"hello\")", description.toString());
    }

    @Test
    public void testDescribeTo_characterWanted_appendsQuotedText() {
        Same same = new Same('a');
        Description description = new StringDescription();
        same.describeTo(description);
        assertEquals("same('a')", description.toString());
    }

    @Test
    public void testDescribeTo_integerWanted_noQuoting() {
        Same same = new Same(42);
        Description description = new StringDescription();
        same.describeTo(description);
        assertEquals("same(42)", description.toString());
    }

    @Test
    public void testDescribeTo_genericObjectWanted_noQuoting() {
        Object wanted = new Object() {
            @Override
            public String toString() {
                return "customToString";
            }
        };
        Same same = new Same(wanted);
        Description description = new StringDescription();
        same.describeTo(description);
        assertEquals("same(customToString)", description.toString());
    }

    @Test(expected = NullPointerException.class)
    public void testDescribeTo_nullWanted_throwsNullPointerException() {
        Same same = new Same(null);
        Description description = new StringDescription();
        same.describeTo(description);
    }

    @Test
    public void testDescribeTo_emptyStringWanted_appendsQuotedEmptyText() {
        Same same = new Same("");
        Description description = new StringDescription();
        same.describeTo(description);
        assertEquals("same(\"\")", description.toString());
    }
}
