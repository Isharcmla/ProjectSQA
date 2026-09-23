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

public class CSVParser_parse_156507206479 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term245050;
     Object term245710;
     Object term245601;

    public CSVParser_parse_156507206479() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term245102 = new Character((char) 64);
        Character term245154 = new Character((char) 0);
        Character term245206 = new Character((char) 0);
        term245050 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term242613 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term245050, term245050.getClass(), "delimiter", (char) 576);
        setField(term245050, term245050.getClass(), "escape", term245102);
        setField(term245050, term245050.getClass(), "quoteChar", term245154);
        setField(term245050, term245050.getClass(), "commentStart", term245206);
        setBooleanField(term245050, term245050.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term245050, term245050.getClass(), "ignoreEmptyLines", true);
        setField(term245050, term245050.getClass(), "header", term242613);
        setBooleanField(term245050, term245050.getClass(), "skipHeaderRecord", true);
        setField(term245050, term245050.getClass(), "nullString", null);
        setIntField(null, Class.forName("java.io.BufferedReader"), "defaultCharBufferSize", 1);
        Character term245711 = new Character((char) 0);
        Character term245712 = new Character((char) 0);
        Character term245713 = new Character((char) 64);
        term245710 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term245714 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term245710, term245710.getClass(), "delimiter", (char) 576);
        setField(term245710, term245710.getClass(), "quoteChar", term245711);
        setField(term245710, term245710.getClass(), "quotePolicy", null);
        setField(term245710, term245710.getClass(), "commentStart", term245712);
        setField(term245710, term245710.getClass(), "escape", term245713);
        setBooleanField(term245710, term245710.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term245710, term245710.getClass(), "ignoreEmptyHeaders", false);
        setBooleanField(term245710, term245710.getClass(), "ignoreEmptyLines", true);
        setField(term245710, term245710.getClass(), "recordSeparator", null);
        setField(term245710, term245710.getClass(), "nullString", null);
        setField(term245710, term245710.getClass(), "header", term245714);
        setBooleanField(term245710, term245710.getClass(), "skipHeaderRecord", true);
        Character term245221 = new Character((char) 0);
        Character term245223 = new Character((char) 0);
        Character term245225 = new Character((char) 64);
        LinkedHashMap term245602 = new LinkedHashMap();
        ArrayList term245632 = new ArrayList();
        Class<? extends Object> term245717 = Class.forName((String) "org.apache.commons.csv.Token$Type");
        Field term245716 = ((Class) term245717).getDeclaredField((String) "EOF");
        ((Field) term245716).setAccessible(true);
        Object enum87 = ((Field) term245716).get((Object) null);
        term245601 = newInstance(Class.forName("org.apache.commons.csv.CSVParser"));
        Object term245219 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term245230 = (Object[]) newArray("java.lang.String", 0);
        Object term245608 = newInstance(Class.forName("org.apache.commons.csv.Lexer"));
        Object term245615 = newInstance(Class.forName("org.apache.commons.csv.ExtendedBufferedReader"));
        Object term245619 = newInstance(Class.forName("java.io.StringReader"));
        char[] term245624 = (char[]) newCharArray(1);
        Object term245637 = newInstance(Class.forName("org.apache.commons.csv.Token"));
        Object term245645 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term245646 = (byte[]) newByteArray(50);
        setCharField(term245219, term245219.getClass(), "delimiter", (char) 576);
        setField(term245219, term245219.getClass(), "quoteChar", term245221);
        setField(term245219, term245219.getClass(), "quotePolicy", null);
        setField(term245219, term245219.getClass(), "commentStart", term245223);
        setField(term245219, term245219.getClass(), "escape", term245225);
        setBooleanField(term245219, term245219.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term245219, term245219.getClass(), "ignoreEmptyHeaders", false);
        setBooleanField(term245219, term245219.getClass(), "ignoreEmptyLines", true);
        setField(term245219, term245219.getClass(), "recordSeparator", null);
        setField(term245219, term245219.getClass(), "nullString", null);
        setField(term245219, term245219.getClass(), "header", term245230);
        setBooleanField(term245219, term245219.getClass(), "skipHeaderRecord", true);
        setField(term245601, term245601.getClass(), "format", term245219);
        setField(term245601, term245601.getClass(), "headerMap", term245602);
        setCharField(term245608, term245608.getClass(), "delimiter", (char) 576);
        setCharField(term245608, term245608.getClass(), "escape", (char) 64);
        setCharField(term245608, term245608.getClass(), "quoteChar", (char) 0);
        setCharField(term245608, term245608.getClass(), "commentStart", (char) 0);
        setBooleanField(term245608, term245608.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term245608, term245608.getClass(), "ignoreEmptyLines", true);
        setIntField(term245615, term245615.getClass(), "lastChar", -1);
        setLongField(term245615, term245615.getClass(), "eolCounter", 0L);
        setBooleanField(term245615, term245615.getClass(), "closed", false);
        setField(term245619, term245619.getClass(), "str", "");
        setIntField(term245619, term245619.getClass(), "length", 0);
        setIntField(term245619, term245619.getClass(), "next", 0);
        setIntField(term245619, term245619.getClass(), "mark", 0);
        setField(term245619, term245619.getClass(), "lock", term245619);
        setField(term245619, term245619.getClass(), "skipBuffer", null);
        setField(term245615, term245615.getClass(), "in", term245619);
        setField(term245615, term245615.getClass(), "cb", term245624);
        setIntField(term245615, term245615.getClass(), "nChars", 0);
        setIntField(term245615, term245615.getClass(), "nextChar", 0);
        setIntField(term245615, term245615.getClass(), "markedChar", -1);
        setIntField(term245615, term245615.getClass(), "readAheadLimit", 0);
        setBooleanField(term245615, term245615.getClass(), "skipLF", false);
        setBooleanField(term245615, term245615.getClass(), "markedSkipLF", false);
        setField(term245615, term245615.getClass(), "lock", term245619);
        setField(term245615, term245615.getClass(), "skipBuffer", null);
        setField(term245608, term245608.getClass(), "reader", term245615);
        setField(term245601, term245601.getClass(), "lexer", term245608);
        setField(term245601, term245601.getClass(), "record", term245632);
        setLongField(term245601, term245601.getClass(), "recordNumber", 0L);
        setField(term245637, term245637.getClass(), "type", enum87);
        setField(term245645, term245645.getClass(), "value", term245646);
        setByteField(term245645, term245645.getClass(), "coder", (byte) 0);
        setIntField(term245645, term245645.getClass(), "count", 0);
        setField(term245637, term245637.getClass(), "content", term245645);
        setBooleanField(term245637, term245637.getClass(), "isReady", false);
        setField(term245601, term245601.getClass(), "reusableToken", term245637);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("org.apache.commons.csv.CSVFormat");
        Object[] args = new Object[2];
        args[0] = "";
        args[1] = term245050;
        Object retValue = callMethod(klass, "parse", argTypes, null, args);
        assertTrue(recursiveEquals(term245050, term245710));
        assertTrue(recursiveEquals(retValue, term245601));
    }

};


