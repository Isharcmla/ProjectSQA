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

public class CSVParser_parse_1565072064108 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term319000;
     Object term320070;
     Object term319954;

    public CSVParser_parse_1565072064108() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term319052 = new Character((char) 64479);
        Character term319104 = new Character((char) 16);
        Character term319156 = new Character((char) 512);
        term319000 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term316556 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term319000, term319000.getClass(), "delimiter", (char) 8);
        setField(term319000, term319000.getClass(), "escapeCharacter", term319052);
        setField(term319000, term319000.getClass(), "quoteCharacter", term319104);
        setField(term319000, term319000.getClass(), "commentMarker", term319156);
        setBooleanField(term319000, term319000.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term319000, term319000.getClass(), "ignoreEmptyLines", true);
        setField(term319000, term319000.getClass(), "header", term316556);
        setBooleanField(term319000, term319000.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term319000, term319000.getClass(), "skipHeaderRecord", true);
        setIntField(null, Class.forName("java.io.BufferedReader"), "defaultCharBufferSize", 4);
        Character term320071 = new Character((char) 512);
        Character term320072 = new Character((char) 64479);
        Character term320074 = new Character((char) 16);
        term320070 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term320073 = (Object[]) newArray("java.lang.String", 0);
        setBooleanField(term320070, term320070.getClass(), "allowMissingColumnNames", false);
        setField(term320070, term320070.getClass(), "commentMarker", term320071);
        setCharField(term320070, term320070.getClass(), "delimiter", (char) 8);
        setField(term320070, term320070.getClass(), "escapeCharacter", term320072);
        setField(term320070, term320070.getClass(), "header", term320073);
        setField(term320070, term320070.getClass(), "headerComments", null);
        setBooleanField(term320070, term320070.getClass(), "ignoreEmptyLines", true);
        setBooleanField(term320070, term320070.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term320070, term320070.getClass(), "ignoreSurroundingSpaces", true);
        setField(term320070, term320070.getClass(), "nullString", null);
        setField(term320070, term320070.getClass(), "quoteCharacter", term320074);
        setField(term320070, term320070.getClass(), "quoteMode", null);
        setField(term320070, term320070.getClass(), "recordSeparator", null);
        setBooleanField(term320070, term320070.getClass(), "skipHeaderRecord", true);
        setBooleanField(term320070, term320070.getClass(), "trailingDelimiter", false);
        setBooleanField(term320070, term320070.getClass(), "trim", false);
        setBooleanField(term320070, term320070.getClass(), "autoFlush", false);
        Character term319475 = new Character((char) 512);
        Character term319478 = new Character((char) 64479);
        Character term319484 = new Character((char) 16);
        LinkedHashMap term319955 = new LinkedHashMap();
        ArrayList term319989 = new ArrayList();
        Class<? extends Object> term320080 = Class.forName((String) "org.apache.commons.csv.Token$Type");
        Field term320079 = ((Class) term320080).getDeclaredField((String) "EOF");
        ((Field) term320079).setAccessible(true);
        Object enum104 = ((Field) term320079).get((Object) null);
        term319954 = newInstance(Class.forName("org.apache.commons.csv.CSVParser"));
        Object term319473 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term319480 = (Object[]) newArray("java.lang.String", 0);
        Object term319961 = newInstance(Class.forName("org.apache.commons.csv.Lexer"));
        Object term319968 = newInstance(Class.forName("org.apache.commons.csv.ExtendedBufferedReader"));
        Object term319973 = newInstance(Class.forName("java.io.StringReader"));
        char[] term319978 = (char[]) newCharArray(4);
        Object term319995 = newInstance(Class.forName("org.apache.commons.csv.Token"));
        Object term320003 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term320004 = (byte[]) newByteArray(50);
        setBooleanField(term319473, term319473.getClass(), "allowMissingColumnNames", false);
        setField(term319473, term319473.getClass(), "commentMarker", term319475);
        setCharField(term319473, term319473.getClass(), "delimiter", (char) 8);
        setField(term319473, term319473.getClass(), "escapeCharacter", term319478);
        setField(term319473, term319473.getClass(), "header", term319480);
        setField(term319473, term319473.getClass(), "headerComments", null);
        setBooleanField(term319473, term319473.getClass(), "ignoreEmptyLines", true);
        setBooleanField(term319473, term319473.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term319473, term319473.getClass(), "ignoreSurroundingSpaces", true);
        setField(term319473, term319473.getClass(), "nullString", null);
        setField(term319473, term319473.getClass(), "quoteCharacter", term319484);
        setField(term319473, term319473.getClass(), "quoteMode", null);
        setField(term319473, term319473.getClass(), "recordSeparator", null);
        setBooleanField(term319473, term319473.getClass(), "skipHeaderRecord", true);
        setBooleanField(term319473, term319473.getClass(), "trailingDelimiter", false);
        setBooleanField(term319473, term319473.getClass(), "trim", false);
        setBooleanField(term319473, term319473.getClass(), "autoFlush", false);
        setField(term319954, term319954.getClass(), "format", term319473);
        setField(term319954, term319954.getClass(), "headerMap", term319955);
        setCharField(term319961, term319961.getClass(), "delimiter", (char) 8);
        setCharField(term319961, term319961.getClass(), "escape", (char) 64479);
        setCharField(term319961, term319961.getClass(), "quoteChar", (char) 16);
        setCharField(term319961, term319961.getClass(), "commentStart", (char) 512);
        setBooleanField(term319961, term319961.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term319961, term319961.getClass(), "ignoreEmptyLines", true);
        setIntField(term319968, term319968.getClass(), "lastChar", -1);
        setLongField(term319968, term319968.getClass(), "eolCounter", 0L);
        setLongField(term319968, term319968.getClass(), "position", 1L);
        setBooleanField(term319968, term319968.getClass(), "closed", false);
        setField(term319973, term319973.getClass(), "str", "");
        setIntField(term319973, term319973.getClass(), "length", 0);
        setIntField(term319973, term319973.getClass(), "next", 0);
        setIntField(term319973, term319973.getClass(), "mark", 0);
        setField(term319973, term319973.getClass(), "lock", term319973);
        setField(term319973, term319973.getClass(), "skipBuffer", null);
        setField(term319968, term319968.getClass(), "in", term319973);
        setField(term319968, term319968.getClass(), "cb", term319978);
        setIntField(term319968, term319968.getClass(), "nChars", 0);
        setIntField(term319968, term319968.getClass(), "nextChar", 0);
        setIntField(term319968, term319968.getClass(), "markedChar", -1);
        setIntField(term319968, term319968.getClass(), "readAheadLimit", 0);
        setBooleanField(term319968, term319968.getClass(), "skipLF", false);
        setBooleanField(term319968, term319968.getClass(), "markedSkipLF", false);
        setField(term319968, term319968.getClass(), "lock", term319973);
        setField(term319968, term319968.getClass(), "skipBuffer", null);
        setField(term319961, term319961.getClass(), "reader", term319968);
        setField(term319961, term319961.getClass(), "firstEol", null);
        setField(term319954, term319954.getClass(), "lexer", term319961);
        setField(term319954, term319954.getClass(), "recordList", term319989);
        setLongField(term319954, term319954.getClass(), "recordNumber", 0L);
        setLongField(term319954, term319954.getClass(), "characterOffset", 0L);
        setField(term319995, term319995.getClass(), "type", enum104);
        setField(term320003, term320003.getClass(), "value", term320004);
        setByteField(term320003, term320003.getClass(), "coder", (byte) 0);
        setIntField(term320003, term320003.getClass(), "count", 0);
        setField(term319995, term319995.getClass(), "content", term320003);
        setBooleanField(term319995, term319995.getClass(), "isReady", false);
        setField(term319954, term319954.getClass(), "reusableToken", term319995);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("org.apache.commons.csv.CSVFormat");
        Object[] args = new Object[2];
        args[0] = "";
        args[1] = term319000;
        Object retValue = callMethod(klass, "parse", argTypes, null, args);
        assertTrue(recursiveEquals(term319000, term320070));
        assertTrue(recursiveEquals(retValue, term319954));
    }

};


