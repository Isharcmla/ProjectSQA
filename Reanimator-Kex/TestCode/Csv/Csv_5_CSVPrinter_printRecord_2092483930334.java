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

public class CSVPrinter_printRecord_2092483930334 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term970632;
     Object term960639;

    public CSVPrinter_printRecord_2092483930334() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term970754 = new Character((char) 0);
        Class<? extends Object> term971859 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term971858 = ((Class) term971859).getDeclaredField((String) "MINIMAL");
        ((Field) term971858).setAccessible(true);
        Object enum325 = ((Field) term971858).get((Object) null);
        Character term970906 = new Character((char) 63999);
        term970632 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term970702 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term970632, term970632.getClass(), "newRecord", true);
        setField(term970702, term970702.getClass(), "quoteChar", term970754);
        setCharField(term970702, term970702.getClass(), "delimiter", (char) 1024);
        setField(term970702, term970702.getClass(), "quotePolicy", enum325);
        setField(term970702, term970702.getClass(), "escape", term970906);
        setField(term970632, term970632.getClass(), "format", term970702);
        term960639 = (Object[]) newArray("java.lang.Object", 1);
        Object term970982 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter$1"));
        setElement(term960639, 0, term970982);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term960639;
        try {
            callMethod(klass, "printRecord", argTypes, term970632, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


