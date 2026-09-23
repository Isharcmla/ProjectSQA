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

public class CSVParser_parse_1565072064133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term338638;
     Object term341853;
     Object term341233;

    public CSVParser_parse_1565072064133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term338690 = new Character((char) 0);
        Character term338742 = new Character((char) 0);
        Character term338794 = new Character((char) 0);
        term338638 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term337786 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term338638, term338638.getClass(), "delimiter", (char) 0);
        setField(term338638, term338638.getClass(), "escape", term338690);
        setField(term338638, term338638.getClass(), "quoteChar", term338742);
        setField(term338638, term338638.getClass(), "commentStart", term338794);
        setBooleanField(term338638, term338638.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term338638, term338638.getClass(), "ignoreEmptyLines", true);
        setField(term338638, term338638.getClass(), "header", term337786);
        setBooleanField(term338638, term338638.getClass(), "skipHeaderRecord", true);
        setIntField(null, Class.forName("java.io.BufferedReader"), "defaultCharBufferSize", 512);
        Character term341854 = new Character((char) 0);
        Character term341855 = new Character((char) 0);
        Character term341856 = new Character((char) 0);
        term341853 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term341857 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term341853, term341853.getClass(), "delimiter", (char) 0);
        setField(term341853, term341853.getClass(), "quoteChar", term341854);
        setField(term341853, term341853.getClass(), "quotePolicy", null);
        setField(term341853, term341853.getClass(), "commentStart", term341855);
        setField(term341853, term341853.getClass(), "escape", term341856);
        setBooleanField(term341853, term341853.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term341853, term341853.getClass(), "ignoreEmptyHeaders", false);
        setBooleanField(term341853, term341853.getClass(), "ignoreEmptyLines", true);
        setField(term341853, term341853.getClass(), "recordSeparator", null);
        setField(term341853, term341853.getClass(), "nullString", null);
        setField(term341853, term341853.getClass(), "header", term341857);
        setBooleanField(term341853, term341853.getClass(), "skipHeaderRecord", true);
        Character term338809 = new Character((char) 0);
        Character term338811 = new Character((char) 0);
        Character term338813 = new Character((char) 0);
        LinkedHashMap term341234 = new LinkedHashMap();
        ArrayList term341775 = new ArrayList();
        Class<? extends Object> term342371 = Class.forName((String) "org.apache.commons.csv.Token$Type");
        Field term342370 = ((Class) term342371).getDeclaredField((String) "EOF");
        ((Field) term342370).setAccessible(true);
        Object enum110 = ((Field) term342370).get((Object) null);
        term341233 = newInstance(Class.forName("org.apache.commons.csv.CSVParser"));
        Object term338807 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term338818 = (Object[]) newArray("java.lang.String", 0);
        Object term341240 = newInstance(Class.forName("org.apache.commons.csv.Lexer"));
        Object term341247 = newInstance(Class.forName("org.apache.commons.csv.ExtendedBufferedReader"));
        Object term341251 = newInstance(Class.forName("java.io.StringReader"));
        char[] term341256 = (char[]) newCharArray(512);
        Object term341780 = newInstance(Class.forName("org.apache.commons.csv.Token"));
        Object term341788 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term341789 = (byte[]) newByteArray(50);
        setCharField(term338807, term338807.getClass(), "delimiter", (char) 0);
        setField(term338807, term338807.getClass(), "quoteChar", term338809);
        setField(term338807, term338807.getClass(), "quotePolicy", null);
        setField(term338807, term338807.getClass(), "commentStart", term338811);
        setField(term338807, term338807.getClass(), "escape", term338813);
        setBooleanField(term338807, term338807.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term338807, term338807.getClass(), "ignoreEmptyHeaders", false);
        setBooleanField(term338807, term338807.getClass(), "ignoreEmptyLines", true);
        setField(term338807, term338807.getClass(), "recordSeparator", null);
        setField(term338807, term338807.getClass(), "nullString", null);
        setField(term338807, term338807.getClass(), "header", term338818);
        setBooleanField(term338807, term338807.getClass(), "skipHeaderRecord", true);
        setField(term341233, term341233.getClass(), "format", term338807);
        setField(term341233, term341233.getClass(), "headerMap", term341234);
        setCharField(term341240, term341240.getClass(), "delimiter", (char) 0);
        setCharField(term341240, term341240.getClass(), "escape", (char) 0);
        setCharField(term341240, term341240.getClass(), "quoteChar", (char) 0);
        setCharField(term341240, term341240.getClass(), "commentStart", (char) 0);
        setBooleanField(term341240, term341240.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term341240, term341240.getClass(), "ignoreEmptyLines", true);
        setIntField(term341247, term341247.getClass(), "lastChar", -1);
        setLongField(term341247, term341247.getClass(), "eolCounter", 0L);
        setBooleanField(term341247, term341247.getClass(), "closed", false);
        setField(term341251, term341251.getClass(), "str", "");
        setIntField(term341251, term341251.getClass(), "length", 0);
        setIntField(term341251, term341251.getClass(), "next", 0);
        setIntField(term341251, term341251.getClass(), "mark", 0);
        setField(term341251, term341251.getClass(), "lock", term341251);
        setField(term341251, term341251.getClass(), "skipBuffer", null);
        setField(term341247, term341247.getClass(), "in", term341251);
        setField(term341247, term341247.getClass(), "cb", term341256);
        setIntField(term341247, term341247.getClass(), "nChars", 0);
        setIntField(term341247, term341247.getClass(), "nextChar", 0);
        setIntField(term341247, term341247.getClass(), "markedChar", -1);
        setIntField(term341247, term341247.getClass(), "readAheadLimit", 0);
        setBooleanField(term341247, term341247.getClass(), "skipLF", false);
        setBooleanField(term341247, term341247.getClass(), "markedSkipLF", false);
        setField(term341247, term341247.getClass(), "lock", term341251);
        setField(term341247, term341247.getClass(), "skipBuffer", null);
        setField(term341240, term341240.getClass(), "reader", term341247);
        setField(term341233, term341233.getClass(), "lexer", term341240);
        setField(term341233, term341233.getClass(), "record", term341775);
        setLongField(term341233, term341233.getClass(), "recordNumber", 0L);
        setField(term341780, term341780.getClass(), "type", enum110);
        setField(term341788, term341788.getClass(), "value", term341789);
        setByteField(term341788, term341788.getClass(), "coder", (byte) 0);
        setIntField(term341788, term341788.getClass(), "count", 0);
        setField(term341780, term341780.getClass(), "content", term341788);
        setBooleanField(term341780, term341780.getClass(), "isReady", false);
        setField(term341233, term341233.getClass(), "reusableToken", term341780);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("org.apache.commons.csv.CSVFormat");
        Object[] args = new Object[2];
        args[0] = "";
        args[1] = term338638;
        Object retValue = callMethod(klass, "parse", argTypes, null, args);
        assertTrue(recursiveEquals(term338638, term341853));
        assertTrue(recursiveEquals(retValue, term341233));
    }

};


