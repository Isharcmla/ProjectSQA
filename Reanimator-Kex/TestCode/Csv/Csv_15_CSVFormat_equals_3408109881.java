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

public class CSVFormat_equals_3408109881 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term448;
     Object term589;
     Object term35574;
     Object term35601;

    public CSVFormat_equals_3408109881() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term450 = new Character('t');
        Character term453 = new Character('D');
        Character term556 = new Character('s');
        Class<? extends Object> term35684 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term35683 = ((Class) term35684).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term35683).setAccessible(true);
        Object enum77 = ((Field) term35683).get((Object) null);
        term448 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term455 = (Object[]) newArray("java.lang.String", 3);
        Object[] term492 = (Object[]) newArray("java.lang.String", 4);
        setBooleanField(term448, term448.getClass(), "allowMissingColumnNames", false);
        setField(term448, term448.getClass(), "commentMarker", term450);
        setCharField(term448, term448.getClass(), "delimiter", 'T');
        setField(term448, term448.getClass(), "escapeCharacter", term453);
        setElement(term455, 0, "MjGYSRKTNF");
        setElement(term455, 1, "hRNSzYYIrc");
        setElement(term455, 2, "RMFIsYGgne");
        setField(term448, term448.getClass(), "header", term455);
        setElement(term492, 0, "NRdvgJlhkX");
        setElement(term492, 1, "uuaPigETmJ");
        setElement(term492, 2, "MxlszYVzRf");
        setElement(term492, 3, "LQFpaHEwXR");
        setField(term448, term448.getClass(), "headerComments", term492);
        setBooleanField(term448, term448.getClass(), "ignoreEmptyLines", true);
        setBooleanField(term448, term448.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term448, term448.getClass(), "ignoreSurroundingSpaces", true);
        setField(term448, term448.getClass(), "nullString", "oVcInYnLWB");
        setField(term448, term448.getClass(), "quoteCharacter", term556);
        setField(term448, term448.getClass(), "quoteMode", enum77);
        setField(term448, term448.getClass(), "recordSeparator", "aJlieCFVtF");
        setBooleanField(term448, term448.getClass(), "skipHeaderRecord", false);
        setBooleanField(term448, term448.getClass(), "trailingDelimiter", true);
        setBooleanField(term448, term448.getClass(), "trim", false);
        setBooleanField(term448, term448.getClass(), "autoFlush", false);
        term589 = newInstance(Class.forName("java.lang.Object"));
        Character term35575 = new Character('t');
        Character term35576 = new Character('D');
        Character term35595 = new Character('s');
        Class<? extends Object> term35974 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term35973 = ((Class) term35974).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term35973).setAccessible(true);
        Object enum78 = ((Field) term35973).get((Object) null);
        term35574 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term35577 = (Object[]) newArray("java.lang.String", 3);
        Object[] term35584 = (Object[]) newArray("java.lang.String", 4);
        setBooleanField(term35574, term35574.getClass(), "allowMissingColumnNames", false);
        setField(term35574, term35574.getClass(), "commentMarker", term35575);
        setCharField(term35574, term35574.getClass(), "delimiter", 'T');
        setField(term35574, term35574.getClass(), "escapeCharacter", term35576);
        setElement(term35577, 0, "MjGYSRKTNF");
        setElement(term35577, 1, "hRNSzYYIrc");
        setElement(term35577, 2, "RMFIsYGgne");
        setField(term35574, term35574.getClass(), "header", term35577);
        setElement(term35584, 0, "NRdvgJlhkX");
        setElement(term35584, 1, "uuaPigETmJ");
        setElement(term35584, 2, "MxlszYVzRf");
        setElement(term35584, 3, "LQFpaHEwXR");
        setField(term35574, term35574.getClass(), "headerComments", term35584);
        setBooleanField(term35574, term35574.getClass(), "ignoreEmptyLines", true);
        setBooleanField(term35574, term35574.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term35574, term35574.getClass(), "ignoreSurroundingSpaces", true);
        setField(term35574, term35574.getClass(), "nullString", "oVcInYnLWB");
        setField(term35574, term35574.getClass(), "quoteCharacter", term35595);
        setField(term35574, term35574.getClass(), "quoteMode", enum78);
        setField(term35574, term35574.getClass(), "recordSeparator", "aJlieCFVtF");
        setBooleanField(term35574, term35574.getClass(), "skipHeaderRecord", false);
        setBooleanField(term35574, term35574.getClass(), "trailingDelimiter", true);
        setBooleanField(term35574, term35574.getClass(), "trim", false);
        setBooleanField(term35574, term35574.getClass(), "autoFlush", false);
        term35601 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term589;
        Object retValue = callMethod(klass, "equals", argTypes, term448, args);
        assertTrue(recursiveEquals(term448, term35574));
        assertTrue(recursiveEquals(term589, term35601));
        assertTrue(recursiveEquals(retValue, false));
    }

};


