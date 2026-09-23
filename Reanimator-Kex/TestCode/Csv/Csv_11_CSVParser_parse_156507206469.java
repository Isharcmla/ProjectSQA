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

public class CSVParser_parse_156507206469 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term220338;
     Object term221312;
     Object term221140;

    public CSVParser_parse_156507206469() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term220390 = new Character((char) 0);
        Character term220442 = new Character((char) 0);
        Character term220494 = new Character((char) 0);
        term220338 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term217976 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term220338, term220338.getClass(), "delimiter", (char) 0);
        setField(term220338, term220338.getClass(), "escape", term220390);
        setField(term220338, term220338.getClass(), "quoteChar", term220442);
        setField(term220338, term220338.getClass(), "commentStart", term220494);
        setBooleanField(term220338, term220338.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term220338, term220338.getClass(), "ignoreEmptyLines", false);
        setField(term220338, term220338.getClass(), "header", term217976);
        setIntField(null, Class.forName("java.io.BufferedReader"), "defaultCharBufferSize", 64);
        Character term221313 = new Character((char) 0);
        Character term221314 = new Character((char) 0);
        Character term221315 = new Character((char) 0);
        term221312 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term221316 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term221312, term221312.getClass(), "delimiter", (char) 0);
        setField(term221312, term221312.getClass(), "quoteChar", term221313);
        setField(term221312, term221312.getClass(), "quotePolicy", null);
        setField(term221312, term221312.getClass(), "commentStart", term221314);
        setField(term221312, term221312.getClass(), "escape", term221315);
        setBooleanField(term221312, term221312.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term221312, term221312.getClass(), "ignoreEmptyHeaders", false);
        setBooleanField(term221312, term221312.getClass(), "ignoreEmptyLines", false);
        setField(term221312, term221312.getClass(), "recordSeparator", null);
        setField(term221312, term221312.getClass(), "nullString", null);
        setField(term221312, term221312.getClass(), "header", term221316);
        setBooleanField(term221312, term221312.getClass(), "skipHeaderRecord", false);
        Character term220509 = new Character((char) 0);
        Character term220511 = new Character((char) 0);
        Character term220513 = new Character((char) 0);
        LinkedHashMap term221141 = new LinkedHashMap();
        ArrayList term221234 = new ArrayList();
        Class<? extends Object> term221382 = Class.forName((String) "org.apache.commons.csv.Token$Type");
        Field term221381 = ((Class) term221382).getDeclaredField((String) "EOF");
        ((Field) term221381).setAccessible(true);
        Object enum83 = ((Field) term221381).get((Object) null);
        term221140 = newInstance(Class.forName("org.apache.commons.csv.CSVParser"));
        Object term220507 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term220518 = (Object[]) newArray("java.lang.String", 0);
        Object term221147 = newInstance(Class.forName("org.apache.commons.csv.Lexer"));
        Object term221154 = newInstance(Class.forName("org.apache.commons.csv.ExtendedBufferedReader"));
        Object term221158 = newInstance(Class.forName("java.io.StringReader"));
        char[] term221163 = (char[]) newCharArray(64);
        Object term221239 = newInstance(Class.forName("org.apache.commons.csv.Token"));
        Object term221247 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term221248 = (byte[]) newByteArray(50);
        setCharField(term220507, term220507.getClass(), "delimiter", (char) 0);
        setField(term220507, term220507.getClass(), "quoteChar", term220509);
        setField(term220507, term220507.getClass(), "quotePolicy", null);
        setField(term220507, term220507.getClass(), "commentStart", term220511);
        setField(term220507, term220507.getClass(), "escape", term220513);
        setBooleanField(term220507, term220507.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term220507, term220507.getClass(), "ignoreEmptyHeaders", false);
        setBooleanField(term220507, term220507.getClass(), "ignoreEmptyLines", false);
        setField(term220507, term220507.getClass(), "recordSeparator", null);
        setField(term220507, term220507.getClass(), "nullString", null);
        setField(term220507, term220507.getClass(), "header", term220518);
        setBooleanField(term220507, term220507.getClass(), "skipHeaderRecord", false);
        setField(term221140, term221140.getClass(), "format", term220507);
        setField(term221140, term221140.getClass(), "headerMap", term221141);
        setCharField(term221147, term221147.getClass(), "delimiter", (char) 0);
        setCharField(term221147, term221147.getClass(), "escape", (char) 0);
        setCharField(term221147, term221147.getClass(), "quoteChar", (char) 0);
        setCharField(term221147, term221147.getClass(), "commentStart", (char) 0);
        setBooleanField(term221147, term221147.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term221147, term221147.getClass(), "ignoreEmptyLines", false);
        setIntField(term221154, term221154.getClass(), "lastChar", -1);
        setLongField(term221154, term221154.getClass(), "eolCounter", 0L);
        setBooleanField(term221154, term221154.getClass(), "closed", false);
        setField(term221158, term221158.getClass(), "str", "");
        setIntField(term221158, term221158.getClass(), "length", 0);
        setIntField(term221158, term221158.getClass(), "next", 0);
        setIntField(term221158, term221158.getClass(), "mark", 0);
        setField(term221158, term221158.getClass(), "lock", term221158);
        setField(term221158, term221158.getClass(), "skipBuffer", null);
        setField(term221154, term221154.getClass(), "in", term221158);
        setField(term221154, term221154.getClass(), "cb", term221163);
        setIntField(term221154, term221154.getClass(), "nChars", 0);
        setIntField(term221154, term221154.getClass(), "nextChar", 0);
        setIntField(term221154, term221154.getClass(), "markedChar", -1);
        setIntField(term221154, term221154.getClass(), "readAheadLimit", 0);
        setBooleanField(term221154, term221154.getClass(), "skipLF", false);
        setBooleanField(term221154, term221154.getClass(), "markedSkipLF", false);
        setField(term221154, term221154.getClass(), "lock", term221158);
        setField(term221154, term221154.getClass(), "skipBuffer", null);
        setField(term221147, term221147.getClass(), "reader", term221154);
        setField(term221140, term221140.getClass(), "lexer", term221147);
        setField(term221140, term221140.getClass(), "record", term221234);
        setLongField(term221140, term221140.getClass(), "recordNumber", 0L);
        setField(term221239, term221239.getClass(), "type", enum83);
        setField(term221247, term221247.getClass(), "value", term221248);
        setByteField(term221247, term221247.getClass(), "coder", (byte) 0);
        setIntField(term221247, term221247.getClass(), "count", 0);
        setField(term221239, term221239.getClass(), "content", term221247);
        setBooleanField(term221239, term221239.getClass(), "isReady", false);
        setField(term221140, term221140.getClass(), "reusableToken", term221239);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("org.apache.commons.csv.CSVFormat");
        Object[] args = new Object[2];
        args[0] = "";
        args[1] = term220338;
        Object retValue = callMethod(klass, "parse", argTypes, null, args);
        assertTrue(recursiveEquals(term220338, term221312));
        assertTrue(recursiveEquals(retValue, term221140));
    }

};


