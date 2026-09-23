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

public class CSVParser_parse_156507206493 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term285291;
     Object term286035;
     Object term285922;

    public CSVParser_parse_156507206493() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term285343 = new Character((char) 0);
        Character term285395 = new Character((char) 0);
        Character term285447 = new Character((char) 0);
        term285291 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term282346 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term285291, term285291.getClass(), "delimiter", (char) 0);
        setField(term285291, term285291.getClass(), "escapeCharacter", term285343);
        setField(term285291, term285291.getClass(), "quoteCharacter", term285395);
        setField(term285291, term285291.getClass(), "commentMarker", term285447);
        setBooleanField(term285291, term285291.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term285291, term285291.getClass(), "ignoreEmptyLines", false);
        setField(term285291, term285291.getClass(), "header", term282346);
        setBooleanField(term285291, term285291.getClass(), "ignoreHeaderCase", false);
        setIntField(null, Class.forName("java.io.BufferedReader"), "defaultCharBufferSize", 1);
        Character term286036 = new Character((char) 0);
        Character term286037 = new Character((char) 0);
        Character term286039 = new Character((char) 0);
        term286035 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term286038 = (Object[]) newArray("java.lang.String", 0);
        setBooleanField(term286035, term286035.getClass(), "allowMissingColumnNames", false);
        setField(term286035, term286035.getClass(), "commentMarker", term286036);
        setCharField(term286035, term286035.getClass(), "delimiter", (char) 0);
        setField(term286035, term286035.getClass(), "escapeCharacter", term286037);
        setField(term286035, term286035.getClass(), "header", term286038);
        setField(term286035, term286035.getClass(), "headerComments", null);
        setBooleanField(term286035, term286035.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term286035, term286035.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term286035, term286035.getClass(), "ignoreSurroundingSpaces", false);
        setField(term286035, term286035.getClass(), "nullString", null);
        setField(term286035, term286035.getClass(), "quoteCharacter", term286039);
        setField(term286035, term286035.getClass(), "quoteMode", null);
        setField(term286035, term286035.getClass(), "recordSeparator", null);
        setBooleanField(term286035, term286035.getClass(), "skipHeaderRecord", false);
        setBooleanField(term286035, term286035.getClass(), "trailingDelimiter", false);
        setBooleanField(term286035, term286035.getClass(), "trim", false);
        setBooleanField(term286035, term286035.getClass(), "autoFlush", false);
        Character term285462 = new Character((char) 0);
        Character term285465 = new Character((char) 0);
        Character term285471 = new Character((char) 0);
        LinkedHashMap term285923 = new LinkedHashMap();
        ArrayList term285954 = new ArrayList();
        Class<? extends Object> term286042 = Class.forName((String) "org.apache.commons.csv.Token$Type");
        Field term286041 = ((Class) term286042).getDeclaredField((String) "EOF");
        ((Field) term286041).setAccessible(true);
        Object enum98 = ((Field) term286041).get((Object) null);
        term285922 = newInstance(Class.forName("org.apache.commons.csv.CSVParser"));
        Object term285460 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term285467 = (Object[]) newArray("java.lang.String", 0);
        Object term285929 = newInstance(Class.forName("org.apache.commons.csv.Lexer"));
        Object term285936 = newInstance(Class.forName("org.apache.commons.csv.ExtendedBufferedReader"));
        Object term285941 = newInstance(Class.forName("java.io.StringReader"));
        char[] term285946 = (char[]) newCharArray(1);
        Object term285960 = newInstance(Class.forName("org.apache.commons.csv.Token"));
        Object term285968 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term285969 = (byte[]) newByteArray(50);
        setBooleanField(term285460, term285460.getClass(), "allowMissingColumnNames", false);
        setField(term285460, term285460.getClass(), "commentMarker", term285462);
        setCharField(term285460, term285460.getClass(), "delimiter", (char) 0);
        setField(term285460, term285460.getClass(), "escapeCharacter", term285465);
        setField(term285460, term285460.getClass(), "header", term285467);
        setField(term285460, term285460.getClass(), "headerComments", null);
        setBooleanField(term285460, term285460.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term285460, term285460.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term285460, term285460.getClass(), "ignoreSurroundingSpaces", false);
        setField(term285460, term285460.getClass(), "nullString", null);
        setField(term285460, term285460.getClass(), "quoteCharacter", term285471);
        setField(term285460, term285460.getClass(), "quoteMode", null);
        setField(term285460, term285460.getClass(), "recordSeparator", null);
        setBooleanField(term285460, term285460.getClass(), "skipHeaderRecord", false);
        setBooleanField(term285460, term285460.getClass(), "trailingDelimiter", false);
        setBooleanField(term285460, term285460.getClass(), "trim", false);
        setBooleanField(term285460, term285460.getClass(), "autoFlush", false);
        setField(term285922, term285922.getClass(), "format", term285460);
        setField(term285922, term285922.getClass(), "headerMap", term285923);
        setCharField(term285929, term285929.getClass(), "delimiter", (char) 0);
        setCharField(term285929, term285929.getClass(), "escape", (char) 0);
        setCharField(term285929, term285929.getClass(), "quoteChar", (char) 0);
        setCharField(term285929, term285929.getClass(), "commentStart", (char) 0);
        setBooleanField(term285929, term285929.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term285929, term285929.getClass(), "ignoreEmptyLines", false);
        setIntField(term285936, term285936.getClass(), "lastChar", -1);
        setLongField(term285936, term285936.getClass(), "eolCounter", 0L);
        setLongField(term285936, term285936.getClass(), "position", 1L);
        setBooleanField(term285936, term285936.getClass(), "closed", false);
        setField(term285941, term285941.getClass(), "str", "");
        setIntField(term285941, term285941.getClass(), "length", 0);
        setIntField(term285941, term285941.getClass(), "next", 0);
        setIntField(term285941, term285941.getClass(), "mark", 0);
        setField(term285941, term285941.getClass(), "lock", term285941);
        setField(term285941, term285941.getClass(), "skipBuffer", null);
        setField(term285936, term285936.getClass(), "in", term285941);
        setField(term285936, term285936.getClass(), "cb", term285946);
        setIntField(term285936, term285936.getClass(), "nChars", 0);
        setIntField(term285936, term285936.getClass(), "nextChar", 0);
        setIntField(term285936, term285936.getClass(), "markedChar", -1);
        setIntField(term285936, term285936.getClass(), "readAheadLimit", 0);
        setBooleanField(term285936, term285936.getClass(), "skipLF", false);
        setBooleanField(term285936, term285936.getClass(), "markedSkipLF", false);
        setField(term285936, term285936.getClass(), "lock", term285941);
        setField(term285936, term285936.getClass(), "skipBuffer", null);
        setField(term285929, term285929.getClass(), "reader", term285936);
        setField(term285929, term285929.getClass(), "firstEol", null);
        setField(term285922, term285922.getClass(), "lexer", term285929);
        setField(term285922, term285922.getClass(), "recordList", term285954);
        setLongField(term285922, term285922.getClass(), "recordNumber", 0L);
        setLongField(term285922, term285922.getClass(), "characterOffset", 0L);
        setField(term285960, term285960.getClass(), "type", enum98);
        setField(term285968, term285968.getClass(), "value", term285969);
        setByteField(term285968, term285968.getClass(), "coder", (byte) 0);
        setIntField(term285968, term285968.getClass(), "count", 0);
        setField(term285960, term285960.getClass(), "content", term285968);
        setBooleanField(term285960, term285960.getClass(), "isReady", false);
        setField(term285922, term285922.getClass(), "reusableToken", term285960);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("org.apache.commons.csv.CSVFormat");
        Object[] args = new Object[2];
        args[0] = "";
        args[1] = term285291;
        Object retValue = callMethod(klass, "parse", argTypes, null, args);
        assertTrue(recursiveEquals(term285291, term286035));
        assertTrue(recursiveEquals(retValue, term285922));
    }

};


