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

public class CSVPrinter_printRecord_2092483930170 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term171449;
     Object term166342;

    public CSVPrinter_printRecord_2092483930170() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term171571 = new Character((char) 32768);
        Class<? extends Object> term173038 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term173037 = ((Class) term173038).getDeclaredField((String) "MINIMAL");
        ((Field) term173037).setAccessible(true);
        Object enum147 = ((Field) term173037).get((Object) null);
        term171449 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term171519 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term171449, term171449.getClass(), "newRecord", true);
        setField(term171519, term171519.getClass(), "quoteChar", term171571);
        setCharField(term171519, term171519.getClass(), "delimiter", (char) 1);
        setField(term171519, term171519.getClass(), "quotePolicy", enum147);
        setField(term171449, term171449.getClass(), "format", term171519);
        Class<? extends Object> term173217 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term173216 = ((Class) term173217).getDeclaredField((String) "ALL");
        ((Field) term173216).setAccessible(true);
        Object enum148 = ((Field) term173216).get((Object) null);
        term166342 = (Object[]) newArray("java.lang.Object", 4);
        Object term171747 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter$1"));
        Object term171923 = newInstance(Class.forName("java.lang.Object"));
        setElement(term166342, 0, term171747);
        setElement(term166342, 1, "NON_NUMERIC");
        setElement(term166342, 2, enum148);
        setElement(term166342, 3, term171923);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term166342;
        try {
            callMethod(klass, "printRecord", argTypes, term171449, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


