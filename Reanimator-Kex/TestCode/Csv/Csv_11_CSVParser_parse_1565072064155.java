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

public class CSVParser_parse_1565072064155 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term363496;
     Object term364311;
     Object term364171;

    public CSVParser_parse_1565072064155() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term363548 = new Character((char) 64955);
        Character term363600 = new Character((char) 0);
        Character term363652 = new Character((char) 0);
        term363496 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term360897 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term363496, term363496.getClass(), "delimiter", (char) 0);
        setField(term363496, term363496.getClass(), "escape", term363548);
        setField(term363496, term363496.getClass(), "quoteChar", term363600);
        setField(term363496, term363496.getClass(), "commentStart", term363652);
        setBooleanField(term363496, term363496.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term363496, term363496.getClass(), "ignoreEmptyLines", true);
        setField(term363496, term363496.getClass(), "header", term360897);
        setBooleanField(term363496, term363496.getClass(), "skipHeaderRecord", true);
        setIntField(null, Class.forName("java.io.BufferedReader"), "defaultCharBufferSize", 32);
        Character term364312 = new Character((char) 0);
        Character term364313 = new Character((char) 0);
        Character term364314 = new Character((char) 64955);
        term364311 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term364315 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term364311, term364311.getClass(), "delimiter", (char) 0);
        setField(term364311, term364311.getClass(), "quoteChar", term364312);
        setField(term364311, term364311.getClass(), "quotePolicy", null);
        setField(term364311, term364311.getClass(), "commentStart", term364313);
        setField(term364311, term364311.getClass(), "escape", term364314);
        setBooleanField(term364311, term364311.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term364311, term364311.getClass(), "ignoreEmptyHeaders", false);
        setBooleanField(term364311, term364311.getClass(), "ignoreEmptyLines", true);
        setField(term364311, term364311.getClass(), "recordSeparator", null);
        setField(term364311, term364311.getClass(), "nullString", null);
        setField(term364311, term364311.getClass(), "header", term364315);
        setBooleanField(term364311, term364311.getClass(), "skipHeaderRecord", true);
        Character term363667 = new Character((char) 0);
        Character term363669 = new Character((char) 0);
        Character term363671 = new Character((char) 64955);
        LinkedHashMap term364172 = new LinkedHashMap();
        ArrayList term364233 = new ArrayList();
        Class<? extends Object> term364349 = Class.forName((String) "org.apache.commons.csv.Token$Type");
        Field term364348 = ((Class) term364349).getDeclaredField((String) "EOF");
        ((Field) term364348).setAccessible(true);
        Object enum117 = ((Field) term364348).get((Object) null);
        term364171 = newInstance(Class.forName("org.apache.commons.csv.CSVParser"));
        Object term363665 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term363676 = (Object[]) newArray("java.lang.String", 0);
        Object term364178 = newInstance(Class.forName("org.apache.commons.csv.Lexer"));
        Object term364185 = newInstance(Class.forName("org.apache.commons.csv.ExtendedBufferedReader"));
        Object term364189 = newInstance(Class.forName("java.io.StringReader"));
        char[] term364194 = (char[]) newCharArray(32);
        Object term364238 = newInstance(Class.forName("org.apache.commons.csv.Token"));
        Object term364246 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term364247 = (byte[]) newByteArray(50);
        setCharField(term363665, term363665.getClass(), "delimiter", (char) 0);
        setField(term363665, term363665.getClass(), "quoteChar", term363667);
        setField(term363665, term363665.getClass(), "quotePolicy", null);
        setField(term363665, term363665.getClass(), "commentStart", term363669);
        setField(term363665, term363665.getClass(), "escape", term363671);
        setBooleanField(term363665, term363665.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term363665, term363665.getClass(), "ignoreEmptyHeaders", false);
        setBooleanField(term363665, term363665.getClass(), "ignoreEmptyLines", true);
        setField(term363665, term363665.getClass(), "recordSeparator", null);
        setField(term363665, term363665.getClass(), "nullString", null);
        setField(term363665, term363665.getClass(), "header", term363676);
        setBooleanField(term363665, term363665.getClass(), "skipHeaderRecord", true);
        setField(term364171, term364171.getClass(), "format", term363665);
        setField(term364171, term364171.getClass(), "headerMap", term364172);
        setCharField(term364178, term364178.getClass(), "delimiter", (char) 0);
        setCharField(term364178, term364178.getClass(), "escape", (char) 64955);
        setCharField(term364178, term364178.getClass(), "quoteChar", (char) 0);
        setCharField(term364178, term364178.getClass(), "commentStart", (char) 0);
        setBooleanField(term364178, term364178.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term364178, term364178.getClass(), "ignoreEmptyLines", true);
        setIntField(term364185, term364185.getClass(), "lastChar", -1);
        setLongField(term364185, term364185.getClass(), "eolCounter", 0L);
        setBooleanField(term364185, term364185.getClass(), "closed", false);
        setField(term364189, term364189.getClass(), "str", "");
        setIntField(term364189, term364189.getClass(), "length", 0);
        setIntField(term364189, term364189.getClass(), "next", 0);
        setIntField(term364189, term364189.getClass(), "mark", 0);
        setField(term364189, term364189.getClass(), "lock", term364189);
        setField(term364189, term364189.getClass(), "skipBuffer", null);
        setField(term364185, term364185.getClass(), "in", term364189);
        setField(term364185, term364185.getClass(), "cb", term364194);
        setIntField(term364185, term364185.getClass(), "nChars", 0);
        setIntField(term364185, term364185.getClass(), "nextChar", 0);
        setIntField(term364185, term364185.getClass(), "markedChar", -1);
        setIntField(term364185, term364185.getClass(), "readAheadLimit", 0);
        setBooleanField(term364185, term364185.getClass(), "skipLF", false);
        setBooleanField(term364185, term364185.getClass(), "markedSkipLF", false);
        setField(term364185, term364185.getClass(), "lock", term364189);
        setField(term364185, term364185.getClass(), "skipBuffer", null);
        setField(term364178, term364178.getClass(), "reader", term364185);
        setField(term364171, term364171.getClass(), "lexer", term364178);
        setField(term364171, term364171.getClass(), "record", term364233);
        setLongField(term364171, term364171.getClass(), "recordNumber", 0L);
        setField(term364238, term364238.getClass(), "type", enum117);
        setField(term364246, term364246.getClass(), "value", term364247);
        setByteField(term364246, term364246.getClass(), "coder", (byte) 0);
        setIntField(term364246, term364246.getClass(), "count", 0);
        setField(term364238, term364238.getClass(), "content", term364246);
        setBooleanField(term364238, term364238.getClass(), "isReady", false);
        setField(term364171, term364171.getClass(), "reusableToken", term364238);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("org.apache.commons.csv.CSVFormat");
        Object[] args = new Object[2];
        args[0] = "";
        args[1] = term363496;
        Object retValue = callMethod(klass, "parse", argTypes, null, args);
        assertTrue(recursiveEquals(term363496, term364311));
        assertTrue(recursiveEquals(retValue, term364171));
    }

};


