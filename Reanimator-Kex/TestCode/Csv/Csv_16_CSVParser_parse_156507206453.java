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

public class CSVParser_parse_156507206453 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term200793;
     Object term201643;
     Object term201515;

    public CSVParser_parse_156507206453() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term200845 = new Character((char) 36896);
        Character term200897 = new Character((char) 0);
        Character term200949 = new Character((char) 36896);
        term200793 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term197244 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term200793, term200793.getClass(), "delimiter", (char) 36896);
        setField(term200793, term200793.getClass(), "escapeCharacter", term200845);
        setField(term200793, term200793.getClass(), "quoteCharacter", term200897);
        setField(term200793, term200793.getClass(), "commentMarker", term200949);
        setBooleanField(term200793, term200793.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term200793, term200793.getClass(), "ignoreEmptyLines", true);
        setField(term200793, term200793.getClass(), "header", term197244);
        setBooleanField(term200793, term200793.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term200793, term200793.getClass(), "skipHeaderRecord", true);
        setIntField(null, Class.forName("java.io.BufferedReader"), "defaultCharBufferSize", 16);
        Character term201644 = new Character((char) 36896);
        Character term201645 = new Character((char) 36896);
        Character term201647 = new Character((char) 0);
        term201643 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term201646 = (Object[]) newArray("java.lang.String", 0);
        setBooleanField(term201643, term201643.getClass(), "allowMissingColumnNames", false);
        setField(term201643, term201643.getClass(), "commentMarker", term201644);
        setCharField(term201643, term201643.getClass(), "delimiter", (char) 36896);
        setField(term201643, term201643.getClass(), "escapeCharacter", term201645);
        setField(term201643, term201643.getClass(), "header", term201646);
        setField(term201643, term201643.getClass(), "headerComments", null);
        setBooleanField(term201643, term201643.getClass(), "ignoreEmptyLines", true);
        setBooleanField(term201643, term201643.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term201643, term201643.getClass(), "ignoreSurroundingSpaces", true);
        setField(term201643, term201643.getClass(), "nullString", null);
        setField(term201643, term201643.getClass(), "quoteCharacter", term201647);
        setField(term201643, term201643.getClass(), "quoteMode", null);
        setField(term201643, term201643.getClass(), "recordSeparator", null);
        setBooleanField(term201643, term201643.getClass(), "skipHeaderRecord", true);
        setBooleanField(term201643, term201643.getClass(), "trailingDelimiter", false);
        setBooleanField(term201643, term201643.getClass(), "trim", false);
        setBooleanField(term201643, term201643.getClass(), "autoFlush", false);
        Character term200964 = new Character((char) 36896);
        Character term200967 = new Character((char) 36896);
        Character term200973 = new Character((char) 0);
        LinkedHashMap term201516 = new LinkedHashMap();
        ArrayList term201562 = new ArrayList();
        Class<? extends Object> term201665 = Class.forName((String) "org.apache.commons.csv.Token$Type");
        Field term201664 = ((Class) term201665).getDeclaredField((String) "EOF");
        ((Field) term201664).setAccessible(true);
        Object enum86 = ((Field) term201664).get((Object) null);
        term201515 = newInstance(Class.forName("org.apache.commons.csv.CSVParser"));
        Object term200962 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term200969 = (Object[]) newArray("java.lang.String", 0);
        Object term201522 = newInstance(Class.forName("org.apache.commons.csv.Lexer"));
        Object term201529 = newInstance(Class.forName("org.apache.commons.csv.ExtendedBufferedReader"));
        Object term201534 = newInstance(Class.forName("java.io.StringReader"));
        char[] term201539 = (char[]) newCharArray(16);
        Object term201568 = newInstance(Class.forName("org.apache.commons.csv.Token"));
        Object term201576 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term201577 = (byte[]) newByteArray(50);
        setBooleanField(term200962, term200962.getClass(), "allowMissingColumnNames", false);
        setField(term200962, term200962.getClass(), "commentMarker", term200964);
        setCharField(term200962, term200962.getClass(), "delimiter", (char) 36896);
        setField(term200962, term200962.getClass(), "escapeCharacter", term200967);
        setField(term200962, term200962.getClass(), "header", term200969);
        setField(term200962, term200962.getClass(), "headerComments", null);
        setBooleanField(term200962, term200962.getClass(), "ignoreEmptyLines", true);
        setBooleanField(term200962, term200962.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term200962, term200962.getClass(), "ignoreSurroundingSpaces", true);
        setField(term200962, term200962.getClass(), "nullString", null);
        setField(term200962, term200962.getClass(), "quoteCharacter", term200973);
        setField(term200962, term200962.getClass(), "quoteMode", null);
        setField(term200962, term200962.getClass(), "recordSeparator", null);
        setBooleanField(term200962, term200962.getClass(), "skipHeaderRecord", true);
        setBooleanField(term200962, term200962.getClass(), "trailingDelimiter", false);
        setBooleanField(term200962, term200962.getClass(), "trim", false);
        setBooleanField(term200962, term200962.getClass(), "autoFlush", false);
        setField(term201515, term201515.getClass(), "format", term200962);
        setField(term201515, term201515.getClass(), "headerMap", term201516);
        setCharField(term201522, term201522.getClass(), "delimiter", (char) 36896);
        setCharField(term201522, term201522.getClass(), "escape", (char) 36896);
        setCharField(term201522, term201522.getClass(), "quoteChar", (char) 0);
        setCharField(term201522, term201522.getClass(), "commentStart", (char) 36896);
        setBooleanField(term201522, term201522.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term201522, term201522.getClass(), "ignoreEmptyLines", true);
        setIntField(term201529, term201529.getClass(), "lastChar", -1);
        setLongField(term201529, term201529.getClass(), "eolCounter", 0L);
        setLongField(term201529, term201529.getClass(), "position", 1L);
        setBooleanField(term201529, term201529.getClass(), "closed", false);
        setField(term201534, term201534.getClass(), "str", "");
        setIntField(term201534, term201534.getClass(), "length", 0);
        setIntField(term201534, term201534.getClass(), "next", 0);
        setIntField(term201534, term201534.getClass(), "mark", 0);
        setField(term201534, term201534.getClass(), "lock", term201534);
        setField(term201534, term201534.getClass(), "skipBuffer", null);
        setField(term201529, term201529.getClass(), "in", term201534);
        setField(term201529, term201529.getClass(), "cb", term201539);
        setIntField(term201529, term201529.getClass(), "nChars", 0);
        setIntField(term201529, term201529.getClass(), "nextChar", 0);
        setIntField(term201529, term201529.getClass(), "markedChar", -1);
        setIntField(term201529, term201529.getClass(), "readAheadLimit", 0);
        setBooleanField(term201529, term201529.getClass(), "skipLF", false);
        setBooleanField(term201529, term201529.getClass(), "markedSkipLF", false);
        setField(term201529, term201529.getClass(), "lock", term201534);
        setField(term201529, term201529.getClass(), "skipBuffer", null);
        setField(term201522, term201522.getClass(), "reader", term201529);
        setField(term201522, term201522.getClass(), "firstEol", null);
        setField(term201515, term201515.getClass(), "lexer", term201522);
        setField(term201515, term201515.getClass(), "recordList", term201562);
        setLongField(term201515, term201515.getClass(), "recordNumber", 0L);
        setLongField(term201515, term201515.getClass(), "characterOffset", 0L);
        setField(term201568, term201568.getClass(), "type", enum86);
        setField(term201576, term201576.getClass(), "value", term201577);
        setByteField(term201576, term201576.getClass(), "coder", (byte) 0);
        setIntField(term201576, term201576.getClass(), "count", 0);
        setField(term201568, term201568.getClass(), "content", term201576);
        setBooleanField(term201568, term201568.getClass(), "isReady", false);
        setField(term201515, term201515.getClass(), "reusableToken", term201568);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("org.apache.commons.csv.CSVFormat");
        Object[] args = new Object[2];
        args[0] = "";
        args[1] = term200793;
        Object retValue = callMethod(klass, "parse", argTypes, null, args);
        assertTrue(recursiveEquals(term200793, term201643));
        assertTrue(recursiveEquals(retValue, term201515));
    }

};


