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

public class CSVParser_parse_1565072064121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term312161;
     Object term312835;
     Object term312723;

    public CSVParser_parse_1565072064121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term312213 = new Character((char) 0);
        Character term312265 = new Character((char) 0);
        Character term312317 = new Character((char) 0);
        term312161 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term309854 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term312161, term312161.getClass(), "delimiter", (char) 0);
        setField(term312161, term312161.getClass(), "escape", term312213);
        setField(term312161, term312161.getClass(), "quoteChar", term312265);
        setField(term312161, term312161.getClass(), "commentStart", term312317);
        setBooleanField(term312161, term312161.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term312161, term312161.getClass(), "ignoreEmptyLines", false);
        setField(term312161, term312161.getClass(), "header", term309854);
        setBooleanField(term312161, term312161.getClass(), "skipHeaderRecord", true);
        setIntField(null, Class.forName("java.io.BufferedReader"), "defaultCharBufferSize", 4);
        Character term312836 = new Character((char) 0);
        Character term312837 = new Character((char) 0);
        Character term312838 = new Character((char) 0);
        term312835 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term312839 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term312835, term312835.getClass(), "delimiter", (char) 0);
        setField(term312835, term312835.getClass(), "quoteChar", term312836);
        setField(term312835, term312835.getClass(), "quotePolicy", null);
        setField(term312835, term312835.getClass(), "commentStart", term312837);
        setField(term312835, term312835.getClass(), "escape", term312838);
        setBooleanField(term312835, term312835.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term312835, term312835.getClass(), "ignoreEmptyHeaders", false);
        setBooleanField(term312835, term312835.getClass(), "ignoreEmptyLines", false);
        setField(term312835, term312835.getClass(), "recordSeparator", null);
        setField(term312835, term312835.getClass(), "nullString", null);
        setField(term312835, term312835.getClass(), "header", term312839);
        setBooleanField(term312835, term312835.getClass(), "skipHeaderRecord", true);
        Character term312332 = new Character((char) 0);
        Character term312334 = new Character((char) 0);
        Character term312336 = new Character((char) 0);
        LinkedHashMap term312724 = new LinkedHashMap();
        ArrayList term312757 = new ArrayList();
        Class<? extends Object> term312845 = Class.forName((String) "org.apache.commons.csv.Token$Type");
        Field term312844 = ((Class) term312845).getDeclaredField((String) "EOF");
        ((Field) term312844).setAccessible(true);
        Object enum104 = ((Field) term312844).get((Object) null);
        term312723 = newInstance(Class.forName("org.apache.commons.csv.CSVParser"));
        Object term312330 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term312341 = (Object[]) newArray("java.lang.String", 0);
        Object term312730 = newInstance(Class.forName("org.apache.commons.csv.Lexer"));
        Object term312737 = newInstance(Class.forName("org.apache.commons.csv.ExtendedBufferedReader"));
        Object term312741 = newInstance(Class.forName("java.io.StringReader"));
        char[] term312746 = (char[]) newCharArray(4);
        Object term312762 = newInstance(Class.forName("org.apache.commons.csv.Token"));
        Object term312770 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term312771 = (byte[]) newByteArray(50);
        setCharField(term312330, term312330.getClass(), "delimiter", (char) 0);
        setField(term312330, term312330.getClass(), "quoteChar", term312332);
        setField(term312330, term312330.getClass(), "quotePolicy", null);
        setField(term312330, term312330.getClass(), "commentStart", term312334);
        setField(term312330, term312330.getClass(), "escape", term312336);
        setBooleanField(term312330, term312330.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term312330, term312330.getClass(), "ignoreEmptyHeaders", false);
        setBooleanField(term312330, term312330.getClass(), "ignoreEmptyLines", false);
        setField(term312330, term312330.getClass(), "recordSeparator", null);
        setField(term312330, term312330.getClass(), "nullString", null);
        setField(term312330, term312330.getClass(), "header", term312341);
        setBooleanField(term312330, term312330.getClass(), "skipHeaderRecord", true);
        setField(term312723, term312723.getClass(), "format", term312330);
        setField(term312723, term312723.getClass(), "headerMap", term312724);
        setCharField(term312730, term312730.getClass(), "delimiter", (char) 0);
        setCharField(term312730, term312730.getClass(), "escape", (char) 0);
        setCharField(term312730, term312730.getClass(), "quoteChar", (char) 0);
        setCharField(term312730, term312730.getClass(), "commentStart", (char) 0);
        setBooleanField(term312730, term312730.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term312730, term312730.getClass(), "ignoreEmptyLines", false);
        setIntField(term312737, term312737.getClass(), "lastChar", -1);
        setLongField(term312737, term312737.getClass(), "eolCounter", 0L);
        setBooleanField(term312737, term312737.getClass(), "closed", false);
        setField(term312741, term312741.getClass(), "str", "");
        setIntField(term312741, term312741.getClass(), "length", 0);
        setIntField(term312741, term312741.getClass(), "next", 0);
        setIntField(term312741, term312741.getClass(), "mark", 0);
        setField(term312741, term312741.getClass(), "lock", term312741);
        setField(term312741, term312741.getClass(), "skipBuffer", null);
        setField(term312737, term312737.getClass(), "in", term312741);
        setField(term312737, term312737.getClass(), "cb", term312746);
        setIntField(term312737, term312737.getClass(), "nChars", 0);
        setIntField(term312737, term312737.getClass(), "nextChar", 0);
        setIntField(term312737, term312737.getClass(), "markedChar", -1);
        setIntField(term312737, term312737.getClass(), "readAheadLimit", 0);
        setBooleanField(term312737, term312737.getClass(), "skipLF", false);
        setBooleanField(term312737, term312737.getClass(), "markedSkipLF", false);
        setField(term312737, term312737.getClass(), "lock", term312741);
        setField(term312737, term312737.getClass(), "skipBuffer", null);
        setField(term312730, term312730.getClass(), "reader", term312737);
        setField(term312723, term312723.getClass(), "lexer", term312730);
        setField(term312723, term312723.getClass(), "record", term312757);
        setLongField(term312723, term312723.getClass(), "recordNumber", 0L);
        setField(term312762, term312762.getClass(), "type", enum104);
        setField(term312770, term312770.getClass(), "value", term312771);
        setByteField(term312770, term312770.getClass(), "coder", (byte) 0);
        setIntField(term312770, term312770.getClass(), "count", 0);
        setField(term312762, term312762.getClass(), "content", term312770);
        setBooleanField(term312762, term312762.getClass(), "isReady", false);
        setField(term312723, term312723.getClass(), "reusableToken", term312762);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("org.apache.commons.csv.CSVFormat");
        Object[] args = new Object[2];
        args[0] = "";
        args[1] = term312161;
        Object retValue = callMethod(klass, "parse", argTypes, null, args);
        assertTrue(recursiveEquals(term312161, term312835));
        assertTrue(recursiveEquals(retValue, term312723));
    }

};


