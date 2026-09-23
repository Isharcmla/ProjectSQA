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

public class CSVParser_parse_156507206473 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term247430;
     Object term248391;
     Object term248247;

    public CSVParser_parse_156507206473() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term247482 = new Character((char) 0);
        Character term247534 = new Character((char) 0);
        Character term247586 = new Character((char) 0);
        term247430 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term246104 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term247430, term247430.getClass(), "delimiter", (char) 0);
        setField(term247430, term247430.getClass(), "escapeCharacter", term247482);
        setField(term247430, term247430.getClass(), "quoteCharacter", term247534);
        setField(term247430, term247430.getClass(), "commentMarker", term247586);
        setBooleanField(term247430, term247430.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term247430, term247430.getClass(), "ignoreEmptyLines", false);
        setField(term247430, term247430.getClass(), "header", term246104);
        setBooleanField(term247430, term247430.getClass(), "ignoreHeaderCase", false);
        setIntField(null, Class.forName("java.io.BufferedReader"), "defaultCharBufferSize", 32);
        Character term248392 = new Character((char) 0);
        Character term248393 = new Character((char) 0);
        Character term248395 = new Character((char) 0);
        term248391 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term248394 = (Object[]) newArray("java.lang.String", 0);
        setBooleanField(term248391, term248391.getClass(), "allowMissingColumnNames", false);
        setField(term248391, term248391.getClass(), "commentMarker", term248392);
        setCharField(term248391, term248391.getClass(), "delimiter", (char) 0);
        setField(term248391, term248391.getClass(), "escapeCharacter", term248393);
        setField(term248391, term248391.getClass(), "header", term248394);
        setField(term248391, term248391.getClass(), "headerComments", null);
        setBooleanField(term248391, term248391.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term248391, term248391.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term248391, term248391.getClass(), "ignoreSurroundingSpaces", false);
        setField(term248391, term248391.getClass(), "nullString", null);
        setField(term248391, term248391.getClass(), "quoteCharacter", term248395);
        setField(term248391, term248391.getClass(), "quoteMode", null);
        setField(term248391, term248391.getClass(), "recordSeparator", null);
        setBooleanField(term248391, term248391.getClass(), "skipHeaderRecord", false);
        setBooleanField(term248391, term248391.getClass(), "trailingDelimiter", false);
        setBooleanField(term248391, term248391.getClass(), "trim", false);
        setBooleanField(term248391, term248391.getClass(), "autoFlush", false);
        Character term247601 = new Character((char) 0);
        Character term247604 = new Character((char) 0);
        Character term247610 = new Character((char) 0);
        LinkedHashMap term248248 = new LinkedHashMap();
        ArrayList term248310 = new ArrayList();
        Class<? extends Object> term248429 = Class.forName((String) "org.apache.commons.csv.Token$Type");
        Field term248428 = ((Class) term248429).getDeclaredField((String) "EOF");
        ((Field) term248428).setAccessible(true);
        Object enum92 = ((Field) term248428).get((Object) null);
        term248247 = newInstance(Class.forName("org.apache.commons.csv.CSVParser"));
        Object term247599 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term247606 = (Object[]) newArray("java.lang.String", 0);
        Object term248254 = newInstance(Class.forName("org.apache.commons.csv.Lexer"));
        Object term248261 = newInstance(Class.forName("org.apache.commons.csv.ExtendedBufferedReader"));
        Object term248266 = newInstance(Class.forName("java.io.StringReader"));
        char[] term248271 = (char[]) newCharArray(32);
        Object term248316 = newInstance(Class.forName("org.apache.commons.csv.Token"));
        Object term248324 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term248325 = (byte[]) newByteArray(50);
        setBooleanField(term247599, term247599.getClass(), "allowMissingColumnNames", false);
        setField(term247599, term247599.getClass(), "commentMarker", term247601);
        setCharField(term247599, term247599.getClass(), "delimiter", (char) 0);
        setField(term247599, term247599.getClass(), "escapeCharacter", term247604);
        setField(term247599, term247599.getClass(), "header", term247606);
        setField(term247599, term247599.getClass(), "headerComments", null);
        setBooleanField(term247599, term247599.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term247599, term247599.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term247599, term247599.getClass(), "ignoreSurroundingSpaces", false);
        setField(term247599, term247599.getClass(), "nullString", null);
        setField(term247599, term247599.getClass(), "quoteCharacter", term247610);
        setField(term247599, term247599.getClass(), "quoteMode", null);
        setField(term247599, term247599.getClass(), "recordSeparator", null);
        setBooleanField(term247599, term247599.getClass(), "skipHeaderRecord", false);
        setBooleanField(term247599, term247599.getClass(), "trailingDelimiter", false);
        setBooleanField(term247599, term247599.getClass(), "trim", false);
        setBooleanField(term247599, term247599.getClass(), "autoFlush", false);
        setField(term248247, term248247.getClass(), "format", term247599);
        setField(term248247, term248247.getClass(), "headerMap", term248248);
        setCharField(term248254, term248254.getClass(), "delimiter", (char) 0);
        setCharField(term248254, term248254.getClass(), "escape", (char) 0);
        setCharField(term248254, term248254.getClass(), "quoteChar", (char) 0);
        setCharField(term248254, term248254.getClass(), "commentStart", (char) 0);
        setBooleanField(term248254, term248254.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term248254, term248254.getClass(), "ignoreEmptyLines", false);
        setIntField(term248261, term248261.getClass(), "lastChar", -1);
        setLongField(term248261, term248261.getClass(), "eolCounter", 0L);
        setLongField(term248261, term248261.getClass(), "position", 1L);
        setBooleanField(term248261, term248261.getClass(), "closed", false);
        setField(term248266, term248266.getClass(), "str", "");
        setIntField(term248266, term248266.getClass(), "length", 0);
        setIntField(term248266, term248266.getClass(), "next", 0);
        setIntField(term248266, term248266.getClass(), "mark", 0);
        setField(term248266, term248266.getClass(), "lock", term248266);
        setField(term248266, term248266.getClass(), "skipBuffer", null);
        setField(term248261, term248261.getClass(), "in", term248266);
        setField(term248261, term248261.getClass(), "cb", term248271);
        setIntField(term248261, term248261.getClass(), "nChars", 0);
        setIntField(term248261, term248261.getClass(), "nextChar", 0);
        setIntField(term248261, term248261.getClass(), "markedChar", -1);
        setIntField(term248261, term248261.getClass(), "readAheadLimit", 0);
        setBooleanField(term248261, term248261.getClass(), "skipLF", false);
        setBooleanField(term248261, term248261.getClass(), "markedSkipLF", false);
        setField(term248261, term248261.getClass(), "lock", term248266);
        setField(term248261, term248261.getClass(), "skipBuffer", null);
        setField(term248254, term248254.getClass(), "reader", term248261);
        setField(term248254, term248254.getClass(), "firstEol", null);
        setField(term248247, term248247.getClass(), "lexer", term248254);
        setField(term248247, term248247.getClass(), "recordList", term248310);
        setLongField(term248247, term248247.getClass(), "recordNumber", 0L);
        setLongField(term248247, term248247.getClass(), "characterOffset", 0L);
        setField(term248316, term248316.getClass(), "type", enum92);
        setField(term248324, term248324.getClass(), "value", term248325);
        setByteField(term248324, term248324.getClass(), "coder", (byte) 0);
        setIntField(term248324, term248324.getClass(), "count", 0);
        setField(term248316, term248316.getClass(), "content", term248324);
        setBooleanField(term248316, term248316.getClass(), "isReady", false);
        setField(term248247, term248247.getClass(), "reusableToken", term248316);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("org.apache.commons.csv.CSVFormat");
        Object[] args = new Object[2];
        args[0] = "";
        args[1] = term247430;
        Object retValue = callMethod(klass, "parse", argTypes, null, args);
        assertTrue(recursiveEquals(term247430, term248391));
        assertTrue(recursiveEquals(retValue, term248247));
    }

};


