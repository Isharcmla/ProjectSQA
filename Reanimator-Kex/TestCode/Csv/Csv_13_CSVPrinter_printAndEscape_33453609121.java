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
import java.lang.Object;
import java.lang.Character;
import java.lang.String;
import java.lang.Integer;

public class CSVPrinter_printAndEscape_33453609121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2678;
     Object term2818;
     Object term2820;

    public CSVPrinter_printAndEscape_33453609121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term2681 = new Character('Q');
        Class<? extends Object> term12004 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term12003 = ((Class) term12004).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term12003).setAccessible(true);
        Object enum24 = ((Field) term12003).get((Object) null);
        Character term2698 = new Character('H');
        Character term2700 = new Character('g');
        term2678 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term2679 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term2729 = (Object[]) newArray("java.lang.String", 5);
        Object[] term2790 = (Object[]) newArray("java.lang.String", 2);
        setField(term2678, term2678.getClass(), "out", null);
        setCharField(term2679, term2679.getClass(), "delimiter", 'g');
        setField(term2679, term2679.getClass(), "quoteCharacter", term2681);
        setField(term2679, term2679.getClass(), "quoteMode", enum24);
        setField(term2679, term2679.getClass(), "commentMarker", term2698);
        setField(term2679, term2679.getClass(), "escapeCharacter", term2700);
        setBooleanField(term2679, term2679.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term2679, term2679.getClass(), "allowMissingColumnNames", true);
        setBooleanField(term2679, term2679.getClass(), "ignoreEmptyLines", true);
        setField(term2679, term2679.getClass(), "recordSeparator", "hoicvmsovO");
        setField(term2679, term2679.getClass(), "nullString", "eqJfYWRaEL");
        setElement(term2729, 0, "fhkbdRViHi");
        setElement(term2729, 1, "uWHnvSvaPl");
        setElement(term2729, 2, "kBdSllIBVz");
        setElement(term2729, 3, "TJmVBGfTML");
        setElement(term2729, 4, "tPlsykYBqO");
        setField(term2679, term2679.getClass(), "header", term2729);
        setElement(term2790, 0, "bLPjGVBhlX");
        setElement(term2790, 1, "whBvTVIIlC");
        setField(term2679, term2679.getClass(), "headerComments", term2790);
        setBooleanField(term2679, term2679.getClass(), "skipHeaderRecord", true);
        setBooleanField(term2679, term2679.getClass(), "ignoreHeaderCase", false);
        setField(term2678, term2678.getClass(), "format", term2679);
        setBooleanField(term2678, term2678.getClass(), "newRecord", false);
        term2818 = new Integer(1484323161);
        term2820 = new Integer(391863371);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.CharSequence");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term2818;
        args[2] = term2820;
        try {
            callMethod(klass, "printAndEscape", argTypes, term2678, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


