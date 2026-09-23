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

public class CSVParser_parse_1565072064127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term321803;
     Object term325018;
     Object term324398;

    public CSVParser_parse_1565072064127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term321855 = new Character((char) 0);
        Character term321907 = new Character((char) 0);
        Character term321959 = new Character((char) 0);
        term321803 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term320793 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term321803, term321803.getClass(), "delimiter", (char) 0);
        setField(term321803, term321803.getClass(), "escape", term321855);
        setField(term321803, term321803.getClass(), "quoteChar", term321907);
        setField(term321803, term321803.getClass(), "commentStart", term321959);
        setBooleanField(term321803, term321803.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term321803, term321803.getClass(), "ignoreEmptyLines", true);
        setField(term321803, term321803.getClass(), "header", term320793);
        setBooleanField(term321803, term321803.getClass(), "skipHeaderRecord", true);
        setIntField(null, Class.forName("java.io.BufferedReader"), "defaultCharBufferSize", 512);
        Character term325019 = new Character((char) 0);
        Character term325020 = new Character((char) 0);
        Character term325021 = new Character((char) 0);
        term325018 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term325022 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term325018, term325018.getClass(), "delimiter", (char) 0);
        setField(term325018, term325018.getClass(), "quoteChar", term325019);
        setField(term325018, term325018.getClass(), "quotePolicy", null);
        setField(term325018, term325018.getClass(), "commentStart", term325020);
        setField(term325018, term325018.getClass(), "escape", term325021);
        setBooleanField(term325018, term325018.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term325018, term325018.getClass(), "ignoreEmptyHeaders", false);
        setBooleanField(term325018, term325018.getClass(), "ignoreEmptyLines", true);
        setField(term325018, term325018.getClass(), "recordSeparator", null);
        setField(term325018, term325018.getClass(), "nullString", null);
        setField(term325018, term325018.getClass(), "header", term325022);
        setBooleanField(term325018, term325018.getClass(), "skipHeaderRecord", true);
        Character term321974 = new Character((char) 0);
        Character term321976 = new Character((char) 0);
        Character term321978 = new Character((char) 0);
        LinkedHashMap term324399 = new LinkedHashMap();
        ArrayList term324940 = new ArrayList();
        Class<? extends Object> term325536 = Class.forName((String) "org.apache.commons.csv.Token$Type");
        Field term325535 = ((Class) term325536).getDeclaredField((String) "EOF");
        ((Field) term325535).setAccessible(true);
        Object enum107 = ((Field) term325535).get((Object) null);
        term324398 = newInstance(Class.forName("org.apache.commons.csv.CSVParser"));
        Object term321972 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term321983 = (Object[]) newArray("java.lang.String", 0);
        Object term324405 = newInstance(Class.forName("org.apache.commons.csv.Lexer"));
        Object term324412 = newInstance(Class.forName("org.apache.commons.csv.ExtendedBufferedReader"));
        Object term324416 = newInstance(Class.forName("java.io.StringReader"));
        char[] term324421 = (char[]) newCharArray(512);
        Object term324945 = newInstance(Class.forName("org.apache.commons.csv.Token"));
        Object term324953 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term324954 = (byte[]) newByteArray(50);
        setCharField(term321972, term321972.getClass(), "delimiter", (char) 0);
        setField(term321972, term321972.getClass(), "quoteChar", term321974);
        setField(term321972, term321972.getClass(), "quotePolicy", null);
        setField(term321972, term321972.getClass(), "commentStart", term321976);
        setField(term321972, term321972.getClass(), "escape", term321978);
        setBooleanField(term321972, term321972.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term321972, term321972.getClass(), "ignoreEmptyHeaders", false);
        setBooleanField(term321972, term321972.getClass(), "ignoreEmptyLines", true);
        setField(term321972, term321972.getClass(), "recordSeparator", null);
        setField(term321972, term321972.getClass(), "nullString", null);
        setField(term321972, term321972.getClass(), "header", term321983);
        setBooleanField(term321972, term321972.getClass(), "skipHeaderRecord", true);
        setField(term324398, term324398.getClass(), "format", term321972);
        setField(term324398, term324398.getClass(), "headerMap", term324399);
        setCharField(term324405, term324405.getClass(), "delimiter", (char) 0);
        setCharField(term324405, term324405.getClass(), "escape", (char) 0);
        setCharField(term324405, term324405.getClass(), "quoteChar", (char) 0);
        setCharField(term324405, term324405.getClass(), "commentStart", (char) 0);
        setBooleanField(term324405, term324405.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term324405, term324405.getClass(), "ignoreEmptyLines", true);
        setIntField(term324412, term324412.getClass(), "lastChar", -1);
        setLongField(term324412, term324412.getClass(), "eolCounter", 0L);
        setBooleanField(term324412, term324412.getClass(), "closed", false);
        setField(term324416, term324416.getClass(), "str", "");
        setIntField(term324416, term324416.getClass(), "length", 0);
        setIntField(term324416, term324416.getClass(), "next", 0);
        setIntField(term324416, term324416.getClass(), "mark", 0);
        setField(term324416, term324416.getClass(), "lock", term324416);
        setField(term324416, term324416.getClass(), "skipBuffer", null);
        setField(term324412, term324412.getClass(), "in", term324416);
        setField(term324412, term324412.getClass(), "cb", term324421);
        setIntField(term324412, term324412.getClass(), "nChars", 0);
        setIntField(term324412, term324412.getClass(), "nextChar", 0);
        setIntField(term324412, term324412.getClass(), "markedChar", -1);
        setIntField(term324412, term324412.getClass(), "readAheadLimit", 0);
        setBooleanField(term324412, term324412.getClass(), "skipLF", false);
        setBooleanField(term324412, term324412.getClass(), "markedSkipLF", false);
        setField(term324412, term324412.getClass(), "lock", term324416);
        setField(term324412, term324412.getClass(), "skipBuffer", null);
        setField(term324405, term324405.getClass(), "reader", term324412);
        setField(term324398, term324398.getClass(), "lexer", term324405);
        setField(term324398, term324398.getClass(), "record", term324940);
        setLongField(term324398, term324398.getClass(), "recordNumber", 0L);
        setField(term324945, term324945.getClass(), "type", enum107);
        setField(term324953, term324953.getClass(), "value", term324954);
        setByteField(term324953, term324953.getClass(), "coder", (byte) 0);
        setIntField(term324953, term324953.getClass(), "count", 0);
        setField(term324945, term324945.getClass(), "content", term324953);
        setBooleanField(term324945, term324945.getClass(), "isReady", false);
        setField(term324398, term324398.getClass(), "reusableToken", term324945);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("org.apache.commons.csv.CSVFormat");
        Object[] args = new Object[2];
        args[0] = "";
        args[1] = term321803;
        Object retValue = callMethod(klass, "parse", argTypes, null, args);
        assertTrue(recursiveEquals(term321803, term325018));
        assertTrue(recursiveEquals(retValue, term324398));
    }

};


