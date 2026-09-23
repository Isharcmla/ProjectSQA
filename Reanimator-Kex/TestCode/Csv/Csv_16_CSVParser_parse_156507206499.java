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
import static org.apache.commons.csv.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.csv.EqualityUtils.*;
import java.lang.Character;
import java.lang.Object;
import java.util.LinkedHashMap;
import java.util.ArrayList;
import java.lang.String;

public class CSVParser_parse_156507206499 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term303952;
     Object term304697;
     Object term304584;

    public CSVParser_parse_156507206499() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term304004 = new Character((char) 0);
        Character term304056 = new Character((char) 0);
        Character term304108 = new Character((char) 0);
        term303952 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term301412 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term303952, term303952.getClass(), "delimiter", (char) 0);
        setField(term303952, term303952.getClass(), "escapeCharacter", term304004);
        setField(term303952, term303952.getClass(), "quoteCharacter", term304056);
        setField(term303952, term303952.getClass(), "commentMarker", term304108);
        setBooleanField(term303952, term303952.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term303952, term303952.getClass(), "ignoreEmptyLines", true);
        setField(term303952, term303952.getClass(), "header", term301412);
        setBooleanField(term303952, term303952.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term303952, term303952.getClass(), "skipHeaderRecord", true);
        setIntField(null, Class.forName("java.io.BufferedReader"), "defaultCharBufferSize", 1);
        Character term304698 = new Character((char) 0);
        Character term304699 = new Character((char) 0);
        Character term304701 = new Character((char) 0);
        term304697 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term304700 = (Object[]) newArray("java.lang.String", 0);
        setBooleanField(term304697, term304697.getClass(), "allowMissingColumnNames", false);
        setField(term304697, term304697.getClass(), "commentMarker", term304698);
        setCharField(term304697, term304697.getClass(), "delimiter", (char) 0);
        setField(term304697, term304697.getClass(), "escapeCharacter", term304699);
        setField(term304697, term304697.getClass(), "header", term304700);
        setField(term304697, term304697.getClass(), "headerComments", null);
        setBooleanField(term304697, term304697.getClass(), "ignoreEmptyLines", true);
        setBooleanField(term304697, term304697.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term304697, term304697.getClass(), "ignoreSurroundingSpaces", true);
        setField(term304697, term304697.getClass(), "nullString", null);
        setField(term304697, term304697.getClass(), "quoteCharacter", term304701);
        setField(term304697, term304697.getClass(), "quoteMode", null);
        setField(term304697, term304697.getClass(), "recordSeparator", null);
        setBooleanField(term304697, term304697.getClass(), "skipHeaderRecord", true);
        setBooleanField(term304697, term304697.getClass(), "trailingDelimiter", false);
        setBooleanField(term304697, term304697.getClass(), "trim", false);
        setBooleanField(term304697, term304697.getClass(), "autoFlush", false);
        Character term304123 = new Character((char) 0);
        Character term304126 = new Character((char) 0);
        Character term304132 = new Character((char) 0);
        LinkedHashMap term304585 = new LinkedHashMap();
        ArrayList term304616 = new ArrayList();
        Class<? extends Object> term304704 = Class.forName((String) "org.apache.commons.csv.Token$Type");
        Field term304703 = ((Class) term304704).getDeclaredField((String) "EOF");
        ((Field) term304703).setAccessible(true);
        Object enum101 = ((Field) term304703).get((Object) null);
        term304584 = newInstance(Class.forName("org.apache.commons.csv.CSVParser"));
        Object term304121 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term304128 = (Object[]) newArray("java.lang.String", 0);
        Object term304591 = newInstance(Class.forName("org.apache.commons.csv.Lexer"));
        Object term304598 = newInstance(Class.forName("org.apache.commons.csv.ExtendedBufferedReader"));
        Object term304603 = newInstance(Class.forName("java.io.StringReader"));
        char[] term304608 = (char[]) newCharArray(1);
        Object term304622 = newInstance(Class.forName("org.apache.commons.csv.Token"));
        Object term304630 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term304631 = (byte[]) newByteArray(50);
        setBooleanField(term304121, term304121.getClass(), "allowMissingColumnNames", false);
        setField(term304121, term304121.getClass(), "commentMarker", term304123);
        setCharField(term304121, term304121.getClass(), "delimiter", (char) 0);
        setField(term304121, term304121.getClass(), "escapeCharacter", term304126);
        setField(term304121, term304121.getClass(), "header", term304128);
        setField(term304121, term304121.getClass(), "headerComments", null);
        setBooleanField(term304121, term304121.getClass(), "ignoreEmptyLines", true);
        setBooleanField(term304121, term304121.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term304121, term304121.getClass(), "ignoreSurroundingSpaces", true);
        setField(term304121, term304121.getClass(), "nullString", null);
        setField(term304121, term304121.getClass(), "quoteCharacter", term304132);
        setField(term304121, term304121.getClass(), "quoteMode", null);
        setField(term304121, term304121.getClass(), "recordSeparator", null);
        setBooleanField(term304121, term304121.getClass(), "skipHeaderRecord", true);
        setBooleanField(term304121, term304121.getClass(), "trailingDelimiter", false);
        setBooleanField(term304121, term304121.getClass(), "trim", false);
        setBooleanField(term304121, term304121.getClass(), "autoFlush", false);
        setField(term304584, term304584.getClass(), "format", term304121);
        setField(term304584, term304584.getClass(), "headerMap", term304585);
        setCharField(term304591, term304591.getClass(), "delimiter", (char) 0);
        setCharField(term304591, term304591.getClass(), "escape", (char) 0);
        setCharField(term304591, term304591.getClass(), "quoteChar", (char) 0);
        setCharField(term304591, term304591.getClass(), "commentStart", (char) 0);
        setBooleanField(term304591, term304591.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term304591, term304591.getClass(), "ignoreEmptyLines", true);
        setIntField(term304598, term304598.getClass(), "lastChar", -1);
        setLongField(term304598, term304598.getClass(), "eolCounter", 0L);
        setLongField(term304598, term304598.getClass(), "position", 1L);
        setBooleanField(term304598, term304598.getClass(), "closed", false);
        setField(term304603, term304603.getClass(), "str", "");
        setIntField(term304603, term304603.getClass(), "length", 0);
        setIntField(term304603, term304603.getClass(), "next", 0);
        setIntField(term304603, term304603.getClass(), "mark", 0);
        setField(term304603, term304603.getClass(), "lock", term304603);
        setField(term304603, term304603.getClass(), "skipBuffer", null);
        setField(term304598, term304598.getClass(), "in", term304603);
        setField(term304598, term304598.getClass(), "cb", term304608);
        setIntField(term304598, term304598.getClass(), "nChars", 0);
        setIntField(term304598, term304598.getClass(), "nextChar", 0);
        setIntField(term304598, term304598.getClass(), "markedChar", -1);
        setIntField(term304598, term304598.getClass(), "readAheadLimit", 0);
        setBooleanField(term304598, term304598.getClass(), "skipLF", false);
        setBooleanField(term304598, term304598.getClass(), "markedSkipLF", false);
        setField(term304598, term304598.getClass(), "lock", term304603);
        setField(term304598, term304598.getClass(), "skipBuffer", null);
        setField(term304591, term304591.getClass(), "reader", term304598);
        setField(term304591, term304591.getClass(), "firstEol", null);
        setField(term304584, term304584.getClass(), "lexer", term304591);
        setField(term304584, term304584.getClass(), "recordList", term304616);
        setLongField(term304584, term304584.getClass(), "recordNumber", 0L);
        setLongField(term304584, term304584.getClass(), "characterOffset", 0L);
        setField(term304622, term304622.getClass(), "type", enum101);
        setField(term304630, term304630.getClass(), "value", term304631);
        setByteField(term304630, term304630.getClass(), "coder", (byte) 0);
        setIntField(term304630, term304630.getClass(), "count", 0);
        setField(term304622, term304622.getClass(), "content", term304630);
        setBooleanField(term304622, term304622.getClass(), "isReady", false);
        setField(term304584, term304584.getClass(), "reusableToken", term304622);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("org.apache.commons.csv.CSVFormat");
        Object[] args = new Object[2];
        args[0] = "";
        args[1] = term303952;
        Object retValue = callMethod(klass, "parse", argTypes, null, args);
        assertTrue(recursiveEquals(term303952, term304697));
        assertTrue(recursiveEquals(retValue, term304584));
    }

};


