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

public class CSVParser_parse_156507206497 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term299787;
     Object term300531;
     Object term300418;

    public CSVParser_parse_156507206497() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term299839 = new Character((char) 0);
        Character term299891 = new Character((char) 0);
        Character term299943 = new Character((char) 0);
        term299787 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term296842 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term299787, term299787.getClass(), "delimiter", (char) 0);
        setField(term299787, term299787.getClass(), "escapeCharacter", term299839);
        setField(term299787, term299787.getClass(), "quoteCharacter", term299891);
        setField(term299787, term299787.getClass(), "commentMarker", term299943);
        setBooleanField(term299787, term299787.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term299787, term299787.getClass(), "ignoreEmptyLines", false);
        setField(term299787, term299787.getClass(), "header", term296842);
        setBooleanField(term299787, term299787.getClass(), "ignoreHeaderCase", false);
        setIntField(null, Class.forName("java.io.BufferedReader"), "defaultCharBufferSize", 1);
        Character term300532 = new Character((char) 0);
        Character term300533 = new Character((char) 0);
        Character term300535 = new Character((char) 0);
        term300531 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term300534 = (Object[]) newArray("java.lang.String", 0);
        setBooleanField(term300531, term300531.getClass(), "allowMissingColumnNames", false);
        setField(term300531, term300531.getClass(), "commentMarker", term300532);
        setCharField(term300531, term300531.getClass(), "delimiter", (char) 0);
        setField(term300531, term300531.getClass(), "escapeCharacter", term300533);
        setField(term300531, term300531.getClass(), "header", term300534);
        setField(term300531, term300531.getClass(), "headerComments", null);
        setBooleanField(term300531, term300531.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term300531, term300531.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term300531, term300531.getClass(), "ignoreSurroundingSpaces", false);
        setField(term300531, term300531.getClass(), "nullString", null);
        setField(term300531, term300531.getClass(), "quoteCharacter", term300535);
        setField(term300531, term300531.getClass(), "quoteMode", null);
        setField(term300531, term300531.getClass(), "recordSeparator", null);
        setBooleanField(term300531, term300531.getClass(), "skipHeaderRecord", false);
        setBooleanField(term300531, term300531.getClass(), "trailingDelimiter", false);
        setBooleanField(term300531, term300531.getClass(), "trim", false);
        setBooleanField(term300531, term300531.getClass(), "autoFlush", false);
        Character term299958 = new Character((char) 0);
        Character term299961 = new Character((char) 0);
        Character term299967 = new Character((char) 0);
        LinkedHashMap term300419 = new LinkedHashMap();
        ArrayList term300450 = new ArrayList();
        Class<? extends Object> term300538 = Class.forName((String) "org.apache.commons.csv.Token$Type");
        Field term300537 = ((Class) term300538).getDeclaredField((String) "EOF");
        ((Field) term300537).setAccessible(true);
        Object enum100 = ((Field) term300537).get((Object) null);
        term300418 = newInstance(Class.forName("org.apache.commons.csv.CSVParser"));
        Object term299956 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term299963 = (Object[]) newArray("java.lang.String", 0);
        Object term300425 = newInstance(Class.forName("org.apache.commons.csv.Lexer"));
        Object term300432 = newInstance(Class.forName("org.apache.commons.csv.ExtendedBufferedReader"));
        Object term300437 = newInstance(Class.forName("java.io.StringReader"));
        char[] term300442 = (char[]) newCharArray(1);
        Object term300456 = newInstance(Class.forName("org.apache.commons.csv.Token"));
        Object term300464 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term300465 = (byte[]) newByteArray(50);
        setBooleanField(term299956, term299956.getClass(), "allowMissingColumnNames", false);
        setField(term299956, term299956.getClass(), "commentMarker", term299958);
        setCharField(term299956, term299956.getClass(), "delimiter", (char) 0);
        setField(term299956, term299956.getClass(), "escapeCharacter", term299961);
        setField(term299956, term299956.getClass(), "header", term299963);
        setField(term299956, term299956.getClass(), "headerComments", null);
        setBooleanField(term299956, term299956.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term299956, term299956.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term299956, term299956.getClass(), "ignoreSurroundingSpaces", false);
        setField(term299956, term299956.getClass(), "nullString", null);
        setField(term299956, term299956.getClass(), "quoteCharacter", term299967);
        setField(term299956, term299956.getClass(), "quoteMode", null);
        setField(term299956, term299956.getClass(), "recordSeparator", null);
        setBooleanField(term299956, term299956.getClass(), "skipHeaderRecord", false);
        setBooleanField(term299956, term299956.getClass(), "trailingDelimiter", false);
        setBooleanField(term299956, term299956.getClass(), "trim", false);
        setBooleanField(term299956, term299956.getClass(), "autoFlush", false);
        setField(term300418, term300418.getClass(), "format", term299956);
        setField(term300418, term300418.getClass(), "headerMap", term300419);
        setCharField(term300425, term300425.getClass(), "delimiter", (char) 0);
        setCharField(term300425, term300425.getClass(), "escape", (char) 0);
        setCharField(term300425, term300425.getClass(), "quoteChar", (char) 0);
        setCharField(term300425, term300425.getClass(), "commentStart", (char) 0);
        setBooleanField(term300425, term300425.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term300425, term300425.getClass(), "ignoreEmptyLines", false);
        setIntField(term300432, term300432.getClass(), "lastChar", -1);
        setLongField(term300432, term300432.getClass(), "eolCounter", 0L);
        setLongField(term300432, term300432.getClass(), "position", 1L);
        setBooleanField(term300432, term300432.getClass(), "closed", false);
        setField(term300437, term300437.getClass(), "str", "");
        setIntField(term300437, term300437.getClass(), "length", 0);
        setIntField(term300437, term300437.getClass(), "next", 0);
        setIntField(term300437, term300437.getClass(), "mark", 0);
        setField(term300437, term300437.getClass(), "lock", term300437);
        setField(term300437, term300437.getClass(), "skipBuffer", null);
        setField(term300432, term300432.getClass(), "in", term300437);
        setField(term300432, term300432.getClass(), "cb", term300442);
        setIntField(term300432, term300432.getClass(), "nChars", 0);
        setIntField(term300432, term300432.getClass(), "nextChar", 0);
        setIntField(term300432, term300432.getClass(), "markedChar", -1);
        setIntField(term300432, term300432.getClass(), "readAheadLimit", 0);
        setBooleanField(term300432, term300432.getClass(), "skipLF", false);
        setBooleanField(term300432, term300432.getClass(), "markedSkipLF", false);
        setField(term300432, term300432.getClass(), "lock", term300437);
        setField(term300432, term300432.getClass(), "skipBuffer", null);
        setField(term300425, term300425.getClass(), "reader", term300432);
        setField(term300425, term300425.getClass(), "firstEol", null);
        setField(term300418, term300418.getClass(), "lexer", term300425);
        setField(term300418, term300418.getClass(), "recordList", term300450);
        setLongField(term300418, term300418.getClass(), "recordNumber", 0L);
        setLongField(term300418, term300418.getClass(), "characterOffset", 0L);
        setField(term300456, term300456.getClass(), "type", enum100);
        setField(term300464, term300464.getClass(), "value", term300465);
        setByteField(term300464, term300464.getClass(), "coder", (byte) 0);
        setIntField(term300464, term300464.getClass(), "count", 0);
        setField(term300456, term300456.getClass(), "content", term300464);
        setBooleanField(term300456, term300456.getClass(), "isReady", false);
        setField(term300418, term300418.getClass(), "reusableToken", term300456);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("org.apache.commons.csv.CSVFormat");
        Object[] args = new Object[2];
        args[0] = "";
        args[1] = term299787;
        Object retValue = callMethod(klass, "parse", argTypes, null, args);
        assertTrue(recursiveEquals(term299787, term300531));
        assertTrue(recursiveEquals(retValue, term300418));
    }

};


