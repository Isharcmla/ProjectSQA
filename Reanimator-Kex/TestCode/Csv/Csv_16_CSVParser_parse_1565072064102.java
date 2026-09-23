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

public class CSVParser_parse_1565072064102 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term306924;
     Object term311770;
     Object term311146;

    public CSVParser_parse_1565072064102() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term306976 = new Character((char) 0);
        Character term307028 = new Character((char) 0);
        Character term307080 = new Character((char) 0);
        term306924 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term305666 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term306924, term306924.getClass(), "delimiter", (char) 0);
        setField(term306924, term306924.getClass(), "escapeCharacter", term306976);
        setField(term306924, term306924.getClass(), "quoteCharacter", term307028);
        setField(term306924, term306924.getClass(), "commentMarker", term307080);
        setBooleanField(term306924, term306924.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term306924, term306924.getClass(), "ignoreEmptyLines", true);
        setField(term306924, term306924.getClass(), "header", term305666);
        setBooleanField(term306924, term306924.getClass(), "ignoreHeaderCase", false);
        setIntField(null, Class.forName("java.io.BufferedReader"), "defaultCharBufferSize", 512);
        Character term311771 = new Character((char) 0);
        Character term311772 = new Character((char) 0);
        Character term311774 = new Character((char) 0);
        term311770 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term311773 = (Object[]) newArray("java.lang.String", 0);
        setBooleanField(term311770, term311770.getClass(), "allowMissingColumnNames", false);
        setField(term311770, term311770.getClass(), "commentMarker", term311771);
        setCharField(term311770, term311770.getClass(), "delimiter", (char) 0);
        setField(term311770, term311770.getClass(), "escapeCharacter", term311772);
        setField(term311770, term311770.getClass(), "header", term311773);
        setField(term311770, term311770.getClass(), "headerComments", null);
        setBooleanField(term311770, term311770.getClass(), "ignoreEmptyLines", true);
        setBooleanField(term311770, term311770.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term311770, term311770.getClass(), "ignoreSurroundingSpaces", false);
        setField(term311770, term311770.getClass(), "nullString", null);
        setField(term311770, term311770.getClass(), "quoteCharacter", term311774);
        setField(term311770, term311770.getClass(), "quoteMode", null);
        setField(term311770, term311770.getClass(), "recordSeparator", null);
        setBooleanField(term311770, term311770.getClass(), "skipHeaderRecord", false);
        setBooleanField(term311770, term311770.getClass(), "trailingDelimiter", false);
        setBooleanField(term311770, term311770.getClass(), "trim", false);
        setBooleanField(term311770, term311770.getClass(), "autoFlush", false);
        Character term307619 = new Character((char) 0);
        Character term307622 = new Character((char) 0);
        Character term307628 = new Character((char) 0);
        LinkedHashMap term311147 = new LinkedHashMap();
        ArrayList term311689 = new ArrayList();
        Class<? extends Object> term312288 = Class.forName((String) "org.apache.commons.csv.Token$Type");
        Field term312287 = ((Class) term312288).getDeclaredField((String) "EOF");
        ((Field) term312287).setAccessible(true);
        Object enum102 = ((Field) term312287).get((Object) null);
        term311146 = newInstance(Class.forName("org.apache.commons.csv.CSVParser"));
        Object term307617 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term307624 = (Object[]) newArray("java.lang.String", 0);
        Object term311153 = newInstance(Class.forName("org.apache.commons.csv.Lexer"));
        Object term311160 = newInstance(Class.forName("org.apache.commons.csv.ExtendedBufferedReader"));
        Object term311165 = newInstance(Class.forName("java.io.StringReader"));
        char[] term311170 = (char[]) newCharArray(512);
        Object term311695 = newInstance(Class.forName("org.apache.commons.csv.Token"));
        Object term311703 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term311704 = (byte[]) newByteArray(50);
        setBooleanField(term307617, term307617.getClass(), "allowMissingColumnNames", false);
        setField(term307617, term307617.getClass(), "commentMarker", term307619);
        setCharField(term307617, term307617.getClass(), "delimiter", (char) 0);
        setField(term307617, term307617.getClass(), "escapeCharacter", term307622);
        setField(term307617, term307617.getClass(), "header", term307624);
        setField(term307617, term307617.getClass(), "headerComments", null);
        setBooleanField(term307617, term307617.getClass(), "ignoreEmptyLines", true);
        setBooleanField(term307617, term307617.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term307617, term307617.getClass(), "ignoreSurroundingSpaces", false);
        setField(term307617, term307617.getClass(), "nullString", null);
        setField(term307617, term307617.getClass(), "quoteCharacter", term307628);
        setField(term307617, term307617.getClass(), "quoteMode", null);
        setField(term307617, term307617.getClass(), "recordSeparator", null);
        setBooleanField(term307617, term307617.getClass(), "skipHeaderRecord", false);
        setBooleanField(term307617, term307617.getClass(), "trailingDelimiter", false);
        setBooleanField(term307617, term307617.getClass(), "trim", false);
        setBooleanField(term307617, term307617.getClass(), "autoFlush", false);
        setField(term311146, term311146.getClass(), "format", term307617);
        setField(term311146, term311146.getClass(), "headerMap", term311147);
        setCharField(term311153, term311153.getClass(), "delimiter", (char) 0);
        setCharField(term311153, term311153.getClass(), "escape", (char) 0);
        setCharField(term311153, term311153.getClass(), "quoteChar", (char) 0);
        setCharField(term311153, term311153.getClass(), "commentStart", (char) 0);
        setBooleanField(term311153, term311153.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term311153, term311153.getClass(), "ignoreEmptyLines", true);
        setIntField(term311160, term311160.getClass(), "lastChar", -1);
        setLongField(term311160, term311160.getClass(), "eolCounter", 0L);
        setLongField(term311160, term311160.getClass(), "position", 1L);
        setBooleanField(term311160, term311160.getClass(), "closed", false);
        setField(term311165, term311165.getClass(), "str", "");
        setIntField(term311165, term311165.getClass(), "length", 0);
        setIntField(term311165, term311165.getClass(), "next", 0);
        setIntField(term311165, term311165.getClass(), "mark", 0);
        setField(term311165, term311165.getClass(), "lock", term311165);
        setField(term311165, term311165.getClass(), "skipBuffer", null);
        setField(term311160, term311160.getClass(), "in", term311165);
        setField(term311160, term311160.getClass(), "cb", term311170);
        setIntField(term311160, term311160.getClass(), "nChars", 0);
        setIntField(term311160, term311160.getClass(), "nextChar", 0);
        setIntField(term311160, term311160.getClass(), "markedChar", -1);
        setIntField(term311160, term311160.getClass(), "readAheadLimit", 0);
        setBooleanField(term311160, term311160.getClass(), "skipLF", false);
        setBooleanField(term311160, term311160.getClass(), "markedSkipLF", false);
        setField(term311160, term311160.getClass(), "lock", term311165);
        setField(term311160, term311160.getClass(), "skipBuffer", null);
        setField(term311153, term311153.getClass(), "reader", term311160);
        setField(term311153, term311153.getClass(), "firstEol", null);
        setField(term311146, term311146.getClass(), "lexer", term311153);
        setField(term311146, term311146.getClass(), "recordList", term311689);
        setLongField(term311146, term311146.getClass(), "recordNumber", 0L);
        setLongField(term311146, term311146.getClass(), "characterOffset", 0L);
        setField(term311695, term311695.getClass(), "type", enum102);
        setField(term311703, term311703.getClass(), "value", term311704);
        setByteField(term311703, term311703.getClass(), "coder", (byte) 0);
        setIntField(term311703, term311703.getClass(), "count", 0);
        setField(term311695, term311695.getClass(), "content", term311703);
        setBooleanField(term311695, term311695.getClass(), "isReady", false);
        setField(term311146, term311146.getClass(), "reusableToken", term311695);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("org.apache.commons.csv.CSVFormat");
        Object[] args = new Object[2];
        args[0] = "";
        args[1] = term306924;
        Object retValue = callMethod(klass, "parse", argTypes, null, args);
        assertTrue(recursiveEquals(term306924, term311770));
        assertTrue(recursiveEquals(retValue, term311146));
    }

};


