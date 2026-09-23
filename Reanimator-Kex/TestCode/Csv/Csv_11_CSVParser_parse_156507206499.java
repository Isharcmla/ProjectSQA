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

public class CSVParser_parse_156507206499 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term284345;
     Object term285080;
     Object term284956;

    public CSVParser_parse_156507206499() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term284397 = new Character((char) 32735);
        Character term284449 = new Character((char) 2);
        Character term284501 = new Character((char) 4);
        term284345 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term281866 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term284345, term284345.getClass(), "delimiter", (char) 2048);
        setField(term284345, term284345.getClass(), "escape", term284397);
        setField(term284345, term284345.getClass(), "quoteChar", term284449);
        setField(term284345, term284345.getClass(), "commentStart", term284501);
        setBooleanField(term284345, term284345.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term284345, term284345.getClass(), "ignoreEmptyLines", true);
        setField(term284345, term284345.getClass(), "header", term281866);
        setBooleanField(term284345, term284345.getClass(), "skipHeaderRecord", true);
        setIntField(null, Class.forName("java.io.BufferedReader"), "defaultCharBufferSize", 16);
        Character term285081 = new Character((char) 2);
        Character term285082 = new Character((char) 4);
        Character term285083 = new Character((char) 32735);
        term285080 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term285084 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term285080, term285080.getClass(), "delimiter", (char) 2048);
        setField(term285080, term285080.getClass(), "quoteChar", term285081);
        setField(term285080, term285080.getClass(), "quotePolicy", null);
        setField(term285080, term285080.getClass(), "commentStart", term285082);
        setField(term285080, term285080.getClass(), "escape", term285083);
        setBooleanField(term285080, term285080.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term285080, term285080.getClass(), "ignoreEmptyHeaders", false);
        setBooleanField(term285080, term285080.getClass(), "ignoreEmptyLines", true);
        setField(term285080, term285080.getClass(), "recordSeparator", null);
        setField(term285080, term285080.getClass(), "nullString", null);
        setField(term285080, term285080.getClass(), "header", term285084);
        setBooleanField(term285080, term285080.getClass(), "skipHeaderRecord", true);
        Character term284516 = new Character((char) 2);
        Character term284518 = new Character((char) 4);
        Character term284520 = new Character((char) 32735);
        LinkedHashMap term284957 = new LinkedHashMap();
        ArrayList term285002 = new ArrayList();
        Class<? extends Object> term285102 = Class.forName((String) "org.apache.commons.csv.Token$Type");
        Field term285101 = ((Class) term285102).getDeclaredField((String) "EOF");
        ((Field) term285101).setAccessible(true);
        Object enum96 = ((Field) term285101).get((Object) null);
        term284956 = newInstance(Class.forName("org.apache.commons.csv.CSVParser"));
        Object term284514 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term284525 = (Object[]) newArray("java.lang.String", 0);
        Object term284963 = newInstance(Class.forName("org.apache.commons.csv.Lexer"));
        Object term284970 = newInstance(Class.forName("org.apache.commons.csv.ExtendedBufferedReader"));
        Object term284974 = newInstance(Class.forName("java.io.StringReader"));
        char[] term284979 = (char[]) newCharArray(16);
        Object term285007 = newInstance(Class.forName("org.apache.commons.csv.Token"));
        Object term285015 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term285016 = (byte[]) newByteArray(50);
        setCharField(term284514, term284514.getClass(), "delimiter", (char) 2048);
        setField(term284514, term284514.getClass(), "quoteChar", term284516);
        setField(term284514, term284514.getClass(), "quotePolicy", null);
        setField(term284514, term284514.getClass(), "commentStart", term284518);
        setField(term284514, term284514.getClass(), "escape", term284520);
        setBooleanField(term284514, term284514.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term284514, term284514.getClass(), "ignoreEmptyHeaders", false);
        setBooleanField(term284514, term284514.getClass(), "ignoreEmptyLines", true);
        setField(term284514, term284514.getClass(), "recordSeparator", null);
        setField(term284514, term284514.getClass(), "nullString", null);
        setField(term284514, term284514.getClass(), "header", term284525);
        setBooleanField(term284514, term284514.getClass(), "skipHeaderRecord", true);
        setField(term284956, term284956.getClass(), "format", term284514);
        setField(term284956, term284956.getClass(), "headerMap", term284957);
        setCharField(term284963, term284963.getClass(), "delimiter", (char) 2048);
        setCharField(term284963, term284963.getClass(), "escape", (char) 32735);
        setCharField(term284963, term284963.getClass(), "quoteChar", (char) 2);
        setCharField(term284963, term284963.getClass(), "commentStart", (char) 4);
        setBooleanField(term284963, term284963.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term284963, term284963.getClass(), "ignoreEmptyLines", true);
        setIntField(term284970, term284970.getClass(), "lastChar", -1);
        setLongField(term284970, term284970.getClass(), "eolCounter", 0L);
        setBooleanField(term284970, term284970.getClass(), "closed", false);
        setField(term284974, term284974.getClass(), "str", "");
        setIntField(term284974, term284974.getClass(), "length", 0);
        setIntField(term284974, term284974.getClass(), "next", 0);
        setIntField(term284974, term284974.getClass(), "mark", 0);
        setField(term284974, term284974.getClass(), "lock", term284974);
        setField(term284974, term284974.getClass(), "skipBuffer", null);
        setField(term284970, term284970.getClass(), "in", term284974);
        setField(term284970, term284970.getClass(), "cb", term284979);
        setIntField(term284970, term284970.getClass(), "nChars", 0);
        setIntField(term284970, term284970.getClass(), "nextChar", 0);
        setIntField(term284970, term284970.getClass(), "markedChar", -1);
        setIntField(term284970, term284970.getClass(), "readAheadLimit", 0);
        setBooleanField(term284970, term284970.getClass(), "skipLF", false);
        setBooleanField(term284970, term284970.getClass(), "markedSkipLF", false);
        setField(term284970, term284970.getClass(), "lock", term284974);
        setField(term284970, term284970.getClass(), "skipBuffer", null);
        setField(term284963, term284963.getClass(), "reader", term284970);
        setField(term284956, term284956.getClass(), "lexer", term284963);
        setField(term284956, term284956.getClass(), "record", term285002);
        setLongField(term284956, term284956.getClass(), "recordNumber", 0L);
        setField(term285007, term285007.getClass(), "type", enum96);
        setField(term285015, term285015.getClass(), "value", term285016);
        setByteField(term285015, term285015.getClass(), "coder", (byte) 0);
        setIntField(term285015, term285015.getClass(), "count", 0);
        setField(term285007, term285007.getClass(), "content", term285015);
        setBooleanField(term285007, term285007.getClass(), "isReady", false);
        setField(term284956, term284956.getClass(), "reusableToken", term285007);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("org.apache.commons.csv.CSVFormat");
        Object[] args = new Object[2];
        args[0] = "";
        args[1] = term284345;
        Object retValue = callMethod(klass, "parse", argTypes, null, args);
        assertTrue(recursiveEquals(term284345, term285080));
        assertTrue(recursiveEquals(retValue, term284956));
    }

};


