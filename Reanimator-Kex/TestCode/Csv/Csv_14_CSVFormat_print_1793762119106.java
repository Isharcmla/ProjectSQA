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
import java.lang.NullPointerException;
import static org.apache.commons.csv.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Character;
import java.lang.Object;
import java.lang.String;
import java.lang.Integer;
import java.lang.Boolean;

public class CSVFormat_print_1793762119106 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13277;
     Object term13482;
     Object term13483;
     Object term13485;
     Object term13487;

    public CSVFormat_print_1793762119106() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term13279 = new Character('J');
        Character term13282 = new Character('x');
        Character term13457 = new Character('l');
        Class<? extends Object> term62438 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term62437 = ((Class) term62438).getDeclaredField((String) "NONE");
        ((Field) term62437).setAccessible(true);
        Object enum128 = ((Field) term62437).get((Object) null);
        term13277 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term13284 = (Object[]) newArray("java.lang.String", 7);
        Object[] term13369 = (Object[]) newArray("java.lang.String", 6);
        setBooleanField(term13277, term13277.getClass(), "allowMissingColumnNames", true);
        setField(term13277, term13277.getClass(), "commentMarker", term13279);
        setCharField(term13277, term13277.getClass(), "delimiter", 'M');
        setField(term13277, term13277.getClass(), "escapeCharacter", term13282);
        setElement(term13284, 0, "WxYUTuqmIq");
        setElement(term13284, 1, "OeQLvhVERT");
        setElement(term13284, 2, "IlvgFINwIa");
        setElement(term13284, 3, "GEJABPlHSI");
        setElement(term13284, 4, "aQFUvuaYxd");
        setElement(term13284, 5, "zNFLXMifnS");
        setElement(term13284, 6, "HHQcYMSBVc");
        setField(term13277, term13277.getClass(), "header", term13284);
        setElement(term13369, 0, "wdoqITnaAP");
        setElement(term13369, 1, "rIPMBcrNqB");
        setElement(term13369, 2, "UDaboHZHhz");
        setElement(term13369, 3, "nRvKihUSPj");
        setElement(term13369, 4, "BbNeQJpYPr");
        setElement(term13369, 5, "riMtzCoxNj");
        setField(term13277, term13277.getClass(), "headerComments", term13369);
        setBooleanField(term13277, term13277.getClass(), "ignoreEmptyLines", true);
        setBooleanField(term13277, term13277.getClass(), "ignoreHeaderCase", true);
        setBooleanField(term13277, term13277.getClass(), "ignoreSurroundingSpaces", true);
        setField(term13277, term13277.getClass(), "nullString", "YAXkVjQZcV");
        setField(term13277, term13277.getClass(), "quoteCharacter", term13457);
        setField(term13277, term13277.getClass(), "quoteMode", enum128);
        setField(term13277, term13277.getClass(), "recordSeparator", "pumvwBWvpy");
        setBooleanField(term13277, term13277.getClass(), "skipHeaderRecord", false);
        setBooleanField(term13277, term13277.getClass(), "trailingDelimiter", true);
        setBooleanField(term13277, term13277.getClass(), "trim", true);
        term13482 = newInstance(Class.forName("java.lang.Object"));
        term13483 = new Integer(1162663216);
        term13485 = new Integer(1484323161);
        term13487 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.CharSequence");
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = Class.forName("java.lang.Appendable");
        argTypes[5] = boolean.class;
        Object[] args = new Object[6];
        args[0] = term13482;
        args[1] = null;
        args[2] = term13483;
        args[3] = term13485;
        args[4] = null;
        args[5] = term13487;
        try {
            callMethod(klass, "print", argTypes, term13277, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


