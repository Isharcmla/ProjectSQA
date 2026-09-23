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

public class CSVPrinter_printRecord_2092483930195 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term185544;
     Object term183756;

    public CSVPrinter_printRecord_2092483930195() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term185666 = new Character((char) 56767);
        Class<? extends Object> term186355 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term186354 = ((Class) term186355).getDeclaredField((String) "ALL");
        ((Field) term186354).setAccessible(true);
        Object enum157 = ((Field) term186354).get((Object) null);
        term185544 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term185614 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term185544, term185544.getClass(), "newRecord", true);
        setField(term185614, term185614.getClass(), "quoteChar", term185666);
        setCharField(term185614, term185614.getClass(), "delimiter", (char) 52639);
        setField(term185614, term185614.getClass(), "quotePolicy", enum157);
        setField(term185544, term185544.getClass(), "format", term185614);
        term183756 = (Object[]) newArray("java.lang.Object", 2);
        Object term185838 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        setElement(term183756, 0, term185838);
        setElement(term183756, 1, "NONE");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term183756;
        try {
            callMethod(klass, "printRecord", argTypes, term185544, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


