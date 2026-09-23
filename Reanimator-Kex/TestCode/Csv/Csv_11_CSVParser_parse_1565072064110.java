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

public class CSVParser_parse_1565072064110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term299475;
     Object term302502;
     Object term302330;

    public CSVParser_parse_1565072064110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term299527 = new Character((char) 0);
        Character term299579 = new Character((char) 0);
        term299475 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term298570 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term299475, term299475.getClass(), "delimiter", (char) 0);
        setField(term299475, term299475.getClass(), "escape", term299527);
        setField(term299475, term299475.getClass(), "quoteChar", term299579);
        setField(term299475, term299475.getClass(), "commentStart", term299579);
        setBooleanField(term299475, term299475.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term299475, term299475.getClass(), "ignoreEmptyLines", true);
        setField(term299475, term299475.getClass(), "header", term298570);
        setBooleanField(term299475, term299475.getClass(), "skipHeaderRecord", true);
        setIntField(null, Class.forName("java.io.BufferedReader"), "defaultCharBufferSize", 64);
        Character term302503 = new Character((char) 0);
        Character term302504 = new Character((char) 0);
        Character term302505 = new Character((char) 0);
        term302502 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term302506 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term302502, term302502.getClass(), "delimiter", (char) 0);
        setField(term302502, term302502.getClass(), "quoteChar", term302503);
        setField(term302502, term302502.getClass(), "quotePolicy", null);
        setField(term302502, term302502.getClass(), "commentStart", term302504);
        setField(term302502, term302502.getClass(), "escape", term302505);
        setBooleanField(term302502, term302502.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term302502, term302502.getClass(), "ignoreEmptyHeaders", false);
        setBooleanField(term302502, term302502.getClass(), "ignoreEmptyLines", true);
        setField(term302502, term302502.getClass(), "recordSeparator", null);
        setField(term302502, term302502.getClass(), "nullString", null);
        setField(term302502, term302502.getClass(), "header", term302506);
        setBooleanField(term302502, term302502.getClass(), "skipHeaderRecord", true);
        Character term301698 = new Character((char) 0);
        Character term301700 = new Character((char) 0);
        Character term301702 = new Character((char) 0);
        LinkedHashMap term302331 = new LinkedHashMap();
        ArrayList term302424 = new ArrayList();
        Class<? extends Object> term302572 = Class.forName((String) "org.apache.commons.csv.Token$Type");
        Field term302571 = ((Class) term302572).getDeclaredField((String) "EOF");
        ((Field) term302571).setAccessible(true);
        Object enum101 = ((Field) term302571).get((Object) null);
        term302330 = newInstance(Class.forName("org.apache.commons.csv.CSVParser"));
        Object term301696 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term301707 = (Object[]) newArray("java.lang.String", 0);
        Object term302337 = newInstance(Class.forName("org.apache.commons.csv.Lexer"));
        Object term302344 = newInstance(Class.forName("org.apache.commons.csv.ExtendedBufferedReader"));
        Object term302348 = newInstance(Class.forName("java.io.StringReader"));
        char[] term302353 = (char[]) newCharArray(64);
        Object term302429 = newInstance(Class.forName("org.apache.commons.csv.Token"));
        Object term302437 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term302438 = (byte[]) newByteArray(50);
        setCharField(term301696, term301696.getClass(), "delimiter", (char) 0);
        setField(term301696, term301696.getClass(), "quoteChar", term301698);
        setField(term301696, term301696.getClass(), "quotePolicy", null);
        setField(term301696, term301696.getClass(), "commentStart", term301700);
        setField(term301696, term301696.getClass(), "escape", term301702);
        setBooleanField(term301696, term301696.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term301696, term301696.getClass(), "ignoreEmptyHeaders", false);
        setBooleanField(term301696, term301696.getClass(), "ignoreEmptyLines", true);
        setField(term301696, term301696.getClass(), "recordSeparator", null);
        setField(term301696, term301696.getClass(), "nullString", null);
        setField(term301696, term301696.getClass(), "header", term301707);
        setBooleanField(term301696, term301696.getClass(), "skipHeaderRecord", true);
        setField(term302330, term302330.getClass(), "format", term301696);
        setField(term302330, term302330.getClass(), "headerMap", term302331);
        setCharField(term302337, term302337.getClass(), "delimiter", (char) 0);
        setCharField(term302337, term302337.getClass(), "escape", (char) 0);
        setCharField(term302337, term302337.getClass(), "quoteChar", (char) 0);
        setCharField(term302337, term302337.getClass(), "commentStart", (char) 0);
        setBooleanField(term302337, term302337.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term302337, term302337.getClass(), "ignoreEmptyLines", true);
        setIntField(term302344, term302344.getClass(), "lastChar", -1);
        setLongField(term302344, term302344.getClass(), "eolCounter", 0L);
        setBooleanField(term302344, term302344.getClass(), "closed", false);
        setField(term302348, term302348.getClass(), "str", "");
        setIntField(term302348, term302348.getClass(), "length", 0);
        setIntField(term302348, term302348.getClass(), "next", 0);
        setIntField(term302348, term302348.getClass(), "mark", 0);
        setField(term302348, term302348.getClass(), "lock", term302348);
        setField(term302348, term302348.getClass(), "skipBuffer", null);
        setField(term302344, term302344.getClass(), "in", term302348);
        setField(term302344, term302344.getClass(), "cb", term302353);
        setIntField(term302344, term302344.getClass(), "nChars", 0);
        setIntField(term302344, term302344.getClass(), "nextChar", 0);
        setIntField(term302344, term302344.getClass(), "markedChar", -1);
        setIntField(term302344, term302344.getClass(), "readAheadLimit", 0);
        setBooleanField(term302344, term302344.getClass(), "skipLF", false);
        setBooleanField(term302344, term302344.getClass(), "markedSkipLF", false);
        setField(term302344, term302344.getClass(), "lock", term302348);
        setField(term302344, term302344.getClass(), "skipBuffer", null);
        setField(term302337, term302337.getClass(), "reader", term302344);
        setField(term302330, term302330.getClass(), "lexer", term302337);
        setField(term302330, term302330.getClass(), "record", term302424);
        setLongField(term302330, term302330.getClass(), "recordNumber", 0L);
        setField(term302429, term302429.getClass(), "type", enum101);
        setField(term302437, term302437.getClass(), "value", term302438);
        setByteField(term302437, term302437.getClass(), "coder", (byte) 0);
        setIntField(term302437, term302437.getClass(), "count", 0);
        setField(term302429, term302429.getClass(), "content", term302437);
        setBooleanField(term302429, term302429.getClass(), "isReady", false);
        setField(term302330, term302330.getClass(), "reusableToken", term302429);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("org.apache.commons.csv.CSVFormat");
        Object[] args = new Object[2];
        args[0] = "";
        args[1] = term299475;
        Object retValue = callMethod(klass, "parse", argTypes, null, args);
        assertTrue(recursiveEquals(term299475, term302502));
        assertTrue(recursiveEquals(retValue, term302330));
    }

};


