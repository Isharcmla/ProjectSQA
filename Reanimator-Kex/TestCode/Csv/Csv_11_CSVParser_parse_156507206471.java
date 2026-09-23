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

public class CSVParser_parse_156507206471 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term229396;
     Object term230691;
     Object term230455;

    public CSVParser_parse_156507206471() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term229448 = new Character((char) 256);
        Character term229500 = new Character((char) 0);
        Character term229552 = new Character((char) 0);
        term229396 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term222527 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term229396, term229396.getClass(), "delimiter", (char) 32768);
        setField(term229396, term229396.getClass(), "escape", term229448);
        setField(term229396, term229396.getClass(), "quoteChar", term229500);
        setField(term229396, term229396.getClass(), "commentStart", term229552);
        setBooleanField(term229396, term229396.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term229396, term229396.getClass(), "ignoreEmptyLines", true);
        setField(term229396, term229396.getClass(), "header", term222527);
        setBooleanField(term229396, term229396.getClass(), "skipHeaderRecord", true);
        setIntField(null, Class.forName("java.io.BufferedReader"), "defaultCharBufferSize", 128);
        Character term230692 = new Character((char) 0);
        Character term230693 = new Character((char) 0);
        Character term230694 = new Character((char) 256);
        term230691 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term230695 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term230691, term230691.getClass(), "delimiter", (char) 32768);
        setField(term230691, term230691.getClass(), "quoteChar", term230692);
        setField(term230691, term230691.getClass(), "quotePolicy", null);
        setField(term230691, term230691.getClass(), "commentStart", term230693);
        setField(term230691, term230691.getClass(), "escape", term230694);
        setBooleanField(term230691, term230691.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term230691, term230691.getClass(), "ignoreEmptyHeaders", false);
        setBooleanField(term230691, term230691.getClass(), "ignoreEmptyLines", true);
        setField(term230691, term230691.getClass(), "recordSeparator", null);
        setField(term230691, term230691.getClass(), "nullString", null);
        setField(term230691, term230691.getClass(), "header", term230695);
        setBooleanField(term230691, term230691.getClass(), "skipHeaderRecord", true);
        Character term229567 = new Character((char) 0);
        Character term229569 = new Character((char) 0);
        Character term229571 = new Character((char) 256);
        LinkedHashMap term230456 = new LinkedHashMap();
        ArrayList term230613 = new ArrayList();
        Class<? extends Object> term230825 = Class.forName((String) "org.apache.commons.csv.Token$Type");
        Field term230824 = ((Class) term230825).getDeclaredField((String) "EOF");
        ((Field) term230824).setAccessible(true);
        Object enum84 = ((Field) term230824).get((Object) null);
        term230455 = newInstance(Class.forName("org.apache.commons.csv.CSVParser"));
        Object term229565 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term229576 = (Object[]) newArray("java.lang.String", 0);
        Object term230462 = newInstance(Class.forName("org.apache.commons.csv.Lexer"));
        Object term230469 = newInstance(Class.forName("org.apache.commons.csv.ExtendedBufferedReader"));
        Object term230473 = newInstance(Class.forName("java.io.StringReader"));
        char[] term230478 = (char[]) newCharArray(128);
        Object term230618 = newInstance(Class.forName("org.apache.commons.csv.Token"));
        Object term230626 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term230627 = (byte[]) newByteArray(50);
        setCharField(term229565, term229565.getClass(), "delimiter", (char) 32768);
        setField(term229565, term229565.getClass(), "quoteChar", term229567);
        setField(term229565, term229565.getClass(), "quotePolicy", null);
        setField(term229565, term229565.getClass(), "commentStart", term229569);
        setField(term229565, term229565.getClass(), "escape", term229571);
        setBooleanField(term229565, term229565.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term229565, term229565.getClass(), "ignoreEmptyHeaders", false);
        setBooleanField(term229565, term229565.getClass(), "ignoreEmptyLines", true);
        setField(term229565, term229565.getClass(), "recordSeparator", null);
        setField(term229565, term229565.getClass(), "nullString", null);
        setField(term229565, term229565.getClass(), "header", term229576);
        setBooleanField(term229565, term229565.getClass(), "skipHeaderRecord", true);
        setField(term230455, term230455.getClass(), "format", term229565);
        setField(term230455, term230455.getClass(), "headerMap", term230456);
        setCharField(term230462, term230462.getClass(), "delimiter", (char) 32768);
        setCharField(term230462, term230462.getClass(), "escape", (char) 256);
        setCharField(term230462, term230462.getClass(), "quoteChar", (char) 0);
        setCharField(term230462, term230462.getClass(), "commentStart", (char) 0);
        setBooleanField(term230462, term230462.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term230462, term230462.getClass(), "ignoreEmptyLines", true);
        setIntField(term230469, term230469.getClass(), "lastChar", -1);
        setLongField(term230469, term230469.getClass(), "eolCounter", 0L);
        setBooleanField(term230469, term230469.getClass(), "closed", false);
        setField(term230473, term230473.getClass(), "str", "");
        setIntField(term230473, term230473.getClass(), "length", 0);
        setIntField(term230473, term230473.getClass(), "next", 0);
        setIntField(term230473, term230473.getClass(), "mark", 0);
        setField(term230473, term230473.getClass(), "lock", term230473);
        setField(term230473, term230473.getClass(), "skipBuffer", null);
        setField(term230469, term230469.getClass(), "in", term230473);
        setField(term230469, term230469.getClass(), "cb", term230478);
        setIntField(term230469, term230469.getClass(), "nChars", 0);
        setIntField(term230469, term230469.getClass(), "nextChar", 0);
        setIntField(term230469, term230469.getClass(), "markedChar", -1);
        setIntField(term230469, term230469.getClass(), "readAheadLimit", 0);
        setBooleanField(term230469, term230469.getClass(), "skipLF", false);
        setBooleanField(term230469, term230469.getClass(), "markedSkipLF", false);
        setField(term230469, term230469.getClass(), "lock", term230473);
        setField(term230469, term230469.getClass(), "skipBuffer", null);
        setField(term230462, term230462.getClass(), "reader", term230469);
        setField(term230455, term230455.getClass(), "lexer", term230462);
        setField(term230455, term230455.getClass(), "record", term230613);
        setLongField(term230455, term230455.getClass(), "recordNumber", 0L);
        setField(term230618, term230618.getClass(), "type", enum84);
        setField(term230626, term230626.getClass(), "value", term230627);
        setByteField(term230626, term230626.getClass(), "coder", (byte) 0);
        setIntField(term230626, term230626.getClass(), "count", 0);
        setField(term230618, term230618.getClass(), "content", term230626);
        setBooleanField(term230618, term230618.getClass(), "isReady", false);
        setField(term230455, term230455.getClass(), "reusableToken", term230618);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("org.apache.commons.csv.CSVFormat");
        Object[] args = new Object[2];
        args[0] = "";
        args[1] = term229396;
        Object retValue = callMethod(klass, "parse", argTypes, null, args);
        assertTrue(recursiveEquals(term229396, term230691));
        assertTrue(recursiveEquals(retValue, term230455));
    }

};


