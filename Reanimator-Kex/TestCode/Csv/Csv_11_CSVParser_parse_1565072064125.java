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

public class CSVParser_parse_1565072064125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term319095;
     Object term319760;
     Object term319650;

    public CSVParser_parse_1565072064125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term319147 = new Character((char) 0);
        Character term319199 = new Character((char) 0);
        Character term319251 = new Character((char) 1);
        term319095 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term317739 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term319095, term319095.getClass(), "delimiter", (char) 512);
        setField(term319095, term319095.getClass(), "escape", term319147);
        setField(term319095, term319095.getClass(), "quoteChar", term319199);
        setField(term319095, term319095.getClass(), "commentStart", term319251);
        setBooleanField(term319095, term319095.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term319095, term319095.getClass(), "ignoreEmptyLines", true);
        setField(term319095, term319095.getClass(), "header", term317739);
        setBooleanField(term319095, term319095.getClass(), "skipHeaderRecord", true);
        setIntField(null, Class.forName("java.io.BufferedReader"), "defaultCharBufferSize", 2);
        Character term319761 = new Character((char) 0);
        Character term319762 = new Character((char) 1);
        Character term319763 = new Character((char) 0);
        term319760 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term319764 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term319760, term319760.getClass(), "delimiter", (char) 512);
        setField(term319760, term319760.getClass(), "quoteChar", term319761);
        setField(term319760, term319760.getClass(), "quotePolicy", null);
        setField(term319760, term319760.getClass(), "commentStart", term319762);
        setField(term319760, term319760.getClass(), "escape", term319763);
        setBooleanField(term319760, term319760.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term319760, term319760.getClass(), "ignoreEmptyHeaders", false);
        setBooleanField(term319760, term319760.getClass(), "ignoreEmptyLines", true);
        setField(term319760, term319760.getClass(), "recordSeparator", null);
        setField(term319760, term319760.getClass(), "nullString", null);
        setField(term319760, term319760.getClass(), "header", term319764);
        setBooleanField(term319760, term319760.getClass(), "skipHeaderRecord", true);
        Character term319266 = new Character((char) 0);
        Character term319268 = new Character((char) 1);
        Character term319270 = new Character((char) 0);
        LinkedHashMap term319651 = new LinkedHashMap();
        ArrayList term319682 = new ArrayList();
        Class<? extends Object> term319768 = Class.forName((String) "org.apache.commons.csv.Token$Type");
        Field term319767 = ((Class) term319768).getDeclaredField((String) "EOF");
        ((Field) term319767).setAccessible(true);
        Object enum106 = ((Field) term319767).get((Object) null);
        term319650 = newInstance(Class.forName("org.apache.commons.csv.CSVParser"));
        Object term319264 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term319275 = (Object[]) newArray("java.lang.String", 0);
        Object term319657 = newInstance(Class.forName("org.apache.commons.csv.Lexer"));
        Object term319664 = newInstance(Class.forName("org.apache.commons.csv.ExtendedBufferedReader"));
        Object term319668 = newInstance(Class.forName("java.io.StringReader"));
        char[] term319673 = (char[]) newCharArray(2);
        Object term319687 = newInstance(Class.forName("org.apache.commons.csv.Token"));
        Object term319695 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term319696 = (byte[]) newByteArray(50);
        setCharField(term319264, term319264.getClass(), "delimiter", (char) 512);
        setField(term319264, term319264.getClass(), "quoteChar", term319266);
        setField(term319264, term319264.getClass(), "quotePolicy", null);
        setField(term319264, term319264.getClass(), "commentStart", term319268);
        setField(term319264, term319264.getClass(), "escape", term319270);
        setBooleanField(term319264, term319264.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term319264, term319264.getClass(), "ignoreEmptyHeaders", false);
        setBooleanField(term319264, term319264.getClass(), "ignoreEmptyLines", true);
        setField(term319264, term319264.getClass(), "recordSeparator", null);
        setField(term319264, term319264.getClass(), "nullString", null);
        setField(term319264, term319264.getClass(), "header", term319275);
        setBooleanField(term319264, term319264.getClass(), "skipHeaderRecord", true);
        setField(term319650, term319650.getClass(), "format", term319264);
        setField(term319650, term319650.getClass(), "headerMap", term319651);
        setCharField(term319657, term319657.getClass(), "delimiter", (char) 512);
        setCharField(term319657, term319657.getClass(), "escape", (char) 0);
        setCharField(term319657, term319657.getClass(), "quoteChar", (char) 0);
        setCharField(term319657, term319657.getClass(), "commentStart", (char) 1);
        setBooleanField(term319657, term319657.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term319657, term319657.getClass(), "ignoreEmptyLines", true);
        setIntField(term319664, term319664.getClass(), "lastChar", -1);
        setLongField(term319664, term319664.getClass(), "eolCounter", 0L);
        setBooleanField(term319664, term319664.getClass(), "closed", false);
        setField(term319668, term319668.getClass(), "str", "");
        setIntField(term319668, term319668.getClass(), "length", 0);
        setIntField(term319668, term319668.getClass(), "next", 0);
        setIntField(term319668, term319668.getClass(), "mark", 0);
        setField(term319668, term319668.getClass(), "lock", term319668);
        setField(term319668, term319668.getClass(), "skipBuffer", null);
        setField(term319664, term319664.getClass(), "in", term319668);
        setField(term319664, term319664.getClass(), "cb", term319673);
        setIntField(term319664, term319664.getClass(), "nChars", 0);
        setIntField(term319664, term319664.getClass(), "nextChar", 0);
        setIntField(term319664, term319664.getClass(), "markedChar", -1);
        setIntField(term319664, term319664.getClass(), "readAheadLimit", 0);
        setBooleanField(term319664, term319664.getClass(), "skipLF", false);
        setBooleanField(term319664, term319664.getClass(), "markedSkipLF", false);
        setField(term319664, term319664.getClass(), "lock", term319668);
        setField(term319664, term319664.getClass(), "skipBuffer", null);
        setField(term319657, term319657.getClass(), "reader", term319664);
        setField(term319650, term319650.getClass(), "lexer", term319657);
        setField(term319650, term319650.getClass(), "record", term319682);
        setLongField(term319650, term319650.getClass(), "recordNumber", 0L);
        setField(term319687, term319687.getClass(), "type", enum106);
        setField(term319695, term319695.getClass(), "value", term319696);
        setByteField(term319695, term319695.getClass(), "coder", (byte) 0);
        setIntField(term319695, term319695.getClass(), "count", 0);
        setField(term319687, term319687.getClass(), "content", term319695);
        setBooleanField(term319687, term319687.getClass(), "isReady", false);
        setField(term319650, term319650.getClass(), "reusableToken", term319687);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("org.apache.commons.csv.CSVFormat");
        Object[] args = new Object[2];
        args[0] = "";
        args[1] = term319095;
        Object retValue = callMethod(klass, "parse", argTypes, null, args);
        assertTrue(recursiveEquals(term319095, term319760));
        assertTrue(recursiveEquals(retValue, term319650));
    }

};


