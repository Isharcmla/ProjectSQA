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
     Object term267299;
     Object term268594;
     Object term268358;

    public CSVParser_parse_156507206489() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term267351 = new Character((char) 0);
        Character term267403 = new Character((char) 0);
        Character term267455 = new Character((char) 0);
        term267299 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term265719 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term267299, term267299.getClass(), "delimiter", (char) 0);
        setField(term267299, term267299.getClass(), "escape", term267351);
        setField(term267299, term267299.getClass(), "quoteChar", term267403);
        setField(term267299, term267299.getClass(), "commentStart", term267455);
        setBooleanField(term267299, term267299.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term267299, term267299.getClass(), "ignoreEmptyLines", true);
        setField(term267299, term267299.getClass(), "header", term265719);
        setBooleanField(term267299, term267299.getClass(), "skipHeaderRecord", true);
        setIntField(null, Class.forName("java.io.BufferedReader"), "defaultCharBufferSize", 128);
        Character term268595 = new Character((char) 0);
        Character term268596 = new Character((char) 0);
        Character term268597 = new Character((char) 0);
        term268594 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term268598 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term268594, term268594.getClass(), "delimiter", (char) 0);
        setField(term268594, term268594.getClass(), "quoteChar", term268595);
        setField(term268594, term268594.getClass(), "quotePolicy", null);
        setField(term268594, term268594.getClass(), "commentStart", term268596);
        setField(term268594, term268594.getClass(), "escape", term268597);
        setBooleanField(term268594, term268594.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term268594, term268594.getClass(), "ignoreEmptyHeaders", false);
        setBooleanField(term268594, term268594.getClass(), "ignoreEmptyLines", true);
        setField(term268594, term268594.getClass(), "recordSeparator", null);
        setField(term268594, term268594.getClass(), "nullString", null);
        setField(term268594, term268594.getClass(), "header", term268598);
        setBooleanField(term268594, term268594.getClass(), "skipHeaderRecord", true);
        Character term267470 = new Character((char) 0);
        Character term267472 = new Character((char) 0);
        Character term267474 = new Character((char) 0);
        LinkedHashMap term268359 = new LinkedHashMap();
        ArrayList term268516 = new ArrayList();
        Class<? extends Object> term268728 = Class.forName((String) "org.apache.commons.csv.Token$Type");
        Field term268727 = ((Class) term268728).getDeclaredField((String) "EOF");
        ((Field) term268727).setAccessible(true);
        Object enum92 = ((Field) term268727).get((Object) null);
        term268358 = newInstance(Class.forName("org.apache.commons.csv.CSVParser"));
        Object term267468 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term267479 = (Object[]) newArray("java.lang.String", 0);
        Object term268365 = newInstance(Class.forName("org.apache.commons.csv.Lexer"));
        Object term268372 = newInstance(Class.forName("org.apache.commons.csv.ExtendedBufferedReader"));
        Object term268376 = newInstance(Class.forName("java.io.StringReader"));
        char[] term268381 = (char[]) newCharArray(128);
        Object term268521 = newInstance(Class.forName("org.apache.commons.csv.Token"));
        Object term268529 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term268530 = (byte[]) newByteArray(50);
        setCharField(term267468, term267468.getClass(), "delimiter", (char) 0);
        setField(term267468, term267468.getClass(), "quoteChar", term267470);
        setField(term267468, term267468.getClass(), "quotePolicy", null);
        setField(term267468, term267468.getClass(), "commentStart", term267472);
        setField(term267468, term267468.getClass(), "escape", term267474);
        setBooleanField(term267468, term267468.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term267468, term267468.getClass(), "ignoreEmptyHeaders", false);
        setBooleanField(term267468, term267468.getClass(), "ignoreEmptyLines", true);
        setField(term267468, term267468.getClass(), "recordSeparator", null);
        setField(term267468, term267468.getClass(), "nullString", null);
        setField(term267468, term267468.getClass(), "header", term267479);
        setBooleanField(term267468, term267468.getClass(), "skipHeaderRecord", true);
        setField(term268358, term268358.getClass(), "format", term267468);
        setField(term268358, term268358.getClass(), "headerMap", term268359);
        setCharField(term268365, term268365.getClass(), "delimiter", (char) 0);
        setCharField(term268365, term268365.getClass(), "escape", (char) 0);
        setCharField(term268365, term268365.getClass(), "quoteChar", (char) 0);
        setCharField(term268365, term268365.getClass(), "commentStart", (char) 0);
        setBooleanField(term268365, term268365.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term268365, term268365.getClass(), "ignoreEmptyLines", true);
        setIntField(term268372, term268372.getClass(), "lastChar", -1);
        setLongField(term268372, term268372.getClass(), "eolCounter", 0L);
        setBooleanField(term268372, term268372.getClass(), "closed", false);
        setField(term268376, term268376.getClass(), "str", "");
        setIntField(term268376, term268376.getClass(), "length", 0);
        setIntField(term268376, term268376.getClass(), "next", 0);
        setIntField(term268376, term268376.getClass(), "mark", 0);
        setField(term268376, term268376.getClass(), "lock", term268376);
        setField(term268376, term268376.getClass(), "skipBuffer", null);
        setField(term268372, term268372.getClass(), "in", term268376);
        setField(term268372, term268372.getClass(), "cb", term268381);
        setIntField(term268372, term268372.getClass(), "nChars", 0);
        setIntField(term268372, term268372.getClass(), "nextChar", 0);
        setIntField(term268372, term268372.getClass(), "markedChar", -1);
        setIntField(term268372, term268372.getClass(), "readAheadLimit", 0);
        setBooleanField(term268372, term268372.getClass(), "skipLF", false);
        setBooleanField(term268372, term268372.getClass(), "markedSkipLF", false);
        setField(term268372, term268372.getClass(), "lock", term268376);
        setField(term268372, term268372.getClass(), "skipBuffer", null);
        setField(term268365, term268365.getClass(), "reader", term268372);
        setField(term268358, term268358.getClass(), "lexer", term268365);
        setField(term268358, term268358.getClass(), "record", term268516);
        setLongField(term268358, term268358.getClass(), "recordNumber", 0L);
        setField(term268521, term268521.getClass(), "type", enum92);
        setField(term268529, term268529.getClass(), "value", term268530);
        setByteField(term268529, term268529.getClass(), "coder", (byte) 0);
        setIntField(term268529, term268529.getClass(), "count", 0);
        setField(term268521, term268521.getClass(), "content", term268529);
        setBooleanField(term268521, term268521.getClass(), "isReady", false);
        setField(term268358, term268358.getClass(), "reusableToken", term268521);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("org.apache.commons.csv.CSVFormat");
        Object[] args = new Object[2];
        args[0] = "";
        args[1] = term267299;
        Object retValue = callMethod(klass, "parse", argTypes, null, args);
        assertTrue(recursiveEquals(term267299, term268594));
        assertTrue(recursiveEquals(retValue, term268358));
    }

};


