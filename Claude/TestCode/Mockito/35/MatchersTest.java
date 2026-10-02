import static org.junit.Assert.*;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.junit.Test;
import org.mockito.Matchers;

public class MatchersTest {

    // Helper matcher that always returns true, used for *That() and argThat() methods
    private static class AlwaysTrueMatcher<T> extends BaseMatcher<T> {
        @Override
        public boolean matches(Object item) {
            return true;
        }

        @Override
        public void describeTo(Description description) {
            description.appendText("always true matcher");
        }
    }

    // ---------- any* primitive matchers ----------

    @Test
    public void testAnyBoolean_normalCall_returnsFalse() {
        boolean result = Matchers.anyBoolean();
        assertFalse(result);
    }

    @Test
    public void testAnyByte_normalCall_returnsZero() {
        byte result = Matchers.anyByte();
        assertEquals(0, result);
    }

    @Test
    public void testAnyChar_normalCall_returnsZeroChar() {
        char result = Matchers.anyChar();
        assertEquals(0, result);
    }

    @Test
    public void testAnyInt_normalCall_returnsZero() {
        int result = Matchers.anyInt();
        assertEquals(0, result);
    }

    @Test
    public void testAnyLong_normalCall_returnsZero() {
        long result = Matchers.anyLong();
        assertEquals(0L, result);
    }

    @Test
    public void testAnyFloat_normalCall_returnsZero() {
        float result = Matchers.anyFloat();
        assertEquals(0f, result, 0.0001);
    }

    @Test
    public void testAnyDouble_normalCall_returnsZero() {
        double result = Matchers.anyDouble();
        assertEquals(0d, result, 0.0001);
    }

    @Test
    public void testAnyShort_normalCall_returnsZero() {
        short result = Matchers.anyShort();
        assertEquals(0, result);
    }

    @Test
    public void testAnyObject_normalCall_returnsNull() {
        Object result = Matchers.anyObject();
        assertNull(result);
    }

    @Test
    public void testAnyVararg_normalCall_returnsNull() {
        Object result = Matchers.anyVararg();
        assertNull(result);
    }

    @Test
    public void testAny_withClassArgument_returnsNull() {
        String result = Matchers.any(String.class);
        assertNull(result);
    }

    @Test
    public void testAny_withNullClassArgument_returnsNull() {
        // edge case: passing null class, implementation does not use the argument
        String result = Matchers.any((Class<String>) null);
        assertNull(result);
    }

    @Test
    public void testAny_noArgument_returnsNull() {
        Object result = Matchers.any();
        assertNull(result);
    }

    @Test
    public void testAnyString_normalCall_returnsEmptyString() {
        String result = Matchers.anyString();
        assertEquals("", result);
    }

    @Test
    public void testAnyList_normalCall_returnsEmptyList() {
        List result = Matchers.anyList();
        assertNotNull(result);
        assertTrue(result.isEmpty());
    }

    @Test
    public void testAnyList_accessIndexOutOfBound_throwsException() {
        List result = Matchers.anyList();
        try {
            result.get(0);
            fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            // expected
        }
    }

    @Test
    public void testAnyListOf_normalCall_returnsEmptyList() {
        List<String> result = Matchers.anyListOf(String.class);
        assertNotNull(result);
        assertTrue(result.isEmpty());
    }

    @Test
    public void testAnySet_normalCall_returnsEmptySet() {
        Set result = Matchers.anySet();
        assertNotNull(result);
        assertTrue(result.isEmpty());
    }

    @Test(expected = NoSuchElementException.class)
    public void testAnySet_accessIteratorNext_throwsException() {
        Set result = Matchers.anySet();
        result.iterator().next();
    }

    @Test
    public void testAnySetOf_normalCall_returnsEmptySet() {
        Set<String> result = Matchers.anySetOf(String.class);
        assertNotNull(result);
        assertTrue(result.isEmpty());
    }

    @Test
    public void testAnyMap_normalCall_returnsEmptyMap() {
        Map result = Matchers.anyMap();
        assertNotNull(result);
        assertTrue(result.isEmpty());
    }

