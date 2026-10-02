package org.apache.commons.lang.text;

import org.apache.commons.lang.SystemUtils;
import org.junit.Test;

import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
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
        assertEquals(0, sb1.length());
        assertEquals(StrBuilder.CAPACITY, sb1.capacity());

        StrBuilder sb2 = new StrBuilder(10);
        assertEquals(0, sb2.length());
        assertEquals(10, sb2.capacity());

        StrBuilder sb3 = new StrBuilder(-5);
        assertEquals(0, sb3.length());
        assertEquals(StrBuilder.CAPACITY, sb3.capacity());

        StrBuilder sb4 = new StrBuilder("Hello");
        assertEquals(5, sb4.length());
        assertEquals(5 + StrBuilder.CAPACITY, sb4.capacity());
        assertEquals("Hello", sb4.toString());

        StrBuilder sb5 = new StrBuilder((String) null);
        assertEquals(0, sb5.length());
        assertEquals(StrBuilder.CAPACITY, sb5.capacity());
    }

    @Test
    public void testNewLineText() {
        StrBuilder sb = new StrBuilder();
        assertNull(sb.getNewLineText());
        sb.setNewLineText("\r\n");
        assertEquals("\r\n", sb.getNewLineText());
        sb.setNewLineText(null);
        assertNull(sb.getNewLineText());
    }

    @Test
    public void testNullText() {
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
        StrBuilder sb = new StrBuilder("Hello World");
        assertEquals(11, sb.length());
        assertEquals(11, sb.size());

        sb.setLength(5);
        assertEquals(5, sb.length());
        assertEquals("Hello", sb.toString());

        sb.setLength(8);
        assertEquals(8, sb.length());
        assertEquals("Hello\0\0\0", sb.toString());

        sb.setLength(8);
        assertEquals(8, sb.length());

        try {
            sb.setLength(-1);
            fail("Expected StringIndexOutOfBoundsException");
        } catch (StringIndexOutOfBoundsException expected) {
        }
    }

    @Test
    public void testCapacityAndMinimize() {
        StrBuilder sb = new StrBuilder(10);
        assertEquals(10, sb.capacity());

        sb.ensureCapacity(5);
        assertEquals(10, sb.capacity());

        sb.ensureCapacity(50);
        assertEquals(50, sb.capacity());

        sb.append("Hello");
        sb.minimizeCapacity();
        assertEquals(5, sb.capacity());

        sb.minimizeCapacity();
        assertEquals(5, sb.capacity());
    }

    @Test
    public void testIsEmptyAndClear() {
        StrBuilder sb = new StrBuilder();
        assertTrue(sb.isEmpty());
        sb.append("abc");
        assertFalse(sb.isEmpty());
        sb.clear();
        assertTrue(sb.isEmpty());
        assertEquals(0, sb.length());
    }

    @Test
    public void testCharAtSetCharAtDeleteCharAt() {
        StrBuilder sb = new StrBuilder("hello");
        assertEquals('h', sb.charAt(0));
        assertEquals('o', sb.charAt(4));

        try {
            sb.charAt(-1);
            fail();
        } catch (StringIndexOutOfBoundsException expected) {
        }
        try {
            sb.charAt(5);
            fail();
        } catch (StringIndexOutOfBoundsException expected) {
        }

        sb.setCharAt(0, 'H');
        assertEquals("Hello", sb.toString());
        try {
            sb.setCharAt(-1, 'X');
            fail();
        } catch (StringIndexOutOfBoundsException expected) {
        }
        try {
            sb.setCharAt(5, 'X');
            fail();
        } catch (StringIndexOutOfBoundsException expected) {
        }

        sb.deleteCharAt(1);
        assertEquals("Hllo", sb.toString());
        try {
            sb.deleteCharAt(-1);
            fail();
        } catch (StringIndexOutOfBoundsException expected) {
        }
        try {
            sb.deleteCharAt(4);
            fail();
        } catch (StringIndexOutOfBoundsException expected) {
        }
    }

    @Test
    public void testToCharArray() {
        StrBuilder sb = new StrBuilder("hello");
        assertArrayEquals(new char[]{'h', 'e', 'l', 'l', 'o'}, sb.toCharArray());

        StrBuilder empty = new StrBuilder();
        assertArrayEquals(new char[0], empty.toCharArray());
        assertArrayEquals(new char[0], empty.toCharArray(0, 0));

        assertArrayEquals(new char[]{'e', 'l'}, sb.toCharArray(1, 3));
        assertArrayEquals(new char[]{'l', 'l', 'o'}, sb.toCharArray(2, 10));

        try {
            sb.toCharArray(-1, 2);
            fail();
        } catch (StringIndexOutOfBoundsException expected) {
        }
        try {
            sb.toCharArray(3, 2);
            fail();
        } catch (StringIndexOutOfBoundsException expected) {
        }
    }

    @Test
    public void testGetChars() {
        StrBuilder sb = new StrBuilder("hello world");
        char[] dest = sb.getChars(null);
        assertArrayEquals("hello world".toCharArray(), dest);

        char[] shortDest = new char[2];
        dest = sb.getChars(shortDest);
        assertArrayEquals("hello world".toCharArray(), dest);

        char[] exactDest = new char[11];
        dest = sb.getChars(exactDest);
        assertTrue(dest == exactDest);
        assertArrayEquals("hello world".toCharArray(), dest);

        char[] subDest = new char[10];
        sb.getChars(0, 5, subDest, 0);
        assertEquals("hello", new String(subDest, 0, 5));

        try {
            sb.getChars(-1, 5, subDest, 0);
            fail();
        } catch (StringIndexOutOfBoundsException expected) {
        }
        try {
            sb.getChars(0, 20, subDest, 0);
            fail();
        } catch (StringIndexOutOfBoundsException expected) {
        }
        try {
            sb.getChars(0, -1, subDest, 0);
            fail();
        } catch (StringIndexOutOfBoundsException expected) {
        }
        try {
            sb.getChars(5, 2, subDest, 0);
            fail();
        } catch (StringIndexOutOfBoundsException expected) {
        }
    }

    @Test
    public void testAppendNewLine() {
        StrBuilder sb = new StrBuilder();
        sb.appendNewLine();
        assertEquals(SystemUtils.LINE_SEPARATOR, sb.toString());

        sb.setNewLineText("\n");
        sb.appendNewLine();
        assertEquals(SystemUtils.LINE_SEPARATOR + "\n", sb.toString());
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
        sb.append((Object) "abc");
        sb.append((Object) null);
        assertEquals("abc", sb.toString());
        sb.setNullText("-");
        sb.append((Object) null);
        assertEquals("abc-", sb.toString());
    }

    @Test
    public void testAppendString() {
        StrBuilder sb = new StrBuilder();
        sb.append("abc");
        sb.append("");
        sb.append((String) null);
        assertEquals("abc", sb.toString());

        sb.append("defg", 1, 2);
        assertEquals("abcef", sb.toString());

        sb.append((String) null, 0, 2);
        assertEquals("abcef", sb.toString());

        try {
            sb.append("test", -1, 2);
            fail();
        } catch (StringIndexOutOfBoundsException expected) {
        }
        try {
            sb.append("test", 5, 2);
            fail();
        } catch (StringIndexOutOfBoundsException expected) {
        }
        try {
            sb.append("test", 1, -1);
            fail();
        } catch (StringIndexOutOfBoundsException expected) {
        }
        try {
            sb.append("test", 2, 5);
            fail();
        } catch (StringIndexOutOfBoundsException expected) {
        }

        sb.append("test", 1, 0);
        assertEquals("abcef", sb.toString());
    }

    @Test
    public void testAppendStringBuffer() {
        StrBuilder sb = new StrBuilder();
        sb.append(new StringBuffer("abc"));
        sb.append(new StringBuffer(""));
        sb.append((StringBuffer) null);
        assertEquals("abc", sb.toString());

        sb.append(new StringBuffer("defg"), 1, 2);
        assertEquals("abcef", sb.toString());
        sb.append((StringBuffer) null, 0, 2);
        assertEquals("abcef", sb.toString());

        try {
            sb.append(new StringBuffer("test"), -1, 2);
            fail();
        } catch (StringIndexOutOfBoundsException expected) {
        }
        try {
            sb.append(new StringBuffer("test"), 5, 2);
            fail();
        } catch (StringIndexOutOfBoundsException expected) {
        }
        try {
            sb.append(new StringBuffer("test"), 1, -1);
            fail();
        } catch (StringIndexOutOfBoundsException expected) {
        }
        try {
            sb.append(new StringBuffer("test"), 2, 5);
            fail();
        } catch (StringIndexOutOfBoundsException expected) {
        }

        sb.append(new StringBuffer("test"), 1, 0);
        assertEquals("abcef", sb.toString());
    }

    @Test
    public void testAppendStrBuilder() {
        StrBuilder sb = new StrBuilder();
        sb.append(new StrBuilder("abc"));
        sb.append(new StrBuilder(""));
        sb.append((StrBuilder) null);
        assertEquals("abc", sb.toString());

        sb.append(new StrBuilder("defg"), 1, 2);
        assertEquals("abcef", sb.toString());
        sb.append((StrBuilder) null, 0, 2);
        assertEquals("abcef", sb.toString());

        try {
            sb.append(new StrBuilder("test"), -1, 2);
            fail();
        } catch (StringIndexOutOfBoundsException expected) {
        }
        try {
            sb.append(new StrBuilder("test"), 5, 2);
            fail();
        } catch (StringIndexOutOfBoundsException expected) {
        }
        try {
            sb.append(new StrBuilder("test"), 1, -1);
            fail();
        } catch (StringIndexOutOfBoundsException expected) {
        }
        try {
            sb.append(new StrBuilder("test"), 2, 5);
            fail();
        } catch (StringIndexOutOfBoundsException expected) {
        }

        sb.append(new StrBuilder("test"), 1, 0);
        assertEquals("abcef", sb.toString());
    }

    @Test
    public void testAppendCharArray() {
        StrBuilder sb = new StrBuilder();
        sb.append(new char[]{'a', 'b', 'c'});
        sb.append(new char[0]);
        sb.append((char[]) null);
        assertEquals("abc", sb.toString());

        sb.append(new char[]{'d', 'e', 'f', 'g'}, 1, 2);
        assertEquals("abcef", sb.toString());
        sb.append((char[]) null, 0, 2);
        assertEquals("abcef", sb.toString());

        try {
            sb.append(new char[]{'a', 'b'}, -1, 1);
            fail();
        } catch (StringIndexOutOfBoundsException expected) {
        }
        try {
            sb.append(new char[]{'a', 'b'}, 3, 1);
            fail();
        } catch (StringIndexOutOfBoundsException expected) {
        }
        try {
            sb.append(new char[]{'a', 'b'}, 0, -1);
            fail();
        } catch (StringIndexOutOfBoundsException expected) {
        }
        try {
            sb.append(new char[]{'a', 'b'}, 1, 2);
            fail();
        } catch (StringIndexOutOfBoundsException expected) {
        }

        sb.append(new char[]{'a', 'b'}, 0, 0);
        assertEquals("abcef", sb.toString());
    }

    @Test
    public void testAppendPrimitives() {
        StrBuilder sb = new StrBuilder();
        sb.append(true).append(false);
        assertEquals("truefalse", sb.toString());

        sb.clear();
        sb.append('c').append(123).append(456L).append(1.5f).append(2.5d);
        assertEquals("c1234561.52.5", sb.toString());
    }

    @Test
    public void testAppendWithSeparators() {
        StrBuilder sb = new StrBuilder();
        sb.appendWithSeparators((Object[]) null, ",");
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

        sb.clear();
        sb.appendWithSeparators((Collection) null, ",");
        sb.appendWithSeparators(Collections.emptyList(), ",");
        assertEquals("", sb.toString());

        sb.appendWithSeparators(Arrays.asList("x", "y"), ",");
        assertEquals("x,y", sb.toString());

        sb.clear();
        sb.appendWithSeparators(Arrays.asList("x", "y"), null);
        assertEquals("xy", sb.toString());

        sb.clear();
        sb.appendWithSeparators((Iterator) null, ",");
        sb.appendWithSeparators(Collections.emptyList().iterator(), ",");
        assertEquals("", sb.toString());

        sb.appendWithSeparators(Arrays.asList("1", "2", "3").iterator(), "-");
        assertEquals("1-2-3", sb.toString());

        sb.clear();
        sb.appendWithSeparators(Arrays.asList("1", "2").iterator(), null);
        assertEquals("12", sb.toString());
    }

    @Test
    public void testAppendPadding() {
        StrBuilder sb = new StrBuilder();
        sb.appendPadding(-1, 'x');
        sb.appendPadding(0, 'x');
        sb.appendPadding(3, 'a');
        assertEquals("aaa", sb.toString());
    }

    @Test
    public void testAppendFixedWidthPadLeft() {
        StrBuilder sb = new StrBuilder();
        sb.appendFixedWidthPadLeft("abc", -1, ' ');
        sb.appendFixedWidthPadLeft("abc", 0, ' ');
        assertEquals("", sb.toString());

        sb.appendFixedWidthPadLeft("abc", 5, ' ');
        assertEquals("  abc", sb.toString());

        sb.clear();
        sb.appendFixedWidthPadLeft("abcdef", 3, ' ');
        assertEquals("def", sb.toString());

        sb.clear();
        sb.setNullText("null");
        sb.appendFixedWidthPadLeft((Object) null, 6, '-');
        assertEquals("--null", sb.toString());

        sb.clear();
        sb.appendFixedWidthPadLeft(42, 4, '0');
        assertEquals("0042", sb.toString());

        sb.clear();
        sb.appendFixedWidthPadLeft(12345, 3, '0');
        assertEquals("345", sb.toString());
    }

    @Test
    public void testAppendFixedWidthPadRight() {
        StrBuilder sb = new StrBuilder();
        sb.appendFixedWidthPadRight("abc", -1, ' ');
        sb.appendFixedWidthPadRight("abc", 0, ' ');
        assertEquals("", sb.toString());

        sb.appendFixedWidthPadRight("abc", 5, ' ');
        assertEquals("abc  ", sb.toString());

        sb.clear();
        sb.appendFixedWidthPadRight("abcdef", 3, ' ');
        assertEquals("abc", sb.toString());

        sb.clear();
        sb.setNullText("null");
        sb.appendFixedWidthPadRight((Object) null, 6, '-');
        assertEquals("null--", sb.toString());

        sb.clear();
        sb.appendFixedWidthPadRight(42, 4, '0');
        assertEquals("4200", sb.toString());

        sb.clear();
        sb.appendFixedWidthPadRight(12345, 3, '0');
        assertEquals("123", sb.toString());
    }

    @Test
    public void testInsertObjectAndString() {
        StrBuilder sb = new StrBuilder("world");
        sb.insert(0, "hello ");
        assertEquals("hello world", sb.toString());

        sb.insert(5, (String) null);
        assertEquals("hello world", sb.toString());

        sb.setNullText("!");
        sb.insert(5, (Object) null);
        assertEquals("hello! world", sb.toString());

        sb.clear();
        sb.append("ac");
        sb.insert(1, (Object) "b");
        assertEquals("abc", sb.toString());

        try {
            sb.insert(-1, "test");
            fail();
        } catch (StringIndexOutOfBoundsException expected) {
        }
        try {
            sb.insert(10, "test");
            fail();
        } catch (StringIndexOutOfBoundsException expected) {
        }
    }

    @Test
    public void testInsertCharArray() {
        StrBuilder sb = new StrBuilder("ac");
        sb.insert(1, new char[]{'b'});
        assertEquals("abc", sb.toString());

        sb.insert(0, (char[]) null);
        assertEquals("abc", sb.toString());

        sb.insert(1, new char[0]);
        assertEquals("abc", sb.toString());

        sb.setNullText("!");
        sb.insert(0, (char[]) null);
        assertEquals("!abc", sb.toString());

        sb.clear();
        sb.append("ad");
        sb.insert(1, new char[]{'a', 'b', 'c', 'd'}, 1, 2);
        assertEquals("abcd", sb.toString());

        sb.insert(0, (char[]) null, 0, 0);
        assertEquals("abcd", sb.toString());

        sb.insert(0, new char[]{'x'}, 0, 0);
        assertEquals("abcd", sb.toString());

        try {
            sb.insert(0, new char[]{'x'}, -1, 1);
            fail();
        } catch (StringIndexOutOfBoundsException expected) {
        }
        try {
            sb.insert(0, new char[]{'x'}, 2, 1);
            fail();
        } catch (StringIndexOutOfBoundsException expected) {
        }
        try {
            sb.insert(0, new char[]{'x'}, 0, -1);
            fail();
        } catch (StringIndexOutOfBoundsException expected) {
        }
        try {
            sb.insert(0, new char[]{'x'}, 0, 2);
            fail();
        } catch (StringIndexOutOfBoundsException expected) {
        }
    }

    @Test
    public void testInsertPrimitives() {
        StrBuilder sb = new StrBuilder();
        sb.insert(0, false);
        assertEquals("false", sb.toString());
        sb.insert(0, true);
        assertEquals("truefalse", sb.toString());

        sb.clear();
        sb.insert(0, 'z');
        sb.insert(0, 10);
        sb.insert(0, 20L);
        sb.insert(0, 1.5f);
        sb.insert(0, 2.5d);
        assertEquals("2.51.52010z", sb.toString());
    }

    @Test
    public void testDelete() {
        StrBuilder sb = new StrBuilder("hello world");
        sb.delete(5, 11);
        assertEquals("hello", sb.toString());

        sb.delete(2, 2);
        assertEquals("hello", sb.toString());

        sb.delete(2, 20);
        assertEquals("he", sb.toString());

        try {
            sb.delete(-1, 2);
            fail();
        } catch (StringIndexOutOfBoundsException expected) {
        }
        try {
            sb.delete(2, 1);
            fail();
        } catch (StringIndexOutOfBoundsException expected) {
        }
    }

    @Test
    public void testDeleteAllCharAndDeleteFirstChar() {
        StrBuilder sb = new StrBuilder("banana");
        sb.deleteFirst('a');
        assertEquals("bnana", sb.toString());
        sb.deleteFirst('z');
        assertEquals("bnana", sb.toString());

        sb.deleteAll('n');
        assertEquals("baa", sb.toString());
        sb.deleteAll('a');
        assertEquals("b", sb.toString());
        sb.deleteAll('z');
        assertEquals("b", sb.toString());

        StrBuilder sb2 = new StrBuilder("abbbba");
        sb2.deleteAll('b');
        assertEquals("aa", sb2.toString());
    }

    @Test
    public void testDeleteAllStringAndDeleteFirstString() {
        StrBuilder sb = new StrBuilder("foo bar foo bar foo");
        sb.deleteFirst("foo ");
        assertEquals("bar foo bar foo", sb.toString());
        sb.deleteFirst("baz");
        assertEquals("bar foo bar foo", sb.toString());
        sb.deleteFirst((String) null);
        sb.deleteFirst("");
        assertEquals("bar foo bar foo", sb.toString());

        sb.deleteAll("bar ");
        assertEquals("foo foo", sb.toString());
        sb.deleteAll("baz");
        assertEquals("foo foo", sb.toString());
        sb.deleteAll((String) null);
        sb.deleteAll("");
        assertEquals("foo foo", sb.toString());
    }

    @Test
    public void testDeleteAllMatcherAndDeleteFirstMatcher() {
        StrBuilder sb = new StrBuilder("a1b2c3");
        sb.deleteFirst(StrMatcher.charMatcher('b'));
        assertEquals("a12c3", sb.toString());
        sb.deleteFirst((StrMatcher) null);
        assertEquals("a12c3", sb.toString());

        sb.deleteAll(StrMatcher.charSetMatcher("123"));
        assertEquals("ac", sb.toString());
        sb.deleteAll((StrMatcher) null);
        assertEquals("ac", sb.toString());
    }

    @Test
    public void testReplace() {
        StrBuilder sb = new StrBuilder("hello world");
        sb.replace(0, 5, "goodbye");
        assertEquals("goodbye world", sb.toString());

        sb.replace(7, 13, null);
        assertEquals("goodbye", sb.toString());

        sb.replace(0, 4, "g");
        assertEquals("gbye", sb.toString());

        sb.replace(0, 1, "great ");
        assertEquals("great bye", sb.toString());
    }

    @Test
    public void testReplaceChar() {
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
    public void testReplaceString() {
        StrBuilder sb = new StrBuilder("foo bar foo bar foo");
        sb.replaceAll((String) null, "x");
        sb.replaceAll("", "x");
        assertEquals("foo bar foo bar foo", sb.toString());

        sb.replaceAll("foo", "qux");
        assertEquals("qux bar qux bar qux", sb.toString());
        sb.replaceAll("bar", null);
        assertEquals("qux  qux  qux", sb.toString());

        StrBuilder sb2 = new StrBuilder("foo bar foo");
        sb2.replaceFirst((String) null, "x");
        sb2.replaceFirst("", "x");
        assertEquals("foo bar foo", sb2.toString());

        sb2.replaceFirst("foo", "qux");
        assertEquals("qux bar foo", sb2.toString());
        sb2.replaceFirst("bar", null);
        assertEquals("qux  foo", sb2.toString());
        sb2.replaceFirst("baz", "qux");
        assertEquals("qux  foo", sb2.toString());
    }

    @Test
    public void testReplaceMatcher() {
        StrBuilder sb = new StrBuilder("a1b2c3d4");
        sb.replaceAll((StrMatcher) null, "x");
        assertEquals("a1b2c3d4", sb.toString());

        sb.replaceAll(StrMatcher.charSetMatcher("1234"), "_");
        assertEquals("a_b_c_d_", sb.toString());

        StrBuilder sb2 = new StrBuilder("a1b2c3");
        sb2.replaceFirst((StrMatcher) null, "x");
        assertEquals("a1b2c3", sb2.toString());

        sb2.replaceFirst(StrMatcher.charSetMatcher("123"), "_");
        assertEquals("a_b2c3", sb2.toString());

        StrBuilder sb3 = new StrBuilder("a1b2c3d4");
        sb3.replace(StrMatcher.charSetMatcher("1234"), null, 0, 6, 2);
        assertEquals("abc3d4", sb3.toString());

        StrBuilder empty = new StrBuilder();
        empty.replace(StrMatcher.charMatcher('a'), "x", 0, 0, -1);
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

        sb.clear().append("abcde");
        sb.reverse();
        assertEquals("edcba", sb.toString());
    }

    @Test
    public void testTrim() {
        StrBuilder sb = new StrBuilder();
        sb.trim();
        assertEquals("", sb.toString());

        sb.append("   ");
        sb.trim();
        assertEquals("", sb.toString());

        sb.clear().append("  hello  ");
        sb.trim();
        assertEquals("hello", sb.toString());

        sb.clear().append("hello");
        sb.trim();
        assertEquals("hello", sb.toString());
    }

    @Test
    public void testStartsWithAndEndsWith() {
        StrBuilder sb = new StrBuilder("hello world");
        assertFalse(sb.startsWith(null));
        assertTrue(sb.startsWith(""));
        assertTrue(sb.startsWith("hello"));
        assertFalse(sb.startsWith("world"));
        assertFalse(sb.startsWith("hello world foo"));

        assertFalse(sb.endsWith(null));
        assertTrue(sb.endsWith(""));
        assertTrue(sb.endsWith("world"));
        assertFalse(sb.endsWith("hello"));
        assertFalse(sb.endsWith("foo hello world"));
    }

    @Test
    public void testSubstrings() {
        StrBuilder sb = new StrBuilder("hello world");
        assertEquals("world", sb.substring(6));
        assertEquals("hello", sb.substring(0, 5));
        assertEquals("world", sb.substring(6, 20));

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
        assertEquals("", sb.midString(20, 5));
        assertEquals("hel", sb.midString(-5, 3));
        assertEquals("world", sb.midString(6, 20));
        assertEquals("lo", sb.midString(3, 2));
    }

    @Test
    public void testContains() {
        StrBuilder sb = new StrBuilder("hello world");
        assertTrue(sb.contains('h'));
        assertTrue(sb.contains('d'));
        assertFalse(sb.contains('z'));

        assertTrue(sb.contains("world"));
        assertFalse(sb.contains("xyz"));
        assertFalse(sb.contains((String) null));

        assertTrue(sb.contains(StrMatcher.stringMatcher("world")));
        assertFalse(sb.contains(StrMatcher.stringMatcher("xyz")));
        assertFalse(sb.contains((StrMatcher) null));
    }

    @Test
    public void testIndexOfChar() {
        StrBuilder sb = new StrBuilder("hello world");
        assertEquals(0, sb.indexOf('h'));
        assertEquals(2, sb.indexOf('l'));
        assertEquals(-1, sb.indexOf('z'));

        assertEquals(2, sb.indexOf('l', -1));
        assertEquals(3, sb.indexOf('l', 3));
        assertEquals(-1, sb.indexOf('l', 10));
        assertEquals(-1, sb.indexOf('l', 20));
    }

    @Test
    public void testIndexOfString() {
        StrBuilder sb = new StrBuilder("hello world hello");
        assertEquals(0, sb.indexOf("hello"));
        assertEquals(-1, sb.indexOf("xyz"));
        assertEquals(-1, sb.indexOf((String) null));

        assertEquals(-1, sb.indexOf("hello", 20));
        assertEquals(0, sb.indexOf("hello", -1));
        assertEquals(12, sb.indexOf("hello", 5));
        assertEquals(0, sb.indexOf("h", 0));
        assertEquals(2, sb.indexOf("", 2));
        assertEquals(-1, sb.indexOf("superlongstringthatexceedslength", 0));
        assertEquals(-1, sb.indexOf("worldx", 0));
    }

    @Test
    public void testIndexOfMatcher() {
        StrBuilder sb = new StrBuilder("hello 123 world");
        assertEquals(6, sb.indexOf(StrMatcher.charSetMatcher("123")));
        assertEquals(-1, sb.indexOf((StrMatcher) null));

        assertEquals(6, sb.indexOf(StrMatcher.charSetMatcher("123"), -1));
        assertEquals(7, sb.indexOf(StrMatcher.charSetMatcher("123"), 7));
        assertEquals(-1, sb.indexOf(StrMatcher.charSetMatcher("123"), 20));
        assertEquals(-1, sb.indexOf((StrMatcher) null, 0));
    }

    @Test
    public void testLastIndexOfChar() {
        StrBuilder sb = new StrBuilder("hello world");
        assertEquals(9, sb.lastIndexOf('l'));
        assertEquals(-1, sb.lastIndexOf('z'));

        assertEquals(9, sb.lastIndexOf('l', 20));
        assertEquals(3, sb.lastIndexOf('l', 5));
        assertEquals(-1, sb.lastIndexOf('l', -1));
    }

    @Test
    public void testLastIndexOfString() {
        StrBuilder sb = new StrBuilder("hello world hello");
        assertEquals(12, sb.lastIndexOf("hello"));
        assertEquals(-1, sb.lastIndexOf("xyz"));
        assertEquals(-1, sb.lastIndexOf((String) null));

        assertEquals(-1, sb.lastIndexOf("hello", -1));
        assertEquals(12, sb.lastIndexOf("hello", 20));
        assertEquals(0, sb.lastIndexOf("hello", 5));
        assertEquals(12, sb.lastIndexOf("h", 12));
        assertEquals(5, sb.lastIndexOf("", 5));
        assertEquals(-1, sb.lastIndexOf("superlongstringthatexceedslength", 5));
        assertEquals(-1, sb.lastIndexOf("worldx", 10));
    }

    @Test
    public void testLastIndexOfMatcher() {
        StrBuilder sb = new StrBuilder("hello 123 world");
        assertEquals(8, sb.lastIndexOf(StrMatcher.charSetMatcher("123")));
        assertEquals(-1, sb.lastIndexOf((StrMatcher) null));

        assertEquals(8, sb.lastIndexOf(StrMatcher.charSetMatcher("123"), 20));
        assertEquals(6, sb.lastIndexOf(StrMatcher.charSetMatcher("123"), 6));
        assertEquals(-1, sb.lastIndexOf(StrMatcher.charSetMatcher("123"), -1));
        assertEquals(-1, sb.lastIndexOf((StrMatcher) null, 5));
    }

    @Test
    public void testAsTokenizer() {
        StrBuilder sb = new StrBuilder("a b c");
        StrTokenizer tok = sb.asTokenizer();
        assertArrayEquals(new String[]{"a", "b", "c"}, tok.getTokenArray());
        assertEquals("a b c", tok.getContent());

        tok.reset("x y");
        assertEquals("x y", tok.getContent());
        assertArrayEquals(new String[]{"x", "y"}, tok.getTokenArray());
    }

    @Test
    public void testAsReader() throws IOException {
        StrBuilder sb = new StrBuilder("hello");
        Reader reader = sb.asReader();

        assertTrue(reader.markSupported());
        assertTrue(reader.ready());

        assertEquals('h', reader.read());
        char[] buf = new char[3];
        assertEquals(3, reader.read(buf, 0, 3));
        assertArrayEquals(new char[]{'e', 'l', 'l'}, buf);

        assertEquals(0, reader.read(buf, 0, 0));

        reader.mark(10);
        assertEquals('o', reader.read());
        assertEquals(-1, reader.read());
        assertEquals(-1, reader.read(buf, 0, 1));
        assertFalse(reader.ready());

        reader.reset();
        assertEquals(1, reader.read(buf, 0, 2));
        assertEquals('o', buf[0]);

        reader.reset();
        assertEquals(1, reader.skip(10));
        assertEquals(0, reader.skip(-5));

        try {
            reader.read(buf, -1, 1);
            fail();
        } catch (IndexOutOfBoundsException expected) {
        }
        try {
            reader.read(buf, 0, -1);
            fail();
        } catch (IndexOutOfBoundsException expected) {
        }
        try {
            reader.read(buf, 4, 1);
            fail();
        } catch (IndexOutOfBoundsException expected) {
        }
        try {
            reader.read(buf, 2, 2);
            fail();
        } catch (IndexOutOfBoundsException expected) {
        }

        reader.close();
    }

    @Test
    public void testAsWriter() throws IOException {
        StrBuilder sb = new StrBuilder();
        Writer writer = sb.asWriter();

        writer.write('a');
        assertEquals("a", sb.toString());

        writer.write(new char[]{'b', 'c'});
        assertEquals("abc", sb.toString());

        writer.write(new char[]{'d', 'e', 'f'}, 1, 2);
        assertEquals("abcef", sb.toString());

        writer.write("gh");
        assertEquals("abcefgh", sb.toString());

        writer.write("ijkl", 1, 2);
        assertEquals("abcefghjk", sb.toString());

        writer.flush();
        writer.close();
        assertEquals("abcefghjk", sb.toString());
    }

    @Test
    public void testEqualsAndHashCode() {
        StrBuilder sb1 = new StrBuilder("abc");
        StrBuilder sb2 = new StrBuilder("abc");
        StrBuilder sb3 = new StrBuilder("ABC");
        StrBuilder sb4 = new StrBuilder("abcd");

        assertTrue(sb1.equals(sb1));
        assertTrue(sb1.equals(sb2));
        assertFalse(sb1.equals(sb3));
        assertFalse(sb1.equals(sb4));
        assertFalse(sb1.equals(null));
        assertFalse(sb1.equals("abc"));

        assertEquals(sb1.hashCode(), sb2.hashCode());
    }

    @Test
    public void testEqualsIgnoreCase() {
        StrBuilder sb1 = new StrBuilder("abc");
        StrBuilder sb2 = new StrBuilder("ABC");
        StrBuilder sb3 = new StrBuilder("abd");
        StrBuilder sb4 = new StrBuilder("abcd");

        assertTrue(sb1.equalsIgnoreCase(sb1));
        assertTrue(sb1.equalsIgnoreCase(sb2));
        assertFalse(sb1.equalsIgnoreCase(sb3));
        assertFalse(sb1.equalsIgnoreCase(sb4));
        assertFalse(sb1.equalsIgnoreCase(null));
    }

    @Test
    public void testToStringAndToStringBuffer() {
        StrBuilder sb = new StrBuilder("test");
        assertEquals("test", sb.toString());

        StringBuffer buf = sb.toStringBuffer();
        assertEquals("test", buf.toString());
        assertNotNull(buf);
    }
}
