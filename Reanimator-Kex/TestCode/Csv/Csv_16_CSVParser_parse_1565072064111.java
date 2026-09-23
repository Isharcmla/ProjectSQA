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

public class CSVParser_parse_1565072064111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term322599;
     Object term326921;
     Object term326297;

    public CSVParser_parse_1565072064111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term322651 = new Character((char) 0);
        Character term322703 = new Character((char) 0);
        Character term322755 = new Character((char) 0);
        term322599 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term321341 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term322599, term322599.getClass(), "delimiter", (char) 0);
        setField(term322599, term322599.getClass(), "escapeCharacter", term322651);
        setField(term322599, term322599.getClass(), "quoteCharacter", term322703);
        setField(term322599, term322599.getClass(), "commentMarker", term322755);
        setBooleanField(term322599, term322599.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term322599, term322599.getClass(), "ignoreEmptyLines", true);
        setField(term322599, term322599.getClass(), "header", term321341);
        setBooleanField(term322599, term322599.getClass(), "ignoreHeaderCase", false);
        setIntField(null, Class.forName("java.io.BufferedReader"), "defaultCharBufferSize", 512);
        Character term326922 = new Character((char) 0);
        Character term326923 = new Character((char) 0);
        Character term326925 = new Character((char) 0);
        term326921 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term326924 = (Object[]) newArray("java.lang.String", 0);
        setBooleanField(term326921, term326921.getClass(), "allowMissingColumnNames", false);
        setField(term326921, term326921.getClass(), "commentMarker", term326922);
        setCharField(term326921, term326921.getClass(), "delimiter", (char) 0);
        setField(term326921, term326921.getClass(), "escapeCharacter", term326923);
        setField(term326921, term326921.getClass(), "header", term326924);
        setField(term326921, term326921.getClass(), "headerComments", null);
        setBooleanField(term326921, term326921.getClass(), "ignoreEmptyLines", true);
        setBooleanField(term326921, term326921.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term326921, term326921.getClass(), "ignoreSurroundingSpaces", false);
        setField(term326921, term326921.getClass(), "nullString", null);
        setField(term326921, term326921.getClass(), "quoteCharacter", term326925);
        setField(term326921, term326921.getClass(), "quoteMode", null);
        setField(term326921, term326921.getClass(), "recordSeparator", null);
        setBooleanField(term326921, term326921.getClass(), "skipHeaderRecord", false);
        setBooleanField(term326921, term326921.getClass(), "trailingDelimiter", false);
        setBooleanField(term326921, term326921.getClass(), "trim", false);
        setBooleanField(term326921, term326921.getClass(), "autoFlush", false);
        Character term322770 = new Character((char) 0);
        Character term322773 = new Character((char) 0);
        Character term322779 = new Character((char) 0);
        LinkedHashMap term326298 = new LinkedHashMap();
        ArrayList term326840 = new ArrayList();
        Class<? extends Object> term327439 = Class.forName((String) "org.apache.commons.csv.Token$Type");
        Field term327438 = ((Class) term327439).getDeclaredField((String) "EOF");
        ((Field) term327438).setAccessible(true);
        Object enum105 = ((Field) term327438).get((Object) null);
        term326297 = newInstance(Class.forName("org.apache.commons.csv.CSVParser"));
        Object term322768 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term322775 = (Object[]) newArray("java.lang.String", 0);
        Object term326304 = newInstance(Class.forName("org.apache.commons.csv.Lexer"));
        Object term326311 = newInstance(Class.forName("org.apache.commons.csv.ExtendedBufferedReader"));
        Object term326316 = newInstance(Class.forName("java.io.StringReader"));
        char[] term326321 = (char[]) newCharArray(512);
        Object term326846 = newInstance(Class.forName("org.apache.commons.csv.Token"));
        Object term326854 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term326855 = (byte[]) newByteArray(50);
        setBooleanField(term322768, term322768.getClass(), "allowMissingColumnNames", false);
        setField(term322768, term322768.getClass(), "commentMarker", term322770);
        setCharField(term322768, term322768.getClass(), "delimiter", (char) 0);
        setField(term322768, term322768.getClass(), "escapeCharacter", term322773);
        setField(term322768, term322768.getClass(), "header", term322775);
        setField(term322768, term322768.getClass(), "headerComments", null);
        setBooleanField(term322768, term322768.getClass(), "ignoreEmptyLines", true);
        setBooleanField(term322768, term322768.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term322768, term322768.getClass(), "ignoreSurroundingSpaces", false);
        setField(term322768, term322768.getClass(), "nullString", null);
        setField(term322768, term322768.getClass(), "quoteCharacter", term322779);
        setField(term322768, term322768.getClass(), "quoteMode", null);
        setField(term322768, term322768.getClass(), "recordSeparator", null);
        setBooleanField(term322768, term322768.getClass(), "skipHeaderRecord", false);
        setBooleanField(term322768, term322768.getClass(), "trailingDelimiter", false);
        setBooleanField(term322768, term322768.getClass(), "trim", false);
        setBooleanField(term322768, term322768.getClass(), "autoFlush", false);
        setField(term326297, term326297.getClass(), "format", term322768);
        setField(term326297, term326297.getClass(), "headerMap", term326298);
        setCharField(term326304, term326304.getClass(), "delimiter", (char) 0);
        setCharField(term326304, term326304.getClass(), "escape", (char) 0);
        setCharField(term326304, term326304.getClass(), "quoteChar", (char) 0);
        setCharField(term326304, term326304.getClass(), "commentStart", (char) 0);
        setBooleanField(term326304, term326304.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term326304, term326304.getClass(), "ignoreEmptyLines", true);
        setIntField(term326311, term326311.getClass(), "lastChar", -1);
        setLongField(term326311, term326311.getClass(), "eolCounter", 0L);
        setLongField(term326311, term326311.getClass(), "position", 1L);
        setBooleanField(term326311, term326311.getClass(), "closed", false);
        setField(term326316, term326316.getClass(), "str", "");
        setIntField(term326316, term326316.getClass(), "length", 0);
        setIntField(term326316, term326316.getClass(), "next", 0);
        setIntField(term326316, term326316.getClass(), "mark", 0);
        setField(term326316, term326316.getClass(), "lock", term326316);
        setField(term326316, term326316.getClass(), "skipBuffer", null);
        setField(term326311, term326311.getClass(), "in", term326316);
        setField(term326311, term326311.getClass(), "cb", term326321);
        setIntField(term326311, term326311.getClass(), "nChars", 0);
        setIntField(term326311, term326311.getClass(), "nextChar", 0);
        setIntField(term326311, term326311.getClass(), "markedChar", -1);
        setIntField(term326311, term326311.getClass(), "readAheadLimit", 0);
        setBooleanField(term326311, term326311.getClass(), "skipLF", false);
        setBooleanField(term326311, term326311.getClass(), "markedSkipLF", false);
        setField(term326311, term326311.getClass(), "lock", term326316);
        setField(term326311, term326311.getClass(), "skipBuffer", null);
        setField(term326304, term326304.getClass(), "reader", term326311);
        setField(term326304, term326304.getClass(), "firstEol", null);
        setField(term326297, term326297.getClass(), "lexer", term326304);
        setField(term326297, term326297.getClass(), "recordList", term326840);
        setLongField(term326297, term326297.getClass(), "recordNumber", 0L);
        setLongField(term326297, term326297.getClass(), "characterOffset", 0L);
        setField(term326846, term326846.getClass(), "type", enum105);
        setField(term326854, term326854.getClass(), "value", term326855);
        setByteField(term326854, term326854.getClass(), "coder", (byte) 0);
        setIntField(term326854, term326854.getClass(), "count", 0);
        setField(term326846, term326846.getClass(), "content", term326854);
        setBooleanField(term326846, term326846.getClass(), "isReady", false);
        setField(term326297, term326297.getClass(), "reusableToken", term326846);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("org.apache.commons.csv.CSVFormat");
        Object[] args = new Object[2];
        args[0] = "";
        args[1] = term322599;
        Object retValue = callMethod(klass, "parse", argTypes, null, args);
        assertTrue(recursiveEquals(term322599, term326921));
        assertTrue(recursiveEquals(retValue, term326297));
    }

};