    @Test
    public void testAnyMap_getOnEmptyMap_returnsNull() {
        Map result = Matchers.anyMap();
        assertNull(result.get("key"));
    }

    @Test
    public void testAnyCollection_normalCall_returnsEmptyCollection() {
        Collection result = Matchers.anyCollection();
        assertNotNull(result);
        assertTrue(result.isEmpty());
    }

    @Test
    public void testAnyCollectionOf_normalCall_returnsEmptyCollection() {
        Collection<String> result = Matchers.anyCollectionOf(String.class);
        assertNotNull(result);
        assertTrue(result.isEmpty());
    }

    // ---------- isA ----------

    @Test
    public void testIsA_withValidClass_returnsNull() {
        String result = Matchers.isA(String.class);
        assertNull(result);
    }

    // ---------- eq overloads ----------

    @Test
    public void testEqBoolean_normalCall_returnsFalse() {
        boolean result = Matchers.eq(true);
        assertFalse(result);
    }

    @Test
    public void testEqByte_normalCall_returnsZero() {
        byte result = Matchers.eq((byte) 5);
        assertEquals(0, result);
    }

    @Test
    public void testEqChar_normalCall_returnsZeroChar() {
        char result = Matchers.eq('a');
        assertEquals(0, result);
    }

    @Test
    public void testEqDouble_normalCall_returnsZero() {
        double result = Matchers.eq(3.14);
        assertEquals(0d, result, 0.0001);
    }

    @Test
    public void testEqFloat_normalCall_returnsZero() {
        float result = Matchers.eq(3.14f);
        assertEquals(0f, result, 0.0001);
    }

    @Test
    public void testEqInt_normalCall_returnsZero() {
        int result = Matchers.eq(42);
        assertEquals(0, result);
    }

    @Test
    public void testEqInt_withNegativeValue_returnsZero() {
        int result = Matchers.eq(-42);
        assertEquals(0, result);
    }

    @Test
    public void testEqLong_normalCall_returnsZero() {
        long result = Matchers.eq(42L);
        assertEquals(0L, result);
    }

    @Test
    public void testEqShort_normalCall_returnsZero() {
        short result = Matchers.eq((short) 42);
        assertEquals(0, result);
    }

    @Test
    public void testEqObject_normalCall_returnsNull() {
        String result = Matchers.eq("hello");
        assertNull(result);
    }

    @Test
    public void testEqObject_withNullValue_returnsNull() {
        String result = Matchers.eq((String) null);
        assertNull(result);
    }

    @Test
    public void testEqObject_withEmptyString_returnsNull() {
        String result = Matchers.eq("");
        assertNull(result);
    }

    // ---------- refEq ----------

    @Test
    public void testRefEq_normalCall_returnsNull() {
        String result = Matchers.refEq("someValue");
        assertNull(result);
    }

    @Test
    public void testRefEq_withExcludeFields_returnsNull() {
        String result = Matchers.refEq("someValue", "field1", "field2");
        assertNull(result);
    }

    @Test
    public void testRefEq_withNullValue_returnsNull() {
        String result = Matchers.refEq((String) null);
        assertNull(result);
    }

    // ---------- same ----------

    @Test
    public void testSame_normalCall_returnsNull() {
        Object value = new Object();
        Object result = Matchers.same(value);
        assertNull(result);
    }

    @Test
    public void testSame_withNullValue_returnsNull() {
        Object result = Matchers.same(null);
        assertNull(result);
    }

    // ---------- isNull / notNull / isNotNull ----------

    @Test
    public void testIsNull_normalCall_returnsNull() {
        Object result = Matchers.isNull();
        assertNull(result);
    }

    @Test
    public void testNotNull_normalCall_returnsNull() {
        Object result = Matchers.notNull();
        assertNull(result);
    }

    @Test
    public void testIsNotNull_normalCall_returnsNull() {
        Object result = Matchers.isNotNull();
        assertNull(result);
    }

