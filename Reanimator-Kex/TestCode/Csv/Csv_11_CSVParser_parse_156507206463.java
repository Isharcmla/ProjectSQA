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

public class CSVParser_parse_156507206463 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term211024;
     Object term211719;
     Object term211603;

    public CSVParser_parse_156507206463() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term211076 = new Character((char) 0);
        Character term211128 = new Character((char) 0);
        Character term211180 = new Character((char) 0);
        term211024 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term208669 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term211024, term211024.getClass(), "delimiter", (char) 0);
        setField(term211024, term211024.getClass(), "escape", term211076);
        setField(term211024, term211024.getClass(), "quoteChar", term211128);
        setField(term211024, term211024.getClass(), "commentStart", term211180);
        setBooleanField(term211024, term211024.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term211024, term211024.getClass(), "ignoreEmptyLines", true);
        setField(term211024, term211024.getClass(), "header", term208669);
        setBooleanField(term211024, term211024.getClass(), "skipHeaderRecord", true);
        setIntField(null, Class.forName("java.io.BufferedReader"), "defaultCharBufferSize", 8);
        Character term211720 = new Character((char) 0);
        Character term211721 = new Character((char) 0);
        Character term211722 = new Character((char) 0);
        term211719 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term211723 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term211719, term211719.getClass(), "delimiter", (char) 0);
        setField(term211719, term211719.getClass(), "quoteChar", term211720);
        setField(term211719, term211719.getClass(), "quotePolicy", null);
        setField(term211719, term211719.getClass(), "commentStart", term211721);
        setField(term211719, term211719.getClass(), "escape", term211722);
        setBooleanField(term211719, term211719.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term211719, term211719.getClass(), "ignoreEmptyHeaders", false);
        setBooleanField(term211719, term211719.getClass(), "ignoreEmptyLines", true);
        setField(term211719, term211719.getClass(), "recordSeparator", null);
        setField(term211719, term211719.getClass(), "nullString", null);
        setField(term211719, term211719.getClass(), "header", term211723);
        setBooleanField(term211719, term211719.getClass(), "skipHeaderRecord", true);
        Character term211195 = new Character((char) 0);
        Character term211197 = new Character((char) 0);
        Character term211199 = new Character((char) 0);
        LinkedHashMap term211604 = new LinkedHashMap();
        ArrayList term211641 = new ArrayList();
        Class<? extends Object> term211733 = Class.forName((String) "org.apache.commons.csv.Token$Type");
        Field term211732 = ((Class) term211733).getDeclaredField((String) "EOF");
        ((Field) term211732).setAccessible(true);
        Object enum82 = ((Field) term211732).get((Object) null);
        term211603 = newInstance(Class.forName("org.apache.commons.csv.CSVParser"));
        Object term211193 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term211204 = (Object[]) newArray("java.lang.String", 0);
        Object term211610 = newInstance(Class.forName("org.apache.commons.csv.Lexer"));
        Object term211617 = newInstance(Class.forName("org.apache.commons.csv.ExtendedBufferedReader"));
        Object term211621 = newInstance(Class.forName("java.io.StringReader"));
        char[] term211626 = (char[]) newCharArray(8);
        Object term211646 = newInstance(Class.forName("org.apache.commons.csv.Token"));
        Object term211654 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term211655 = (byte[]) newByteArray(50);
        setCharField(term211193, term211193.getClass(), "delimiter", (char) 0);
        setField(term211193, term211193.getClass(), "quoteChar", term211195);
        setField(term211193, term211193.getClass(), "quotePolicy", null);
        setField(term211193, term211193.getClass(), "commentStart", term211197);
        setField(term211193, term211193.getClass(), "escape", term211199);
        setBooleanField(term211193, term211193.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term211193, term211193.getClass(), "ignoreEmptyHeaders", false);
        setBooleanField(term211193, term211193.getClass(), "ignoreEmptyLines", true);
        setField(term211193, term211193.getClass(), "recordSeparator", null);
        setField(term211193, term211193.getClass(), "nullString", null);
        setField(term211193, term211193.getClass(), "header", term211204);
        setBooleanField(term211193, term211193.getClass(), "skipHeaderRecord", true);
        setField(term211603, term211603.getClass(), "format", term211193);
        setField(term211603, term211603.getClass(), "headerMap", term211604);
        setCharField(term211610, term211610.getClass(), "delimiter", (char) 0);
        setCharField(term211610, term211610.getClass(), "escape", (char) 0);
        setCharField(term211610, term211610.getClass(), "quoteChar", (char) 0);
        setCharField(term211610, term211610.getClass(), "commentStart", (char) 0);
        setBooleanField(term211610, term211610.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term211610, term211610.getClass(), "ignoreEmptyLines", true);
        setIntField(term211617, term211617.getClass(), "lastChar", -1);
        setLongField(term211617, term211617.getClass(), "eolCounter", 0L);
        setBooleanField(term211617, term211617.getClass(), "closed", false);
        setField(term211621, term211621.getClass(), "str", "");
        setIntField(term211621, term211621.getClass(), "length", 0);
        setIntField(term211621, term211621.getClass(), "next", 0);
        setIntField(term211621, term211621.getClass(), "mark", 0);
        setField(term211621, term211621.getClass(), "lock", term211621);
        setField(term211621, term211621.getClass(), "skipBuffer", null);
        setField(term211617, term211617.getClass(), "in", term211621);
        setField(term211617, term211617.getClass(), "cb", term211626);
        setIntField(term211617, term211617.getClass(), "nChars", 0);
        setIntField(term211617, term211617.getClass(), "nextChar", 0);
        setIntField(term211617, term211617.getClass(), "markedChar", -1);
        setIntField(term211617, term211617.getClass(), "readAheadLimit", 0);
        setBooleanField(term211617, term211617.getClass(), "skipLF", false);
        setBooleanField(term211617, term211617.getClass(), "markedSkipLF", false);
        setField(term211617, term211617.getClass(), "lock", term211621);
        setField(term211617, term211617.getClass(), "skipBuffer", null);
        setField(term211610, term211610.getClass(), "reader", term211617);
        setField(term211603, term211603.getClass(), "lexer", term211610);
        setField(term211603, term211603.getClass(), "record", term211641);
        setLongField(term211603, term211603.getClass(), "recordNumber", 0L);
        setField(term211646, term211646.getClass(), "type", enum82);
        setField(term211654, term211654.getClass(), "value", term211655);
        setByteField(term211654, term211654.getClass(), "coder", (byte) 0);
        setIntField(term211654, term211654.getClass(), "count", 0);
        setField(term211646, term211646.getClass(), "content", term211654);
        setBooleanField(term211646, term211646.getClass(), "isReady", false);
        setField(term211603, term211603.getClass(), "reusableToken", term211646);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("org.apache.commons.csv.CSVFormat");
        Object[] args = new Object[2];
        args[0] = "";
        args[1] = term211024;
        Object retValue = callMethod(klass, "parse", argTypes, null, args);
        assertTrue(recursiveEquals(term211024, term211719));
        assertTrue(recursiveEquals(retValue, term211603));
    }

};


