package org.apache.commons.lang.text;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.SystemUtils;
import org.junit.Test;

public class StrBuilderTest {

    @Test
    public void testConstructors() {
        StrBuilder sb1 = new StrBuilder();
        assertEquals(32, sb1.capacity());
        assertEquals(0, sb1.length());

        StrBuilder sb2 = new StrBuilder(64);
        assertEquals(64, sb2.capacity());
        assertEquals(0, sb2.length());

        StrBuilder sb3 = new StrBuilder(-5);
        assertEquals(32, sb3.capacity());

        StrBuilder sb4 = new StrBuilder(0);
        assertEquals(32, sb4.capacity());

        StrBuilder sb5 = new StrBuilder((String) null);
        assertEquals(32, sb5.capacity());
        assertEquals(0, sb5.length());

        StrBuilder sb6 = new StrBuilder("hello");
        assertEquals("hello", sb6.toString());
        assertEquals(5 + 32, sb6.capacity());
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

        sb.setLength(6);
        assertEquals(6, sb.length());
        assertEquals("hel\0\0\0", sb.toString());

        sb.setLength(6);
        assertEquals(6, sb.length());

        try {
            sb.setLength(-1);
            fail("Expected StringIndexOutOfBoundsException");
        } catch (StringIndexOutOfBoundsException e) {
            // expected
        }
    }

