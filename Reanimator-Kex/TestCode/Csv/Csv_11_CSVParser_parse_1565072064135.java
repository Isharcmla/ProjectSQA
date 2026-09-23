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

public class CSVParser_parse_1565072064135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term345780;
     Object term347075;
     Object term346839;

    public CSVParser_parse_1565072064135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term345832 = new Character((char) 0);
        Character term345884 = new Character((char) 0);
        Character term345936 = new Character((char) 0);
        term345780 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term343391 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term345780, term345780.getClass(), "delimiter", (char) 0);
        setField(term345780, term345780.getClass(), "escape", term345832);
        setField(term345780, term345780.getClass(), "quoteChar", term345884);
        setField(term345780, term345780.getClass(), "commentStart", term345936);
        setBooleanField(term345780, term345780.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term345780, term345780.getClass(), "ignoreEmptyLines", true);
        setField(term345780, term345780.getClass(), "header", term343391);
        setBooleanField(term345780, term345780.getClass(), "skipHeaderRecord", true);
        setIntField(null, Class.forName("java.io.BufferedReader"), "defaultCharBufferSize", 128);
        Character term347076 = new Character((char) 0);
        Character term347077 = new Character((char) 0);
        Character term347078 = new Character((char) 0);
        term347075 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term347079 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term347075, term347075.getClass(), "delimiter", (char) 0);
        setField(term347075, term347075.getClass(), "quoteChar", term347076);
        setField(term347075, term347075.getClass(), "quotePolicy", null);
        setField(term347075, term347075.getClass(), "commentStart", term347077);
        setField(term347075, term347075.getClass(), "escape", term347078);
        setBooleanField(term347075, term347075.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term347075, term347075.getClass(), "ignoreEmptyHeaders", false);
        setBooleanField(term347075, term347075.getClass(), "ignoreEmptyLines", true);
        setField(term347075, term347075.getClass(), "recordSeparator", null);
        setField(term347075, term347075.getClass(), "nullString", null);
        setField(term347075, term347075.getClass(), "header", term347079);
        setBooleanField(term347075, term347075.getClass(), "skipHeaderRecord", true);
        Character term345951 = new Character((char) 0);
        Character term345953 = new Character((char) 0);
        Character term345955 = new Character((char) 0);
        LinkedHashMap term346840 = new LinkedHashMap();
        ArrayList term346997 = new ArrayList();
        Class<? extends Object> term347209 = Class.forName((String) "org.apache.commons.csv.Token$Type");
        Field term347208 = ((Class) term347209).getDeclaredField((String) "EOF");
        ((Field) term347208).setAccessible(true);
        Object enum111 = ((Field) term347208).get((Object) null);
        term346839 = newInstance(Class.forName("org.apache.commons.csv.CSVParser"));
        Object term345949 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term345960 = (Object[]) newArray("java.lang.String", 0);
        Object term346846 = newInstance(Class.forName("org.apache.commons.csv.Lexer"));
        Object term346853 = newInstance(Class.forName("org.apache.commons.csv.ExtendedBufferedReader"));
        Object term346857 = newInstance(Class.forName("java.io.StringReader"));
        char[] term346862 = (char[]) newCharArray(128);
        Object term347002 = newInstance(Class.forName("org.apache.commons.csv.Token"));
        Object term347010 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term347011 = (byte[]) newByteArray(50);
        setCharField(term345949, term345949.getClass(), "delimiter", (char) 0);
        setField(term345949, term345949.getClass(), "quoteChar", term345951);
        setField(term345949, term345949.getClass(), "quotePolicy", null);
        setField(term345949, term345949.getClass(), "commentStart", term345953);
        setField(term345949, term345949.getClass(), "escape", term345955);
        setBooleanField(term345949, term345949.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term345949, term345949.getClass(), "ignoreEmptyHeaders", false);
        setBooleanField(term345949, term345949.getClass(), "ignoreEmptyLines", true);
        setField(term345949, term345949.getClass(), "recordSeparator", null);
        setField(term345949, term345949.getClass(), "nullString", null);
        setField(term345949, term345949.getClass(), "header", term345960);
        setBooleanField(term345949, term345949.getClass(), "skipHeaderRecord", true);
        setField(term346839, term346839.getClass(), "format", term345949);
        setField(term346839, term346839.getClass(), "headerMap", term346840);
        setCharField(term346846, term346846.getClass(), "delimiter", (char) 0);
        setCharField(term346846, term346846.getClass(), "escape", (char) 0);
        setCharField(term346846, term346846.getClass(), "quoteChar", (char) 0);
        setCharField(term346846, term346846.getClass(), "commentStart", (char) 0);
        setBooleanField(term346846, term346846.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term346846, term346846.getClass(), "ignoreEmptyLines", true);
        setIntField(term346853, term346853.getClass(), "lastChar", -1);
        setLongField(term346853, term346853.getClass(), "eolCounter", 0L);
        setBooleanField(term346853, term346853.getClass(), "closed", false);
        setField(term346857, term346857.getClass(), "str", "");
        setIntField(term346857, term346857.getClass(), "length", 0);
        setIntField(term346857, term346857.getClass(), "next", 0);
        setIntField(term346857, term346857.getClass(), "mark", 0);
        setField(term346857, term346857.getClass(), "lock", term346857);
        setField(term346857, term346857.getClass(), "skipBuffer", null);
        setField(term346853, term346853.getClass(), "in", term346857);
        setField(term346853, term346853.getClass(), "cb", term346862);
        setIntField(term346853, term346853.getClass(), "nChars", 0);
        setIntField(term346853, term346853.getClass(), "nextChar", 0);
        setIntField(term346853, term346853.getClass(), "markedChar", -1);
        setIntField(term346853, term346853.getClass(), "readAheadLimit", 0);
        setBooleanField(term346853, term346853.getClass(), "skipLF", false);
        setBooleanField(term346853, term346853.getClass(), "markedSkipLF", false);
        setField(term346853, term346853.getClass(), "lock", term346857);
        setField(term346853, term346853.getClass(), "skipBuffer", null);
        setField(term346846, term346846.getClass(), "reader", term346853);
        setField(term346839, term346839.getClass(), "lexer", term346846);
        setField(term346839, term346839.getClass(), "record", term346997);
        setLongField(term346839, term346839.getClass(), "recordNumber", 0L);
        setField(term347002, term347002.getClass(), "type", enum111);
        setField(term347010, term347010.getClass(), "value", term347011);
        setByteField(term347010, term347010.getClass(), "coder", (byte) 0);
        setIntField(term347010, term347010.getClass(), "count", 0);
        setField(term347002, term347002.getClass(), "content", term347010);
        setBooleanField(term347002, term347002.getClass(), "isReady", false);
        setField(term346839, term346839.getClass(), "reusableToken", term347002);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("org.apache.commons.csv.CSVFormat");
        Object[] args = new Object[2];
        args[0] = "";
        args[1] = term345780;
        Object retValue = callMethod(klass, "parse", argTypes, null, args);
        assertTrue(recursiveEquals(term345780, term347075));
        assertTrue(recursiveEquals(retValue, term346839));
    }

};


