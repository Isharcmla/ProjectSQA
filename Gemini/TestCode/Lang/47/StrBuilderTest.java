package org.apache.commons.lang.text;

import org.junit.Test;

import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class StrBuilderTest {

    @Test
    public void testConstructors() {
        StrBuilder sb1 = new StrBuilder();
        assertEquals(0, sb1.length());
        assertEquals(32, sb1.capacity());

        StrBuilder sb2 = new StrBuilder(64);
        assertEquals(0, sb2.length());
        assertEquals(64, sb2.capacity());

        StrBuilder sb3 = new StrBuilder(-5);
        assertEquals(0, sb3.length());
        assertEquals(32, sb3.capacity());

        StrBuilder sb4 = new StrBuilder(0);
        assertEquals(0, sb4.length());
        assertEquals(32, sb4.capacity());

        StrBuilder sb5 = new StrBuilder("hello");
        assertEquals(5, sb5.length());
        assertEquals(37, sb5.capacity());
        assertEquals("hello", sb5.toString());

        StrBuilder sb6 = new StrBuilder((String) null);
        assertEquals(0, sb6.length());
        assertEquals(32, sb6.capacity());
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

        sb.setNullText("NULL");
        assertEquals("NULL", sb.getNullText());

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

        sb.setLength(0);
        assertEquals(0, sb.length());
        assertTrue(sb.isEmpty());
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testSetLength_negative_throwsException() {
        StrBuilder sb = new StrBuilder();
        sb.setLength(-1);
    }

    @Test
    public void testCapacityAndMinimizeCapacity() {
        StrBuilder sb = new StrBuilder("hello");
        assertTrue(sb.capacity() >= 5);

        sb.ensureCapacity(100);
        assertTrue(sb.capacity() >= 100);

        sb.ensureCapacity(50);
        assertTrue(sb.capacity() >= 100);

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
    public void testCharAtAndSetCharAt() {
        StrBuilder sb = new StrBuilder("hello");
        assertEquals('h', sb.charAt(0));
        assertEquals('o', sb.charAt(4));

        sb.setCharAt(0, 'H');
        assertEquals('H', sb.charAt(0));
        assertEquals("Hello", sb.toString());
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testCharAt_negative_throwsException() {
        new StrBuilder("hello").charAt(-1);
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testCharAt_outOfBounds_throwsException() {
        new StrBuilder("hello").charAt(5);
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testSetCharAt_negative_throwsException() {
        new StrBuilder("hello").setCharAt(-1, 'a');
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testSetCharAt_outOfBounds_throwsException() {
        new StrBuilder("hello").setCharAt(5, 'a');
    }

    @Test
    public void testDeleteCharAt() {
        StrBuilder sb = new StrBuilder("hello");
        sb.deleteCharAt(1);
        assertEquals("hllo", sb.toString());
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testDeleteCharAt_negative_throwsException() {
        new StrBuilder("hello").deleteCharAt(-1);
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testDeleteCharAt_outOfBounds_throwsException() {
        new StrBuilder("hello").deleteCharAt(5);
    }

    @Test
    public void testToCharArray() {
        StrBuilder sb = new StrBuilder();
        assertArrayEquals(new char[0], sb.toCharArray());

        sb.append("hello");
        assertArrayEquals(new char[]{'h', 'e', 'l', 'l', 'o'}, sb.toCharArray());

        assertArrayEquals(new char[]{'e', 'l', 'l'}, sb.toCharArray(1, 4));
        assertArrayEquals(new char[0], sb.toCharArray(2, 2));
        assertArrayEquals(new char[]{'l', 'o'}, sb.toCharArray(3, 10));
    }

    @Test
    public void testGetChars() {
        StrBuilder sb = new StrBuilder("hello");
        char[] dest = sb.getChars((char[]) null);
        assertArrayEquals(new char[]{'h', 'e', 'l', 'l', 'o'}, dest);

        char[] smallDest = new char[2];
        char[] res = sb.getChars(smallDest);
        assertEquals(5, res.length);
        assertArrayEquals(new char[]{'h', 'e', 'l', 'l', 'o'}, res);

        char[] exactDest = new char[5];
        res = sb.getChars(exactDest);
        assertSame(exactDest, res);
        assertArrayEquals(new char[]{'h', 'e', 'l', 'l', 'o'}, res);

        char[] buf = new char[10];
        sb.getChars(1, 4, buf, 2);
        assertEquals('e', buf[2]);
        assertEquals('l', buf[3]);
        assertEquals('l', buf[4]);
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testGetChars_startNegative_throwsException() {
        new StrBuilder("hello").getChars(-1, 3, new char[5], 0);
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testGetChars_endNegative_throwsException() {
        new StrBuilder("hello").getChars(1, -1, new char[5], 0);
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testGetChars_endTooLarge_throwsException() {
        new StrBuilder("hello").getChars(1, 6, new char[5], 0);
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testGetChars_startGreaterThanEnd_throwsException() {
        new StrBuilder("hello").getChars(3, 2, new char[5], 0);
    }

    @Test
    public void testAppendNewLine() {
        StrBuilder sb = new StrBuilder();
        sb.appendNewLine();
        assertTrue(sb.length() > 0);

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

        sb.setNullText("null");
        sb.appendNull();
        assertEquals("null", sb.toString());
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
        sb.append(Integer.valueOf(123));
        assertEquals("123", sb.toString());
    }

    @Test
    public void testAppend_String() {
        StrBuilder sb = new StrBuilder();
        sb.append((String) null);
        assertEquals("", sb.toString());

        sb.append("");
        assertEquals("", sb.toString());

        sb.append("foo");
        assertEquals("foo", sb.toString());

        sb.append("bar");
        assertEquals("foobar", sb.toString());
    }

    @Test
    public void testAppend_String_Int_Int() {
        StrBuilder sb = new StrBuilder();
        sb.append((String) null, 0, 0);
        assertEquals("", sb.toString());

        sb.append("hello world", 0, 5);
        assertEquals("hello", sb.toString());

        sb.append("hello world", 5, 0);
        assertEquals("hello", sb.toString());

        try {
            sb.append("hello", -1, 2);
            fail("Expected exception");
        } catch (StringIndexOutOfBoundsException expected) {}

        try {
            sb.append("hello", 6, 2);
            fail("Expected exception");
        } catch (StringIndexOutOfBoundsException expected) {}

        try {
            sb.append("hello", 0, -1);
            fail("Expected exception");
        } catch (StringIndexOutOfBoundsException expected) {}

        try {
            sb.append("hello", 2, 4);
            fail("Expected exception");
        } catch (StringIndexOutOfBoundsException expected) {}
    }

    @Test
    public void testAppend_StringBuffer() {
        StrBuilder sb = new StrBuilder();
        sb.append((StringBuffer) null);
        assertEquals("", sb.toString());

        sb.append(new StringBuffer(""));
        assertEquals("", sb.toString());

        sb.append(new StringBuffer("foo"));
        assertEquals("foo", sb.toString());

        sb.append(new StringBuffer("hello world"), 0, 5);
        assertEquals("foohello", sb.toString());

        sb.append((StringBuffer) null, 0, 0);
        assertEquals("foohello", sb.toString());

        sb.append(new StringBuffer("hello world"), 5, 0);
        assertEquals("foohello", sb.toString());

        try {
            sb.append(new StringBuffer("hello"), -1, 2);
            fail("Expected exception");
        } catch (StringIndexOutOfBoundsException expected) {}

        try {
            sb.append(new StringBuffer("hello"), 6, 2);
            fail("Expected exception");
        } catch (StringIndexOutOfBoundsException expected) {}

        try {
            sb.append(new StringBuffer("hello"), 0, -1);
            fail("Expected exception");
        } catch (StringIndexOutOfBoundsException expected) {}

        try {
            sb.append(new StringBuffer("hello"), 2, 4);
            fail("Expected exception");
        } catch (StringIndexOutOfBoundsException expected) {}
    }

    @Test
    public void testAppend_StrBuilder() {
        StrBuilder sb = new StrBuilder();
        sb.append((StrBuilder) null);
        assertEquals("", sb.toString());

        sb.append(new StrBuilder(""));
        assertEquals("", sb.toString());

        sb.append(new StrBuilder("foo"));
        assertEquals("foo", sb.toString());

        sb.append(new StrBuilder("hello world"), 0, 5);
        assertEquals("foohello", sb.toString());

        sb.append((StrBuilder) null, 0, 0);
        assertEquals("foohello", sb.toString());

        sb.append(new StrBuilder("hello world"), 5, 0);
        assertEquals("foohello", sb.toString());

        try {
            sb.append(new StrBuilder("hello"), -1, 2);
            fail("Expected exception");
        } catch (StringIndexOutOfBoundsException expected) {}

        try {
            sb.append(new StrBuilder("hello"), 6, 2);
            fail("Expected exception");
        } catch (StringIndexOutOfBoundsException expected) {}

        try {
            sb.append(new StrBuilder("hello"), 0, -1);
            fail("Expected exception");
        } catch (StringIndexOutOfBoundsException expected) {}

        try {
            sb.append(new StrBuilder("hello"), 2, 4);
            fail("Expected exception");
        } catch (StringIndexOutOfBoundsException expected) {}
    }

    @Test
    public void testAppend_CharArray() {
        StrBuilder sb = new StrBuilder();
        sb.append((char[]) null);
        assertEquals("", sb.toString());

        sb.append(new char[0]);
        assertEquals("", sb.toString());

        sb.append(new char[]{'f', 'o', 'o'});
        assertEquals("foo", sb.toString());

        sb.append(new char[]{'b', 'a', 'r', 'b', 'a', 'z'}, 0, 3);
        assertEquals("foobar", sb.toString());

        sb.append((char[]) null, 0, 0);
        assertEquals("foobar", sb.toString());

        sb.append(new char[]{'a', 'b'}, 1, 0);
        assertEquals("foobar", sb.toString());

        try {
            sb.append(new char[]{'a'}, -1, 1);
            fail("Expected exception");
        } catch (StringIndexOutOfBoundsException expected) {}

        try {
            sb.append(new char[]{'a'}, 2, 1);
            fail("Expected exception");
        } catch (StringIndexOutOfBoundsException expected) {}

        try {
            sb.append(new char[]{'a'}, 0, -1);
            fail("Expected exception");
        } catch (StringIndexOutOfBoundsException expected) {}

        try {
            sb.append(new char[]{'a'}, 0, 2);
            fail("Expected exception");
        } catch (StringIndexOutOfBoundsException expected) {}
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
    public void testAppendln_AllTypes() {
        StrBuilder sb = new StrBuilder();
        sb.setNewLineText("\n");

        sb.appendln((Object) "obj");
        sb.appendln("str");
        sb.appendln("substring", 0, 3);
        sb.appendln(new StringBuffer("sbuf"));
        sb.appendln(new StringBuffer("sbufsub"), 0, 4);
        sb.appendln(new StrBuilder("sbld"));
        sb.appendln(new StrBuilder("sbldsub"), 0, 4);
        sb.appendln(new char[]{'c', 'h', 'a', 'r'});
        sb.appendln(new char[]{'c', 'h', 'a', 'r', 's'}, 0, 4);
        sb.appendln(true);
        sb.appendln('x');
        sb.appendln(10);
        sb.appendln(20L);
        sb.appendln(1.25f);
        sb.appendln(3.75d);

        String expected = "obj\nstr\nsub\nsbuf\nsbuf\nsbld\nsbld\nchar\nchar\ntrue\nx\n10\n20\n1.25\n3.75\n";
        assertEquals(expected, sb.toString());
    }

    @Test
    public void testAppendAll_Array_Collection_Iterator() {
        StrBuilder sb = new StrBuilder();
        sb.appendAll((Object[]) null);
        sb.appendAll(new Object[0]);
        sb.appendAll(new Object[]{"a", "b", "c"});
        assertEquals("abc", sb.toString());

        sb.clear();
        sb.appendAll((Collection) null);
        sb.appendAll(Collections.emptyList());
        sb.appendAll(Arrays.asList("d", "e", "f"));
        assertEquals("def", sb.toString());

        sb.clear();
        sb.appendAll((Iterator) null);
        sb.appendAll(Arrays.asList("g", "h", "i").iterator());
        assertEquals("ghi", sb.toString());
    }

    @Test
    public void testAppendWithSeparators_Array_Collection_Iterator() {
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
        sb.appendWithSeparators(Arrays.asList("x", "y"), ":");
        assertEquals("x:y", sb.toString());

        sb.clear();
        sb.appendWithSeparators(Arrays.asList("x", "y"), null);
        assertEquals("xy", sb.toString());

        sb.clear();
        sb.appendWithSeparators((Iterator) null, ",");
        sb.appendWithSeparators(Arrays.asList("1", "2", "3").iterator(), "-");
        assertEquals("1-2-3", sb.toString());

        sb.clear();
        sb.appendWithSeparators(Arrays.asList("1", "2").iterator(), null);
        assertEquals("12", sb.toString());
    }

    @Test
    public void testAppendSeparator_StringAndChar() {
        StrBuilder sb = new StrBuilder();
        sb.appendSeparator(",");
        sb.appendSeparator(',');
        assertEquals("", sb.toString());

        sb.append("a");
        sb.appendSeparator((String) null);
        assertEquals("a", sb.toString());
        sb.appendSeparator(",");
        assertEquals("a,", sb.toString());
        sb.appendSeparator('-');
        assertEquals("a,-", sb.toString());

        sb.clear();
        sb.appendSeparator(",", 0);
        sb.appendSeparator(',', 0);
        assertEquals("", sb.toString());
        sb.appendSeparator(",", 1);
        assertEquals(",", sb.toString());
        sb.appendSeparator((String) null, 1);
        assertEquals(",", sb.toString());
        sb.appendSeparator(';', 2);
        assertEquals(",;", sb.toString());
    }

    @Test
    public void testAppendPadding() {
        StrBuilder sb = new StrBuilder();
        sb.appendPadding(-1, 'x');
        assertEquals("", sb.toString());
        sb.appendPadding(0, 'x');
        assertEquals("", sb.toString());
        sb.appendPadding(3, 'a');
        assertEquals("aaa", sb.toString());
    }

    @Test
    public void testAppendFixedWidthPadLeft() {
        StrBuilder sb = new StrBuilder();
        sb.appendFixedWidthPadLeft("abc", -1, ' ');
        assertEquals("", sb.toString());
        sb.appendFixedWidthPadLeft("abc", 0, ' ');
        assertEquals("", sb.toString());

        sb.appendFixedWidthPadLeft("abc", 5, '0');
        assertEquals("00abc", sb.toString());

        sb.clear();
        sb.appendFixedWidthPadLeft("abcdef", 3, '0');
        assertEquals("def", sb.toString());

        sb.clear();
        sb.setNullText("null");
        sb.appendFixedWidthPadLeft(null, 6, '-');
        assertEquals("--null", sb.toString());

        sb.clear();
        sb.appendFixedWidthPadLeft(12, 4, '0');
        assertEquals("0012", sb.toString());
    }

    @Test
    public void testAppendFixedWidthPadRight() {
        StrBuilder sb = new StrBuilder();
        sb.appendFixedWidthPadRight("abc", -1, ' ');
        assertEquals("", sb.toString());
        sb.appendFixedWidthPadRight("abc", 0, ' ');
        assertEquals("", sb.toString());

        sb.appendFixedWidthPadRight("abc", 5, '0');
        assertEquals("abc00", sb.toString());

        sb.clear();
        sb.appendFixedWidthPadRight("abcdef", 3, '0');
        assertEquals("abc", sb.toString());

        sb.clear();
        sb.setNullText("null");
        sb.appendFixedWidthPadRight(null, 6, '-');
        assertEquals("null--", sb.toString());

        sb.clear();
        sb.appendFixedWidthPadRight(12, 4, '0');
        assertEquals("1200", sb.toString());
    }

    @Test
    public void testInsert_Object_String_CharArray() {
        StrBuilder sb = new StrBuilder("world");
        sb.insert(0, (Object) "hello ");
        assertEquals("hello world", sb.toString());

        sb.insert(5, (Object) null);
        assertEquals("hello world", sb.toString());

        sb.setNullText("!");
        sb.insert(5, (Object) null);
        assertEquals("hello! world", sb.toString());

        sb.clear();
        sb.insert(0, (String) null);
        assertEquals("!", sb.toString());

        sb.setNullText(null);
        sb.insert(1, (String) null);
        assertEquals("!", sb.toString());

        sb.clear();
        sb.append("ac");
        sb.insert(1, "b");
        assertEquals("abc", sb.toString());

        sb.clear();
        sb.insert(0, (char[]) null);
        assertEquals("", sb.toString());

        sb.setNullText("null");
        sb.insert(0, (char[]) null);
        assertEquals("null", sb.toString());

        sb.clear();
        sb.append("ac");
        sb.insert(1, new char[]{'b'});
        assertEquals("abc", sb.toString());

        sb.clear();
        sb.insert(0, (char[]) null, 0, 0);
        assertEquals("null", sb.toString());

        sb.clear();
        sb.append("ad");
        sb.insert(1, new char[]{'a', 'b', 'c', 'd'}, 1, 2);
        assertEquals("abcd", sb.toString());

        sb.insert(1, new char[]{'x'}, 0, 0);
        assertEquals("abcd", sb.toString());
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testInsert_validateIndex_negative() {
        new StrBuilder("test").insert(-1, "a");
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testInsert_validateIndex_tooLarge() {
        new StrBuilder("test").insert(5, "a");
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testInsert_charArray_offsetNegative() {
        new StrBuilder("test").insert(0, new char[]{'a'}, -1, 1);
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testInsert_charArray_offsetTooLarge() {
        new StrBuilder("test").insert(0, new char[]{'a'}, 2, 1);
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testInsert_charArray_lengthNegative() {
        new StrBuilder("test").insert(0, new char[]{'a'}, 0, -1);
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testInsert_charArray_lengthTooLarge() {
        new StrBuilder("test").insert(0, new char[]{'a'}, 0, 2);
    }

    @Test
    public void testInsert_Primitives() {
        StrBuilder sb = new StrBuilder();
        sb.insert(0, true);
        assertEquals("true", sb.toString());

        sb.insert(4, false);
        assertEquals("truefalse", sb.toString());

        sb.insert(4, '_');
        assertEquals("true_false", sb.toString());

        sb.insert(0, 10);
        assertEquals("10true_false", sb.toString());

        sb.insert(2, 20L);
        assertEquals("1020true_false", sb.toString());

        sb.insert(0, 1.5f);
        assertEquals("1.51020true_false", sb.toString());

        sb.insert(0, 2.5d);
        assertEquals("2.51.51020true_false", sb.toString());
    }

    @Test
    public void testDelete_Range_Char_String_Matcher() {
        StrBuilder sb = new StrBuilder("hello world");
        sb.delete(5, 11);
        assertEquals("hello", sb.toString());
        sb.delete(2, 2);
        assertEquals("hello", sb.toString());

        sb = new StrBuilder("banana");
        sb.deleteAll('a');
        assertEquals("bnn", sb.toString());

        sb = new StrBuilder("banana");
        sb.deleteFirst('a');
        assertEquals("bnana", sb.toString());
        sb.deleteFirst('z');
        assertEquals("bnana", sb.toString());

        sb = new StrBuilder("hello world hello");
        sb.deleteAll((String) null);
        sb.deleteAll("");
        assertEquals("hello world hello", sb.toString());
        sb.deleteAll("hello");
        assertEquals(" world ", sb.toString());

        sb = new StrBuilder("hello world hello");
        sb.deleteFirst((String) null);
        sb.deleteFirst("");
        assertEquals("hello world hello", sb.toString());
        sb.deleteFirst("hello");
        assertEquals(" world hello", sb.toString());
        sb.deleteFirst("xyz");
        assertEquals(" world hello", sb.toString());

        sb = new StrBuilder("a1b2c3d4");
        sb.deleteAll((StrMatcher) null);
        assertEquals("a1b2c3d4", sb.toString());
        sb.deleteAll(StrMatcher.stringMatcher("b2"));
        assertEquals("a1c3d4", sb.toString());

        sb = new StrBuilder("a1b2c3b2");
        sb.deleteFirst((StrMatcher) null);
        assertEquals("a1b2c3b2", sb.toString());
        sb.deleteFirst(StrMatcher.stringMatcher("b2"));
        assertEquals("a1c3b2", sb.toString());
    }

    @Test
    public void testReplace_Range_Char_String_Matcher() {
        StrBuilder sb = new StrBuilder("hello world");
        sb.replace(6, 11, "there");
        assertEquals("hello there", sb.toString());

        sb.replace(0, 5, null);
        assertEquals(" there", sb.toString());

        sb = new StrBuilder("banana");
        sb.replaceAll('a', 'o');
        assertEquals("bonono", sb.toString());
        sb.replaceAll('x', 'x');
        assertEquals("bonono", sb.toString());

        sb = new StrBuilder("banana");
        sb.replaceFirst('a', 'o');
        assertEquals("bonana", sb.toString());
        sb.replaceFirst('x', 'x');
        assertEquals("bonana", sb.toString());
        sb.replaceFirst('z', 'y');
        assertEquals("bonana", sb.toString());

        sb = new StrBuilder("foo bar foo");
        sb.replaceAll((String) null, "baz");
        sb.replaceAll("", "baz");
        assertEquals("foo bar foo", sb.toString());
        sb.replaceAll("foo", "qux");
        assertEquals("qux bar qux", sb.toString());
        sb.replaceAll("qux", null);
        assertEquals(" bar ", sb.toString());

        sb = new StrBuilder("foo bar foo");
        sb.replaceFirst((String) null, "baz");
        sb.replaceFirst("", "baz");
        assertEquals("foo bar foo", sb.toString());
        sb.replaceFirst("foo", "qux");
        assertEquals("qux bar foo", sb.toString());
        sb.replaceFirst("qux", null);
        assertEquals(" bar foo", sb.toString());
        sb.replaceFirst("missing", "abc");
        assertEquals(" bar foo", sb.toString());

        sb = new StrBuilder("a1b2a1");
        sb.replaceAll((StrMatcher) null, "x");
        assertEquals("a1b2a1", sb.toString());
        sb.replaceAll(StrMatcher.stringMatcher("a1"), "z");
        assertEquals("zb2z", sb.toString());

        sb = new StrBuilder("a1b2a1");
        sb.replaceFirst((StrMatcher) null, "x");
        assertEquals("a1b2a1", sb.toString());
        sb.replaceFirst(StrMatcher.stringMatcher("a1"), "z");
        assertEquals("zb2a1", sb.toString());

        sb = new StrBuilder();
        sb.replace(StrMatcher.stringMatcher("a"), "b", 0, 0, -1);
        assertEquals("", sb.toString());

        sb = new StrBuilder("aaa");
        sb.replace(StrMatcher.charMatcher('a'), null, 0, 3, 2);
        assertEquals("a", sb.toString());
    }

    @Test
    public void testReverse() {
        StrBuilder sb = new StrBuilder();
        sb.reverse();
        assertEquals("", sb.toString());

        sb.append("a");
        sb.reverse();
        assertEquals("a", sb.toString());

        sb.clear();
        sb.append("ab");
        sb.reverse();
        assertEquals("ba", sb.toString());

        sb.clear();
        sb.append("abcde");
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

        sb.clear();
        sb.append("  hello  ");
        sb.trim();
        assertEquals("hello", sb.toString());

        sb.clear();
        sb.append("hello");
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
        assertFalse(sb.startsWith("help"));

        assertFalse(sb.endsWith(null));
        assertTrue(sb.endsWith(""));
        assertTrue(sb.endsWith("world"));
        assertFalse(sb.endsWith("hello"));
        assertFalse(sb.endsWith("hello world foo"));
        assertFalse(sb.endsWith("bold"));
    }

    @Test
    public void testSubstring() {
        StrBuilder sb = new StrBuilder("hello world");

        assertEquals("world", sb.substring(6));
        assertEquals("hello", sb.substring(0, 5));
        assertEquals("world", sb.substring(6, 20));
        assertEquals("", sb.substring(3, 3));

        try {
            sb.substring(-1);
            fail("Expected exception");
        } catch (StringIndexOutOfBoundsException expected) {}

        try {
            sb.substring(5, 2);
            fail("Expected exception");
        } catch (StringIndexOutOfBoundsException expected) {}
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

        assertEquals("", sb.midString(-1, 0));
        assertEquals("", sb.midString(0, -1));
        assertEquals("", sb.midString(20, 5));
        assertEquals("hel", sb.midString(-5, 3));
        assertEquals("llo ", sb.midString(2, 4));
        assertEquals("world", sb.midString(6, 20));
    }

    @Test
    public void testContains() {
        StrBuilder sb = new StrBuilder("hello world");

        assertTrue(sb.contains('h'));
        assertTrue(sb.contains('d'));
        assertFalse(sb.contains('z'));

        assertTrue(sb.contains("hello"));
        assertTrue(sb.contains("world"));
        assertFalse(sb.contains("foo"));
        assertFalse(sb.contains((String) null));

        assertTrue(sb.contains(StrMatcher.stringMatcher("world")));
        assertFalse(sb.contains(StrMatcher.stringMatcher("foo")));
        assertFalse(sb.contains((StrMatcher) null));
    }

    @Test
    public void testIndexOf_Char() {
        StrBuilder sb = new StrBuilder("hello world");

        assertEquals(0, sb.indexOf('h'));
        assertEquals(2, sb.indexOf('l'));
        assertEquals(-1, sb.indexOf('z'));

        assertEquals(2, sb.indexOf('l', -5));
        assertEquals(3, sb.indexOf('l', 3));
        assertEquals(9, sb.indexOf('l', 4));
        assertEquals(-1, sb.indexOf('l', 20));
    }

    @Test
    public void testIndexOf_String() {
        StrBuilder sb = new StrBuilder("hello world hello");

        assertEquals(-1, sb.indexOf((String) null));
        assertEquals(-1, sb.indexOf((String) null, 0));
        assertEquals(0, sb.indexOf(""));
        assertEquals(0, sb.indexOf("hello"));
        assertEquals(6, sb.indexOf("world"));
        assertEquals(-1, sb.indexOf("foo"));

        assertEquals(0, sb.indexOf("", -1));
        assertEquals(5, sb.indexOf("", 5));
        assertEquals(-1, sb.indexOf("hello", 20));
        assertEquals(-1, sb.indexOf("very long string exceeding length", 0));
        assertEquals(12, sb.indexOf("hello", 5));
        assertEquals(2, sb.indexOf("l", 0));
        assertEquals(-1, sb.indexOf("held", 0));
    }

    @Test
    public void testIndexOf_Matcher() {
        StrBuilder sb = new StrBuilder("hello world");

        assertEquals(-1, sb.indexOf((StrMatcher) null));
        assertEquals(-1, sb.indexOf((StrMatcher) null, 0));
        assertEquals(0, sb.indexOf(StrMatcher.stringMatcher("hello")));
        assertEquals(6, sb.indexOf(StrMatcher.stringMatcher("world")));
        assertEquals(-1, sb.indexOf(StrMatcher.stringMatcher("foo")));

        assertEquals(0, sb.indexOf(StrMatcher.stringMatcher("hello"), -5));
        assertEquals(-1, sb.indexOf(StrMatcher.stringMatcher("hello"), 20));
        assertEquals(6, sb.indexOf(StrMatcher.stringMatcher("world"), 2));
    }

    @Test
    public void testLastIndexOf_Char() {
        StrBuilder sb = new StrBuilder("hello world");

        assertEquals(9, sb.lastIndexOf('l'));
        assertEquals(-1, sb.lastIndexOf('z'));

        assertEquals(9, sb.lastIndexOf('l', 20));
        assertEquals(3, sb.lastIndexOf('l', 8));
        assertEquals(2, sb.lastIndexOf('l', 2));
        assertEquals(-1, sb.lastIndexOf('l', 1));
        assertEquals(-1, sb.lastIndexOf('l', -5));
    }

    @Test
    public void testLastIndexOf_String() {
        StrBuilder sb = new StrBuilder("hello world hello");

        assertEquals(-1, sb.lastIndexOf((String) null));
        assertEquals(-1, sb.lastIndexOf((String) null, 0));
        assertEquals(17, sb.lastIndexOf(""));
        assertEquals(12, sb.lastIndexOf("hello"));
        assertEquals(6, sb.lastIndexOf("world"));
        assertEquals(-1, sb.lastIndexOf("foo"));

        assertEquals(17, sb.lastIndexOf("", 20));
        assertEquals(5, sb.lastIndexOf("", 5));
        assertEquals(-1, sb.lastIndexOf("hello", -1));
        assertEquals(-1, sb.lastIndexOf("very long string exceeding length", 5));
        assertEquals(0, sb.lastIndexOf("hello", 10));
        assertEquals(9, sb.lastIndexOf("l", 10));
        assertEquals(-1, sb.lastIndexOf("held", 10));
    }

    @Test
    public void testLastIndexOf_Matcher() {
        StrBuilder sb = new StrBuilder("hello world hello");

        assertEquals(-1, sb.lastIndexOf((StrMatcher) null));
        assertEquals(-1, sb.lastIndexOf((StrMatcher) null, 0));
        assertEquals(12, sb.lastIndexOf(StrMatcher.stringMatcher("hello")));
        assertEquals(6, sb.lastIndexOf(StrMatcher.stringMatcher("world")));
        assertEquals(-1, sb.lastIndexOf(StrMatcher.stringMatcher("foo")));

        assertEquals(12, sb.lastIndexOf(StrMatcher.stringMatcher("hello"), 20));
        assertEquals(0, sb.lastIndexOf(StrMatcher.stringMatcher("hello"), 10));
        assertEquals(-1, sb.lastIndexOf(StrMatcher.stringMatcher("hello"), -5));
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
    public void testAsReader() throws Exception {
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
        assertEquals(5, reader.read(buf, 0, 5));
        assertArrayEquals(new char[]{'l', 'o', ' ', 'w', 'o'}, buf);

        assertEquals(2, reader.skip(2));
        assertEquals('d', reader.read());
        assertEquals(-1, reader.read());
        assertFalse(reader.ready());
        assertEquals(-1, reader.read(buf, 0, 5));

        assertEquals(0, reader.skip(-1));
        assertEquals(0, reader.skip(5));

        reader.close();

        try {
            reader.read(buf, -1, 1);
            fail("Expected exception");
        } catch (IndexOutOfBoundsException expected) {}
    }

    @Test
    public void testAsWriter() throws Exception {
        StrBuilder sb = new StrBuilder();
        Writer writer = sb.asWriter();

        writer.write('h');
        writer.write(new char[]{'e', 'l', 'l', 'o'});
        writer.write(new char[]{' ', 'w', 'o', 'r', 'l', 'd'}, 0, 2);
        writer.write("rld");
        writer.write(" abc", 0, 4);

        writer.flush();
        writer.close();

        assertEquals("hello world abc", sb.toString());
    }

    @Test
    public void testEqualsAndHashCode() {
        StrBuilder sb1 = new StrBuilder("hello");
        StrBuilder sb2 = new StrBuilder("hello");
        StrBuilder sb3 = new StrBuilder("world");
        StrBuilder sb4 = new StrBuilder("HELLO");

        assertTrue(sb1.equals(sb1));
        assertTrue(sb1.equals(sb2));
        assertFalse(sb1.equals(sb3));
        assertFalse(sb1.equals(sb4));
        assertFalse(sb1.equals(null));
        assertFalse(sb1.equals("hello"));

        assertTrue(sb1.equalsIgnoreCase(sb1));
        assertTrue(sb1.equalsIgnoreCase(sb2));
        assertTrue(sb1.equalsIgnoreCase(sb4));
        assertFalse(sb1.equalsIgnoreCase(sb3));
        assertFalse(sb1.equalsIgnoreCase(null));

        StrBuilder sbShort = new StrBuilder("hel");
        assertFalse(sb1.equals(sbShort));
        assertFalse(sb1.equalsIgnoreCase(sbShort));

        assertEquals(sb1.hashCode(), sb2.hashCode());
        StrBuilder empty1 = new StrBuilder();
        StrBuilder empty2 = new StrBuilder();
        assertEquals(empty1.hashCode(), empty2.hashCode());
    }

    @Test
    public void testToStringAndToStringBuffer() {
        StrBuilder sb = new StrBuilder("hello");
        assertEquals("hello", sb.toString());

        StringBuffer sbuf = sb.toStringBuffer();
        assertNotNull(sbuf);
        assertEquals("hello", sbuf.toString());
    }
}
