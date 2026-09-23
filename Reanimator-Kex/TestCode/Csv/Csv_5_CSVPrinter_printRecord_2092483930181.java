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

public class CSVPrinter_printRecord_2092483930181 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term199601;
     Object term195142;

    public CSVPrinter_printRecord_2092483930181() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term199723 = new Character((char) 61247);
        Class<? extends Object> term200460 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term200459 = ((Class) term200460).getDeclaredField((String) "NONE");
        ((Field) term200459).setAccessible(true);
        Object enum156 = ((Field) term200459).get((Object) null);
        term199601 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term199671 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term199601, term199601.getClass(), "newRecord", true);
        setField(term199671, term199671.getClass(), "quoteChar", term199723);
        setCharField(term199671, term199671.getClass(), "delimiter", (char) 61439);
        setField(term199671, term199671.getClass(), "quotePolicy", enum156);
        setField(term199601, term199601.getClass(), "format", term199671);
        term195142 = (Object[]) newArray("java.lang.Object", 11);
        Object term199899 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter$1"));
        setElement(term195142, 0, term199899);
        setElement(term195142, 4, "NON_NUMERIC");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term195142;
        try {
            callMethod(klass, "printRecord", argTypes, term199601, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


