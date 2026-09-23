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

public class CSVParser_parse_1565072064105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term292086;
     Object term293380;
     Object term293144;

    public CSVParser_parse_1565072064105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term292138 = new Character((char) 0);
        Character term292190 = new Character((char) 0);
        Character term292242 = new Character((char) 0);
        term292086 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term291287 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term292086, term292086.getClass(), "delimiter", (char) 0);
        setField(term292086, term292086.getClass(), "escape", term292138);
        setField(term292086, term292086.getClass(), "quoteChar", term292190);
        setField(term292086, term292086.getClass(), "commentStart", term292242);
        setBooleanField(term292086, term292086.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term292086, term292086.getClass(), "ignoreEmptyLines", false);
        setField(term292086, term292086.getClass(), "header", term291287);
        setIntField(null, Class.forName("java.io.BufferedReader"), "defaultCharBufferSize", 128);
        Character term293381 = new Character((char) 0);
        Character term293382 = new Character((char) 0);
        Character term293383 = new Character((char) 0);
        term293380 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term293384 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term293380, term293380.getClass(), "delimiter", (char) 0);
        setField(term293380, term293380.getClass(), "quoteChar", term293381);
        setField(term293380, term293380.getClass(), "quotePolicy", null);
        setField(term293380, term293380.getClass(), "commentStart", term293382);
        setField(term293380, term293380.getClass(), "escape", term293383);
        setBooleanField(term293380, term293380.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term293380, term293380.getClass(), "ignoreEmptyHeaders", false);
        setBooleanField(term293380, term293380.getClass(), "ignoreEmptyLines", false);
        setField(term293380, term293380.getClass(), "recordSeparator", null);
        setField(term293380, term293380.getClass(), "nullString", null);
        setField(term293380, term293380.getClass(), "header", term293384);
        setBooleanField(term293380, term293380.getClass(), "skipHeaderRecord", false);
        Character term292257 = new Character((char) 0);
        Character term292259 = new Character((char) 0);
        Character term292261 = new Character((char) 0);
        LinkedHashMap term293145 = new LinkedHashMap();
        ArrayList term293302 = new ArrayList();
        Class<? extends Object> term293514 = Class.forName((String) "org.apache.commons.csv.Token$Type");
        Field term293513 = ((Class) term293514).getDeclaredField((String) "EOF");
        ((Field) term293513).setAccessible(true);
        Object enum99 = ((Field) term293513).get((Object) null);
        term293144 = newInstance(Class.forName("org.apache.commons.csv.CSVParser"));
        Object term292255 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term292266 = (Object[]) newArray("java.lang.String", 0);
        Object term293151 = newInstance(Class.forName("org.apache.commons.csv.Lexer"));
        Object term293158 = newInstance(Class.forName("org.apache.commons.csv.ExtendedBufferedReader"));
        Object term293162 = newInstance(Class.forName("java.io.StringReader"));
        char[] term293167 = (char[]) newCharArray(128);
        Object term293307 = newInstance(Class.forName("org.apache.commons.csv.Token"));
        Object term293315 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term293316 = (byte[]) newByteArray(50);
        setCharField(term292255, term292255.getClass(), "delimiter", (char) 0);
        setField(term292255, term292255.getClass(), "quoteChar", term292257);
        setField(term292255, term292255.getClass(), "quotePolicy", null);
        setField(term292255, term292255.getClass(), "commentStart", term292259);
        setField(term292255, term292255.getClass(), "escape", term292261);
        setBooleanField(term292255, term292255.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term292255, term292255.getClass(), "ignoreEmptyHeaders", false);
        setBooleanField(term292255, term292255.getClass(), "ignoreEmptyLines", false);
        setField(term292255, term292255.getClass(), "recordSeparator", null);
        setField(term292255, term292255.getClass(), "nullString", null);
        setField(term292255, term292255.getClass(), "header", term292266);
        setBooleanField(term292255, term292255.getClass(), "skipHeaderRecord", false);
        setField(term293144, term293144.getClass(), "format", term292255);
        setField(term293144, term293144.getClass(), "headerMap", term293145);
        setCharField(term293151, term293151.getClass(), "delimiter", (char) 0);
        setCharField(term293151, term293151.getClass(), "escape", (char) 0);
        setCharField(term293151, term293151.getClass(), "quoteChar", (char) 0);
        setCharField(term293151, term293151.getClass(), "commentStart", (char) 0);
        setBooleanField(term293151, term293151.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term293151, term293151.getClass(), "ignoreEmptyLines", false);
        setIntField(term293158, term293158.getClass(), "lastChar", -1);
        setLongField(term293158, term293158.getClass(), "eolCounter", 0L);
        setBooleanField(term293158, term293158.getClass(), "closed", false);
        setField(term293162, term293162.getClass(), "str", "");
        setIntField(term293162, term293162.getClass(), "length", 0);
        setIntField(term293162, term293162.getClass(), "next", 0);
        setIntField(term293162, term293162.getClass(), "mark", 0);
        setField(term293162, term293162.getClass(), "lock", term293162);
        setField(term293162, term293162.getClass(), "skipBuffer", null);
        setField(term293158, term293158.getClass(), "in", term293162);
        setField(term293158, term293158.getClass(), "cb", term293167);
        setIntField(term293158, term293158.getClass(), "nChars", 0);
        setIntField(term293158, term293158.getClass(), "nextChar", 0);
        setIntField(term293158, term293158.getClass(), "markedChar", -1);
        setIntField(term293158, term293158.getClass(), "readAheadLimit", 0);
        setBooleanField(term293158, term293158.getClass(), "skipLF", false);
        setBooleanField(term293158, term293158.getClass(), "markedSkipLF", false);
        setField(term293158, term293158.getClass(), "lock", term293162);
        setField(term293158, term293158.getClass(), "skipBuffer", null);
        setField(term293151, term293151.getClass(), "reader", term293158);
        setField(term293144, term293144.getClass(), "lexer", term293151);
        setField(term293144, term293144.getClass(), "record", term293302);
        setLongField(term293144, term293144.getClass(), "recordNumber", 0L);
        setField(term293307, term293307.getClass(), "type", enum99);
        setField(term293315, term293315.getClass(), "value", term293316);
        setByteField(term293315, term293315.getClass(), "coder", (byte) 0);
        setIntField(term293315, term293315.getClass(), "count", 0);
        setField(term293307, term293307.getClass(), "content", term293315);
        setBooleanField(term293307, term293307.getClass(), "isReady", false);
        setField(term293144, term293144.getClass(), "reusableToken", term293307);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("org.apache.commons.csv.CSVFormat");
        Object[] args = new Object[2];
        args[0] = "";
        args[1] = term292086;
        Object retValue = callMethod(klass, "parse", argTypes, null, args);
        assertTrue(recursiveEquals(term292086, term293380));
        assertTrue(recursiveEquals(retValue, term293144));
    }

};


