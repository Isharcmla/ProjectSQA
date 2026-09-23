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

public class CSVPrinter_printRecord_2092483930127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100097;
     Object term96690;

    public CSVPrinter_printRecord_2092483930127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term100219 = new Character((char) 8364);
        Class<? extends Object> term100907 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term100906 = ((Class) term100907).getDeclaredField((String) "NONE");
        ((Field) term100906).setAccessible(true);
        Object enum98 = ((Field) term100906).get((Object) null);
        term100097 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term100167 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term100097, term100097.getClass(), "newRecord", true);
        setField(term100167, term100167.getClass(), "quoteChar", term100219);
        setCharField(term100167, term100167.getClass(), "delimiter", (char) 41587);
        setField(term100167, term100167.getClass(), "quotePolicy", enum98);
        setField(term100097, term100097.getClass(), "format", term100167);
        term96690 = (Object[]) newArray("java.lang.Object", 1);
        Object term100395 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter$1"));
        setElement(term96690, 0, term100395);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term96690;
        try {
            callMethod(klass, "printRecord", argTypes, term100097, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


