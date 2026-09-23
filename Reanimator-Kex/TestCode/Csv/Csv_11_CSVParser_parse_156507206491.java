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

public class CSVParser_parse_156507206491 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term269635;
     Object term270309;
     Object term270197;

    public CSVParser_parse_156507206491() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term269687 = new Character((char) 0);
        Character term269739 = new Character((char) 0);
        Character term269791 = new Character((char) 0);
        term269635 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term269388 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term269635, term269635.getClass(), "delimiter", (char) 0);
        setField(term269635, term269635.getClass(), "escape", term269687);
        setField(term269635, term269635.getClass(), "quoteChar", term269739);
        setField(term269635, term269635.getClass(), "commentStart", term269791);
        setBooleanField(term269635, term269635.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term269635, term269635.getClass(), "ignoreEmptyLines", false);
        setField(term269635, term269635.getClass(), "header", term269388);
        setBooleanField(term269635, term269635.getClass(), "skipHeaderRecord", false);
        setIntField(null, Class.forName("java.io.BufferedReader"), "defaultCharBufferSize", 4);
        Character term270310 = new Character((char) 0);
        Character term270311 = new Character((char) 0);
        Character term270312 = new Character((char) 0);
        term270309 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term270313 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term270309, term270309.getClass(), "delimiter", (char) 0);
        setField(term270309, term270309.getClass(), "quoteChar", term270310);
        setField(term270309, term270309.getClass(), "quotePolicy", null);
        setField(term270309, term270309.getClass(), "commentStart", term270311);
        setField(term270309, term270309.getClass(), "escape", term270312);
        setBooleanField(term270309, term270309.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term270309, term270309.getClass(), "ignoreEmptyHeaders", false);
        setBooleanField(term270309, term270309.getClass(), "ignoreEmptyLines", false);
        setField(term270309, term270309.getClass(), "recordSeparator", null);
        setField(term270309, term270309.getClass(), "nullString", null);
        setField(term270309, term270309.getClass(), "header", term270313);
        setBooleanField(term270309, term270309.getClass(), "skipHeaderRecord", false);
        Character term269806 = new Character((char) 0);
        Character term269808 = new Character((char) 0);
        Character term269810 = new Character((char) 0);
        LinkedHashMap term270198 = new LinkedHashMap();
        ArrayList term270231 = new ArrayList();
        Class<? extends Object> term270319 = Class.forName((String) "org.apache.commons.csv.Token$Type");
        Field term270318 = ((Class) term270319).getDeclaredField((String) "EOF");
        ((Field) term270318).setAccessible(true);
        Object enum93 = ((Field) term270318).get((Object) null);
        term270197 = newInstance(Class.forName("org.apache.commons.csv.CSVParser"));
        Object term269804 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term269815 = (Object[]) newArray("java.lang.String", 0);
        Object term270204 = newInstance(Class.forName("org.apache.commons.csv.Lexer"));
        Object term270211 = newInstance(Class.forName("org.apache.commons.csv.ExtendedBufferedReader"));
        Object term270215 = newInstance(Class.forName("java.io.StringReader"));
        char[] term270220 = (char[]) newCharArray(4);
        Object term270236 = newInstance(Class.forName("org.apache.commons.csv.Token"));
        Object term270244 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term270245 = (byte[]) newByteArray(50);
        setCharField(term269804, term269804.getClass(), "delimiter", (char) 0);
        setField(term269804, term269804.getClass(), "quoteChar", term269806);
        setField(term269804, term269804.getClass(), "quotePolicy", null);
        setField(term269804, term269804.getClass(), "commentStart", term269808);
        setField(term269804, term269804.getClass(), "escape", term269810);
        setBooleanField(term269804, term269804.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term269804, term269804.getClass(), "ignoreEmptyHeaders", false);
        setBooleanField(term269804, term269804.getClass(), "ignoreEmptyLines", false);
        setField(term269804, term269804.getClass(), "recordSeparator", null);
        setField(term269804, term269804.getClass(), "nullString", null);
        setField(term269804, term269804.getClass(), "header", term269815);
        setBooleanField(term269804, term269804.getClass(), "skipHeaderRecord", false);
        setField(term270197, term270197.getClass(), "format", term269804);
        setField(term270197, term270197.getClass(), "headerMap", term270198);
        setCharField(term270204, term270204.getClass(), "delimiter", (char) 0);
        setCharField(term270204, term270204.getClass(), "escape", (char) 0);
        setCharField(term270204, term270204.getClass(), "quoteChar", (char) 0);
        setCharField(term270204, term270204.getClass(), "commentStart", (char) 0);
        setBooleanField(term270204, term270204.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term270204, term270204.getClass(), "ignoreEmptyLines", false);
        setIntField(term270211, term270211.getClass(), "lastChar", -1);
        setLongField(term270211, term270211.getClass(), "eolCounter", 0L);
        setBooleanField(term270211, term270211.getClass(), "closed", false);
        setField(term270215, term270215.getClass(), "str", "");
        setIntField(term270215, term270215.getClass(), "length", 0);
        setIntField(term270215, term270215.getClass(), "next", 0);
        setIntField(term270215, term270215.getClass(), "mark", 0);
        setField(term270215, term270215.getClass(), "lock", term270215);
        setField(term270215, term270215.getClass(), "skipBuffer", null);
        setField(term270211, term270211.getClass(), "in", term270215);
        setField(term270211, term270211.getClass(), "cb", term270220);
        setIntField(term270211, term270211.getClass(), "nChars", 0);
        setIntField(term270211, term270211.getClass(), "nextChar", 0);
        setIntField(term270211, term270211.getClass(), "markedChar", -1);
        setIntField(term270211, term270211.getClass(), "readAheadLimit", 0);
        setBooleanField(term270211, term270211.getClass(), "skipLF", false);
        setBooleanField(term270211, term270211.getClass(), "markedSkipLF", false);
        setField(term270211, term270211.getClass(), "lock", term270215);
        setField(term270211, term270211.getClass(), "skipBuffer", null);
        setField(term270204, term270204.getClass(), "reader", term270211);
        setField(term270197, term270197.getClass(), "lexer", term270204);
        setField(term270197, term270197.getClass(), "record", term270231);
        setLongField(term270197, term270197.getClass(), "recordNumber", 0L);
        setField(term270236, term270236.getClass(), "type", enum93);
        setField(term270244, term270244.getClass(), "value", term270245);
        setByteField(term270244, term270244.getClass(), "coder", (byte) 0);
        setIntField(term270244, term270244.getClass(), "count", 0);
        setField(term270236, term270236.getClass(), "content", term270244);
        setBooleanField(term270236, term270236.getClass(), "isReady", false);
        setField(term270197, term270197.getClass(), "reusableToken", term270236);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("org.apache.commons.csv.CSVFormat");
        Object[] args = new Object[2];
        args[0] = "";
        args[1] = term269635;
        Object retValue = callMethod(klass, "parse", argTypes, null, args);
        assertTrue(recursiveEquals(term269635, term270309));
        assertTrue(recursiveEquals(retValue, term270197));
    }

};


