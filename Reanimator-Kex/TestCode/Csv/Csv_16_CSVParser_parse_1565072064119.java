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

public class CSVParser_parse_1565072064119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term340068;
     Object term340862;
     Object term340742;

    public CSVParser_parse_1565072064119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term340120 = new Character((char) 0);
        Character term340172 = new Character((char) 0);
        Character term340224 = new Character((char) 0);
        term340068 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term337705 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term340068, term340068.getClass(), "delimiter", (char) 0);
        setField(term340068, term340068.getClass(), "escapeCharacter", term340120);
        setField(term340068, term340068.getClass(), "quoteCharacter", term340172);
        setField(term340068, term340068.getClass(), "commentMarker", term340224);
        setBooleanField(term340068, term340068.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term340068, term340068.getClass(), "ignoreEmptyLines", true);
        setField(term340068, term340068.getClass(), "header", term337705);
        setBooleanField(term340068, term340068.getClass(), "ignoreHeaderCase", false);
        setIntField(null, Class.forName("java.io.BufferedReader"), "defaultCharBufferSize", 8);
        Character term340863 = new Character((char) 0);
        Character term340864 = new Character((char) 0);
        Character term340866 = new Character((char) 0);
        term340862 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term340865 = (Object[]) newArray("java.lang.String", 0);
        setBooleanField(term340862, term340862.getClass(), "allowMissingColumnNames", false);
        setField(term340862, term340862.getClass(), "commentMarker", term340863);
        setCharField(term340862, term340862.getClass(), "delimiter", (char) 0);
        setField(term340862, term340862.getClass(), "escapeCharacter", term340864);
        setField(term340862, term340862.getClass(), "header", term340865);
        setField(term340862, term340862.getClass(), "headerComments", null);
        setBooleanField(term340862, term340862.getClass(), "ignoreEmptyLines", true);
        setBooleanField(term340862, term340862.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term340862, term340862.getClass(), "ignoreSurroundingSpaces", false);
        setField(term340862, term340862.getClass(), "nullString", null);
        setField(term340862, term340862.getClass(), "quoteCharacter", term340866);
        setField(term340862, term340862.getClass(), "quoteMode", null);
        setField(term340862, term340862.getClass(), "recordSeparator", null);
        setBooleanField(term340862, term340862.getClass(), "skipHeaderRecord", false);
        setBooleanField(term340862, term340862.getClass(), "trailingDelimiter", false);
        setBooleanField(term340862, term340862.getClass(), "trim", false);
        setBooleanField(term340862, term340862.getClass(), "autoFlush", false);
        Character term340239 = new Character((char) 0);
        Character term340242 = new Character((char) 0);
        Character term340248 = new Character((char) 0);
        LinkedHashMap term340743 = new LinkedHashMap();
        ArrayList term340781 = new ArrayList();
        Class<? extends Object> term340876 = Class.forName((String) "org.apache.commons.csv.Token$Type");
        Field term340875 = ((Class) term340876).getDeclaredField((String) "EOF");
        ((Field) term340875).setAccessible(true);
        Object enum107 = ((Field) term340875).get((Object) null);
        term340742 = newInstance(Class.forName("org.apache.commons.csv.CSVParser"));
        Object term340237 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term340244 = (Object[]) newArray("java.lang.String", 0);
        Object term340749 = newInstance(Class.forName("org.apache.commons.csv.Lexer"));
        Object term340756 = newInstance(Class.forName("org.apache.commons.csv.ExtendedBufferedReader"));
        Object term340761 = newInstance(Class.forName("java.io.StringReader"));
        char[] term340766 = (char[]) newCharArray(8);
        Object term340787 = newInstance(Class.forName("org.apache.commons.csv.Token"));
        Object term340795 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term340796 = (byte[]) newByteArray(50);
        setBooleanField(term340237, term340237.getClass(), "allowMissingColumnNames", false);
        setField(term340237, term340237.getClass(), "commentMarker", term340239);
        setCharField(term340237, term340237.getClass(), "delimiter", (char) 0);
        setField(term340237, term340237.getClass(), "escapeCharacter", term340242);
        setField(term340237, term340237.getClass(), "header", term340244);
        setField(term340237, term340237.getClass(), "headerComments", null);
        setBooleanField(term340237, term340237.getClass(), "ignoreEmptyLines", true);
        setBooleanField(term340237, term340237.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term340237, term340237.getClass(), "ignoreSurroundingSpaces", false);
        setField(term340237, term340237.getClass(), "nullString", null);
        setField(term340237, term340237.getClass(), "quoteCharacter", term340248);
        setField(term340237, term340237.getClass(), "quoteMode", null);
        setField(term340237, term340237.getClass(), "recordSeparator", null);
        setBooleanField(term340237, term340237.getClass(), "skipHeaderRecord", false);
        setBooleanField(term340237, term340237.getClass(), "trailingDelimiter", false);
        setBooleanField(term340237, term340237.getClass(), "trim", false);
        setBooleanField(term340237, term340237.getClass(), "autoFlush", false);
        setField(term340742, term340742.getClass(), "format", term340237);
        setField(term340742, term340742.getClass(), "headerMap", term340743);
        setCharField(term340749, term340749.getClass(), "delimiter", (char) 0);
        setCharField(term340749, term340749.getClass(), "escape", (char) 0);
        setCharField(term340749, term340749.getClass(), "quoteChar", (char) 0);
        setCharField(term340749, term340749.getClass(), "commentStart", (char) 0);
        setBooleanField(term340749, term340749.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term340749, term340749.getClass(), "ignoreEmptyLines", true);
        setIntField(term340756, term340756.getClass(), "lastChar", -1);
        setLongField(term340756, term340756.getClass(), "eolCounter", 0L);
        setLongField(term340756, term340756.getClass(), "position", 1L);
        setBooleanField(term340756, term340756.getClass(), "closed", false);
        setField(term340761, term340761.getClass(), "str", "");
        setIntField(term340761, term340761.getClass(), "length", 0);
        setIntField(term340761, term340761.getClass(), "next", 0);
        setIntField(term340761, term340761.getClass(), "mark", 0);
        setField(term340761, term340761.getClass(), "lock", term340761);
        setField(term340761, term340761.getClass(), "skipBuffer", null);
        setField(term340756, term340756.getClass(), "in", term340761);
        setField(term340756, term340756.getClass(), "cb", term340766);
        setIntField(term340756, term340756.getClass(), "nChars", 0);
        setIntField(term340756, term340756.getClass(), "nextChar", 0);
        setIntField(term340756, term340756.getClass(), "markedChar", -1);
        setIntField(term340756, term340756.getClass(), "readAheadLimit", 0);
        setBooleanField(term340756, term340756.getClass(), "skipLF", false);
        setBooleanField(term340756, term340756.getClass(), "markedSkipLF", false);
        setField(term340756, term340756.getClass(), "lock", term340761);
        setField(term340756, term340756.getClass(), "skipBuffer", null);
        setField(term340749, term340749.getClass(), "reader", term340756);
        setField(term340749, term340749.getClass(), "firstEol", null);
        setField(term340742, term340742.getClass(), "lexer", term340749);
        setField(term340742, term340742.getClass(), "recordList", term340781);
        setLongField(term340742, term340742.getClass(), "recordNumber", 0L);
        setLongField(term340742, term340742.getClass(), "characterOffset", 0L);
        setField(term340787, term340787.getClass(), "type", enum107);
        setField(term340795, term340795.getClass(), "value", term340796);
        setByteField(term340795, term340795.getClass(), "coder", (byte) 0);
        setIntField(term340795, term340795.getClass(), "count", 0);
        setField(term340787, term340787.getClass(), "content", term340795);
        setBooleanField(term340787, term340787.getClass(), "isReady", false);
        setField(term340742, term340742.getClass(), "reusableToken", term340787);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("org.apache.commons.csv.CSVFormat");
        Object[] args = new Object[2];
        args[0] = "";
        args[1] = term340068;
        Object retValue = callMethod(klass, "parse", argTypes, null, args);
        assertTrue(recursiveEquals(term340068, term340862));
        assertTrue(recursiveEquals(retValue, term340742));
    }

};


