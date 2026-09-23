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

public class CSVParser_parse_156507206455 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term196805;
     Object term198060;
     Object term197832;

    public CSVParser_parse_156507206455() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term196857 = new Character((char) 0);
        Character term196909 = new Character((char) 0);
        Character term196961 = new Character((char) 0);
        term196805 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term195203 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term196805, term196805.getClass(), "delimiter", (char) 0);
        setField(term196805, term196805.getClass(), "escape", term196857);
        setField(term196805, term196805.getClass(), "quoteChar", term196909);
        setField(term196805, term196805.getClass(), "commentStart", term196961);
        setBooleanField(term196805, term196805.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term196805, term196805.getClass(), "ignoreEmptyLines", true);
        setField(term196805, term196805.getClass(), "header", term195203);
        setIntField(null, Class.forName("java.io.BufferedReader"), "defaultCharBufferSize", 120);
        Character term198061 = new Character((char) 0);
        Character term198062 = new Character((char) 0);
        Character term198063 = new Character((char) 0);
        term198060 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term198064 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term198060, term198060.getClass(), "delimiter", (char) 0);
        setField(term198060, term198060.getClass(), "quoteChar", term198061);
        setField(term198060, term198060.getClass(), "quotePolicy", null);
        setField(term198060, term198060.getClass(), "commentStart", term198062);
        setField(term198060, term198060.getClass(), "escape", term198063);
        setBooleanField(term198060, term198060.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term198060, term198060.getClass(), "ignoreEmptyHeaders", false);
        setBooleanField(term198060, term198060.getClass(), "ignoreEmptyLines", true);
        setField(term198060, term198060.getClass(), "recordSeparator", null);
        setField(term198060, term198060.getClass(), "nullString", null);
        setField(term198060, term198060.getClass(), "header", term198064);
        setBooleanField(term198060, term198060.getClass(), "skipHeaderRecord", false);
        Character term196976 = new Character((char) 0);
        Character term196978 = new Character((char) 0);
        Character term196980 = new Character((char) 0);
        LinkedHashMap term197833 = new LinkedHashMap();
        ArrayList term197982 = new ArrayList();
        Class<? extends Object> term198186 = Class.forName((String) "org.apache.commons.csv.Token$Type");
        Field term198185 = ((Class) term198186).getDeclaredField((String) "EOF");
        ((Field) term198185).setAccessible(true);
        Object enum78 = ((Field) term198185).get((Object) null);
        term197832 = newInstance(Class.forName("org.apache.commons.csv.CSVParser"));
        Object term196974 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term196985 = (Object[]) newArray("java.lang.String", 0);
        Object term197839 = newInstance(Class.forName("org.apache.commons.csv.Lexer"));
        Object term197846 = newInstance(Class.forName("org.apache.commons.csv.ExtendedBufferedReader"));
        Object term197850 = newInstance(Class.forName("java.io.StringReader"));
        char[] term197855 = (char[]) newCharArray(120);
        Object term197987 = newInstance(Class.forName("org.apache.commons.csv.Token"));
        Object term197995 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term197996 = (byte[]) newByteArray(50);
        setCharField(term196974, term196974.getClass(), "delimiter", (char) 0);
        setField(term196974, term196974.getClass(), "quoteChar", term196976);
        setField(term196974, term196974.getClass(), "quotePolicy", null);
        setField(term196974, term196974.getClass(), "commentStart", term196978);
        setField(term196974, term196974.getClass(), "escape", term196980);
        setBooleanField(term196974, term196974.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term196974, term196974.getClass(), "ignoreEmptyHeaders", false);
        setBooleanField(term196974, term196974.getClass(), "ignoreEmptyLines", true);
        setField(term196974, term196974.getClass(), "recordSeparator", null);
        setField(term196974, term196974.getClass(), "nullString", null);
        setField(term196974, term196974.getClass(), "header", term196985);
        setBooleanField(term196974, term196974.getClass(), "skipHeaderRecord", false);
        setField(term197832, term197832.getClass(), "format", term196974);
        setField(term197832, term197832.getClass(), "headerMap", term197833);
        setCharField(term197839, term197839.getClass(), "delimiter", (char) 0);
        setCharField(term197839, term197839.getClass(), "escape", (char) 0);
        setCharField(term197839, term197839.getClass(), "quoteChar", (char) 0);
        setCharField(term197839, term197839.getClass(), "commentStart", (char) 0);
        setBooleanField(term197839, term197839.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term197839, term197839.getClass(), "ignoreEmptyLines", true);
        setIntField(term197846, term197846.getClass(), "lastChar", -1);
        setLongField(term197846, term197846.getClass(), "eolCounter", 0L);
        setBooleanField(term197846, term197846.getClass(), "closed", false);
        setField(term197850, term197850.getClass(), "str", "");
        setIntField(term197850, term197850.getClass(), "length", 0);
        setIntField(term197850, term197850.getClass(), "next", 0);
        setIntField(term197850, term197850.getClass(), "mark", 0);
        setField(term197850, term197850.getClass(), "lock", term197850);
        setField(term197850, term197850.getClass(), "skipBuffer", null);
        setField(term197846, term197846.getClass(), "in", term197850);
        setField(term197846, term197846.getClass(), "cb", term197855);
        setIntField(term197846, term197846.getClass(), "nChars", 0);
        setIntField(term197846, term197846.getClass(), "nextChar", 0);
        setIntField(term197846, term197846.getClass(), "markedChar", -1);
        setIntField(term197846, term197846.getClass(), "readAheadLimit", 0);
        setBooleanField(term197846, term197846.getClass(), "skipLF", false);
        setBooleanField(term197846, term197846.getClass(), "markedSkipLF", false);
        setField(term197846, term197846.getClass(), "lock", term197850);
        setField(term197846, term197846.getClass(), "skipBuffer", null);
        setField(term197839, term197839.getClass(), "reader", term197846);
        setField(term197832, term197832.getClass(), "lexer", term197839);
        setField(term197832, term197832.getClass(), "record", term197982);
        setLongField(term197832, term197832.getClass(), "recordNumber", 0L);
        setField(term197987, term197987.getClass(), "type", enum78);
        setField(term197995, term197995.getClass(), "value", term197996);
        setByteField(term197995, term197995.getClass(), "coder", (byte) 0);
        setIntField(term197995, term197995.getClass(), "count", 0);
        setField(term197987, term197987.getClass(), "content", term197995);
        setBooleanField(term197987, term197987.getClass(), "isReady", false);
        setField(term197832, term197832.getClass(), "reusableToken", term197987);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("org.apache.commons.csv.CSVFormat");
        Object[] args = new Object[2];
        args[0] = "";
        args[1] = term196805;
        Object retValue = callMethod(klass, "parse", argTypes, null, args);
        assertTrue(recursiveEquals(term196805, term198060));
        assertTrue(recursiveEquals(retValue, term197832));
    }

};


