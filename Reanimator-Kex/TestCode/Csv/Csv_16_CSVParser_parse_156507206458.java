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

public class CSVParser_parse_156507206458 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term212201;
     Object term216650;
     Object term216026;

    public CSVParser_parse_156507206458() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term212253 = new Character((char) 0);
        Character term212305 = new Character((char) 0);
        Character term212357 = new Character((char) 0);
        term212201 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term210875 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term212201, term212201.getClass(), "delimiter", (char) 0);
        setField(term212201, term212201.getClass(), "escapeCharacter", term212253);
        setField(term212201, term212201.getClass(), "quoteCharacter", term212305);
        setField(term212201, term212201.getClass(), "commentMarker", term212357);
        setBooleanField(term212201, term212201.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term212201, term212201.getClass(), "ignoreEmptyLines", false);
        setField(term212201, term212201.getClass(), "header", term210875);
        setBooleanField(term212201, term212201.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term212201, term212201.getClass(), "skipHeaderRecord", true);
        setIntField(null, Class.forName("java.io.BufferedReader"), "defaultCharBufferSize", 512);
        Character term216651 = new Character((char) 0);
        Character term216652 = new Character((char) 0);
        Character term216654 = new Character((char) 0);
        term216650 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term216653 = (Object[]) newArray("java.lang.String", 0);
        setBooleanField(term216650, term216650.getClass(), "allowMissingColumnNames", false);
        setField(term216650, term216650.getClass(), "commentMarker", term216651);
        setCharField(term216650, term216650.getClass(), "delimiter", (char) 0);
        setField(term216650, term216650.getClass(), "escapeCharacter", term216652);
        setField(term216650, term216650.getClass(), "header", term216653);
        setField(term216650, term216650.getClass(), "headerComments", null);
        setBooleanField(term216650, term216650.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term216650, term216650.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term216650, term216650.getClass(), "ignoreSurroundingSpaces", false);
        setField(term216650, term216650.getClass(), "nullString", null);
        setField(term216650, term216650.getClass(), "quoteCharacter", term216654);
        setField(term216650, term216650.getClass(), "quoteMode", null);
        setField(term216650, term216650.getClass(), "recordSeparator", null);
        setBooleanField(term216650, term216650.getClass(), "skipHeaderRecord", true);
        setBooleanField(term216650, term216650.getClass(), "trailingDelimiter", false);
        setBooleanField(term216650, term216650.getClass(), "trim", false);
        setBooleanField(term216650, term216650.getClass(), "autoFlush", false);
        Character term212500 = new Character((char) 0);
        Character term212503 = new Character((char) 0);
        Character term212509 = new Character((char) 0);
        LinkedHashMap term216027 = new LinkedHashMap();
        ArrayList term216569 = new ArrayList();
        Class<? extends Object> term217168 = Class.forName((String) "org.apache.commons.csv.Token$Type");
        Field term217167 = ((Class) term217168).getDeclaredField((String) "EOF");
        ((Field) term217167).setAccessible(true);
        Object enum88 = ((Field) term217167).get((Object) null);
        term216026 = newInstance(Class.forName("org.apache.commons.csv.CSVParser"));
        Object term212498 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term212505 = (Object[]) newArray("java.lang.String", 0);
        Object term216033 = newInstance(Class.forName("org.apache.commons.csv.Lexer"));
        Object term216040 = newInstance(Class.forName("org.apache.commons.csv.ExtendedBufferedReader"));
        Object term216045 = newInstance(Class.forName("java.io.StringReader"));
        char[] term216050 = (char[]) newCharArray(512);
        Object term216575 = newInstance(Class.forName("org.apache.commons.csv.Token"));
        Object term216583 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term216584 = (byte[]) newByteArray(50);
        setBooleanField(term212498, term212498.getClass(), "allowMissingColumnNames", false);
        setField(term212498, term212498.getClass(), "commentMarker", term212500);
        setCharField(term212498, term212498.getClass(), "delimiter", (char) 0);
        setField(term212498, term212498.getClass(), "escapeCharacter", term212503);
        setField(term212498, term212498.getClass(), "header", term212505);
        setField(term212498, term212498.getClass(), "headerComments", null);
        setBooleanField(term212498, term212498.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term212498, term212498.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term212498, term212498.getClass(), "ignoreSurroundingSpaces", false);
        setField(term212498, term212498.getClass(), "nullString", null);
        setField(term212498, term212498.getClass(), "quoteCharacter", term212509);
        setField(term212498, term212498.getClass(), "quoteMode", null);
        setField(term212498, term212498.getClass(), "recordSeparator", null);
        setBooleanField(term212498, term212498.getClass(), "skipHeaderRecord", true);
        setBooleanField(term212498, term212498.getClass(), "trailingDelimiter", false);
        setBooleanField(term212498, term212498.getClass(), "trim", false);
        setBooleanField(term212498, term212498.getClass(), "autoFlush", false);
        setField(term216026, term216026.getClass(), "format", term212498);
        setField(term216026, term216026.getClass(), "headerMap", term216027);
        setCharField(term216033, term216033.getClass(), "delimiter", (char) 0);
        setCharField(term216033, term216033.getClass(), "escape", (char) 0);
        setCharField(term216033, term216033.getClass(), "quoteChar", (char) 0);
        setCharField(term216033, term216033.getClass(), "commentStart", (char) 0);
        setBooleanField(term216033, term216033.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term216033, term216033.getClass(), "ignoreEmptyLines", false);
        setIntField(term216040, term216040.getClass(), "lastChar", -1);
        setLongField(term216040, term216040.getClass(), "eolCounter", 0L);
        setLongField(term216040, term216040.getClass(), "position", 1L);
        setBooleanField(term216040, term216040.getClass(), "closed", false);
        setField(term216045, term216045.getClass(), "str", "");
        setIntField(term216045, term216045.getClass(), "length", 0);
        setIntField(term216045, term216045.getClass(), "next", 0);
        setIntField(term216045, term216045.getClass(), "mark", 0);
        setField(term216045, term216045.getClass(), "lock", term216045);
        setField(term216045, term216045.getClass(), "skipBuffer", null);
        setField(term216040, term216040.getClass(), "in", term216045);
        setField(term216040, term216040.getClass(), "cb", term216050);
        setIntField(term216040, term216040.getClass(), "nChars", 0);
        setIntField(term216040, term216040.getClass(), "nextChar", 0);
        setIntField(term216040, term216040.getClass(), "markedChar", -1);
        setIntField(term216040, term216040.getClass(), "readAheadLimit", 0);
        setBooleanField(term216040, term216040.getClass(), "skipLF", false);
        setBooleanField(term216040, term216040.getClass(), "markedSkipLF", false);
        setField(term216040, term216040.getClass(), "lock", term216045);
        setField(term216040, term216040.getClass(), "skipBuffer", null);
        setField(term216033, term216033.getClass(), "reader", term216040);
        setField(term216033, term216033.getClass(), "firstEol", null);
        setField(term216026, term216026.getClass(), "lexer", term216033);
        setField(term216026, term216026.getClass(), "recordList", term216569);
        setLongField(term216026, term216026.getClass(), "recordNumber", 0L);
        setLongField(term216026, term216026.getClass(), "characterOffset", 0L);
        setField(term216575, term216575.getClass(), "type", enum88);
        setField(term216583, term216583.getClass(), "value", term216584);
        setByteField(term216583, term216583.getClass(), "coder", (byte) 0);
        setIntField(term216583, term216583.getClass(), "count", 0);
        setField(term216575, term216575.getClass(), "content", term216583);
        setBooleanField(term216575, term216575.getClass(), "isReady", false);
        setField(term216026, term216026.getClass(), "reusableToken", term216575);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("org.apache.commons.csv.CSVFormat");
        Object[] args = new Object[2];
        args[0] = "";
        args[1] = term212201;
        Object retValue = callMethod(klass, "parse", argTypes, null, args);
        assertTrue(recursiveEquals(term212201, term216650));
        assertTrue(recursiveEquals(retValue, term216026));
    }

};


