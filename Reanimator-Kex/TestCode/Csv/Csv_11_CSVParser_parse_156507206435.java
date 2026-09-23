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

public class CSVParser_parse_156507206435 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term169045;
     Object term171220;
     Object term171111;

    public CSVParser_parse_156507206435() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term169097 = new Character((char) 0);
        Character term169149 = new Character((char) 0);
        Character term169201 = new Character((char) 0);
        term169045 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term167673 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term169045, term169045.getClass(), "delimiter", (char) 0);
        setField(term169045, term169045.getClass(), "escape", term169097);
        setField(term169045, term169045.getClass(), "quoteChar", term169149);
        setField(term169045, term169045.getClass(), "commentStart", term169201);
        setBooleanField(term169045, term169045.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term169045, term169045.getClass(), "ignoreEmptyLines", true);
        setField(term169045, term169045.getClass(), "header", term167673);
        setBooleanField(term169045, term169045.getClass(), "skipHeaderRecord", true);
        setIntField(null, Class.forName("java.io.BufferedReader"), "defaultCharBufferSize", 1);
        Character term171221 = new Character((char) 0);
        Character term171222 = new Character((char) 0);
        Character term171223 = new Character((char) 0);
        term171220 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term171224 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term171220, term171220.getClass(), "delimiter", (char) 0);
        setField(term171220, term171220.getClass(), "quoteChar", term171221);
        setField(term171220, term171220.getClass(), "quotePolicy", null);
        setField(term171220, term171220.getClass(), "commentStart", term171222);
        setField(term171220, term171220.getClass(), "escape", term171223);
        setBooleanField(term171220, term171220.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term171220, term171220.getClass(), "ignoreEmptyHeaders", false);
        setBooleanField(term171220, term171220.getClass(), "ignoreEmptyLines", true);
        setField(term171220, term171220.getClass(), "recordSeparator", null);
        setField(term171220, term171220.getClass(), "nullString", null);
        setField(term171220, term171220.getClass(), "header", term171224);
        setBooleanField(term171220, term171220.getClass(), "skipHeaderRecord", true);
        Character term170731 = new Character((char) 0);
        Character term170733 = new Character((char) 0);
        Character term170735 = new Character((char) 0);
        LinkedHashMap term171112 = new LinkedHashMap();
        ArrayList term171142 = new ArrayList();
        Class<? extends Object> term171227 = Class.forName((String) "org.apache.commons.csv.Token$Type");
        Field term171226 = ((Class) term171227).getDeclaredField((String) "EOF");
        ((Field) term171226).setAccessible(true);
        Object enum72 = ((Field) term171226).get((Object) null);
        term171111 = newInstance(Class.forName("org.apache.commons.csv.CSVParser"));
        Object term170729 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term170740 = (Object[]) newArray("java.lang.String", 0);
        Object term171118 = newInstance(Class.forName("org.apache.commons.csv.Lexer"));
        Object term171125 = newInstance(Class.forName("org.apache.commons.csv.ExtendedBufferedReader"));
        Object term171129 = newInstance(Class.forName("java.io.StringReader"));
        char[] term171134 = (char[]) newCharArray(1);
        Object term171147 = newInstance(Class.forName("org.apache.commons.csv.Token"));
        Object term171155 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term171156 = (byte[]) newByteArray(50);
        setCharField(term170729, term170729.getClass(), "delimiter", (char) 0);
        setField(term170729, term170729.getClass(), "quoteChar", term170731);
        setField(term170729, term170729.getClass(), "quotePolicy", null);
        setField(term170729, term170729.getClass(), "commentStart", term170733);
        setField(term170729, term170729.getClass(), "escape", term170735);
        setBooleanField(term170729, term170729.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term170729, term170729.getClass(), "ignoreEmptyHeaders", false);
        setBooleanField(term170729, term170729.getClass(), "ignoreEmptyLines", true);
        setField(term170729, term170729.getClass(), "recordSeparator", null);
        setField(term170729, term170729.getClass(), "nullString", null);
        setField(term170729, term170729.getClass(), "header", term170740);
        setBooleanField(term170729, term170729.getClass(), "skipHeaderRecord", true);
        setField(term171111, term171111.getClass(), "format", term170729);
        setField(term171111, term171111.getClass(), "headerMap", term171112);
        setCharField(term171118, term171118.getClass(), "delimiter", (char) 0);
        setCharField(term171118, term171118.getClass(), "escape", (char) 0);
        setCharField(term171118, term171118.getClass(), "quoteChar", (char) 0);
        setCharField(term171118, term171118.getClass(), "commentStart", (char) 0);
        setBooleanField(term171118, term171118.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term171118, term171118.getClass(), "ignoreEmptyLines", true);
        setIntField(term171125, term171125.getClass(), "lastChar", -1);
        setLongField(term171125, term171125.getClass(), "eolCounter", 0L);
        setBooleanField(term171125, term171125.getClass(), "closed", false);
        setField(term171129, term171129.getClass(), "str", "");
        setIntField(term171129, term171129.getClass(), "length", 0);
        setIntField(term171129, term171129.getClass(), "next", 0);
        setIntField(term171129, term171129.getClass(), "mark", 0);
        setField(term171129, term171129.getClass(), "lock", term171129);
        setField(term171129, term171129.getClass(), "skipBuffer", null);
        setField(term171125, term171125.getClass(), "in", term171129);
        setField(term171125, term171125.getClass(), "cb", term171134);
        setIntField(term171125, term171125.getClass(), "nChars", 0);
        setIntField(term171125, term171125.getClass(), "nextChar", 0);
        setIntField(term171125, term171125.getClass(), "markedChar", -1);
        setIntField(term171125, term171125.getClass(), "readAheadLimit", 0);
        setBooleanField(term171125, term171125.getClass(), "skipLF", false);
        setBooleanField(term171125, term171125.getClass(), "markedSkipLF", false);
        setField(term171125, term171125.getClass(), "lock", term171129);
        setField(term171125, term171125.getClass(), "skipBuffer", null);
        setField(term171118, term171118.getClass(), "reader", term171125);
        setField(term171111, term171111.getClass(), "lexer", term171118);
        setField(term171111, term171111.getClass(), "record", term171142);
        setLongField(term171111, term171111.getClass(), "recordNumber", 0L);
        setField(term171147, term171147.getClass(), "type", enum72);
        setField(term171155, term171155.getClass(), "value", term171156);
        setByteField(term171155, term171155.getClass(), "coder", (byte) 0);
        setIntField(term171155, term171155.getClass(), "count", 0);
        setField(term171147, term171147.getClass(), "content", term171155);
        setBooleanField(term171147, term171147.getClass(), "isReady", false);
        setField(term171111, term171111.getClass(), "reusableToken", term171147);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("org.apache.commons.csv.CSVFormat");
        Object[] args = new Object[2];
        args[0] = "";
        args[1] = term169045;
        Object retValue = callMethod(klass, "parse", argTypes, null, args);
        assertTrue(recursiveEquals(term169045, term171220));
        assertTrue(recursiveEquals(retValue, term171111));
    }

};


