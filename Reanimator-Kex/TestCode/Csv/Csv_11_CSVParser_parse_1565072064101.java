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

public class CSVParser_parse_1565072064101 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term286032;
     Object term286727;
     Object term286611;

    public CSVParser_parse_1565072064101() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term286084 = new Character((char) 0);
        Character term286136 = new Character((char) 0);
        Character term286188 = new Character((char) 0);
        term286032 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term285522 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term286032, term286032.getClass(), "delimiter", (char) 0);
        setField(term286032, term286032.getClass(), "escape", term286084);
        setField(term286032, term286032.getClass(), "quoteChar", term286136);
        setField(term286032, term286032.getClass(), "commentStart", term286188);
        setBooleanField(term286032, term286032.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term286032, term286032.getClass(), "ignoreEmptyLines", true);
        setField(term286032, term286032.getClass(), "header", term285522);
        setIntField(null, Class.forName("java.io.BufferedReader"), "defaultCharBufferSize", 8);
        Character term286728 = new Character((char) 0);
        Character term286729 = new Character((char) 0);
        Character term286730 = new Character((char) 0);
        term286727 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term286731 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term286727, term286727.getClass(), "delimiter", (char) 0);
        setField(term286727, term286727.getClass(), "quoteChar", term286728);
        setField(term286727, term286727.getClass(), "quotePolicy", null);
        setField(term286727, term286727.getClass(), "commentStart", term286729);
        setField(term286727, term286727.getClass(), "escape", term286730);
        setBooleanField(term286727, term286727.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term286727, term286727.getClass(), "ignoreEmptyHeaders", false);
        setBooleanField(term286727, term286727.getClass(), "ignoreEmptyLines", true);
        setField(term286727, term286727.getClass(), "recordSeparator", null);
        setField(term286727, term286727.getClass(), "nullString", null);
        setField(term286727, term286727.getClass(), "header", term286731);
        setBooleanField(term286727, term286727.getClass(), "skipHeaderRecord", false);
        Character term286203 = new Character((char) 0);
        Character term286205 = new Character((char) 0);
        Character term286207 = new Character((char) 0);
        LinkedHashMap term286612 = new LinkedHashMap();
        ArrayList term286649 = new ArrayList();
        Class<? extends Object> term286741 = Class.forName((String) "org.apache.commons.csv.Token$Type");
        Field term286740 = ((Class) term286741).getDeclaredField((String) "EOF");
        ((Field) term286740).setAccessible(true);
        Object enum97 = ((Field) term286740).get((Object) null);
        term286611 = newInstance(Class.forName("org.apache.commons.csv.CSVParser"));
        Object term286201 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term286212 = (Object[]) newArray("java.lang.String", 0);
        Object term286618 = newInstance(Class.forName("org.apache.commons.csv.Lexer"));
        Object term286625 = newInstance(Class.forName("org.apache.commons.csv.ExtendedBufferedReader"));
        Object term286629 = newInstance(Class.forName("java.io.StringReader"));
        char[] term286634 = (char[]) newCharArray(8);
        Object term286654 = newInstance(Class.forName("org.apache.commons.csv.Token"));
        Object term286662 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term286663 = (byte[]) newByteArray(50);
        setCharField(term286201, term286201.getClass(), "delimiter", (char) 0);
        setField(term286201, term286201.getClass(), "quoteChar", term286203);
        setField(term286201, term286201.getClass(), "quotePolicy", null);
        setField(term286201, term286201.getClass(), "commentStart", term286205);
        setField(term286201, term286201.getClass(), "escape", term286207);
        setBooleanField(term286201, term286201.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term286201, term286201.getClass(), "ignoreEmptyHeaders", false);
        setBooleanField(term286201, term286201.getClass(), "ignoreEmptyLines", true);
        setField(term286201, term286201.getClass(), "recordSeparator", null);
        setField(term286201, term286201.getClass(), "nullString", null);
        setField(term286201, term286201.getClass(), "header", term286212);
        setBooleanField(term286201, term286201.getClass(), "skipHeaderRecord", false);
        setField(term286611, term286611.getClass(), "format", term286201);
        setField(term286611, term286611.getClass(), "headerMap", term286612);
        setCharField(term286618, term286618.getClass(), "delimiter", (char) 0);
        setCharField(term286618, term286618.getClass(), "escape", (char) 0);
        setCharField(term286618, term286618.getClass(), "quoteChar", (char) 0);
        setCharField(term286618, term286618.getClass(), "commentStart", (char) 0);
        setBooleanField(term286618, term286618.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term286618, term286618.getClass(), "ignoreEmptyLines", true);
        setIntField(term286625, term286625.getClass(), "lastChar", -1);
        setLongField(term286625, term286625.getClass(), "eolCounter", 0L);
        setBooleanField(term286625, term286625.getClass(), "closed", false);
        setField(term286629, term286629.getClass(), "str", "");
        setIntField(term286629, term286629.getClass(), "length", 0);
        setIntField(term286629, term286629.getClass(), "next", 0);
        setIntField(term286629, term286629.getClass(), "mark", 0);
        setField(term286629, term286629.getClass(), "lock", term286629);
        setField(term286629, term286629.getClass(), "skipBuffer", null);
        setField(term286625, term286625.getClass(), "in", term286629);
        setField(term286625, term286625.getClass(), "cb", term286634);
        setIntField(term286625, term286625.getClass(), "nChars", 0);
        setIntField(term286625, term286625.getClass(), "nextChar", 0);
        setIntField(term286625, term286625.getClass(), "markedChar", -1);
        setIntField(term286625, term286625.getClass(), "readAheadLimit", 0);
        setBooleanField(term286625, term286625.getClass(), "skipLF", false);
        setBooleanField(term286625, term286625.getClass(), "markedSkipLF", false);
        setField(term286625, term286625.getClass(), "lock", term286629);
        setField(term286625, term286625.getClass(), "skipBuffer", null);
        setField(term286618, term286618.getClass(), "reader", term286625);
        setField(term286611, term286611.getClass(), "lexer", term286618);
        setField(term286611, term286611.getClass(), "record", term286649);
        setLongField(term286611, term286611.getClass(), "recordNumber", 0L);
        setField(term286654, term286654.getClass(), "type", enum97);
        setField(term286662, term286662.getClass(), "value", term286663);
        setByteField(term286662, term286662.getClass(), "coder", (byte) 0);
        setIntField(term286662, term286662.getClass(), "count", 0);
        setField(term286654, term286654.getClass(), "content", term286662);
        setBooleanField(term286654, term286654.getClass(), "isReady", false);
        setField(term286611, term286611.getClass(), "reusableToken", term286654);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("org.apache.commons.csv.CSVFormat");
        Object[] args = new Object[2];
        args[0] = "";
        args[1] = term286032;
        Object retValue = callMethod(klass, "parse", argTypes, null, args);
        assertTrue(recursiveEquals(term286032, term286727));
        assertTrue(recursiveEquals(retValue, term286611));
    }

};


