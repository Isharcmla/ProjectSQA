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

public class CSVParser_parse_1565072064141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term351019;
     Object term351627;
     Object term351518;

    public CSVParser_parse_1565072064141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term351071 = new Character((char) 57856);
        Character term351123 = new Character((char) 0);
        term351019 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term349418 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term351019, term351019.getClass(), "delimiter", (char) 7423);
        setField(term351019, term351019.getClass(), "escape", term351071);
        setField(term351019, term351019.getClass(), "quoteChar", term351123);
        setField(term351019, term351019.getClass(), "commentStart", term351071);
        setBooleanField(term351019, term351019.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term351019, term351019.getClass(), "ignoreEmptyLines", true);
        setField(term351019, term351019.getClass(), "header", term349418);
        setBooleanField(term351019, term351019.getClass(), "skipHeaderRecord", true);
        setIntField(null, Class.forName("java.io.BufferedReader"), "defaultCharBufferSize", 1);
        Character term351628 = new Character((char) 0);
        Character term351629 = new Character((char) 57856);
        Character term351630 = new Character((char) 57856);
        term351627 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term351631 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term351627, term351627.getClass(), "delimiter", (char) 7423);
        setField(term351627, term351627.getClass(), "quoteChar", term351628);
        setField(term351627, term351627.getClass(), "quotePolicy", null);
        setField(term351627, term351627.getClass(), "commentStart", term351629);
        setField(term351627, term351627.getClass(), "escape", term351630);
        setBooleanField(term351627, term351627.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term351627, term351627.getClass(), "ignoreEmptyHeaders", false);
        setBooleanField(term351627, term351627.getClass(), "ignoreEmptyLines", true);
        setField(term351627, term351627.getClass(), "recordSeparator", null);
        setField(term351627, term351627.getClass(), "nullString", null);
        setField(term351627, term351627.getClass(), "header", term351631);
        setBooleanField(term351627, term351627.getClass(), "skipHeaderRecord", true);
        Character term351138 = new Character((char) 0);
        Character term351140 = new Character((char) 57856);
        Character term351142 = new Character((char) 57856);
        LinkedHashMap term351519 = new LinkedHashMap();
        ArrayList term351549 = new ArrayList();
        Class<? extends Object> term351634 = Class.forName((String) "org.apache.commons.csv.Token$Type");
        Field term351633 = ((Class) term351634).getDeclaredField((String) "EOF");
        ((Field) term351633).setAccessible(true);
        Object enum113 = ((Field) term351633).get((Object) null);
        term351518 = newInstance(Class.forName("org.apache.commons.csv.CSVParser"));
        Object term351136 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term351147 = (Object[]) newArray("java.lang.String", 0);
        Object term351525 = newInstance(Class.forName("org.apache.commons.csv.Lexer"));
        Object term351532 = newInstance(Class.forName("org.apache.commons.csv.ExtendedBufferedReader"));
        Object term351536 = newInstance(Class.forName("java.io.StringReader"));
        char[] term351541 = (char[]) newCharArray(1);
        Object term351554 = newInstance(Class.forName("org.apache.commons.csv.Token"));
        Object term351562 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term351563 = (byte[]) newByteArray(50);
        setCharField(term351136, term351136.getClass(), "delimiter", (char) 7423);
        setField(term351136, term351136.getClass(), "quoteChar", term351138);
        setField(term351136, term351136.getClass(), "quotePolicy", null);
        setField(term351136, term351136.getClass(), "commentStart", term351140);
        setField(term351136, term351136.getClass(), "escape", term351142);
        setBooleanField(term351136, term351136.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term351136, term351136.getClass(), "ignoreEmptyHeaders", false);
        setBooleanField(term351136, term351136.getClass(), "ignoreEmptyLines", true);
        setField(term351136, term351136.getClass(), "recordSeparator", null);
        setField(term351136, term351136.getClass(), "nullString", null);
        setField(term351136, term351136.getClass(), "header", term351147);
        setBooleanField(term351136, term351136.getClass(), "skipHeaderRecord", true);
        setField(term351518, term351518.getClass(), "format", term351136);
        setField(term351518, term351518.getClass(), "headerMap", term351519);
        setCharField(term351525, term351525.getClass(), "delimiter", (char) 7423);
        setCharField(term351525, term351525.getClass(), "escape", (char) 57856);
        setCharField(term351525, term351525.getClass(), "quoteChar", (char) 0);
        setCharField(term351525, term351525.getClass(), "commentStart", (char) 57856);
        setBooleanField(term351525, term351525.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term351525, term351525.getClass(), "ignoreEmptyLines", true);
        setIntField(term351532, term351532.getClass(), "lastChar", -1);
        setLongField(term351532, term351532.getClass(), "eolCounter", 0L);
        setBooleanField(term351532, term351532.getClass(), "closed", false);
        setField(term351536, term351536.getClass(), "str", "");
        setIntField(term351536, term351536.getClass(), "length", 0);
        setIntField(term351536, term351536.getClass(), "next", 0);
        setIntField(term351536, term351536.getClass(), "mark", 0);
        setField(term351536, term351536.getClass(), "lock", term351536);
        setField(term351536, term351536.getClass(), "skipBuffer", null);
        setField(term351532, term351532.getClass(), "in", term351536);
        setField(term351532, term351532.getClass(), "cb", term351541);
        setIntField(term351532, term351532.getClass(), "nChars", 0);
        setIntField(term351532, term351532.getClass(), "nextChar", 0);
        setIntField(term351532, term351532.getClass(), "markedChar", -1);
        setIntField(term351532, term351532.getClass(), "readAheadLimit", 0);
        setBooleanField(term351532, term351532.getClass(), "skipLF", false);
        setBooleanField(term351532, term351532.getClass(), "markedSkipLF", false);
        setField(term351532, term351532.getClass(), "lock", term351536);
        setField(term351532, term351532.getClass(), "skipBuffer", null);
        setField(term351525, term351525.getClass(), "reader", term351532);
        setField(term351518, term351518.getClass(), "lexer", term351525);
        setField(term351518, term351518.getClass(), "record", term351549);
        setLongField(term351518, term351518.getClass(), "recordNumber", 0L);
        setField(term351554, term351554.getClass(), "type", enum113);
        setField(term351562, term351562.getClass(), "value", term351563);
        setByteField(term351562, term351562.getClass(), "coder", (byte) 0);
        setIntField(term351562, term351562.getClass(), "count", 0);
        setField(term351554, term351554.getClass(), "content", term351562);
        setBooleanField(term351554, term351554.getClass(), "isReady", false);
        setField(term351518, term351518.getClass(), "reusableToken", term351554);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("org.apache.commons.csv.CSVFormat");
        Object[] args = new Object[2];
        args[0] = "";
        args[1] = term351019;
        Object retValue = callMethod(klass, "parse", argTypes, null, args);
        assertTrue(recursiveEquals(term351019, term351627));
        assertTrue(recursiveEquals(retValue, term351518));
    }

};


