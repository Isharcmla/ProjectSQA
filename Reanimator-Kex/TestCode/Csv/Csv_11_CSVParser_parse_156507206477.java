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

public class CSVParser_parse_156507206477 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term239880;
     Object term241814;
     Object term241450;

    public CSVParser_parse_156507206477() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term239932 = new Character((char) 0);
        Character term239984 = new Character((char) 0);
        Character term240036 = new Character((char) 0);
        term239880 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term237548 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term239880, term239880.getClass(), "delimiter", (char) 0);
        setField(term239880, term239880.getClass(), "escape", term239932);
        setField(term239880, term239880.getClass(), "quoteChar", term239984);
        setField(term239880, term239880.getClass(), "commentStart", term240036);
        setBooleanField(term239880, term239880.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term239880, term239880.getClass(), "ignoreEmptyLines", false);
        setField(term239880, term239880.getClass(), "header", term237548);
        setBooleanField(term239880, term239880.getClass(), "skipHeaderRecord", true);
        setIntField(null, Class.forName("java.io.BufferedReader"), "defaultCharBufferSize", 256);
        Character term241815 = new Character((char) 0);
        Character term241816 = new Character((char) 0);
        Character term241817 = new Character((char) 0);
        term241814 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term241818 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term241814, term241814.getClass(), "delimiter", (char) 0);
        setField(term241814, term241814.getClass(), "quoteChar", term241815);
        setField(term241814, term241814.getClass(), "quotePolicy", null);
        setField(term241814, term241814.getClass(), "commentStart", term241816);
        setField(term241814, term241814.getClass(), "escape", term241817);
        setBooleanField(term241814, term241814.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term241814, term241814.getClass(), "ignoreEmptyHeaders", false);
        setBooleanField(term241814, term241814.getClass(), "ignoreEmptyLines", false);
        setField(term241814, term241814.getClass(), "recordSeparator", null);
        setField(term241814, term241814.getClass(), "nullString", null);
        setField(term241814, term241814.getClass(), "header", term241818);
        setBooleanField(term241814, term241814.getClass(), "skipHeaderRecord", true);
        Character term240051 = new Character((char) 0);
        Character term240053 = new Character((char) 0);
        Character term240055 = new Character((char) 0);
        LinkedHashMap term241451 = new LinkedHashMap();
        ArrayList term241736 = new ArrayList();
        Class<? extends Object> term242076 = Class.forName((String) "org.apache.commons.csv.Token$Type");
        Field term242075 = ((Class) term242076).getDeclaredField((String) "EOF");
        ((Field) term242075).setAccessible(true);
        Object enum86 = ((Field) term242075).get((Object) null);
        term241450 = newInstance(Class.forName("org.apache.commons.csv.CSVParser"));
        Object term240049 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term240060 = (Object[]) newArray("java.lang.String", 0);
        Object term241457 = newInstance(Class.forName("org.apache.commons.csv.Lexer"));
        Object term241464 = newInstance(Class.forName("org.apache.commons.csv.ExtendedBufferedReader"));
        Object term241468 = newInstance(Class.forName("java.io.StringReader"));
        char[] term241473 = (char[]) newCharArray(256);
        Object term241741 = newInstance(Class.forName("org.apache.commons.csv.Token"));
        Object term241749 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term241750 = (byte[]) newByteArray(50);
        setCharField(term240049, term240049.getClass(), "delimiter", (char) 0);
        setField(term240049, term240049.getClass(), "quoteChar", term240051);
        setField(term240049, term240049.getClass(), "quotePolicy", null);
        setField(term240049, term240049.getClass(), "commentStart", term240053);
        setField(term240049, term240049.getClass(), "escape", term240055);
        setBooleanField(term240049, term240049.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term240049, term240049.getClass(), "ignoreEmptyHeaders", false);
        setBooleanField(term240049, term240049.getClass(), "ignoreEmptyLines", false);
        setField(term240049, term240049.getClass(), "recordSeparator", null);
        setField(term240049, term240049.getClass(), "nullString", null);
        setField(term240049, term240049.getClass(), "header", term240060);
        setBooleanField(term240049, term240049.getClass(), "skipHeaderRecord", true);
        setField(term241450, term241450.getClass(), "format", term240049);
        setField(term241450, term241450.getClass(), "headerMap", term241451);
        setCharField(term241457, term241457.getClass(), "delimiter", (char) 0);
        setCharField(term241457, term241457.getClass(), "escape", (char) 0);
        setCharField(term241457, term241457.getClass(), "quoteChar", (char) 0);
        setCharField(term241457, term241457.getClass(), "commentStart", (char) 0);
        setBooleanField(term241457, term241457.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term241457, term241457.getClass(), "ignoreEmptyLines", false);
        setIntField(term241464, term241464.getClass(), "lastChar", -1);
        setLongField(term241464, term241464.getClass(), "eolCounter", 0L);
        setBooleanField(term241464, term241464.getClass(), "closed", false);
        setField(term241468, term241468.getClass(), "str", "");
        setIntField(term241468, term241468.getClass(), "length", 0);
        setIntField(term241468, term241468.getClass(), "next", 0);
        setIntField(term241468, term241468.getClass(), "mark", 0);
        setField(term241468, term241468.getClass(), "lock", term241468);
        setField(term241468, term241468.getClass(), "skipBuffer", null);
        setField(term241464, term241464.getClass(), "in", term241468);
        setField(term241464, term241464.getClass(), "cb", term241473);
        setIntField(term241464, term241464.getClass(), "nChars", 0);
        setIntField(term241464, term241464.getClass(), "nextChar", 0);
        setIntField(term241464, term241464.getClass(), "markedChar", -1);
        setIntField(term241464, term241464.getClass(), "readAheadLimit", 0);
        setBooleanField(term241464, term241464.getClass(), "skipLF", false);
        setBooleanField(term241464, term241464.getClass(), "markedSkipLF", false);
        setField(term241464, term241464.getClass(), "lock", term241468);
        setField(term241464, term241464.getClass(), "skipBuffer", null);
        setField(term241457, term241457.getClass(), "reader", term241464);
        setField(term241450, term241450.getClass(), "lexer", term241457);
        setField(term241450, term241450.getClass(), "record", term241736);
        setLongField(term241450, term241450.getClass(), "recordNumber", 0L);
        setField(term241741, term241741.getClass(), "type", enum86);
        setField(term241749, term241749.getClass(), "value", term241750);
        setByteField(term241749, term241749.getClass(), "coder", (byte) 0);
        setIntField(term241749, term241749.getClass(), "count", 0);
        setField(term241741, term241741.getClass(), "content", term241749);
        setBooleanField(term241741, term241741.getClass(), "isReady", false);
        setField(term241450, term241450.getClass(), "reusableToken", term241741);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("org.apache.commons.csv.CSVFormat");
        Object[] args = new Object[2];
        args[0] = "";
        args[1] = term239880;
        Object retValue = callMethod(klass, "parse", argTypes, null, args);
        assertTrue(recursiveEquals(term239880, term241814));
        assertTrue(recursiveEquals(retValue, term241450));
    }

};


