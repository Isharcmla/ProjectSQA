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

public class CSVParser_parse_156507206441 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term181385;
     Object term182044;
     Object term181935;

    public CSVParser_parse_156507206441() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term181437 = new Character((char) 0);
        Character term181489 = new Character((char) 0);
        Character term181541 = new Character((char) 0);
        term181385 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term181168 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term181385, term181385.getClass(), "delimiter", (char) 0);
        setField(term181385, term181385.getClass(), "escape", term181437);
        setField(term181385, term181385.getClass(), "quoteChar", term181489);
        setField(term181385, term181385.getClass(), "commentStart", term181541);
        setBooleanField(term181385, term181385.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term181385, term181385.getClass(), "ignoreEmptyLines", false);
        setField(term181385, term181385.getClass(), "header", term181168);
        setIntField(null, Class.forName("java.io.BufferedReader"), "defaultCharBufferSize", 1);
        Character term182045 = new Character((char) 0);
        Character term182046 = new Character((char) 0);
        Character term182047 = new Character((char) 0);
        term182044 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term182048 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term182044, term182044.getClass(), "delimiter", (char) 0);
        setField(term182044, term182044.getClass(), "quoteChar", term182045);
        setField(term182044, term182044.getClass(), "quotePolicy", null);
        setField(term182044, term182044.getClass(), "commentStart", term182046);
        setField(term182044, term182044.getClass(), "escape", term182047);
        setBooleanField(term182044, term182044.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term182044, term182044.getClass(), "ignoreEmptyHeaders", false);
        setBooleanField(term182044, term182044.getClass(), "ignoreEmptyLines", false);
        setField(term182044, term182044.getClass(), "recordSeparator", null);
        setField(term182044, term182044.getClass(), "nullString", null);
        setField(term182044, term182044.getClass(), "header", term182048);
        setBooleanField(term182044, term182044.getClass(), "skipHeaderRecord", false);
        Character term181556 = new Character((char) 0);
        Character term181558 = new Character((char) 0);
        Character term181560 = new Character((char) 0);
        LinkedHashMap term181936 = new LinkedHashMap();
        ArrayList term181966 = new ArrayList();
        Class<? extends Object> term182051 = Class.forName((String) "org.apache.commons.csv.Token$Type");
        Field term182050 = ((Class) term182051).getDeclaredField((String) "EOF");
        ((Field) term182050).setAccessible(true);
        Object enum75 = ((Field) term182050).get((Object) null);
        term181935 = newInstance(Class.forName("org.apache.commons.csv.CSVParser"));
        Object term181554 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term181565 = (Object[]) newArray("java.lang.String", 0);
        Object term181942 = newInstance(Class.forName("org.apache.commons.csv.Lexer"));
        Object term181949 = newInstance(Class.forName("org.apache.commons.csv.ExtendedBufferedReader"));
        Object term181953 = newInstance(Class.forName("java.io.StringReader"));
        char[] term181958 = (char[]) newCharArray(1);
        Object term181971 = newInstance(Class.forName("org.apache.commons.csv.Token"));
        Object term181979 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term181980 = (byte[]) newByteArray(50);
        setCharField(term181554, term181554.getClass(), "delimiter", (char) 0);
        setField(term181554, term181554.getClass(), "quoteChar", term181556);
        setField(term181554, term181554.getClass(), "quotePolicy", null);
        setField(term181554, term181554.getClass(), "commentStart", term181558);
        setField(term181554, term181554.getClass(), "escape", term181560);
        setBooleanField(term181554, term181554.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term181554, term181554.getClass(), "ignoreEmptyHeaders", false);
        setBooleanField(term181554, term181554.getClass(), "ignoreEmptyLines", false);
        setField(term181554, term181554.getClass(), "recordSeparator", null);
        setField(term181554, term181554.getClass(), "nullString", null);
        setField(term181554, term181554.getClass(), "header", term181565);
        setBooleanField(term181554, term181554.getClass(), "skipHeaderRecord", false);
        setField(term181935, term181935.getClass(), "format", term181554);
        setField(term181935, term181935.getClass(), "headerMap", term181936);
        setCharField(term181942, term181942.getClass(), "delimiter", (char) 0);
        setCharField(term181942, term181942.getClass(), "escape", (char) 0);
        setCharField(term181942, term181942.getClass(), "quoteChar", (char) 0);
        setCharField(term181942, term181942.getClass(), "commentStart", (char) 0);
        setBooleanField(term181942, term181942.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term181942, term181942.getClass(), "ignoreEmptyLines", false);
        setIntField(term181949, term181949.getClass(), "lastChar", -1);
        setLongField(term181949, term181949.getClass(), "eolCounter", 0L);
        setBooleanField(term181949, term181949.getClass(), "closed", false);
        setField(term181953, term181953.getClass(), "str", "");
        setIntField(term181953, term181953.getClass(), "length", 0);
        setIntField(term181953, term181953.getClass(), "next", 0);
        setIntField(term181953, term181953.getClass(), "mark", 0);
        setField(term181953, term181953.getClass(), "lock", term181953);
        setField(term181953, term181953.getClass(), "skipBuffer", null);
        setField(term181949, term181949.getClass(), "in", term181953);
        setField(term181949, term181949.getClass(), "cb", term181958);
        setIntField(term181949, term181949.getClass(), "nChars", 0);
        setIntField(term181949, term181949.getClass(), "nextChar", 0);
        setIntField(term181949, term181949.getClass(), "markedChar", -1);
        setIntField(term181949, term181949.getClass(), "readAheadLimit", 0);
        setBooleanField(term181949, term181949.getClass(), "skipLF", false);
        setBooleanField(term181949, term181949.getClass(), "markedSkipLF", false);
        setField(term181949, term181949.getClass(), "lock", term181953);
        setField(term181949, term181949.getClass(), "skipBuffer", null);
        setField(term181942, term181942.getClass(), "reader", term181949);
        setField(term181935, term181935.getClass(), "lexer", term181942);
        setField(term181935, term181935.getClass(), "record", term181966);
        setLongField(term181935, term181935.getClass(), "recordNumber", 0L);
        setField(term181971, term181971.getClass(), "type", enum75);
        setField(term181979, term181979.getClass(), "value", term181980);
        setByteField(term181979, term181979.getClass(), "coder", (byte) 0);
        setIntField(term181979, term181979.getClass(), "count", 0);
        setField(term181971, term181971.getClass(), "content", term181979);
        setBooleanField(term181971, term181971.getClass(), "isReady", false);
        setField(term181935, term181935.getClass(), "reusableToken", term181971);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("org.apache.commons.csv.CSVFormat");
        Object[] args = new Object[2];
        args[0] = "";
        args[1] = term181385;
        Object retValue = callMethod(klass, "parse", argTypes, null, args);
        assertTrue(recursiveEquals(term181385, term182044));
        assertTrue(recursiveEquals(retValue, term181935));
    }

};


