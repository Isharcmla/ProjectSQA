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

public class CSVParser_parse_156507206453 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term193639;
     Object term194454;
     Object term194314;

    public CSVParser_parse_156507206453() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term193691 = new Character((char) 0);
        Character term193743 = new Character((char) 0);
        Character term193795 = new Character((char) 0);
        term193639 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term191255 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term193639, term193639.getClass(), "delimiter", (char) 0);
        setField(term193639, term193639.getClass(), "escape", term193691);
        setField(term193639, term193639.getClass(), "quoteChar", term193743);
        setField(term193639, term193639.getClass(), "commentStart", term193795);
        setBooleanField(term193639, term193639.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term193639, term193639.getClass(), "ignoreEmptyLines", true);
        setField(term193639, term193639.getClass(), "header", term191255);
        setIntField(null, Class.forName("java.io.BufferedReader"), "defaultCharBufferSize", 32);
        Character term194455 = new Character((char) 0);
        Character term194456 = new Character((char) 0);
        Character term194457 = new Character((char) 0);
        term194454 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term194458 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term194454, term194454.getClass(), "delimiter", (char) 0);
        setField(term194454, term194454.getClass(), "quoteChar", term194455);
        setField(term194454, term194454.getClass(), "quotePolicy", null);
        setField(term194454, term194454.getClass(), "commentStart", term194456);
        setField(term194454, term194454.getClass(), "escape", term194457);
        setBooleanField(term194454, term194454.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term194454, term194454.getClass(), "ignoreEmptyHeaders", false);
        setBooleanField(term194454, term194454.getClass(), "ignoreEmptyLines", true);
        setField(term194454, term194454.getClass(), "recordSeparator", null);
        setField(term194454, term194454.getClass(), "nullString", null);
        setField(term194454, term194454.getClass(), "header", term194458);
        setBooleanField(term194454, term194454.getClass(), "skipHeaderRecord", false);
        Character term193810 = new Character((char) 0);
        Character term193812 = new Character((char) 0);
        Character term193814 = new Character((char) 0);
        LinkedHashMap term194315 = new LinkedHashMap();
        ArrayList term194376 = new ArrayList();
        Class<? extends Object> term194492 = Class.forName((String) "org.apache.commons.csv.Token$Type");
        Field term194491 = ((Class) term194492).getDeclaredField((String) "EOF");
        ((Field) term194491).setAccessible(true);
        Object enum77 = ((Field) term194491).get((Object) null);
        term194314 = newInstance(Class.forName("org.apache.commons.csv.CSVParser"));
        Object term193808 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term193819 = (Object[]) newArray("java.lang.String", 0);
        Object term194321 = newInstance(Class.forName("org.apache.commons.csv.Lexer"));
        Object term194328 = newInstance(Class.forName("org.apache.commons.csv.ExtendedBufferedReader"));
        Object term194332 = newInstance(Class.forName("java.io.StringReader"));
        char[] term194337 = (char[]) newCharArray(32);
        Object term194381 = newInstance(Class.forName("org.apache.commons.csv.Token"));
        Object term194389 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term194390 = (byte[]) newByteArray(50);
        setCharField(term193808, term193808.getClass(), "delimiter", (char) 0);
        setField(term193808, term193808.getClass(), "quoteChar", term193810);
        setField(term193808, term193808.getClass(), "quotePolicy", null);
        setField(term193808, term193808.getClass(), "commentStart", term193812);
        setField(term193808, term193808.getClass(), "escape", term193814);
        setBooleanField(term193808, term193808.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term193808, term193808.getClass(), "ignoreEmptyHeaders", false);
        setBooleanField(term193808, term193808.getClass(), "ignoreEmptyLines", true);
        setField(term193808, term193808.getClass(), "recordSeparator", null);
        setField(term193808, term193808.getClass(), "nullString", null);
        setField(term193808, term193808.getClass(), "header", term193819);
        setBooleanField(term193808, term193808.getClass(), "skipHeaderRecord", false);
        setField(term194314, term194314.getClass(), "format", term193808);
        setField(term194314, term194314.getClass(), "headerMap", term194315);
        setCharField(term194321, term194321.getClass(), "delimiter", (char) 0);
        setCharField(term194321, term194321.getClass(), "escape", (char) 0);
        setCharField(term194321, term194321.getClass(), "quoteChar", (char) 0);
        setCharField(term194321, term194321.getClass(), "commentStart", (char) 0);
        setBooleanField(term194321, term194321.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term194321, term194321.getClass(), "ignoreEmptyLines", true);
        setIntField(term194328, term194328.getClass(), "lastChar", -1);
        setLongField(term194328, term194328.getClass(), "eolCounter", 0L);
        setBooleanField(term194328, term194328.getClass(), "closed", false);
        setField(term194332, term194332.getClass(), "str", "");
        setIntField(term194332, term194332.getClass(), "length", 0);
        setIntField(term194332, term194332.getClass(), "next", 0);
        setIntField(term194332, term194332.getClass(), "mark", 0);
        setField(term194332, term194332.getClass(), "lock", term194332);
        setField(term194332, term194332.getClass(), "skipBuffer", null);
        setField(term194328, term194328.getClass(), "in", term194332);
        setField(term194328, term194328.getClass(), "cb", term194337);
        setIntField(term194328, term194328.getClass(), "nChars", 0);
        setIntField(term194328, term194328.getClass(), "nextChar", 0);
        setIntField(term194328, term194328.getClass(), "markedChar", -1);
        setIntField(term194328, term194328.getClass(), "readAheadLimit", 0);
        setBooleanField(term194328, term194328.getClass(), "skipLF", false);
        setBooleanField(term194328, term194328.getClass(), "markedSkipLF", false);
        setField(term194328, term194328.getClass(), "lock", term194332);
        setField(term194328, term194328.getClass(), "skipBuffer", null);
        setField(term194321, term194321.getClass(), "reader", term194328);
        setField(term194314, term194314.getClass(), "lexer", term194321);
        setField(term194314, term194314.getClass(), "record", term194376);
        setLongField(term194314, term194314.getClass(), "recordNumber", 0L);
        setField(term194381, term194381.getClass(), "type", enum77);
        setField(term194389, term194389.getClass(), "value", term194390);
        setByteField(term194389, term194389.getClass(), "coder", (byte) 0);
        setIntField(term194389, term194389.getClass(), "count", 0);
        setField(term194381, term194381.getClass(), "content", term194389);
        setBooleanField(term194381, term194381.getClass(), "isReady", false);
        setField(term194314, term194314.getClass(), "reusableToken", term194381);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("org.apache.commons.csv.CSVFormat");
        Object[] args = new Object[2];
        args[0] = "";
        args[1] = term193639;
        Object retValue = callMethod(klass, "parse", argTypes, null, args);
        assertTrue(recursiveEquals(term193639, term194454));
        assertTrue(recursiveEquals(retValue, term194314));
    }

};


