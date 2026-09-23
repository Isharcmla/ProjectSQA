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

public class CSVPrinter_printRecord_2092483930325 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term943730;
     Object term942831;

    public CSVPrinter_printRecord_2092483930325() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term943852 = new Character((char) 0);
        Class<? extends Object> term944563 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term944562 = ((Class) term944563).getDeclaredField((String) "ALL");
        ((Field) term944562).setAccessible(true);
        Object enum317 = ((Field) term944562).get((Object) null);
        Character term944004 = new Character((char) 61438);
        term943730 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term943800 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term943730, term943730.getClass(), "newRecord", true);
        setField(term943800, term943800.getClass(), "quoteChar", term943852);
        setCharField(term943800, term943800.getClass(), "delimiter", (char) 4096);
        setField(term943800, term943800.getClass(), "quotePolicy", enum317);
        setField(term943800, term943800.getClass(), "escape", term944004);
        setField(term943730, term943730.getClass(), "format", term943800);
        term942831 = (Object[]) newArray("java.lang.Object", 1);
        Object term944080 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter$1"));
        setElement(term942831, 0, term944080);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term942831;
        try {
            callMethod(klass, "printRecord", argTypes, term943730, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


