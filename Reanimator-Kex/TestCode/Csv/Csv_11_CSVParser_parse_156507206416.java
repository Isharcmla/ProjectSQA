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
import java.lang.String;
import java.lang.Object;
import java.util.LinkedHashMap;
import java.util.ArrayList;

public class CSVParser_parse_156507206416 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term584;
     Object term135342;
     Object term126890;

    public CSVParser_parse_156507206416() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term586 = new Character('n');
        Class<? extends Object> term135373 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term135372 = ((Class) term135373).getDeclaredField((String) "MINIMAL");
        ((Field) term135372).setAccessible(true);
        Object enum29 = ((Field) term135372).get((Object) null);
        Character term599 = new Character('Z');
        Character term601 = new Character('t');
        term584 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term630 = (Object[]) newArray("java.lang.String", 4);
        setCharField(term584, term584.getClass(), "delimiter", 't');
        setField(term584, term584.getClass(), "quoteChar", term586);
        setField(term584, term584.getClass(), "quotePolicy", enum29);
        setField(term584, term584.getClass(), "commentStart", term599);
        setField(term584, term584.getClass(), "escape", term601);
        setBooleanField(term584, term584.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term584, term584.getClass(), "ignoreEmptyHeaders", true);
        setBooleanField(term584, term584.getClass(), "ignoreEmptyLines", true);
        setField(term584, term584.getClass(), "recordSeparator", "RMFIsYGgne");
        setField(term584, term584.getClass(), "nullString", "NRdvgJlhkX");
        setElement(term630, 0, "uuaPigETmJ");
        setElement(term630, 1, "MxlszYVzRf");
        setElement(term630, 2, "LQFpaHEwXR");
        setElement(term630, 3, "oVcInYnLWB");
        setField(term584, term584.getClass(), "header", term630);
        setBooleanField(term584, term584.getClass(), "skipHeaderRecord", true);
        Character term135343 = new Character('n');
        Class<? extends Object> term135611 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term135610 = ((Class) term135611).getDeclaredField((String) "MINIMAL");
        ((Field) term135610).setAccessible(true);
        Object enum30 = ((Field) term135610).get((Object) null);
        Character term135347 = new Character('Z');
        Character term135348 = new Character('t');
        term135342 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term135353 = (Object[]) newArray("java.lang.String", 4);
        setCharField(term135342, term135342.getClass(), "delimiter", 't');
        setField(term135342, term135342.getClass(), "quoteChar", term135343);
        setField(term135342, term135342.getClass(), "quotePolicy", enum30);
        setField(term135342, term135342.getClass(), "commentStart", term135347);
        setField(term135342, term135342.getClass(), "escape", term135348);
        setBooleanField(term135342, term135342.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term135342, term135342.getClass(), "ignoreEmptyHeaders", true);
        setBooleanField(term135342, term135342.getClass(), "ignoreEmptyLines", true);
        setField(term135342, term135342.getClass(), "recordSeparator", "RMFIsYGgne");
        setField(term135342, term135342.getClass(), "nullString", "NRdvgJlhkX");
        setElement(term135353, 0, "uuaPigETmJ");
        setElement(term135353, 1, "MxlszYVzRf");
        setElement(term135353, 2, "LQFpaHEwXR");
        setElement(term135353, 3, "oVcInYnLWB");
        setField(term135342, term135342.getClass(), "header", term135353);
        setBooleanField(term135342, term135342.getClass(), "skipHeaderRecord", true);
        Character term10820 = new Character('n');
        Class<? extends Object> term135839 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term135838 = ((Class) term135839).getDeclaredField((String) "MINIMAL");
        ((Field) term135838).setAccessible(true);
        Object enum31 = ((Field) term135838).get((Object) null);
        Character term10833 = new Character('Z');
        Character term10835 = new Character('t');
        LinkedHashMap term126891 = new LinkedHashMap();
        ArrayList term135154 = new ArrayList();
        ((ArrayList) term135154).add("hRNSzYYIrc");
        Class<? extends Object> term144269 = Class.forName((String) "org.apache.commons.csv.Token$Type");
        Field term144268 = ((Class) term144269).getDeclaredField((String) "EOF");
        ((Field) term144268).setAccessible(true);
        Object enum32 = ((Field) term144268).get((Object) null);
        term126890 = newInstance(Class.forName("org.apache.commons.csv.CSVParser"));
        Object term10818 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term10864 = (Object[]) newArray("java.lang.String", 4);
        Object term126939 = newInstance(Class.forName("org.apache.commons.csv.Lexer"));
        Object term126946 = newInstance(Class.forName("org.apache.commons.csv.ExtendedBufferedReader"));
        Object term126950 = newInstance(Class.forName("java.io.StringReader"));
        char[] term126955 = (char[]) newCharArray(8192);
        Object term135171 = newInstance(Class.forName("org.apache.commons.csv.Token"));
        Object term135179 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term135180 = (byte[]) newByteArray(50);
        setCharField(term10818, term10818.getClass(), "delimiter", 't');
        setField(term10818, term10818.getClass(), "quoteChar", term10820);
        setField(term10818, term10818.getClass(), "quotePolicy", enum31);
        setField(term10818, term10818.getClass(), "commentStart", term10833);
        setField(term10818, term10818.getClass(), "escape", term10835);
        setBooleanField(term10818, term10818.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term10818, term10818.getClass(), "ignoreEmptyHeaders", true);
        setBooleanField(term10818, term10818.getClass(), "ignoreEmptyLines", true);
        setField(term10818, term10818.getClass(), "recordSeparator", "RMFIsYGgne");
        setField(term10818, term10818.getClass(), "nullString", "NRdvgJlhkX");
        setElement(term10864, 0, "uuaPigETmJ");
        setElement(term10864, 1, "MxlszYVzRf");
        setElement(term10864, 2, "LQFpaHEwXR");
        setElement(term10864, 3, "oVcInYnLWB");
        setField(term10818, term10818.getClass(), "header", term10864);
        setBooleanField(term10818, term10818.getClass(), "skipHeaderRecord", true);
        setField(term126890, term126890.getClass(), "format", term10818);
        setField(term126890, term126890.getClass(), "headerMap", term126891);
        setCharField(term126939, term126939.getClass(), "delimiter", 't');
        setCharField(term126939, term126939.getClass(), "escape", 't');
        setCharField(term126939, term126939.getClass(), "quoteChar", 'n');
        setCharField(term126939, term126939.getClass(), "commentStart", 'Z');
        setBooleanField(term126939, term126939.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term126939, term126939.getClass(), "ignoreEmptyLines", true);
        setIntField(term126946, term126946.getClass(), "lastChar", -1);
        setLongField(term126946, term126946.getClass(), "eolCounter", 0L);
        setBooleanField(term126946, term126946.getClass(), "closed", false);
        setField(term126950, term126950.getClass(), "str", "");
        setIntField(term126950, term126950.getClass(), "length", 10);
        setIntField(term126950, term126950.getClass(), "next", 10);
        setIntField(term126950, term126950.getClass(), "mark", 0);
        setField(term126950, term126950.getClass(), "lock", term126950);
        setField(term126950, term126950.getClass(), "skipBuffer", null);
        setField(term126946, term126946.getClass(), "in", term126950);
        setCharElement(term126955, 0, 'h');
        setCharElement(term126955, 1, 'R');
        setCharElement(term126955, 2, 'N');
        setCharElement(term126955, 3, 'S');
        setCharElement(term126955, 4, 'z');
        setCharElement(term126955, 5, 'Y');
        setCharElement(term126955, 6, 'Y');
        setCharElement(term126955, 7, 'I');
        setCharElement(term126955, 8, 'r');
        setCharElement(term126955, 9, 'c');
        setField(term126946, term126946.getClass(), "cb", term126955);
        setIntField(term126946, term126946.getClass(), "nChars", 10);
        setIntField(term126946, term126946.getClass(), "nextChar", 10);
        setIntField(term126946, term126946.getClass(), "markedChar", -1);
        setIntField(term126946, term126946.getClass(), "readAheadLimit", 0);
        setBooleanField(term126946, term126946.getClass(), "skipLF", false);
        setBooleanField(term126946, term126946.getClass(), "markedSkipLF", false);
        setField(term126946, term126946.getClass(), "lock", term126950);
        setField(term126946, term126946.getClass(), "skipBuffer", null);
        setField(term126939, term126939.getClass(), "reader", term126946);
        setField(term126890, term126890.getClass(), "lexer", term126939);
        setField(term126890, term126890.getClass(), "record", term135154);
        setLongField(term126890, term126890.getClass(), "recordNumber", 1L);
        setField(term135171, term135171.getClass(), "type", enum32);
        setByteElement(term135180, 0, (byte) 104);
        setByteElement(term135180, 1, (byte) 82);
        setByteElement(term135180, 2, (byte) 78);
        setByteElement(term135180, 3, (byte) 83);
        setByteElement(term135180, 4, (byte) 122);
        setByteElement(term135180, 5, (byte) 89);
        setByteElement(term135180, 6, (byte) 89);
        setByteElement(term135180, 7, (byte) 73);
        setByteElement(term135180, 8, (byte) 114);
        setByteElement(term135180, 9, (byte) 99);
        setField(term135179, term135179.getClass(), "value", term135180);
        setByteField(term135179, term135179.getClass(), "coder", (byte) 0);
        setIntField(term135179, term135179.getClass(), "count", 10);
        setField(term135171, term135171.getClass(), "content", term135179);
        setBooleanField(term135171, term135171.getClass(), "isReady", true);
        setField(term126890, term126890.getClass(), "reusableToken", term135171);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("org.apache.commons.csv.CSVFormat");
        Object[] args = new Object[2];
        args[0] = "hRNSzYYIrc";
        args[1] = term584;
        Object retValue = callMethod(klass, "parse", argTypes, null, args);
        assertTrue(recursiveEquals(term584, term135342));
        assertTrue(recursiveEquals(retValue, term126890));
    }

};


