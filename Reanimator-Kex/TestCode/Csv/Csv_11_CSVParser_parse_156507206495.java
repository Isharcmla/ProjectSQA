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
     Object term279376;
     Object term280350;
     Object term280178;

    public CSVParser_parse_156507206495() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term279428 = new Character((char) 0);
        Character term279480 = new Character((char) 0);
        Character term279532 = new Character((char) 0);
        term279376 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term277014 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term279376, term279376.getClass(), "delimiter", (char) 0);
        setField(term279376, term279376.getClass(), "escape", term279428);
        setField(term279376, term279376.getClass(), "quoteChar", term279480);
        setField(term279376, term279376.getClass(), "commentStart", term279532);
        setBooleanField(term279376, term279376.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term279376, term279376.getClass(), "ignoreEmptyLines", false);
        setField(term279376, term279376.getClass(), "header", term277014);
        setIntField(null, Class.forName("java.io.BufferedReader"), "defaultCharBufferSize", 64);
        Character term280351 = new Character((char) 0);
        Character term280352 = new Character((char) 0);
        Character term280353 = new Character((char) 0);
        term280350 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term280354 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term280350, term280350.getClass(), "delimiter", (char) 0);
        setField(term280350, term280350.getClass(), "quoteChar", term280351);
        setField(term280350, term280350.getClass(), "quotePolicy", null);
        setField(term280350, term280350.getClass(), "commentStart", term280352);
        setField(term280350, term280350.getClass(), "escape", term280353);
        setBooleanField(term280350, term280350.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term280350, term280350.getClass(), "ignoreEmptyHeaders", false);
        setBooleanField(term280350, term280350.getClass(), "ignoreEmptyLines", false);
        setField(term280350, term280350.getClass(), "recordSeparator", null);
        setField(term280350, term280350.getClass(), "nullString", null);
        setField(term280350, term280350.getClass(), "header", term280354);
        setBooleanField(term280350, term280350.getClass(), "skipHeaderRecord", false);
        Character term279547 = new Character((char) 0);
        Character term279549 = new Character((char) 0);
        Character term279551 = new Character((char) 0);
        LinkedHashMap term280179 = new LinkedHashMap();
        ArrayList term280272 = new ArrayList();
        Class<? extends Object> term280420 = Class.forName((String) "org.apache.commons.csv.Token$Type");
        Field term280419 = ((Class) term280420).getDeclaredField((String) "EOF");
        ((Field) term280419).setAccessible(true);
        Object enum95 = ((Field) term280419).get((Object) null);
        term280178 = newInstance(Class.forName("org.apache.commons.csv.CSVParser"));
        Object term279545 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term279556 = (Object[]) newArray("java.lang.String", 0);
        Object term280185 = newInstance(Class.forName("org.apache.commons.csv.Lexer"));
        Object term280192 = newInstance(Class.forName("org.apache.commons.csv.ExtendedBufferedReader"));
        Object term280196 = newInstance(Class.forName("java.io.StringReader"));
        char[] term280201 = (char[]) newCharArray(64);
        Object term280277 = newInstance(Class.forName("org.apache.commons.csv.Token"));
        Object term280285 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term280286 = (byte[]) newByteArray(50);
        setCharField(term279545, term279545.getClass(), "delimiter", (char) 0);
        setField(term279545, term279545.getClass(), "quoteChar", term279547);
        setField(term279545, term279545.getClass(), "quotePolicy", null);
        setField(term279545, term279545.getClass(), "commentStart", term279549);
        setField(term279545, term279545.getClass(), "escape", term279551);
        setBooleanField(term279545, term279545.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term279545, term279545.getClass(), "ignoreEmptyHeaders", false);
        setBooleanField(term279545, term279545.getClass(), "ignoreEmptyLines", false);
        setField(term279545, term279545.getClass(), "recordSeparator", null);
        setField(term279545, term279545.getClass(), "nullString", null);
        setField(term279545, term279545.getClass(), "header", term279556);
        setBooleanField(term279545, term279545.getClass(), "skipHeaderRecord", false);
        setField(term280178, term280178.getClass(), "format", term279545);
        setField(term280178, term280178.getClass(), "headerMap", term280179);
        setCharField(term280185, term280185.getClass(), "delimiter", (char) 0);
        setCharField(term280185, term280185.getClass(), "escape", (char) 0);
        setCharField(term280185, term280185.getClass(), "quoteChar", (char) 0);
        setCharField(term280185, term280185.getClass(), "commentStart", (char) 0);
        setBooleanField(term280185, term280185.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term280185, term280185.getClass(), "ignoreEmptyLines", false);
        setIntField(term280192, term280192.getClass(), "lastChar", -1);
        setLongField(term280192, term280192.getClass(), "eolCounter", 0L);
        setBooleanField(term280192, term280192.getClass(), "closed", false);
        setField(term280196, term280196.getClass(), "str", "");
        setIntField(term280196, term280196.getClass(), "length", 0);
        setIntField(term280196, term280196.getClass(), "next", 0);
        setIntField(term280196, term280196.getClass(), "mark", 0);
        setField(term280196, term280196.getClass(), "lock", term280196);
        setField(term280196, term280196.getClass(), "skipBuffer", null);
        setField(term280192, term280192.getClass(), "in", term280196);
        setField(term280192, term280192.getClass(), "cb", term280201);
        setIntField(term280192, term280192.getClass(), "nChars", 0);
        setIntField(term280192, term280192.getClass(), "nextChar", 0);
        setIntField(term280192, term280192.getClass(), "markedChar", -1);
        setIntField(term280192, term280192.getClass(), "readAheadLimit", 0);
        setBooleanField(term280192, term280192.getClass(), "skipLF", false);
        setBooleanField(term280192, term280192.getClass(), "markedSkipLF", false);
        setField(term280192, term280192.getClass(), "lock", term280196);
        setField(term280192, term280192.getClass(), "skipBuffer", null);
        setField(term280185, term280185.getClass(), "reader", term280192);
        setField(term280178, term280178.getClass(), "lexer", term280185);
        setField(term280178, term280178.getClass(), "record", term280272);
        setLongField(term280178, term280178.getClass(), "recordNumber", 0L);
        setField(term280277, term280277.getClass(), "type", enum95);
        setField(term280285, term280285.getClass(), "value", term280286);
        setByteField(term280285, term280285.getClass(), "coder", (byte) 0);
        setIntField(term280285, term280285.getClass(), "count", 0);
        setField(term280277, term280277.getClass(), "content", term280285);
        setBooleanField(term280277, term280277.getClass(), "isReady", false);
        setField(term280178, term280178.getClass(), "reusableToken", term280277);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("org.apache.commons.csv.CSVFormat");
        Object[] args = new Object[2];
        args[0] = "";
        args[1] = term279376;
        Object retValue = callMethod(klass, "parse", argTypes, null, args);
        assertTrue(recursiveEquals(term279376, term280350));
        assertTrue(recursiveEquals(retValue, term280178));
    }

};


