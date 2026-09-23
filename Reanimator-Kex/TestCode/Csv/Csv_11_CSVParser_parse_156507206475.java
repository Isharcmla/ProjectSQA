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

public class CSVParser_parse_156507206475 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term232691;
     Object term235906;
     Object term235286;

    public CSVParser_parse_156507206475() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term232743 = new Character((char) 0);
        Character term232795 = new Character((char) 0);
        Character term232847 = new Character((char) 0);
        term232691 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term232053 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term232691, term232691.getClass(), "delimiter", (char) 0);
        setField(term232691, term232691.getClass(), "escape", term232743);
        setField(term232691, term232691.getClass(), "quoteChar", term232795);
        setField(term232691, term232691.getClass(), "commentStart", term232847);
        setBooleanField(term232691, term232691.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term232691, term232691.getClass(), "ignoreEmptyLines", true);
        setField(term232691, term232691.getClass(), "header", term232053);
        setIntField(null, Class.forName("java.io.BufferedReader"), "defaultCharBufferSize", 512);
        Character term235907 = new Character((char) 0);
        Character term235908 = new Character((char) 0);
        Character term235909 = new Character((char) 0);
        term235906 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term235910 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term235906, term235906.getClass(), "delimiter", (char) 0);
        setField(term235906, term235906.getClass(), "quoteChar", term235907);
        setField(term235906, term235906.getClass(), "quotePolicy", null);
        setField(term235906, term235906.getClass(), "commentStart", term235908);
        setField(term235906, term235906.getClass(), "escape", term235909);
        setBooleanField(term235906, term235906.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term235906, term235906.getClass(), "ignoreEmptyHeaders", false);
        setBooleanField(term235906, term235906.getClass(), "ignoreEmptyLines", true);
        setField(term235906, term235906.getClass(), "recordSeparator", null);
        setField(term235906, term235906.getClass(), "nullString", null);
        setField(term235906, term235906.getClass(), "header", term235910);
        setBooleanField(term235906, term235906.getClass(), "skipHeaderRecord", false);
        Character term232862 = new Character((char) 0);
        Character term232864 = new Character((char) 0);
        Character term232866 = new Character((char) 0);
        LinkedHashMap term235287 = new LinkedHashMap();
        ArrayList term235828 = new ArrayList();
        Class<? extends Object> term236424 = Class.forName((String) "org.apache.commons.csv.Token$Type");
        Field term236423 = ((Class) term236424).getDeclaredField((String) "EOF");
        ((Field) term236423).setAccessible(true);
        Object enum85 = ((Field) term236423).get((Object) null);
        term235286 = newInstance(Class.forName("org.apache.commons.csv.CSVParser"));
        Object term232860 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term232871 = (Object[]) newArray("java.lang.String", 0);
        Object term235293 = newInstance(Class.forName("org.apache.commons.csv.Lexer"));
        Object term235300 = newInstance(Class.forName("org.apache.commons.csv.ExtendedBufferedReader"));
        Object term235304 = newInstance(Class.forName("java.io.StringReader"));
        char[] term235309 = (char[]) newCharArray(512);
        Object term235833 = newInstance(Class.forName("org.apache.commons.csv.Token"));
        Object term235841 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term235842 = (byte[]) newByteArray(50);
        setCharField(term232860, term232860.getClass(), "delimiter", (char) 0);
        setField(term232860, term232860.getClass(), "quoteChar", term232862);
        setField(term232860, term232860.getClass(), "quotePolicy", null);
        setField(term232860, term232860.getClass(), "commentStart", term232864);
        setField(term232860, term232860.getClass(), "escape", term232866);
        setBooleanField(term232860, term232860.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term232860, term232860.getClass(), "ignoreEmptyHeaders", false);
        setBooleanField(term232860, term232860.getClass(), "ignoreEmptyLines", true);
        setField(term232860, term232860.getClass(), "recordSeparator", null);
        setField(term232860, term232860.getClass(), "nullString", null);
        setField(term232860, term232860.getClass(), "header", term232871);
        setBooleanField(term232860, term232860.getClass(), "skipHeaderRecord", false);
        setField(term235286, term235286.getClass(), "format", term232860);
        setField(term235286, term235286.getClass(), "headerMap", term235287);
        setCharField(term235293, term235293.getClass(), "delimiter", (char) 0);
        setCharField(term235293, term235293.getClass(), "escape", (char) 0);
        setCharField(term235293, term235293.getClass(), "quoteChar", (char) 0);
        setCharField(term235293, term235293.getClass(), "commentStart", (char) 0);
        setBooleanField(term235293, term235293.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term235293, term235293.getClass(), "ignoreEmptyLines", true);
        setIntField(term235300, term235300.getClass(), "lastChar", -1);
        setLongField(term235300, term235300.getClass(), "eolCounter", 0L);
        setBooleanField(term235300, term235300.getClass(), "closed", false);
        setField(term235304, term235304.getClass(), "str", "");
        setIntField(term235304, term235304.getClass(), "length", 0);
        setIntField(term235304, term235304.getClass(), "next", 0);
        setIntField(term235304, term235304.getClass(), "mark", 0);
        setField(term235304, term235304.getClass(), "lock", term235304);
        setField(term235304, term235304.getClass(), "skipBuffer", null);
        setField(term235300, term235300.getClass(), "in", term235304);
        setField(term235300, term235300.getClass(), "cb", term235309);
        setIntField(term235300, term235300.getClass(), "nChars", 0);
        setIntField(term235300, term235300.getClass(), "nextChar", 0);
        setIntField(term235300, term235300.getClass(), "markedChar", -1);
        setIntField(term235300, term235300.getClass(), "readAheadLimit", 0);
        setBooleanField(term235300, term235300.getClass(), "skipLF", false);
        setBooleanField(term235300, term235300.getClass(), "markedSkipLF", false);
        setField(term235300, term235300.getClass(), "lock", term235304);
        setField(term235300, term235300.getClass(), "skipBuffer", null);
        setField(term235293, term235293.getClass(), "reader", term235300);
        setField(term235286, term235286.getClass(), "lexer", term235293);
        setField(term235286, term235286.getClass(), "record", term235828);
        setLongField(term235286, term235286.getClass(), "recordNumber", 0L);
        setField(term235833, term235833.getClass(), "type", enum85);
        setField(term235841, term235841.getClass(), "value", term235842);
        setByteField(term235841, term235841.getClass(), "coder", (byte) 0);
        setIntField(term235841, term235841.getClass(), "count", 0);
        setField(term235833, term235833.getClass(), "content", term235841);
        setBooleanField(term235833, term235833.getClass(), "isReady", false);
        setField(term235286, term235286.getClass(), "reusableToken", term235833);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("org.apache.commons.csv.CSVFormat");
        Object[] args = new Object[2];
        args[0] = "";
        args[1] = term232691;
        Object retValue = callMethod(klass, "parse", argTypes, null, args);
        assertTrue(recursiveEquals(term232691, term235906));
        assertTrue(recursiveEquals(retValue, term235286));
    }

};


