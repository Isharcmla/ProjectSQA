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
     Object term343022;
     Object term343872;
     Object term343744;

    public CSVParser_parse_1565072064121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term343074 = new Character((char) 0);
        Character term343126 = new Character((char) 0);
        Character term343178 = new Character((char) 0);
        term343022 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term341476 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term343022, term343022.getClass(), "delimiter", (char) 0);
        setField(term343022, term343022.getClass(), "escapeCharacter", term343074);
        setField(term343022, term343022.getClass(), "quoteCharacter", term343126);
        setField(term343022, term343022.getClass(), "commentMarker", term343178);
        setBooleanField(term343022, term343022.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term343022, term343022.getClass(), "ignoreEmptyLines", true);
        setField(term343022, term343022.getClass(), "header", term341476);
        setBooleanField(term343022, term343022.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term343022, term343022.getClass(), "skipHeaderRecord", true);
        setIntField(null, Class.forName("java.io.BufferedReader"), "defaultCharBufferSize", 16);
        Character term343873 = new Character((char) 0);
        Character term343874 = new Character((char) 0);
        Character term343876 = new Character((char) 0);
        term343872 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term343875 = (Object[]) newArray("java.lang.String", 0);
        setBooleanField(term343872, term343872.getClass(), "allowMissingColumnNames", false);
        setField(term343872, term343872.getClass(), "commentMarker", term343873);
        setCharField(term343872, term343872.getClass(), "delimiter", (char) 0);
        setField(term343872, term343872.getClass(), "escapeCharacter", term343874);
        setField(term343872, term343872.getClass(), "header", term343875);
        setField(term343872, term343872.getClass(), "headerComments", null);
        setBooleanField(term343872, term343872.getClass(), "ignoreEmptyLines", true);
        setBooleanField(term343872, term343872.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term343872, term343872.getClass(), "ignoreSurroundingSpaces", true);
        setField(term343872, term343872.getClass(), "nullString", null);
        setField(term343872, term343872.getClass(), "quoteCharacter", term343876);
        setField(term343872, term343872.getClass(), "quoteMode", null);
        setField(term343872, term343872.getClass(), "recordSeparator", null);
        setBooleanField(term343872, term343872.getClass(), "skipHeaderRecord", true);
        setBooleanField(term343872, term343872.getClass(), "trailingDelimiter", false);
        setBooleanField(term343872, term343872.getClass(), "trim", false);
        setBooleanField(term343872, term343872.getClass(), "autoFlush", false);
        Character term343193 = new Character((char) 0);
        Character term343196 = new Character((char) 0);
        Character term343202 = new Character((char) 0);
        LinkedHashMap term343745 = new LinkedHashMap();
        ArrayList term343791 = new ArrayList();
        Class<? extends Object> term343894 = Class.forName((String) "org.apache.commons.csv.Token$Type");
        Field term343893 = ((Class) term343894).getDeclaredField((String) "EOF");
        ((Field) term343893).setAccessible(true);
        Object enum108 = ((Field) term343893).get((Object) null);
        term343744 = newInstance(Class.forName("org.apache.commons.csv.CSVParser"));
        Object term343191 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term343198 = (Object[]) newArray("java.lang.String", 0);
        Object term343751 = newInstance(Class.forName("org.apache.commons.csv.Lexer"));
        Object term343758 = newInstance(Class.forName("org.apache.commons.csv.ExtendedBufferedReader"));
        Object term343763 = newInstance(Class.forName("java.io.StringReader"));
        char[] term343768 = (char[]) newCharArray(16);
        Object term343797 = newInstance(Class.forName("org.apache.commons.csv.Token"));
        Object term343805 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term343806 = (byte[]) newByteArray(50);
        setBooleanField(term343191, term343191.getClass(), "allowMissingColumnNames", false);
        setField(term343191, term343191.getClass(), "commentMarker", term343193);
        setCharField(term343191, term343191.getClass(), "delimiter", (char) 0);
        setField(term343191, term343191.getClass(), "escapeCharacter", term343196);
        setField(term343191, term343191.getClass(), "header", term343198);
        setField(term343191, term343191.getClass(), "headerComments", null);
        setBooleanField(term343191, term343191.getClass(), "ignoreEmptyLines", true);
        setBooleanField(term343191, term343191.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term343191, term343191.getClass(), "ignoreSurroundingSpaces", true);
        setField(term343191, term343191.getClass(), "nullString", null);
        setField(term343191, term343191.getClass(), "quoteCharacter", term343202);
        setField(term343191, term343191.getClass(), "quoteMode", null);
        setField(term343191, term343191.getClass(), "recordSeparator", null);
        setBooleanField(term343191, term343191.getClass(), "skipHeaderRecord", true);
        setBooleanField(term343191, term343191.getClass(), "trailingDelimiter", false);
        setBooleanField(term343191, term343191.getClass(), "trim", false);
        setBooleanField(term343191, term343191.getClass(), "autoFlush", false);
        setField(term343744, term343744.getClass(), "format", term343191);
        setField(term343744, term343744.getClass(), "headerMap", term343745);
        setCharField(term343751, term343751.getClass(), "delimiter", (char) 0);
        setCharField(term343751, term343751.getClass(), "escape", (char) 0);
        setCharField(term343751, term343751.getClass(), "quoteChar", (char) 0);
        setCharField(term343751, term343751.getClass(), "commentStart", (char) 0);
        setBooleanField(term343751, term343751.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term343751, term343751.getClass(), "ignoreEmptyLines", true);
        setIntField(term343758, term343758.getClass(), "lastChar", -1);
        setLongField(term343758, term343758.getClass(), "eolCounter", 0L);
        setLongField(term343758, term343758.getClass(), "position", 1L);
        setBooleanField(term343758, term343758.getClass(), "closed", false);
        setField(term343763, term343763.getClass(), "str", "");
        setIntField(term343763, term343763.getClass(), "length", 0);
        setIntField(term343763, term343763.getClass(), "next", 0);
        setIntField(term343763, term343763.getClass(), "mark", 0);
        setField(term343763, term343763.getClass(), "lock", term343763);
        setField(term343763, term343763.getClass(), "skipBuffer", null);
        setField(term343758, term343758.getClass(), "in", term343763);
        setField(term343758, term343758.getClass(), "cb", term343768);
        setIntField(term343758, term343758.getClass(), "nChars", 0);
        setIntField(term343758, term343758.getClass(), "nextChar", 0);
        setIntField(term343758, term343758.getClass(), "markedChar", -1);
        setIntField(term343758, term343758.getClass(), "readAheadLimit", 0);
        setBooleanField(term343758, term343758.getClass(), "skipLF", false);
        setBooleanField(term343758, term343758.getClass(), "markedSkipLF", false);
        setField(term343758, term343758.getClass(), "lock", term343763);
        setField(term343758, term343758.getClass(), "skipBuffer", null);
        setField(term343751, term343751.getClass(), "reader", term343758);
        setField(term343751, term343751.getClass(), "firstEol", null);
        setField(term343744, term343744.getClass(), "lexer", term343751);
        setField(term343744, term343744.getClass(), "recordList", term343791);
        setLongField(term343744, term343744.getClass(), "recordNumber", 0L);
        setLongField(term343744, term343744.getClass(), "characterOffset", 0L);
        setField(term343797, term343797.getClass(), "type", enum108);
        setField(term343805, term343805.getClass(), "value", term343806);
        setByteField(term343805, term343805.getClass(), "coder", (byte) 0);
        setIntField(term343805, term343805.getClass(), "count", 0);
        setField(term343797, term343797.getClass(), "content", term343805);
        setBooleanField(term343797, term343797.getClass(), "isReady", false);
        setField(term343744, term343744.getClass(), "reusableToken", term343797);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("org.apache.commons.csv.CSVFormat");
        Object[] args = new Object[2];
        args[0] = "";
        args[1] = term343022;
        Object retValue = callMethod(klass, "parse", argTypes, null, args);
        assertTrue(recursiveEquals(term343022, term343872));
        assertTrue(recursiveEquals(retValue, term343744));
    }

};


