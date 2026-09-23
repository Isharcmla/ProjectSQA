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

public class CSVParser_parse_156507206457 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term200248;
     Object term200913;
     Object term200803;

    public CSVParser_parse_156507206457() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term200300 = new Character((char) 0);
        Character term200352 = new Character((char) 0);
        Character term200404 = new Character((char) 0);
        term200248 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term198796 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term200248, term200248.getClass(), "delimiter", (char) 0);
        setField(term200248, term200248.getClass(), "escape", term200300);
        setField(term200248, term200248.getClass(), "quoteChar", term200352);
        setField(term200248, term200248.getClass(), "commentStart", term200404);
        setBooleanField(term200248, term200248.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term200248, term200248.getClass(), "ignoreEmptyLines", true);
        setField(term200248, term200248.getClass(), "header", term198796);
        setBooleanField(term200248, term200248.getClass(), "skipHeaderRecord", true);
        setIntField(null, Class.forName("java.io.BufferedReader"), "defaultCharBufferSize", 2);
        Character term200914 = new Character((char) 0);
        Character term200915 = new Character((char) 0);
        Character term200916 = new Character((char) 0);
        term200913 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term200917 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term200913, term200913.getClass(), "delimiter", (char) 0);
        setField(term200913, term200913.getClass(), "quoteChar", term200914);
        setField(term200913, term200913.getClass(), "quotePolicy", null);
        setField(term200913, term200913.getClass(), "commentStart", term200915);
        setField(term200913, term200913.getClass(), "escape", term200916);
        setBooleanField(term200913, term200913.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term200913, term200913.getClass(), "ignoreEmptyHeaders", false);
        setBooleanField(term200913, term200913.getClass(), "ignoreEmptyLines", true);
        setField(term200913, term200913.getClass(), "recordSeparator", null);
        setField(term200913, term200913.getClass(), "nullString", null);
        setField(term200913, term200913.getClass(), "header", term200917);
        setBooleanField(term200913, term200913.getClass(), "skipHeaderRecord", true);
        Character term200419 = new Character((char) 0);
        Character term200421 = new Character((char) 0);
        Character term200423 = new Character((char) 0);
        LinkedHashMap term200804 = new LinkedHashMap();
        ArrayList term200835 = new ArrayList();
        Class<? extends Object> term200921 = Class.forName((String) "org.apache.commons.csv.Token$Type");
        Field term200920 = ((Class) term200921).getDeclaredField((String) "EOF");
        ((Field) term200920).setAccessible(true);
        Object enum79 = ((Field) term200920).get((Object) null);
        term200803 = newInstance(Class.forName("org.apache.commons.csv.CSVParser"));
        Object term200417 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term200428 = (Object[]) newArray("java.lang.String", 0);
        Object term200810 = newInstance(Class.forName("org.apache.commons.csv.Lexer"));
        Object term200817 = newInstance(Class.forName("org.apache.commons.csv.ExtendedBufferedReader"));
        Object term200821 = newInstance(Class.forName("java.io.StringReader"));
        char[] term200826 = (char[]) newCharArray(2);
        Object term200840 = newInstance(Class.forName("org.apache.commons.csv.Token"));
        Object term200848 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term200849 = (byte[]) newByteArray(50);
        setCharField(term200417, term200417.getClass(), "delimiter", (char) 0);
        setField(term200417, term200417.getClass(), "quoteChar", term200419);
        setField(term200417, term200417.getClass(), "quotePolicy", null);
        setField(term200417, term200417.getClass(), "commentStart", term200421);
        setField(term200417, term200417.getClass(), "escape", term200423);
        setBooleanField(term200417, term200417.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term200417, term200417.getClass(), "ignoreEmptyHeaders", false);
        setBooleanField(term200417, term200417.getClass(), "ignoreEmptyLines", true);
        setField(term200417, term200417.getClass(), "recordSeparator", null);
        setField(term200417, term200417.getClass(), "nullString", null);
        setField(term200417, term200417.getClass(), "header", term200428);
        setBooleanField(term200417, term200417.getClass(), "skipHeaderRecord", true);
        setField(term200803, term200803.getClass(), "format", term200417);
        setField(term200803, term200803.getClass(), "headerMap", term200804);
        setCharField(term200810, term200810.getClass(), "delimiter", (char) 0);
        setCharField(term200810, term200810.getClass(), "escape", (char) 0);
        setCharField(term200810, term200810.getClass(), "quoteChar", (char) 0);
        setCharField(term200810, term200810.getClass(), "commentStart", (char) 0);
        setBooleanField(term200810, term200810.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term200810, term200810.getClass(), "ignoreEmptyLines", true);
        setIntField(term200817, term200817.getClass(), "lastChar", -1);
        setLongField(term200817, term200817.getClass(), "eolCounter", 0L);
        setBooleanField(term200817, term200817.getClass(), "closed", false);
        setField(term200821, term200821.getClass(), "str", "");
        setIntField(term200821, term200821.getClass(), "length", 0);
        setIntField(term200821, term200821.getClass(), "next", 0);
        setIntField(term200821, term200821.getClass(), "mark", 0);
        setField(term200821, term200821.getClass(), "lock", term200821);
        setField(term200821, term200821.getClass(), "skipBuffer", null);
        setField(term200817, term200817.getClass(), "in", term200821);
        setField(term200817, term200817.getClass(), "cb", term200826);
        setIntField(term200817, term200817.getClass(), "nChars", 0);
        setIntField(term200817, term200817.getClass(), "nextChar", 0);
        setIntField(term200817, term200817.getClass(), "markedChar", -1);
        setIntField(term200817, term200817.getClass(), "readAheadLimit", 0);
        setBooleanField(term200817, term200817.getClass(), "skipLF", false);
        setBooleanField(term200817, term200817.getClass(), "markedSkipLF", false);
        setField(term200817, term200817.getClass(), "lock", term200821);
        setField(term200817, term200817.getClass(), "skipBuffer", null);
        setField(term200810, term200810.getClass(), "reader", term200817);
        setField(term200803, term200803.getClass(), "lexer", term200810);
        setField(term200803, term200803.getClass(), "record", term200835);
        setLongField(term200803, term200803.getClass(), "recordNumber", 0L);
        setField(term200840, term200840.getClass(), "type", enum79);
        setField(term200848, term200848.getClass(), "value", term200849);
        setByteField(term200848, term200848.getClass(), "coder", (byte) 0);
        setIntField(term200848, term200848.getClass(), "count", 0);
        setField(term200840, term200840.getClass(), "content", term200848);
        setBooleanField(term200840, term200840.getClass(), "isReady", false);
        setField(term200803, term200803.getClass(), "reusableToken", term200840);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("org.apache.commons.csv.CSVFormat");
        Object[] args = new Object[2];
        args[0] = "";
        args[1] = term200248;
        Object retValue = callMethod(klass, "parse", argTypes, null, args);
        assertTrue(recursiveEquals(term200248, term200913));
        assertTrue(recursiveEquals(retValue, term200803));
    }

};


