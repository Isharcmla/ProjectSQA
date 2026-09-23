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

public class CSVParser_parse_156507206461 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term207130;
     Object term207752;
     Object term207640;

    public CSVParser_parse_156507206461() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term207182 = new Character((char) 0);
        Character term207234 = new Character((char) 0);
        term207130 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term205788 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term207130, term207130.getClass(), "delimiter", (char) 0);
        setField(term207130, term207130.getClass(), "escape", term207182);
        setField(term207130, term207130.getClass(), "quoteChar", term207234);
        setField(term207130, term207130.getClass(), "commentStart", term207234);
        setBooleanField(term207130, term207130.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term207130, term207130.getClass(), "ignoreEmptyLines", false);
        setField(term207130, term207130.getClass(), "header", term205788);
        setIntField(null, Class.forName("java.io.BufferedReader"), "defaultCharBufferSize", 4);
        Character term207753 = new Character((char) 0);
        Character term207754 = new Character((char) 0);
        Character term207755 = new Character((char) 0);
        term207752 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term207756 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term207752, term207752.getClass(), "delimiter", (char) 0);
        setField(term207752, term207752.getClass(), "quoteChar", term207753);
        setField(term207752, term207752.getClass(), "quotePolicy", null);
        setField(term207752, term207752.getClass(), "commentStart", term207754);
        setField(term207752, term207752.getClass(), "escape", term207755);
        setBooleanField(term207752, term207752.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term207752, term207752.getClass(), "ignoreEmptyHeaders", false);
        setBooleanField(term207752, term207752.getClass(), "ignoreEmptyLines", false);
        setField(term207752, term207752.getClass(), "recordSeparator", null);
        setField(term207752, term207752.getClass(), "nullString", null);
        setField(term207752, term207752.getClass(), "header", term207756);
        setBooleanField(term207752, term207752.getClass(), "skipHeaderRecord", false);
        Character term207249 = new Character((char) 0);
        Character term207251 = new Character((char) 0);
        Character term207253 = new Character((char) 0);
        LinkedHashMap term207641 = new LinkedHashMap();
        ArrayList term207674 = new ArrayList();
        Class<? extends Object> term207762 = Class.forName((String) "org.apache.commons.csv.Token$Type");
        Field term207761 = ((Class) term207762).getDeclaredField((String) "EOF");
        ((Field) term207761).setAccessible(true);
        Object enum81 = ((Field) term207761).get((Object) null);
        term207640 = newInstance(Class.forName("org.apache.commons.csv.CSVParser"));
        Object term207247 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term207258 = (Object[]) newArray("java.lang.String", 0);
        Object term207647 = newInstance(Class.forName("org.apache.commons.csv.Lexer"));
        Object term207654 = newInstance(Class.forName("org.apache.commons.csv.ExtendedBufferedReader"));
        Object term207658 = newInstance(Class.forName("java.io.StringReader"));
        char[] term207663 = (char[]) newCharArray(4);
        Object term207679 = newInstance(Class.forName("org.apache.commons.csv.Token"));
        Object term207687 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term207688 = (byte[]) newByteArray(50);
        setCharField(term207247, term207247.getClass(), "delimiter", (char) 0);
        setField(term207247, term207247.getClass(), "quoteChar", term207249);
        setField(term207247, term207247.getClass(), "quotePolicy", null);
        setField(term207247, term207247.getClass(), "commentStart", term207251);
        setField(term207247, term207247.getClass(), "escape", term207253);
        setBooleanField(term207247, term207247.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term207247, term207247.getClass(), "ignoreEmptyHeaders", false);
        setBooleanField(term207247, term207247.getClass(), "ignoreEmptyLines", false);
        setField(term207247, term207247.getClass(), "recordSeparator", null);
        setField(term207247, term207247.getClass(), "nullString", null);
        setField(term207247, term207247.getClass(), "header", term207258);
        setBooleanField(term207247, term207247.getClass(), "skipHeaderRecord", false);
        setField(term207640, term207640.getClass(), "format", term207247);
        setField(term207640, term207640.getClass(), "headerMap", term207641);
        setCharField(term207647, term207647.getClass(), "delimiter", (char) 0);
        setCharField(term207647, term207647.getClass(), "escape", (char) 0);
        setCharField(term207647, term207647.getClass(), "quoteChar", (char) 0);
        setCharField(term207647, term207647.getClass(), "commentStart", (char) 0);
        setBooleanField(term207647, term207647.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term207647, term207647.getClass(), "ignoreEmptyLines", false);
        setIntField(term207654, term207654.getClass(), "lastChar", -1);
        setLongField(term207654, term207654.getClass(), "eolCounter", 0L);
        setBooleanField(term207654, term207654.getClass(), "closed", false);
        setField(term207658, term207658.getClass(), "str", "");
        setIntField(term207658, term207658.getClass(), "length", 0);
        setIntField(term207658, term207658.getClass(), "next", 0);
        setIntField(term207658, term207658.getClass(), "mark", 0);
        setField(term207658, term207658.getClass(), "lock", term207658);
        setField(term207658, term207658.getClass(), "skipBuffer", null);
        setField(term207654, term207654.getClass(), "in", term207658);
        setField(term207654, term207654.getClass(), "cb", term207663);
        setIntField(term207654, term207654.getClass(), "nChars", 0);
        setIntField(term207654, term207654.getClass(), "nextChar", 0);
        setIntField(term207654, term207654.getClass(), "markedChar", -1);
        setIntField(term207654, term207654.getClass(), "readAheadLimit", 0);
        setBooleanField(term207654, term207654.getClass(), "skipLF", false);
        setBooleanField(term207654, term207654.getClass(), "markedSkipLF", false);
        setField(term207654, term207654.getClass(), "lock", term207658);
        setField(term207654, term207654.getClass(), "skipBuffer", null);
        setField(term207647, term207647.getClass(), "reader", term207654);
        setField(term207640, term207640.getClass(), "lexer", term207647);
        setField(term207640, term207640.getClass(), "record", term207674);
        setLongField(term207640, term207640.getClass(), "recordNumber", 0L);
        setField(term207679, term207679.getClass(), "type", enum81);
        setField(term207687, term207687.getClass(), "value", term207688);
        setByteField(term207687, term207687.getClass(), "coder", (byte) 0);
        setIntField(term207687, term207687.getClass(), "count", 0);
        setField(term207679, term207679.getClass(), "content", term207687);
        setBooleanField(term207679, term207679.getClass(), "isReady", false);
        setField(term207640, term207640.getClass(), "reusableToken", term207679);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("org.apache.commons.csv.CSVFormat");
        Object[] args = new Object[2];
        args[0] = "";
        args[1] = term207130;
        Object retValue = callMethod(klass, "parse", argTypes, null, args);
        assertTrue(recursiveEquals(term207130, term207752));
        assertTrue(recursiveEquals(retValue, term207640));
    }

};


