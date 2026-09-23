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

public class CSVParser_parse_1565072064159 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term368398;
     Object term370333;
     Object term369969;

    public CSVParser_parse_1565072064159() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term368450 = new Character((char) 0);
        Character term368502 = new Character((char) 0);
        Character term368554 = new Character((char) 0);
        term368398 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term365809 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term368398, term368398.getClass(), "delimiter", (char) 0);
        setField(term368398, term368398.getClass(), "escape", term368450);
        setField(term368398, term368398.getClass(), "quoteChar", term368502);
        setField(term368398, term368398.getClass(), "commentStart", term368554);
        setBooleanField(term368398, term368398.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term368398, term368398.getClass(), "ignoreEmptyLines", true);
        setField(term368398, term368398.getClass(), "header", term365809);
        setBooleanField(term368398, term368398.getClass(), "skipHeaderRecord", true);
        setIntField(null, Class.forName("java.io.BufferedReader"), "defaultCharBufferSize", 256);
        Character term370334 = new Character((char) 0);
        Character term370335 = new Character((char) 0);
        Character term370336 = new Character((char) 0);
        term370333 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term370337 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term370333, term370333.getClass(), "delimiter", (char) 0);
        setField(term370333, term370333.getClass(), "quoteChar", term370334);
        setField(term370333, term370333.getClass(), "quotePolicy", null);
        setField(term370333, term370333.getClass(), "commentStart", term370335);
        setField(term370333, term370333.getClass(), "escape", term370336);
        setBooleanField(term370333, term370333.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term370333, term370333.getClass(), "ignoreEmptyHeaders", false);
        setBooleanField(term370333, term370333.getClass(), "ignoreEmptyLines", true);
        setField(term370333, term370333.getClass(), "recordSeparator", null);
        setField(term370333, term370333.getClass(), "nullString", null);
        setField(term370333, term370333.getClass(), "header", term370337);
        setBooleanField(term370333, term370333.getClass(), "skipHeaderRecord", true);
        Character term368569 = new Character((char) 0);
        Character term368571 = new Character((char) 0);
        Character term368573 = new Character((char) 0);
        LinkedHashMap term369970 = new LinkedHashMap();
        ArrayList term370255 = new ArrayList();
        Class<? extends Object> term370595 = Class.forName((String) "org.apache.commons.csv.Token$Type");
        Field term370594 = ((Class) term370595).getDeclaredField((String) "EOF");
        ((Field) term370594).setAccessible(true);
        Object enum118 = ((Field) term370594).get((Object) null);
        term369969 = newInstance(Class.forName("org.apache.commons.csv.CSVParser"));
        Object term368567 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term368578 = (Object[]) newArray("java.lang.String", 0);
        Object term369976 = newInstance(Class.forName("org.apache.commons.csv.Lexer"));
        Object term369983 = newInstance(Class.forName("org.apache.commons.csv.ExtendedBufferedReader"));
        Object term369987 = newInstance(Class.forName("java.io.StringReader"));
        char[] term369992 = (char[]) newCharArray(256);
        Object term370260 = newInstance(Class.forName("org.apache.commons.csv.Token"));
        Object term370268 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term370269 = (byte[]) newByteArray(50);
        setCharField(term368567, term368567.getClass(), "delimiter", (char) 0);
        setField(term368567, term368567.getClass(), "quoteChar", term368569);
        setField(term368567, term368567.getClass(), "quotePolicy", null);
        setField(term368567, term368567.getClass(), "commentStart", term368571);
        setField(term368567, term368567.getClass(), "escape", term368573);
        setBooleanField(term368567, term368567.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term368567, term368567.getClass(), "ignoreEmptyHeaders", false);
        setBooleanField(term368567, term368567.getClass(), "ignoreEmptyLines", true);
        setField(term368567, term368567.getClass(), "recordSeparator", null);
        setField(term368567, term368567.getClass(), "nullString", null);
        setField(term368567, term368567.getClass(), "header", term368578);
        setBooleanField(term368567, term368567.getClass(), "skipHeaderRecord", true);
        setField(term369969, term369969.getClass(), "format", term368567);
        setField(term369969, term369969.getClass(), "headerMap", term369970);
        setCharField(term369976, term369976.getClass(), "delimiter", (char) 0);
        setCharField(term369976, term369976.getClass(), "escape", (char) 0);
        setCharField(term369976, term369976.getClass(), "quoteChar", (char) 0);
        setCharField(term369976, term369976.getClass(), "commentStart", (char) 0);
        setBooleanField(term369976, term369976.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term369976, term369976.getClass(), "ignoreEmptyLines", true);
        setIntField(term369983, term369983.getClass(), "lastChar", -1);
        setLongField(term369983, term369983.getClass(), "eolCounter", 0L);
        setBooleanField(term369983, term369983.getClass(), "closed", false);
        setField(term369987, term369987.getClass(), "str", "");
        setIntField(term369987, term369987.getClass(), "length", 0);
        setIntField(term369987, term369987.getClass(), "next", 0);
        setIntField(term369987, term369987.getClass(), "mark", 0);
        setField(term369987, term369987.getClass(), "lock", term369987);
        setField(term369987, term369987.getClass(), "skipBuffer", null);
        setField(term369983, term369983.getClass(), "in", term369987);
        setField(term369983, term369983.getClass(), "cb", term369992);
        setIntField(term369983, term369983.getClass(), "nChars", 0);
        setIntField(term369983, term369983.getClass(), "nextChar", 0);
        setIntField(term369983, term369983.getClass(), "markedChar", -1);
        setIntField(term369983, term369983.getClass(), "readAheadLimit", 0);
        setBooleanField(term369983, term369983.getClass(), "skipLF", false);
        setBooleanField(term369983, term369983.getClass(), "markedSkipLF", false);
        setField(term369983, term369983.getClass(), "lock", term369987);
        setField(term369983, term369983.getClass(), "skipBuffer", null);
        setField(term369976, term369976.getClass(), "reader", term369983);
        setField(term369969, term369969.getClass(), "lexer", term369976);
        setField(term369969, term369969.getClass(), "record", term370255);
        setLongField(term369969, term369969.getClass(), "recordNumber", 0L);
        setField(term370260, term370260.getClass(), "type", enum118);
        setField(term370268, term370268.getClass(), "value", term370269);
        setByteField(term370268, term370268.getClass(), "coder", (byte) 0);
        setIntField(term370268, term370268.getClass(), "count", 0);
        setField(term370260, term370260.getClass(), "content", term370268);
        setBooleanField(term370260, term370260.getClass(), "isReady", false);
        setField(term369969, term369969.getClass(), "reusableToken", term370260);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("org.apache.commons.csv.CSVFormat");
        Object[] args = new Object[2];
        args[0] = "";
        args[1] = term368398;
        Object retValue = callMethod(klass, "parse", argTypes, null, args);
        assertTrue(recursiveEquals(term368398, term370333));
        assertTrue(recursiveEquals(retValue, term369969));
    }

};


