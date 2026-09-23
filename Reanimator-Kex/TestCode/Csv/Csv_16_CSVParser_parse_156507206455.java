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
     Object term208890;
     Object term209754;
     Object term209626;

    public CSVParser_parse_156507206455() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term208942 = new Character((char) 12324);
        Character term208994 = new Character((char) 0);
        Character term209046 = new Character((char) 12324);
        term208890 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term202537 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term208890, term208890.getClass(), "delimiter", (char) 12324);
        setField(term208890, term208890.getClass(), "escapeCharacter", term208942);
        setField(term208890, term208890.getClass(), "quoteCharacter", term208994);
        setField(term208890, term208890.getClass(), "commentMarker", term209046);
        setBooleanField(term208890, term208890.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term208890, term208890.getClass(), "ignoreEmptyLines", true);
        setField(term208890, term208890.getClass(), "header", term202537);
        setBooleanField(term208890, term208890.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term208890, term208890.getClass(), "skipHeaderRecord", true);
        setIntField(null, Class.forName("java.io.BufferedReader"), "defaultCharBufferSize", 16);
        Character term209755 = new Character((char) 12324);
        Character term209756 = new Character((char) 12324);
        Character term209758 = new Character((char) 0);
        term209754 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term209757 = (Object[]) newArray("java.lang.String", 0);
        setBooleanField(term209754, term209754.getClass(), "allowMissingColumnNames", false);
        setField(term209754, term209754.getClass(), "commentMarker", term209755);
        setCharField(term209754, term209754.getClass(), "delimiter", (char) 12324);
        setField(term209754, term209754.getClass(), "escapeCharacter", term209756);
        setField(term209754, term209754.getClass(), "header", term209757);
        setField(term209754, term209754.getClass(), "headerComments", null);
        setBooleanField(term209754, term209754.getClass(), "ignoreEmptyLines", true);
        setBooleanField(term209754, term209754.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term209754, term209754.getClass(), "ignoreSurroundingSpaces", true);
        setField(term209754, term209754.getClass(), "nullString", null);
        setField(term209754, term209754.getClass(), "quoteCharacter", term209758);
        setField(term209754, term209754.getClass(), "quoteMode", null);
        setField(term209754, term209754.getClass(), "recordSeparator", null);
        setBooleanField(term209754, term209754.getClass(), "skipHeaderRecord", true);
        setBooleanField(term209754, term209754.getClass(), "trailingDelimiter", false);
        setBooleanField(term209754, term209754.getClass(), "trim", false);
        setBooleanField(term209754, term209754.getClass(), "autoFlush", false);
        Character term209075 = new Character((char) 12324);
        Character term209078 = new Character((char) 12324);
        Character term209084 = new Character((char) 0);
        LinkedHashMap term209627 = new LinkedHashMap();
        ArrayList term209673 = new ArrayList();
        Class<? extends Object> term209776 = Class.forName((String) "org.apache.commons.csv.Token$Type");
        Field term209775 = ((Class) term209776).getDeclaredField((String) "EOF");
        ((Field) term209775).setAccessible(true);
        Object enum87 = ((Field) term209775).get((Object) null);
        term209626 = newInstance(Class.forName("org.apache.commons.csv.CSVParser"));
        Object term209073 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term209080 = (Object[]) newArray("java.lang.String", 0);
        Object term209633 = newInstance(Class.forName("org.apache.commons.csv.Lexer"));
        Object term209640 = newInstance(Class.forName("org.apache.commons.csv.ExtendedBufferedReader"));
        Object term209645 = newInstance(Class.forName("java.io.StringReader"));
        char[] term209650 = (char[]) newCharArray(16);
        Object term209679 = newInstance(Class.forName("org.apache.commons.csv.Token"));
        Object term209687 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term209688 = (byte[]) newByteArray(50);
        setBooleanField(term209073, term209073.getClass(), "allowMissingColumnNames", false);
        setField(term209073, term209073.getClass(), "commentMarker", term209075);
        setCharField(term209073, term209073.getClass(), "delimiter", (char) 12324);
        setField(term209073, term209073.getClass(), "escapeCharacter", term209078);
        setField(term209073, term209073.getClass(), "header", term209080);
        setField(term209073, term209073.getClass(), "headerComments", null);
        setBooleanField(term209073, term209073.getClass(), "ignoreEmptyLines", true);
        setBooleanField(term209073, term209073.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term209073, term209073.getClass(), "ignoreSurroundingSpaces", true);
        setField(term209073, term209073.getClass(), "nullString", null);
        setField(term209073, term209073.getClass(), "quoteCharacter", term209084);
        setField(term209073, term209073.getClass(), "quoteMode", null);
        setField(term209073, term209073.getClass(), "recordSeparator", null);
        setBooleanField(term209073, term209073.getClass(), "skipHeaderRecord", true);
        setBooleanField(term209073, term209073.getClass(), "trailingDelimiter", false);
        setBooleanField(term209073, term209073.getClass(), "trim", false);
        setBooleanField(term209073, term209073.getClass(), "autoFlush", false);
        setField(term209626, term209626.getClass(), "format", term209073);
        setField(term209626, term209626.getClass(), "headerMap", term209627);
        setCharField(term209633, term209633.getClass(), "delimiter", (char) 12324);
        setCharField(term209633, term209633.getClass(), "escape", (char) 12324);
        setCharField(term209633, term209633.getClass(), "quoteChar", (char) 0);
        setCharField(term209633, term209633.getClass(), "commentStart", (char) 12324);
        setBooleanField(term209633, term209633.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term209633, term209633.getClass(), "ignoreEmptyLines", true);
        setIntField(term209640, term209640.getClass(), "lastChar", -1);
        setLongField(term209640, term209640.getClass(), "eolCounter", 0L);
        setLongField(term209640, term209640.getClass(), "position", 1L);
        setBooleanField(term209640, term209640.getClass(), "closed", false);
        setField(term209645, term209645.getClass(), "str", "");
        setIntField(term209645, term209645.getClass(), "length", 0);
        setIntField(term209645, term209645.getClass(), "next", 0);
        setIntField(term209645, term209645.getClass(), "mark", 0);
        setField(term209645, term209645.getClass(), "lock", term209645);
        setField(term209645, term209645.getClass(), "skipBuffer", null);
        setField(term209640, term209640.getClass(), "in", term209645);
        setField(term209640, term209640.getClass(), "cb", term209650);
        setIntField(term209640, term209640.getClass(), "nChars", 0);
        setIntField(term209640, term209640.getClass(), "nextChar", 0);
        setIntField(term209640, term209640.getClass(), "markedChar", -1);
        setIntField(term209640, term209640.getClass(), "readAheadLimit", 0);
        setBooleanField(term209640, term209640.getClass(), "skipLF", false);
        setBooleanField(term209640, term209640.getClass(), "markedSkipLF", false);
        setField(term209640, term209640.getClass(), "lock", term209645);
        setField(term209640, term209640.getClass(), "skipBuffer", null);
        setField(term209633, term209633.getClass(), "reader", term209640);
        setField(term209633, term209633.getClass(), "firstEol", null);
        setField(term209626, term209626.getClass(), "lexer", term209633);
        setField(term209626, term209626.getClass(), "recordList", term209673);
        setLongField(term209626, term209626.getClass(), "recordNumber", 0L);
        setLongField(term209626, term209626.getClass(), "characterOffset", 0L);
        setField(term209679, term209679.getClass(), "type", enum87);
        setField(term209687, term209687.getClass(), "value", term209688);
        setByteField(term209687, term209687.getClass(), "coder", (byte) 0);
        setIntField(term209687, term209687.getClass(), "count", 0);
        setField(term209679, term209679.getClass(), "content", term209687);
        setBooleanField(term209679, term209679.getClass(), "isReady", false);
        setField(term209626, term209626.getClass(), "reusableToken", term209679);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("org.apache.commons.csv.CSVFormat");
        Object[] args = new Object[2];
        args[0] = "";
        args[1] = term208890;
        Object retValue = callMethod(klass, "parse", argTypes, null, args);
        assertTrue(recursiveEquals(term208890, term209754));
        assertTrue(recursiveEquals(retValue, term209626));
    }

};


