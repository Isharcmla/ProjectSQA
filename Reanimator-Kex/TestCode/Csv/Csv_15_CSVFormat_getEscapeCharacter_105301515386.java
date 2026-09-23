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
import java.lang.String;

public class CSVFormat_getEscapeCharacter_105301515386 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2745;
     Object term45006;
     Object term44290;

    public CSVFormat_getEscapeCharacter_105301515386() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term2747 = new Character('g');
        Character term2750 = new Character('z');
        Character term2829 = new Character('x');
        Class<? extends Object> term45090 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term45089 = ((Class) term45090).getDeclaredField((String) "ALL_NON_NULL");
        ((Field) term45089).setAccessible(true);
        Object enum87 = ((Field) term45089).get((Object) null);
        term2745 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term2752 = (Object[]) newArray("java.lang.String", 2);
        Object[] term2777 = (Object[]) newArray("java.lang.String", 3);
        setBooleanField(term2745, term2745.getClass(), "allowMissingColumnNames", false);
        setField(term2745, term2745.getClass(), "commentMarker", term2747);
        setCharField(term2745, term2745.getClass(), "delimiter", 'q');
        setField(term2745, term2745.getClass(), "escapeCharacter", term2750);
        setElement(term2752, 0, "dEnhdmILtU");
        setElement(term2752, 1, "hoicvmsovO");
        setField(term2745, term2745.getClass(), "header", term2752);
        setElement(term2777, 0, "eqJfYWRaEL");
        setElement(term2777, 1, "fhkbdRViHi");
        setElement(term2777, 2, "uWHnvSvaPl");
        setField(term2745, term2745.getClass(), "headerComments", term2777);
        setBooleanField(term2745, term2745.getClass(), "ignoreEmptyLines", true);
        setBooleanField(term2745, term2745.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term2745, term2745.getClass(), "ignoreSurroundingSpaces", false);
        setField(term2745, term2745.getClass(), "nullString", "kBdSllIBVz");
        setField(term2745, term2745.getClass(), "quoteCharacter", term2829);
        setField(term2745, term2745.getClass(), "quoteMode", enum87);
        setField(term2745, term2745.getClass(), "recordSeparator", "TJmVBGfTML");
        setBooleanField(term2745, term2745.getClass(), "skipHeaderRecord", true);
        setBooleanField(term2745, term2745.getClass(), "trailingDelimiter", false);
        setBooleanField(term2745, term2745.getClass(), "trim", true);
        setBooleanField(term2745, term2745.getClass(), "autoFlush", false);
        Character term45007 = new Character('g');
        Character term45008 = new Character('z');
        Character term45023 = new Character('x');
        Class<? extends Object> term45363 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term45362 = ((Class) term45363).getDeclaredField((String) "ALL_NON_NULL");
        ((Field) term45362).setAccessible(true);
        Object enum88 = ((Field) term45362).get((Object) null);
        term45006 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term45009 = (Object[]) newArray("java.lang.String", 2);
        Object[] term45014 = (Object[]) newArray("java.lang.String", 3);
        setBooleanField(term45006, term45006.getClass(), "allowMissingColumnNames", false);
        setField(term45006, term45006.getClass(), "commentMarker", term45007);
        setCharField(term45006, term45006.getClass(), "delimiter", 'q');
        setField(term45006, term45006.getClass(), "escapeCharacter", term45008);
        setElement(term45009, 0, "dEnhdmILtU");
        setElement(term45009, 1, "hoicvmsovO");
        setField(term45006, term45006.getClass(), "header", term45009);
        setElement(term45014, 0, "eqJfYWRaEL");
        setElement(term45014, 1, "fhkbdRViHi");
        setElement(term45014, 2, "uWHnvSvaPl");
        setField(term45006, term45006.getClass(), "headerComments", term45014);
        setBooleanField(term45006, term45006.getClass(), "ignoreEmptyLines", true);
        setBooleanField(term45006, term45006.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term45006, term45006.getClass(), "ignoreSurroundingSpaces", false);
        setField(term45006, term45006.getClass(), "nullString", "kBdSllIBVz");
        setField(term45006, term45006.getClass(), "quoteCharacter", term45023);
        setField(term45006, term45006.getClass(), "quoteMode", enum88);
        setField(term45006, term45006.getClass(), "recordSeparator", "TJmVBGfTML");
        setBooleanField(term45006, term45006.getClass(), "skipHeaderRecord", true);
        setBooleanField(term45006, term45006.getClass(), "trailingDelimiter", false);
        setBooleanField(term45006, term45006.getClass(), "trim", true);
        setBooleanField(term45006, term45006.getClass(), "autoFlush", false);
        term44290 = new Character('z');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getEscapeCharacter", argTypes, term2745, args);
        assertTrue(recursiveEquals(term2745, term45006));
        assertTrue(recursiveEquals(retValue, term44290));
    }

};


