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

public class CSVParser_parse_1565072064112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term301527;
     Object term306880;
     Object term306740;

    public CSVParser_parse_1565072064112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term301579 = new Character((char) 0);
        Character term301631 = new Character((char) 0);
        Character term301683 = new Character((char) 0);
        term301527 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term299968 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term301527, term301527.getClass(), "delimiter", (char) 0);
        setField(term301527, term301527.getClass(), "escape", term301579);
        setField(term301527, term301527.getClass(), "quoteChar", term301631);
        setField(term301527, term301527.getClass(), "commentStart", term301683);
        setBooleanField(term301527, term301527.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term301527, term301527.getClass(), "ignoreEmptyLines", true);
        setField(term301527, term301527.getClass(), "header", term299968);
        setBooleanField(term301527, term301527.getClass(), "skipHeaderRecord", true);
        setIntField(null, Class.forName("java.io.BufferedReader"), "defaultCharBufferSize", 32);
        Character term306881 = new Character((char) 0);
        Character term306882 = new Character((char) 0);
        Character term306883 = new Character((char) 0);
        term306880 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term306884 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term306880, term306880.getClass(), "delimiter", (char) 0);
        setField(term306880, term306880.getClass(), "quoteChar", term306881);
        setField(term306880, term306880.getClass(), "quotePolicy", null);
        setField(term306880, term306880.getClass(), "commentStart", term306882);
        setField(term306880, term306880.getClass(), "escape", term306883);
        setBooleanField(term306880, term306880.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term306880, term306880.getClass(), "ignoreEmptyHeaders", false);
        setBooleanField(term306880, term306880.getClass(), "ignoreEmptyLines", true);
        setField(term306880, term306880.getClass(), "recordSeparator", null);
        setField(term306880, term306880.getClass(), "nullString", null);
        setField(term306880, term306880.getClass(), "header", term306884);
        setBooleanField(term306880, term306880.getClass(), "skipHeaderRecord", true);
        Character term306236 = new Character((char) 0);
        Character term306238 = new Character((char) 0);
        Character term306240 = new Character((char) 0);
        LinkedHashMap term306741 = new LinkedHashMap();
        ArrayList term306802 = new ArrayList();
        Class<? extends Object> term306918 = Class.forName((String) "org.apache.commons.csv.Token$Type");
        Field term306917 = ((Class) term306918).getDeclaredField((String) "EOF");
        ((Field) term306917).setAccessible(true);
        Object enum102 = ((Field) term306917).get((Object) null);
        term306740 = newInstance(Class.forName("org.apache.commons.csv.CSVParser"));
        Object term306234 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term306245 = (Object[]) newArray("java.lang.String", 0);
        Object term306747 = newInstance(Class.forName("org.apache.commons.csv.Lexer"));
        Object term306754 = newInstance(Class.forName("org.apache.commons.csv.ExtendedBufferedReader"));
        Object term306758 = newInstance(Class.forName("java.io.StringReader"));
        char[] term306763 = (char[]) newCharArray(32);
        Object term306807 = newInstance(Class.forName("org.apache.commons.csv.Token"));
        Object term306815 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term306816 = (byte[]) newByteArray(50);
        setCharField(term306234, term306234.getClass(), "delimiter", (char) 0);
        setField(term306234, term306234.getClass(), "quoteChar", term306236);
        setField(term306234, term306234.getClass(), "quotePolicy", null);
        setField(term306234, term306234.getClass(), "commentStart", term306238);
        setField(term306234, term306234.getClass(), "escape", term306240);
        setBooleanField(term306234, term306234.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term306234, term306234.getClass(), "ignoreEmptyHeaders", false);
        setBooleanField(term306234, term306234.getClass(), "ignoreEmptyLines", true);
        setField(term306234, term306234.getClass(), "recordSeparator", null);
        setField(term306234, term306234.getClass(), "nullString", null);
        setField(term306234, term306234.getClass(), "header", term306245);
        setBooleanField(term306234, term306234.getClass(), "skipHeaderRecord", true);
        setField(term306740, term306740.getClass(), "format", term306234);
        setField(term306740, term306740.getClass(), "headerMap", term306741);
        setCharField(term306747, term306747.getClass(), "delimiter", (char) 0);
        setCharField(term306747, term306747.getClass(), "escape", (char) 0);
        setCharField(term306747, term306747.getClass(), "quoteChar", (char) 0);
        setCharField(term306747, term306747.getClass(), "commentStart", (char) 0);
        setBooleanField(term306747, term306747.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term306747, term306747.getClass(), "ignoreEmptyLines", true);
        setIntField(term306754, term306754.getClass(), "lastChar", -1);
        setLongField(term306754, term306754.getClass(), "eolCounter", 0L);
        setBooleanField(term306754, term306754.getClass(), "closed", false);
        setField(term306758, term306758.getClass(), "str", "");
        setIntField(term306758, term306758.getClass(), "length", 0);
        setIntField(term306758, term306758.getClass(), "next", 0);
        setIntField(term306758, term306758.getClass(), "mark", 0);
        setField(term306758, term306758.getClass(), "lock", term306758);
        setField(term306758, term306758.getClass(), "skipBuffer", null);
        setField(term306754, term306754.getClass(), "in", term306758);
        setField(term306754, term306754.getClass(), "cb", term306763);
        setIntField(term306754, term306754.getClass(), "nChars", 0);
        setIntField(term306754, term306754.getClass(), "nextChar", 0);
        setIntField(term306754, term306754.getClass(), "markedChar", -1);
        setIntField(term306754, term306754.getClass(), "readAheadLimit", 0);
        setBooleanField(term306754, term306754.getClass(), "skipLF", false);
        setBooleanField(term306754, term306754.getClass(), "markedSkipLF", false);
        setField(term306754, term306754.getClass(), "lock", term306758);
        setField(term306754, term306754.getClass(), "skipBuffer", null);
        setField(term306747, term306747.getClass(), "reader", term306754);
        setField(term306740, term306740.getClass(), "lexer", term306747);
        setField(term306740, term306740.getClass(), "record", term306802);
        setLongField(term306740, term306740.getClass(), "recordNumber", 0L);
        setField(term306807, term306807.getClass(), "type", enum102);
        setField(term306815, term306815.getClass(), "value", term306816);
        setByteField(term306815, term306815.getClass(), "coder", (byte) 0);
        setIntField(term306815, term306815.getClass(), "count", 0);
        setField(term306807, term306807.getClass(), "content", term306815);
        setBooleanField(term306807, term306807.getClass(), "isReady", false);
        setField(term306740, term306740.getClass(), "reusableToken", term306807);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("org.apache.commons.csv.CSVFormat");
        Object[] args = new Object[2];
        args[0] = "";
        args[1] = term301527;
        Object retValue = callMethod(klass, "parse", argTypes, null, args);
        assertTrue(recursiveEquals(term301527, term306880));
        assertTrue(recursiveEquals(retValue, term306740));
    }

};


