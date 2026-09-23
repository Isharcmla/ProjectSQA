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

public class CSVParser_parse_156507206495 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term294898;
     Object term295860;
     Object term295716;

    public CSVParser_parse_156507206495() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term294950 = new Character((char) 0);
        Character term295002 = new Character((char) 0);
        Character term295054 = new Character((char) 0);
        term294898 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term286935 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term294898, term294898.getClass(), "delimiter", (char) 0);
        setField(term294898, term294898.getClass(), "escapeCharacter", term294950);
        setField(term294898, term294898.getClass(), "quoteCharacter", term295002);
        setField(term294898, term294898.getClass(), "commentMarker", term295054);
        setBooleanField(term294898, term294898.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term294898, term294898.getClass(), "ignoreEmptyLines", true);
        setField(term294898, term294898.getClass(), "header", term286935);
        setBooleanField(term294898, term294898.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term294898, term294898.getClass(), "skipHeaderRecord", true);
        setBooleanField(term294898, term294898.getClass(), "trim", false);
        setIntField(null, Class.forName("java.io.BufferedReader"), "defaultCharBufferSize", 32);
        Character term295861 = new Character((char) 0);
        Character term295862 = new Character((char) 0);
        Character term295864 = new Character((char) 0);
        term295860 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term295863 = (Object[]) newArray("java.lang.String", 0);
        setBooleanField(term295860, term295860.getClass(), "allowMissingColumnNames", false);
        setField(term295860, term295860.getClass(), "commentMarker", term295861);
        setCharField(term295860, term295860.getClass(), "delimiter", (char) 0);
        setField(term295860, term295860.getClass(), "escapeCharacter", term295862);
        setField(term295860, term295860.getClass(), "header", term295863);
        setField(term295860, term295860.getClass(), "headerComments", null);
        setBooleanField(term295860, term295860.getClass(), "ignoreEmptyLines", true);
        setBooleanField(term295860, term295860.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term295860, term295860.getClass(), "ignoreSurroundingSpaces", true);
        setField(term295860, term295860.getClass(), "nullString", null);
        setField(term295860, term295860.getClass(), "quoteCharacter", term295864);
        setField(term295860, term295860.getClass(), "quoteMode", null);
        setField(term295860, term295860.getClass(), "recordSeparator", null);
        setBooleanField(term295860, term295860.getClass(), "skipHeaderRecord", true);
        setBooleanField(term295860, term295860.getClass(), "trailingDelimiter", false);
        setBooleanField(term295860, term295860.getClass(), "trim", false);
        setBooleanField(term295860, term295860.getClass(), "autoFlush", false);
        Character term295069 = new Character((char) 0);
        Character term295072 = new Character((char) 0);
        Character term295078 = new Character((char) 0);
        LinkedHashMap term295717 = new LinkedHashMap();
        ArrayList term295779 = new ArrayList();
        Class<? extends Object> term295898 = Class.forName((String) "org.apache.commons.csv.Token$Type");
        Field term295897 = ((Class) term295898).getDeclaredField((String) "EOF");
        ((Field) term295897).setAccessible(true);
        Object enum99 = ((Field) term295897).get((Object) null);
        term295716 = newInstance(Class.forName("org.apache.commons.csv.CSVParser"));
        Object term295067 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term295074 = (Object[]) newArray("java.lang.String", 0);
        Object term295723 = newInstance(Class.forName("org.apache.commons.csv.Lexer"));
        Object term295730 = newInstance(Class.forName("org.apache.commons.csv.ExtendedBufferedReader"));
        Object term295735 = newInstance(Class.forName("java.io.StringReader"));
        char[] term295740 = (char[]) newCharArray(32);
        Object term295785 = newInstance(Class.forName("org.apache.commons.csv.Token"));
        Object term295793 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term295794 = (byte[]) newByteArray(50);
        setBooleanField(term295067, term295067.getClass(), "allowMissingColumnNames", false);
        setField(term295067, term295067.getClass(), "commentMarker", term295069);
        setCharField(term295067, term295067.getClass(), "delimiter", (char) 0);
        setField(term295067, term295067.getClass(), "escapeCharacter", term295072);
        setField(term295067, term295067.getClass(), "header", term295074);
        setField(term295067, term295067.getClass(), "headerComments", null);
        setBooleanField(term295067, term295067.getClass(), "ignoreEmptyLines", true);
        setBooleanField(term295067, term295067.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term295067, term295067.getClass(), "ignoreSurroundingSpaces", true);
        setField(term295067, term295067.getClass(), "nullString", null);
        setField(term295067, term295067.getClass(), "quoteCharacter", term295078);
        setField(term295067, term295067.getClass(), "quoteMode", null);
        setField(term295067, term295067.getClass(), "recordSeparator", null);
        setBooleanField(term295067, term295067.getClass(), "skipHeaderRecord", true);
        setBooleanField(term295067, term295067.getClass(), "trailingDelimiter", false);
        setBooleanField(term295067, term295067.getClass(), "trim", false);
        setBooleanField(term295067, term295067.getClass(), "autoFlush", false);
        setField(term295716, term295716.getClass(), "format", term295067);
        setField(term295716, term295716.getClass(), "headerMap", term295717);
        setCharField(term295723, term295723.getClass(), "delimiter", (char) 0);
        setCharField(term295723, term295723.getClass(), "escape", (char) 0);
        setCharField(term295723, term295723.getClass(), "quoteChar", (char) 0);
        setCharField(term295723, term295723.getClass(), "commentStart", (char) 0);
        setBooleanField(term295723, term295723.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term295723, term295723.getClass(), "ignoreEmptyLines", true);
        setIntField(term295730, term295730.getClass(), "lastChar", -1);
        setLongField(term295730, term295730.getClass(), "eolCounter", 0L);
        setLongField(term295730, term295730.getClass(), "position", 1L);
        setBooleanField(term295730, term295730.getClass(), "closed", false);
        setField(term295735, term295735.getClass(), "str", "");
        setIntField(term295735, term295735.getClass(), "length", 0);
        setIntField(term295735, term295735.getClass(), "next", 0);
        setIntField(term295735, term295735.getClass(), "mark", 0);
        setField(term295735, term295735.getClass(), "lock", term295735);
        setField(term295735, term295735.getClass(), "skipBuffer", null);
        setField(term295730, term295730.getClass(), "in", term295735);
        setField(term295730, term295730.getClass(), "cb", term295740);
        setIntField(term295730, term295730.getClass(), "nChars", 0);
        setIntField(term295730, term295730.getClass(), "nextChar", 0);
        setIntField(term295730, term295730.getClass(), "markedChar", -1);
        setIntField(term295730, term295730.getClass(), "readAheadLimit", 0);
        setBooleanField(term295730, term295730.getClass(), "skipLF", false);
        setBooleanField(term295730, term295730.getClass(), "markedSkipLF", false);
        setField(term295730, term295730.getClass(), "lock", term295735);
        setField(term295730, term295730.getClass(), "skipBuffer", null);
        setField(term295723, term295723.getClass(), "reader", term295730);
        setField(term295723, term295723.getClass(), "firstEol", null);
        setField(term295716, term295716.getClass(), "lexer", term295723);
        setField(term295716, term295716.getClass(), "recordList", term295779);
        setLongField(term295716, term295716.getClass(), "recordNumber", 0L);
        setLongField(term295716, term295716.getClass(), "characterOffset", 0L);
        setField(term295785, term295785.getClass(), "type", enum99);
        setField(term295793, term295793.getClass(), "value", term295794);
        setByteField(term295793, term295793.getClass(), "coder", (byte) 0);
        setIntField(term295793, term295793.getClass(), "count", 0);
        setField(term295785, term295785.getClass(), "content", term295793);
        setBooleanField(term295785, term295785.getClass(), "isReady", false);
        setField(term295716, term295716.getClass(), "reusableToken", term295785);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("org.apache.commons.csv.CSVFormat");
        Object[] args = new Object[2];
        args[0] = "";
        args[1] = term294898;
        Object retValue = callMethod(klass, "parse", argTypes, null, args);
        assertTrue(recursiveEquals(term294898, term295860));
        assertTrue(recursiveEquals(retValue, term295716));
    }

};


