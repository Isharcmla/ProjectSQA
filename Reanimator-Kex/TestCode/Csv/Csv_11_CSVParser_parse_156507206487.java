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

public class CSVParser_parse_156507206487 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term264225;
     Object term264943;
     Object term264831;

    public CSVParser_parse_156507206487() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term264277 = new Character((char) 65535);
        Character term264329 = new Character((char) 0);
        Character term264381 = new Character((char) 33296);
        term264225 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term262169 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term264225, term264225.getClass(), "delimiter", (char) 33296);
        setField(term264225, term264225.getClass(), "escape", term264277);
        setField(term264225, term264225.getClass(), "quoteChar", term264329);
        setField(term264225, term264225.getClass(), "commentStart", term264381);
        setBooleanField(term264225, term264225.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term264225, term264225.getClass(), "ignoreEmptyLines", true);
        setField(term264225, term264225.getClass(), "header", term262169);
        setBooleanField(term264225, term264225.getClass(), "skipHeaderRecord", true);
        setField(term264225, term264225.getClass(), "nullString", "");
        setIntField(null, Class.forName("java.io.BufferedReader"), "defaultCharBufferSize", 4);
        Character term264944 = new Character((char) 0);
        Character term264945 = new Character((char) 33296);
        Character term264946 = new Character((char) 65535);
        term264943 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term264949 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term264943, term264943.getClass(), "delimiter", (char) 33296);
        setField(term264943, term264943.getClass(), "quoteChar", term264944);
        setField(term264943, term264943.getClass(), "quotePolicy", null);
        setField(term264943, term264943.getClass(), "commentStart", term264945);
        setField(term264943, term264943.getClass(), "escape", term264946);
        setBooleanField(term264943, term264943.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term264943, term264943.getClass(), "ignoreEmptyHeaders", false);
        setBooleanField(term264943, term264943.getClass(), "ignoreEmptyLines", true);
        setField(term264943, term264943.getClass(), "recordSeparator", null);
        setField(term264943, term264943.getClass(), "nullString", "");
        setField(term264943, term264943.getClass(), "header", term264949);
        setBooleanField(term264943, term264943.getClass(), "skipHeaderRecord", true);
        Character term264435 = new Character((char) 0);
        Character term264437 = new Character((char) 33296);
        Character term264439 = new Character((char) 65535);
        LinkedHashMap term264832 = new LinkedHashMap();
        ArrayList term264865 = new ArrayList();
        Class<? extends Object> term264955 = Class.forName((String) "org.apache.commons.csv.Token$Type");
        Field term264954 = ((Class) term264955).getDeclaredField((String) "EOF");
        ((Field) term264954).setAccessible(true);
        Object enum91 = ((Field) term264954).get((Object) null);
        term264831 = newInstance(Class.forName("org.apache.commons.csv.CSVParser"));
        Object term264433 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term264446 = (Object[]) newArray("java.lang.String", 0);
        Object term264838 = newInstance(Class.forName("org.apache.commons.csv.Lexer"));
        Object term264845 = newInstance(Class.forName("org.apache.commons.csv.ExtendedBufferedReader"));
        Object term264849 = newInstance(Class.forName("java.io.StringReader"));
        char[] term264854 = (char[]) newCharArray(4);
        Object term264870 = newInstance(Class.forName("org.apache.commons.csv.Token"));
        Object term264878 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term264879 = (byte[]) newByteArray(50);
        setCharField(term264433, term264433.getClass(), "delimiter", (char) 33296);
        setField(term264433, term264433.getClass(), "quoteChar", term264435);
        setField(term264433, term264433.getClass(), "quotePolicy", null);
        setField(term264433, term264433.getClass(), "commentStart", term264437);
        setField(term264433, term264433.getClass(), "escape", term264439);
        setBooleanField(term264433, term264433.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term264433, term264433.getClass(), "ignoreEmptyHeaders", false);
        setBooleanField(term264433, term264433.getClass(), "ignoreEmptyLines", true);
        setField(term264433, term264433.getClass(), "recordSeparator", null);
        setField(term264433, term264433.getClass(), "nullString", "");
        setField(term264433, term264433.getClass(), "header", term264446);
        setBooleanField(term264433, term264433.getClass(), "skipHeaderRecord", true);
        setField(term264831, term264831.getClass(), "format", term264433);
        setField(term264831, term264831.getClass(), "headerMap", term264832);
        setCharField(term264838, term264838.getClass(), "delimiter", (char) 33296);
        setCharField(term264838, term264838.getClass(), "escape", (char) 65535);
        setCharField(term264838, term264838.getClass(), "quoteChar", (char) 0);
        setCharField(term264838, term264838.getClass(), "commentStart", (char) 33296);
        setBooleanField(term264838, term264838.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term264838, term264838.getClass(), "ignoreEmptyLines", true);
        setIntField(term264845, term264845.getClass(), "lastChar", -1);
        setLongField(term264845, term264845.getClass(), "eolCounter", 0L);
        setBooleanField(term264845, term264845.getClass(), "closed", false);
        setField(term264849, term264849.getClass(), "str", "");
        setIntField(term264849, term264849.getClass(), "length", 0);
        setIntField(term264849, term264849.getClass(), "next", 0);
        setIntField(term264849, term264849.getClass(), "mark", 0);
        setField(term264849, term264849.getClass(), "lock", term264849);
        setField(term264849, term264849.getClass(), "skipBuffer", null);
        setField(term264845, term264845.getClass(), "in", term264849);
        setField(term264845, term264845.getClass(), "cb", term264854);
        setIntField(term264845, term264845.getClass(), "nChars", 0);
        setIntField(term264845, term264845.getClass(), "nextChar", 0);
        setIntField(term264845, term264845.getClass(), "markedChar", -1);
        setIntField(term264845, term264845.getClass(), "readAheadLimit", 0);
        setBooleanField(term264845, term264845.getClass(), "skipLF", false);
        setBooleanField(term264845, term264845.getClass(), "markedSkipLF", false);
        setField(term264845, term264845.getClass(), "lock", term264849);
        setField(term264845, term264845.getClass(), "skipBuffer", null);
        setField(term264838, term264838.getClass(), "reader", term264845);
        setField(term264831, term264831.getClass(), "lexer", term264838);
        setField(term264831, term264831.getClass(), "record", term264865);
        setLongField(term264831, term264831.getClass(), "recordNumber", 0L);
        setField(term264870, term264870.getClass(), "type", enum91);
        setField(term264878, term264878.getClass(), "value", term264879);
        setByteField(term264878, term264878.getClass(), "coder", (byte) 0);
        setIntField(term264878, term264878.getClass(), "count", 0);
        setField(term264870, term264870.getClass(), "content", term264878);
        setBooleanField(term264870, term264870.getClass(), "isReady", false);
        setField(term264831, term264831.getClass(), "reusableToken", term264870);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("org.apache.commons.csv.CSVFormat");
        Object[] args = new Object[2];
        args[0] = "";
        args[1] = term264225;
        Object retValue = callMethod(klass, "parse", argTypes, null, args);
        assertTrue(recursiveEquals(term264225, term264943));
        assertTrue(recursiveEquals(retValue, term264831));
    }

};


