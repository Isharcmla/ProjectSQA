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

public class CSVParser_parse_156507206493 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term273843;
     Object term275778;
     Object term275414;

    public CSVParser_parse_156507206493() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term273895 = new Character((char) 0);
        Character term273947 = new Character((char) 0);
        Character term273999 = new Character((char) 0);
        term273843 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term271439 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term273843, term273843.getClass(), "delimiter", (char) 0);
        setField(term273843, term273843.getClass(), "escape", term273895);
        setField(term273843, term273843.getClass(), "quoteChar", term273947);
        setField(term273843, term273843.getClass(), "commentStart", term273999);
        setBooleanField(term273843, term273843.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term273843, term273843.getClass(), "ignoreEmptyLines", true);
        setField(term273843, term273843.getClass(), "header", term271439);
        setBooleanField(term273843, term273843.getClass(), "skipHeaderRecord", true);
        setIntField(null, Class.forName("java.io.BufferedReader"), "defaultCharBufferSize", 256);
        Character term275779 = new Character((char) 0);
        Character term275780 = new Character((char) 0);
        Character term275781 = new Character((char) 0);
        term275778 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term275782 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term275778, term275778.getClass(), "delimiter", (char) 0);
        setField(term275778, term275778.getClass(), "quoteChar", term275779);
        setField(term275778, term275778.getClass(), "quotePolicy", null);
        setField(term275778, term275778.getClass(), "commentStart", term275780);
        setField(term275778, term275778.getClass(), "escape", term275781);
        setBooleanField(term275778, term275778.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term275778, term275778.getClass(), "ignoreEmptyHeaders", false);
        setBooleanField(term275778, term275778.getClass(), "ignoreEmptyLines", true);
        setField(term275778, term275778.getClass(), "recordSeparator", null);
        setField(term275778, term275778.getClass(), "nullString", null);
        setField(term275778, term275778.getClass(), "header", term275782);
        setBooleanField(term275778, term275778.getClass(), "skipHeaderRecord", true);
        Character term274014 = new Character((char) 0);
        Character term274016 = new Character((char) 0);
        Character term274018 = new Character((char) 0);
        LinkedHashMap term275415 = new LinkedHashMap();
        ArrayList term275700 = new ArrayList();
        Class<? extends Object> term276040 = Class.forName((String) "org.apache.commons.csv.Token$Type");
        Field term276039 = ((Class) term276040).getDeclaredField((String) "EOF");
        ((Field) term276039).setAccessible(true);
        Object enum94 = ((Field) term276039).get((Object) null);
        term275414 = newInstance(Class.forName("org.apache.commons.csv.CSVParser"));
        Object term274012 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term274023 = (Object[]) newArray("java.lang.String", 0);
        Object term275421 = newInstance(Class.forName("org.apache.commons.csv.Lexer"));
        Object term275428 = newInstance(Class.forName("org.apache.commons.csv.ExtendedBufferedReader"));
        Object term275432 = newInstance(Class.forName("java.io.StringReader"));
        char[] term275437 = (char[]) newCharArray(256);
        Object term275705 = newInstance(Class.forName("org.apache.commons.csv.Token"));
        Object term275713 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term275714 = (byte[]) newByteArray(50);
        setCharField(term274012, term274012.getClass(), "delimiter", (char) 0);
        setField(term274012, term274012.getClass(), "quoteChar", term274014);
        setField(term274012, term274012.getClass(), "quotePolicy", null);
        setField(term274012, term274012.getClass(), "commentStart", term274016);
        setField(term274012, term274012.getClass(), "escape", term274018);
        setBooleanField(term274012, term274012.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term274012, term274012.getClass(), "ignoreEmptyHeaders", false);
        setBooleanField(term274012, term274012.getClass(), "ignoreEmptyLines", true);
        setField(term274012, term274012.getClass(), "recordSeparator", null);
        setField(term274012, term274012.getClass(), "nullString", null);
        setField(term274012, term274012.getClass(), "header", term274023);
        setBooleanField(term274012, term274012.getClass(), "skipHeaderRecord", true);
        setField(term275414, term275414.getClass(), "format", term274012);
        setField(term275414, term275414.getClass(), "headerMap", term275415);
        setCharField(term275421, term275421.getClass(), "delimiter", (char) 0);
        setCharField(term275421, term275421.getClass(), "escape", (char) 0);
        setCharField(term275421, term275421.getClass(), "quoteChar", (char) 0);
        setCharField(term275421, term275421.getClass(), "commentStart", (char) 0);
        setBooleanField(term275421, term275421.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term275421, term275421.getClass(), "ignoreEmptyLines", true);
        setIntField(term275428, term275428.getClass(), "lastChar", -1);
        setLongField(term275428, term275428.getClass(), "eolCounter", 0L);
        setBooleanField(term275428, term275428.getClass(), "closed", false);
        setField(term275432, term275432.getClass(), "str", "");
        setIntField(term275432, term275432.getClass(), "length", 0);
        setIntField(term275432, term275432.getClass(), "next", 0);
        setIntField(term275432, term275432.getClass(), "mark", 0);
        setField(term275432, term275432.getClass(), "lock", term275432);
        setField(term275432, term275432.getClass(), "skipBuffer", null);
        setField(term275428, term275428.getClass(), "in", term275432);
        setField(term275428, term275428.getClass(), "cb", term275437);
        setIntField(term275428, term275428.getClass(), "nChars", 0);
        setIntField(term275428, term275428.getClass(), "nextChar", 0);
        setIntField(term275428, term275428.getClass(), "markedChar", -1);
        setIntField(term275428, term275428.getClass(), "readAheadLimit", 0);
        setBooleanField(term275428, term275428.getClass(), "skipLF", false);
        setBooleanField(term275428, term275428.getClass(), "markedSkipLF", false);
        setField(term275428, term275428.getClass(), "lock", term275432);
        setField(term275428, term275428.getClass(), "skipBuffer", null);
        setField(term275421, term275421.getClass(), "reader", term275428);
        setField(term275414, term275414.getClass(), "lexer", term275421);
        setField(term275414, term275414.getClass(), "record", term275700);
        setLongField(term275414, term275414.getClass(), "recordNumber", 0L);
        setField(term275705, term275705.getClass(), "type", enum94);
        setField(term275713, term275713.getClass(), "value", term275714);
        setByteField(term275713, term275713.getClass(), "coder", (byte) 0);
        setIntField(term275713, term275713.getClass(), "count", 0);
        setField(term275705, term275705.getClass(), "content", term275713);
        setBooleanField(term275705, term275705.getClass(), "isReady", false);
        setField(term275414, term275414.getClass(), "reusableToken", term275705);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("org.apache.commons.csv.CSVFormat");
        Object[] args = new Object[2];
        args[0] = "";
        args[1] = term273843;
        Object retValue = callMethod(klass, "parse", argTypes, null, args);
        assertTrue(recursiveEquals(term273843, term275778));
        assertTrue(recursiveEquals(retValue, term275414));
    }

};


