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

public class CSVParser_parse_1565072064151 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term358738;
     Object term359433;
     Object term359317;

    public CSVParser_parse_1565072064151() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term358790 = new Character((char) 22184);
        Character term358842 = new Character((char) 0);
        Character term358894 = new Character((char) 22184);
        term358738 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term357792 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term358738, term358738.getClass(), "delimiter", (char) 1416);
        setField(term358738, term358738.getClass(), "escape", term358790);
        setField(term358738, term358738.getClass(), "quoteChar", term358842);
        setField(term358738, term358738.getClass(), "commentStart", term358894);
        setBooleanField(term358738, term358738.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term358738, term358738.getClass(), "ignoreEmptyLines", true);
        setField(term358738, term358738.getClass(), "header", term357792);
        setBooleanField(term358738, term358738.getClass(), "skipHeaderRecord", true);
        setIntField(null, Class.forName("java.io.BufferedReader"), "defaultCharBufferSize", 8);
        Character term359434 = new Character((char) 0);
        Character term359435 = new Character((char) 22184);
        Character term359436 = new Character((char) 22184);
        term359433 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term359437 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term359433, term359433.getClass(), "delimiter", (char) 1416);
        setField(term359433, term359433.getClass(), "quoteChar", term359434);
        setField(term359433, term359433.getClass(), "quotePolicy", null);
        setField(term359433, term359433.getClass(), "commentStart", term359435);
        setField(term359433, term359433.getClass(), "escape", term359436);
        setBooleanField(term359433, term359433.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term359433, term359433.getClass(), "ignoreEmptyHeaders", false);
        setBooleanField(term359433, term359433.getClass(), "ignoreEmptyLines", true);
        setField(term359433, term359433.getClass(), "recordSeparator", null);
        setField(term359433, term359433.getClass(), "nullString", null);
        setField(term359433, term359433.getClass(), "header", term359437);
        setBooleanField(term359433, term359433.getClass(), "skipHeaderRecord", true);
        Character term358909 = new Character((char) 0);
        Character term358911 = new Character((char) 22184);
        Character term358913 = new Character((char) 22184);
        LinkedHashMap term359318 = new LinkedHashMap();
        ArrayList term359355 = new ArrayList();
        Class<? extends Object> term359447 = Class.forName((String) "org.apache.commons.csv.Token$Type");
        Field term359446 = ((Class) term359447).getDeclaredField((String) "EOF");
        ((Field) term359446).setAccessible(true);
        Object enum116 = ((Field) term359446).get((Object) null);
        term359317 = newInstance(Class.forName("org.apache.commons.csv.CSVParser"));
        Object term358907 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term358918 = (Object[]) newArray("java.lang.String", 0);
        Object term359324 = newInstance(Class.forName("org.apache.commons.csv.Lexer"));
        Object term359331 = newInstance(Class.forName("org.apache.commons.csv.ExtendedBufferedReader"));
        Object term359335 = newInstance(Class.forName("java.io.StringReader"));
        char[] term359340 = (char[]) newCharArray(8);
        Object term359360 = newInstance(Class.forName("org.apache.commons.csv.Token"));
        Object term359368 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term359369 = (byte[]) newByteArray(50);
        setCharField(term358907, term358907.getClass(), "delimiter", (char) 1416);
        setField(term358907, term358907.getClass(), "quoteChar", term358909);
        setField(term358907, term358907.getClass(), "quotePolicy", null);
        setField(term358907, term358907.getClass(), "commentStart", term358911);
        setField(term358907, term358907.getClass(), "escape", term358913);
        setBooleanField(term358907, term358907.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term358907, term358907.getClass(), "ignoreEmptyHeaders", false);
        setBooleanField(term358907, term358907.getClass(), "ignoreEmptyLines", true);
        setField(term358907, term358907.getClass(), "recordSeparator", null);
        setField(term358907, term358907.getClass(), "nullString", null);
        setField(term358907, term358907.getClass(), "header", term358918);
        setBooleanField(term358907, term358907.getClass(), "skipHeaderRecord", true);
        setField(term359317, term359317.getClass(), "format", term358907);
        setField(term359317, term359317.getClass(), "headerMap", term359318);
        setCharField(term359324, term359324.getClass(), "delimiter", (char) 1416);
        setCharField(term359324, term359324.getClass(), "escape", (char) 22184);
        setCharField(term359324, term359324.getClass(), "quoteChar", (char) 0);
        setCharField(term359324, term359324.getClass(), "commentStart", (char) 22184);
        setBooleanField(term359324, term359324.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term359324, term359324.getClass(), "ignoreEmptyLines", true);
        setIntField(term359331, term359331.getClass(), "lastChar", -1);
        setLongField(term359331, term359331.getClass(), "eolCounter", 0L);
        setBooleanField(term359331, term359331.getClass(), "closed", false);
        setField(term359335, term359335.getClass(), "str", "");
        setIntField(term359335, term359335.getClass(), "length", 0);
        setIntField(term359335, term359335.getClass(), "next", 0);
        setIntField(term359335, term359335.getClass(), "mark", 0);
        setField(term359335, term359335.getClass(), "lock", term359335);
        setField(term359335, term359335.getClass(), "skipBuffer", null);
        setField(term359331, term359331.getClass(), "in", term359335);
        setField(term359331, term359331.getClass(), "cb", term359340);
        setIntField(term359331, term359331.getClass(), "nChars", 0);
        setIntField(term359331, term359331.getClass(), "nextChar", 0);
        setIntField(term359331, term359331.getClass(), "markedChar", -1);
        setIntField(term359331, term359331.getClass(), "readAheadLimit", 0);
        setBooleanField(term359331, term359331.getClass(), "skipLF", false);
        setBooleanField(term359331, term359331.getClass(), "markedSkipLF", false);
        setField(term359331, term359331.getClass(), "lock", term359335);
        setField(term359331, term359331.getClass(), "skipBuffer", null);
        setField(term359324, term359324.getClass(), "reader", term359331);
        setField(term359317, term359317.getClass(), "lexer", term359324);
        setField(term359317, term359317.getClass(), "record", term359355);
        setLongField(term359317, term359317.getClass(), "recordNumber", 0L);
        setField(term359360, term359360.getClass(), "type", enum116);
        setField(term359368, term359368.getClass(), "value", term359369);
        setByteField(term359368, term359368.getClass(), "coder", (byte) 0);
        setIntField(term359368, term359368.getClass(), "count", 0);
        setField(term359360, term359360.getClass(), "content", term359368);
        setBooleanField(term359360, term359360.getClass(), "isReady", false);
        setField(term359317, term359317.getClass(), "reusableToken", term359360);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("org.apache.commons.csv.CSVFormat");
        Object[] args = new Object[2];
        args[0] = "";
        args[1] = term358738;
        Object retValue = callMethod(klass, "parse", argTypes, null, args);
        assertTrue(recursiveEquals(term358738, term359433));
        assertTrue(recursiveEquals(retValue, term359317));
    }

};