    // ---------- String matchers ----------

    @Test
    public void testContains_normalCall_returnsEmptyString() {
        String result = Matchers.contains("sub");
        assertEquals("", result);
    }

    @Test
    public void testContains_withEmptySubstring_returnsEmptyString() {
        String result = Matchers.contains("");
        assertEquals("", result);
    }

    @Test
    public void testMatches_normalCall_returnsEmptyString() {
        String result = Matchers.matches("regex.*");
        assertEquals("", result);
    }

    @Test
    public void testMatches_withEmptyRegex_returnsEmptyString() {
        String result = Matchers.matches("");
        assertEquals("", result);
    }

    @Test
    public void testEndsWith_normalCall_returnsEmptyString() {
        String result = Matchers.endsWith("suffix");
        assertEquals("", result);
    }

    @Test
    public void testEndsWith_withEmptySuffix_returnsEmptyString() {
        String result = Matchers.endsWith("");
        assertEquals("", result);
    }

    @Test
    public void testStartsWith_normalCall_returnsEmptyString() {
        String result = Matchers.startsWith("prefix");
        assertEquals("", result);
    }

    @Test
    public void testStartsWith_withEmptyPrefix_returnsEmptyString() {
        String result = Matchers.startsWith("");
        assertEquals("", result);
    }

    // ---------- custom matchers (*That) ----------

    @Test
    public void testArgThat_normalCall_returnsNull() {
        String result = Matchers.argThat(new AlwaysTrueMatcher<String>());
        assertNull(result);
    }

    @Test
    public void testCharThat_normalCall_returnsZeroChar() {
        char result = Matchers.charThat(new AlwaysTrueMatcher<Character>());
        assertEquals(0, result);
    }

    @Test
    public void testBooleanThat_normalCall_returnsFalse() {
        boolean result = Matchers.booleanThat(new AlwaysTrueMatcher<Boolean>());
        assertFalse(result);
    }

    @Test
    public void testByteThat_normalCall_returnsZero() {
        byte result = Matchers.byteThat(new AlwaysTrueMatcher<Byte>());
        assertEquals(0, result);
    }

    @Test
    public void testShortThat_normalCall_returnsZero() {
        short result = Matchers.shortThat(new AlwaysTrueMatcher<Short>());
        assertEquals(0, result);
    }

    @Test
    public void testIntThat_normalCall_returnsZero() {
        int result = Matchers.intThat(new AlwaysTrueMatcher<Integer>());
        assertEquals(0, result);
    }

    @Test
    public void testLongThat_normalCall_returnsZero() {
        long result = Matchers.longThat(new AlwaysTrueMatcher<Long>());
        assertEquals(0L, result);
    }

    @Test
    public void testFloatThat_normalCall_returnsZero() {
        float result = Matchers.floatThat(new AlwaysTrueMatcher<Float>());
        assertEquals(0f, result, 0.0001);
    }

    @Test
    public void testDoubleThat_normalCall_returnsZero() {
        double result = Matchers.doubleThat(new AlwaysTrueMatcher<Double>());
        assertEquals(0d, result, 0.0001);
    }

    // ---------- additional edge/exception style tests using public API results ----------

    @Test
    public void testAnyCollection_iteratorOnEmptyCollection_throwsException() {
        Collection result = Matchers.anyCollection();
        try {
            result.iterator().next();
            fail("Expected NoSuchElementException");
        } catch (NoSuchElementException e) {
            // expected
        }
    }

    @Test
    public void testAnySetOf_iteratorOnEmptySet_throwsException() {
        Set<String> result = Matchers.anySetOf(String.class);
        try {
            result.iterator().next();
            fail("Expected NoSuchElementException");
        } catch (NoSuchElementException e) {
            // expected
        }
    }

    @Test
    public void testAnyListOf_accessIndexOutOfBound_throwsException() {
        List<String> result = Matchers.anyListOf(String.class);
        try {
            result.get(0);
            fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            // expected
        }
    }
}
