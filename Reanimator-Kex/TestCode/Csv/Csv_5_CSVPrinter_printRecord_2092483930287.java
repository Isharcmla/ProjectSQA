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

public class CSVPrinter_printRecord_2092483930287 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term879405;
     Object term875960;

    public CSVPrinter_printRecord_2092483930287() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term879527 = new Character((char) 32768);
        Class<? extends Object> term880424 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term880423 = ((Class) term880424).getDeclaredField((String) "MINIMAL");
        ((Field) term880423).setAccessible(true);
        Object enum279 = ((Field) term880423).get((Object) null);
        term879405 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term879475 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term879405, term879405.getClass(), "newRecord", true);
        setField(term879475, term879475.getClass(), "quoteChar", term879527);
        setCharField(term879475, term879475.getClass(), "delimiter", (char) 16);
        setField(term879475, term879475.getClass(), "quotePolicy", enum279);
        setField(term879405, term879405.getClass(), "format", term879475);
        term875960 = (Object[]) newArray("java.lang.Object", 1);
        Object term879699 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        setElement(term875960, 0, term879699);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term875960;
        try {
            callMethod(klass, "printRecord", argTypes, term879405, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


