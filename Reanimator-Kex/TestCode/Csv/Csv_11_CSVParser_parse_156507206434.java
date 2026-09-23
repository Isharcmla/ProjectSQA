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

public class CSVParser_parse_156507206434 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term167350;
     Object term170340;
     Object term170104;

    public CSVParser_parse_156507206434() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term167402 = new Character((char) 256);
        Character term167454 = new Character((char) 0);
        Character term167506 = new Character((char) 0);
        term167350 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term160481 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term167350, term167350.getClass(), "delimiter", (char) 32768);
        setField(term167350, term167350.getClass(), "escape", term167402);
        setField(term167350, term167350.getClass(), "quoteChar", term167454);
        setField(term167350, term167350.getClass(), "commentStart", term167506);
        setBooleanField(term167350, term167350.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term167350, term167350.getClass(), "ignoreEmptyLines", true);
        setField(term167350, term167350.getClass(), "header", term160481);
        setBooleanField(term167350, term167350.getClass(), "skipHeaderRecord", true);
        setIntField(null, Class.forName("java.io.BufferedReader"), "defaultCharBufferSize", 128);
        Character term170341 = new Character((char) 0);
        Character term170342 = new Character((char) 0);
        Character term170343 = new Character((char) 256);
        term170340 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term170344 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term170340, term170340.getClass(), "delimiter", (char) 32768);
        setField(term170340, term170340.getClass(), "quoteChar", term170341);
        setField(term170340, term170340.getClass(), "quotePolicy", null);
        setField(term170340, term170340.getClass(), "commentStart", term170342);
        setField(term170340, term170340.getClass(), "escape", term170343);
        setBooleanField(term170340, term170340.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term170340, term170340.getClass(), "ignoreEmptyHeaders", false);
        setBooleanField(term170340, term170340.getClass(), "ignoreEmptyLines", true);
        setField(term170340, term170340.getClass(), "recordSeparator", null);
        setField(term170340, term170340.getClass(), "nullString", null);
        setField(term170340, term170340.getClass(), "header", term170344);
        setBooleanField(term170340, term170340.getClass(), "skipHeaderRecord", true);
        Character term169216 = new Character((char) 0);
        Character term169218 = new Character((char) 0);
        Character term169220 = new Character((char) 256);
        LinkedHashMap term170105 = new LinkedHashMap();
        ArrayList term170262 = new ArrayList();
        Class<? extends Object> term170474 = Class.forName((String) "org.apache.commons.csv.Token$Type");
        Field term170473 = ((Class) term170474).getDeclaredField((String) "EOF");
        ((Field) term170473).setAccessible(true);
        Object enum71 = ((Field) term170473).get((Object) null);
        term170104 = newInstance(Class.forName("org.apache.commons.csv.CSVParser"));
        Object term169214 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term169225 = (Object[]) newArray("java.lang.String", 0);
        Object term170111 = newInstance(Class.forName("org.apache.commons.csv.Lexer"));
        Object term170118 = newInstance(Class.forName("org.apache.commons.csv.ExtendedBufferedReader"));
        Object term170122 = newInstance(Class.forName("java.io.StringReader"));
        char[] term170127 = (char[]) newCharArray(128);
        Object term170267 = newInstance(Class.forName("org.apache.commons.csv.Token"));
        Object term170275 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term170276 = (byte[]) newByteArray(50);
        setCharField(term169214, term169214.getClass(), "delimiter", (char) 32768);
        setField(term169214, term169214.getClass(), "quoteChar", term169216);
        setField(term169214, term169214.getClass(), "quotePolicy", null);
        setField(term169214, term169214.getClass(), "commentStart", term169218);
        setField(term169214, term169214.getClass(), "escape", term169220);
        setBooleanField(term169214, term169214.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term169214, term169214.getClass(), "ignoreEmptyHeaders", false);
        setBooleanField(term169214, term169214.getClass(), "ignoreEmptyLines", true);
        setField(term169214, term169214.getClass(), "recordSeparator", null);
        setField(term169214, term169214.getClass(), "nullString", null);
        setField(term169214, term169214.getClass(), "header", term169225);
        setBooleanField(term169214, term169214.getClass(), "skipHeaderRecord", true);
        setField(term170104, term170104.getClass(), "format", term169214);
        setField(term170104, term170104.getClass(), "headerMap", term170105);
        setCharField(term170111, term170111.getClass(), "delimiter", (char) 32768);
        setCharField(term170111, term170111.getClass(), "escape", (char) 256);
        setCharField(term170111, term170111.getClass(), "quoteChar", (char) 0);
        setCharField(term170111, term170111.getClass(), "commentStart", (char) 0);
        setBooleanField(term170111, term170111.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term170111, term170111.getClass(), "ignoreEmptyLines", true);
        setIntField(term170118, term170118.getClass(), "lastChar", -1);
        setLongField(term170118, term170118.getClass(), "eolCounter", 0L);
        setBooleanField(term170118, term170118.getClass(), "closed", false);
        setField(term170122, term170122.getClass(), "str", "");
        setIntField(term170122, term170122.getClass(), "length", 0);
        setIntField(term170122, term170122.getClass(), "next", 0);
        setIntField(term170122, term170122.getClass(), "mark", 0);
        setField(term170122, term170122.getClass(), "lock", term170122);
        setField(term170122, term170122.getClass(), "skipBuffer", null);
        setField(term170118, term170118.getClass(), "in", term170122);
        setField(term170118, term170118.getClass(), "cb", term170127);
        setIntField(term170118, term170118.getClass(), "nChars", 0);
        setIntField(term170118, term170118.getClass(), "nextChar", 0);
        setIntField(term170118, term170118.getClass(), "markedChar", -1);
        setIntField(term170118, term170118.getClass(), "readAheadLimit", 0);
        setBooleanField(term170118, term170118.getClass(), "skipLF", false);
        setBooleanField(term170118, term170118.getClass(), "markedSkipLF", false);
        setField(term170118, term170118.getClass(), "lock", term170122);
        setField(term170118, term170118.getClass(), "skipBuffer", null);
        setField(term170111, term170111.getClass(), "reader", term170118);
        setField(term170104, term170104.getClass(), "lexer", term170111);
        setField(term170104, term170104.getClass(), "record", term170262);
        setLongField(term170104, term170104.getClass(), "recordNumber", 0L);
        setField(term170267, term170267.getClass(), "type", enum71);
        setField(term170275, term170275.getClass(), "value", term170276);
        setByteField(term170275, term170275.getClass(), "coder", (byte) 0);
        setIntField(term170275, term170275.getClass(), "count", 0);
        setField(term170267, term170267.getClass(), "content", term170275);
        setBooleanField(term170267, term170267.getClass(), "isReady", false);
        setField(term170104, term170104.getClass(), "reusableToken", term170267);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("org.apache.commons.csv.CSVFormat");
        Object[] args = new Object[2];
        args[0] = "";
        args[1] = term167350;
        Object retValue = callMethod(klass, "parse", argTypes, null, args);
        assertTrue(recursiveEquals(term167350, term170340));
        assertTrue(recursiveEquals(retValue, term170104));
    }

};


