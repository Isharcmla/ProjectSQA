import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.junit.Test;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static org.junit.Assert.*;
import static org.mockito.Matchers.*;

public class MatchersTest {

    // Simple generic Hamcrest matcher used to exercise *That() and argThat() methods
    private static class SimpleMatcher<T> extends BaseMatcher<T> {
        @Override
        public boolean matches(Object item) {
            return true;
        }

        @Override
        public void describeTo(Description description) {
            description.appendText("simple matcher");
        }
    }

    // ---------- any* primitive matchers ----------

    @Test
    public void testAnyBoolean_normalCall_returnsFalse() {
        boolean result = anyBoolean();
        assertFalse(result);
    }

    @Test
    public void testAnyByte_normalCall_returnsZero() {
        byte result = anyByte();
        assertEquals(0, result);
    }

    @Test
    public void testAnyChar_normalCall_returnsZeroChar() {
        char result = anyChar();
        assertEquals(0, result);
    }

    @Test
    public void testAnyInt_normalCall_returnsZero() {
        int result = anyInt();
        assertEquals(0, result);
    }

    @Test
    public void testAnyLong_normalCall_returnsZero() {
        long result = anyLong();
        assertEquals(0L, result);
    }

    @Test
    public void testAnyFloat_normalCall_returnsZero() {
        float result = anyFloat();
        assertEquals(0f, result, 0.0001f);
    }

    @Test
    public void testAnyDouble_normalCall_returnsZero() {
        double result = anyDouble();
        assertEquals(0d, result, 0.0001d);
    }

    @Test
    public void testAnyShort_normalCall_returnsZero() {
        short result = anyShort();
        assertEquals(0, result);
    }

    // ---------- any object family ----------

    @Test
    public void testAnyObject_normalCall_returnsNull() {
        Object result = anyObject();
        assertNull(result);
    }

    @Test
    public void testAnyVararg_normalCall_returnsNull() {
        Object result = anyVararg();
        assertNull(result);
    }

    @Test
    public void testAny_withClass_returnsNull() {
        String result = any(String.class);
        assertNull(result);
    }

    @Test
    public void testAny_withClass_edgeCaseNullClass_returnsNull() {
        // passing null class - no type checking is performed, should not throw
        Object result = any((Class) null);
        assertNull(result);
    }

    @Test
    public void testAny_noArgs_returnsNull() {
        Object result = any();
        assertNull(result);
    }

    @Test
    public void testAnyString_normalCall_returnsEmptyString() {
        String result = anyString();
        assertEquals("", result);
    }

    // ---------- collections ----------

    @Test
    public void testAnyList_normalCall_returnsEmptyList() {
        List result = anyList();
        assertNotNull(result);
        assertTrue(result.isEmpty());
    }

    @Test
    public void testAnyListOf_normalCall_returnsEmptyList() {
        List<String> result = anyListOf(String.class);
        assertNotNull(result);
        assertTrue(result.isEmpty());
    }

    @Test
    public void testAnySet_normalCall_returnsEmptySet() {
        Set result = anySet();
        assertNotNull(result);
        assertTrue(result.isEmpty());
    }

    @Test
    public void testAnySetOf_normalCall_returnsEmptySet() {
        Set<String> result = anySetOf(String.class);
        assertNotNull(result);
        assertTrue(result.isEmpty());
    }

    @Test
    public void testAnyMap_normalCall_returnsEmptyMap() {
        Map result = anyMap();
        assertNotNull(result);
        assertTrue(result.isEmpty());
    }

    @Test
    public void testAnyMapOf_normalCall_returnsEmptyMap() {
        Map<String, Integer> result = anyMapOf(String.class, Integer.class);
        assertNotNull(result);
        assertTrue(result.isEmpty());
    }

    @Test
    public void testAnyCollection_normalCall_returnsEmptyCollection() {
        Collection result = anyCollection();
        assertNotNull(result);
        assertTrue(result.isEmpty());
    }

    @Test
    public void testAnyCollectionOf_normalCall_returnsEmptyCollection() {
        Collection<String> result = anyCollectionOf(String.class);
        assertNotNull(result);
        assertTrue(result.isEmpty());
    }

    // ---------- isA ----------

    @Test
    public void testIsA_normalCall_returnsNull() {
        String result = isA(String.class);
        assertNull(result);
    }

    // ---------- eq primitives ----------

    @Test
    public void testEq_boolean_normalCall_returnsFalse() {
        boolean result = eq(true);
        assertFalse(result);
    }

    @Test
    public void testEq_byte_normalCall_returnsZero() {
        byte result = eq((byte) 5);
        assertEquals(0, result);
    }

    @Test
    public void testEq_char_normalCall_returnsZero() {
        char result = eq('a');
        assertEquals(0, result);
    }

    @Test
    public void testEq_double_normalCall_returnsZero() {
        double result = eq(3.14d);
        assertEquals(0d, result, 0.0001d);
    }

    @Test
    public void testEq_float_normalCall_returnsZero() {
        float result = eq(3.14f);
        assertEquals(0f, result, 0.0001f);
    }

    @Test
    public void testEq_int_normalCall_returnsZero() {
        int result = eq(42);
        assertEquals(0, result);
    }

    @Test
    public void testEq_int_edgeCaseNegative_returnsZero() {
        int result = eq(-1);
        assertEquals(0, result);
    }

