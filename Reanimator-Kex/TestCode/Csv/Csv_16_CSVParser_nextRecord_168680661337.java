package org.apache.commons.csv;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.io.IOException;
import static org.apache.commons.csv.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Character;
import java.lang.String;
import java.util.HashMap;
import java.util.ArrayList;

public class CSVParser_nextRecord_168680661337 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13336;

    public CSVParser_nextRecord_168680661337() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term13339 = new Character('x');
        Character term13342 = new Character('E');
        Character term13433 = new Character('q');
        Class<? extends Object> term186847 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term186846 = ((Class) term186847).getDeclaredField((String) "NONE");
        ((Field) term186846).setAccessible(true);
        Object enum83 = ((Field) term186846).get((Object) null);
        HashMap term13459 = new HashMap();
        ArrayList term13509 = new ArrayList();
        Class<? extends Object> term187052 = Class.forName((String) "org.apache.commons.csv.Token$Type");
        Field term187051 = ((Class) term187052).getDeclaredField((String) "INVALID");
        ((Field) term187051).setAccessible(true);
        Object enum84 = ((Field) term187051).get((Object) null);
        term13336 = newInstance(Class.forName("org.apache.commons.csv.CSVParser"));
        Object term13337 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term13344 = (Object[]) newArray("java.lang.String", 0);
        Object[] term13345 = (Object[]) newArray("java.lang.String", 6);
        Object term13470 = newInstance(Class.forName("org.apache.commons.csv.Lexer"));
        Object term13477 = newInstance(Class.forName("org.apache.commons.csv.ExtendedBufferedReader"));
        char[] term13482 = (char[]) newCharArray(5);
        Object term13494 = newInstance(Class.forName("java.lang.Object"));
        char[] term13495 = (char[]) newCharArray(1);
        Object term13515 = newInstance(Class.forName("org.apache.commons.csv.Token"));
        Object term13527 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term13528 = (byte[]) newByteArray(50);
        setBooleanField(term13337, term13337.getClass(), "allowMissingColumnNames", true);
        setField(term13337, term13337.getClass(), "commentMarker", term13339);
        setCharField(term13337, term13337.getClass(), "delimiter", 'O');
        setField(term13337, term13337.getClass(), "escapeCharacter", term13342);
        setField(term13337, term13337.getClass(), "header", term13344);
        setElement(term13345, 0, "doQLHkjpNm");
        setElement(term13345, 1, "lCyLIcSuom");
        setElement(term13345, 2, "CGOpQSZZwI");
        setElement(term13345, 3, "ypEdrstygY");
        setElement(term13345, 4, "sNQFlATEeQ");
        setElement(term13345, 5, "ZKMLioamsY");
        setField(term13337, term13337.getClass(), "headerComments", term13345);
        setBooleanField(term13337, term13337.getClass(), "ignoreEmptyLines", true);
        setBooleanField(term13337, term13337.getClass(), "ignoreHeaderCase", true);
        setBooleanField(term13337, term13337.getClass(), "ignoreSurroundingSpaces", false);
        setField(term13337, term13337.getClass(), "nullString", "WVbxuoDBcn");
        setField(term13337, term13337.getClass(), "quoteCharacter", term13433);
        setField(term13337, term13337.getClass(), "quoteMode", enum83);
        setField(term13337, term13337.getClass(), "recordSeparator", "pvDEABOxLt");
        setBooleanField(term13337, term13337.getClass(), "skipHeaderRecord", true);
        setBooleanField(term13337, term13337.getClass(), "trailingDelimiter", true);
        setBooleanField(term13337, term13337.getClass(), "trim", false);
        setBooleanField(term13337, term13337.getClass(), "autoFlush", false);
        setField(term13336, term13336.getClass(), "format", term13337);
        setField(term13336, term13336.getClass(), "headerMap", term13459);
        setCharField(term13470, term13470.getClass(), "delimiter", 'z');
        setCharField(term13470, term13470.getClass(), "escape", 'G');
        setCharField(term13470, term13470.getClass(), "quoteChar", 'A');
        setCharField(term13470, term13470.getClass(), "commentStart", 'm');
        setBooleanField(term13470, term13470.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term13470, term13470.getClass(), "ignoreEmptyLines", false);
        setIntField(term13477, term13477.getClass(), "lastChar", 454281060);
        setLongField(term13477, term13477.getClass(), "eolCounter", -6292278961887936280L);
        setLongField(term13477, term13477.getClass(), "position", -6645965768855543712L);
        setBooleanField(term13477, term13477.getClass(), "closed", false);
        setField(term13477, term13477.getClass(), "in", null);
        setCharElement(term13482, 0, 'D');
        setCharElement(term13482, 1, 'U');
        setCharElement(term13482, 2, 'e');
        setCharElement(term13482, 3, 'Z');
        setCharElement(term13482, 4, 'F');
        setField(term13477, term13477.getClass(), "cb", term13482);
        setIntField(term13477, term13477.getClass(), "nChars", -1786399638);
        setIntField(term13477, term13477.getClass(), "nextChar", 2055867847);
        setIntField(term13477, term13477.getClass(), "markedChar", -1048298087);
        setIntField(term13477, term13477.getClass(), "readAheadLimit", 292681826);
        setBooleanField(term13477, term13477.getClass(), "skipLF", true);
        setBooleanField(term13477, term13477.getClass(), "markedSkipLF", true);
        setField(term13477, term13477.getClass(), "lock", term13494);
        setCharElement(term13495, 0, 'U');
        setField(term13477, term13477.getClass(), "skipBuffer", term13495);
        setField(term13470, term13470.getClass(), "reader", term13477);
        setField(term13470, term13470.getClass(), "firstEol", "uSUvKAyuvd");
        setField(term13336, term13336.getClass(), "lexer", term13470);
        setField(term13336, term13336.getClass(), "recordList", term13509);
        setLongField(term13336, term13336.getClass(), "recordNumber", 4784595517102746672L);
        setLongField(term13336, term13336.getClass(), "characterOffset", -7612550318181586304L);
        setField(term13515, term13515.getClass(), "type", enum84);
        setField(term13527, term13527.getClass(), "value", term13528);
        setByteField(term13527, term13527.getClass(), "coder", (byte) 0);
        setIntField(term13527, term13527.getClass(), "count", 0);
        setField(term13515, term13515.getClass(), "content", term13527);
        setBooleanField(term13515, term13515.getClass(), "isReady", false);
        setField(term13336, term13336.getClass(), "reusableToken", term13515);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVParser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "nextRecord", argTypes, term13336, args);
            assertTrue(false);
        }
        catch (IOException e) {
        }

    }

};


