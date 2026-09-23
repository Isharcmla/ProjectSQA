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

public class CSVParser_parse_1565072064131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term329251;
     Object term336285;
     Object term335665;

    public CSVParser_parse_1565072064131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term329303 = new Character((char) 0);
        Character term329355 = new Character((char) 0);
        Character term329407 = new Character((char) 0);
        term329251 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term328399 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term329251, term329251.getClass(), "delimiter", (char) 0);
        setField(term329251, term329251.getClass(), "escape", term329303);
        setField(term329251, term329251.getClass(), "quoteChar", term329355);
        setField(term329251, term329251.getClass(), "commentStart", term329407);
        setBooleanField(term329251, term329251.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term329251, term329251.getClass(), "ignoreEmptyLines", true);
        setField(term329251, term329251.getClass(), "header", term328399);
        setBooleanField(term329251, term329251.getClass(), "skipHeaderRecord", true);
        setIntField(null, Class.forName("java.io.BufferedReader"), "defaultCharBufferSize", 512);
        Character term336286 = new Character((char) 0);
        Character term336287 = new Character((char) 0);
        Character term336288 = new Character((char) 0);
        term336285 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term336289 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term336285, term336285.getClass(), "delimiter", (char) 0);
        setField(term336285, term336285.getClass(), "quoteChar", term336286);
        setField(term336285, term336285.getClass(), "quotePolicy", null);
        setField(term336285, term336285.getClass(), "commentStart", term336287);
        setField(term336285, term336285.getClass(), "escape", term336288);
        setBooleanField(term336285, term336285.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term336285, term336285.getClass(), "ignoreEmptyHeaders", false);
        setBooleanField(term336285, term336285.getClass(), "ignoreEmptyLines", true);
        setField(term336285, term336285.getClass(), "recordSeparator", null);
        setField(term336285, term336285.getClass(), "nullString", null);
        setField(term336285, term336285.getClass(), "header", term336289);
        setBooleanField(term336285, term336285.getClass(), "skipHeaderRecord", true);
        Character term333241 = new Character((char) 0);
        Character term333243 = new Character((char) 0);
        Character term333245 = new Character((char) 0);
        LinkedHashMap term335666 = new LinkedHashMap();
        ArrayList term336207 = new ArrayList();
        Class<? extends Object> term336803 = Class.forName((String) "org.apache.commons.csv.Token$Type");
        Field term336802 = ((Class) term336803).getDeclaredField((String) "EOF");
        ((Field) term336802).setAccessible(true);
        Object enum109 = ((Field) term336802).get((Object) null);
        term335665 = newInstance(Class.forName("org.apache.commons.csv.CSVParser"));
        Object term333239 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term333250 = (Object[]) newArray("java.lang.String", 0);
        Object term335672 = newInstance(Class.forName("org.apache.commons.csv.Lexer"));
        Object term335679 = newInstance(Class.forName("org.apache.commons.csv.ExtendedBufferedReader"));
        Object term335683 = newInstance(Class.forName("java.io.StringReader"));
        char[] term335688 = (char[]) newCharArray(512);
        Object term336212 = newInstance(Class.forName("org.apache.commons.csv.Token"));
        Object term336220 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term336221 = (byte[]) newByteArray(50);
        setCharField(term333239, term333239.getClass(), "delimiter", (char) 0);
        setField(term333239, term333239.getClass(), "quoteChar", term333241);
        setField(term333239, term333239.getClass(), "quotePolicy", null);
        setField(term333239, term333239.getClass(), "commentStart", term333243);
        setField(term333239, term333239.getClass(), "escape", term333245);
        setBooleanField(term333239, term333239.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term333239, term333239.getClass(), "ignoreEmptyHeaders", false);
        setBooleanField(term333239, term333239.getClass(), "ignoreEmptyLines", true);
        setField(term333239, term333239.getClass(), "recordSeparator", null);
        setField(term333239, term333239.getClass(), "nullString", null);
        setField(term333239, term333239.getClass(), "header", term333250);
        setBooleanField(term333239, term333239.getClass(), "skipHeaderRecord", true);
        setField(term335665, term335665.getClass(), "format", term333239);
        setField(term335665, term335665.getClass(), "headerMap", term335666);
        setCharField(term335672, term335672.getClass(), "delimiter", (char) 0);
        setCharField(term335672, term335672.getClass(), "escape", (char) 0);
        setCharField(term335672, term335672.getClass(), "quoteChar", (char) 0);
        setCharField(term335672, term335672.getClass(), "commentStart", (char) 0);
        setBooleanField(term335672, term335672.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term335672, term335672.getClass(), "ignoreEmptyLines", true);
        setIntField(term335679, term335679.getClass(), "lastChar", -1);
        setLongField(term335679, term335679.getClass(), "eolCounter", 0L);
        setBooleanField(term335679, term335679.getClass(), "closed", false);
        setField(term335683, term335683.getClass(), "str", "");
        setIntField(term335683, term335683.getClass(), "length", 0);
        setIntField(term335683, term335683.getClass(), "next", 0);
        setIntField(term335683, term335683.getClass(), "mark", 0);
        setField(term335683, term335683.getClass(), "lock", term335683);
        setField(term335683, term335683.getClass(), "skipBuffer", null);
        setField(term335679, term335679.getClass(), "in", term335683);
        setField(term335679, term335679.getClass(), "cb", term335688);
        setIntField(term335679, term335679.getClass(), "nChars", 0);
        setIntField(term335679, term335679.getClass(), "nextChar", 0);
        setIntField(term335679, term335679.getClass(), "markedChar", -1);
        setIntField(term335679, term335679.getClass(), "readAheadLimit", 0);
        setBooleanField(term335679, term335679.getClass(), "skipLF", false);
        setBooleanField(term335679, term335679.getClass(), "markedSkipLF", false);
        setField(term335679, term335679.getClass(), "lock", term335683);
        setField(term335679, term335679.getClass(), "skipBuffer", null);
        setField(term335672, term335672.getClass(), "reader", term335679);
        setField(term335665, term335665.getClass(), "lexer", term335672);
        setField(term335665, term335665.getClass(), "record", term336207);
        setLongField(term335665, term335665.getClass(), "recordNumber", 0L);
        setField(term336212, term336212.getClass(), "type", enum109);
        setField(term336220, term336220.getClass(), "value", term336221);
        setByteField(term336220, term336220.getClass(), "coder", (byte) 0);
        setIntField(term336220, term336220.getClass(), "count", 0);
        setField(term336212, term336212.getClass(), "content", term336220);
        setBooleanField(term336212, term336212.getClass(), "isReady", false);
        setField(term335665, term335665.getClass(), "reusableToken", term336212);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("org.apache.commons.csv.CSVFormat");
        Object[] args = new Object[2];
        args[0] = "";
        args[1] = term329251;
        Object retValue = callMethod(klass, "parse", argTypes, null, args);
        assertTrue(recursiveEquals(term329251, term336285));
        assertTrue(recursiveEquals(retValue, term335665));
    }

};