    @Test
    public void testEq_long_normalCall_returnsZero() {
        long result = eq(100L);
        assertEquals(0L, result);
    }

    @Test
    public void testEq_short_normalCall_returnsZero() {
        short result = eq((short) 7);
        assertEquals(0, result);
    }

    @Test
    public void testEq_object_normalCall_returnsNull() {
        String result = eq("hello");
        assertNull(result);
    }

    @Test
    public void testEq_object_edgeCaseNull_returnsNullWithoutException() {
        Object result = eq((Object) null);
        assertNull(result);
    }

    // ---------- refEq ----------

    @Test
    public void testRefEq_normalCall_returnsNull() {
        String result = refEq("value");
        assertNull(result);
    }

    @Test
    public void testRefEq_withExcludeFields_returnsNull() {
        String result = refEq("value", "field1", "field2");
        assertNull(result);
    }

    @Test
    public void testRefEq_edgeCaseNullValue_returnsNullWithoutException() {
        Object result = refEq(null);
        assertNull(result);
    }

    // ---------- same ----------

    @Test
    public void testSame_normalCall_returnsNull() {
        Object value = new Object();
        Object result = same(value);
        assertNull(result);
    }

    @Test
    public void testSame_edgeCaseNull_returnsNullWithoutException() {
        Object result = same((Object) null);
        assertNull(result);
    }

    // ---------- isNull / notNull family ----------

    @Test
    public void testIsNull_normalCall_returnsNull() {
        Object result = isNull();
        assertNull(result);
    }

    @Test
    public void testIsNull_withClass_returnsNull() {
        String result = isNull(String.class);
        assertNull(result);
    }

    @Test
    public void testNotNull_normalCall_returnsNull() {
        Object result = notNull();
        assertNull(result);
    }

    @Test
    public void testNotNull_withClass_returnsNull() {
        String result = notNull(String.class);
        assertNull(result);
    }

    @Test
    public void testIsNotNull_normalCall_returnsNull() {
        Object result = isNotNull();
        assertNull(result);
    }

    @Test
    public void testIsNotNull_withClass_returnsNull() {
        String result = isNotNull(String.class);
        assertNull(result);
    }

    // ---------- string matchers ----------

    @Test
    public void testContains_normalCall_returnsEmptyString() {
        String result = contains("sub");
        assertEquals("", result);
    }

    @Test
    public void testContains_edgeCaseNullSubstring_returnsEmptyStringWithoutException() {
        String result = contains(null);
        assertEquals("", result);
    }

    @Test
    public void testContains_edgeCaseEmptySubstring_returnsEmptyString() {
        String result = contains("");
        assertEquals("", result);
    }

    @Test
    public void testMatches_normalCall_returnsEmptyString() {
        String result = matches("^[a-z]+$");
        assertEquals("", result);
    }

    @Test
    public void testMatches_edgeCaseNullRegex_returnsEmptyStringWithoutException() {
        String result = matches(null);
        assertEquals("", result);
    }

    @Test
    public void testEndsWith_normalCall_returnsEmptyString() {
        String result = endsWith("suffix");
        assertEquals("", result);
    }

    @Test
    public void testEndsWith_edgeCaseEmptySuffix_returnsEmptyString() {
        String result = endsWith("");
        assertEquals("", result);
    }

    @Test
    public void testStartsWith_normalCall_returnsEmptyString() {
        String result = startsWith("prefix");
        assertEquals("", result);
    }

    @Test
    public void testStartsWith_edgeCaseNullPrefix_returnsEmptyStringWithoutException() {
        String result = startsWith(null);
        assertEquals("", result);
    }

    // ---------- custom matchers ----------

    @Test
    public void testArgThat_normalCall_returnsNull() {
        String result = argThat(new SimpleMatcher<String>());
        assertNull(result);
    }

    @Test
    public void testArgThat_edgeCaseNullMatcher_returnsNullWithoutException() {
        Object result = argThat(null);
        assertNull(result);
    }

    @Test
    public void testCharThat_normalCall_returnsZero() {
        char result = charThat(new SimpleMatcher<Character>());
        assertEquals(0, result);
    }

    @Test
    public void testBooleanThat_normalCall_returnsFalse() {
        boolean result = booleanThat(new SimpleMatcher<Boolean>());
        assertFalse(result);
    }

    @Test
    public void testByteThat_normalCall_returnsZero() {
        byte result = byteThat(new SimpleMatcher<Byte>());
        assertEquals(0, result);
    }

    @Test
    public void testShortThat_normalCall_returnsZero() {
        short result = shortThat(new SimpleMatcher<Short>());
        assertEquals(0, result);
    }

    @Test
    public void testIntThat_normalCall_returnsZero() {
        int result = intThat(new SimpleMatcher<Integer>());
        assertEquals(0, result);
    }

    @Test
    public void testLongThat_normalCall_returnsZero() {
        long result = longThat(new SimpleMatcher<Long>());
        assertEquals(0L, result);
    }

    @Test
    public void testFloatThat_normalCall_returnsZero() {
        float result = floatThat(new SimpleMatcher<Float>());
        assertEquals(0f, result, 0.0001f);
    }

    @Test
    public void testDoubleThat_normalCall_returnsZero() {
        double result = doubleThat(new SimpleMatcher<Double>());
        assertEquals(0d, result, 0.0001d);
    }
}
