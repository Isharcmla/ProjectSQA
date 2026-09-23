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

public class CSVPrinter_printRecord_2092483930211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term210757;
     Object term209276;

    public CSVPrinter_printRecord_2092483930211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term210879 = new Character((char) 48383);
        Class<? extends Object> term211526 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term211525 = ((Class) term211526).getDeclaredField((String) "ALL");
        ((Field) term211525).setAccessible(true);
        Object enum173 = ((Field) term211525).get((Object) null);
        term210757 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term210827 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term210757, term210757.getClass(), "newRecord", true);
        setField(term210827, term210827.getClass(), "quoteChar", term210879);
        setCharField(term210827, term210827.getClass(), "delimiter", (char) 64635);
        setField(term210827, term210827.getClass(), "quotePolicy", enum173);
        setField(term210757, term210757.getClass(), "format", term210827);
        term209276 = (Object[]) newArray("java.lang.Object", 1);
        Object term211051 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        setElement(term209276, 0, term211051);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term209276;
        try {
            callMethod(klass, "printRecord", argTypes, term210757, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


