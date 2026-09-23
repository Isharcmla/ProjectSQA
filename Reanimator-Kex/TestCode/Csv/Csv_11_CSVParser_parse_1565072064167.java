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

public class CSVParser_parse_1565072064167 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term648518;
     Object term649253;
     Object term649129;

    public CSVParser_parse_1565072064167() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term648570 = new Character((char) 2048);
        Character term648622 = new Character((char) 0);
        Character term648674 = new Character((char) 1024);
        term648518 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term646979 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term648518, term648518.getClass(), "delimiter", (char) 1024);
        setField(term648518, term648518.getClass(), "escape", term648570);
        setField(term648518, term648518.getClass(), "quoteChar", term648622);
        setField(term648518, term648518.getClass(), "commentStart", term648674);
        setBooleanField(term648518, term648518.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term648518, term648518.getClass(), "ignoreEmptyLines", true);
        setField(term648518, term648518.getClass(), "header", term646979);
        setBooleanField(term648518, term648518.getClass(), "skipHeaderRecord", true);
        setIntField(null, Class.forName("java.io.BufferedReader"), "defaultCharBufferSize", 16);
        Character term649254 = new Character((char) 0);
        Character term649255 = new Character((char) 1024);
        Character term649256 = new Character((char) 2048);
        term649253 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term649257 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term649253, term649253.getClass(), "delimiter", (char) 1024);
        setField(term649253, term649253.getClass(), "quoteChar", term649254);
        setField(term649253, term649253.getClass(), "quotePolicy", null);
        setField(term649253, term649253.getClass(), "commentStart", term649255);
        setField(term649253, term649253.getClass(), "escape", term649256);
        setBooleanField(term649253, term649253.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term649253, term649253.getClass(), "ignoreEmptyHeaders", false);
        setBooleanField(term649253, term649253.getClass(), "ignoreEmptyLines", true);
        setField(term649253, term649253.getClass(), "recordSeparator", null);
        setField(term649253, term649253.getClass(), "nullString", null);
        setField(term649253, term649253.getClass(), "header", term649257);
        setBooleanField(term649253, term649253.getClass(), "skipHeaderRecord", true);
        Character term648689 = new Character((char) 0);
        Character term648691 = new Character((char) 1024);
        Character term648693 = new Character((char) 2048);
        LinkedHashMap term649130 = new LinkedHashMap();
        ArrayList term649175 = new ArrayList();
        Class<? extends Object> term649275 = Class.forName((String) "org.apache.commons.csv.Token$Type");
        Field term649274 = ((Class) term649275).getDeclaredField((String) "EOF");
        ((Field) term649274).setAccessible(true);
        Object enum121 = ((Field) term649274).get((Object) null);
        term649129 = newInstance(Class.forName("org.apache.commons.csv.CSVParser"));
        Object term648687 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term648698 = (Object[]) newArray("java.lang.String", 0);
        Object term649136 = newInstance(Class.forName("org.apache.commons.csv.Lexer"));
        Object term649143 = newInstance(Class.forName("org.apache.commons.csv.ExtendedBufferedReader"));
        Object term649147 = newInstance(Class.forName("java.io.StringReader"));
        char[] term649152 = (char[]) newCharArray(16);
        Object term649180 = newInstance(Class.forName("org.apache.commons.csv.Token"));
        Object term649188 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term649189 = (byte[]) newByteArray(50);
        setCharField(term648687, term648687.getClass(), "delimiter", (char) 1024);
        setField(term648687, term648687.getClass(), "quoteChar", term648689);
        setField(term648687, term648687.getClass(), "quotePolicy", null);
        setField(term648687, term648687.getClass(), "commentStart", term648691);
        setField(term648687, term648687.getClass(), "escape", term648693);
        setBooleanField(term648687, term648687.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term648687, term648687.getClass(), "ignoreEmptyHeaders", false);
        setBooleanField(term648687, term648687.getClass(), "ignoreEmptyLines", true);
        setField(term648687, term648687.getClass(), "recordSeparator", null);
        setField(term648687, term648687.getClass(), "nullString", null);
        setField(term648687, term648687.getClass(), "header", term648698);
        setBooleanField(term648687, term648687.getClass(), "skipHeaderRecord", true);
        setField(term649129, term649129.getClass(), "format", term648687);
        setField(term649129, term649129.getClass(), "headerMap", term649130);
        setCharField(term649136, term649136.getClass(), "delimiter", (char) 1024);
        setCharField(term649136, term649136.getClass(), "escape", (char) 2048);
        setCharField(term649136, term649136.getClass(), "quoteChar", (char) 0);
        setCharField(term649136, term649136.getClass(), "commentStart", (char) 1024);
        setBooleanField(term649136, term649136.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term649136, term649136.getClass(), "ignoreEmptyLines", true);
        setIntField(term649143, term649143.getClass(), "lastChar", -1);
        setLongField(term649143, term649143.getClass(), "eolCounter", 0L);
        setBooleanField(term649143, term649143.getClass(), "closed", false);
        setField(term649147, term649147.getClass(), "str", "");
        setIntField(term649147, term649147.getClass(), "length", 0);
        setIntField(term649147, term649147.getClass(), "next", 0);
        setIntField(term649147, term649147.getClass(), "mark", 0);
        setField(term649147, term649147.getClass(), "lock", term649147);
        setField(term649147, term649147.getClass(), "skipBuffer", null);
        setField(term649143, term649143.getClass(), "in", term649147);
        setField(term649143, term649143.getClass(), "cb", term649152);
        setIntField(term649143, term649143.getClass(), "nChars", 0);
        setIntField(term649143, term649143.getClass(), "nextChar", 0);
        setIntField(term649143, term649143.getClass(), "markedChar", -1);
        setIntField(term649143, term649143.getClass(), "readAheadLimit", 0);
        setBooleanField(term649143, term649143.getClass(), "skipLF", false);
        setBooleanField(term649143, term649143.getClass(), "markedSkipLF", false);
        setField(term649143, term649143.getClass(), "lock", term649147);
        setField(term649143, term649143.getClass(), "skipBuffer", null);
        setField(term649136, term649136.getClass(), "reader", term649143);
        setField(term649129, term649129.getClass(), "lexer", term649136);
        setField(term649129, term649129.getClass(), "record", term649175);
        setLongField(term649129, term649129.getClass(), "recordNumber", 0L);
        setField(term649180, term649180.getClass(), "type", enum121);
        setField(term649188, term649188.getClass(), "value", term649189);
        setByteField(term649188, term649188.getClass(), "coder", (byte) 0);
        setIntField(term649188, term649188.getClass(), "count", 0);
        setField(term649180, term649180.getClass(), "content", term649188);
        setBooleanField(term649180, term649180.getClass(), "isReady", false);
        setField(term649129, term649129.getClass(), "reusableToken", term649180);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("org.apache.commons.csv.CSVFormat");
        Object[] args = new Object[2];
        args[0] = "";
        args[1] = term648518;
        Object retValue = callMethod(klass, "parse", argTypes, null, args);
        assertTrue(recursiveEquals(term648518, term649253));
        assertTrue(recursiveEquals(retValue, term649129));
    }

};


