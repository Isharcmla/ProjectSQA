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

public class CSVPrinter_printRecord_2092483930303 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term362787;
     Object term359521;

    public CSVPrinter_printRecord_2092483930303() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term362909 = new Character((char) 2048);
        Class<? extends Object> term363556 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term363555 = ((Class) term363556).getDeclaredField((String) "ALL");
        ((Field) term363555).setAccessible(true);
        Object enum267 = ((Field) term363555).get((Object) null);
        term362787 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term362857 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term362787, term362787.getClass(), "newRecord", true);
        setField(term362857, term362857.getClass(), "quoteChar", term362909);
        setCharField(term362857, term362857.getClass(), "delimiter", (char) 128);
        setField(term362857, term362857.getClass(), "quotePolicy", enum267);
        setField(term362787, term362787.getClass(), "format", term362857);
        term359521 = (Object[]) newArray("java.lang.Object", 1);
        Object term363081 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        setElement(term359521, 0, term363081);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term359521;
        try {
            callMethod(klass, "printRecord", argTypes, term362787, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


