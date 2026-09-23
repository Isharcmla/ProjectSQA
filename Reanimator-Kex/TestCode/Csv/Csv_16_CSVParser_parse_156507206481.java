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

public class CSVParser_parse_156507206481 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term260733;
     Object term261478;
     Object term261365;

    public CSVParser_parse_156507206481() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term260785 = new Character((char) 0);
        Character term260837 = new Character((char) 0);
        Character term260889 = new Character((char) 0);
        term260733 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term257787 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term260733, term260733.getClass(), "delimiter", (char) 0);
        setField(term260733, term260733.getClass(), "escapeCharacter", term260785);
        setField(term260733, term260733.getClass(), "quoteCharacter", term260837);
        setField(term260733, term260733.getClass(), "commentMarker", term260889);
        setBooleanField(term260733, term260733.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term260733, term260733.getClass(), "ignoreEmptyLines", true);
        setField(term260733, term260733.getClass(), "header", term257787);
        setBooleanField(term260733, term260733.getClass(), "ignoreHeaderCase", false);
        setIntField(null, Class.forName("java.io.BufferedReader"), "defaultCharBufferSize", 1);
        Character term261479 = new Character((char) 0);
        Character term261480 = new Character((char) 0);
        Character term261482 = new Character((char) 0);
        term261478 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term261481 = (Object[]) newArray("java.lang.String", 0);
        setBooleanField(term261478, term261478.getClass(), "allowMissingColumnNames", false);
        setField(term261478, term261478.getClass(), "commentMarker", term261479);
        setCharField(term261478, term261478.getClass(), "delimiter", (char) 0);
        setField(term261478, term261478.getClass(), "escapeCharacter", term261480);
        setField(term261478, term261478.getClass(), "header", term261481);
        setField(term261478, term261478.getClass(), "headerComments", null);
        setBooleanField(term261478, term261478.getClass(), "ignoreEmptyLines", true);
        setBooleanField(term261478, term261478.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term261478, term261478.getClass(), "ignoreSurroundingSpaces", false);
        setField(term261478, term261478.getClass(), "nullString", null);
        setField(term261478, term261478.getClass(), "quoteCharacter", term261482);
        setField(term261478, term261478.getClass(), "quoteMode", null);
        setField(term261478, term261478.getClass(), "recordSeparator", null);
        setBooleanField(term261478, term261478.getClass(), "skipHeaderRecord", false);
        setBooleanField(term261478, term261478.getClass(), "trailingDelimiter", false);
        setBooleanField(term261478, term261478.getClass(), "trim", false);
        setBooleanField(term261478, term261478.getClass(), "autoFlush", false);
        Character term260904 = new Character((char) 0);
        Character term260907 = new Character((char) 0);
        Character term260913 = new Character((char) 0);
        LinkedHashMap term261366 = new LinkedHashMap();
        ArrayList term261397 = new ArrayList();
        Class<? extends Object> term261485 = Class.forName((String) "org.apache.commons.csv.Token$Type");
        Field term261484 = ((Class) term261485).getDeclaredField((String) "EOF");
        ((Field) term261484).setAccessible(true);
        Object enum94 = ((Field) term261484).get((Object) null);
        term261365 = newInstance(Class.forName("org.apache.commons.csv.CSVParser"));
        Object term260902 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term260909 = (Object[]) newArray("java.lang.String", 0);
        Object term261372 = newInstance(Class.forName("org.apache.commons.csv.Lexer"));
        Object term261379 = newInstance(Class.forName("org.apache.commons.csv.ExtendedBufferedReader"));
        Object term261384 = newInstance(Class.forName("java.io.StringReader"));
        char[] term261389 = (char[]) newCharArray(1);
        Object term261403 = newInstance(Class.forName("org.apache.commons.csv.Token"));
        Object term261411 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term261412 = (byte[]) newByteArray(50);
        setBooleanField(term260902, term260902.getClass(), "allowMissingColumnNames", false);
        setField(term260902, term260902.getClass(), "commentMarker", term260904);
        setCharField(term260902, term260902.getClass(), "delimiter", (char) 0);
        setField(term260902, term260902.getClass(), "escapeCharacter", term260907);
        setField(term260902, term260902.getClass(), "header", term260909);
        setField(term260902, term260902.getClass(), "headerComments", null);
        setBooleanField(term260902, term260902.getClass(), "ignoreEmptyLines", true);
        setBooleanField(term260902, term260902.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term260902, term260902.getClass(), "ignoreSurroundingSpaces", false);
        setField(term260902, term260902.getClass(), "nullString", null);
        setField(term260902, term260902.getClass(), "quoteCharacter", term260913);
        setField(term260902, term260902.getClass(), "quoteMode", null);
        setField(term260902, term260902.getClass(), "recordSeparator", null);
        setBooleanField(term260902, term260902.getClass(), "skipHeaderRecord", false);
        setBooleanField(term260902, term260902.getClass(), "trailingDelimiter", false);
        setBooleanField(term260902, term260902.getClass(), "trim", false);
        setBooleanField(term260902, term260902.getClass(), "autoFlush", false);
        setField(term261365, term261365.getClass(), "format", term260902);
        setField(term261365, term261365.getClass(), "headerMap", term261366);
        setCharField(term261372, term261372.getClass(), "delimiter", (char) 0);
        setCharField(term261372, term261372.getClass(), "escape", (char) 0);
        setCharField(term261372, term261372.getClass(), "quoteChar", (char) 0);
        setCharField(term261372, term261372.getClass(), "commentStart", (char) 0);
        setBooleanField(term261372, term261372.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term261372, term261372.getClass(), "ignoreEmptyLines", true);
        setIntField(term261379, term261379.getClass(), "lastChar", -1);
        setLongField(term261379, term261379.getClass(), "eolCounter", 0L);
        setLongField(term261379, term261379.getClass(), "position", 1L);
        setBooleanField(term261379, term261379.getClass(), "closed", false);
        setField(term261384, term261384.getClass(), "str", "");
        setIntField(term261384, term261384.getClass(), "length", 0);
        setIntField(term261384, term261384.getClass(), "next", 0);
        setIntField(term261384, term261384.getClass(), "mark", 0);
        setField(term261384, term261384.getClass(), "lock", term261384);
        setField(term261384, term261384.getClass(), "skipBuffer", null);
        setField(term261379, term261379.getClass(), "in", term261384);
        setField(term261379, term261379.getClass(), "cb", term261389);
        setIntField(term261379, term261379.getClass(), "nChars", 0);
        setIntField(term261379, term261379.getClass(), "nextChar", 0);
        setIntField(term261379, term261379.getClass(), "markedChar", -1);
        setIntField(term261379, term261379.getClass(), "readAheadLimit", 0);
        setBooleanField(term261379, term261379.getClass(), "skipLF", false);
        setBooleanField(term261379, term261379.getClass(), "markedSkipLF", false);
        setField(term261379, term261379.getClass(), "lock", term261384);
        setField(term261379, term261379.getClass(), "skipBuffer", null);
        setField(term261372, term261372.getClass(), "reader", term261379);
        setField(term261372, term261372.getClass(), "firstEol", null);
        setField(term261365, term261365.getClass(), "lexer", term261372);
        setField(term261365, term261365.getClass(), "recordList", term261397);
        setLongField(term261365, term261365.getClass(), "recordNumber", 0L);
        setLongField(term261365, term261365.getClass(), "characterOffset", 0L);
        setField(term261403, term261403.getClass(), "type", enum94);
        setField(term261411, term261411.getClass(), "value", term261412);
        setByteField(term261411, term261411.getClass(), "coder", (byte) 0);
        setIntField(term261411, term261411.getClass(), "count", 0);
        setField(term261403, term261403.getClass(), "content", term261411);
        setBooleanField(term261403, term261403.getClass(), "isReady", false);
        setField(term261365, term261365.getClass(), "reusableToken", term261403);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("org.apache.commons.csv.CSVFormat");
        Object[] args = new Object[2];
        args[0] = "";
        args[1] = term260733;
        Object retValue = callMethod(klass, "parse", argTypes, null, args);
        assertTrue(recursiveEquals(term260733, term261478));
        assertTrue(recursiveEquals(retValue, term261365));
    }

};


