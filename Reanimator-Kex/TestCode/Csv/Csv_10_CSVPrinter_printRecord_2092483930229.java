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

public class CSVPrinter_printRecord_2092483930229 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term239966;
     Object term238667;

    public CSVPrinter_printRecord_2092483930229() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term240088 = new Character((char) 30719);
        Class<? extends Object> term240985 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term240984 = ((Class) term240985).getDeclaredField((String) "MINIMAL");
        ((Field) term240984).setAccessible(true);
        Object enum189 = ((Field) term240984).get((Object) null);
        term239966 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term240036 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term239966, term239966.getClass(), "newRecord", true);
        setField(term240036, term240036.getClass(), "quoteChar", term240088);
        setCharField(term240036, term240036.getClass(), "delimiter", (char) 49135);
        setField(term240036, term240036.getClass(), "quotePolicy", enum189);
        setField(term239966, term239966.getClass(), "format", term240036);
        term238667 = (Object[]) newArray("java.lang.Object", 1);
        Object term240260 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        setElement(term238667, 0, term240260);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term238667;
        try {
            callMethod(klass, "printRecord", argTypes, term239966, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


