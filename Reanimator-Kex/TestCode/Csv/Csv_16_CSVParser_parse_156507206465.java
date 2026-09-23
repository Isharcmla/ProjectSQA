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

public class CSVParser_parse_156507206465 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term220368;
     Object term221330;
     Object term221186;

    public CSVParser_parse_156507206465() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term220420 = new Character((char) 0);
        Character term220472 = new Character((char) 0);
        Character term220524 = new Character((char) 0);
        term220368 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term219041 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term220368, term220368.getClass(), "delimiter", (char) 0);
        setField(term220368, term220368.getClass(), "escapeCharacter", term220420);
        setField(term220368, term220368.getClass(), "quoteCharacter", term220472);
        setField(term220368, term220368.getClass(), "commentMarker", term220524);
        setBooleanField(term220368, term220368.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term220368, term220368.getClass(), "ignoreEmptyLines", true);
        setField(term220368, term220368.getClass(), "header", term219041);
        setBooleanField(term220368, term220368.getClass(), "ignoreHeaderCase", false);
        setIntField(null, Class.forName("java.io.BufferedReader"), "defaultCharBufferSize", 32);
        Character term221331 = new Character((char) 0);
        Character term221332 = new Character((char) 0);
        Character term221334 = new Character((char) 0);
        term221330 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term221333 = (Object[]) newArray("java.lang.String", 0);
        setBooleanField(term221330, term221330.getClass(), "allowMissingColumnNames", false);
        setField(term221330, term221330.getClass(), "commentMarker", term221331);
        setCharField(term221330, term221330.getClass(), "delimiter", (char) 0);
        setField(term221330, term221330.getClass(), "escapeCharacter", term221332);
        setField(term221330, term221330.getClass(), "header", term221333);
        setField(term221330, term221330.getClass(), "headerComments", null);
        setBooleanField(term221330, term221330.getClass(), "ignoreEmptyLines", true);
        setBooleanField(term221330, term221330.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term221330, term221330.getClass(), "ignoreSurroundingSpaces", false);
        setField(term221330, term221330.getClass(), "nullString", null);
        setField(term221330, term221330.getClass(), "quoteCharacter", term221334);
        setField(term221330, term221330.getClass(), "quoteMode", null);
        setField(term221330, term221330.getClass(), "recordSeparator", null);
        setBooleanField(term221330, term221330.getClass(), "skipHeaderRecord", false);
        setBooleanField(term221330, term221330.getClass(), "trailingDelimiter", false);
        setBooleanField(term221330, term221330.getClass(), "trim", false);
        setBooleanField(term221330, term221330.getClass(), "autoFlush", false);
        Character term220539 = new Character((char) 0);
        Character term220542 = new Character((char) 0);
        Character term220548 = new Character((char) 0);
        LinkedHashMap term221187 = new LinkedHashMap();
        ArrayList term221249 = new ArrayList();
        Class<? extends Object> term221368 = Class.forName((String) "org.apache.commons.csv.Token$Type");
        Field term221367 = ((Class) term221368).getDeclaredField((String) "EOF");
        ((Field) term221367).setAccessible(true);
        Object enum89 = ((Field) term221367).get((Object) null);
        term221186 = newInstance(Class.forName("org.apache.commons.csv.CSVParser"));
        Object term220537 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term220544 = (Object[]) newArray("java.lang.String", 0);
        Object term221193 = newInstance(Class.forName("org.apache.commons.csv.Lexer"));
        Object term221200 = newInstance(Class.forName("org.apache.commons.csv.ExtendedBufferedReader"));
        Object term221205 = newInstance(Class.forName("java.io.StringReader"));
        char[] term221210 = (char[]) newCharArray(32);
        Object term221255 = newInstance(Class.forName("org.apache.commons.csv.Token"));
        Object term221263 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term221264 = (byte[]) newByteArray(50);
        setBooleanField(term220537, term220537.getClass(), "allowMissingColumnNames", false);
        setField(term220537, term220537.getClass(), "commentMarker", term220539);
        setCharField(term220537, term220537.getClass(), "delimiter", (char) 0);
        setField(term220537, term220537.getClass(), "escapeCharacter", term220542);
        setField(term220537, term220537.getClass(), "header", term220544);
        setField(term220537, term220537.getClass(), "headerComments", null);
        setBooleanField(term220537, term220537.getClass(), "ignoreEmptyLines", true);
        setBooleanField(term220537, term220537.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term220537, term220537.getClass(), "ignoreSurroundingSpaces", false);
        setField(term220537, term220537.getClass(), "nullString", null);
        setField(term220537, term220537.getClass(), "quoteCharacter", term220548);
        setField(term220537, term220537.getClass(), "quoteMode", null);
        setField(term220537, term220537.getClass(), "recordSeparator", null);
        setBooleanField(term220537, term220537.getClass(), "skipHeaderRecord", false);
        setBooleanField(term220537, term220537.getClass(), "trailingDelimiter", false);
        setBooleanField(term220537, term220537.getClass(), "trim", false);
        setBooleanField(term220537, term220537.getClass(), "autoFlush", false);
        setField(term221186, term221186.getClass(), "format", term220537);
        setField(term221186, term221186.getClass(), "headerMap", term221187);
        setCharField(term221193, term221193.getClass(), "delimiter", (char) 0);
        setCharField(term221193, term221193.getClass(), "escape", (char) 0);
        setCharField(term221193, term221193.getClass(), "quoteChar", (char) 0);
        setCharField(term221193, term221193.getClass(), "commentStart", (char) 0);
        setBooleanField(term221193, term221193.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term221193, term221193.getClass(), "ignoreEmptyLines", true);
        setIntField(term221200, term221200.getClass(), "lastChar", -1);
        setLongField(term221200, term221200.getClass(), "eolCounter", 0L);
        setLongField(term221200, term221200.getClass(), "position", 1L);
        setBooleanField(term221200, term221200.getClass(), "closed", false);
        setField(term221205, term221205.getClass(), "str", "");
        setIntField(term221205, term221205.getClass(), "length", 0);
        setIntField(term221205, term221205.getClass(), "next", 0);
        setIntField(term221205, term221205.getClass(), "mark", 0);
        setField(term221205, term221205.getClass(), "lock", term221205);
        setField(term221205, term221205.getClass(), "skipBuffer", null);
        setField(term221200, term221200.getClass(), "in", term221205);
        setField(term221200, term221200.getClass(), "cb", term221210);
        setIntField(term221200, term221200.getClass(), "nChars", 0);
        setIntField(term221200, term221200.getClass(), "nextChar", 0);
        setIntField(term221200, term221200.getClass(), "markedChar", -1);
        setIntField(term221200, term221200.getClass(), "readAheadLimit", 0);
        setBooleanField(term221200, term221200.getClass(), "skipLF", false);
        setBooleanField(term221200, term221200.getClass(), "markedSkipLF", false);
        setField(term221200, term221200.getClass(), "lock", term221205);
        setField(term221200, term221200.getClass(), "skipBuffer", null);
        setField(term221193, term221193.getClass(), "reader", term221200);
        setField(term221193, term221193.getClass(), "firstEol", null);
        setField(term221186, term221186.getClass(), "lexer", term221193);
        setField(term221186, term221186.getClass(), "recordList", term221249);
        setLongField(term221186, term221186.getClass(), "recordNumber", 0L);
        setLongField(term221186, term221186.getClass(), "characterOffset", 0L);
        setField(term221255, term221255.getClass(), "type", enum89);
        setField(term221263, term221263.getClass(), "value", term221264);
        setByteField(term221263, term221263.getClass(), "coder", (byte) 0);
        setIntField(term221263, term221263.getClass(), "count", 0);
        setField(term221255, term221255.getClass(), "content", term221263);
        setBooleanField(term221255, term221255.getClass(), "isReady", false);
        setField(term221186, term221186.getClass(), "reusableToken", term221255);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("org.apache.commons.csv.CSVFormat");
        Object[] args = new Object[2];
        args[0] = "";
        args[1] = term220368;
        Object retValue = callMethod(klass, "parse", argTypes, null, args);
        assertTrue(recursiveEquals(term220368, term221330));
        assertTrue(recursiveEquals(retValue, term221186));
    }

};