    @Test
    public void testCapacityAndMinimizeCapacity() {
        StrBuilder sb = new StrBuilder("hello");
        int initialCapacity = sb.capacity();

        sb.ensureCapacity(initialCapacity - 5);
        assertEquals(initialCapacity, sb.capacity());

        sb.ensureCapacity(100);
        assertTrue(sb.capacity() >= 100);

        sb.minimizeCapacity();
        assertEquals(5, sb.capacity());
        assertEquals("hello", sb.toString());

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
    public void testCharAtAndSetCharAt() {
        StrBuilder sb = new StrBuilder("hello");
        assertEquals('h', sb.charAt(0));
        assertEquals('o', sb.charAt(4));

        try {
            sb.charAt(-1);
            fail("Expected StringIndexOutOfBoundsException");
        } catch (StringIndexOutOfBoundsException e) {
            // expected
        }

        try {
            sb.charAt(5);
            fail("Expected StringIndexOutOfBoundsException");
        } catch (StringIndexOutOfBoundsException e) {
            // expected
        }

        sb.setCharAt(0, 'H');
        assertEquals("Hello", sb.toString());

        try {
            sb.setCharAt(-1, 'X');
            fail("Expected StringIndexOutOfBoundsException");
        } catch (StringIndexOutOfBoundsException e) {
            // expected
        }

        try {
            sb.setCharAt(5, 'X');
            fail("Expected StringIndexOutOfBoundsException");
        } catch (StringIndexOutOfBoundsException e) {
            // expected
        }
    }

    @Test
    public void testDeleteCharAt() {
        StrBuilder sb = new StrBuilder("hello");
        sb.deleteCharAt(1);
        assertEquals("hllo", sb.toString());

        try {
            sb.deleteCharAt(-1);
            fail("Expected StringIndexOutOfBoundsException");
        } catch (StringIndexOutOfBoundsException e) {
            // expected
        }

        try {
            sb.deleteCharAt(4);
            fail("Expected StringIndexOutOfBoundsException");
        } catch (StringIndexOutOfBoundsException e) {
            // expected
        }
    }

    @Test
    public void testToCharArray() {
        StrBuilder sb = new StrBuilder();
        assertArrayEquals(ArrayUtils.EMPTY_CHAR_ARRAY, sb.toCharArray());

        sb.append("hello");
        assertArrayEquals(new char[]{'h', 'e', 'l', 'l', 'o'}, sb.toCharArray());
    }

    @Test
    public void testToCharArray_withRange() {
        StrBuilder sb = new StrBuilder("hello world");
        assertArrayEquals(new char[]{'e', 'l', 'l'}, sb.toCharArray(1, 4));
        assertArrayEquals(ArrayUtils.EMPTY_CHAR_ARRAY, sb.toCharArray(2, 2));
        assertArrayEquals(new char[]{'w', 'o', 'r', 'l', 'd'}, sb.toCharArray(6, 20));

        try {
            sb.toCharArray(-1, 2);
            fail("Expected StringIndexOutOfBoundsException");
        } catch (StringIndexOutOfBoundsException e) {
            // expected
        }

        try {
            sb.toCharArray(5, 2);
            fail("Expected StringIndexOutOfBoundsException");
        } catch (StringIndexOutOfBoundsException e) {
            // expected
        }
    }

    @Test
    public void testGetChars_array() {
        StrBuilder sb = new StrBuilder("hello");
        char[] dest = sb.getChars(null);
        assertArrayEquals(new char[]{'h', 'e', 'l', 'l', 'o'}, dest);

        char[] destSmall = new char[2];
        dest = sb.getChars(destSmall);
        assertArrayEquals(new char[]{'h', 'e', 'l', 'l', 'o'}, dest);

        char[] destLarge = new char[10];
        dest = sb.getChars(destLarge);
        assertEquals(destLarge, dest);
        assertEquals('h', dest[0]);
        assertEquals('o', dest[4]);
    }

    @Test
    public void testGetChars_range() {
        StrBuilder sb = new StrBuilder("hello world");
        char[] dest = new char[10];
        sb.getChars(0, 5, dest, 1);
        assertEquals('\0', dest[0]);
        assertEquals('h', dest[1]);
        assertEquals('o', dest[5]);

        try {
            sb.getChars(-1, 5, dest, 0);
            fail("Expected StringIndexOutOfBoundsException");
        } catch (StringIndexOutOfBoundsException e) {
            // expected
        }

        try {
            sb.getChars(0, -1, dest, 0);
            fail("Expected StringIndexOutOfBoundsException");
        } catch (StringIndexOutOfBoundsException e) {
            // expected
        }

        try {
            sb.getChars(0, 20, dest, 0);
            fail("Expected StringIndexOutOfBoundsException");
        } catch (StringIndexOutOfBoundsException e) {
            // expected
        }

        try {
            sb.getChars(5, 2, dest, 0);
            fail("Expected StringIndexOutOfBoundsException");
        } catch (StringIndexOutOfBoundsException e) {
            // expected
        }
    }

    @Test
    public void testAppendNewLine() {
        StrBuilder sb = new StrBuilder("hello");
        sb.appendNewLine();
        assertEquals("hello" + SystemUtils.LINE_SEPARATOR, sb.toString());

        sb.setNewLineText("\n");
        sb.appendNewLine();
        assertEquals("hello" + SystemUtils.LINE_SEPARATOR + "\n", sb.toString());
    }

    @Test
    public void testAppendNull() {
        StrBuilder sb = new StrBuilder("hello");
        sb.appendNull();
        assertEquals("hello", sb.toString());

        sb.setNullText("-null-");
        sb.appendNull();
        assertEquals("hello-null-", sb.toString());
    }

    @Test
    public void testAppend_Object() {
        StrBuilder sb = new StrBuilder();
        sb.append((Object) null);
        assertEquals("", sb.toString());

        sb.setNullText("NULL");
        sb.append((Object) null);
        assertEquals("NULL", sb.toString());

        sb.clear();
        sb.append(new Integer(123));
        assertEquals("123", sb.toString());
    }

    @Test
    public void testAppend_String() {
        StrBuilder sb = new StrBuilder();
        sb.append((String) null);
        assertEquals("", sb.toString());

        sb.append("");
        assertEquals("", sb.toString());

        sb.append("hello");
        assertEquals("hello", sb.toString());
    }

    @Test
    public void testAppend_String_int_int() {
        StrBuilder sb = new StrBuilder();
        sb.append((String) null, 0, 0);
        assertEquals("", sb.toString());

        sb.append("hello world", 0, 5);
        assertEquals("hello", sb.toString());

        sb.append("hello world", 5, 0);
        assertEquals("hello", sb.toString());

        try {
            sb.append("hello", -1, 2);
            fail("Expected StringIndexOutOfBoundsException");
        } catch (StringIndexOutOfBoundsException e) {
            // expected
        }

        try {
            sb.append("hello", 6, 2);
            fail("Expected StringIndexOutOfBoundsException");
        } catch (StringIndexOutOfBoundsException e) {
            // expected
        }

        try {
            sb.append("hello", 0, -1);
            fail("Expected StringIndexOutOfBoundsException");
        } catch (StringIndexOutOfBoundsException e) {
            // expected
        }

        try {
            sb.append("hello", 3, 5);
            fail("Expected StringIndexOutOfBoundsException");
        } catch (StringIndexOutOfBoundsException e) {
            // expected
        }
    }

    @Test
    public void testAppend_StringBuffer() {
        StrBuilder sb = new StrBuilder();
        sb.append((StringBuffer) null);
        assertEquals("", sb.toString());

        sb.append(new StringBuffer(""));
        assertEquals("", sb.toString());

        sb.append(new StringBuffer("hello"));
        assertEquals("hello", sb.toString());
    }

    @Test
    public void testAppend_StringBuffer_int_int() {
        StrBuilder sb = new StrBuilder();
        sb.append((StringBuffer) null, 0, 0);
        assertEquals("", sb.toString());

        StringBuffer sbuf = new StringBuffer("hello world");
        sb.append(sbuf, 0, 5);
        assertEquals("hello", sb.toString());

        sb.append(sbuf, 5, 0);
        assertEquals("hello", sb.toString());

        try {
            sb.append(sbuf, -1, 2);
            fail("Expected StringIndexOutOfBoundsException");
        } catch (StringIndexOutOfBoundsException e) {
            // expected
        }

        try {
            sb.append(sbuf, 15, 2);
            fail("Expected StringIndexOutOfBoundsException");
        } catch (StringIndexOutOfBoundsException e) {
            // expected
        }

        try {
            sb.append(sbuf, 0, -1);
            fail("Expected StringIndexOutOfBoundsException");
        } catch (StringIndexOutOfBoundsException e) {
            // expected
        }

        try {
            sb.append(sbuf, 8, 5);
            fail("Expected StringIndexOutOfBoundsException");
        } catch (StringIndexOutOfBoundsException e) {
            // expected
        }
    }

    @Test
    public void testAppend_StrBuilder() {
        StrBuilder sb = new StrBuilder();
        sb.append((StrBuilder) null);
        assertEquals("", sb.toString());

        sb.append(new StrBuilder(""));
        assertEquals("", sb.toString());

        sb.append(new StrBuilder("hello"));
        assertEquals("hello", sb.toString());
    }

    @Test
    public void testAppend_StrBuilder_int_int() {
        StrBuilder sb = new StrBuilder();
        sb.append((StrBuilder) null, 0, 0);
        assertEquals("", sb.toString());

        StrBuilder other = new StrBuilder("hello world");
        sb.append(other, 0, 5);
        assertEquals("hello", sb.toString());

        sb.append(other, 5, 0);
        assertEquals("hello", sb.toString());

        try {
            sb.append(other, -1, 2);
            fail("Expected StringIndexOutOfBoundsException");
        } catch (StringIndexOutOfBoundsException e) {
            // expected
        }

        try {
            sb.append(other, 15, 2);
            fail("Expected StringIndexOutOfBoundsException");
        } catch (StringIndexOutOfBoundsException e) {
            // expected
        }

        try {
            sb.append(other, 0, -1);
            fail("Expected StringIndexOutOfBoundsException");
        } catch (StringIndexOutOfBoundsException e) {
            // expected
        }

        try {
            sb.append(other, 8, 5);
            fail("Expected StringIndexOutOfBoundsException");
        } catch (StringIndexOutOfBoundsException e) {
            // expected
        }
    }

    @Test
    public void testAppend_charArray() {
        StrBuilder sb = new StrBuilder();
        sb.append((char[]) null);
        assertEquals("", sb.toString());

        sb.append(new char[0]);
        assertEquals("", sb.toString());

        sb.append(new char[]{'a', 'b', 'c'});
        assertEquals("abc", sb.toString());
    }

    @Test
    public void testAppend_charArray_int_int() {
        StrBuilder sb = new StrBuilder();
        sb.append((char[]) null, 0, 0);
        assertEquals("", sb.toString());

        char[] chars = new char[]{'h', 'e', 'l', 'l', 'o'};
        sb.append(chars, 0, 4);
        assertEquals("hell", sb.toString());

        sb.append(chars, 4, 0);
        assertEquals("hell", sb.toString());

        try {
            sb.append(chars, -1, 2);
            fail("Expected StringIndexOutOfBoundsException");
        } catch (StringIndexOutOfBoundsException e) {
            // expected
        }

        try {
            sb.append(chars, 6, 2);
            fail("Expected StringIndexOutOfBoundsException");
        } catch (StringIndexOutOfBoundsException e) {
            // expected
        }

        try {
            sb.append(chars, 0, -1);
            fail("Expected StringIndexOutOfBoundsException");
        } catch (StringIndexOutOfBoundsException e) {
            // expected
        }

        try {
            sb.append(chars, 3, 5);
            fail("Expected StringIndexOutOfBoundsException");
        } catch (StringIndexOutOfBoundsException e) {
            // expected
        }
    }

    @Test
    public void testAppend_Primitives() {
        StrBuilder sb = new StrBuilder();
        sb.append(true).append(false);
        assertEquals("truefalse", sb.toString());

        sb.clear();
        sb.append('c');
        assertEquals("c", sb.toString());

        sb.clear();
        sb.append(123);
        assertEquals("123", sb.toString());

        sb.clear();
        sb.append(123456789L);
        assertEquals("123456789", sb.toString());

        sb.clear();
        sb.append(1.5f);
        assertEquals("1.5", sb.toString());

        sb.clear();
        sb.append(2.5d);
        assertEquals("2.5", sb.toString());
    }

    @Test
    public void testAppendWithSeparators_Array() {
        StrBuilder sb = new StrBuilder();
        sb.appendWithSeparators((Object[]) null, ",");
        assertEquals("", sb.toString());

        sb.appendWithSeparators(new Object[0], ",");
        assertEquals("", sb.toString());

        sb.appendWithSeparators(new Object[]{"a", "b", "c"}, ",");
        assertEquals("a,b,c", sb.toString());

        sb.clear();
        sb.appendWithSeparators(new Object[]{"a", "b"}, null);
        assertEquals("ab", sb.toString());
    }

    @Test
    public void testAppendWithSeparators_Collection() {
        StrBuilder sb = new StrBuilder();
        sb.appendWithSeparators((Collection<?>) null, ",");
        assertEquals("", sb.toString());

        sb.appendWithSeparators(Collections.emptyList(), ",");
        assertEquals("", sb.toString());

        sb.appendWithSeparators(Arrays.asList("a", "b", "c"), ",");
        assertEquals("a,b,c", sb.toString());

        sb.clear();
        sb.appendWithSeparators(Arrays.asList("a", "b"), null);
        assertEquals("ab", sb.toString());
    }

    @Test
    public void testAppendWithSeparators_Iterator() {
        StrBuilder sb = new StrBuilder();
        sb.appendWithSeparators((Iterator<?>) null, ",");
        assertEquals("", sb.toString());

        sb.appendWithSeparators(Collections.emptyList().iterator(), ",");
        assertEquals("", sb.toString());

        sb.appendWithSeparators(Arrays.asList("a", "b", "c").iterator(), ",");
        assertEquals("a,b,c", sb.toString());

        sb.clear();
        sb.appendWithSeparators(Arrays.asList("a", "b").iterator(), null);
        assertEquals("ab", sb.toString());
    }

    @Test
    public void testAppendPadding() {
        StrBuilder sb = new StrBuilder("hello");
        sb.appendPadding(-1, '-');
        assertEquals("hello", sb.toString());

        sb.appendPadding(0, '-');
        assertEquals("hello", sb.toString());

        sb.appendPadding(3, '-');
        assertEquals("hello---", sb.toString());
    }

    @Test
    public void testAppendFixedWidthPadLeft() {
        StrBuilder sb = new StrBuilder();
        sb.appendFixedWidthPadLeft("abc", -1, '-');
        assertEquals("", sb.toString());

        sb.appendFixedWidthPadLeft("abc", 0, '-');
        assertEquals("", sb.toString());

        sb.appendFixedWidthPadLeft("abcdef", 4, '-');
        assertEquals("cdef", sb.toString());

        sb.clear();
        sb.appendFixedWidthPadLeft("abc", 5, '-');
        assertEquals("--abc", sb.toString());

        sb.clear();
        sb.setNullText("null");
        sb.appendFixedWidthPadLeft((Object) null, 6, '-');
        assertEquals("--null", sb.toString());

        sb.clear();
        sb.appendFixedWidthPadLeft(123, 5, '0');
        assertEquals("00123", sb.toString());
    }

    @Test
    public void testAppendFixedWidthPadRight() {
        StrBuilder sb = new StrBuilder();
        sb.appendFixedWidthPadRight("abc", -1, '-');
        assertEquals("", sb.toString());

        sb.appendFixedWidthPadRight("abc", 0, '-');
        assertEquals("", sb.toString());

        sb.appendFixedWidthPadRight("abcdef", 4, '-');
        assertEquals("abcd", sb.toString());

        sb.clear();
        sb.appendFixedWidthPadRight("abc", 5, '-');
        assertEquals("abc--", sb.toString());

        sb.clear();
        sb.setNullText("null");
        sb.appendFixedWidthPadRight((Object) null, 6, '-');
        assertEquals("null--", sb.toString());

        sb.clear();
        sb.appendFixedWidthPadRight(123, 5, '0');
        assertEquals("12300", sb.toString());
    }

    @Test
    public void testInsert_Object() {
        StrBuilder sb = new StrBuilder("world");
        sb.insert(0, (Object) null);
        assertEquals("world", sb.toString());

        sb.setNullText("NULL");
        sb.insert(0, (Object) null);
        assertEquals("NULLworld", sb.toString());

        sb.clear().append("world");
        sb.insert(0, new Integer(123));
        assertEquals("123world", sb.toString());
    }

    @Test
    public void testInsert_String() {
        StrBuilder sb = new StrBuilder("world");
        sb.insert(0, "hello ");
        assertEquals("hello world", sb.toString());

        sb.insert(5, (String) null);
        assertEquals("hello world", sb.toString());

        sb.insert(5, "");
        assertEquals("hello world", sb.toString());

        try {
            sb.insert(-1, "x");
            fail("Expected StringIndexOutOfBoundsException");
        } catch (StringIndexOutOfBoundsException e) {
            // expected
        }

        try {
            sb.insert(100, "x");
            fail("Expected StringIndexOutOfBoundsException");
        } catch (StringIndexOutOfBoundsException e) {
            // expected
        }
    }

    @Test
    public void testInsert_CharArray() {
        StrBuilder sb = new StrBuilder("world");
        sb.insert(0, new char[]{'h', 'e', 'l', 'l', 'o', ' '});
        assertEquals("hello world", sb.toString());

        sb.insert(0, (char[]) null);
        assertEquals("hello world", sb.toString());

        sb.insert(0, new char[0]);
        assertEquals("hello world", sb.toString());

        try {
            sb.insert(-1, new char[]{'a'});
            fail("Expected StringIndexOutOfBoundsException");
        } catch (StringIndexOutOfBoundsException e) {
            // expected
        }
    }

    @Test
    public void testInsert_CharArray_int_int() {
        StrBuilder sb = new StrBuilder("world");
        char[] chars = new char[]{'a', 'h', 'e', 'l', 'l', 'o', ' ', 'z'};
        sb.insert(0, chars, 1, 6);
        assertEquals("hello world", sb.toString());

        sb.insert(0, (char[]) null, 0, 0);
        assertEquals("hello world", sb.toString());

        sb.insert(0, chars, 1, 0);
        assertEquals("hello world", sb.toString());

        try {
            sb.insert(-1, chars, 0, 1);
            fail("Expected StringIndexOutOfBoundsException");
        } catch (StringIndexOutOfBoundsException e) {
            // expected
        }

        try {
            sb.insert(0, chars, -1, 1);
            fail("Expected StringIndexOutOfBoundsException");
        } catch (StringIndexOutOfBoundsException e) {
            // expected
        }

        try {
            sb.insert(0, chars, 10, 1);
            fail("Expected StringIndexOutOfBoundsException");
        } catch (StringIndexOutOfBoundsException e) {
            // expected
        }

        try {
            sb.insert(0, chars, 0, -1);
            fail("Expected StringIndexOutOfBoundsException");
        } catch (StringIndexOutOfBoundsException e) {
            // expected
        }

        try {
            sb.insert(0, chars, 5, 5);
            fail("Expected StringIndexOutOfBoundsException");
        } catch (StringIndexOutOfBoundsException e) {
            // expected
        }
    }

    @Test
    public void testInsert_Primitives() {
        StrBuilder sb = new StrBuilder("!");
        sb.insert(0, true);
        assertEquals("true!", sb.toString());

        sb.insert(4, false);
        assertEquals("truefalse!", sb.toString());

        sb.insert(0, 'A');
        assertEquals("Atruefalse!", sb.toString());

        sb.insert(0, 12);
        assertEquals("12Atruefalse!", sb.toString());

        sb.insert(0, 34L);
        assertEquals("3412Atruefalse!", sb.toString());

        sb.insert(0, 5.5f);
        assertEquals("5.53412Atruefalse!", sb.toString());

        sb.insert(0, 6.5d);
        assertEquals("6.55.53412Atruefalse!", sb.toString());
    }

    @Test
    public void testDelete() {
        StrBuilder sb = new StrBuilder("hello world");
        sb.delete(5, 11);
        assertEquals("hello", sb.toString());

        sb.delete(0, 0);
        assertEquals("hello", sb.toString());

        sb.delete(2, 20);
        assertEquals("he", sb.toString());

        try {
            sb.delete(-1, 2);
            fail("Expected StringIndexOutOfBoundsException");
        } catch (StringIndexOutOfBoundsException e) {
            // expected
        }

        try {
            sb.delete(2, 1);
            fail("Expected StringIndexOutOfBoundsException");
        } catch (StringIndexOutOfBoundsException e) {
            // expected
        }
    }

    @Test
    public void testDeleteAll_char() {
        StrBuilder sb = new StrBuilder("abacadaa");
        sb.deleteAll('a');
        assertEquals("bcd", sb.toString());

        sb.deleteAll('x');
        assertEquals("bcd", sb.toString());
    }

    @Test
    public void testDeleteFirst_char() {
        StrBuilder sb = new StrBuilder("abacad");
        sb.deleteFirst('a');
        assertEquals("bacad", sb.toString());

        sb.deleteFirst('x');
        assertEquals("bacad", sb.toString());
    }

    @Test
    public void testDeleteAll_String() {
        StrBuilder sb = new StrBuilder("hello world hello");
        sb.deleteAll("hello");
        assertEquals(" world ", sb.toString());

        sb.deleteAll((String) null);
        assertEquals(" world ", sb.toString());

        sb.deleteAll("");
        assertEquals(" world ", sb.toString());
    }

    @Test
    public void testDeleteFirst_String() {
        StrBuilder sb = new StrBuilder("hello world hello");
        sb.deleteFirst("hello");
        assertEquals(" world hello", sb.toString());

        sb.deleteFirst((String) null);
        assertEquals(" world hello", sb.toString());

        sb.deleteFirst("");
        assertEquals(" world hello", sb.toString());

        sb.deleteFirst("notFound");
        assertEquals(" world hello", sb.toString());
    }

    @Test
    public void testDeleteAll_StrMatcher() {
        StrBuilder sb = new StrBuilder("hello world");
        sb.deleteAll(StrMatcher.charMatcher('o'));
        assertEquals("hell wrld", sb.toString());

        sb.deleteAll((StrMatcher) null);
        assertEquals("hell wrld", sb.toString());
    }

    @Test
    public void testDeleteFirst_StrMatcher() {
        StrBuilder sb = new StrBuilder("hello world");
        sb.deleteFirst(StrMatcher.charMatcher('o'));
        assertEquals("hell world", sb.toString());

        sb.deleteFirst((StrMatcher) null);
        assertEquals("hell world", sb.toString());
    }

    @Test
    public void testReplace_int_int_String() {
        StrBuilder sb = new StrBuilder("hello world");
        sb.replace(0, 5, "hi");
        assertEquals("hi world", sb.toString());

        sb.replace(0, 2, "greetings");
        assertEquals("greetings world", sb.toString());

        sb.replace(9, 20, null);
        assertEquals("greetings", sb.toString());

        sb.replace(0, 0, "start ");
        assertEquals("start greetings", sb.toString());
    }

    @Test
    public void testReplaceAll_char_char() {
        StrBuilder sb = new StrBuilder("hello world");
        sb.replaceAll('o', 'a');
        assertEquals("hella warld", sb.toString());

        sb.replaceAll('x', 'x');
        assertEquals("hella warld", sb.toString());
    }

    @Test
    public void testReplaceFirst_char_char() {
        StrBuilder sb = new StrBuilder("hello world");
        sb.replaceFirst('o', 'a');
        assertEquals("hella world", sb.toString());

        sb.replaceFirst('x', 'x');
        assertEquals("hella world", sb.toString());

        sb.replaceFirst('z', 'y');
        assertEquals("hella world", sb.toString());
    }

    @Test
    public void testReplaceAll_String_String() {
        StrBuilder sb = new StrBuilder("hello world hello");
        sb.replaceAll("hello", "hi");
        assertEquals("hi world hi", sb.toString());

        sb.replaceAll((String) null, "test");
        assertEquals("hi world hi", sb.toString());

        sb.replaceAll("", "test");
        assertEquals("hi world hi", sb.toString());

        sb.replaceAll("hi", null);
        assertEquals(" world ", sb.toString());
    }

    @Test
    public void testReplaceFirst_String_String() {
        StrBuilder sb = new StrBuilder("hello world hello");
        sb.replaceFirst("hello", "hi");
        assertEquals("hi world hello", sb.toString());

        sb.replaceFirst((String) null, "test");
        assertEquals("hi world hello", sb.toString());

        sb.replaceFirst("", "test");
        assertEquals("hi world hello", sb.toString());

        sb.replaceFirst("notFound", "test");
        assertEquals("hi world hello", sb.toString());

        sb.replaceFirst("hi", null);
        assertEquals(" world hello", sb.toString());
    }

    @Test
    public void testReplaceAll_StrMatcher_String() {
        StrBuilder sb = new StrBuilder("hello world");
        sb.replaceAll(StrMatcher.charMatcher('o'), "00");
        assertEquals("hell00 w00rld", sb.toString());

        sb.replaceAll((StrMatcher) null, "00");
        assertEquals("hell00 w00rld", sb.toString());
    }

    @Test
    public void testReplaceFirst_StrMatcher_String() {
        StrBuilder sb = new StrBuilder("hello world");
        sb.replaceFirst(StrMatcher.charMatcher('o'), "00");
        assertEquals("hell00 world", sb.toString());

        sb.replaceFirst((StrMatcher) null, "00");
        assertEquals("hell00 world", sb.toString());
    }

    @Test
    public void testReplace_StrMatcher_String_int_int_int() {
        StrBuilder sb = new StrBuilder("a b c d e");
        sb.replace(StrMatcher.spaceMatcher(), "-", 0, 100, 2);
        assertEquals("a-b-c d e", sb.toString());

        sb.replace((StrMatcher) null, "-", 0, sb.length(), -1);
        assertEquals("a-b-c d e", sb.toString());

        StrBuilder emptySb = new StrBuilder();
        emptySb.replace(StrMatcher.spaceMatcher(), "-", 0, 0, -1);
        assertEquals("", emptySb.toString());
    }

    @Test
    public void testReverse() {
        StrBuilder sb = new StrBuilder();
        sb.reverse();
        assertEquals("", sb.toString());

        sb.append("a");
        sb.reverse();
        assertEquals("a", sb.toString());

        sb.append("bcde");
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

        sb.append("  hello world  ");
        sb.trim();
        assertEquals("hello world", sb.toString());

        sb.trim();
        assertEquals("hello world", sb.toString());
    }

    @Test
    public void testStartsWith() {
        StrBuilder sb = new StrBuilder("hello world");
        assertFalse(sb.startsWith(null));
        assertTrue(sb.startsWith(""));
        assertTrue(sb.startsWith("hello"));
        assertFalse(sb.startsWith("world"));
        assertFalse(sb.startsWith("hello world plus more"));
        assertFalse(sb.startsWith("help"));
    }

    @Test
    public void testEndsWith() {
        StrBuilder sb = new StrBuilder("hello world");
        assertFalse(sb.endsWith(null));
        assertTrue(sb.endsWith(""));
        assertTrue(sb.endsWith("world"));
        assertFalse(sb.endsWith("hello"));
        assertFalse(sb.endsWith("hello world plus more"));
        assertFalse(sb.endsWith("words"));
    }

    @Test
    public void testSubstring_int() {
        StrBuilder sb = new StrBuilder("hello world");
        assertEquals("world", sb.substring(6));

        try {
            sb.substring(-1);
            fail("Expected StringIndexOutOfBoundsException");
        } catch (StringIndexOutOfBoundsException e) {
            // expected
        }

        try {
            sb.substring(20);
            fail("Expected StringIndexOutOfBoundsException");
        } catch (StringIndexOutOfBoundsException e) {
            // expected
        }
    }

    @Test
    public void testSubstring_int_int() {
        StrBuilder sb = new StrBuilder("hello world");
        assertEquals("hello", sb.substring(0, 5));
        assertEquals("world", sb.substring(6, 20));
        assertEquals("", sb.substring(3, 3));

        try {
            sb.substring(-1, 5);
            fail("Expected StringIndexOutOfBoundsException");
        } catch (StringIndexOutOfBoundsException e) {
            // expected
        }

        try {
            sb.substring(5, 3);
            fail("Expected StringIndexOutOfBoundsException");
        } catch (StringIndexOutOfBoundsException e) {
            // expected
        }
    }

    @Test
    public void testLeftString() {
        StrBuilder sb = new StrBuilder("hello");
        assertEquals("", sb.leftString(-1));
        assertEquals("", sb.leftString(0));
        assertEquals("hel", sb.leftString(3));
        assertEquals("hello", sb.leftString(5));
        assertEquals("hello", sb.leftString(10));
    }

    @Test
    public void testRightString() {
        StrBuilder sb = new StrBuilder("hello");
        assertEquals("", sb.rightString(-1));
        assertEquals("", sb.rightString(0));
        assertEquals("llo", sb.rightString(3));
        assertEquals("hello", sb.rightString(5));
        assertEquals("hello", sb.rightString(10));
    }

    @Test
    public void testMidString() {
        StrBuilder sb = new StrBuilder("hello world");
        assertEquals("hello", sb.midString(-5, 5));
        assertEquals("", sb.midString(0, -1));
        assertEquals("", sb.midString(0, 0));
        assertEquals("", sb.midString(20, 5));
        assertEquals("world", sb.midString(6, 10));
        assertEquals("lo", sb.midString(3, 2));
    }

    @Test
    public void testContains_char() {
        StrBuilder sb = new StrBuilder("hello");
        assertTrue(sb.contains('e'));
        assertFalse(sb.contains('z'));
    }

    @Test
    public void testContains_String() {
        StrBuilder sb = new StrBuilder("hello world");
        assertTrue(sb.contains("world"));
        assertFalse(sb.contains("xyz"));
        assertFalse(sb.contains((String) null));
    }

    @Test
    public void testContains_StrMatcher() {
        StrBuilder sb = new StrBuilder("hello world");
        assertTrue(sb.contains(StrMatcher.charMatcher('w')));
        assertFalse(sb.contains(StrMatcher.charMatcher('z')));
        assertFalse(sb.contains((StrMatcher) null));
    }

    @Test
    public void testIndexOf_char() {
        StrBuilder sb = new StrBuilder("hello world");
        assertEquals(0, sb.indexOf('h'));
        assertEquals(2, sb.indexOf('l'));
        assertEquals(-1, sb.indexOf('z'));
    }

    @Test
    public void testIndexOf_char_int() {
        StrBuilder sb = new StrBuilder("hello world");
        assertEquals(0, sb.indexOf('h', -10));
        assertEquals(2, sb.indexOf('l', 0));
        assertEquals(3, sb.indexOf('l', 3));
        assertEquals(9, sb.indexOf('l', 4));
        assertEquals(-1, sb.indexOf('l', 10));
        assertEquals(-1, sb.indexOf('h', 20));
    }

    @Test
    public void testIndexOf_String() {
        StrBuilder sb = new StrBuilder("hello world hello");
        assertEquals(0, sb.indexOf("hello"));
        assertEquals(6, sb.indexOf("world"));
        assertEquals(-1, sb.indexOf("notFound"));
        assertEquals(-1, sb.indexOf((String) null));
    }

    @Test
    public void testIndexOf_String_int() {
        StrBuilder sb = new StrBuilder("hello world hello");
        assertEquals(0, sb.indexOf("hello", -5));
        assertEquals(12, sb.indexOf("hello", 1));
        assertEquals(-1, sb.indexOf("hello", 20));
        assertEquals(-1, sb.indexOf((String) null, 0));
        assertEquals(2, sb.indexOf("l", 0));
        assertEquals(0, sb.indexOf("", 0));
        assertEquals(5, sb.indexOf("", 5));
        assertEquals(-1, sb.indexOf("this is a very long string that will not fit", 0));
        assertEquals(-1, sb.indexOf("xyz", 0));
    }

    @Test
    public void testIndexOf_StrMatcher() {
        StrBuilder sb = new StrBuilder("hello world");
        assertEquals(4, sb.indexOf(StrMatcher.charMatcher('o')));
        assertEquals(-1, sb.indexOf(StrMatcher.charMatcher('z')));
        assertEquals(-1, sb.indexOf((StrMatcher) null));
    }

    @Test
    public void testIndexOf_StrMatcher_int() {
        StrBuilder sb = new StrBuilder("hello world");
        assertEquals(4, sb.indexOf(StrMatcher.charMatcher('o'), -5));
        assertEquals(7, sb.indexOf(StrMatcher.charMatcher('o'), 5));
        assertEquals(-1, sb.indexOf(StrMatcher.charMatcher('o'), 20));
        assertEquals(-1, sb.indexOf((StrMatcher) null, 0));
    }

    @Test
    public void testLastIndexOf_char() {
        StrBuilder sb = new StrBuilder("hello world");
        assertEquals(9, sb.lastIndexOf('l'));
        assertEquals(-1, sb.lastIndexOf('z'));
    }

    @Test
    public void testLastIndexOf_char_int() {
        StrBuilder sb = new StrBuilder("hello world");
        assertEquals(9, sb.lastIndexOf('l', 20));
        assertEquals(3, sb.lastIndexOf('l', 8));
        assertEquals(2, sb.lastIndexOf('l', 2));
        assertEquals(-1, sb.lastIndexOf('l', 1));
        assertEquals(-1, sb.lastIndexOf('l', -5));
        assertEquals(-1, sb.lastIndexOf('z', 5));
    }

    @Test
    public void testLastIndexOf_String() {
        StrBuilder sb = new StrBuilder("hello world hello");
        assertEquals(12, sb.lastIndexOf("hello"));
        assertEquals(6, sb.lastIndexOf("world"));
        assertEquals(-1, sb.lastIndexOf("notFound"));
        assertEquals(-1, sb.lastIndexOf((String) null));
    }

    @Test
    public void testLastIndexOf_String_int() {
        StrBuilder sb = new StrBuilder("hello world hello");
        assertEquals(12, sb.lastIndexOf("hello", 20));
        assertEquals(0, sb.lastIndexOf("hello", 10));
        assertEquals(-1, sb.lastIndexOf("hello", -5));
        assertEquals(-1, sb.lastIndexOf((String) null, 5));
        assertEquals(9, sb.lastIndexOf("l", 15));
        assertEquals(5, sb.lastIndexOf("", 5));
        assertEquals(-1, sb.lastIndexOf("this is a very long string that will not fit", 5));
        assertEquals(-1, sb.lastIndexOf("xyz", 10));
    }

    @Test
    public void testLastIndexOf_StrMatcher() {
        StrBuilder sb = new StrBuilder("hello world");
        assertEquals(7, sb.lastIndexOf(StrMatcher.charMatcher('o')));
        assertEquals(-1, sb.lastIndexOf(StrMatcher.charMatcher('z')));
        assertEquals(-1, sb.lastIndexOf((StrMatcher) null));
    }

    @Test
    public void testLastIndexOf_StrMatcher_int() {
        StrBuilder sb = new StrBuilder("hello world");
        assertEquals(7, sb.lastIndexOf(StrMatcher.charMatcher('o'), 20));
        assertEquals(4, sb.lastIndexOf(StrMatcher.charMatcher('o'), 5));
        assertEquals(-1, sb.lastIndexOf(StrMatcher.charMatcher('o'), -5));
        assertEquals(-1, sb.lastIndexOf((StrMatcher) null, 5));
        assertEquals(-1, sb.lastIndexOf(StrMatcher.charMatcher('z'), 5));
    }

    @Test
    public void testAsTokenizer() {
        StrBuilder sb = new StrBuilder("a b c");
        StrTokenizer tok = sb.asTokenizer();
        assertNotNull(tok);
        assertEquals("a", tok.next());
        assertEquals("b", tok.next());
        assertEquals("c", tok.next());
        assertFalse(tok.hasNext());

        assertEquals("a b c", tok.getContent());

        tok.reset("x y");
        assertEquals("x y", tok.getContent());
        assertEquals("x", tok.next());
        assertEquals("y", tok.next());
    }

    @Test
    public void testAsReader() throws IOException {
        StrBuilder sb = new StrBuilder("hello world");
        Reader reader = sb.asReader();
        assertTrue(reader.ready());
        assertTrue(reader.markSupported());

        assertEquals('h', reader.read());
        assertEquals('e', reader.read());

        reader.mark(10);
        assertEquals('l', reader.read());
        assertEquals('l', reader.read());

        reader.reset();
        assertEquals('l', reader.read());

        char[] buf = new char[5];
        assertEquals(0, reader.read(buf, 0, 0));

        int readCount = reader.read(buf, 0, 5);
        assertEquals(5, readCount);
        assertEquals("lo wo", new String(buf, 0, readCount));

        long skipped = reader.skip(2);
        assertEquals(2, skipped);
        assertEquals('l', reader.read());
        assertEquals('d', reader.read());

        assertEquals(-1, reader.read());
        assertEquals(-1, reader.read(buf, 0, 2));

        assertEquals(0, reader.skip(5));
        assertEquals(0, reader.skip(-1));

        try {
            reader.read(buf, -1, 1);
            fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            // expected
        }

        try {
            reader.read(buf, 0, -1);
            fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            // expected
        }

        try {
            reader.read(buf, 6, 1);
            fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            // expected
        }

        try {
            reader.read(buf, 2, 4);
            fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            // expected
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

        writer.write(new char[]{'x', 'd', 'e', 'y'}, 1, 2);
        assertEquals("abcde", sb.toString());

        writer.write("fg");
        assertEquals("abcdefg", sb.toString());

        writer.write("123hi456", 3, 2);
        assertEquals("abcdefghi", sb.toString());

        writer.flush();
        writer.close();
    }

    @Test
    public void testEqualsAndHashCode() {
        StrBuilder sb1 = new StrBuilder("hello");
        StrBuilder sb2 = new StrBuilder("hello");
        StrBuilder sb3 = new StrBuilder("world");
        StrBuilder sb4 = new StrBuilder("hell");

        assertTrue(sb1.equals(sb1));
        assertTrue(sb1.equals(sb2));
        assertTrue(sb2.equals(sb1));
        assertEquals(sb1.hashCode(), sb2.hashCode());

        assertFalse(sb1.equals(sb3));
        assertFalse(sb1.equals(sb4));
        assertFalse(sb1.equals((StrBuilder) null));
        assertFalse(sb1.equals("hello"));

        StrBuilder sbEmpty1 = new StrBuilder();
        StrBuilder sbEmpty2 = new StrBuilder();
        assertTrue(sbEmpty1.equals(sbEmpty2));
        assertEquals(sbEmpty1.hashCode(), sbEmpty2.hashCode());

        StrBuilder sbDiffChar = new StrBuilder("hallo");
        assertFalse(sb1.equals(sbDiffChar));
    }

    @Test
    public void testEqualsIgnoreCase() {
        StrBuilder sb1 = new StrBuilder("hello");
        StrBuilder sb2 = new StrBuilder("HELLO");
        StrBuilder sb3 = new StrBuilder("world");
        StrBuilder sb4 = new StrBuilder("hell");

        assertTrue(sb1.equalsIgnoreCase(sb1));
        assertTrue(sb1.equalsIgnoreCase(sb2));
        assertTrue(sb2.equalsIgnoreCase(sb1));

        assertFalse(sb1.equalsIgnoreCase(sb3));
        assertFalse(sb1.equalsIgnoreCase(sb4));
        assertFalse(sb1.equalsIgnoreCase(null));

        StrBuilder sbDiff = new StrBuilder("hallo");
        assertFalse(sb1.equalsIgnoreCase(sbDiff));
    }

    @Test
    public void testToStringAndToStringBuffer() {
        StrBuilder sb = new StrBuilder("hello");
        assertEquals("hello", sb.toString());

        StringBuffer buf = sb.toStringBuffer();
        assertEquals("hello", buf.toString());
        assertEquals(5, buf.length());
    }
}
