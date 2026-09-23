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

public class CSVParser_parse_1565072064115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term334627;
     Object term336261;
     Object term336021;

    public CSVParser_parse_1565072064115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term334679 = new Character((char) 0);
        Character term334731 = new Character((char) 0);
        Character term334783 = new Character((char) 0);
        term334627 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term332487 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term334627, term334627.getClass(), "delimiter", (char) 0);
        setField(term334627, term334627.getClass(), "escapeCharacter", term334679);
        setField(term334627, term334627.getClass(), "quoteCharacter", term334731);
        setField(term334627, term334627.getClass(), "commentMarker", term334783);
        setBooleanField(term334627, term334627.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term334627, term334627.getClass(), "ignoreEmptyLines", true);
        setField(term334627, term334627.getClass(), "header", term332487);
        setBooleanField(term334627, term334627.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term334627, term334627.getClass(), "skipHeaderRecord", true);
        setIntField(null, Class.forName("java.io.BufferedReader"), "defaultCharBufferSize", 128);
        Character term336262 = new Character((char) 0);
        Character term336263 = new Character((char) 0);
        Character term336265 = new Character((char) 0);
        term336261 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term336264 = (Object[]) newArray("java.lang.String", 0);
        setBooleanField(term336261, term336261.getClass(), "allowMissingColumnNames", false);
        setField(term336261, term336261.getClass(), "commentMarker", term336262);
        setCharField(term336261, term336261.getClass(), "delimiter", (char) 0);
        setField(term336261, term336261.getClass(), "escapeCharacter", term336263);
        setField(term336261, term336261.getClass(), "header", term336264);
        setField(term336261, term336261.getClass(), "headerComments", null);
        setBooleanField(term336261, term336261.getClass(), "ignoreEmptyLines", true);
        setBooleanField(term336261, term336261.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term336261, term336261.getClass(), "ignoreSurroundingSpaces", true);
        setField(term336261, term336261.getClass(), "nullString", null);
        setField(term336261, term336261.getClass(), "quoteCharacter", term336265);
        setField(term336261, term336261.getClass(), "quoteMode", null);
        setField(term336261, term336261.getClass(), "recordSeparator", null);
        setBooleanField(term336261, term336261.getClass(), "skipHeaderRecord", true);
        setBooleanField(term336261, term336261.getClass(), "trailingDelimiter", false);
        setBooleanField(term336261, term336261.getClass(), "trim", false);
        setBooleanField(term336261, term336261.getClass(), "autoFlush", false);
        Character term334798 = new Character((char) 0);
        Character term334801 = new Character((char) 0);
        Character term334807 = new Character((char) 0);
        LinkedHashMap term336022 = new LinkedHashMap();
        ArrayList term336180 = new ArrayList();
        Class<? extends Object> term336395 = Class.forName((String) "org.apache.commons.csv.Token$Type");
        Field term336394 = ((Class) term336395).getDeclaredField((String) "EOF");
        ((Field) term336394).setAccessible(true);
        Object enum106 = ((Field) term336394).get((Object) null);
        term336021 = newInstance(Class.forName("org.apache.commons.csv.CSVParser"));
        Object term334796 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term334803 = (Object[]) newArray("java.lang.String", 0);
        Object term336028 = newInstance(Class.forName("org.apache.commons.csv.Lexer"));
        Object term336035 = newInstance(Class.forName("org.apache.commons.csv.ExtendedBufferedReader"));
        Object term336040 = newInstance(Class.forName("java.io.StringReader"));
        char[] term336045 = (char[]) newCharArray(128);
        Object term336186 = newInstance(Class.forName("org.apache.commons.csv.Token"));
        Object term336194 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term336195 = (byte[]) newByteArray(50);
        setBooleanField(term334796, term334796.getClass(), "allowMissingColumnNames", false);
        setField(term334796, term334796.getClass(), "commentMarker", term334798);
        setCharField(term334796, term334796.getClass(), "delimiter", (char) 0);
        setField(term334796, term334796.getClass(), "escapeCharacter", term334801);
        setField(term334796, term334796.getClass(), "header", term334803);
        setField(term334796, term334796.getClass(), "headerComments", null);
        setBooleanField(term334796, term334796.getClass(), "ignoreEmptyLines", true);
        setBooleanField(term334796, term334796.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term334796, term334796.getClass(), "ignoreSurroundingSpaces", true);
        setField(term334796, term334796.getClass(), "nullString", null);
        setField(term334796, term334796.getClass(), "quoteCharacter", term334807);
        setField(term334796, term334796.getClass(), "quoteMode", null);
        setField(term334796, term334796.getClass(), "recordSeparator", null);
        setBooleanField(term334796, term334796.getClass(), "skipHeaderRecord", true);
        setBooleanField(term334796, term334796.getClass(), "trailingDelimiter", false);
        setBooleanField(term334796, term334796.getClass(), "trim", false);
        setBooleanField(term334796, term334796.getClass(), "autoFlush", false);
        setField(term336021, term336021.getClass(), "format", term334796);
        setField(term336021, term336021.getClass(), "headerMap", term336022);
        setCharField(term336028, term336028.getClass(), "delimiter", (char) 0);
        setCharField(term336028, term336028.getClass(), "escape", (char) 0);
        setCharField(term336028, term336028.getClass(), "quoteChar", (char) 0);
        setCharField(term336028, term336028.getClass(), "commentStart", (char) 0);
        setBooleanField(term336028, term336028.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term336028, term336028.getClass(), "ignoreEmptyLines", true);
        setIntField(term336035, term336035.getClass(), "lastChar", -1);
        setLongField(term336035, term336035.getClass(), "eolCounter", 0L);
        setLongField(term336035, term336035.getClass(), "position", 1L);
        setBooleanField(term336035, term336035.getClass(), "closed", false);
        setField(term336040, term336040.getClass(), "str", "");
        setIntField(term336040, term336040.getClass(), "length", 0);
        setIntField(term336040, term336040.getClass(), "next", 0);
        setIntField(term336040, term336040.getClass(), "mark", 0);
        setField(term336040, term336040.getClass(), "lock", term336040);
        setField(term336040, term336040.getClass(), "skipBuffer", null);
        setField(term336035, term336035.getClass(), "in", term336040);
        setField(term336035, term336035.getClass(), "cb", term336045);
        setIntField(term336035, term336035.getClass(), "nChars", 0);
        setIntField(term336035, term336035.getClass(), "nextChar", 0);
        setIntField(term336035, term336035.getClass(), "markedChar", -1);
        setIntField(term336035, term336035.getClass(), "readAheadLimit", 0);
        setBooleanField(term336035, term336035.getClass(), "skipLF", false);
        setBooleanField(term336035, term336035.getClass(), "markedSkipLF", false);
        setField(term336035, term336035.getClass(), "lock", term336040);
        setField(term336035, term336035.getClass(), "skipBuffer", null);
        setField(term336028, term336028.getClass(), "reader", term336035);
        setField(term336028, term336028.getClass(), "firstEol", null);
        setField(term336021, term336021.getClass(), "lexer", term336028);
        setField(term336021, term336021.getClass(), "recordList", term336180);
        setLongField(term336021, term336021.getClass(), "recordNumber", 0L);
        setLongField(term336021, term336021.getClass(), "characterOffset", 0L);
        setField(term336186, term336186.getClass(), "type", enum106);
        setField(term336194, term336194.getClass(), "value", term336195);
        setByteField(term336194, term336194.getClass(), "coder", (byte) 0);
        setIntField(term336194, term336194.getClass(), "count", 0);
        setField(term336186, term336186.getClass(), "content", term336194);
        setBooleanField(term336186, term336186.getClass(), "isReady", false);
        setField(term336021, term336021.getClass(), "reusableToken", term336186);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("org.apache.commons.csv.CSVFormat");
        Object[] args = new Object[2];
        args[0] = "";
        args[1] = term334627;
        Object retValue = callMethod(klass, "parse", argTypes, null, args);
        assertTrue(recursiveEquals(term334627, term336261));
        assertTrue(recursiveEquals(retValue, term336021));
    }

};


