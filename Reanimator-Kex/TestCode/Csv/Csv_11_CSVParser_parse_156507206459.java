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

public class CSVParser_parse_156507206459 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term204192;
     Object term205007;
     Object term204867;

    public CSVParser_parse_156507206459() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term204244 = new Character((char) 0);
        Character term204296 = new Character((char) 0);
        Character term204348 = new Character((char) 0);
        term204192 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term201808 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term204192, term204192.getClass(), "delimiter", (char) 0);
        setField(term204192, term204192.getClass(), "escape", term204244);
        setField(term204192, term204192.getClass(), "quoteChar", term204296);
        setField(term204192, term204192.getClass(), "commentStart", term204348);
        setBooleanField(term204192, term204192.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term204192, term204192.getClass(), "ignoreEmptyLines", true);
        setField(term204192, term204192.getClass(), "header", term201808);
        setIntField(null, Class.forName("java.io.BufferedReader"), "defaultCharBufferSize", 32);
        Character term205008 = new Character((char) 0);
        Character term205009 = new Character((char) 0);
        Character term205010 = new Character((char) 0);
        term205007 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term205011 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term205007, term205007.getClass(), "delimiter", (char) 0);
        setField(term205007, term205007.getClass(), "quoteChar", term205008);
        setField(term205007, term205007.getClass(), "quotePolicy", null);
        setField(term205007, term205007.getClass(), "commentStart", term205009);
        setField(term205007, term205007.getClass(), "escape", term205010);
        setBooleanField(term205007, term205007.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term205007, term205007.getClass(), "ignoreEmptyHeaders", false);
        setBooleanField(term205007, term205007.getClass(), "ignoreEmptyLines", true);
        setField(term205007, term205007.getClass(), "recordSeparator", null);
        setField(term205007, term205007.getClass(), "nullString", null);
        setField(term205007, term205007.getClass(), "header", term205011);
        setBooleanField(term205007, term205007.getClass(), "skipHeaderRecord", false);
        Character term204363 = new Character((char) 0);
        Character term204365 = new Character((char) 0);
        Character term204367 = new Character((char) 0);
        LinkedHashMap term204868 = new LinkedHashMap();
        ArrayList term204929 = new ArrayList();
        Class<? extends Object> term205045 = Class.forName((String) "org.apache.commons.csv.Token$Type");
        Field term205044 = ((Class) term205045).getDeclaredField((String) "EOF");
        ((Field) term205044).setAccessible(true);
        Object enum80 = ((Field) term205044).get((Object) null);
        term204867 = newInstance(Class.forName("org.apache.commons.csv.CSVParser"));
        Object term204361 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term204372 = (Object[]) newArray("java.lang.String", 0);
        Object term204874 = newInstance(Class.forName("org.apache.commons.csv.Lexer"));
        Object term204881 = newInstance(Class.forName("org.apache.commons.csv.ExtendedBufferedReader"));
        Object term204885 = newInstance(Class.forName("java.io.StringReader"));
        char[] term204890 = (char[]) newCharArray(32);
        Object term204934 = newInstance(Class.forName("org.apache.commons.csv.Token"));
        Object term204942 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term204943 = (byte[]) newByteArray(50);
        setCharField(term204361, term204361.getClass(), "delimiter", (char) 0);
        setField(term204361, term204361.getClass(), "quoteChar", term204363);
        setField(term204361, term204361.getClass(), "quotePolicy", null);
        setField(term204361, term204361.getClass(), "commentStart", term204365);
        setField(term204361, term204361.getClass(), "escape", term204367);
        setBooleanField(term204361, term204361.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term204361, term204361.getClass(), "ignoreEmptyHeaders", false);
        setBooleanField(term204361, term204361.getClass(), "ignoreEmptyLines", true);
        setField(term204361, term204361.getClass(), "recordSeparator", null);
        setField(term204361, term204361.getClass(), "nullString", null);
        setField(term204361, term204361.getClass(), "header", term204372);
        setBooleanField(term204361, term204361.getClass(), "skipHeaderRecord", false);
        setField(term204867, term204867.getClass(), "format", term204361);
        setField(term204867, term204867.getClass(), "headerMap", term204868);
        setCharField(term204874, term204874.getClass(), "delimiter", (char) 0);
        setCharField(term204874, term204874.getClass(), "escape", (char) 0);
        setCharField(term204874, term204874.getClass(), "quoteChar", (char) 0);
        setCharField(term204874, term204874.getClass(), "commentStart", (char) 0);
        setBooleanField(term204874, term204874.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term204874, term204874.getClass(), "ignoreEmptyLines", true);
        setIntField(term204881, term204881.getClass(), "lastChar", -1);
        setLongField(term204881, term204881.getClass(), "eolCounter", 0L);
        setBooleanField(term204881, term204881.getClass(), "closed", false);
        setField(term204885, term204885.getClass(), "str", "");
        setIntField(term204885, term204885.getClass(), "length", 0);
        setIntField(term204885, term204885.getClass(), "next", 0);
        setIntField(term204885, term204885.getClass(), "mark", 0);
        setField(term204885, term204885.getClass(), "lock", term204885);
        setField(term204885, term204885.getClass(), "skipBuffer", null);
        setField(term204881, term204881.getClass(), "in", term204885);
        setField(term204881, term204881.getClass(), "cb", term204890);
        setIntField(term204881, term204881.getClass(), "nChars", 0);
        setIntField(term204881, term204881.getClass(), "nextChar", 0);
        setIntField(term204881, term204881.getClass(), "markedChar", -1);
        setIntField(term204881, term204881.getClass(), "readAheadLimit", 0);
        setBooleanField(term204881, term204881.getClass(), "skipLF", false);
        setBooleanField(term204881, term204881.getClass(), "markedSkipLF", false);
        setField(term204881, term204881.getClass(), "lock", term204885);
        setField(term204881, term204881.getClass(), "skipBuffer", null);
        setField(term204874, term204874.getClass(), "reader", term204881);
        setField(term204867, term204867.getClass(), "lexer", term204874);
        setField(term204867, term204867.getClass(), "record", term204929);
        setLongField(term204867, term204867.getClass(), "recordNumber", 0L);
        setField(term204934, term204934.getClass(), "type", enum80);
        setField(term204942, term204942.getClass(), "value", term204943);
        setByteField(term204942, term204942.getClass(), "coder", (byte) 0);
        setIntField(term204942, term204942.getClass(), "count", 0);
        setField(term204934, term204934.getClass(), "content", term204942);
        setBooleanField(term204934, term204934.getClass(), "isReady", false);
        setField(term204867, term204867.getClass(), "reusableToken", term204934);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("org.apache.commons.csv.CSVFormat");
        Object[] args = new Object[2];
        args[0] = "";
        args[1] = term204192;
        Object retValue = callMethod(klass, "parse", argTypes, null, args);
        assertTrue(recursiveEquals(term204192, term205007));
        assertTrue(recursiveEquals(retValue, term204867));
    }

};


