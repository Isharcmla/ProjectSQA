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

public class CSVParser_parse_1565072064143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term353816;
     Object term354476;
     Object term354367;

    public CSVParser_parse_1565072064143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term353868 = new Character((char) 58648);
        Character term353920 = new Character((char) 0);
        Character term353972 = new Character((char) 58648);
        term353816 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term352221 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term353816, term353816.getClass(), "delimiter", (char) 34848);
        setField(term353816, term353816.getClass(), "escape", term353868);
        setField(term353816, term353816.getClass(), "quoteChar", term353920);
        setField(term353816, term353816.getClass(), "commentStart", term353972);
        setBooleanField(term353816, term353816.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term353816, term353816.getClass(), "ignoreEmptyLines", true);
        setField(term353816, term353816.getClass(), "header", term352221);
        setBooleanField(term353816, term353816.getClass(), "skipHeaderRecord", true);
        setIntField(null, Class.forName("java.io.BufferedReader"), "defaultCharBufferSize", 1);
        Character term354477 = new Character((char) 0);
        Character term354478 = new Character((char) 58648);
        Character term354479 = new Character((char) 58648);
        term354476 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term354480 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term354476, term354476.getClass(), "delimiter", (char) 34848);
        setField(term354476, term354476.getClass(), "quoteChar", term354477);
        setField(term354476, term354476.getClass(), "quotePolicy", null);
        setField(term354476, term354476.getClass(), "commentStart", term354478);
        setField(term354476, term354476.getClass(), "escape", term354479);
        setBooleanField(term354476, term354476.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term354476, term354476.getClass(), "ignoreEmptyHeaders", false);
        setBooleanField(term354476, term354476.getClass(), "ignoreEmptyLines", true);
        setField(term354476, term354476.getClass(), "recordSeparator", null);
        setField(term354476, term354476.getClass(), "nullString", null);
        setField(term354476, term354476.getClass(), "header", term354480);
        setBooleanField(term354476, term354476.getClass(), "skipHeaderRecord", true);
        Character term353987 = new Character((char) 0);
        Character term353989 = new Character((char) 58648);
        Character term353991 = new Character((char) 58648);
        LinkedHashMap term354368 = new LinkedHashMap();
        ArrayList term354398 = new ArrayList();
        Class<? extends Object> term354483 = Class.forName((String) "org.apache.commons.csv.Token$Type");
        Field term354482 = ((Class) term354483).getDeclaredField((String) "EOF");
        ((Field) term354482).setAccessible(true);
        Object enum114 = ((Field) term354482).get((Object) null);
        term354367 = newInstance(Class.forName("org.apache.commons.csv.CSVParser"));
        Object term353985 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term353996 = (Object[]) newArray("java.lang.String", 0);
        Object term354374 = newInstance(Class.forName("org.apache.commons.csv.Lexer"));
        Object term354381 = newInstance(Class.forName("org.apache.commons.csv.ExtendedBufferedReader"));
        Object term354385 = newInstance(Class.forName("java.io.StringReader"));
        char[] term354390 = (char[]) newCharArray(1);
        Object term354403 = newInstance(Class.forName("org.apache.commons.csv.Token"));
        Object term354411 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term354412 = (byte[]) newByteArray(50);
        setCharField(term353985, term353985.getClass(), "delimiter", (char) 34848);
        setField(term353985, term353985.getClass(), "quoteChar", term353987);
        setField(term353985, term353985.getClass(), "quotePolicy", null);
        setField(term353985, term353985.getClass(), "commentStart", term353989);
        setField(term353985, term353985.getClass(), "escape", term353991);
        setBooleanField(term353985, term353985.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term353985, term353985.getClass(), "ignoreEmptyHeaders", false);
        setBooleanField(term353985, term353985.getClass(), "ignoreEmptyLines", true);
        setField(term353985, term353985.getClass(), "recordSeparator", null);
        setField(term353985, term353985.getClass(), "nullString", null);
        setField(term353985, term353985.getClass(), "header", term353996);
        setBooleanField(term353985, term353985.getClass(), "skipHeaderRecord", true);
        setField(term354367, term354367.getClass(), "format", term353985);
        setField(term354367, term354367.getClass(), "headerMap", term354368);
        setCharField(term354374, term354374.getClass(), "delimiter", (char) 34848);
        setCharField(term354374, term354374.getClass(), "escape", (char) 58648);
        setCharField(term354374, term354374.getClass(), "quoteChar", (char) 0);
        setCharField(term354374, term354374.getClass(), "commentStart", (char) 58648);
        setBooleanField(term354374, term354374.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term354374, term354374.getClass(), "ignoreEmptyLines", true);
        setIntField(term354381, term354381.getClass(), "lastChar", -1);
        setLongField(term354381, term354381.getClass(), "eolCounter", 0L);
        setBooleanField(term354381, term354381.getClass(), "closed", false);
        setField(term354385, term354385.getClass(), "str", "");
        setIntField(term354385, term354385.getClass(), "length", 0);
        setIntField(term354385, term354385.getClass(), "next", 0);
        setIntField(term354385, term354385.getClass(), "mark", 0);
        setField(term354385, term354385.getClass(), "lock", term354385);
        setField(term354385, term354385.getClass(), "skipBuffer", null);
        setField(term354381, term354381.getClass(), "in", term354385);
        setField(term354381, term354381.getClass(), "cb", term354390);
        setIntField(term354381, term354381.getClass(), "nChars", 0);
        setIntField(term354381, term354381.getClass(), "nextChar", 0);
        setIntField(term354381, term354381.getClass(), "markedChar", -1);
        setIntField(term354381, term354381.getClass(), "readAheadLimit", 0);
        setBooleanField(term354381, term354381.getClass(), "skipLF", false);
        setBooleanField(term354381, term354381.getClass(), "markedSkipLF", false);
        setField(term354381, term354381.getClass(), "lock", term354385);
        setField(term354381, term354381.getClass(), "skipBuffer", null);
        setField(term354374, term354374.getClass(), "reader", term354381);
        setField(term354367, term354367.getClass(), "lexer", term354374);
        setField(term354367, term354367.getClass(), "record", term354398);
        setLongField(term354367, term354367.getClass(), "recordNumber", 0L);
        setField(term354403, term354403.getClass(), "type", enum114);
        setField(term354411, term354411.getClass(), "value", term354412);
        setByteField(term354411, term354411.getClass(), "coder", (byte) 0);
        setIntField(term354411, term354411.getClass(), "count", 0);
        setField(term354403, term354403.getClass(), "content", term354411);
        setBooleanField(term354403, term354403.getClass(), "isReady", false);
        setField(term354367, term354367.getClass(), "reusableToken", term354403);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("org.apache.commons.csv.CSVFormat");
        Object[] args = new Object[2];
        args[0] = "";
        args[1] = term353816;
        Object retValue = callMethod(klass, "parse", argTypes, null, args);
        assertTrue(recursiveEquals(term353816, term354476));
        assertTrue(recursiveEquals(retValue, term354367));
    }

};


