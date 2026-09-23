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
import java.lang.Character;
import java.lang.Object;
import java.lang.String;

public class CSVFormat_print_59438137433 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13400;

    public CSVFormat_print_59438137433() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term13402 = new Character('J');
        Character term13405 = new Character('x');
        Character term13580 = new Character('l');
        Class<? extends Object> term13746 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term13745 = ((Class) term13746).getDeclaredField((String) "ALL");
        ((Field) term13745).setAccessible(true);
        Object enum30 = ((Field) term13745).get((Object) null);
        term13400 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term13407 = (Object[]) newArray("java.lang.String", 7);
        Object[] term13492 = (Object[]) newArray("java.lang.String", 6);
        setBooleanField(term13400, term13400.getClass(), "allowMissingColumnNames", true);
        setField(term13400, term13400.getClass(), "commentMarker", term13402);
        setCharField(term13400, term13400.getClass(), "delimiter", 'M');
        setField(term13400, term13400.getClass(), "escapeCharacter", term13405);
        setElement(term13407, 0, "WxYUTuqmIq");
        setElement(term13407, 1, "OeQLvhVERT");
        setElement(term13407, 2, "IlvgFINwIa");
        setElement(term13407, 3, "GEJABPlHSI");
        setElement(term13407, 4, "aQFUvuaYxd");
        setElement(term13407, 5, "zNFLXMifnS");
        setElement(term13407, 6, "HHQcYMSBVc");
        setField(term13400, term13400.getClass(), "header", term13407);
        setElement(term13492, 0, "wdoqITnaAP");
        setElement(term13492, 1, "rIPMBcrNqB");
        setElement(term13492, 2, "UDaboHZHhz");
        setElement(term13492, 3, "nRvKihUSPj");
        setElement(term13492, 4, "BbNeQJpYPr");
        setElement(term13492, 5, "riMtzCoxNj");
        setField(term13400, term13400.getClass(), "headerComments", term13492);
        setBooleanField(term13400, term13400.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term13400, term13400.getClass(), "ignoreHeaderCase", true);
        setBooleanField(term13400, term13400.getClass(), "ignoreSurroundingSpaces", true);
        setField(term13400, term13400.getClass(), "nullString", "YAXkVjQZcV");
        setField(term13400, term13400.getClass(), "quoteCharacter", term13580);
        setField(term13400, term13400.getClass(), "quoteMode", enum30);
        setField(term13400, term13400.getClass(), "recordSeparator", "pumvwBWvpy");
        setBooleanField(term13400, term13400.getClass(), "skipHeaderRecord", true);
        setBooleanField(term13400, term13400.getClass(), "trailingDelimiter", true);
        setBooleanField(term13400, term13400.getClass(), "trim", true);
        setBooleanField(term13400, term13400.getClass(), "autoFlush", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.nio.file.Path");
        argTypes[1] = Class.forName("java.nio.charset.Charset");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "print", argTypes, term13400, args);
    }

};


