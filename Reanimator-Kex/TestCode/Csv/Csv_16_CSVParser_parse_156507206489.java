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

public class CSVParser_parse_156507206489 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term274335;
     Object term275079;
     Object term274966;

    public CSVParser_parse_156507206489() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term274387 = new Character((char) 0);
        Character term274439 = new Character((char) 0);
        Character term274491 = new Character((char) 0);
        term274335 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term271390 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term274335, term274335.getClass(), "delimiter", (char) 0);
        setField(term274335, term274335.getClass(), "escapeCharacter", term274387);
        setField(term274335, term274335.getClass(), "quoteCharacter", term274439);
        setField(term274335, term274335.getClass(), "commentMarker", term274491);
        setBooleanField(term274335, term274335.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term274335, term274335.getClass(), "ignoreEmptyLines", false);
        setField(term274335, term274335.getClass(), "header", term271390);
        setBooleanField(term274335, term274335.getClass(), "ignoreHeaderCase", false);
        setIntField(null, Class.forName("java.io.BufferedReader"), "defaultCharBufferSize", 1);
        Character term275080 = new Character((char) 0);
        Character term275081 = new Character((char) 0);
        Character term275083 = new Character((char) 0);
        term275079 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term275082 = (Object[]) newArray("java.lang.String", 0);
        setBooleanField(term275079, term275079.getClass(), "allowMissingColumnNames", false);
        setField(term275079, term275079.getClass(), "commentMarker", term275080);
        setCharField(term275079, term275079.getClass(), "delimiter", (char) 0);
        setField(term275079, term275079.getClass(), "escapeCharacter", term275081);
        setField(term275079, term275079.getClass(), "header", term275082);
        setField(term275079, term275079.getClass(), "headerComments", null);
        setBooleanField(term275079, term275079.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term275079, term275079.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term275079, term275079.getClass(), "ignoreSurroundingSpaces", false);
        setField(term275079, term275079.getClass(), "nullString", null);
        setField(term275079, term275079.getClass(), "quoteCharacter", term275083);
        setField(term275079, term275079.getClass(), "quoteMode", null);
        setField(term275079, term275079.getClass(), "recordSeparator", null);
        setBooleanField(term275079, term275079.getClass(), "skipHeaderRecord", false);
        setBooleanField(term275079, term275079.getClass(), "trailingDelimiter", false);
        setBooleanField(term275079, term275079.getClass(), "trim", false);
        setBooleanField(term275079, term275079.getClass(), "autoFlush", false);
        Character term274506 = new Character((char) 0);
        Character term274509 = new Character((char) 0);
        Character term274515 = new Character((char) 0);
        LinkedHashMap term274967 = new LinkedHashMap();
        ArrayList term274998 = new ArrayList();
        Class<? extends Object> term275086 = Class.forName((String) "org.apache.commons.csv.Token$Type");
        Field term275085 = ((Class) term275086).getDeclaredField((String) "EOF");
        ((Field) term275085).setAccessible(true);
        Object enum97 = ((Field) term275085).get((Object) null);
        term274966 = newInstance(Class.forName("org.apache.commons.csv.CSVParser"));
        Object term274504 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term274511 = (Object[]) newArray("java.lang.String", 0);
        Object term274973 = newInstance(Class.forName("org.apache.commons.csv.Lexer"));
        Object term274980 = newInstance(Class.forName("org.apache.commons.csv.ExtendedBufferedReader"));
        Object term274985 = newInstance(Class.forName("java.io.StringReader"));
        char[] term274990 = (char[]) newCharArray(1);
        Object term275004 = newInstance(Class.forName("org.apache.commons.csv.Token"));
        Object term275012 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term275013 = (byte[]) newByteArray(50);
        setBooleanField(term274504, term274504.getClass(), "allowMissingColumnNames", false);
        setField(term274504, term274504.getClass(), "commentMarker", term274506);
        setCharField(term274504, term274504.getClass(), "delimiter", (char) 0);
        setField(term274504, term274504.getClass(), "escapeCharacter", term274509);
        setField(term274504, term274504.getClass(), "header", term274511);
        setField(term274504, term274504.getClass(), "headerComments", null);
        setBooleanField(term274504, term274504.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term274504, term274504.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term274504, term274504.getClass(), "ignoreSurroundingSpaces", false);
        setField(term274504, term274504.getClass(), "nullString", null);
        setField(term274504, term274504.getClass(), "quoteCharacter", term274515);
        setField(term274504, term274504.getClass(), "quoteMode", null);
        setField(term274504, term274504.getClass(), "recordSeparator", null);
        setBooleanField(term274504, term274504.getClass(), "skipHeaderRecord", false);
        setBooleanField(term274504, term274504.getClass(), "trailingDelimiter", false);
        setBooleanField(term274504, term274504.getClass(), "trim", false);
        setBooleanField(term274504, term274504.getClass(), "autoFlush", false);
        setField(term274966, term274966.getClass(), "format", term274504);
        setField(term274966, term274966.getClass(), "headerMap", term274967);
        setCharField(term274973, term274973.getClass(), "delimiter", (char) 0);
        setCharField(term274973, term274973.getClass(), "escape", (char) 0);
        setCharField(term274973, term274973.getClass(), "quoteChar", (char) 0);
        setCharField(term274973, term274973.getClass(), "commentStart", (char) 0);
        setBooleanField(term274973, term274973.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term274973, term274973.getClass(), "ignoreEmptyLines", false);
        setIntField(term274980, term274980.getClass(), "lastChar", -1);
        setLongField(term274980, term274980.getClass(), "eolCounter", 0L);
        setLongField(term274980, term274980.getClass(), "position", 1L);
        setBooleanField(term274980, term274980.getClass(), "closed", false);
        setField(term274985, term274985.getClass(), "str", "");
        setIntField(term274985, term274985.getClass(), "length", 0);
        setIntField(term274985, term274985.getClass(), "next", 0);
        setIntField(term274985, term274985.getClass(), "mark", 0);
        setField(term274985, term274985.getClass(), "lock", term274985);
        setField(term274985, term274985.getClass(), "skipBuffer", null);
        setField(term274980, term274980.getClass(), "in", term274985);
        setField(term274980, term274980.getClass(), "cb", term274990);
        setIntField(term274980, term274980.getClass(), "nChars", 0);
        setIntField(term274980, term274980.getClass(), "nextChar", 0);
        setIntField(term274980, term274980.getClass(), "markedChar", -1);
        setIntField(term274980, term274980.getClass(), "readAheadLimit", 0);
        setBooleanField(term274980, term274980.getClass(), "skipLF", false);
        setBooleanField(term274980, term274980.getClass(), "markedSkipLF", false);
        setField(term274980, term274980.getClass(), "lock", term274985);
        setField(term274980, term274980.getClass(), "skipBuffer", null);
        setField(term274973, term274973.getClass(), "reader", term274980);
        setField(term274973, term274973.getClass(), "firstEol", null);
        setField(term274966, term274966.getClass(), "lexer", term274973);
        setField(term274966, term274966.getClass(), "recordList", term274998);
        setLongField(term274966, term274966.getClass(), "recordNumber", 0L);
        setLongField(term274966, term274966.getClass(), "characterOffset", 0L);
        setField(term275004, term275004.getClass(), "type", enum97);
        setField(term275012, term275012.getClass(), "value", term275013);
        setByteField(term275012, term275012.getClass(), "coder", (byte) 0);
        setIntField(term275012, term275012.getClass(), "count", 0);
        setField(term275004, term275004.getClass(), "content", term275012);
        setBooleanField(term275004, term275004.getClass(), "isReady", false);
        setField(term274966, term274966.getClass(), "reusableToken", term275004);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("org.apache.commons.csv.CSVFormat");
        Object[] args = new Object[2];
        args[0] = "";
        args[1] = term274335;
        Object retValue = callMethod(klass, "parse", argTypes, null, args);
        assertTrue(recursiveEquals(term274335, term275079));
        assertTrue(recursiveEquals(retValue, term274966));
    }

};


