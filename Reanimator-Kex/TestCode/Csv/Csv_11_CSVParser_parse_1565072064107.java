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

public class CSVParser_parse_1565072064107 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term297170;
     Object term297985;
     Object term297845;

    public CSVParser_parse_1565072064107() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term297222 = new Character((char) 0);
        Character term297274 = new Character((char) 0);
        Character term297326 = new Character((char) 0);
        term297170 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term294534 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term297170, term297170.getClass(), "delimiter", (char) 0);
        setField(term297170, term297170.getClass(), "escape", term297222);
        setField(term297170, term297170.getClass(), "quoteChar", term297274);
        setField(term297170, term297170.getClass(), "commentStart", term297326);
        setBooleanField(term297170, term297170.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term297170, term297170.getClass(), "ignoreEmptyLines", true);
        setField(term297170, term297170.getClass(), "header", term294534);
        setBooleanField(term297170, term297170.getClass(), "skipHeaderRecord", true);
        setIntField(null, Class.forName("java.io.BufferedReader"), "defaultCharBufferSize", 32);
        Character term297986 = new Character((char) 0);
        Character term297987 = new Character((char) 0);
        Character term297988 = new Character((char) 0);
        term297985 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term297989 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term297985, term297985.getClass(), "delimiter", (char) 0);
        setField(term297985, term297985.getClass(), "quoteChar", term297986);
        setField(term297985, term297985.getClass(), "quotePolicy", null);
        setField(term297985, term297985.getClass(), "commentStart", term297987);
        setField(term297985, term297985.getClass(), "escape", term297988);
        setBooleanField(term297985, term297985.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term297985, term297985.getClass(), "ignoreEmptyHeaders", false);
        setBooleanField(term297985, term297985.getClass(), "ignoreEmptyLines", true);
        setField(term297985, term297985.getClass(), "recordSeparator", null);
        setField(term297985, term297985.getClass(), "nullString", null);
        setField(term297985, term297985.getClass(), "header", term297989);
        setBooleanField(term297985, term297985.getClass(), "skipHeaderRecord", true);
        Character term297341 = new Character((char) 0);
        Character term297343 = new Character((char) 0);
        Character term297345 = new Character((char) 0);
        LinkedHashMap term297846 = new LinkedHashMap();
        ArrayList term297907 = new ArrayList();
        Class<? extends Object> term298023 = Class.forName((String) "org.apache.commons.csv.Token$Type");
        Field term298022 = ((Class) term298023).getDeclaredField((String) "EOF");
        ((Field) term298022).setAccessible(true);
        Object enum100 = ((Field) term298022).get((Object) null);
        term297845 = newInstance(Class.forName("org.apache.commons.csv.CSVParser"));
        Object term297339 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term297350 = (Object[]) newArray("java.lang.String", 0);
        Object term297852 = newInstance(Class.forName("org.apache.commons.csv.Lexer"));
        Object term297859 = newInstance(Class.forName("org.apache.commons.csv.ExtendedBufferedReader"));
        Object term297863 = newInstance(Class.forName("java.io.StringReader"));
        char[] term297868 = (char[]) newCharArray(32);
        Object term297912 = newInstance(Class.forName("org.apache.commons.csv.Token"));
        Object term297920 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term297921 = (byte[]) newByteArray(50);
        setCharField(term297339, term297339.getClass(), "delimiter", (char) 0);
        setField(term297339, term297339.getClass(), "quoteChar", term297341);
        setField(term297339, term297339.getClass(), "quotePolicy", null);
        setField(term297339, term297339.getClass(), "commentStart", term297343);
        setField(term297339, term297339.getClass(), "escape", term297345);
        setBooleanField(term297339, term297339.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term297339, term297339.getClass(), "ignoreEmptyHeaders", false);
        setBooleanField(term297339, term297339.getClass(), "ignoreEmptyLines", true);
        setField(term297339, term297339.getClass(), "recordSeparator", null);
        setField(term297339, term297339.getClass(), "nullString", null);
        setField(term297339, term297339.getClass(), "header", term297350);
        setBooleanField(term297339, term297339.getClass(), "skipHeaderRecord", true);
        setField(term297845, term297845.getClass(), "format", term297339);
        setField(term297845, term297845.getClass(), "headerMap", term297846);
        setCharField(term297852, term297852.getClass(), "delimiter", (char) 0);
        setCharField(term297852, term297852.getClass(), "escape", (char) 0);
        setCharField(term297852, term297852.getClass(), "quoteChar", (char) 0);
        setCharField(term297852, term297852.getClass(), "commentStart", (char) 0);
        setBooleanField(term297852, term297852.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term297852, term297852.getClass(), "ignoreEmptyLines", true);
        setIntField(term297859, term297859.getClass(), "lastChar", -1);
        setLongField(term297859, term297859.getClass(), "eolCounter", 0L);
        setBooleanField(term297859, term297859.getClass(), "closed", false);
        setField(term297863, term297863.getClass(), "str", "");
        setIntField(term297863, term297863.getClass(), "length", 0);
        setIntField(term297863, term297863.getClass(), "next", 0);
        setIntField(term297863, term297863.getClass(), "mark", 0);
        setField(term297863, term297863.getClass(), "lock", term297863);
        setField(term297863, term297863.getClass(), "skipBuffer", null);
        setField(term297859, term297859.getClass(), "in", term297863);
        setField(term297859, term297859.getClass(), "cb", term297868);
        setIntField(term297859, term297859.getClass(), "nChars", 0);
        setIntField(term297859, term297859.getClass(), "nextChar", 0);
        setIntField(term297859, term297859.getClass(), "markedChar", -1);
        setIntField(term297859, term297859.getClass(), "readAheadLimit", 0);
        setBooleanField(term297859, term297859.getClass(), "skipLF", false);
        setBooleanField(term297859, term297859.getClass(), "markedSkipLF", false);
        setField(term297859, term297859.getClass(), "lock", term297863);
        setField(term297859, term297859.getClass(), "skipBuffer", null);
        setField(term297852, term297852.getClass(), "reader", term297859);
        setField(term297845, term297845.getClass(), "lexer", term297852);
        setField(term297845, term297845.getClass(), "record", term297907);
        setLongField(term297845, term297845.getClass(), "recordNumber", 0L);
        setField(term297912, term297912.getClass(), "type", enum100);
        setField(term297920, term297920.getClass(), "value", term297921);
        setByteField(term297920, term297920.getClass(), "coder", (byte) 0);
        setIntField(term297920, term297920.getClass(), "count", 0);
        setField(term297912, term297912.getClass(), "content", term297920);
        setBooleanField(term297912, term297912.getClass(), "isReady", false);
        setField(term297845, term297845.getClass(), "reusableToken", term297912);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("org.apache.commons.csv.CSVFormat");
        Object[] args = new Object[2];
        args[0] = "";
        args[1] = term297170;
        Object retValue = callMethod(klass, "parse", argTypes, null, args);
        assertTrue(recursiveEquals(term297170, term297985));
        assertTrue(recursiveEquals(retValue, term297845));
    }

};


