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

public class CSVParser_parse_156507206485 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term266796;
     Object term267540;
     Object term267427;

    public CSVParser_parse_156507206485() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term266848 = new Character((char) 0);
        Character term266900 = new Character((char) 0);
        Character term266952 = new Character((char) 0);
        term266796 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term263851 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term266796, term266796.getClass(), "delimiter", (char) 0);
        setField(term266796, term266796.getClass(), "escapeCharacter", term266848);
        setField(term266796, term266796.getClass(), "quoteCharacter", term266900);
        setField(term266796, term266796.getClass(), "commentMarker", term266952);
        setBooleanField(term266796, term266796.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term266796, term266796.getClass(), "ignoreEmptyLines", false);
        setField(term266796, term266796.getClass(), "header", term263851);
        setBooleanField(term266796, term266796.getClass(), "ignoreHeaderCase", false);
        setIntField(null, Class.forName("java.io.BufferedReader"), "defaultCharBufferSize", 1);
        Character term267541 = new Character((char) 0);
        Character term267542 = new Character((char) 0);
        Character term267544 = new Character((char) 0);
        term267540 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term267543 = (Object[]) newArray("java.lang.String", 0);
        setBooleanField(term267540, term267540.getClass(), "allowMissingColumnNames", false);
        setField(term267540, term267540.getClass(), "commentMarker", term267541);
        setCharField(term267540, term267540.getClass(), "delimiter", (char) 0);
        setField(term267540, term267540.getClass(), "escapeCharacter", term267542);
        setField(term267540, term267540.getClass(), "header", term267543);
        setField(term267540, term267540.getClass(), "headerComments", null);
        setBooleanField(term267540, term267540.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term267540, term267540.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term267540, term267540.getClass(), "ignoreSurroundingSpaces", false);
        setField(term267540, term267540.getClass(), "nullString", null);
        setField(term267540, term267540.getClass(), "quoteCharacter", term267544);
        setField(term267540, term267540.getClass(), "quoteMode", null);
        setField(term267540, term267540.getClass(), "recordSeparator", null);
        setBooleanField(term267540, term267540.getClass(), "skipHeaderRecord", false);
        setBooleanField(term267540, term267540.getClass(), "trailingDelimiter", false);
        setBooleanField(term267540, term267540.getClass(), "trim", false);
        setBooleanField(term267540, term267540.getClass(), "autoFlush", false);
        Character term266967 = new Character((char) 0);
        Character term266970 = new Character((char) 0);
        Character term266976 = new Character((char) 0);
        LinkedHashMap term267428 = new LinkedHashMap();
        ArrayList term267459 = new ArrayList();
        Class<? extends Object> term267547 = Class.forName((String) "org.apache.commons.csv.Token$Type");
        Field term267546 = ((Class) term267547).getDeclaredField((String) "EOF");
        ((Field) term267546).setAccessible(true);
        Object enum95 = ((Field) term267546).get((Object) null);
        term267427 = newInstance(Class.forName("org.apache.commons.csv.CSVParser"));
        Object term266965 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term266972 = (Object[]) newArray("java.lang.String", 0);
        Object term267434 = newInstance(Class.forName("org.apache.commons.csv.Lexer"));
        Object term267441 = newInstance(Class.forName("org.apache.commons.csv.ExtendedBufferedReader"));
        Object term267446 = newInstance(Class.forName("java.io.StringReader"));
        char[] term267451 = (char[]) newCharArray(1);
        Object term267465 = newInstance(Class.forName("org.apache.commons.csv.Token"));
        Object term267473 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term267474 = (byte[]) newByteArray(50);
        setBooleanField(term266965, term266965.getClass(), "allowMissingColumnNames", false);
        setField(term266965, term266965.getClass(), "commentMarker", term266967);
        setCharField(term266965, term266965.getClass(), "delimiter", (char) 0);
        setField(term266965, term266965.getClass(), "escapeCharacter", term266970);
        setField(term266965, term266965.getClass(), "header", term266972);
        setField(term266965, term266965.getClass(), "headerComments", null);
        setBooleanField(term266965, term266965.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term266965, term266965.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term266965, term266965.getClass(), "ignoreSurroundingSpaces", false);
        setField(term266965, term266965.getClass(), "nullString", null);
        setField(term266965, term266965.getClass(), "quoteCharacter", term266976);
        setField(term266965, term266965.getClass(), "quoteMode", null);
        setField(term266965, term266965.getClass(), "recordSeparator", null);
        setBooleanField(term266965, term266965.getClass(), "skipHeaderRecord", false);
        setBooleanField(term266965, term266965.getClass(), "trailingDelimiter", false);
        setBooleanField(term266965, term266965.getClass(), "trim", false);
        setBooleanField(term266965, term266965.getClass(), "autoFlush", false);
        setField(term267427, term267427.getClass(), "format", term266965);
        setField(term267427, term267427.getClass(), "headerMap", term267428);
        setCharField(term267434, term267434.getClass(), "delimiter", (char) 0);
        setCharField(term267434, term267434.getClass(), "escape", (char) 0);
        setCharField(term267434, term267434.getClass(), "quoteChar", (char) 0);
        setCharField(term267434, term267434.getClass(), "commentStart", (char) 0);
        setBooleanField(term267434, term267434.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term267434, term267434.getClass(), "ignoreEmptyLines", false);
        setIntField(term267441, term267441.getClass(), "lastChar", -1);
        setLongField(term267441, term267441.getClass(), "eolCounter", 0L);
        setLongField(term267441, term267441.getClass(), "position", 1L);
        setBooleanField(term267441, term267441.getClass(), "closed", false);
        setField(term267446, term267446.getClass(), "str", "");
        setIntField(term267446, term267446.getClass(), "length", 0);
        setIntField(term267446, term267446.getClass(), "next", 0);
        setIntField(term267446, term267446.getClass(), "mark", 0);
        setField(term267446, term267446.getClass(), "lock", term267446);
        setField(term267446, term267446.getClass(), "skipBuffer", null);
        setField(term267441, term267441.getClass(), "in", term267446);
        setField(term267441, term267441.getClass(), "cb", term267451);
        setIntField(term267441, term267441.getClass(), "nChars", 0);
        setIntField(term267441, term267441.getClass(), "nextChar", 0);
        setIntField(term267441, term267441.getClass(), "markedChar", -1);
        setIntField(term267441, term267441.getClass(), "readAheadLimit", 0);
        setBooleanField(term267441, term267441.getClass(), "skipLF", false);
        setBooleanField(term267441, term267441.getClass(), "markedSkipLF", false);
        setField(term267441, term267441.getClass(), "lock", term267446);
        setField(term267441, term267441.getClass(), "skipBuffer", null);
        setField(term267434, term267434.getClass(), "reader", term267441);
        setField(term267434, term267434.getClass(), "firstEol", null);
        setField(term267427, term267427.getClass(), "lexer", term267434);
        setField(term267427, term267427.getClass(), "recordList", term267459);
        setLongField(term267427, term267427.getClass(), "recordNumber", 0L);
        setLongField(term267427, term267427.getClass(), "characterOffset", 0L);
        setField(term267465, term267465.getClass(), "type", enum95);
        setField(term267473, term267473.getClass(), "value", term267474);
        setByteField(term267473, term267473.getClass(), "coder", (byte) 0);
        setIntField(term267473, term267473.getClass(), "count", 0);
        setField(term267465, term267465.getClass(), "content", term267473);
        setBooleanField(term267465, term267465.getClass(), "isReady", false);
        setField(term267427, term267427.getClass(), "reusableToken", term267465);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("org.apache.commons.csv.CSVFormat");
        Object[] args = new Object[2];
        args[0] = "";
        args[1] = term266796;
        Object retValue = callMethod(klass, "parse", argTypes, null, args);
        assertTrue(recursiveEquals(term266796, term267540));
        assertTrue(recursiveEquals(retValue, term267427));
    }

};


