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

public class CSVParser_parse_156507206485 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term258033;
     Object term261248;
     Object term260628;

    public CSVParser_parse_156507206485() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term258085 = new Character((char) 8);
        Character term258137 = new Character((char) 0);
        Character term258189 = new Character((char) 8);
        term258033 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term255492 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term258033, term258033.getClass(), "delimiter", (char) 8);
        setField(term258033, term258033.getClass(), "escape", term258085);
        setField(term258033, term258033.getClass(), "quoteChar", term258137);
        setField(term258033, term258033.getClass(), "commentStart", term258189);
        setBooleanField(term258033, term258033.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term258033, term258033.getClass(), "ignoreEmptyLines", true);
        setField(term258033, term258033.getClass(), "header", term255492);
        setBooleanField(term258033, term258033.getClass(), "skipHeaderRecord", true);
        setIntField(null, Class.forName("java.io.BufferedReader"), "defaultCharBufferSize", 512);
        Character term261249 = new Character((char) 0);
        Character term261250 = new Character((char) 8);
        Character term261251 = new Character((char) 8);
        term261248 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term261252 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term261248, term261248.getClass(), "delimiter", (char) 8);
        setField(term261248, term261248.getClass(), "quoteChar", term261249);
        setField(term261248, term261248.getClass(), "quotePolicy", null);
        setField(term261248, term261248.getClass(), "commentStart", term261250);
        setField(term261248, term261248.getClass(), "escape", term261251);
        setBooleanField(term261248, term261248.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term261248, term261248.getClass(), "ignoreEmptyHeaders", false);
        setBooleanField(term261248, term261248.getClass(), "ignoreEmptyLines", true);
        setField(term261248, term261248.getClass(), "recordSeparator", null);
        setField(term261248, term261248.getClass(), "nullString", null);
        setField(term261248, term261248.getClass(), "header", term261252);
        setBooleanField(term261248, term261248.getClass(), "skipHeaderRecord", true);
        Character term258204 = new Character((char) 0);
        Character term258206 = new Character((char) 8);
        Character term258208 = new Character((char) 8);
        LinkedHashMap term260629 = new LinkedHashMap();
        ArrayList term261170 = new ArrayList();
        Class<? extends Object> term261766 = Class.forName((String) "org.apache.commons.csv.Token$Type");
        Field term261765 = ((Class) term261766).getDeclaredField((String) "EOF");
        ((Field) term261765).setAccessible(true);
        Object enum90 = ((Field) term261765).get((Object) null);
        term260628 = newInstance(Class.forName("org.apache.commons.csv.CSVParser"));
        Object term258202 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term258213 = (Object[]) newArray("java.lang.String", 0);
        Object term260635 = newInstance(Class.forName("org.apache.commons.csv.Lexer"));
        Object term260642 = newInstance(Class.forName("org.apache.commons.csv.ExtendedBufferedReader"));
        Object term260646 = newInstance(Class.forName("java.io.StringReader"));
        char[] term260651 = (char[]) newCharArray(512);
        Object term261175 = newInstance(Class.forName("org.apache.commons.csv.Token"));
        Object term261183 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term261184 = (byte[]) newByteArray(50);
        setCharField(term258202, term258202.getClass(), "delimiter", (char) 8);
        setField(term258202, term258202.getClass(), "quoteChar", term258204);
        setField(term258202, term258202.getClass(), "quotePolicy", null);
        setField(term258202, term258202.getClass(), "commentStart", term258206);
        setField(term258202, term258202.getClass(), "escape", term258208);
        setBooleanField(term258202, term258202.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term258202, term258202.getClass(), "ignoreEmptyHeaders", false);
        setBooleanField(term258202, term258202.getClass(), "ignoreEmptyLines", true);
        setField(term258202, term258202.getClass(), "recordSeparator", null);
        setField(term258202, term258202.getClass(), "nullString", null);
        setField(term258202, term258202.getClass(), "header", term258213);
        setBooleanField(term258202, term258202.getClass(), "skipHeaderRecord", true);
        setField(term260628, term260628.getClass(), "format", term258202);
        setField(term260628, term260628.getClass(), "headerMap", term260629);
        setCharField(term260635, term260635.getClass(), "delimiter", (char) 8);
        setCharField(term260635, term260635.getClass(), "escape", (char) 8);
        setCharField(term260635, term260635.getClass(), "quoteChar", (char) 0);
        setCharField(term260635, term260635.getClass(), "commentStart", (char) 8);
        setBooleanField(term260635, term260635.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term260635, term260635.getClass(), "ignoreEmptyLines", true);
        setIntField(term260642, term260642.getClass(), "lastChar", -1);
        setLongField(term260642, term260642.getClass(), "eolCounter", 0L);
        setBooleanField(term260642, term260642.getClass(), "closed", false);
        setField(term260646, term260646.getClass(), "str", "");
        setIntField(term260646, term260646.getClass(), "length", 0);
        setIntField(term260646, term260646.getClass(), "next", 0);
        setIntField(term260646, term260646.getClass(), "mark", 0);
        setField(term260646, term260646.getClass(), "lock", term260646);
        setField(term260646, term260646.getClass(), "skipBuffer", null);
        setField(term260642, term260642.getClass(), "in", term260646);
        setField(term260642, term260642.getClass(), "cb", term260651);
        setIntField(term260642, term260642.getClass(), "nChars", 0);
        setIntField(term260642, term260642.getClass(), "nextChar", 0);
        setIntField(term260642, term260642.getClass(), "markedChar", -1);
        setIntField(term260642, term260642.getClass(), "readAheadLimit", 0);
        setBooleanField(term260642, term260642.getClass(), "skipLF", false);
        setBooleanField(term260642, term260642.getClass(), "markedSkipLF", false);
        setField(term260642, term260642.getClass(), "lock", term260646);
        setField(term260642, term260642.getClass(), "skipBuffer", null);
        setField(term260635, term260635.getClass(), "reader", term260642);
        setField(term260628, term260628.getClass(), "lexer", term260635);
        setField(term260628, term260628.getClass(), "record", term261170);
        setLongField(term260628, term260628.getClass(), "recordNumber", 0L);
        setField(term261175, term261175.getClass(), "type", enum90);
        setField(term261183, term261183.getClass(), "value", term261184);
        setByteField(term261183, term261183.getClass(), "coder", (byte) 0);
        setIntField(term261183, term261183.getClass(), "count", 0);
        setField(term261175, term261175.getClass(), "content", term261183);
        setBooleanField(term261175, term261175.getClass(), "isReady", false);
        setField(term260628, term260628.getClass(), "reusableToken", term261175);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("org.apache.commons.csv.CSVFormat");
        Object[] args = new Object[2];
        args[0] = "";
        args[1] = term258033;
        Object retValue = callMethod(klass, "parse", argTypes, null, args);
        assertTrue(recursiveEquals(term258033, term261248));
        assertTrue(recursiveEquals(retValue, term260628));
    }

};


