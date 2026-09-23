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

public class CSVParser_parse_156507206467 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term231889;
     Object term236269;
     Object term235645;

    public CSVParser_parse_156507206467() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term231941 = new Character((char) 0);
        Character term231993 = new Character((char) 0);
        Character term232045 = new Character((char) 0);
        term231889 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term222731 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term231889, term231889.getClass(), "delimiter", (char) 0);
        setField(term231889, term231889.getClass(), "escapeCharacter", term231941);
        setField(term231889, term231889.getClass(), "quoteCharacter", term231993);
        setField(term231889, term231889.getClass(), "commentMarker", term232045);
        setBooleanField(term231889, term231889.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term231889, term231889.getClass(), "ignoreEmptyLines", true);
        setField(term231889, term231889.getClass(), "header", term222731);
        setBooleanField(term231889, term231889.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term231889, term231889.getClass(), "skipHeaderRecord", true);
        setBooleanField(term231889, term231889.getClass(), "trim", true);
        setField(term231889, term231889.getClass(), "nullString", "");
        setIntField(null, Class.forName("java.io.BufferedReader"), "defaultCharBufferSize", 512);
        Character term236270 = new Character((char) 0);
        Character term236271 = new Character((char) 0);
        Character term236275 = new Character((char) 0);
        term236269 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term236272 = (Object[]) newArray("java.lang.String", 0);
        setBooleanField(term236269, term236269.getClass(), "allowMissingColumnNames", false);
        setField(term236269, term236269.getClass(), "commentMarker", term236270);
        setCharField(term236269, term236269.getClass(), "delimiter", (char) 0);
        setField(term236269, term236269.getClass(), "escapeCharacter", term236271);
        setField(term236269, term236269.getClass(), "header", term236272);
        setField(term236269, term236269.getClass(), "headerComments", null);
        setBooleanField(term236269, term236269.getClass(), "ignoreEmptyLines", true);
        setBooleanField(term236269, term236269.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term236269, term236269.getClass(), "ignoreSurroundingSpaces", true);
        setField(term236269, term236269.getClass(), "nullString", "");
        setField(term236269, term236269.getClass(), "quoteCharacter", term236275);
        setField(term236269, term236269.getClass(), "quoteMode", null);
        setField(term236269, term236269.getClass(), "recordSeparator", null);
        setBooleanField(term236269, term236269.getClass(), "skipHeaderRecord", true);
        setBooleanField(term236269, term236269.getClass(), "trailingDelimiter", false);
        setBooleanField(term236269, term236269.getClass(), "trim", true);
        setBooleanField(term236269, term236269.getClass(), "autoFlush", false);
        Character term232112 = new Character((char) 0);
        Character term232115 = new Character((char) 0);
        Character term232123 = new Character((char) 0);
        LinkedHashMap term235646 = new LinkedHashMap();
        ArrayList term236188 = new ArrayList();
        Class<? extends Object> term236789 = Class.forName((String) "org.apache.commons.csv.Token$Type");
        Field term236788 = ((Class) term236789).getDeclaredField((String) "EOF");
        ((Field) term236788).setAccessible(true);
        Object enum90 = ((Field) term236788).get((Object) null);
        term235645 = newInstance(Class.forName("org.apache.commons.csv.CSVParser"));
        Object term232110 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term232117 = (Object[]) newArray("java.lang.String", 0);
        Object term235652 = newInstance(Class.forName("org.apache.commons.csv.Lexer"));
        Object term235659 = newInstance(Class.forName("org.apache.commons.csv.ExtendedBufferedReader"));
        Object term235664 = newInstance(Class.forName("java.io.StringReader"));
        char[] term235669 = (char[]) newCharArray(512);
        Object term236194 = newInstance(Class.forName("org.apache.commons.csv.Token"));
        Object term236202 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term236203 = (byte[]) newByteArray(50);
        setBooleanField(term232110, term232110.getClass(), "allowMissingColumnNames", false);
        setField(term232110, term232110.getClass(), "commentMarker", term232112);
        setCharField(term232110, term232110.getClass(), "delimiter", (char) 0);
        setField(term232110, term232110.getClass(), "escapeCharacter", term232115);
        setField(term232110, term232110.getClass(), "header", term232117);
        setField(term232110, term232110.getClass(), "headerComments", null);
        setBooleanField(term232110, term232110.getClass(), "ignoreEmptyLines", true);
        setBooleanField(term232110, term232110.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term232110, term232110.getClass(), "ignoreSurroundingSpaces", true);
        setField(term232110, term232110.getClass(), "nullString", "");
        setField(term232110, term232110.getClass(), "quoteCharacter", term232123);
        setField(term232110, term232110.getClass(), "quoteMode", null);
        setField(term232110, term232110.getClass(), "recordSeparator", null);
        setBooleanField(term232110, term232110.getClass(), "skipHeaderRecord", true);
        setBooleanField(term232110, term232110.getClass(), "trailingDelimiter", false);
        setBooleanField(term232110, term232110.getClass(), "trim", true);
        setBooleanField(term232110, term232110.getClass(), "autoFlush", false);
        setField(term235645, term235645.getClass(), "format", term232110);
        setField(term235645, term235645.getClass(), "headerMap", term235646);
        setCharField(term235652, term235652.getClass(), "delimiter", (char) 0);
        setCharField(term235652, term235652.getClass(), "escape", (char) 0);
        setCharField(term235652, term235652.getClass(), "quoteChar", (char) 0);
        setCharField(term235652, term235652.getClass(), "commentStart", (char) 0);
        setBooleanField(term235652, term235652.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term235652, term235652.getClass(), "ignoreEmptyLines", true);
        setIntField(term235659, term235659.getClass(), "lastChar", -1);
        setLongField(term235659, term235659.getClass(), "eolCounter", 0L);
        setLongField(term235659, term235659.getClass(), "position", 1L);
        setBooleanField(term235659, term235659.getClass(), "closed", false);
        setField(term235664, term235664.getClass(), "str", "");
        setIntField(term235664, term235664.getClass(), "length", 0);
        setIntField(term235664, term235664.getClass(), "next", 0);
        setIntField(term235664, term235664.getClass(), "mark", 0);
        setField(term235664, term235664.getClass(), "lock", term235664);
        setField(term235664, term235664.getClass(), "skipBuffer", null);
        setField(term235659, term235659.getClass(), "in", term235664);
        setField(term235659, term235659.getClass(), "cb", term235669);
        setIntField(term235659, term235659.getClass(), "nChars", 0);
        setIntField(term235659, term235659.getClass(), "nextChar", 0);
        setIntField(term235659, term235659.getClass(), "markedChar", -1);
        setIntField(term235659, term235659.getClass(), "readAheadLimit", 0);
        setBooleanField(term235659, term235659.getClass(), "skipLF", false);
        setBooleanField(term235659, term235659.getClass(), "markedSkipLF", false);
        setField(term235659, term235659.getClass(), "lock", term235664);
        setField(term235659, term235659.getClass(), "skipBuffer", null);
        setField(term235652, term235652.getClass(), "reader", term235659);
        setField(term235652, term235652.getClass(), "firstEol", null);
        setField(term235645, term235645.getClass(), "lexer", term235652);
        setField(term235645, term235645.getClass(), "recordList", term236188);
        setLongField(term235645, term235645.getClass(), "recordNumber", 0L);
        setLongField(term235645, term235645.getClass(), "characterOffset", 0L);
        setField(term236194, term236194.getClass(), "type", enum90);
        setField(term236202, term236202.getClass(), "value", term236203);
        setByteField(term236202, term236202.getClass(), "coder", (byte) 0);
        setIntField(term236202, term236202.getClass(), "count", 0);
        setField(term236194, term236194.getClass(), "content", term236202);
        setBooleanField(term236194, term236194.getClass(), "isReady", false);
        setField(term235645, term235645.getClass(), "reusableToken", term236194);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("org.apache.commons.csv.CSVFormat");
        Object[] args = new Object[2];
        args[0] = "";
        args[1] = term231889;
        Object retValue = callMethod(klass, "parse", argTypes, null, args);
        assertTrue(recursiveEquals(term231889, term236269));
        assertTrue(recursiveEquals(retValue, term235645));
    }

};


