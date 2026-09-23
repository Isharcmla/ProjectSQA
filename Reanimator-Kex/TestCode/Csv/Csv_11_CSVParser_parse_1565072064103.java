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

public class CSVParser_parse_1565072064103 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term289919;
     Object term290653;
     Object term290529;

    public CSVParser_parse_1565072064103() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term289971 = new Character((char) 0);
        Character term290023 = new Character((char) 0);
        Character term290075 = new Character((char) 0);
        term289919 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term287599 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term289919, term289919.getClass(), "delimiter", (char) 0);
        setField(term289919, term289919.getClass(), "escape", term289971);
        setField(term289919, term289919.getClass(), "quoteChar", term290023);
        setField(term289919, term289919.getClass(), "commentStart", term290075);
        setBooleanField(term289919, term289919.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term289919, term289919.getClass(), "ignoreEmptyLines", false);
        setField(term289919, term289919.getClass(), "header", term287599);
        setIntField(null, Class.forName("java.io.BufferedReader"), "defaultCharBufferSize", 16);
        Character term290654 = new Character((char) 0);
        Character term290655 = new Character((char) 0);
        Character term290656 = new Character((char) 0);
        term290653 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term290657 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term290653, term290653.getClass(), "delimiter", (char) 0);
        setField(term290653, term290653.getClass(), "quoteChar", term290654);
        setField(term290653, term290653.getClass(), "quotePolicy", null);
        setField(term290653, term290653.getClass(), "commentStart", term290655);
        setField(term290653, term290653.getClass(), "escape", term290656);
        setBooleanField(term290653, term290653.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term290653, term290653.getClass(), "ignoreEmptyHeaders", false);
        setBooleanField(term290653, term290653.getClass(), "ignoreEmptyLines", false);
        setField(term290653, term290653.getClass(), "recordSeparator", null);
        setField(term290653, term290653.getClass(), "nullString", null);
        setField(term290653, term290653.getClass(), "header", term290657);
        setBooleanField(term290653, term290653.getClass(), "skipHeaderRecord", false);
        Character term290090 = new Character((char) 0);
        Character term290092 = new Character((char) 0);
        Character term290094 = new Character((char) 0);
        LinkedHashMap term290530 = new LinkedHashMap();
        ArrayList term290575 = new ArrayList();
        Class<? extends Object> term290675 = Class.forName((String) "org.apache.commons.csv.Token$Type");
        Field term290674 = ((Class) term290675).getDeclaredField((String) "EOF");
        ((Field) term290674).setAccessible(true);
        Object enum98 = ((Field) term290674).get((Object) null);
        term290529 = newInstance(Class.forName("org.apache.commons.csv.CSVParser"));
        Object term290088 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term290099 = (Object[]) newArray("java.lang.String", 0);
        Object term290536 = newInstance(Class.forName("org.apache.commons.csv.Lexer"));
        Object term290543 = newInstance(Class.forName("org.apache.commons.csv.ExtendedBufferedReader"));
        Object term290547 = newInstance(Class.forName("java.io.StringReader"));
        char[] term290552 = (char[]) newCharArray(16);
        Object term290580 = newInstance(Class.forName("org.apache.commons.csv.Token"));
        Object term290588 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term290589 = (byte[]) newByteArray(50);
        setCharField(term290088, term290088.getClass(), "delimiter", (char) 0);
        setField(term290088, term290088.getClass(), "quoteChar", term290090);
        setField(term290088, term290088.getClass(), "quotePolicy", null);
        setField(term290088, term290088.getClass(), "commentStart", term290092);
        setField(term290088, term290088.getClass(), "escape", term290094);
        setBooleanField(term290088, term290088.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term290088, term290088.getClass(), "ignoreEmptyHeaders", false);
        setBooleanField(term290088, term290088.getClass(), "ignoreEmptyLines", false);
        setField(term290088, term290088.getClass(), "recordSeparator", null);
        setField(term290088, term290088.getClass(), "nullString", null);
        setField(term290088, term290088.getClass(), "header", term290099);
        setBooleanField(term290088, term290088.getClass(), "skipHeaderRecord", false);
        setField(term290529, term290529.getClass(), "format", term290088);
        setField(term290529, term290529.getClass(), "headerMap", term290530);
        setCharField(term290536, term290536.getClass(), "delimiter", (char) 0);
        setCharField(term290536, term290536.getClass(), "escape", (char) 0);
        setCharField(term290536, term290536.getClass(), "quoteChar", (char) 0);
        setCharField(term290536, term290536.getClass(), "commentStart", (char) 0);
        setBooleanField(term290536, term290536.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term290536, term290536.getClass(), "ignoreEmptyLines", false);
        setIntField(term290543, term290543.getClass(), "lastChar", -1);
        setLongField(term290543, term290543.getClass(), "eolCounter", 0L);
        setBooleanField(term290543, term290543.getClass(), "closed", false);
        setField(term290547, term290547.getClass(), "str", "");
        setIntField(term290547, term290547.getClass(), "length", 0);
        setIntField(term290547, term290547.getClass(), "next", 0);
        setIntField(term290547, term290547.getClass(), "mark", 0);
        setField(term290547, term290547.getClass(), "lock", term290547);
        setField(term290547, term290547.getClass(), "skipBuffer", null);
        setField(term290543, term290543.getClass(), "in", term290547);
        setField(term290543, term290543.getClass(), "cb", term290552);
        setIntField(term290543, term290543.getClass(), "nChars", 0);
        setIntField(term290543, term290543.getClass(), "nextChar", 0);
        setIntField(term290543, term290543.getClass(), "markedChar", -1);
        setIntField(term290543, term290543.getClass(), "readAheadLimit", 0);
        setBooleanField(term290543, term290543.getClass(), "skipLF", false);
        setBooleanField(term290543, term290543.getClass(), "markedSkipLF", false);
        setField(term290543, term290543.getClass(), "lock", term290547);
        setField(term290543, term290543.getClass(), "skipBuffer", null);
        setField(term290536, term290536.getClass(), "reader", term290543);
        setField(term290529, term290529.getClass(), "lexer", term290536);
        setField(term290529, term290529.getClass(), "record", term290575);
        setLongField(term290529, term290529.getClass(), "recordNumber", 0L);
        setField(term290580, term290580.getClass(), "type", enum98);
        setField(term290588, term290588.getClass(), "value", term290589);
        setByteField(term290588, term290588.getClass(), "coder", (byte) 0);
        setIntField(term290588, term290588.getClass(), "count", 0);
        setField(term290580, term290580.getClass(), "content", term290588);
        setBooleanField(term290580, term290580.getClass(), "isReady", false);
        setField(term290529, term290529.getClass(), "reusableToken", term290580);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("org.apache.commons.csv.CSVFormat");
        Object[] args = new Object[2];
        args[0] = "";
        args[1] = term289919;
        Object retValue = callMethod(klass, "parse", argTypes, null, args);
        assertTrue(recursiveEquals(term289919, term290653));
        assertTrue(recursiveEquals(retValue, term290529));
    }

};


