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

public class CSVParser_parse_156507206479 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term256127;
     Object term256879;
     Object term256765;

    public CSVParser_parse_156507206479() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term256179 = new Character((char) 0);
        Character term256231 = new Character((char) 0);
        Character term256283 = new Character((char) 0);
        term256127 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term255561 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term256127, term256127.getClass(), "delimiter", (char) 0);
        setField(term256127, term256127.getClass(), "escapeCharacter", term256179);
        setField(term256127, term256127.getClass(), "quoteCharacter", term256231);
        setField(term256127, term256127.getClass(), "commentMarker", term256283);
        setBooleanField(term256127, term256127.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term256127, term256127.getClass(), "ignoreEmptyLines", true);
        setField(term256127, term256127.getClass(), "header", term255561);
        setBooleanField(term256127, term256127.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term256127, term256127.getClass(), "skipHeaderRecord", true);
        setIntField(null, Class.forName("java.io.BufferedReader"), "defaultCharBufferSize", 2);
        Character term256880 = new Character((char) 0);
        Character term256881 = new Character((char) 0);
        Character term256883 = new Character((char) 0);
        term256879 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term256882 = (Object[]) newArray("java.lang.String", 0);
        setBooleanField(term256879, term256879.getClass(), "allowMissingColumnNames", false);
        setField(term256879, term256879.getClass(), "commentMarker", term256880);
        setCharField(term256879, term256879.getClass(), "delimiter", (char) 0);
        setField(term256879, term256879.getClass(), "escapeCharacter", term256881);
        setField(term256879, term256879.getClass(), "header", term256882);
        setField(term256879, term256879.getClass(), "headerComments", null);
        setBooleanField(term256879, term256879.getClass(), "ignoreEmptyLines", true);
        setBooleanField(term256879, term256879.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term256879, term256879.getClass(), "ignoreSurroundingSpaces", false);
        setField(term256879, term256879.getClass(), "nullString", null);
        setField(term256879, term256879.getClass(), "quoteCharacter", term256883);
        setField(term256879, term256879.getClass(), "quoteMode", null);
        setField(term256879, term256879.getClass(), "recordSeparator", null);
        setBooleanField(term256879, term256879.getClass(), "skipHeaderRecord", true);
        setBooleanField(term256879, term256879.getClass(), "trailingDelimiter", false);
        setBooleanField(term256879, term256879.getClass(), "trim", false);
        setBooleanField(term256879, term256879.getClass(), "autoFlush", false);
        Character term256298 = new Character((char) 0);
        Character term256301 = new Character((char) 0);
        Character term256307 = new Character((char) 0);
        LinkedHashMap term256766 = new LinkedHashMap();
        ArrayList term256798 = new ArrayList();
        Class<? extends Object> term256887 = Class.forName((String) "org.apache.commons.csv.Token$Type");
        Field term256886 = ((Class) term256887).getDeclaredField((String) "EOF");
        ((Field) term256886).setAccessible(true);
        Object enum93 = ((Field) term256886).get((Object) null);
        term256765 = newInstance(Class.forName("org.apache.commons.csv.CSVParser"));
        Object term256296 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term256303 = (Object[]) newArray("java.lang.String", 0);
        Object term256772 = newInstance(Class.forName("org.apache.commons.csv.Lexer"));
        Object term256779 = newInstance(Class.forName("org.apache.commons.csv.ExtendedBufferedReader"));
        Object term256784 = newInstance(Class.forName("java.io.StringReader"));
        char[] term256789 = (char[]) newCharArray(2);
        Object term256804 = newInstance(Class.forName("org.apache.commons.csv.Token"));
        Object term256812 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term256813 = (byte[]) newByteArray(50);
        setBooleanField(term256296, term256296.getClass(), "allowMissingColumnNames", false);
        setField(term256296, term256296.getClass(), "commentMarker", term256298);
        setCharField(term256296, term256296.getClass(), "delimiter", (char) 0);
        setField(term256296, term256296.getClass(), "escapeCharacter", term256301);
        setField(term256296, term256296.getClass(), "header", term256303);
        setField(term256296, term256296.getClass(), "headerComments", null);
        setBooleanField(term256296, term256296.getClass(), "ignoreEmptyLines", true);
        setBooleanField(term256296, term256296.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term256296, term256296.getClass(), "ignoreSurroundingSpaces", false);
        setField(term256296, term256296.getClass(), "nullString", null);
        setField(term256296, term256296.getClass(), "quoteCharacter", term256307);
        setField(term256296, term256296.getClass(), "quoteMode", null);
        setField(term256296, term256296.getClass(), "recordSeparator", null);
        setBooleanField(term256296, term256296.getClass(), "skipHeaderRecord", true);
        setBooleanField(term256296, term256296.getClass(), "trailingDelimiter", false);
        setBooleanField(term256296, term256296.getClass(), "trim", false);
        setBooleanField(term256296, term256296.getClass(), "autoFlush", false);
        setField(term256765, term256765.getClass(), "format", term256296);
        setField(term256765, term256765.getClass(), "headerMap", term256766);
        setCharField(term256772, term256772.getClass(), "delimiter", (char) 0);
        setCharField(term256772, term256772.getClass(), "escape", (char) 0);
        setCharField(term256772, term256772.getClass(), "quoteChar", (char) 0);
        setCharField(term256772, term256772.getClass(), "commentStart", (char) 0);
        setBooleanField(term256772, term256772.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term256772, term256772.getClass(), "ignoreEmptyLines", true);
        setIntField(term256779, term256779.getClass(), "lastChar", -1);
        setLongField(term256779, term256779.getClass(), "eolCounter", 0L);
        setLongField(term256779, term256779.getClass(), "position", 1L);
        setBooleanField(term256779, term256779.getClass(), "closed", false);
        setField(term256784, term256784.getClass(), "str", "");
        setIntField(term256784, term256784.getClass(), "length", 0);
        setIntField(term256784, term256784.getClass(), "next", 0);
        setIntField(term256784, term256784.getClass(), "mark", 0);
        setField(term256784, term256784.getClass(), "lock", term256784);
        setField(term256784, term256784.getClass(), "skipBuffer", null);
        setField(term256779, term256779.getClass(), "in", term256784);
        setField(term256779, term256779.getClass(), "cb", term256789);
        setIntField(term256779, term256779.getClass(), "nChars", 0);
        setIntField(term256779, term256779.getClass(), "nextChar", 0);
        setIntField(term256779, term256779.getClass(), "markedChar", -1);
        setIntField(term256779, term256779.getClass(), "readAheadLimit", 0);
        setBooleanField(term256779, term256779.getClass(), "skipLF", false);
        setBooleanField(term256779, term256779.getClass(), "markedSkipLF", false);
        setField(term256779, term256779.getClass(), "lock", term256784);
        setField(term256779, term256779.getClass(), "skipBuffer", null);
        setField(term256772, term256772.getClass(), "reader", term256779);
        setField(term256772, term256772.getClass(), "firstEol", null);
        setField(term256765, term256765.getClass(), "lexer", term256772);
        setField(term256765, term256765.getClass(), "recordList", term256798);
        setLongField(term256765, term256765.getClass(), "recordNumber", 0L);
        setLongField(term256765, term256765.getClass(), "characterOffset", 0L);
        setField(term256804, term256804.getClass(), "type", enum93);
        setField(term256812, term256812.getClass(), "value", term256813);
        setByteField(term256812, term256812.getClass(), "coder", (byte) 0);
        setIntField(term256812, term256812.getClass(), "count", 0);
        setField(term256804, term256804.getClass(), "content", term256812);
        setBooleanField(term256804, term256804.getClass(), "isReady", false);
        setField(term256765, term256765.getClass(), "reusableToken", term256804);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("org.apache.commons.csv.CSVFormat");
        Object[] args = new Object[2];
        args[0] = "";
        args[1] = term256127;
        Object retValue = callMethod(klass, "parse", argTypes, null, args);
        assertTrue(recursiveEquals(term256127, term256879));
        assertTrue(recursiveEquals(retValue, term256765));
    }

};


