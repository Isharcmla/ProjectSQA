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

public class CSVParser_parse_156507206449 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term189262;
     Object term189967;
     Object term189849;

    public CSVParser_parse_156507206449() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term189314 = new Character((char) 0);
        Character term189366 = new Character((char) 0);
        Character term189418 = new Character((char) 0);
        term189262 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term188592 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term189262, term189262.getClass(), "delimiter", (char) 0);
        setField(term189262, term189262.getClass(), "escape", term189314);
        setField(term189262, term189262.getClass(), "quoteChar", term189366);
        setField(term189262, term189262.getClass(), "commentStart", term189418);
        setBooleanField(term189262, term189262.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term189262, term189262.getClass(), "ignoreEmptyLines", true);
        setField(term189262, term189262.getClass(), "header", term188592);
        setBooleanField(term189262, term189262.getClass(), "skipHeaderRecord", true);
        setIntField(null, Class.forName("java.io.BufferedReader"), "defaultCharBufferSize", 10);
        Character term189968 = new Character((char) 0);
        Character term189969 = new Character((char) 0);
        Character term189970 = new Character((char) 0);
        term189967 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term189971 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term189967, term189967.getClass(), "delimiter", (char) 0);
        setField(term189967, term189967.getClass(), "quoteChar", term189968);
        setField(term189967, term189967.getClass(), "quotePolicy", null);
        setField(term189967, term189967.getClass(), "commentStart", term189969);
        setField(term189967, term189967.getClass(), "escape", term189970);
        setBooleanField(term189967, term189967.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term189967, term189967.getClass(), "ignoreEmptyHeaders", false);
        setBooleanField(term189967, term189967.getClass(), "ignoreEmptyLines", true);
        setField(term189967, term189967.getClass(), "recordSeparator", null);
        setField(term189967, term189967.getClass(), "nullString", null);
        setField(term189967, term189967.getClass(), "header", term189971);
        setBooleanField(term189967, term189967.getClass(), "skipHeaderRecord", true);
        Character term189433 = new Character((char) 0);
        Character term189435 = new Character((char) 0);
        Character term189437 = new Character((char) 0);
        LinkedHashMap term189850 = new LinkedHashMap();
        ArrayList term189889 = new ArrayList();
        Class<? extends Object> term189983 = Class.forName((String) "org.apache.commons.csv.Token$Type");
        Field term189982 = ((Class) term189983).getDeclaredField((String) "EOF");
        ((Field) term189982).setAccessible(true);
        Object enum76 = ((Field) term189982).get((Object) null);
        term189849 = newInstance(Class.forName("org.apache.commons.csv.CSVParser"));
        Object term189431 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term189442 = (Object[]) newArray("java.lang.String", 0);
        Object term189856 = newInstance(Class.forName("org.apache.commons.csv.Lexer"));
        Object term189863 = newInstance(Class.forName("org.apache.commons.csv.ExtendedBufferedReader"));
        Object term189867 = newInstance(Class.forName("java.io.StringReader"));
        char[] term189872 = (char[]) newCharArray(10);
        Object term189894 = newInstance(Class.forName("org.apache.commons.csv.Token"));
        Object term189902 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term189903 = (byte[]) newByteArray(50);
        setCharField(term189431, term189431.getClass(), "delimiter", (char) 0);
        setField(term189431, term189431.getClass(), "quoteChar", term189433);
        setField(term189431, term189431.getClass(), "quotePolicy", null);
        setField(term189431, term189431.getClass(), "commentStart", term189435);
        setField(term189431, term189431.getClass(), "escape", term189437);
        setBooleanField(term189431, term189431.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term189431, term189431.getClass(), "ignoreEmptyHeaders", false);
        setBooleanField(term189431, term189431.getClass(), "ignoreEmptyLines", true);
        setField(term189431, term189431.getClass(), "recordSeparator", null);
        setField(term189431, term189431.getClass(), "nullString", null);
        setField(term189431, term189431.getClass(), "header", term189442);
        setBooleanField(term189431, term189431.getClass(), "skipHeaderRecord", true);
        setField(term189849, term189849.getClass(), "format", term189431);
        setField(term189849, term189849.getClass(), "headerMap", term189850);
        setCharField(term189856, term189856.getClass(), "delimiter", (char) 0);
        setCharField(term189856, term189856.getClass(), "escape", (char) 0);
        setCharField(term189856, term189856.getClass(), "quoteChar", (char) 0);
        setCharField(term189856, term189856.getClass(), "commentStart", (char) 0);
        setBooleanField(term189856, term189856.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term189856, term189856.getClass(), "ignoreEmptyLines", true);
        setIntField(term189863, term189863.getClass(), "lastChar", -1);
        setLongField(term189863, term189863.getClass(), "eolCounter", 0L);
        setBooleanField(term189863, term189863.getClass(), "closed", false);
        setField(term189867, term189867.getClass(), "str", "");
        setIntField(term189867, term189867.getClass(), "length", 0);
        setIntField(term189867, term189867.getClass(), "next", 0);
        setIntField(term189867, term189867.getClass(), "mark", 0);
        setField(term189867, term189867.getClass(), "lock", term189867);
        setField(term189867, term189867.getClass(), "skipBuffer", null);
        setField(term189863, term189863.getClass(), "in", term189867);
        setField(term189863, term189863.getClass(), "cb", term189872);
        setIntField(term189863, term189863.getClass(), "nChars", 0);
        setIntField(term189863, term189863.getClass(), "nextChar", 0);
        setIntField(term189863, term189863.getClass(), "markedChar", -1);
        setIntField(term189863, term189863.getClass(), "readAheadLimit", 0);
        setBooleanField(term189863, term189863.getClass(), "skipLF", false);
        setBooleanField(term189863, term189863.getClass(), "markedSkipLF", false);
        setField(term189863, term189863.getClass(), "lock", term189867);
        setField(term189863, term189863.getClass(), "skipBuffer", null);
        setField(term189856, term189856.getClass(), "reader", term189863);
        setField(term189849, term189849.getClass(), "lexer", term189856);
        setField(term189849, term189849.getClass(), "record", term189889);
        setLongField(term189849, term189849.getClass(), "recordNumber", 0L);
        setField(term189894, term189894.getClass(), "type", enum76);
        setField(term189902, term189902.getClass(), "value", term189903);
        setByteField(term189902, term189902.getClass(), "coder", (byte) 0);
        setIntField(term189902, term189902.getClass(), "count", 0);
        setField(term189894, term189894.getClass(), "content", term189902);
        setBooleanField(term189894, term189894.getClass(), "isReady", false);
        setField(term189849, term189849.getClass(), "reusableToken", term189894);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("org.apache.commons.csv.CSVFormat");
        Object[] args = new Object[2];
        args[0] = "";
        args[1] = term189262;
        Object retValue = callMethod(klass, "parse", argTypes, null, args);
        assertTrue(recursiveEquals(term189262, term189967));
        assertTrue(recursiveEquals(retValue, term189849));
    }

};


