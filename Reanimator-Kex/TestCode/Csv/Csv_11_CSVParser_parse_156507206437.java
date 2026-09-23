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

public class CSVParser_parse_156507206437 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term175400;
     Object term176095;
     Object term175979;

    public CSVParser_parse_156507206437() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term175452 = new Character((char) 1024);
        Character term175504 = new Character((char) 0);
        Character term175556 = new Character((char) 0);
        term175400 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term171855 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term175400, term175400.getClass(), "delimiter", (char) 4096);
        setField(term175400, term175400.getClass(), "escape", term175452);
        setField(term175400, term175400.getClass(), "quoteChar", term175504);
        setField(term175400, term175400.getClass(), "commentStart", term175556);
        setBooleanField(term175400, term175400.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term175400, term175400.getClass(), "ignoreEmptyLines", true);
        setField(term175400, term175400.getClass(), "header", term171855);
        setBooleanField(term175400, term175400.getClass(), "skipHeaderRecord", true);
        setIntField(null, Class.forName("java.io.BufferedReader"), "defaultCharBufferSize", 8);
        Character term176096 = new Character((char) 0);
        Character term176097 = new Character((char) 0);
        Character term176098 = new Character((char) 1024);
        term176095 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term176099 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term176095, term176095.getClass(), "delimiter", (char) 4096);
        setField(term176095, term176095.getClass(), "quoteChar", term176096);
        setField(term176095, term176095.getClass(), "quotePolicy", null);
        setField(term176095, term176095.getClass(), "commentStart", term176097);
        setField(term176095, term176095.getClass(), "escape", term176098);
        setBooleanField(term176095, term176095.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term176095, term176095.getClass(), "ignoreEmptyHeaders", false);
        setBooleanField(term176095, term176095.getClass(), "ignoreEmptyLines", true);
        setField(term176095, term176095.getClass(), "recordSeparator", null);
        setField(term176095, term176095.getClass(), "nullString", null);
        setField(term176095, term176095.getClass(), "header", term176099);
        setBooleanField(term176095, term176095.getClass(), "skipHeaderRecord", true);
        Character term175571 = new Character((char) 0);
        Character term175573 = new Character((char) 0);
        Character term175575 = new Character((char) 1024);
        LinkedHashMap term175980 = new LinkedHashMap();
        ArrayList term176017 = new ArrayList();
        Class<? extends Object> term176109 = Class.forName((String) "org.apache.commons.csv.Token$Type");
        Field term176108 = ((Class) term176109).getDeclaredField((String) "EOF");
        ((Field) term176108).setAccessible(true);
        Object enum73 = ((Field) term176108).get((Object) null);
        term175979 = newInstance(Class.forName("org.apache.commons.csv.CSVParser"));
        Object term175569 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term175580 = (Object[]) newArray("java.lang.String", 0);
        Object term175986 = newInstance(Class.forName("org.apache.commons.csv.Lexer"));
        Object term175993 = newInstance(Class.forName("org.apache.commons.csv.ExtendedBufferedReader"));
        Object term175997 = newInstance(Class.forName("java.io.StringReader"));
        char[] term176002 = (char[]) newCharArray(8);
        Object term176022 = newInstance(Class.forName("org.apache.commons.csv.Token"));
        Object term176030 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term176031 = (byte[]) newByteArray(50);
        setCharField(term175569, term175569.getClass(), "delimiter", (char) 4096);
        setField(term175569, term175569.getClass(), "quoteChar", term175571);
        setField(term175569, term175569.getClass(), "quotePolicy", null);
        setField(term175569, term175569.getClass(), "commentStart", term175573);
        setField(term175569, term175569.getClass(), "escape", term175575);
        setBooleanField(term175569, term175569.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term175569, term175569.getClass(), "ignoreEmptyHeaders", false);
        setBooleanField(term175569, term175569.getClass(), "ignoreEmptyLines", true);
        setField(term175569, term175569.getClass(), "recordSeparator", null);
        setField(term175569, term175569.getClass(), "nullString", null);
        setField(term175569, term175569.getClass(), "header", term175580);
        setBooleanField(term175569, term175569.getClass(), "skipHeaderRecord", true);
        setField(term175979, term175979.getClass(), "format", term175569);
        setField(term175979, term175979.getClass(), "headerMap", term175980);
        setCharField(term175986, term175986.getClass(), "delimiter", (char) 4096);
        setCharField(term175986, term175986.getClass(), "escape", (char) 1024);
        setCharField(term175986, term175986.getClass(), "quoteChar", (char) 0);
        setCharField(term175986, term175986.getClass(), "commentStart", (char) 0);
        setBooleanField(term175986, term175986.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term175986, term175986.getClass(), "ignoreEmptyLines", true);
        setIntField(term175993, term175993.getClass(), "lastChar", -1);
        setLongField(term175993, term175993.getClass(), "eolCounter", 0L);
        setBooleanField(term175993, term175993.getClass(), "closed", false);
        setField(term175997, term175997.getClass(), "str", "");
        setIntField(term175997, term175997.getClass(), "length", 0);
        setIntField(term175997, term175997.getClass(), "next", 0);
        setIntField(term175997, term175997.getClass(), "mark", 0);
        setField(term175997, term175997.getClass(), "lock", term175997);
        setField(term175997, term175997.getClass(), "skipBuffer", null);
        setField(term175993, term175993.getClass(), "in", term175997);
        setField(term175993, term175993.getClass(), "cb", term176002);
        setIntField(term175993, term175993.getClass(), "nChars", 0);
        setIntField(term175993, term175993.getClass(), "nextChar", 0);
        setIntField(term175993, term175993.getClass(), "markedChar", -1);
        setIntField(term175993, term175993.getClass(), "readAheadLimit", 0);
        setBooleanField(term175993, term175993.getClass(), "skipLF", false);
        setBooleanField(term175993, term175993.getClass(), "markedSkipLF", false);
        setField(term175993, term175993.getClass(), "lock", term175997);
        setField(term175993, term175993.getClass(), "skipBuffer", null);
        setField(term175986, term175986.getClass(), "reader", term175993);
        setField(term175979, term175979.getClass(), "lexer", term175986);
        setField(term175979, term175979.getClass(), "record", term176017);
        setLongField(term175979, term175979.getClass(), "recordNumber", 0L);
        setField(term176022, term176022.getClass(), "type", enum73);
        setField(term176030, term176030.getClass(), "value", term176031);
        setByteField(term176030, term176030.getClass(), "coder", (byte) 0);
        setIntField(term176030, term176030.getClass(), "count", 0);
        setField(term176022, term176022.getClass(), "content", term176030);
        setBooleanField(term176022, term176022.getClass(), "isReady", false);
        setField(term175979, term175979.getClass(), "reusableToken", term176022);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("org.apache.commons.csv.CSVFormat");
        Object[] args = new Object[2];
        args[0] = "";
        args[1] = term175400;
        Object retValue = callMethod(klass, "parse", argTypes, null, args);
        assertTrue(recursiveEquals(term175400, term176095));
        assertTrue(recursiveEquals(retValue, term175979));
    }

};


