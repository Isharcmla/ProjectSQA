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

public class CSVParser_parse_1565072064130 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term327502;
     Object term332466;
     Object term331846;

    public CSVParser_parse_1565072064130() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term327554 = new Character((char) 0);
        Character term327606 = new Character((char) 0);
        Character term327658 = new Character((char) 0);
        term327502 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term326650 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term327502, term327502.getClass(), "delimiter", (char) 0);
        setField(term327502, term327502.getClass(), "escape", term327554);
        setField(term327502, term327502.getClass(), "quoteChar", term327606);
        setField(term327502, term327502.getClass(), "commentStart", term327658);
        setBooleanField(term327502, term327502.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term327502, term327502.getClass(), "ignoreEmptyLines", true);
        setField(term327502, term327502.getClass(), "header", term326650);
        setBooleanField(term327502, term327502.getClass(), "skipHeaderRecord", true);
        setIntField(null, Class.forName("java.io.BufferedReader"), "defaultCharBufferSize", 512);
        Character term332467 = new Character((char) 0);
        Character term332468 = new Character((char) 0);
        Character term332469 = new Character((char) 0);
        term332466 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term332470 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term332466, term332466.getClass(), "delimiter", (char) 0);
        setField(term332466, term332466.getClass(), "quoteChar", term332467);
        setField(term332466, term332466.getClass(), "quotePolicy", null);
        setField(term332466, term332466.getClass(), "commentStart", term332468);
        setField(term332466, term332466.getClass(), "escape", term332469);
        setBooleanField(term332466, term332466.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term332466, term332466.getClass(), "ignoreEmptyHeaders", false);
        setBooleanField(term332466, term332466.getClass(), "ignoreEmptyLines", true);
        setField(term332466, term332466.getClass(), "recordSeparator", null);
        setField(term332466, term332466.getClass(), "nullString", null);
        setField(term332466, term332466.getClass(), "header", term332470);
        setBooleanField(term332466, term332466.getClass(), "skipHeaderRecord", true);
        Character term329422 = new Character((char) 0);
        Character term329424 = new Character((char) 0);
        Character term329426 = new Character((char) 0);
        LinkedHashMap term331847 = new LinkedHashMap();
        ArrayList term332388 = new ArrayList();
        Class<? extends Object> term332984 = Class.forName((String) "org.apache.commons.csv.Token$Type");
        Field term332983 = ((Class) term332984).getDeclaredField((String) "EOF");
        ((Field) term332983).setAccessible(true);
        Object enum108 = ((Field) term332983).get((Object) null);
        term331846 = newInstance(Class.forName("org.apache.commons.csv.CSVParser"));
        Object term329420 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term329431 = (Object[]) newArray("java.lang.String", 0);
        Object term331853 = newInstance(Class.forName("org.apache.commons.csv.Lexer"));
        Object term331860 = newInstance(Class.forName("org.apache.commons.csv.ExtendedBufferedReader"));
        Object term331864 = newInstance(Class.forName("java.io.StringReader"));
        char[] term331869 = (char[]) newCharArray(512);
        Object term332393 = newInstance(Class.forName("org.apache.commons.csv.Token"));
        Object term332401 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term332402 = (byte[]) newByteArray(50);
        setCharField(term329420, term329420.getClass(), "delimiter", (char) 0);
        setField(term329420, term329420.getClass(), "quoteChar", term329422);
        setField(term329420, term329420.getClass(), "quotePolicy", null);
        setField(term329420, term329420.getClass(), "commentStart", term329424);
        setField(term329420, term329420.getClass(), "escape", term329426);
        setBooleanField(term329420, term329420.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term329420, term329420.getClass(), "ignoreEmptyHeaders", false);
        setBooleanField(term329420, term329420.getClass(), "ignoreEmptyLines", true);
        setField(term329420, term329420.getClass(), "recordSeparator", null);
        setField(term329420, term329420.getClass(), "nullString", null);
        setField(term329420, term329420.getClass(), "header", term329431);
        setBooleanField(term329420, term329420.getClass(), "skipHeaderRecord", true);
        setField(term331846, term331846.getClass(), "format", term329420);
        setField(term331846, term331846.getClass(), "headerMap", term331847);
        setCharField(term331853, term331853.getClass(), "delimiter", (char) 0);
        setCharField(term331853, term331853.getClass(), "escape", (char) 0);
        setCharField(term331853, term331853.getClass(), "quoteChar", (char) 0);
        setCharField(term331853, term331853.getClass(), "commentStart", (char) 0);
        setBooleanField(term331853, term331853.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term331853, term331853.getClass(), "ignoreEmptyLines", true);
        setIntField(term331860, term331860.getClass(), "lastChar", -1);
        setLongField(term331860, term331860.getClass(), "eolCounter", 0L);
        setBooleanField(term331860, term331860.getClass(), "closed", false);
        setField(term331864, term331864.getClass(), "str", "");
        setIntField(term331864, term331864.getClass(), "length", 0);
        setIntField(term331864, term331864.getClass(), "next", 0);
        setIntField(term331864, term331864.getClass(), "mark", 0);
        setField(term331864, term331864.getClass(), "lock", term331864);
        setField(term331864, term331864.getClass(), "skipBuffer", null);
        setField(term331860, term331860.getClass(), "in", term331864);
        setField(term331860, term331860.getClass(), "cb", term331869);
        setIntField(term331860, term331860.getClass(), "nChars", 0);
        setIntField(term331860, term331860.getClass(), "nextChar", 0);
        setIntField(term331860, term331860.getClass(), "markedChar", -1);
        setIntField(term331860, term331860.getClass(), "readAheadLimit", 0);
        setBooleanField(term331860, term331860.getClass(), "skipLF", false);
        setBooleanField(term331860, term331860.getClass(), "markedSkipLF", false);
        setField(term331860, term331860.getClass(), "lock", term331864);
        setField(term331860, term331860.getClass(), "skipBuffer", null);
        setField(term331853, term331853.getClass(), "reader", term331860);
        setField(term331846, term331846.getClass(), "lexer", term331853);
        setField(term331846, term331846.getClass(), "record", term332388);
        setLongField(term331846, term331846.getClass(), "recordNumber", 0L);
        setField(term332393, term332393.getClass(), "type", enum108);
        setField(term332401, term332401.getClass(), "value", term332402);
        setByteField(term332401, term332401.getClass(), "coder", (byte) 0);
        setIntField(term332401, term332401.getClass(), "count", 0);
        setField(term332393, term332393.getClass(), "content", term332401);
        setBooleanField(term332393, term332393.getClass(), "isReady", false);
        setField(term331846, term331846.getClass(), "reusableToken", term332393);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("org.apache.commons.csv.CSVFormat");
        Object[] args = new Object[2];
        args[0] = "";
        args[1] = term327502;
        Object retValue = callMethod(klass, "parse", argTypes, null, args);
        assertTrue(recursiveEquals(term327502, term332466));
        assertTrue(recursiveEquals(retValue, term331846));
    }

};


