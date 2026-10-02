package org.mockito;

import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.internal.progress.ThreadSafeMockingProgress;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public class MatchersTest {

    private final Matcher<Object> dummyMatcher = new BaseMatcher<Object>() {
        @Override
        public boolean matches(Object item) {
            return true;
        }

        @Override
        public void describeTo(Description description) {
            description.appendText("dummy matcher");
        }
    };

    @Before
    @After
    public void resetMockingProgress() {
        new ThreadSafeMockingProgress().reset();
    }

    @Test
    public void testConstructor_instanceCreation_shouldInstantiate() {
        Matchers matchers = new Matchers();
        assertNotNull(matchers);
    }

    @Test
    public void testAnyBoolean_normalCall_returnsFalse() {
        assertFalse(Matchers.anyBoolean());
    }

    @Test
    public void testAnyByte_normalCall_returnsZero() {
        assertEquals((byte) 0, Matchers.anyByte());
    }

    @Test
    public void testAnyChar_normalCall_returnsZeroChar() {
        assertEquals('\u0000', Matchers.anyChar());
    }

    @Test
    public void testAnyInt_normalCall_returnsZero() {
        assertEquals(0, Matchers.anyInt());
    }

    @Test
    public void testAnyLong_normalCall_returnsZero() {
        assertEquals(0L, Matchers.anyLong());
    }

    @Test
    public void testAnyFloat_normalCall_returnsZero() {
        assertEquals(0.0f, Matchers.anyFloat(), 0.0001f);
    }

    @Test
    public void testAnyDouble_normalCall_returnsZero() {
        assertEquals(0.0d, Matchers.anyDouble(), 0.0001d);
    }

    @Test
    public void testAnyShort_normalCall_returnsZero() {
        assertEquals((short) 0, Matchers.anyShort());
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
    public void testAnyClass_withClassParam_returnsNull() {
        String result = Matchers.any(String.class);
        assertNull(result);
    }

    @Test
    public void testAnyClass_withNullClassParam_returnsNull() {
        Object result = Matchers.any((Class<Object>) null);
        assertNull(result);
    }

    @Test
    public void testAny_noParams_returnsNull() {
        Object result = Matchers.any();
        assertNull(result);
    }

    @Test
    public void testAnyString_normalCall_returnsEmptyString() {
        assertEquals("", Matchers.anyString());
    }

    @Test
    public void testAnyList_normalCall_returnsEmptyList() {
        List<?> result = Matchers.anyList();
        assertNotNull(result);
        assertTrue(result.isEmpty());
    }

    @Test
    public void testAnyListOf_withClassParam_returnsEmptyList() {
        List<String> result = Matchers.anyListOf(String.class);
        assertNotNull(result);
        assertTrue(result.isEmpty());
    }

    @Test
    public void testAnyListOf_withNullClassParam_returnsEmptyList() {
        List<Object> result = Matchers.anyListOf(null);
        assertNotNull(result);
        assertTrue(result.isEmpty());
    }

    @Test
    public void testAnySet_normalCall_returnsEmptySet() {
        Set<?> result = Matchers.anySet();
        assertNotNull(result);
        assertTrue(result.isEmpty());
    }

    @Test
    public void testAnySetOf_withClassParam_returnsEmptySet() {
        Set<Integer> result = Matchers.anySetOf(Integer.class);
        assertNotNull(result);
        assertTrue(result.isEmpty());
    }

    @Test
    public void testAnySetOf_withNullClassParam_returnsEmptySet() {
        Set<Object> result = Matchers.anySetOf(null);
        assertNotNull(result);
        assertTrue(result.isEmpty());
    }

    @Test
    public void testAnyMap_normalCall_returnsEmptyMap() {
        Map<?, ?> result = Matchers.anyMap();
        assertNotNull(result);
        assertTrue(result.isEmpty());
    }

    @Test
    public void testAnyCollection_normalCall_returnsEmptyCollection() {
        Collection<?> result = Matchers.anyCollection();
        assertNotNull(result);
        assertTrue(result.isEmpty());
    }

    @Test
    public void testAnyCollectionOf_withClassParam_returnsEmptyCollection() {
        Collection<Double> result = Matchers.anyCollectionOf(Double.class);
        assertNotNull(result);
        assertTrue(result.isEmpty());
    }

    @Test
    public void testAnyCollectionOf_withNullClassParam_returnsEmptyCollection() {
        Collection<Object> result = Matchers.anyCollectionOf(null);
        assertNotNull(result);
        assertTrue(result.isEmpty());
    }

    @Test
    public void testIsA_withValidClass_returnsNull() {
        String result = Matchers.isA(String.class);
        assertNull(result);
    }

    @Test
    public void testIsA_withNullClass_returnsNull() {
        Object result = Matchers.isA(null);
        assertNull(result);
    }

    @Test
    public void testEq_booleanTrue_returnsFalse() {
        assertFalse(Matchers.eq(true));
    }

    @Test
    public void testEq_booleanFalse_returnsFalse() {
        assertFalse(Matchers.eq(false));
    }

    @Test
    public void testEq_byteZero_returnsZero() {
        assertEquals((byte) 0, Matchers.eq((byte) 0));
    }

    @Test
    public void testEq_byteNonZero_returnsZero() {
        assertEquals((byte) 0, Matchers.eq((byte) 42));
        assertEquals((byte) 0, Matchers.eq((byte) -128));
    }

    @Test
    public void testEq_charZero_returnsZero() {
        assertEquals('\u0000', Matchers.eq('\u0000'));
    }

    @Test
    public void testEq_charNonZero_returnsZero() {
        assertEquals('\u0000', Matchers.eq('a'));
    }

    @Test
    public void testEq_doubleZero_returnsZero() {
        assertEquals(0.0d, Matchers.eq(0.0d), 0.0001d);
    }

    @Test
    public void testEq_doubleNegativeAndPositive_returnsZero() {
        assertEquals(0.0d, Matchers.eq(-123.456d), 0.0001d);
        assertEquals(0.0d, Matchers.eq(999.999d), 0.0001d);
    }

    @Test
    public void testEq_floatZero_returnsZero() {
        assertEquals(0.0f, Matchers.eq(0.0f), 0.0001f);
    }

    @Test
    public void testEq_floatNegativeAndPositive_returnsZero() {
        assertEquals(0.0f, Matchers.eq(-45.67f), 0.0001f);
        assertEquals(0.0f, Matchers.eq(100.5f), 0.0001f);
    }

    @Test
    public void testEq_intZero_returnsZero() {
        assertEquals(0, Matchers.eq(0));
    }

    @Test
    public void testEq_intNegativeAndPositive_returnsZero() {
        assertEquals(0, Matchers.eq(-100));
        assertEquals(0, Matchers.eq(Integer.MAX_VALUE));
    }

    @Test
    public void testEq_longZero_returnsZero() {
        assertEquals(0L, Matchers.eq(0L));
    }

    @Test
    public void testEq_longNegativeAndPositive_returnsZero() {
        assertEquals(0L, Matchers.eq(-9876543210L));
        assertEquals(0L, Matchers.eq(Long.MAX_VALUE));
    }

    @Test
    public void testEq_shortZero_returnsZero() {
        assertEquals((short) 0, Matchers.eq((short) 0));
    }

    @Test
    public void testEq_shortNegativeAndPositive_returnsZero() {
        assertEquals((short) 0, Matchers.eq((short) -12));
        assertEquals((short) 0, Matchers.eq((short) 300));
    }

    @Test
    public void testEq_objectValue_returnsNull() {
        String result = Matchers.eq("expectedString");
        assertNull(result);
    }

    @Test
    public void testEq_nullObject_returnsNull() {
        Object result = Matchers.eq((Object) null);
        assertNull(result);
    }

    @Test
    public void testRefEq_objectWithoutExcludedFields_returnsNull() {
        String result = Matchers.refEq("test");
        assertNull(result);
    }

    @Test
    public void testRefEq_objectWithExcludedFields_returnsNull() {
        String result = Matchers.refEq("test", "field1", "field2");
        assertNull(result);
    }

    @Test
    public void testRefEq_nullObjectAndEmptyExcludedFields_returnsNull() {
        Object result = Matchers.refEq(null);
        assertNull(result);
    }

    @Test
    public void testSame_validObject_returnsNull() {
        Object obj = new Object();
        Object result = Matchers.same(obj);
        assertNull(result);
    }

    @Test
    public void testSame_nullObject_returnsNull() {
        Object result = Matchers.same(null);
        assertNull(result);
    }

    @Test
    public void testIsNull_normalCall_returnsNull() {
        assertNull(Matchers.isNull());
    }

    @Test
    public void testNotNull_normalCall_returnsNull() {
        assertNull(Matchers.notNull());
    }

    @Test
    public void testIsNotNull_normalCall_returnsNull() {
        assertNull(Matchers.isNotNull());
    }

    @Test
    public void testContains_validSubstring_returnsEmptyString() {
        assertEquals("", Matchers.contains("substring"));
    }

    @Test
    public void testContains_emptySubstring_returnsEmptyString() {
        assertEquals("", Matchers.contains(""));
    }

    @Test
    public void testContains_nullSubstring_returnsEmptyString() {
        assertEquals("", Matchers.contains(null));
    }

    @Test
    public void testMatches_validRegex_returnsEmptyString() {
        assertEquals("", Matchers.matches(".*"));
    }

    @Test
    public void testMatches_emptyRegex_returnsEmptyString() {
        assertEquals("", Matchers.matches(""));
    }

    @Test
    public void testMatches_nullRegex_returnsEmptyString() {
        assertEquals("", Matchers.matches(null));
    }

    @Test
    public void testEndsWith_validSuffix_returnsEmptyString() {
        assertEquals("", Matchers.endsWith("suffix"));
    }

    @Test
    public void testEndsWith_emptySuffix_returnsEmptyString() {
        assertEquals("", Matchers.endsWith(""));
    }

    @Test
    public void testEndsWith_nullSuffix_returnsEmptyString() {
        assertEquals("", Matchers.endsWith(null));
    }

    @Test
    public void testStartsWith_validPrefix_returnsEmptyString() {
        assertEquals("", Matchers.startsWith("prefix"));
    }

    @Test
    public void testStartsWith_emptyPrefix_returnsEmptyString() {
        assertEquals("", Matchers.startsWith(""));
    }

    @Test
    public void testStartsWith_nullPrefix_returnsEmptyString() {
        assertEquals("", Matchers.startsWith(null));
    }

    @Test
    public void testArgThat_validMatcher_returnsNull() {
        @SuppressWarnings("unchecked")
        Matcher<String> matcher = (Matcher<String>) (Matcher<?>) dummyMatcher;
        String result = Matchers.argThat(matcher);
        assertNull(result);
    }

    @Test
    public void testArgThat_nullMatcher_returnsNull() {
        Object result = Matchers.argThat(null);
        assertNull(result);
    }

    @Test
    public void testCharThat_validMatcher_returnsZeroChar() {
        @SuppressWarnings("unchecked")
        Matcher<Character> matcher = (Matcher<Character>) (Matcher<?>) dummyMatcher;
        assertEquals('\u0000', Matchers.charThat(matcher));
    }

    @Test
    public void testCharThat_nullMatcher_returnsZeroChar() {
        assertEquals('\u0000', Matchers.charThat(null));
    }

    @Test
    public void testBooleanThat_validMatcher_returnsFalse() {
        @SuppressWarnings("unchecked")
        Matcher<Boolean> matcher = (Matcher<Boolean>) (Matcher<?>) dummyMatcher;
        assertFalse(Matchers.booleanThat(matcher));
    }

    @Test
    public void testBooleanThat_nullMatcher_returnsFalse() {
        assertFalse(Matchers.booleanThat(null));
    }

    @Test
    public void testByteThat_validMatcher_returnsZero() {
        @SuppressWarnings("unchecked")
        Matcher<Byte> matcher = (Matcher<Byte>) (Matcher<?>) dummyMatcher;
        assertEquals((byte) 0, Matchers.byteThat(matcher));
    }

    @Test
    public void testByteThat_nullMatcher_returnsZero() {
        assertEquals((byte) 0, Matchers.byteThat(null));
    }

    @Test
    public void testShortThat_validMatcher_returnsZero() {
        @SuppressWarnings("unchecked")
        Matcher<Short> matcher = (Matcher<Short>) (Matcher<?>) dummyMatcher;
        assertEquals((short) 0, Matchers.shortThat(matcher));
    }

    @Test
    public void testShortThat_nullMatcher_returnsZero() {
        assertEquals((short) 0, Matchers.shortThat(null));
    }

    @Test
    public void testIntThat_validMatcher_returnsZero() {
        @SuppressWarnings("unchecked")
        Matcher<Integer> matcher = (Matcher<Integer>) (Matcher<?>) dummyMatcher;
        assertEquals(0, Matchers.intThat(matcher));
    }

    @Test
    public void testIntThat_nullMatcher_returnsZero() {
        assertEquals(0, Matchers.intThat(null));
    }

    @Test
    public void testLongThat_validMatcher_returnsZero() {
        @SuppressWarnings("unchecked")
        Matcher<Long> matcher = (Matcher<Long>) (Matcher<?>) dummyMatcher;
        assertEquals(0L, Matchers.longThat(matcher));
    }

    @Test
    public void testLongThat_nullMatcher_returnsZero() {
        assertEquals(0L, Matchers.longThat(null));
    }

    @Test
    public void testFloatThat_validMatcher_returnsZero() {
        @SuppressWarnings("unchecked")
        Matcher<Float> matcher = (Matcher<Float>) (Matcher<?>) dummyMatcher;
        assertEquals(0.0f, Matchers.floatThat(matcher), 0.0001f);
    }

    @Test
    public void testFloatThat_nullMatcher_returnsZero() {
        assertEquals(0.0f, Matchers.floatThat(null), 0.0001f);
    }

    @Test
    public void testDoubleThat_validMatcher_returnsZero() {
        @SuppressWarnings("unchecked")
        Matcher<Double> matcher = (Matcher<Double>) (Matcher<?>) dummyMatcher;
        assertEquals(0.0d, Matchers.doubleThat(matcher), 0.0001d);
    }

    @Test
    public void testDoubleThat_nullMatcher_returnsZero() {
        assertEquals(0.0d, Matchers.doubleThat(null), 0.0001d);
    }
}
