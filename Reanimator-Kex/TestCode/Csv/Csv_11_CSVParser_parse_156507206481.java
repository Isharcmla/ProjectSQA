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

public class CSVParser_parse_156507206481 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term249013;
     Object term249987;
     Object term249815;

    public CSVParser_parse_156507206481() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term249065 = new Character((char) 0);
        Character term249117 = new Character((char) 0);
        Character term249169 = new Character((char) 0);
        term249013 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term246651 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term249013, term249013.getClass(), "delimiter", (char) 0);
        setField(term249013, term249013.getClass(), "escape", term249065);
        setField(term249013, term249013.getClass(), "quoteChar", term249117);
        setField(term249013, term249013.getClass(), "commentStart", term249169);
        setBooleanField(term249013, term249013.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term249013, term249013.getClass(), "ignoreEmptyLines", false);
        setField(term249013, term249013.getClass(), "header", term246651);
        setIntField(null, Class.forName("java.io.BufferedReader"), "defaultCharBufferSize", 64);
        Character term249988 = new Character((char) 0);
        Character term249989 = new Character((char) 0);
        Character term249990 = new Character((char) 0);
        term249987 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term249991 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term249987, term249987.getClass(), "delimiter", (char) 0);
        setField(term249987, term249987.getClass(), "quoteChar", term249988);
        setField(term249987, term249987.getClass(), "quotePolicy", null);
        setField(term249987, term249987.getClass(), "commentStart", term249989);
        setField(term249987, term249987.getClass(), "escape", term249990);
        setBooleanField(term249987, term249987.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term249987, term249987.getClass(), "ignoreEmptyHeaders", false);
        setBooleanField(term249987, term249987.getClass(), "ignoreEmptyLines", false);
        setField(term249987, term249987.getClass(), "recordSeparator", null);
        setField(term249987, term249987.getClass(), "nullString", null);
        setField(term249987, term249987.getClass(), "header", term249991);
        setBooleanField(term249987, term249987.getClass(), "skipHeaderRecord", false);
        Character term249184 = new Character((char) 0);
        Character term249186 = new Character((char) 0);
        Character term249188 = new Character((char) 0);
        LinkedHashMap term249816 = new LinkedHashMap();
        ArrayList term249909 = new ArrayList();
        Class<? extends Object> term250057 = Class.forName((String) "org.apache.commons.csv.Token$Type");
        Field term250056 = ((Class) term250057).getDeclaredField((String) "EOF");
        ((Field) term250056).setAccessible(true);
        Object enum88 = ((Field) term250056).get((Object) null);
        term249815 = newInstance(Class.forName("org.apache.commons.csv.CSVParser"));
        Object term249182 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term249193 = (Object[]) newArray("java.lang.String", 0);
        Object term249822 = newInstance(Class.forName("org.apache.commons.csv.Lexer"));
        Object term249829 = newInstance(Class.forName("org.apache.commons.csv.ExtendedBufferedReader"));
        Object term249833 = newInstance(Class.forName("java.io.StringReader"));
        char[] term249838 = (char[]) newCharArray(64);
        Object term249914 = newInstance(Class.forName("org.apache.commons.csv.Token"));
        Object term249922 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term249923 = (byte[]) newByteArray(50);
        setCharField(term249182, term249182.getClass(), "delimiter", (char) 0);
        setField(term249182, term249182.getClass(), "quoteChar", term249184);
        setField(term249182, term249182.getClass(), "quotePolicy", null);
        setField(term249182, term249182.getClass(), "commentStart", term249186);
        setField(term249182, term249182.getClass(), "escape", term249188);
        setBooleanField(term249182, term249182.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term249182, term249182.getClass(), "ignoreEmptyHeaders", false);
        setBooleanField(term249182, term249182.getClass(), "ignoreEmptyLines", false);
        setField(term249182, term249182.getClass(), "recordSeparator", null);
        setField(term249182, term249182.getClass(), "nullString", null);
        setField(term249182, term249182.getClass(), "header", term249193);
        setBooleanField(term249182, term249182.getClass(), "skipHeaderRecord", false);
        setField(term249815, term249815.getClass(), "format", term249182);
        setField(term249815, term249815.getClass(), "headerMap", term249816);
        setCharField(term249822, term249822.getClass(), "delimiter", (char) 0);
        setCharField(term249822, term249822.getClass(), "escape", (char) 0);
        setCharField(term249822, term249822.getClass(), "quoteChar", (char) 0);
        setCharField(term249822, term249822.getClass(), "commentStart", (char) 0);
        setBooleanField(term249822, term249822.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term249822, term249822.getClass(), "ignoreEmptyLines", false);
        setIntField(term249829, term249829.getClass(), "lastChar", -1);
        setLongField(term249829, term249829.getClass(), "eolCounter", 0L);
        setBooleanField(term249829, term249829.getClass(), "closed", false);
        setField(term249833, term249833.getClass(), "str", "");
        setIntField(term249833, term249833.getClass(), "length", 0);
        setIntField(term249833, term249833.getClass(), "next", 0);
        setIntField(term249833, term249833.getClass(), "mark", 0);
        setField(term249833, term249833.getClass(), "lock", term249833);
        setField(term249833, term249833.getClass(), "skipBuffer", null);
        setField(term249829, term249829.getClass(), "in", term249833);
        setField(term249829, term249829.getClass(), "cb", term249838);
        setIntField(term249829, term249829.getClass(), "nChars", 0);
        setIntField(term249829, term249829.getClass(), "nextChar", 0);
        setIntField(term249829, term249829.getClass(), "markedChar", -1);
        setIntField(term249829, term249829.getClass(), "readAheadLimit", 0);
        setBooleanField(term249829, term249829.getClass(), "skipLF", false);
        setBooleanField(term249829, term249829.getClass(), "markedSkipLF", false);
        setField(term249829, term249829.getClass(), "lock", term249833);
        setField(term249829, term249829.getClass(), "skipBuffer", null);
        setField(term249822, term249822.getClass(), "reader", term249829);
        setField(term249815, term249815.getClass(), "lexer", term249822);
        setField(term249815, term249815.getClass(), "record", term249909);
        setLongField(term249815, term249815.getClass(), "recordNumber", 0L);
        setField(term249914, term249914.getClass(), "type", enum88);
        setField(term249922, term249922.getClass(), "value", term249923);
        setByteField(term249922, term249922.getClass(), "coder", (byte) 0);
        setIntField(term249922, term249922.getClass(), "count", 0);
        setField(term249914, term249914.getClass(), "content", term249922);
        setBooleanField(term249914, term249914.getClass(), "isReady", false);
        setField(term249815, term249815.getClass(), "reusableToken", term249914);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("org.apache.commons.csv.CSVFormat");
        Object[] args = new Object[2];
        args[0] = "";
        args[1] = term249013;
        Object retValue = callMethod(klass, "parse", argTypes, null, args);
        assertTrue(recursiveEquals(term249013, term249987));
        assertTrue(recursiveEquals(retValue, term249815));
    }

};


