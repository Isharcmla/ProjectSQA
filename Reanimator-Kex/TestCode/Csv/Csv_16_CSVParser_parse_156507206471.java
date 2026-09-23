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

public class CSVParser_parse_156507206471 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term244683;
     Object term245449;
     Object term245333;

    public CSVParser_parse_156507206471() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term244735 = new Character((char) 512);
        Character term244787 = new Character((char) 0);
        Character term244839 = new Character((char) 32768);
        term244683 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term238151 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term244683, term244683.getClass(), "delimiter", (char) 32768);
        setField(term244683, term244683.getClass(), "escapeCharacter", term244735);
        setField(term244683, term244683.getClass(), "quoteCharacter", term244787);
        setField(term244683, term244683.getClass(), "commentMarker", term244839);
        setBooleanField(term244683, term244683.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term244683, term244683.getClass(), "ignoreEmptyLines", true);
        setField(term244683, term244683.getClass(), "header", term238151);
        setBooleanField(term244683, term244683.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term244683, term244683.getClass(), "skipHeaderRecord", true);
        setIntField(null, Class.forName("java.io.BufferedReader"), "defaultCharBufferSize", 4);
        Character term245450 = new Character((char) 32768);
        Character term245451 = new Character((char) 512);
        Character term245453 = new Character((char) 0);
        term245449 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term245452 = (Object[]) newArray("java.lang.String", 0);
        setBooleanField(term245449, term245449.getClass(), "allowMissingColumnNames", false);
        setField(term245449, term245449.getClass(), "commentMarker", term245450);
        setCharField(term245449, term245449.getClass(), "delimiter", (char) 32768);
        setField(term245449, term245449.getClass(), "escapeCharacter", term245451);
        setField(term245449, term245449.getClass(), "header", term245452);
        setField(term245449, term245449.getClass(), "headerComments", null);
        setBooleanField(term245449, term245449.getClass(), "ignoreEmptyLines", true);
        setBooleanField(term245449, term245449.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term245449, term245449.getClass(), "ignoreSurroundingSpaces", true);
        setField(term245449, term245449.getClass(), "nullString", null);
        setField(term245449, term245449.getClass(), "quoteCharacter", term245453);
        setField(term245449, term245449.getClass(), "quoteMode", null);
        setField(term245449, term245449.getClass(), "recordSeparator", null);
        setBooleanField(term245449, term245449.getClass(), "skipHeaderRecord", true);
        setBooleanField(term245449, term245449.getClass(), "trailingDelimiter", false);
        setBooleanField(term245449, term245449.getClass(), "trim", false);
        setBooleanField(term245449, term245449.getClass(), "autoFlush", false);
        Character term244854 = new Character((char) 32768);
        Character term244857 = new Character((char) 512);
        Character term244863 = new Character((char) 0);
        LinkedHashMap term245334 = new LinkedHashMap();
        ArrayList term245368 = new ArrayList();
        Class<? extends Object> term245459 = Class.forName((String) "org.apache.commons.csv.Token$Type");
        Field term245458 = ((Class) term245459).getDeclaredField((String) "EOF");
        ((Field) term245458).setAccessible(true);
        Object enum91 = ((Field) term245458).get((Object) null);
        term245333 = newInstance(Class.forName("org.apache.commons.csv.CSVParser"));
        Object term244852 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term244859 = (Object[]) newArray("java.lang.String", 0);
        Object term245340 = newInstance(Class.forName("org.apache.commons.csv.Lexer"));
        Object term245347 = newInstance(Class.forName("org.apache.commons.csv.ExtendedBufferedReader"));
        Object term245352 = newInstance(Class.forName("java.io.StringReader"));
        char[] term245357 = (char[]) newCharArray(4);
        Object term245374 = newInstance(Class.forName("org.apache.commons.csv.Token"));
        Object term245382 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term245383 = (byte[]) newByteArray(50);
        setBooleanField(term244852, term244852.getClass(), "allowMissingColumnNames", false);
        setField(term244852, term244852.getClass(), "commentMarker", term244854);
        setCharField(term244852, term244852.getClass(), "delimiter", (char) 32768);
        setField(term244852, term244852.getClass(), "escapeCharacter", term244857);
        setField(term244852, term244852.getClass(), "header", term244859);
        setField(term244852, term244852.getClass(), "headerComments", null);
        setBooleanField(term244852, term244852.getClass(), "ignoreEmptyLines", true);
        setBooleanField(term244852, term244852.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term244852, term244852.getClass(), "ignoreSurroundingSpaces", true);
        setField(term244852, term244852.getClass(), "nullString", null);
        setField(term244852, term244852.getClass(), "quoteCharacter", term244863);
        setField(term244852, term244852.getClass(), "quoteMode", null);
        setField(term244852, term244852.getClass(), "recordSeparator", null);
        setBooleanField(term244852, term244852.getClass(), "skipHeaderRecord", true);
        setBooleanField(term244852, term244852.getClass(), "trailingDelimiter", false);
        setBooleanField(term244852, term244852.getClass(), "trim", false);
        setBooleanField(term244852, term244852.getClass(), "autoFlush", false);
        setField(term245333, term245333.getClass(), "format", term244852);
        setField(term245333, term245333.getClass(), "headerMap", term245334);
        setCharField(term245340, term245340.getClass(), "delimiter", (char) 32768);
        setCharField(term245340, term245340.getClass(), "escape", (char) 512);
        setCharField(term245340, term245340.getClass(), "quoteChar", (char) 0);
        setCharField(term245340, term245340.getClass(), "commentStart", (char) 32768);
        setBooleanField(term245340, term245340.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term245340, term245340.getClass(), "ignoreEmptyLines", true);
        setIntField(term245347, term245347.getClass(), "lastChar", -1);
        setLongField(term245347, term245347.getClass(), "eolCounter", 0L);
        setLongField(term245347, term245347.getClass(), "position", 1L);
        setBooleanField(term245347, term245347.getClass(), "closed", false);
        setField(term245352, term245352.getClass(), "str", "");
        setIntField(term245352, term245352.getClass(), "length", 0);
        setIntField(term245352, term245352.getClass(), "next", 0);
        setIntField(term245352, term245352.getClass(), "mark", 0);
        setField(term245352, term245352.getClass(), "lock", term245352);
        setField(term245352, term245352.getClass(), "skipBuffer", null);
        setField(term245347, term245347.getClass(), "in", term245352);
        setField(term245347, term245347.getClass(), "cb", term245357);
        setIntField(term245347, term245347.getClass(), "nChars", 0);
        setIntField(term245347, term245347.getClass(), "nextChar", 0);
        setIntField(term245347, term245347.getClass(), "markedChar", -1);
        setIntField(term245347, term245347.getClass(), "readAheadLimit", 0);
        setBooleanField(term245347, term245347.getClass(), "skipLF", false);
        setBooleanField(term245347, term245347.getClass(), "markedSkipLF", false);
        setField(term245347, term245347.getClass(), "lock", term245352);
        setField(term245347, term245347.getClass(), "skipBuffer", null);
        setField(term245340, term245340.getClass(), "reader", term245347);
        setField(term245340, term245340.getClass(), "firstEol", null);
        setField(term245333, term245333.getClass(), "lexer", term245340);
        setField(term245333, term245333.getClass(), "recordList", term245368);
        setLongField(term245333, term245333.getClass(), "recordNumber", 0L);
        setLongField(term245333, term245333.getClass(), "characterOffset", 0L);
        setField(term245374, term245374.getClass(), "type", enum91);
        setField(term245382, term245382.getClass(), "value", term245383);
        setByteField(term245382, term245382.getClass(), "coder", (byte) 0);
        setIntField(term245382, term245382.getClass(), "count", 0);
        setField(term245374, term245374.getClass(), "content", term245382);
        setBooleanField(term245374, term245374.getClass(), "isReady", false);
        setField(term245333, term245333.getClass(), "reusableToken", term245374);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("org.apache.commons.csv.CSVFormat");
        Object[] args = new Object[2];
        args[0] = "";
        args[1] = term244683;
        Object retValue = callMethod(klass, "parse", argTypes, null, args);
        assertTrue(recursiveEquals(term244683, term245449));
        assertTrue(recursiveEquals(retValue, term245333));
    }

};


