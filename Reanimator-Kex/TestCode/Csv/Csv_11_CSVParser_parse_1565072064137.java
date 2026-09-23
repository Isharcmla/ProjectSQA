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
import java.util.ArrayList;
import java.lang.String;

public class CSVParser_parse_1565072064137 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term348010;
     Object term348459;
     Object term348357;

    public CSVParser_parse_1565072064137() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term348062 = new Character((char) 0);
        Character term348114 = new Character((char) 0);
        Character term348166 = new Character((char) 0);
        term348010 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term348010, term348010.getClass(), "delimiter", (char) 0);
        setField(term348010, term348010.getClass(), "escape", term348062);
        setField(term348010, term348010.getClass(), "quoteChar", term348114);
        setField(term348010, term348010.getClass(), "commentStart", term348166);
        setBooleanField(term348010, term348010.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term348010, term348010.getClass(), "ignoreEmptyLines", false);
        setField(term348010, term348010.getClass(), "header", null);
        setIntField(null, Class.forName("java.io.BufferedReader"), "defaultCharBufferSize", 4);
        Character term348460 = new Character((char) 0);
        Character term348461 = new Character((char) 0);
        Character term348462 = new Character((char) 0);
        term348459 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term348459, term348459.getClass(), "delimiter", (char) 0);
        setField(term348459, term348459.getClass(), "quoteChar", term348460);
        setField(term348459, term348459.getClass(), "quotePolicy", null);
        setField(term348459, term348459.getClass(), "commentStart", term348461);
        setField(term348459, term348459.getClass(), "escape", term348462);
        setBooleanField(term348459, term348459.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term348459, term348459.getClass(), "ignoreEmptyHeaders", false);
        setBooleanField(term348459, term348459.getClass(), "ignoreEmptyLines", false);
        setField(term348459, term348459.getClass(), "recordSeparator", null);
        setField(term348459, term348459.getClass(), "nullString", null);
        setField(term348459, term348459.getClass(), "header", null);
        setBooleanField(term348459, term348459.getClass(), "skipHeaderRecord", false);
        Character term348194 = new Character((char) 0);
        Character term348196 = new Character((char) 0);
        Character term348198 = new Character((char) 0);
        ArrayList term348385 = new ArrayList();
        Class<? extends Object> term348468 = Class.forName((String) "org.apache.commons.csv.Token$Type");
        Field term348467 = ((Class) term348468).getDeclaredField((String) "INVALID");
        ((Field) term348467).setAccessible(true);
        Object enum112 = ((Field) term348467).get((Object) null);
        term348357 = newInstance(Class.forName("org.apache.commons.csv.CSVParser"));
        Object term348192 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object term348358 = newInstance(Class.forName("org.apache.commons.csv.Lexer"));
        Object term348365 = newInstance(Class.forName("org.apache.commons.csv.ExtendedBufferedReader"));
        Object term348369 = newInstance(Class.forName("java.io.StringReader"));
        char[] term348374 = (char[]) newCharArray(4);
        Object term348390 = newInstance(Class.forName("org.apache.commons.csv.Token"));
        Object term348402 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term348403 = (byte[]) newByteArray(50);
        setCharField(term348192, term348192.getClass(), "delimiter", (char) 0);
        setField(term348192, term348192.getClass(), "quoteChar", term348194);
        setField(term348192, term348192.getClass(), "quotePolicy", null);
        setField(term348192, term348192.getClass(), "commentStart", term348196);
        setField(term348192, term348192.getClass(), "escape", term348198);
        setBooleanField(term348192, term348192.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term348192, term348192.getClass(), "ignoreEmptyHeaders", false);
        setBooleanField(term348192, term348192.getClass(), "ignoreEmptyLines", false);
        setField(term348192, term348192.getClass(), "recordSeparator", null);
        setField(term348192, term348192.getClass(), "nullString", null);
        setField(term348192, term348192.getClass(), "header", null);
        setBooleanField(term348192, term348192.getClass(), "skipHeaderRecord", false);
        setField(term348357, term348357.getClass(), "format", term348192);
        setField(term348357, term348357.getClass(), "headerMap", null);
        setCharField(term348358, term348358.getClass(), "delimiter", (char) 0);
        setCharField(term348358, term348358.getClass(), "escape", (char) 0);
        setCharField(term348358, term348358.getClass(), "quoteChar", (char) 0);
        setCharField(term348358, term348358.getClass(), "commentStart", (char) 0);
        setBooleanField(term348358, term348358.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term348358, term348358.getClass(), "ignoreEmptyLines", false);
        setIntField(term348365, term348365.getClass(), "lastChar", -2);
        setLongField(term348365, term348365.getClass(), "eolCounter", 0L);
        setBooleanField(term348365, term348365.getClass(), "closed", false);
        setField(term348369, term348369.getClass(), "str", "");
        setIntField(term348369, term348369.getClass(), "length", 0);
        setIntField(term348369, term348369.getClass(), "next", 0);
        setIntField(term348369, term348369.getClass(), "mark", 0);
        setField(term348369, term348369.getClass(), "lock", term348369);
        setField(term348369, term348369.getClass(), "skipBuffer", null);
        setField(term348365, term348365.getClass(), "in", term348369);
        setField(term348365, term348365.getClass(), "cb", term348374);
        setIntField(term348365, term348365.getClass(), "nChars", 0);
        setIntField(term348365, term348365.getClass(), "nextChar", 0);
        setIntField(term348365, term348365.getClass(), "markedChar", -1);
        setIntField(term348365, term348365.getClass(), "readAheadLimit", 0);
        setBooleanField(term348365, term348365.getClass(), "skipLF", false);
        setBooleanField(term348365, term348365.getClass(), "markedSkipLF", false);
        setField(term348365, term348365.getClass(), "lock", term348369);
        setField(term348365, term348365.getClass(), "skipBuffer", null);
        setField(term348358, term348358.getClass(), "reader", term348365);
        setField(term348357, term348357.getClass(), "lexer", term348358);
        setField(term348357, term348357.getClass(), "record", term348385);
        setLongField(term348357, term348357.getClass(), "recordNumber", 0L);
        setField(term348390, term348390.getClass(), "type", enum112);
        setField(term348402, term348402.getClass(), "value", term348403);
        setByteField(term348402, term348402.getClass(), "coder", (byte) 0);
        setIntField(term348402, term348402.getClass(), "count", 0);
        setField(term348390, term348390.getClass(), "content", term348402);
        setBooleanField(term348390, term348390.getClass(), "isReady", false);
        setField(term348357, term348357.getClass(), "reusableToken", term348390);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("org.apache.commons.csv.CSVFormat");
        Object[] args = new Object[2];
        args[0] = "";
        args[1] = term348010;
        Object retValue = callMethod(klass, "parse", argTypes, null, args);
        assertTrue(recursiveEquals(term348010, term348459));
        assertTrue(recursiveEquals(retValue, term348357));
    }

};


