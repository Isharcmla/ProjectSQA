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

public class CSVPrinter_print_165247380319 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1730;
     Object term1882;

    public CSVPrinter_print_165247380319() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term1733 = new Character('R');
        Class<? extends Object> term10438 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term10437 = ((Class) term10438).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term10437).setAccessible(true);
        Object enum22 = ((Field) term10437).get((Object) null);
        Character term1750 = new Character('r');
        Character term1752 = new Character('b');
        term1730 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term1731 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term1781 = (Object[]) newArray("java.lang.String", 7);
        Object[] term1866 = (Object[]) newArray("java.lang.String", 1);
        setField(term1730, term1730.getClass(), "out", null);
        setCharField(term1731, term1731.getClass(), "delimiter", 't');
        setField(term1731, term1731.getClass(), "quoteCharacter", term1733);
        setField(term1731, term1731.getClass(), "quoteMode", enum22);
        setField(term1731, term1731.getClass(), "commentMarker", term1750);
        setField(term1731, term1731.getClass(), "escapeCharacter", term1752);
        setBooleanField(term1731, term1731.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term1731, term1731.getClass(), "allowMissingColumnNames", true);
        setBooleanField(term1731, term1731.getClass(), "ignoreEmptyLines", false);
        setField(term1731, term1731.getClass(), "recordSeparator", "aKnKipADSo");
        setField(term1731, term1731.getClass(), "nullString", "wSQxaModmm");
        setElement(term1781, 0, "UlajhuVLaP");
        setElement(term1781, 1, "gGSMzuGICf");
        setElement(term1781, 2, "hxCBltsObl");
        setElement(term1781, 3, "BndsHwAFMv");
        setElement(term1781, 4, "GzFkzHGYFt");
        setElement(term1781, 5, "tShwQLRGNe");
        setElement(term1781, 6, "LvtrsXUliU");
        setField(term1731, term1731.getClass(), "header", term1781);
        setElement(term1866, 0, "xLbjWUgOIL");
        setField(term1731, term1731.getClass(), "headerComments", term1866);
        setBooleanField(term1731, term1731.getClass(), "skipHeaderRecord", false);
        setBooleanField(term1731, term1731.getClass(), "ignoreHeaderCase", false);
        setField(term1730, term1730.getClass(), "format", term1731);
        setBooleanField(term1730, term1730.getClass(), "newRecord", true);
        term1882 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term1882;
        try {
            callMethod(klass, "print", argTypes, term1730, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


