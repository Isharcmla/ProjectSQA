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

public class CSVParser_parse_1565072064105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term314956;
     Object term315649;
     Object term315536;

    public CSVParser_parse_1565072064105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term315008 = new Character((char) 0);
        Character term315060 = new Character((char) 0);
        term314956 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term313254 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term314956, term314956.getClass(), "delimiter", (char) 0);
        setField(term314956, term314956.getClass(), "escapeCharacter", term315008);
        setField(term314956, term314956.getClass(), "quoteCharacter", term315060);
        setField(term314956, term314956.getClass(), "commentMarker", term315060);
        setBooleanField(term314956, term314956.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term314956, term314956.getClass(), "ignoreEmptyLines", true);
        setField(term314956, term314956.getClass(), "header", term313254);
        setBooleanField(term314956, term314956.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term314956, term314956.getClass(), "skipHeaderRecord", true);
        setIntField(null, Class.forName("java.io.BufferedReader"), "defaultCharBufferSize", 1);
        Character term315650 = new Character((char) 0);
        Character term315651 = new Character((char) 0);
        Character term315653 = new Character((char) 0);
        term315649 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term315652 = (Object[]) newArray("java.lang.String", 0);
        setBooleanField(term315649, term315649.getClass(), "allowMissingColumnNames", false);
        setField(term315649, term315649.getClass(), "commentMarker", term315650);
        setCharField(term315649, term315649.getClass(), "delimiter", (char) 0);
        setField(term315649, term315649.getClass(), "escapeCharacter", term315651);
        setField(term315649, term315649.getClass(), "header", term315652);
        setField(term315649, term315649.getClass(), "headerComments", null);
        setBooleanField(term315649, term315649.getClass(), "ignoreEmptyLines", true);
        setBooleanField(term315649, term315649.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term315649, term315649.getClass(), "ignoreSurroundingSpaces", true);
        setField(term315649, term315649.getClass(), "nullString", null);
        setField(term315649, term315649.getClass(), "quoteCharacter", term315653);
        setField(term315649, term315649.getClass(), "quoteMode", null);
        setField(term315649, term315649.getClass(), "recordSeparator", null);
        setBooleanField(term315649, term315649.getClass(), "skipHeaderRecord", true);
        setBooleanField(term315649, term315649.getClass(), "trailingDelimiter", false);
        setBooleanField(term315649, term315649.getClass(), "trim", false);
        setBooleanField(term315649, term315649.getClass(), "autoFlush", false);
        Character term315075 = new Character((char) 0);
        Character term315078 = new Character((char) 0);
        Character term315084 = new Character((char) 0);
        LinkedHashMap term315537 = new LinkedHashMap();
        ArrayList term315568 = new ArrayList();
        Class<? extends Object> term315656 = Class.forName((String) "org.apache.commons.csv.Token$Type");
        Field term315655 = ((Class) term315656).getDeclaredField((String) "EOF");
        ((Field) term315655).setAccessible(true);
        Object enum103 = ((Field) term315655).get((Object) null);
        term315536 = newInstance(Class.forName("org.apache.commons.csv.CSVParser"));
        Object term315073 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term315080 = (Object[]) newArray("java.lang.String", 0);
        Object term315543 = newInstance(Class.forName("org.apache.commons.csv.Lexer"));
        Object term315550 = newInstance(Class.forName("org.apache.commons.csv.ExtendedBufferedReader"));
        Object term315555 = newInstance(Class.forName("java.io.StringReader"));
        char[] term315560 = (char[]) newCharArray(1);
        Object term315574 = newInstance(Class.forName("org.apache.commons.csv.Token"));
        Object term315582 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term315583 = (byte[]) newByteArray(50);
        setBooleanField(term315073, term315073.getClass(), "allowMissingColumnNames", false);
        setField(term315073, term315073.getClass(), "commentMarker", term315075);
        setCharField(term315073, term315073.getClass(), "delimiter", (char) 0);
        setField(term315073, term315073.getClass(), "escapeCharacter", term315078);
        setField(term315073, term315073.getClass(), "header", term315080);
        setField(term315073, term315073.getClass(), "headerComments", null);
        setBooleanField(term315073, term315073.getClass(), "ignoreEmptyLines", true);
        setBooleanField(term315073, term315073.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term315073, term315073.getClass(), "ignoreSurroundingSpaces", true);
        setField(term315073, term315073.getClass(), "nullString", null);
        setField(term315073, term315073.getClass(), "quoteCharacter", term315084);
        setField(term315073, term315073.getClass(), "quoteMode", null);
        setField(term315073, term315073.getClass(), "recordSeparator", null);
        setBooleanField(term315073, term315073.getClass(), "skipHeaderRecord", true);
        setBooleanField(term315073, term315073.getClass(), "trailingDelimiter", false);
        setBooleanField(term315073, term315073.getClass(), "trim", false);
        setBooleanField(term315073, term315073.getClass(), "autoFlush", false);
        setField(term315536, term315536.getClass(), "format", term315073);
        setField(term315536, term315536.getClass(), "headerMap", term315537);
        setCharField(term315543, term315543.getClass(), "delimiter", (char) 0);
        setCharField(term315543, term315543.getClass(), "escape", (char) 0);
        setCharField(term315543, term315543.getClass(), "quoteChar", (char) 0);
        setCharField(term315543, term315543.getClass(), "commentStart", (char) 0);
        setBooleanField(term315543, term315543.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term315543, term315543.getClass(), "ignoreEmptyLines", true);
        setIntField(term315550, term315550.getClass(), "lastChar", -1);
        setLongField(term315550, term315550.getClass(), "eolCounter", 0L);
        setLongField(term315550, term315550.getClass(), "position", 1L);
        setBooleanField(term315550, term315550.getClass(), "closed", false);
        setField(term315555, term315555.getClass(), "str", "");
        setIntField(term315555, term315555.getClass(), "length", 0);
        setIntField(term315555, term315555.getClass(), "next", 0);
        setIntField(term315555, term315555.getClass(), "mark", 0);
        setField(term315555, term315555.getClass(), "lock", term315555);
        setField(term315555, term315555.getClass(), "skipBuffer", null);
        setField(term315550, term315550.getClass(), "in", term315555);
        setField(term315550, term315550.getClass(), "cb", term315560);
        setIntField(term315550, term315550.getClass(), "nChars", 0);
        setIntField(term315550, term315550.getClass(), "nextChar", 0);
        setIntField(term315550, term315550.getClass(), "markedChar", -1);
        setIntField(term315550, term315550.getClass(), "readAheadLimit", 0);
        setBooleanField(term315550, term315550.getClass(), "skipLF", false);
        setBooleanField(term315550, term315550.getClass(), "markedSkipLF", false);
        setField(term315550, term315550.getClass(), "lock", term315555);
        setField(term315550, term315550.getClass(), "skipBuffer", null);
        setField(term315543, term315543.getClass(), "reader", term315550);
        setField(term315543, term315543.getClass(), "firstEol", null);
        setField(term315536, term315536.getClass(), "lexer", term315543);
        setField(term315536, term315536.getClass(), "recordList", term315568);
        setLongField(term315536, term315536.getClass(), "recordNumber", 0L);
        setLongField(term315536, term315536.getClass(), "characterOffset", 0L);
        setField(term315574, term315574.getClass(), "type", enum103);
        setField(term315582, term315582.getClass(), "value", term315583);
        setByteField(term315582, term315582.getClass(), "coder", (byte) 0);
        setIntField(term315582, term315582.getClass(), "count", 0);
        setField(term315574, term315574.getClass(), "content", term315582);
        setBooleanField(term315574, term315574.getClass(), "isReady", false);
        setField(term315536, term315536.getClass(), "reusableToken", term315574);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("org.apache.commons.csv.CSVFormat");
        Object[] args = new Object[2];
        args[0] = "";
        args[1] = term314956;
        Object retValue = callMethod(klass, "parse", argTypes, null, args);
        assertTrue(recursiveEquals(term314956, term315649));
        assertTrue(recursiveEquals(retValue, term315536));
    }

};


