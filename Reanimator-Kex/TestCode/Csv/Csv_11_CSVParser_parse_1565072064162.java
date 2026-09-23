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

public class CSVParser_parse_1565072064162 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term374491;
     Object term644641;
     Object term644484;

    public CSVParser_parse_1565072064162() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term374543 = new Character((char) 0);
        Character term374595 = new Character((char) 0);
        term374491 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term371966 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term374491, term374491.getClass(), "delimiter", (char) 0);
        setField(term374491, term374491.getClass(), "escape", term374543);
        setField(term374491, term374491.getClass(), "quoteChar", term374595);
        setField(term374491, term374491.getClass(), "commentStart", term374595);
        setBooleanField(term374491, term374491.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term374491, term374491.getClass(), "ignoreEmptyLines", true);
        setField(term374491, term374491.getClass(), "header", term371966);
        setBooleanField(term374491, term374491.getClass(), "skipHeaderRecord", true);
        setIntField(null, Class.forName("java.io.BufferedReader"), "defaultCharBufferSize", 4);
        Character term644642 = new Character((char) 0);
        Character term644643 = new Character((char) 0);
        Character term644644 = new Character((char) 0);
        term644641 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term644645 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term644641, term644641.getClass(), "delimiter", (char) 0);
        setField(term644641, term644641.getClass(), "quoteChar", term644642);
        setField(term644641, term644641.getClass(), "quotePolicy", null);
        setField(term644641, term644641.getClass(), "commentStart", term644643);
        setField(term644641, term644641.getClass(), "escape", term644644);
        setBooleanField(term644641, term644641.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term644641, term644641.getClass(), "ignoreEmptyHeaders", false);
        setBooleanField(term644641, term644641.getClass(), "ignoreEmptyLines", true);
        setField(term644641, term644641.getClass(), "recordSeparator", null);
        setField(term644641, term644641.getClass(), "nullString", null);
        setField(term644641, term644641.getClass(), "header", term644645);
        setBooleanField(term644641, term644641.getClass(), "skipHeaderRecord", true);
        Character term377699 = new Character((char) 0);
        Character term377701 = new Character((char) 0);
        Character term377703 = new Character((char) 0);
        LinkedHashMap term644485 = new LinkedHashMap();
        ArrayList term644525 = new ArrayList();
        ((ArrayList) term644525).add("");
        Class<? extends Object> term645147 = Class.forName((String) "org.apache.commons.csv.Token$Type");
        Field term645146 = ((Class) term645147).getDeclaredField((String) "EOF");
        ((Field) term645146).setAccessible(true);
        Object enum119 = ((Field) term645146).get((Object) null);
        term644484 = newInstance(Class.forName("org.apache.commons.csv.CSVParser"));
        Object term377697 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term377708 = (Object[]) newArray("java.lang.String", 0);
        Object term644498 = newInstance(Class.forName("org.apache.commons.csv.Lexer"));
        Object term644505 = newInstance(Class.forName("org.apache.commons.csv.ExtendedBufferedReader"));
        Object term644509 = newInstance(Class.forName("java.io.StringReader"));
        char[] term644514 = (char[]) newCharArray(4);
        Object term644532 = newInstance(Class.forName("org.apache.commons.csv.Token"));
        Object term644540 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term644541 = (byte[]) newByteArray(50);
        setCharField(term377697, term377697.getClass(), "delimiter", (char) 0);
        setField(term377697, term377697.getClass(), "quoteChar", term377699);
        setField(term377697, term377697.getClass(), "quotePolicy", null);
        setField(term377697, term377697.getClass(), "commentStart", term377701);
        setField(term377697, term377697.getClass(), "escape", term377703);
        setBooleanField(term377697, term377697.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term377697, term377697.getClass(), "ignoreEmptyHeaders", false);
        setBooleanField(term377697, term377697.getClass(), "ignoreEmptyLines", true);
        setField(term377697, term377697.getClass(), "recordSeparator", null);
        setField(term377697, term377697.getClass(), "nullString", null);
        setField(term377697, term377697.getClass(), "header", term377708);
        setBooleanField(term377697, term377697.getClass(), "skipHeaderRecord", true);
        setField(term644484, term644484.getClass(), "format", term377697);
        setField(term644484, term644484.getClass(), "headerMap", term644485);
        setCharField(term644498, term644498.getClass(), "delimiter", (char) 0);
        setCharField(term644498, term644498.getClass(), "escape", (char) 0);
        setCharField(term644498, term644498.getClass(), "quoteChar", (char) 0);
        setCharField(term644498, term644498.getClass(), "commentStart", (char) 0);
        setBooleanField(term644498, term644498.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term644498, term644498.getClass(), "ignoreEmptyLines", true);
        setIntField(term644505, term644505.getClass(), "lastChar", -1);
        setLongField(term644505, term644505.getClass(), "eolCounter", 0L);
        setBooleanField(term644505, term644505.getClass(), "closed", false);
        setField(term644509, term644509.getClass(), "str", "");
        setIntField(term644509, term644509.getClass(), "length", 496);
        setIntField(term644509, term644509.getClass(), "next", 496);
        setIntField(term644509, term644509.getClass(), "mark", 0);
        setField(term644509, term644509.getClass(), "lock", term644509);
        setField(term644509, term644509.getClass(), "skipBuffer", null);
        setField(term644505, term644505.getClass(), "in", term644509);
        setCharElement(term644514, 0, (char) 32);
        setCharElement(term644514, 1, (char) 32);
        setCharElement(term644514, 2, (char) 32);
        setCharElement(term644514, 3, (char) 32);
        setField(term644505, term644505.getClass(), "cb", term644514);
        setIntField(term644505, term644505.getClass(), "nChars", 4);
        setIntField(term644505, term644505.getClass(), "nextChar", 4);
        setIntField(term644505, term644505.getClass(), "markedChar", -1);
        setIntField(term644505, term644505.getClass(), "readAheadLimit", 0);
        setBooleanField(term644505, term644505.getClass(), "skipLF", false);
        setBooleanField(term644505, term644505.getClass(), "markedSkipLF", false);
        setField(term644505, term644505.getClass(), "lock", term644509);
        setField(term644505, term644505.getClass(), "skipBuffer", null);
        setField(term644498, term644498.getClass(), "reader", term644505);
        setField(term644484, term644484.getClass(), "lexer", term644498);
        setField(term644484, term644484.getClass(), "record", term644525);
        setLongField(term644484, term644484.getClass(), "recordNumber", 1L);
        setField(term644532, term644532.getClass(), "type", enum119);
        setField(term644540, term644540.getClass(), "value", term644541);
        setByteField(term644540, term644540.getClass(), "coder", (byte) 0);
        setIntField(term644540, term644540.getClass(), "count", 0);
        setField(term644532, term644532.getClass(), "content", term644540);
        setBooleanField(term644532, term644532.getClass(), "isReady", true);
        setField(term644484, term644484.getClass(), "reusableToken", term644532);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("org.apache.commons.csv.CSVFormat");
        Object[] args = new Object[2];
        args[0] = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ";
        args[1] = term374491;
        Object retValue = callMethod(klass, "parse", argTypes, null, args);
        assertTrue(recursiveEquals(term374491, term644641));
        assertTrue(recursiveEquals(retValue, term644484));
    }

};


