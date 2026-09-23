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

public class CSVParser_parse_156507206487 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term269816;
     Object term270509;
     Object term270396;

    public CSVParser_parse_156507206487() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term269868 = new Character((char) 0);
        Character term269920 = new Character((char) 0);
        term269816 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term268208 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term269816, term269816.getClass(), "delimiter", (char) 0);
        setField(term269816, term269816.getClass(), "escapeCharacter", term269868);
        setField(term269816, term269816.getClass(), "quoteCharacter", term269920);
        setField(term269816, term269816.getClass(), "commentMarker", term269868);
        setBooleanField(term269816, term269816.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term269816, term269816.getClass(), "ignoreEmptyLines", true);
        setField(term269816, term269816.getClass(), "header", term268208);
        setBooleanField(term269816, term269816.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term269816, term269816.getClass(), "skipHeaderRecord", true);
        setIntField(null, Class.forName("java.io.BufferedReader"), "defaultCharBufferSize", 1);
        Character term270510 = new Character((char) 0);
        Character term270511 = new Character((char) 0);
        Character term270513 = new Character((char) 0);
        term270509 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term270512 = (Object[]) newArray("java.lang.String", 0);
        setBooleanField(term270509, term270509.getClass(), "allowMissingColumnNames", false);
        setField(term270509, term270509.getClass(), "commentMarker", term270510);
        setCharField(term270509, term270509.getClass(), "delimiter", (char) 0);
        setField(term270509, term270509.getClass(), "escapeCharacter", term270511);
        setField(term270509, term270509.getClass(), "header", term270512);
        setField(term270509, term270509.getClass(), "headerComments", null);
        setBooleanField(term270509, term270509.getClass(), "ignoreEmptyLines", true);
        setBooleanField(term270509, term270509.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term270509, term270509.getClass(), "ignoreSurroundingSpaces", true);
        setField(term270509, term270509.getClass(), "nullString", null);
        setField(term270509, term270509.getClass(), "quoteCharacter", term270513);
        setField(term270509, term270509.getClass(), "quoteMode", null);
        setField(term270509, term270509.getClass(), "recordSeparator", null);
        setBooleanField(term270509, term270509.getClass(), "skipHeaderRecord", true);
        setBooleanField(term270509, term270509.getClass(), "trailingDelimiter", false);
        setBooleanField(term270509, term270509.getClass(), "trim", false);
        setBooleanField(term270509, term270509.getClass(), "autoFlush", false);
        Character term269935 = new Character((char) 0);
        Character term269938 = new Character((char) 0);
        Character term269944 = new Character((char) 0);
        LinkedHashMap term270397 = new LinkedHashMap();
        ArrayList term270428 = new ArrayList();
        Class<? extends Object> term270516 = Class.forName((String) "org.apache.commons.csv.Token$Type");
        Field term270515 = ((Class) term270516).getDeclaredField((String) "EOF");
        ((Field) term270515).setAccessible(true);
        Object enum96 = ((Field) term270515).get((Object) null);
        term270396 = newInstance(Class.forName("org.apache.commons.csv.CSVParser"));
        Object term269933 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term269940 = (Object[]) newArray("java.lang.String", 0);
        Object term270403 = newInstance(Class.forName("org.apache.commons.csv.Lexer"));
        Object term270410 = newInstance(Class.forName("org.apache.commons.csv.ExtendedBufferedReader"));
        Object term270415 = newInstance(Class.forName("java.io.StringReader"));
        char[] term270420 = (char[]) newCharArray(1);
        Object term270434 = newInstance(Class.forName("org.apache.commons.csv.Token"));
        Object term270442 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term270443 = (byte[]) newByteArray(50);
        setBooleanField(term269933, term269933.getClass(), "allowMissingColumnNames", false);
        setField(term269933, term269933.getClass(), "commentMarker", term269935);
        setCharField(term269933, term269933.getClass(), "delimiter", (char) 0);
        setField(term269933, term269933.getClass(), "escapeCharacter", term269938);
        setField(term269933, term269933.getClass(), "header", term269940);
        setField(term269933, term269933.getClass(), "headerComments", null);
        setBooleanField(term269933, term269933.getClass(), "ignoreEmptyLines", true);
        setBooleanField(term269933, term269933.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term269933, term269933.getClass(), "ignoreSurroundingSpaces", true);
        setField(term269933, term269933.getClass(), "nullString", null);
        setField(term269933, term269933.getClass(), "quoteCharacter", term269944);
        setField(term269933, term269933.getClass(), "quoteMode", null);
        setField(term269933, term269933.getClass(), "recordSeparator", null);
        setBooleanField(term269933, term269933.getClass(), "skipHeaderRecord", true);
        setBooleanField(term269933, term269933.getClass(), "trailingDelimiter", false);
        setBooleanField(term269933, term269933.getClass(), "trim", false);
        setBooleanField(term269933, term269933.getClass(), "autoFlush", false);
        setField(term270396, term270396.getClass(), "format", term269933);
        setField(term270396, term270396.getClass(), "headerMap", term270397);
        setCharField(term270403, term270403.getClass(), "delimiter", (char) 0);
        setCharField(term270403, term270403.getClass(), "escape", (char) 0);
        setCharField(term270403, term270403.getClass(), "quoteChar", (char) 0);
        setCharField(term270403, term270403.getClass(), "commentStart", (char) 0);
        setBooleanField(term270403, term270403.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term270403, term270403.getClass(), "ignoreEmptyLines", true);
        setIntField(term270410, term270410.getClass(), "lastChar", -1);
        setLongField(term270410, term270410.getClass(), "eolCounter", 0L);
        setLongField(term270410, term270410.getClass(), "position", 1L);
        setBooleanField(term270410, term270410.getClass(), "closed", false);
        setField(term270415, term270415.getClass(), "str", "");
        setIntField(term270415, term270415.getClass(), "length", 0);
        setIntField(term270415, term270415.getClass(), "next", 0);
        setIntField(term270415, term270415.getClass(), "mark", 0);
        setField(term270415, term270415.getClass(), "lock", term270415);
        setField(term270415, term270415.getClass(), "skipBuffer", null);
        setField(term270410, term270410.getClass(), "in", term270415);
        setField(term270410, term270410.getClass(), "cb", term270420);
        setIntField(term270410, term270410.getClass(), "nChars", 0);
        setIntField(term270410, term270410.getClass(), "nextChar", 0);
        setIntField(term270410, term270410.getClass(), "markedChar", -1);
        setIntField(term270410, term270410.getClass(), "readAheadLimit", 0);
        setBooleanField(term270410, term270410.getClass(), "skipLF", false);
        setBooleanField(term270410, term270410.getClass(), "markedSkipLF", false);
        setField(term270410, term270410.getClass(), "lock", term270415);
        setField(term270410, term270410.getClass(), "skipBuffer", null);
        setField(term270403, term270403.getClass(), "reader", term270410);
        setField(term270403, term270403.getClass(), "firstEol", null);
        setField(term270396, term270396.getClass(), "lexer", term270403);
        setField(term270396, term270396.getClass(), "recordList", term270428);
        setLongField(term270396, term270396.getClass(), "recordNumber", 0L);
        setLongField(term270396, term270396.getClass(), "characterOffset", 0L);
        setField(term270434, term270434.getClass(), "type", enum96);
        setField(term270442, term270442.getClass(), "value", term270443);
        setByteField(term270442, term270442.getClass(), "coder", (byte) 0);
        setIntField(term270442, term270442.getClass(), "count", 0);
        setField(term270434, term270434.getClass(), "content", term270442);
        setBooleanField(term270434, term270434.getClass(), "isReady", false);
        setField(term270396, term270396.getClass(), "reusableToken", term270434);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("org.apache.commons.csv.CSVFormat");
        Object[] args = new Object[2];
        args[0] = "";
        args[1] = term269816;
        Object retValue = callMethod(klass, "parse", argTypes, null, args);
        assertTrue(recursiveEquals(term269816, term270509));
        assertTrue(recursiveEquals(retValue, term270396));
    }

};


