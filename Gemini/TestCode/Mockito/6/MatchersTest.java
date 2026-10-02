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

    @Before
    @After
    public void resetMockingProgress() {
        new ThreadSafeMockingProgress().reset();
    }

    private static class DummyMatcher<T> extends BaseMatcher<T> {
        @Override
        public boolean matches(Object item) {
            return true;
        }

        @Override
        public void describeTo(Description description) {
            description.appendText("dummy matcher");
        }
    }

    @Test
    public void testConstructor_instantiation_shouldSucceed() {
        Matchers matchers = new Matchers();
        assertNotNull(matchers);
    }

    @Test
    public void testAnyBoolean_returnsFalse() {
        assertFalse(Matchers.anyBoolean());
    }

    @Test
    public void testAnyByte_returnsZero() {
        assertEquals((byte) 0, Matchers.anyByte());
    }

    @Test
    public void testAnyChar_returnsZero() {
        assertEquals((char) 0, Matchers.anyChar());
    }

    @Test
    public void testAnyInt_returnsZero() {
        assertEquals(0, Matchers.anyInt());
    }

    @Test
    public void testAnyLong_returnsZero() {
        assertEquals(0L, Matchers.anyLong());
    }

    @Test
    public void testAnyFloat_returnsZero() {
        assertEquals(0.0f, Matchers.anyFloat(), 0.0001f);
    }

    @Test
    public void testAnyDouble_returnsZero() {
        assertEquals(0.0d, Matchers.anyDouble(), 0.0001d);
    }

    @Test
    public void testAnyShort_returnsZero() {
        assertEquals((short) 0, Matchers.anyShort());
    }

    @Test
    public void testAnyObject_returnsNull() {
        assertNull(Matchers.anyObject());
    }

    @Test
    public void testAnyVararg_returnsNull() {
        assertNull(Matchers.anyVararg());
    }

    @Test
    public void testAnyClass_withObjectType_returnsNull() {
        assertNull(Matchers.any(String.class));
    }

    @Test
    public void testAnyClass_withPrimitiveType_returnsDefaultValue() {
        assertEquals(Integer.valueOf(0), Matchers.any(int.class));
        assertEquals(Boolean.FALSE, Matchers.any(boolean.class));
        assertEquals(Byte.valueOf((byte) 0), Matchers.any(byte.class));
        assertEquals(Character.valueOf((char) 0), Matchers.any(char.class));
        assertEquals(Long.valueOf(0L), Matchers.any(long.class));
        assertEquals(Float.valueOf(0.0f), Matchers.any(float.class));
        assertEquals(Double.valueOf(0.0d), Matchers.any(double.class));
        assertEquals(Short.valueOf((short) 0), Matchers.any(short.class));
    }

    @Test
    public void testAny_withoutParameters_returnsNull() {
        assertNull(Matchers.any());
    }

    @Test
    public void testAnyString_returnsEmptyString() {
        assertEquals("", Matchers.anyString());
    }

    @Test
    public void testAnyList_returnsEmptyList() {
        List<?> list = Matchers.anyList();
        assertNotNull(list);
        assertTrue(list.isEmpty());
    }

    @Test
    public void testAnyListOf_withClass_returnsEmptyList() {
        List<String> list = Matchers.anyListOf(String.class);
        assertNotNull(list);
        assertTrue(list.isEmpty());
    }

    @Test
    public void testAnySet_returnsEmptySet() {
        Set<?> set = Matchers.anySet();
        assertNotNull(set);
        assertTrue(set.isEmpty());
    }

    @Test
    public void testAnySetOf_withClass_returnsEmptySet() {
        Set<Integer> set = Matchers.anySetOf(Integer.class);
        assertNotNull(set);
        assertTrue(set.isEmpty());
    }

    @Test
    public void testAnyMap_returnsEmptyMap() {
        Map<?, ?> map = Matchers.anyMap();
        assertNotNull(map);
        assertTrue(map.isEmpty());
    }

    @Test
    public void testAnyMapOf_withKeyAndValueClasses_returnsEmptyMap() {
        Map<String, Integer> map = Matchers.anyMapOf(String.class, Integer.class);
        assertNotNull(map);
        assertTrue(map.isEmpty());
    }

    @Test
    public void testAnyCollection_returnsEmptyCollection() {
        Collection<?> collection = Matchers.anyCollection();
        assertNotNull(collection);
        assertTrue(collection.isEmpty());
    }

    @Test
    public void testAnyCollectionOf_withClass_returnsEmptyCollection() {
        Collection<String> collection = Matchers.anyCollectionOf(String.class);
        assertNotNull(collection);
        assertTrue(collection.isEmpty());
    }

    @Test
    public void testIsA_withClass_returnsNull() {
        assertNull(Matchers.isA(String.class));
    }

    @Test
    public void testEq_boolean_returnsFalse() {
        assertFalse(Matchers.eq(true));
        assertFalse(Matchers.eq(false));
    }

    @Test
    public void testEq_byte_returnsZero() {
        assertEquals((byte) 0, Matchers.eq((byte) 10));
        assertEquals((byte) 0, Matchers.eq((byte) -10));
        assertEquals((byte) 0, Matchers.eq((byte) 0));
    }

    @Test
    public void testEq_char_returnsZero() {
        assertEquals((char) 0, Matchers.eq('a'));
        assertEquals((char) 0, Matchers.eq('\0'));
    }

    @Test
    public void testEq_double_returnsZero() {
        assertEquals(0.0d, Matchers.eq(12.34d), 0.0001d);
        assertEquals(0.0d, Matchers.eq(-12.34d), 0.0001d);
        assertEquals(0.0d, Matchers.eq(0.0d), 0.0001d);
    }

    @Test
    public void testEq_float_returnsZero() {
        assertEquals(0.0f, Matchers.eq(12.34f), 0.0001f);
        assertEquals(0.0f, Matchers.eq(-12.34f), 0.0001f);
        assertEquals(0.0f, Matchers.eq(0.0f), 0.0001f);
    }

    @Test
    public void testEq_int_returnsZero() {
        assertEquals(0, Matchers.eq(42));
        assertEquals(0, Matchers.eq(-42));
        assertEquals(0, Matchers.eq(0));
    }

    @Test
    public void testEq_long_returnsZero() {
        assertEquals(0L, Matchers.eq(100L));
        assertEquals(0L, Matchers.eq(-100L));
        assertEquals(0L, Matchers.eq(0L));
    }

    @Test
    public void testEq_short_returnsZero() {
        assertEquals((short) 0, Matchers.eq((short) 5));
        assertEquals((short) 0, Matchers.eq((short) -5));
        assertEquals((short) 0, Matchers.eq((short) 0));
    }

    @Test
    public void testEq_object_returnsNull() {
        assertNull(Matchers.eq("expectedString"));
        assertNull(Matchers.eq((Object) null));
    }

    @Test
    public void testRefEq_withNonNullObjectAndFields_returnsNull() {
        String value = "test";
        assertNull(Matchers.refEq(value, "field1", "field2"));
    }

    @Test
    public void testRefEq_withNullObjectAndEmptyFields_returnsNull() {
        assertNull(Matchers.refEq(null));
    }

    @Test
    public void testSame_returnsNull() {
        Object obj = new Object();
        assertNull(Matchers.same(obj));
        assertNull(Matchers.same(null));
    }

    @Test
    public void testIsNull_withoutParameters_returnsNull() {
        assertNull(Matchers.isNull());
    }

    @Test
    public void testIsNull_withClass_returnsNull() {
        assertNull(Matchers.isNull(String.class));
    }

    @Test
    public void testNotNull_withoutParameters_returnsNull() {
        assertNull(Matchers.notNull());
    }

    @Test
    public void testNotNull_withClass_returnsNull() {
        assertNull(Matchers.notNull(String.class));
    }

    @Test
    public void testIsNotNull_withoutParameters_returnsNull() {
        assertNull(Matchers.isNotNull());
    }

    @Test
    public void testIsNotNull_withClass_returnsNull() {
        assertNull(Matchers.isNotNull(String.class));
    }

    @Test
    public void testContains_returnsEmptyString() {
        assertEquals("", Matchers.contains("substring"));
        assertEquals("", Matchers.contains(""));
    }

    @Test
    public void testMatches_returnsEmptyString() {
        assertEquals("", Matchers.matches(".*"));
        assertEquals("", Matchers.matches(""));
    }

    @Test
    public void testEndsWith_returnsEmptyString() {
        assertEquals("", Matchers.endsWith("suffix"));
        assertEquals("", Matchers.endsWith(""));
    }

    @Test
    public void testStartsWith_returnsEmptyString() {
        assertEquals("", Matchers.startsWith("prefix"));
        assertEquals("", Matchers.startsWith(""));
    }

    @Test
    public void testArgThat_returnsNull() {
        Matcher<Object> matcher = new DummyMatcher<Object>();
        assertNull(Matchers.argThat(matcher));
    }

    @Test
    public void testCharThat_returnsZero() {
        Matcher<Character> matcher = new DummyMatcher<Character>();
        assertEquals((char) 0, Matchers.charThat(matcher));
    }

    @Test
    public void testBooleanThat_returnsFalse() {
        Matcher<Boolean> matcher = new DummyMatcher<Boolean>();
        assertFalse(Matchers.booleanThat(matcher));
    }

    @Test
    public void testByteThat_returnsZero() {
        Matcher<Byte> matcher = new DummyMatcher<Byte>();
        assertEquals((byte) 0, Matchers.byteThat(matcher));
    }

    @Test
    public void testShortThat_returnsZero() {
        Matcher<Short> matcher = new DummyMatcher<Short>();
        assertEquals((short) 0, Matchers.shortThat(matcher));
    }

    @Test
    public void testIntThat_returnsZero() {
        Matcher<Integer> matcher = new DummyMatcher<Integer>();
        assertEquals(0, Matchers.intThat(matcher));
    }

    @Test
    public void testLongThat_returnsZero() {
        Matcher<Long> matcher = new DummyMatcher<Long>();
        assertEquals(0L, Matchers.longThat(matcher));
    }

    @Test
    public void testFloatThat_returnsZero() {
        Matcher<Float> matcher = new DummyMatcher<Float>();
        assertEquals(0.0f, Matchers.floatThat(matcher), 0.0001f);
    }

    @Test
    public void testDoubleThat_returnsZero() {
        Matcher<Double> matcher = new DummyMatcher<Double>();
        assertEquals(0.0d, Matchers.doubleThat(matcher), 0.0001d);
    }
}
