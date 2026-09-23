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

public class CSVParser_parse_156507206483 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term253440;
     Object term254115;
     Object term254003;

    public CSVParser_parse_156507206483() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term253492 = new Character((char) 0);
        Character term253544 = new Character((char) 0);
        Character term253596 = new Character((char) 0);
        term253440 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term250926 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term253440, term253440.getClass(), "delimiter", (char) 0);
        setField(term253440, term253440.getClass(), "escape", term253492);
        setField(term253440, term253440.getClass(), "quoteChar", term253544);
        setField(term253440, term253440.getClass(), "commentStart", term253596);
        setBooleanField(term253440, term253440.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term253440, term253440.getClass(), "ignoreEmptyLines", true);
        setField(term253440, term253440.getClass(), "header", term250926);
        setBooleanField(term253440, term253440.getClass(), "skipHeaderRecord", true);
        setIntField(null, Class.forName("java.io.BufferedReader"), "defaultCharBufferSize", 4);
        Character term254116 = new Character((char) 0);
        Character term254117 = new Character((char) 0);
        Character term254118 = new Character((char) 0);
        term254115 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term254119 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term254115, term254115.getClass(), "delimiter", (char) 0);
        setField(term254115, term254115.getClass(), "quoteChar", term254116);
        setField(term254115, term254115.getClass(), "quotePolicy", null);
        setField(term254115, term254115.getClass(), "commentStart", term254117);
        setField(term254115, term254115.getClass(), "escape", term254118);
        setBooleanField(term254115, term254115.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term254115, term254115.getClass(), "ignoreEmptyHeaders", false);
        setBooleanField(term254115, term254115.getClass(), "ignoreEmptyLines", true);
        setField(term254115, term254115.getClass(), "recordSeparator", null);
        setField(term254115, term254115.getClass(), "nullString", null);
        setField(term254115, term254115.getClass(), "header", term254119);
        setBooleanField(term254115, term254115.getClass(), "skipHeaderRecord", true);
        Character term253611 = new Character((char) 0);
        Character term253613 = new Character((char) 0);
        Character term253615 = new Character((char) 0);
        LinkedHashMap term254004 = new LinkedHashMap();
        ArrayList term254037 = new ArrayList();
        Class<? extends Object> term254125 = Class.forName((String) "org.apache.commons.csv.Token$Type");
        Field term254124 = ((Class) term254125).getDeclaredField((String) "EOF");
        ((Field) term254124).setAccessible(true);
        Object enum89 = ((Field) term254124).get((Object) null);
        term254003 = newInstance(Class.forName("org.apache.commons.csv.CSVParser"));
        Object term253609 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term253620 = (Object[]) newArray("java.lang.String", 0);
        Object term254010 = newInstance(Class.forName("org.apache.commons.csv.Lexer"));
        Object term254017 = newInstance(Class.forName("org.apache.commons.csv.ExtendedBufferedReader"));
        Object term254021 = newInstance(Class.forName("java.io.StringReader"));
        char[] term254026 = (char[]) newCharArray(4);
        Object term254042 = newInstance(Class.forName("org.apache.commons.csv.Token"));
        Object term254050 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term254051 = (byte[]) newByteArray(50);
        setCharField(term253609, term253609.getClass(), "delimiter", (char) 0);
        setField(term253609, term253609.getClass(), "quoteChar", term253611);
        setField(term253609, term253609.getClass(), "quotePolicy", null);
        setField(term253609, term253609.getClass(), "commentStart", term253613);
        setField(term253609, term253609.getClass(), "escape", term253615);
        setBooleanField(term253609, term253609.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term253609, term253609.getClass(), "ignoreEmptyHeaders", false);
        setBooleanField(term253609, term253609.getClass(), "ignoreEmptyLines", true);
        setField(term253609, term253609.getClass(), "recordSeparator", null);
        setField(term253609, term253609.getClass(), "nullString", null);
        setField(term253609, term253609.getClass(), "header", term253620);
        setBooleanField(term253609, term253609.getClass(), "skipHeaderRecord", true);
        setField(term254003, term254003.getClass(), "format", term253609);
        setField(term254003, term254003.getClass(), "headerMap", term254004);
        setCharField(term254010, term254010.getClass(), "delimiter", (char) 0);
        setCharField(term254010, term254010.getClass(), "escape", (char) 0);
        setCharField(term254010, term254010.getClass(), "quoteChar", (char) 0);
        setCharField(term254010, term254010.getClass(), "commentStart", (char) 0);
        setBooleanField(term254010, term254010.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term254010, term254010.getClass(), "ignoreEmptyLines", true);
        setIntField(term254017, term254017.getClass(), "lastChar", -1);
        setLongField(term254017, term254017.getClass(), "eolCounter", 0L);
        setBooleanField(term254017, term254017.getClass(), "closed", false);
        setField(term254021, term254021.getClass(), "str", "");
        setIntField(term254021, term254021.getClass(), "length", 0);
        setIntField(term254021, term254021.getClass(), "next", 0);
        setIntField(term254021, term254021.getClass(), "mark", 0);
        setField(term254021, term254021.getClass(), "lock", term254021);
        setField(term254021, term254021.getClass(), "skipBuffer", null);
        setField(term254017, term254017.getClass(), "in", term254021);
        setField(term254017, term254017.getClass(), "cb", term254026);
        setIntField(term254017, term254017.getClass(), "nChars", 0);
        setIntField(term254017, term254017.getClass(), "nextChar", 0);
        setIntField(term254017, term254017.getClass(), "markedChar", -1);
        setIntField(term254017, term254017.getClass(), "readAheadLimit", 0);
        setBooleanField(term254017, term254017.getClass(), "skipLF", false);
        setBooleanField(term254017, term254017.getClass(), "markedSkipLF", false);
        setField(term254017, term254017.getClass(), "lock", term254021);
        setField(term254017, term254017.getClass(), "skipBuffer", null);
        setField(term254010, term254010.getClass(), "reader", term254017);
        setField(term254003, term254003.getClass(), "lexer", term254010);
        setField(term254003, term254003.getClass(), "record", term254037);
        setLongField(term254003, term254003.getClass(), "recordNumber", 0L);
        setField(term254042, term254042.getClass(), "type", enum89);
        setField(term254050, term254050.getClass(), "value", term254051);
        setByteField(term254050, term254050.getClass(), "coder", (byte) 0);
        setIntField(term254050, term254050.getClass(), "count", 0);
        setField(term254042, term254042.getClass(), "content", term254050);
        setBooleanField(term254042, term254042.getClass(), "isReady", false);
        setField(term254003, term254003.getClass(), "reusableToken", term254042);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("org.apache.commons.csv.CSVFormat");
        Object[] args = new Object[2];
        args[0] = "";
        args[1] = term253440;
        Object retValue = callMethod(klass, "parse", argTypes, null, args);
        assertTrue(recursiveEquals(term253440, term254115));
        assertTrue(recursiveEquals(retValue, term254003));
    }

};


