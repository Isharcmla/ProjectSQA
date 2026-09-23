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

public class CSVParser_parse_156507206451 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term195812;
     Object term196613;
     Object term196492;

    public CSVParser_parse_156507206451() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term195864 = new Character((char) 0);
        Character term195916 = new Character((char) 0);
        Character term195968 = new Character((char) 8);
        term195812 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term194462 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term195812, term195812.getClass(), "delimiter", (char) 0);
        setField(term195812, term195812.getClass(), "escapeCharacter", term195864);
        setField(term195812, term195812.getClass(), "quoteCharacter", term195916);
        setField(term195812, term195812.getClass(), "commentMarker", term195968);
        setBooleanField(term195812, term195812.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term195812, term195812.getClass(), "ignoreEmptyLines", true);
        setField(term195812, term195812.getClass(), "header", term194462);
        setBooleanField(term195812, term195812.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term195812, term195812.getClass(), "skipHeaderRecord", true);
        setIntField(null, Class.forName("java.io.BufferedReader"), "defaultCharBufferSize", 9);
        Character term196614 = new Character((char) 8);
        Character term196615 = new Character((char) 0);
        Character term196617 = new Character((char) 0);
        term196613 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term196616 = (Object[]) newArray("java.lang.String", 0);
        setBooleanField(term196613, term196613.getClass(), "allowMissingColumnNames", false);
        setField(term196613, term196613.getClass(), "commentMarker", term196614);
        setCharField(term196613, term196613.getClass(), "delimiter", (char) 0);
        setField(term196613, term196613.getClass(), "escapeCharacter", term196615);
        setField(term196613, term196613.getClass(), "header", term196616);
        setField(term196613, term196613.getClass(), "headerComments", null);
        setBooleanField(term196613, term196613.getClass(), "ignoreEmptyLines", true);
        setBooleanField(term196613, term196613.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term196613, term196613.getClass(), "ignoreSurroundingSpaces", false);
        setField(term196613, term196613.getClass(), "nullString", null);
        setField(term196613, term196613.getClass(), "quoteCharacter", term196617);
        setField(term196613, term196613.getClass(), "quoteMode", null);
        setField(term196613, term196613.getClass(), "recordSeparator", null);
        setBooleanField(term196613, term196613.getClass(), "skipHeaderRecord", true);
        setBooleanField(term196613, term196613.getClass(), "trailingDelimiter", false);
        setBooleanField(term196613, term196613.getClass(), "trim", false);
        setBooleanField(term196613, term196613.getClass(), "autoFlush", false);
        Character term195983 = new Character((char) 8);
        Character term195986 = new Character((char) 0);
        Character term195992 = new Character((char) 0);
        LinkedHashMap term196493 = new LinkedHashMap();
        ArrayList term196532 = new ArrayList();
        Class<? extends Object> term196628 = Class.forName((String) "org.apache.commons.csv.Token$Type");
        Field term196627 = ((Class) term196628).getDeclaredField((String) "EOF");
        ((Field) term196627).setAccessible(true);
        Object enum85 = ((Field) term196627).get((Object) null);
        term196492 = newInstance(Class.forName("org.apache.commons.csv.CSVParser"));
        Object term195981 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term195988 = (Object[]) newArray("java.lang.String", 0);
        Object term196499 = newInstance(Class.forName("org.apache.commons.csv.Lexer"));
        Object term196506 = newInstance(Class.forName("org.apache.commons.csv.ExtendedBufferedReader"));
        Object term196511 = newInstance(Class.forName("java.io.StringReader"));
        char[] term196516 = (char[]) newCharArray(9);
        Object term196538 = newInstance(Class.forName("org.apache.commons.csv.Token"));
        Object term196546 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term196547 = (byte[]) newByteArray(50);
        setBooleanField(term195981, term195981.getClass(), "allowMissingColumnNames", false);
        setField(term195981, term195981.getClass(), "commentMarker", term195983);
        setCharField(term195981, term195981.getClass(), "delimiter", (char) 0);
        setField(term195981, term195981.getClass(), "escapeCharacter", term195986);
        setField(term195981, term195981.getClass(), "header", term195988);
        setField(term195981, term195981.getClass(), "headerComments", null);
        setBooleanField(term195981, term195981.getClass(), "ignoreEmptyLines", true);
        setBooleanField(term195981, term195981.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term195981, term195981.getClass(), "ignoreSurroundingSpaces", false);
        setField(term195981, term195981.getClass(), "nullString", null);
        setField(term195981, term195981.getClass(), "quoteCharacter", term195992);
        setField(term195981, term195981.getClass(), "quoteMode", null);
        setField(term195981, term195981.getClass(), "recordSeparator", null);
        setBooleanField(term195981, term195981.getClass(), "skipHeaderRecord", true);
        setBooleanField(term195981, term195981.getClass(), "trailingDelimiter", false);
        setBooleanField(term195981, term195981.getClass(), "trim", false);
        setBooleanField(term195981, term195981.getClass(), "autoFlush", false);
        setField(term196492, term196492.getClass(), "format", term195981);
        setField(term196492, term196492.getClass(), "headerMap", term196493);
        setCharField(term196499, term196499.getClass(), "delimiter", (char) 0);
        setCharField(term196499, term196499.getClass(), "escape", (char) 0);
        setCharField(term196499, term196499.getClass(), "quoteChar", (char) 0);
        setCharField(term196499, term196499.getClass(), "commentStart", (char) 8);
        setBooleanField(term196499, term196499.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term196499, term196499.getClass(), "ignoreEmptyLines", true);
        setIntField(term196506, term196506.getClass(), "lastChar", -1);
        setLongField(term196506, term196506.getClass(), "eolCounter", 0L);
        setLongField(term196506, term196506.getClass(), "position", 1L);
        setBooleanField(term196506, term196506.getClass(), "closed", false);
        setField(term196511, term196511.getClass(), "str", "");
        setIntField(term196511, term196511.getClass(), "length", 0);
        setIntField(term196511, term196511.getClass(), "next", 0);
        setIntField(term196511, term196511.getClass(), "mark", 0);
        setField(term196511, term196511.getClass(), "lock", term196511);
        setField(term196511, term196511.getClass(), "skipBuffer", null);
        setField(term196506, term196506.getClass(), "in", term196511);
        setField(term196506, term196506.getClass(), "cb", term196516);
        setIntField(term196506, term196506.getClass(), "nChars", 0);
        setIntField(term196506, term196506.getClass(), "nextChar", 0);
        setIntField(term196506, term196506.getClass(), "markedChar", -1);
        setIntField(term196506, term196506.getClass(), "readAheadLimit", 0);
        setBooleanField(term196506, term196506.getClass(), "skipLF", false);
        setBooleanField(term196506, term196506.getClass(), "markedSkipLF", false);
        setField(term196506, term196506.getClass(), "lock", term196511);
        setField(term196506, term196506.getClass(), "skipBuffer", null);
        setField(term196499, term196499.getClass(), "reader", term196506);
        setField(term196499, term196499.getClass(), "firstEol", null);
        setField(term196492, term196492.getClass(), "lexer", term196499);
        setField(term196492, term196492.getClass(), "recordList", term196532);
        setLongField(term196492, term196492.getClass(), "recordNumber", 0L);
        setLongField(term196492, term196492.getClass(), "characterOffset", 0L);
        setField(term196538, term196538.getClass(), "type", enum85);
        setField(term196546, term196546.getClass(), "value", term196547);
        setByteField(term196546, term196546.getClass(), "coder", (byte) 0);
        setIntField(term196546, term196546.getClass(), "count", 0);
        setField(term196538, term196538.getClass(), "content", term196546);
        setBooleanField(term196538, term196538.getClass(), "isReady", false);
        setField(term196492, term196492.getClass(), "reusableToken", term196538);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("org.apache.commons.csv.CSVFormat");
        Object[] args = new Object[2];
        args[0] = "";
        args[1] = term195812;
        Object retValue = callMethod(klass, "parse", argTypes, null, args);
        assertTrue(recursiveEquals(term195812, term196613));
        assertTrue(recursiveEquals(retValue, term196492));
    }

};


