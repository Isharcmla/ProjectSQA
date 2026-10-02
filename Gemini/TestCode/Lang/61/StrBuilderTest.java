package org.apache.commons.lang.text;

import org.apache.commons.lang.SystemUtils;
import org.junit.Test;

import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class StrBuilderTest {

    @Test
    public void testConstructors() {
        StrBuilder sb1 = new StrBuilder();
        assertEquals(32, sb1.capacity());
        assertEquals(0, sb1.length());

        StrBuilder sb2 = new StrBuilder(10);
        assertEquals(10, sb2.capacity());
        assertEquals(0, sb2.length());

        StrBuilder sb3 = new StrBuilder(-5);
        assertEquals(32, sb3.capacity());

        StrBuilder sb4 = new StrBuilder(0);
        assertEquals(32, sb4.capacity());

        StrBuilder sb5 = new StrBuilder((String) null);
        assertEquals(32, sb5.capacity());
        assertEquals(0, sb5.length());

        StrBuilder sb6 = new StrBuilder("hello");
        assertEquals(5 + 32, sb6.capacity());
        assertEquals(5, sb6.length());
        assertEquals("hello", sb6.toString());
    }

    @Test
    public void testGetSetNewLineText() {
        StrBuilder sb = new StrBuilder();
        assertNull(sb.getNewLineText());
        sb.setNewLineText("\r\n");
        assertEquals("\r\n", sb.getNewLineText());
        sb.setNewLineText(null);
        assertNull(sb.getNewLineText());
    }

    @Test
    public void testGetSetNullText() {
        StrBuilder sb = new StrBuilder();
        assertNull(sb.getNullText());
        sb.setNullText("<null>");
        assertEquals("<null>", sb.getNullText());
        sb.setNullText("");
        assertNull(sb.getNullText());
        sb.setNullText(null);
        assertNull(sb.getNullText());
    }

    @Test
    public void testLengthAndSetLength() {
        StrBuilder sb = new StrBuilder("hello");
        assertEquals(5, sb.length());
        assertEquals(5, sb.size());

        sb.setLength(3);
        assertEquals(3, sb.length());
        assertEquals("hel", sb.toString());

        sb.setLength(5);
        assertEquals(5, sb.length());
        assertEquals("hel\0\0", sb.toString());

        sb.setLength(5);
        assertEquals(5, sb.length());

        try {
            sb.setLength(-1);
            fail("Expected StringIndexOutOfBoundsException");
        } catch (StringIndexOutOfBoundsException e) {
            // expected
        }
    }

    @Test
    public void testCapacityAndEnsureMinimize() {
        StrBuilder sb = new StrBuilder(10);
        assertEquals(10, sb.capacity());
        sb.ensureCapacity(5);
        assertEquals(10, sb.capacity());
        sb.ensureCapacity(20);
        assertEquals(20, sb.capacity());

        sb.append("12345");
        assertEquals(5, sb.length());
        assertEquals(20, sb.capacity());
        sb.minimizeCapacity();
        assertEquals(5, sb.capacity());
        sb.minimizeCapacity();
        assertEquals(5, sb.capacity());
    }

    @Test
    public void testIsEmptyAndClear() {
        StrBuilder sb = new StrBuilder();
        assertTrue(sb.isEmpty());
        sb.append("test");
        assertFalse(sb.isEmpty());
        sb.clear();
        assertTrue(sb.isEmpty());
        assertEquals(0, sb.length());
    }

    @Test
    public void testCharAtAndSetCharAtAndDeleteCharAt() {
        StrBuilder sb = new StrBuilder("hello");
        assertEquals('h', sb.charAt(0));
        assertEquals('o', sb.charAt(4));

        try {
            sb.charAt(-1);
            fail();
        } catch (StringIndexOutOfBoundsException e) {
        }
        try {
            sb.charAt(5);
            fail();
        } catch (StringIndexOutOfBoundsException e) {
        }

        sb.setCharAt(0, 'H');
        assertEquals("Hello", sb.toString());
        try {
            sb.setCharAt(-1, 'X');
            fail();
        } catch (StringIndexOutOfBoundsException e) {
        }
        try {
            sb.setCharAt(5, 'X');
            fail();
        } catch (StringIndexOutOfBoundsException e) {
        }

        sb.deleteCharAt(1);
        assertEquals("Hllo", sb.toString());
        try {
            sb.deleteCharAt(-1);
            fail();
        } catch (StringIndexOutOfBoundsException e) {
        }
        try {
            sb.deleteCharAt(4);
            fail();
        } catch (StringIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void testToCharArray() {
        StrBuilder sb = new StrBuilder();
        assertArrayEquals(new char[0], sb.toCharArray());

        sb.append("hello");
        assertArrayEquals(new char[]{'h', 'e', 'l', 'l', 'o'}, sb.toCharArray());

        assertArrayEquals(new char[0], sb.toCharArray(1, 1));
        assertArrayEquals(new char[]{'e', 'l'}, sb.toCharArray(1, 3));
        assertArrayEquals(new char[]{'l', 'o'}, sb.toCharArray(3, 10));

        try {
            sb.toCharArray(-1, 2);
            fail();
        } catch (StringIndexOutOfBoundsException e) {
        }
        try {
            sb.toCharArray(3, 2);
            fail();
        } catch (StringIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void testGetChars() {
        StrBuilder sb = new StrBuilder("hello");
        char[] dest = sb.getChars(null);
        assertArrayEquals(new char[]{'h', 'e', 'l', 'l', 'o'}, dest);

        char[] smallDest = new char[2];
        dest = sb.getChars(smallDest);
        assertEquals(5, dest.length);

        char[] largeDest = new char[10];
        dest = sb.getChars(largeDest);
        assertEquals(10, dest.length);
        assertEquals('h', dest[0]);

        char[] target = new char[5];
        sb.getChars(1, 4, target, 1);
        assertEquals('\0', target[0]);
        assertEquals('e', target[1]);
        assertEquals('l', target[2]);
        assertEquals('l', target[3]);
        assertEquals('\0', target[4]);

        try {
            sb.getChars(-1, 2, target, 0);
            fail();
        } catch (StringIndexOutOfBoundsException e) {
        }
        try {
            sb.getChars(0, -1, target, 0);
            fail();
        } catch (StringIndexOutOfBoundsException e) {
        }
        try {
            sb.getChars(0, 10, target, 0);
            fail();
        } catch (StringIndexOutOfBoundsException e) {
        }
        try {
            sb.getChars(3, 2, target, 0);
            fail();
        } catch (StringIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void testAppendNewLine() {
        StrBuilder sb = new StrBuilder();
        sb.appendNewLine();
        assertEquals(SystemUtils.LINE_SEPARATOR, sb.toString());

        sb.clear();
        sb.setNewLineText("\n");
        sb.appendNewLine();
        assertEquals("\n", sb.toString());
    }

    @Test
    public void testAppendNull() {
        StrBuilder sb = new StrBuilder();
        sb.appendNull();
        assertEquals("", sb.toString());

        sb.setNullText("<null>");
        sb.appendNull();
        assertEquals("<null>", sb.toString());
    }

    @Test
    public void testAppendObject() {
        StrBuilder sb = new StrBuilder();
        sb.append((Object) null);
        assertEquals("", sb.toString());

        sb.setNullText("-");
        sb.append((Object) null);
        assertEquals("-", sb.toString());

        sb.append(Integer.valueOf(123));
        assertEquals("-123", sb.toString());
    }

    @Test
    public void testAppendString() {
        StrBuilder sb = new StrBuilder();
        sb.append((String) null);
        assertEquals("", sb.toString());

        sb.append("");
        assertEquals("", sb.toString());

        sb.append("foo");
        assertEquals("foo", sb.toString());
    }

    @Test
    public void testAppendStringWithIndices() {
        StrBuilder sb = new StrBuilder();
        sb.append((String) null, 0, 0);
        assertEquals("", sb.toString());

        sb.append("hello", 1, 3);
        assertEquals("ell", sb.toString());

        sb.append("hello", 0, 0);
        assertEquals("ell", sb.toString());

        try {
            sb.append("hello", -1, 2);
            fail();
        } catch (StringIndexOutOfBoundsException e) {
        }
        try {
            sb.append("hello", 6, 0);
            fail();
        } catch (StringIndexOutOfBoundsException e) {
        }
        try {
            sb.append("hello", 1, -1);
            fail();
        } catch (StringIndexOutOfBoundsException e) {
        }
        try {
            sb.append("hello", 2, 4);
            fail();
        } catch (StringIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void testAppendStringBuffer() {
        StrBuilder sb = new StrBuilder();
        sb.append((StringBuffer) null);
        assertEquals("", sb.toString());

        sb.append(new StringBuffer(""));
        assertEquals("", sb.toString());

        sb.append(new StringBuffer("abc"));
        assertEquals("abc", sb.toString());

        sb.append((StringBuffer) null, 0, 0);
        assertEquals("abc", sb.toString());

        sb.append(new StringBuffer("world"), 1, 3);
        assertEquals("abcorl", sb.toString());

        sb.append(new StringBuffer("world"), 0, 0);
        assertEquals("abcorl", sb.toString());

        try {
            sb.append(new StringBuffer("test"), -1, 1);
            fail();
        } catch (StringIndexOutOfBoundsException e) {
        }
        try {
            sb.append(new StringBuffer("test"), 5, 0);
            fail();
        } catch (StringIndexOutOfBoundsException e) {
        }
        try {
            sb.append(new StringBuffer("test"), 1, -1);
            fail();
        } catch (StringIndexOutOfBoundsException e) {
        }
        try {
            sb.append(new StringBuffer("test"), 2, 3);
            fail();
        } catch (StringIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void testAppendStrBuilder() {
        StrBuilder sb = new StrBuilder();
        sb.append((StrBuilder) null);
        assertEquals("", sb.toString());

        sb.append(new StrBuilder(""));
        assertEquals("", sb.toString());

        sb.append(new StrBuilder("abc"));
        assertEquals("abc", sb.toString());

        sb.append((StrBuilder) null, 0, 0);
        assertEquals("abc", sb.toString());

        sb.append(new StrBuilder("world"), 1, 3);
        assertEquals("abcorl", sb.toString());

        sb.append(new StrBuilder("world"), 0, 0);
        assertEquals("abcorl", sb.toString());

        try {
            sb.append(new StrBuilder("test"), -1, 1);
            fail();
        } catch (StringIndexOutOfBoundsException e) {
        }
        try {
            sb.append(new StrBuilder("test"), 5, 0);
            fail();
        } catch (StringIndexOutOfBoundsException e) {
        }
        try {
            sb.append(new StrBuilder("test"), 1, -1);
            fail();
        } catch (StringIndexOutOfBoundsException e) {
        }
        try {
            sb.append(new StrBuilder("test"), 2, 3);
            fail();
        } catch (StringIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void testAppendCharArray() {
        StrBuilder sb = new StrBuilder();
        sb.append((char[]) null);
        assertEquals("", sb.toString());

        sb.append(new char[0]);
        assertEquals("", sb.toString());

        sb.append(new char[]{'a', 'b', 'c'});
        assertEquals("abc", sb.toString());

        sb.append((char[]) null, 0, 0);
        assertEquals("abc", sb.toString());

        sb.append(new char[]{'w', 'o', 'r', 'l', 'd'}, 1, 3);
        assertEquals("abcorl", sb.toString());

        sb.append(new char[]{'w', 'o', 'r', 'l', 'd'}, 0, 0);
        assertEquals("abcorl", sb.toString());

        try {
            sb.append(new char[]{'t'}, -1, 1);
            fail();
        } catch (StringIndexOutOfBoundsException e) {
        }
        try {
            sb.append(new char[]{'t'}, 2, 0);
            fail();
        } catch (StringIndexOutOfBoundsException e) {
        }
        try {
            sb.append(new char[]{'t'}, 0, -1);
            fail();
        } catch (StringIndexOutOfBoundsException e) {
        }
        try {
            sb.append(new char[]{'t'}, 0, 2);
            fail();
        } catch (StringIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void testAppendPrimitives() {
        StrBuilder sb = new StrBuilder();
        sb.append(true).append(false);
        assertEquals("truefalse", sb.toString());

        sb.clear();
        sb.append('x');
        assertEquals("x", sb.toString());

        sb.clear();
        sb.append(123);
        assertEquals("123", sb.toString());

        sb.clear();
        sb.append(1234567890123L);
        assertEquals("1234567890123", sb.toString());

        sb.clear();
        sb.append(1.5f);
        assertEquals("1.5", sb.toString());

        sb.clear();
        sb.append(2.5d);
        assertEquals("2.5", sb.toString());
    }

    @Test
    public void testAppendWithSeparatorsArray() {
        StrBuilder sb = new StrBuilder();
        sb.appendWithSeparators((Object[]) null, ",");
        assertEquals("", sb.toString());

        sb.appendWithSeparators(new Object[0], ",");
        assertEquals("", sb.toString());

        sb.appendWithSeparators(new Object[]{"a"}, ",");
        assertEquals("a", sb.toString());

        sb.clear();
        sb.appendWithSeparators(new Object[]{"a", "b", "c"}, ",");
        assertEquals("a,b,c", sb.toString());

        sb.clear();
        sb.appendWithSeparators(new Object[]{"a", "b"}, null);
        assertEquals("ab", sb.toString());
    }

    @Test
    public void testAppendWithSeparatorsCollection() {
        StrBuilder sb = new StrBuilder();
        sb.appendWithSeparators((List<?>) null, ",");
        assertEquals("", sb.toString());

        sb.appendWithSeparators(Collections.emptyList(), ",");
        assertEquals("", sb.toString());

        sb.appendWithSeparators(Collections.singletonList("a"), ",");
        assertEquals("a", sb.toString());

        sb.clear();
        sb.appendWithSeparators(Arrays.asList("a", "b", "c"), ",");
        assertEquals("a,b,c", sb.toString());

        sb.clear();
        sb.appendWithSeparators(Arrays.asList("a", "b"), null);
        assertEquals("ab", sb.toString());
    }

    @Test
    public void testAppendWithSeparatorsIterator() {
        StrBuilder sb = new StrBuilder();
        sb.appendWithSeparators((Iterator<?>) null, ",");
        assertEquals("", sb.toString());

        sb.appendWithSeparators(Collections.emptyList().iterator(), ",");
        assertEquals("", sb.toString());

        sb.appendWithSeparators(Collections.singletonList("a").iterator(), ",");
        assertEquals("a", sb.toString());

        sb.clear();
        sb.appendWithSeparators(Arrays.asList("a", "b", "c").iterator(), ",");
        assertEquals("a,b,c", sb.toString());

        sb.clear();
        sb.appendWithSeparators(Arrays.asList("a", "b").iterator(), null);
        assertEquals("ab", sb.toString());
    }

    @Test
    public void testAppendPadding() {
        StrBuilder sb = new StrBuilder("a");
        sb.appendPadding(-1, '-');
        assertEquals("a", sb.toString());

        sb.appendPadding(0, '-');
        assertEquals("a", sb.toString());

        sb.appendPadding(3, '-');
        assertEquals("a---", sb.toString());
    }

    @Test
    public void testAppendFixedWidthPadLeft() {
        StrBuilder sb = new StrBuilder();
        sb.appendFixedWidthPadLeft("abc", -1, ' ');
        assertEquals("", sb.toString());

        sb.appendFixedWidthPadLeft("abc", 0, ' ');
        assertEquals("", sb.toString());

        sb.appendFixedWidthPadLeft("abc", 2, ' ');
        assertEquals("bc", sb.toString());

        sb.clear();
        sb.appendFixedWidthPadLeft("abc", 5, '-');
        assertEquals("--abc", sb.toString());

        sb.clear();
        sb.setNullText("null");
        sb.appendFixedWidthPadLeft(null, 6, '-');
        assertEquals("--null", sb.toString());

        sb.clear();
        sb.appendFixedWidthPadLeft(123, 5, '0');
        assertEquals("00123", sb.toString());

        sb.clear();
        sb.appendFixedWidthPadLeft(123, 2, '0');
        assertEquals("23", sb.toString());
    }

    @Test
    public void testAppendFixedWidthPadRight() {
        StrBuilder sb = new StrBuilder();
        sb.appendFixedWidthPadRight("abc", -1, ' ');
        assertEquals("", sb.toString());

        sb.appendFixedWidthPadRight("abc", 0, ' ');
        assertEquals("", sb.toString());

        sb.appendFixedWidthPadRight("abc", 2, ' ');
        assertEquals("ab", sb.toString());

        sb.clear();
        sb.appendFixedWidthPadRight("abc", 5, '-');
        assertEquals("abc--", sb.toString());

        sb.clear();
        sb.setNullText("null");
        sb.appendFixedWidthPadRight(null, 6, '-');
        assertEquals("null--", sb.toString());

        sb.clear();
        sb.appendFixedWidthPadRight(123, 5, '0');
        assertEquals("12300", sb.toString());

        sb.clear();
        sb.appendFixedWidthPadRight(123, 2, '0');
        assertEquals("12", sb.toString());
    }

    @Test
    public void testInsertObjectAndString() {
        StrBuilder sb = new StrBuilder("ac");
        sb.insert(1, "b");
        assertEquals("abc", sb.toString());

        sb.setNullText("<null>");
        sb.insert(1, (Object) null);
        assertEquals("a<null>bc", sb.toString());

        sb.clear().append("ac");
        sb.insert(1, (String) null);
        assertEquals("a<null>bc", sb.toString());

        sb.clear().append("ac");
        sb.setNullText(null);
        sb.insert(1, (String) null);
        assertEquals("ac", sb.toString());

        sb.clear().append("ac");
        sb.insert(1, "");
        assertEquals("ac", sb.toString());

        sb.clear().append("ac");
        sb.insert(1, Integer.valueOf(2));
        assertEquals("a2c", sb.toString());

        try {
            sb.insert(-1, "x");
            fail();
        } catch (StringIndexOutOfBoundsException e) {
        }
        try {
            sb.insert(4, "x");
            fail();
        } catch (StringIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void testInsertCharArray() {
        StrBuilder sb = new StrBuilder("ac");
        sb.insert(1, new char[]{'b'});
        assertEquals("abc", sb.toString());

        sb.clear().append("ac");
        sb.insert(1, new char[0]);
        assertEquals("ac", sb.toString());

        sb.insert(1, (char[]) null);
        assertEquals("ac", sb.toString());

        sb.setNullText("null");
        sb.insert(1, (char[]) null);
        assertEquals("anullc", sb.toString());

        try {
            sb.insert(-1, new char[]{'x'});
            fail();
        } catch (StringIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void testInsertCharArrayWithOffsetLength() {
        StrBuilder sb = new StrBuilder("ac");
        sb.insert(1, new char[]{'x', 'b', 'y'}, 1, 1);
        assertEquals("abc", sb.toString());

        sb.insert(1, new char[]{'x'}, 0, 0);
        assertEquals("abc", sb.toString());

        sb.insert(1, (char[]) null, 0, 0);
        assertEquals("abc", sb.toString());

        sb.setNullText("null");
        sb.insert(1, (char[]) null, 0, 0);
        assertEquals("anullbc", sb.toString());

        try {
            sb.insert(-1, new char[]{'x'}, 0, 1);
            fail();
        } catch (StringIndexOutOfBoundsException e) {
        }
        try {
            sb.insert(0, new char[]{'x'}, -1, 1);
            fail();
        } catch (StringIndexOutOfBoundsException e) {
        }
        try {
            sb.insert(0, new char[]{'x'}, 2, 0);
            fail();
        } catch (StringIndexOutOfBoundsException e) {
        }
        try {
            sb.insert(0, new char[]{'x'}, 0, -1);
            fail();
        } catch (StringIndexOutOfBoundsException e) {
        }
        try {
            sb.insert(0, new char[]{'x'}, 0, 2);
            fail();
        } catch (StringIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void testInsertPrimitives() {
        StrBuilder sb = new StrBuilder("ac");
        sb.insert(1, true);
        assertEquals("atruec", sb.toString());

        sb.insert(1, false);
        assertEquals("afalsetruec", sb.toString());

        sb.clear().append("ac");
        sb.insert(1, 'b');
        assertEquals("abc", sb.toString());

        sb.clear().append("ac");
        sb.insert(1, 2);
        assertEquals("a2c", sb.toString());

        sb.clear().append("ac");
        sb.insert(1, 2L);
        assertEquals("a2c", sb.toString());

        sb.clear().append("ac");
        sb.insert(1, 2.5f);
        assertEquals("a2.5c", sb.toString());

        sb.clear().append("ac");
        sb.insert(1, 2.5d);
        assertEquals("a2.5c", sb.toString());
    }

    @Test
    public void testDelete() {
        StrBuilder sb = new StrBuilder("hello world");
        sb.delete(5, 5);
        assertEquals("hello world", sb.toString());

        sb.delete(5, 11);
        assertEquals("hello", sb.toString());

        sb.delete(1, 100);
        assertEquals("h", sb.toString());

        try {
            sb.delete(-1, 1);
            fail();
        } catch (StringIndexOutOfBoundsException e) {
        }
        try {
            sb.delete(2, 1);
            fail();
        } catch (StringIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void testDeleteAllAndDeleteFirstChar() {
        StrBuilder sb = new StrBuilder("banana");
        sb.deleteFirst('a');
        assertEquals("bnana", sb.toString());
        sb.deleteFirst('z');
        assertEquals("bnana", sb.toString());

        sb.clear().append("banana");
        sb.deleteAll('a');
        assertEquals("bnn", sb.toString());

        sb.clear().append("baaa");
        sb.deleteAll('a');
        assertEquals("b", sb.toString());

        sb.clear().append("bbb");
        sb.deleteAll('b');
        assertEquals("", sb.toString());

        sb.deleteAll('z');
        assertEquals("", sb.toString());
    }

    @Test
    public void testDeleteAllAndDeleteFirstString() {
        StrBuilder sb = new StrBuilder("banana");
        sb.deleteFirst((String) null);
        assertEquals("banana", sb.toString());
        sb.deleteFirst("");
        assertEquals("banana", sb.toString());
        sb.deleteFirst("an");
        assertEquals("bana", sb.toString());
        sb.deleteFirst("xyz");
        assertEquals("bana", sb.toString());

        sb.clear().append("banana");
        sb.deleteAll((String) null);
        assertEquals("banana", sb.toString());
        sb.deleteAll("");
        assertEquals("banana", sb.toString());
        sb.deleteAll("an");
        assertEquals("ba", sb.toString());
        sb.deleteAll("xyz");
        assertEquals("ba", sb.toString());
    }

    @Test
    public void testDeleteAllAndDeleteFirstMatcher() {
        StrBuilder sb = new StrBuilder("a1b2c3");
        sb.deleteFirst((StrMatcher) null);
        assertEquals("a1b2c3", sb.toString());

        sb.deleteFirst(StrMatcher.charSetMatcher("123"));
        assertEquals("ab2c3", sb.toString());

        sb.deleteAll((StrMatcher) null);
        assertEquals("ab2c3", sb.toString());

        sb.deleteAll(StrMatcher.charSetMatcher("23"));
        assertEquals("abc", sb.toString());
    }

    @Test
    public void testReplace() {
        StrBuilder sb = new StrBuilder("hello world");
        sb.replace(5, 11, " there");
        assertEquals("hello there", sb.toString());

        sb.replace(5, 11, null);
        assertEquals("hello", sb.toString());

        sb.replace(1, 100, "i");
        assertEquals("hi", sb.toString());
    }

    @Test
    public void testReplaceAllAndReplaceFirstChar() {
        StrBuilder sb = new StrBuilder("banana");
        sb.replaceAll('a', 'a');
        assertEquals("banana", sb.toString());

        sb.replaceAll('a', 'o');
        assertEquals("bonono", sb.toString());

        sb.replaceFirst('o', 'o');
        assertEquals("bonono", sb.toString());

        sb.replaceFirst('o', 'a');
        assertEquals("banono", sb.toString());

        sb.replaceFirst('z', 'x');
        assertEquals("banono", sb.toString());
    }

    @Test
    public void testReplaceAllAndReplaceFirstString() {
        StrBuilder sb = new StrBuilder("banana");
        sb.replaceAll((String) null, "x");
        assertEquals("banana", sb.toString());

        sb.replaceAll("", "x");
        assertEquals("banana", sb.toString());

        sb.replaceAll("an", "on");
        assertEquals("bonona", sb.toString());

        sb.replaceAll("on", null);
        assertEquals("ba", sb.toString());

        sb.clear().append("banana");
        sb.replaceFirst((String) null, "x");
        assertEquals("banana", sb.toString());

        sb.replaceFirst("", "x");
        assertEquals("banana", sb.toString());

        sb.replaceFirst("an", "on");
        assertEquals("bonana", sb.toString());

        sb.replaceFirst("na", null);
        assertEquals("bona", sb.toString());

        sb.replaceFirst("xyz", "abc");
        assertEquals("bona", sb.toString());
    }

    @Test
    public void testReplaceAllAndReplaceFirstMatcher() {
        StrBuilder sb = new StrBuilder("a1b2");
        sb.replaceAll((StrMatcher) null, "x");
        assertEquals("a1b2", sb.toString());

        sb.replaceAll(StrMatcher.charSetMatcher("12"), "0");
        assertEquals("a0b0", sb.toString());

        sb.clear().append("a1b2");
        sb.replaceFirst((StrMatcher) null, "x");
        assertEquals("a1b2", sb.toString());

        sb.replaceFirst(StrMatcher.charSetMatcher("12"), "0");
        assertEquals("a0b2", sb.toString());

        sb.clear().append("a1b2");
        sb.replace(StrMatcher.charSetMatcher("12"), "0", 0, 4, 1);
        assertEquals("a0b2", sb.toString());

        StrBuilder empty = new StrBuilder();
        empty.replace(StrMatcher.charSetMatcher("1"), "x", 0, 0, -1);
        assertEquals("", empty.toString());
    }

    @Test
    public void testReverse() {
        StrBuilder sb = new StrBuilder();
        sb.reverse();
        assertEquals("", sb.toString());

        sb.append("a");
        sb.reverse();
        assertEquals("a", sb.toString());

        sb.clear().append("ab");
        sb.reverse();
        assertEquals("ba", sb.toString());

        sb.clear().append("abc");
        sb.reverse();
        assertEquals("cba", sb.toString());
    }

    @Test
    public void testTrim() {
        StrBuilder sb = new StrBuilder();
        sb.trim();
        assertEquals("", sb.toString());

        sb.append("   ");
        sb.trim();
        assertEquals("", sb.toString());

        sb.clear().append("  abc  ");
        sb.trim();
        assertEquals("abc", sb.toString());

        sb.clear().append("abc");
        sb.trim();
        assertEquals("abc", sb.toString());
    }

    @Test
    public void testStartsWithAndEndsWith() {
        StrBuilder sb = new StrBuilder("hello world");
        assertFalse(sb.startsWith(null));
        assertTrue(sb.startsWith(""));
        assertTrue(sb.startsWith("hello"));
        assertFalse(sb.startsWith("world"));
        assertFalse(sb.startsWith("hello world longer"));
        assertFalse(sb.startsWith("help"));

        assertFalse(sb.endsWith(null));
        assertTrue(sb.endsWith(""));
        assertTrue(sb.endsWith("world"));
        assertFalse(sb.endsWith("hello"));
        assertFalse(sb.endsWith("hello world longer"));
        assertFalse(sb.endsWith("word"));
    }

    @Test
    public void testSubstring() {
        StrBuilder sb = new StrBuilder("hello world");
        assertEquals("world", sb.substring(6));
        assertEquals("hello", sb.substring(0, 5));
        assertEquals("world", sb.substring(6, 20));

        try {
            sb.substring(-1);
            fail();
        } catch (StringIndexOutOfBoundsException e) {
        }
        try {
            sb.substring(6, 4);
            fail();
        } catch (StringIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void testLeftRightMidString() {
        StrBuilder sb = new StrBuilder("hello world");

        assertEquals("", sb.leftString(-1));
        assertEquals("", sb.leftString(0));
        assertEquals("hel", sb.leftString(3));
        assertEquals("hello world", sb.leftString(20));

        assertEquals("", sb.rightString(-1));
        assertEquals("", sb.rightString(0));
        assertEquals("rld", sb.rightString(3));
        assertEquals("hello world", sb.rightString(20));

        assertEquals("", sb.midString(-1, -1));
        assertEquals("", sb.midString(0, 0));
        assertEquals("", sb.midString(20, 2));
        assertEquals("hel", sb.midString(-1, 3));
        assertEquals("world", sb.midString(6, 10));
        assertEquals("lo", sb.midString(3, 2));
    }

    @Test
    public void testContainsCharAndStringAndMatcher() {
        StrBuilder sb = new StrBuilder("hello world");
        assertTrue(sb.contains('h'));
        assertTrue(sb.contains('d'));
        assertFalse(sb.contains('z'));

        assertTrue(sb.contains("hello"));
        assertFalse(sb.contains("xyz"));
        assertFalse(sb.contains((String) null));

        assertTrue(sb.contains(StrMatcher.stringMatcher("world")));
        assertFalse(sb.contains(StrMatcher.stringMatcher("xyz")));
        assertFalse(sb.contains((StrMatcher) null));
    }

    @Test
    public void testIndexOfChar() {
        StrBuilder sb = new StrBuilder("banana");
        assertEquals(0, sb.indexOf('b'));
        assertEquals(1, sb.indexOf('a'));
        assertEquals(-1, sb.indexOf('z'));

        assertEquals(1, sb.indexOf('a', -1));
        assertEquals(1, sb.indexOf('a', 0));
        assertEquals(1, sb.indexOf('a', 1));
        assertEquals(3, sb.indexOf('a', 2));
        assertEquals(-1, sb.indexOf('a', 10));
    }

    @Test
    public void testIndexOfString() {
        StrBuilder sb = new StrBuilder("banana");
        assertEquals(-1, sb.indexOf((String) null));
        assertEquals(-1, sb.indexOf((String) null, 0));
        assertEquals(0, sb.indexOf(""));
        assertEquals(2, sb.indexOf("", 2));
        assertEquals(-1, sb.indexOf("a", 10));
        assertEquals(1, sb.indexOf("a"));
        assertEquals(1, sb.indexOf("an"));
        assertEquals(3, sb.indexOf("an", 2));
        assertEquals(-1, sb.indexOf("xyz"));
        assertEquals(-1, sb.indexOf("longerthansource"));
        assertEquals(0, sb.indexOf("banana"));
        assertEquals(-1, sb.indexOf("banana", 1));

        StrBuilder sb2 = new StrBuilder("ba");
        assertEquals(-1, sb2.indexOf("bx"));
    }

    @Test
    public void testIndexOfMatcher() {
        StrBuilder sb = new StrBuilder("banana");
        assertEquals(-1, sb.indexOf((StrMatcher) null));
        assertEquals(-1, sb.indexOf((StrMatcher) null, 0));
        assertEquals(-1, sb.indexOf(StrMatcher.charMatcher('a'), 10));
        assertEquals(1, sb.indexOf(StrMatcher.charMatcher('a')));
        assertEquals(1, sb.indexOf(StrMatcher.charMatcher('a'), -1));
        assertEquals(3, sb.indexOf(StrMatcher.charMatcher('a'), 2));
        assertEquals(-1, sb.indexOf(StrMatcher.charMatcher('z'), 0));
    }

    @Test
    public void testLastIndexOfChar() {
        StrBuilder sb = new StrBuilder("banana");
        assertEquals(5, sb.lastIndexOf('a'));
        assertEquals(0, sb.lastIndexOf('b'));
        assertEquals(-1, sb.lastIndexOf('z'));

        assertEquals(5, sb.lastIndexOf('a', 10));
        assertEquals(3, sb.lastIndexOf('a', 4));
        assertEquals(1, sb.lastIndexOf('a', 2));
        assertEquals(-1, sb.lastIndexOf('a', -1));
        assertEquals(-1, sb.lastIndexOf('z', 2));
    }

    @Test
    public void testLastIndexOfString() {
        StrBuilder sb = new StrBuilder("banana");
        assertEquals(-1, sb.lastIndexOf((String) null));
        assertEquals(-1, sb.lastIndexOf((String) null, 0));
        assertEquals(-1, sb.lastIndexOf("a", -1));
        assertEquals(5, sb.lastIndexOf("", 5));
        assertEquals(5, sb.lastIndexOf("", 10));
        assertEquals(5, sb.lastIndexOf("a"));
        assertEquals(3, sb.lastIndexOf("an"));
        assertEquals(1, sb.lastIndexOf("an", 2));
        assertEquals(-1, sb.lastIndexOf("xyz"));
        assertEquals(-1, sb.lastIndexOf("longerthansource"));
        assertEquals(0, sb.lastIndexOf("banana"));
        assertEquals(-1, sb.lastIndexOf("banana", -1));

        StrBuilder sb2 = new StrBuilder("ba");
        assertEquals(-1, sb2.lastIndexOf("bx", 1));
    }

    @Test
    public void testLastIndexOfMatcher() {
        StrBuilder sb = new StrBuilder("banana");
        assertEquals(-1, sb.lastIndexOf((StrMatcher) null));
        assertEquals(-1, sb.lastIndexOf((StrMatcher) null, 0));
        assertEquals(-1, sb.lastIndexOf(StrMatcher.charMatcher('a'), -1));
        assertEquals(5, sb.lastIndexOf(StrMatcher.charMatcher('a')));
        assertEquals(5, sb.lastIndexOf(StrMatcher.charMatcher('a'), 10));
        assertEquals(3, sb.lastIndexOf(StrMatcher.charMatcher('a'), 4));
        assertEquals(-1, sb.lastIndexOf(StrMatcher.charMatcher('z'), 5));
    }

    @Test
    public void testAsTokenizer() {
        StrBuilder sb = new StrBuilder("a b c");
        StrTokenizer tok = sb.asTokenizer();
        assertNotNull(tok);
        assertEquals("a b c", tok.getContent());
        assertArrayEquals(new String[]{"a", "b", "c"}, tok.getTokenArray());

        tok.reset("x y");
        assertEquals("x y", tok.getContent());
        assertArrayEquals(new String[]{"x", "y"}, tok.getTokenArray());
    }

    @Test
    public void testAsReader() throws IOException {
        StrBuilder sb = new StrBuilder("hello");
        Reader reader = sb.asReader();
        assertTrue(reader.ready());
        assertTrue(reader.markSupported());

        assertEquals('h', reader.read());
        assertEquals('e', reader.read());

        reader.mark(5);
        assertEquals('l', reader.read());
        reader.reset();
        assertEquals('l', reader.read());

        char[] cbuf = new char[5];
        assertEquals(0, reader.read(cbuf, 0, 0));
        assertEquals(2, reader.read(cbuf, 0, 5));
        assertEquals('l', cbuf[0]);
        assertEquals('o', cbuf[1]);
        assertEquals(-1, reader.read());
        assertEquals(-1, reader.read(cbuf, 0, 2));

        assertFalse(reader.ready());
        reader.close();

        sb.clear().append("0123456789");
        reader = sb.asReader();
        assertEquals(0, reader.skip(-1));
        assertEquals(5, reader.skip(5));
        assertEquals(5, reader.skip(10));
        assertEquals(0, reader.skip(5));

        try {
            reader.read(cbuf, -1, 1);
            fail();
        } catch (IndexOutOfBoundsException e) {
        }
        try {
            reader.read(cbuf, 0, -1);
            fail();
        } catch (IndexOutOfBoundsException e) {
        }
        try {
            reader.read(cbuf, 6, 1);
            fail();
        } catch (IndexOutOfBoundsException e) {
        }
        try {
            reader.read(cbuf, 4, 2);
            fail();
        } catch (IndexOutOfBoundsException e) {
        }
    }

    @Test
    public void testAsWriter() throws IOException {
        StrBuilder sb = new StrBuilder();
        Writer writer = sb.asWriter();
        writer.write('a');
        assertEquals("a", sb.toString());

        writer.write(new char[]{'b', 'c'});
        assertEquals("abc", sb.toString());

        writer.write(new char[]{'x', 'd', 'e', 'y'}, 1, 2);
        assertEquals("abcde", sb.toString());

        writer.write("fg");
        assertEquals("abcdefg", sb.toString());

        writer.write("xhijy", 1, 3);
        assertEquals("abcdefghij", sb.toString());

        writer.flush();
        writer.close();
        assertEquals("abcdefghij", sb.toString());
    }

    @Test
    public void testEqualsAndHashCode() {
        StrBuilder sb1 = new StrBuilder("abc");
        StrBuilder sb2 = new StrBuilder("abc");
        StrBuilder sb3 = new StrBuilder("xyz");
        StrBuilder sb4 = new StrBuilder("ab");

        assertTrue(sb1.equals(sb1));
        assertTrue(sb1.equals((Object) sb1));
        assertTrue(sb1.equals(sb2));
        assertTrue(sb1.equals((Object) sb2));
        assertFalse(sb1.equals(sb3));
        assertFalse(sb1.equals((Object) sb3));
        assertFalse(sb1.equals(sb4));
        assertFalse(sb1.equals((Object) sb4));
        assertFalse(sb1.equals((StrBuilder) null));
        assertFalse(sb1.equals((Object) null));
        assertFalse(sb1.equals("abc"));

        assertEquals(sb1.hashCode(), sb2.hashCode());
        assertFalse(sb1.hashCode() == sb3.hashCode());
    }

    @Test
    public void testEqualsIgnoreCase() {
        StrBuilder sb1 = new StrBuilder("abc");
        StrBuilder sb2 = new StrBuilder("ABC");
        StrBuilder sb3 = new StrBuilder("xyz");
        StrBuilder sb4 = new StrBuilder("ab");

        assertTrue(sb1.equalsIgnoreCase(sb1));
        assertTrue(sb1.equalsIgnoreCase(sb2));
        assertFalse(sb1.equalsIgnoreCase(sb3));
        assertFalse(sb1.equalsIgnoreCase(sb4));
        assertFalse(sb1.equalsIgnoreCase(null));
    }

    @Test
    public void testToStringAndToStringBuffer() {
        StrBuilder sb = new StrBuilder("abc");
        assertEquals("abc", sb.toString());
        assertEquals("abc", sb.toStringBuffer().toString());
    }
}
