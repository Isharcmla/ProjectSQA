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

public class CSVParser_parse_1565072064163 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term377032;
     Object term645880;
     Object term645771;

    public CSVParser_parse_1565072064163() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term377084 = new Character((char) 4944);
        Character term377136 = new Character((char) 0);
        Character term377188 = new Character((char) 4944);
        term377032 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term375498 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term377032, term377032.getClass(), "delimiter", (char) 32816);
        setField(term377032, term377032.getClass(), "escape", term377084);
        setField(term377032, term377032.getClass(), "quoteChar", term377136);
        setField(term377032, term377032.getClass(), "commentStart", term377188);
        setBooleanField(term377032, term377032.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term377032, term377032.getClass(), "ignoreEmptyLines", true);
        setField(term377032, term377032.getClass(), "header", term375498);
        setBooleanField(term377032, term377032.getClass(), "skipHeaderRecord", true);
        setIntField(null, Class.forName("java.io.BufferedReader"), "defaultCharBufferSize", 1);
        Character term645881 = new Character((char) 0);
        Character term645882 = new Character((char) 4944);
        Character term645883 = new Character((char) 4944);
        term645880 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term645884 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term645880, term645880.getClass(), "delimiter", (char) 32816);
        setField(term645880, term645880.getClass(), "quoteChar", term645881);
        setField(term645880, term645880.getClass(), "quotePolicy", null);
        setField(term645880, term645880.getClass(), "commentStart", term645882);
        setField(term645880, term645880.getClass(), "escape", term645883);
        setBooleanField(term645880, term645880.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term645880, term645880.getClass(), "ignoreEmptyHeaders", false);
        setBooleanField(term645880, term645880.getClass(), "ignoreEmptyLines", true);
        setField(term645880, term645880.getClass(), "recordSeparator", null);
        setField(term645880, term645880.getClass(), "nullString", null);
        setField(term645880, term645880.getClass(), "header", term645884);
        setBooleanField(term645880, term645880.getClass(), "skipHeaderRecord", true);
        Character term645391 = new Character((char) 0);
        Character term645393 = new Character((char) 4944);
        Character term645395 = new Character((char) 4944);
        LinkedHashMap term645772 = new LinkedHashMap();
        ArrayList term645802 = new ArrayList();
        Class<? extends Object> term645887 = Class.forName((String) "org.apache.commons.csv.Token$Type");
        Field term645886 = ((Class) term645887).getDeclaredField((String) "EOF");
        ((Field) term645886).setAccessible(true);
        Object enum120 = ((Field) term645886).get((Object) null);
        term645771 = newInstance(Class.forName("org.apache.commons.csv.CSVParser"));
        Object term645389 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term645400 = (Object[]) newArray("java.lang.String", 0);
        Object term645778 = newInstance(Class.forName("org.apache.commons.csv.Lexer"));
        Object term645785 = newInstance(Class.forName("org.apache.commons.csv.ExtendedBufferedReader"));
        Object term645789 = newInstance(Class.forName("java.io.StringReader"));
        char[] term645794 = (char[]) newCharArray(1);
        Object term645807 = newInstance(Class.forName("org.apache.commons.csv.Token"));
        Object term645815 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term645816 = (byte[]) newByteArray(50);
        setCharField(term645389, term645389.getClass(), "delimiter", (char) 32816);
        setField(term645389, term645389.getClass(), "quoteChar", term645391);
        setField(term645389, term645389.getClass(), "quotePolicy", null);
        setField(term645389, term645389.getClass(), "commentStart", term645393);
        setField(term645389, term645389.getClass(), "escape", term645395);
        setBooleanField(term645389, term645389.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term645389, term645389.getClass(), "ignoreEmptyHeaders", false);
        setBooleanField(term645389, term645389.getClass(), "ignoreEmptyLines", true);
        setField(term645389, term645389.getClass(), "recordSeparator", null);
        setField(term645389, term645389.getClass(), "nullString", null);
        setField(term645389, term645389.getClass(), "header", term645400);
        setBooleanField(term645389, term645389.getClass(), "skipHeaderRecord", true);
        setField(term645771, term645771.getClass(), "format", term645389);
        setField(term645771, term645771.getClass(), "headerMap", term645772);
        setCharField(term645778, term645778.getClass(), "delimiter", (char) 32816);
        setCharField(term645778, term645778.getClass(), "escape", (char) 4944);
        setCharField(term645778, term645778.getClass(), "quoteChar", (char) 0);
        setCharField(term645778, term645778.getClass(), "commentStart", (char) 4944);
        setBooleanField(term645778, term645778.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term645778, term645778.getClass(), "ignoreEmptyLines", true);
        setIntField(term645785, term645785.getClass(), "lastChar", -1);
        setLongField(term645785, term645785.getClass(), "eolCounter", 0L);
        setBooleanField(term645785, term645785.getClass(), "closed", false);
        setField(term645789, term645789.getClass(), "str", "");
        setIntField(term645789, term645789.getClass(), "length", 0);
        setIntField(term645789, term645789.getClass(), "next", 0);
        setIntField(term645789, term645789.getClass(), "mark", 0);
        setField(term645789, term645789.getClass(), "lock", term645789);
        setField(term645789, term645789.getClass(), "skipBuffer", null);
        setField(term645785, term645785.getClass(), "in", term645789);
        setField(term645785, term645785.getClass(), "cb", term645794);
        setIntField(term645785, term645785.getClass(), "nChars", 0);
        setIntField(term645785, term645785.getClass(), "nextChar", 0);
        setIntField(term645785, term645785.getClass(), "markedChar", -1);
        setIntField(term645785, term645785.getClass(), "readAheadLimit", 0);
        setBooleanField(term645785, term645785.getClass(), "skipLF", false);
        setBooleanField(term645785, term645785.getClass(), "markedSkipLF", false);
        setField(term645785, term645785.getClass(), "lock", term645789);
        setField(term645785, term645785.getClass(), "skipBuffer", null);
        setField(term645778, term645778.getClass(), "reader", term645785);
        setField(term645771, term645771.getClass(), "lexer", term645778);
        setField(term645771, term645771.getClass(), "record", term645802);
        setLongField(term645771, term645771.getClass(), "recordNumber", 0L);
        setField(term645807, term645807.getClass(), "type", enum120);
        setField(term645815, term645815.getClass(), "value", term645816);
        setByteField(term645815, term645815.getClass(), "coder", (byte) 0);
        setIntField(term645815, term645815.getClass(), "count", 0);
        setField(term645807, term645807.getClass(), "content", term645815);
        setBooleanField(term645807, term645807.getClass(), "isReady", false);
        setField(term645771, term645771.getClass(), "reusableToken", term645807);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("org.apache.commons.csv.CSVFormat");
        Object[] args = new Object[2];
        args[0] = "";
        args[1] = term377032;
        Object retValue = callMethod(klass, "parse", argTypes, null, args);
        assertTrue(recursiveEquals(term377032, term645880));
        assertTrue(recursiveEquals(retValue, term645771));
    }

};


