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

public class CSVParser_parse_1565072064123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term316251;
     Object term317066;
     Object term316926;

    public CSVParser_parse_1565072064123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term316303 = new Character((char) 32);
        Character term316355 = new Character((char) 256);
        Character term316407 = new Character((char) 65495);
        term316251 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term313792 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term316251, term316251.getClass(), "delimiter", (char) 1);
        setField(term316251, term316251.getClass(), "escape", term316303);
        setField(term316251, term316251.getClass(), "quoteChar", term316355);
        setField(term316251, term316251.getClass(), "commentStart", term316407);
        setBooleanField(term316251, term316251.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term316251, term316251.getClass(), "ignoreEmptyLines", true);
        setField(term316251, term316251.getClass(), "header", term313792);
        setBooleanField(term316251, term316251.getClass(), "skipHeaderRecord", true);
        setIntField(null, Class.forName("java.io.BufferedReader"), "defaultCharBufferSize", 32);
        Character term317067 = new Character((char) 256);
        Character term317068 = new Character((char) 65495);
        Character term317069 = new Character((char) 32);
        term317066 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term317070 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term317066, term317066.getClass(), "delimiter", (char) 1);
        setField(term317066, term317066.getClass(), "quoteChar", term317067);
        setField(term317066, term317066.getClass(), "quotePolicy", null);
        setField(term317066, term317066.getClass(), "commentStart", term317068);
        setField(term317066, term317066.getClass(), "escape", term317069);
        setBooleanField(term317066, term317066.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term317066, term317066.getClass(), "ignoreEmptyHeaders", false);
        setBooleanField(term317066, term317066.getClass(), "ignoreEmptyLines", true);
        setField(term317066, term317066.getClass(), "recordSeparator", null);
        setField(term317066, term317066.getClass(), "nullString", null);
        setField(term317066, term317066.getClass(), "header", term317070);
        setBooleanField(term317066, term317066.getClass(), "skipHeaderRecord", true);
        Character term316422 = new Character((char) 256);
        Character term316424 = new Character((char) 65495);
        Character term316426 = new Character((char) 32);
        LinkedHashMap term316927 = new LinkedHashMap();
        ArrayList term316988 = new ArrayList();
        Class<? extends Object> term317104 = Class.forName((String) "org.apache.commons.csv.Token$Type");
        Field term317103 = ((Class) term317104).getDeclaredField((String) "EOF");
        ((Field) term317103).setAccessible(true);
        Object enum105 = ((Field) term317103).get((Object) null);
        term316926 = newInstance(Class.forName("org.apache.commons.csv.CSVParser"));
        Object term316420 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term316431 = (Object[]) newArray("java.lang.String", 0);
        Object term316933 = newInstance(Class.forName("org.apache.commons.csv.Lexer"));
        Object term316940 = newInstance(Class.forName("org.apache.commons.csv.ExtendedBufferedReader"));
        Object term316944 = newInstance(Class.forName("java.io.StringReader"));
        char[] term316949 = (char[]) newCharArray(32);
        Object term316993 = newInstance(Class.forName("org.apache.commons.csv.Token"));
        Object term317001 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term317002 = (byte[]) newByteArray(50);
        setCharField(term316420, term316420.getClass(), "delimiter", (char) 1);
        setField(term316420, term316420.getClass(), "quoteChar", term316422);
        setField(term316420, term316420.getClass(), "quotePolicy", null);
        setField(term316420, term316420.getClass(), "commentStart", term316424);
        setField(term316420, term316420.getClass(), "escape", term316426);
        setBooleanField(term316420, term316420.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term316420, term316420.getClass(), "ignoreEmptyHeaders", false);
        setBooleanField(term316420, term316420.getClass(), "ignoreEmptyLines", true);
        setField(term316420, term316420.getClass(), "recordSeparator", null);
        setField(term316420, term316420.getClass(), "nullString", null);
        setField(term316420, term316420.getClass(), "header", term316431);
        setBooleanField(term316420, term316420.getClass(), "skipHeaderRecord", true);
        setField(term316926, term316926.getClass(), "format", term316420);
        setField(term316926, term316926.getClass(), "headerMap", term316927);
        setCharField(term316933, term316933.getClass(), "delimiter", (char) 1);
        setCharField(term316933, term316933.getClass(), "escape", (char) 32);
        setCharField(term316933, term316933.getClass(), "quoteChar", (char) 256);
        setCharField(term316933, term316933.getClass(), "commentStart", (char) 65495);
        setBooleanField(term316933, term316933.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term316933, term316933.getClass(), "ignoreEmptyLines", true);
        setIntField(term316940, term316940.getClass(), "lastChar", -1);
        setLongField(term316940, term316940.getClass(), "eolCounter", 0L);
        setBooleanField(term316940, term316940.getClass(), "closed", false);
        setField(term316944, term316944.getClass(), "str", "");
        setIntField(term316944, term316944.getClass(), "length", 0);
        setIntField(term316944, term316944.getClass(), "next", 0);
        setIntField(term316944, term316944.getClass(), "mark", 0);
        setField(term316944, term316944.getClass(), "lock", term316944);
        setField(term316944, term316944.getClass(), "skipBuffer", null);
        setField(term316940, term316940.getClass(), "in", term316944);
        setField(term316940, term316940.getClass(), "cb", term316949);
        setIntField(term316940, term316940.getClass(), "nChars", 0);
        setIntField(term316940, term316940.getClass(), "nextChar", 0);
        setIntField(term316940, term316940.getClass(), "markedChar", -1);
        setIntField(term316940, term316940.getClass(), "readAheadLimit", 0);
        setBooleanField(term316940, term316940.getClass(), "skipLF", false);
        setBooleanField(term316940, term316940.getClass(), "markedSkipLF", false);
        setField(term316940, term316940.getClass(), "lock", term316944);
        setField(term316940, term316940.getClass(), "skipBuffer", null);
        setField(term316933, term316933.getClass(), "reader", term316940);
        setField(term316926, term316926.getClass(), "lexer", term316933);
        setField(term316926, term316926.getClass(), "record", term316988);
        setLongField(term316926, term316926.getClass(), "recordNumber", 0L);
        setField(term316993, term316993.getClass(), "type", enum105);
        setField(term317001, term317001.getClass(), "value", term317002);
        setByteField(term317001, term317001.getClass(), "coder", (byte) 0);
        setIntField(term317001, term317001.getClass(), "count", 0);
        setField(term316993, term316993.getClass(), "content", term317001);
        setBooleanField(term316993, term316993.getClass(), "isReady", false);
        setField(term316926, term316926.getClass(), "reusableToken", term316993);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("org.apache.commons.csv.CSVFormat");
        Object[] args = new Object[2];
        args[0] = "";
        args[1] = term316251;
        Object retValue = callMethod(klass, "parse", argTypes, null, args);
        assertTrue(recursiveEquals(term316251, term317066));
        assertTrue(recursiveEquals(retValue, term316926));
    }

};


