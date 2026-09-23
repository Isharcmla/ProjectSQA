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

public class CSVParser_parse_1565072064113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term306027;
     Object term307721;
     Object term307593;

    public CSVParser_parse_1565072064113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term306079 = new Character((char) 16);
        Character term306131 = new Character((char) 0);
        Character term306183 = new Character((char) 0);
        term306027 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term303420 = (Object[]) newArray("java.lang.String", 1);
        setCharField(term306027, term306027.getClass(), "delimiter", (char) 64);
        setField(term306027, term306027.getClass(), "escape", term306079);
        setField(term306027, term306027.getClass(), "quoteChar", term306131);
        setField(term306027, term306027.getClass(), "commentStart", term306183);
        setBooleanField(term306027, term306027.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term306027, term306027.getClass(), "ignoreEmptyLines", true);
        setElement(term303420, 0, "");
        setField(term306027, term306027.getClass(), "header", term303420);
        setBooleanField(term306027, term306027.getClass(), "skipHeaderRecord", true);
        setIntField(null, Class.forName("java.io.BufferedReader"), "defaultCharBufferSize", 4);
        Character term307722 = new Character((char) 0);
        Character term307723 = new Character((char) 0);
        Character term307724 = new Character((char) 16);
        term307721 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term307725 = (Object[]) newArray("java.lang.String", 1);
        setCharField(term307721, term307721.getClass(), "delimiter", (char) 64);
        setField(term307721, term307721.getClass(), "quoteChar", term307722);
        setField(term307721, term307721.getClass(), "quotePolicy", null);
        setField(term307721, term307721.getClass(), "commentStart", term307723);
        setField(term307721, term307721.getClass(), "escape", term307724);
        setBooleanField(term307721, term307721.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term307721, term307721.getClass(), "ignoreEmptyHeaders", false);
        setBooleanField(term307721, term307721.getClass(), "ignoreEmptyLines", true);
        setField(term307721, term307721.getClass(), "recordSeparator", null);
        setField(term307721, term307721.getClass(), "nullString", null);
        setElement(term307725, 0, "");
        setField(term307721, term307721.getClass(), "header", term307725);
        setBooleanField(term307721, term307721.getClass(), "skipHeaderRecord", true);
        Character term307178 = new Character((char) 0);
        Character term307180 = new Character((char) 0);
        Character term307182 = new Character((char) 16);
        LinkedHashMap term307594 = new LinkedHashMap();
        ArrayList term307634 = new ArrayList();
        Class<? extends Object> term307733 = Class.forName((String) "org.apache.commons.csv.Token$Type");
        Field term307732 = ((Class) term307733).getDeclaredField((String) "EOF");
        ((Field) term307732).setAccessible(true);
        Object enum103 = ((Field) term307732).get((Object) null);
        term307593 = newInstance(Class.forName("org.apache.commons.csv.CSVParser"));
        Object term307176 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term307187 = (Object[]) newArray("java.lang.String", 1);
        Object term307607 = newInstance(Class.forName("org.apache.commons.csv.Lexer"));
        Object term307614 = newInstance(Class.forName("org.apache.commons.csv.ExtendedBufferedReader"));
        Object term307618 = newInstance(Class.forName("java.io.StringReader"));
        char[] term307623 = (char[]) newCharArray(4);
        Object term307639 = newInstance(Class.forName("org.apache.commons.csv.Token"));
        Object term307647 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term307648 = (byte[]) newByteArray(50);
        setCharField(term307176, term307176.getClass(), "delimiter", (char) 64);
        setField(term307176, term307176.getClass(), "quoteChar", term307178);
        setField(term307176, term307176.getClass(), "quotePolicy", null);
        setField(term307176, term307176.getClass(), "commentStart", term307180);
        setField(term307176, term307176.getClass(), "escape", term307182);
        setBooleanField(term307176, term307176.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term307176, term307176.getClass(), "ignoreEmptyHeaders", false);
        setBooleanField(term307176, term307176.getClass(), "ignoreEmptyLines", true);
        setField(term307176, term307176.getClass(), "recordSeparator", null);
        setField(term307176, term307176.getClass(), "nullString", null);
        setElement(term307187, 0, "");
        setField(term307176, term307176.getClass(), "header", term307187);
        setBooleanField(term307176, term307176.getClass(), "skipHeaderRecord", true);
        setField(term307593, term307593.getClass(), "format", term307176);
        setField(term307593, term307593.getClass(), "headerMap", term307594);
        setCharField(term307607, term307607.getClass(), "delimiter", (char) 64);
        setCharField(term307607, term307607.getClass(), "escape", (char) 16);
        setCharField(term307607, term307607.getClass(), "quoteChar", (char) 0);
        setCharField(term307607, term307607.getClass(), "commentStart", (char) 0);
        setBooleanField(term307607, term307607.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term307607, term307607.getClass(), "ignoreEmptyLines", true);
        setIntField(term307614, term307614.getClass(), "lastChar", -1);
        setLongField(term307614, term307614.getClass(), "eolCounter", 0L);
        setBooleanField(term307614, term307614.getClass(), "closed", false);
        setField(term307618, term307618.getClass(), "str", "");
        setIntField(term307618, term307618.getClass(), "length", 0);
        setIntField(term307618, term307618.getClass(), "next", 0);
        setIntField(term307618, term307618.getClass(), "mark", 0);
        setField(term307618, term307618.getClass(), "lock", term307618);
        setField(term307618, term307618.getClass(), "skipBuffer", null);
        setField(term307614, term307614.getClass(), "in", term307618);
        setField(term307614, term307614.getClass(), "cb", term307623);
        setIntField(term307614, term307614.getClass(), "nChars", 0);
        setIntField(term307614, term307614.getClass(), "nextChar", 0);
        setIntField(term307614, term307614.getClass(), "markedChar", -1);
        setIntField(term307614, term307614.getClass(), "readAheadLimit", 0);
        setBooleanField(term307614, term307614.getClass(), "skipLF", false);
        setBooleanField(term307614, term307614.getClass(), "markedSkipLF", false);
        setField(term307614, term307614.getClass(), "lock", term307618);
        setField(term307614, term307614.getClass(), "skipBuffer", null);
        setField(term307607, term307607.getClass(), "reader", term307614);
        setField(term307593, term307593.getClass(), "lexer", term307607);
        setField(term307593, term307593.getClass(), "record", term307634);
        setLongField(term307593, term307593.getClass(), "recordNumber", 0L);
        setField(term307639, term307639.getClass(), "type", enum103);
        setField(term307647, term307647.getClass(), "value", term307648);
        setByteField(term307647, term307647.getClass(), "coder", (byte) 0);
        setIntField(term307647, term307647.getClass(), "count", 0);
        setField(term307639, term307639.getClass(), "content", term307647);
        setBooleanField(term307639, term307639.getClass(), "isReady", false);
        setField(term307593, term307593.getClass(), "reusableToken", term307639);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("org.apache.commons.csv.CSVFormat");
        Object[] args = new Object[2];
        args[0] = "";
        args[1] = term306027;
        Object retValue = callMethod(klass, "parse", argTypes, null, args);
        assertTrue(recursiveEquals(term306027, term307721));
        assertTrue(recursiveEquals(retValue, term307593));
    }

};


