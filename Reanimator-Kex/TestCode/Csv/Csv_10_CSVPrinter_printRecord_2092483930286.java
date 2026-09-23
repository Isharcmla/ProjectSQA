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

public class CSVPrinter_printRecord_2092483930286 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term337827;
     Object term334978;

    public CSVPrinter_printRecord_2092483930286() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term337949 = new Character((char) 8192);
        Class<? extends Object> term339621 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term339620 = ((Class) term339621).getDeclaredField((String) "MINIMAL");
        ((Field) term339620).setAccessible(true);
        Object enum247 = ((Field) term339620).get((Object) null);
        term337827 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term337897 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term337827, term337827.getClass(), "newRecord", true);
        setField(term337897, term337897.getClass(), "quoteChar", term337949);
        setCharField(term337897, term337897.getClass(), "delimiter", (char) 8);
        setField(term337897, term337897.getClass(), "quotePolicy", enum247);
        setField(term337827, term337827.getClass(), "format", term337897);
        term334978 = (Object[]) newArray("java.lang.Object", 2);
        Object term338121 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term338159 = newInstance(Class.forName("java.lang.Object"));
        setElement(term334978, 0, term338121);
        setElement(term334978, 1, term338159);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term334978;
        try {
            callMethod(klass, "printRecord", argTypes, term337827, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


