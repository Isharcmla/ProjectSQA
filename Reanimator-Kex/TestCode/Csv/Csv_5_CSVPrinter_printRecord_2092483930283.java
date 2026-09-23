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

public class CSVPrinter_printRecord_2092483930283 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term866560;
     Object term865678;

    public CSVPrinter_printRecord_2092483930283() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term866682 = new Character((char) 0);
        Class<? extends Object> term867393 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term867392 = ((Class) term867393).getDeclaredField((String) "ALL");
        ((Field) term867392).setAccessible(true);
        Object enum275 = ((Field) term867392).get((Object) null);
        Character term866834 = new Character((char) 512);
        term866560 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term866630 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term866560, term866560.getClass(), "newRecord", true);
        setField(term866630, term866630.getClass(), "quoteChar", term866682);
        setCharField(term866630, term866630.getClass(), "delimiter", (char) 1024);
        setField(term866630, term866630.getClass(), "quotePolicy", enum275);
        setField(term866630, term866630.getClass(), "escape", term866834);
        setField(term866560, term866560.getClass(), "format", term866630);
        term865678 = (Object[]) newArray("java.lang.Object", 1);
        Object term866910 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter$1"));
        setElement(term865678, 0, term866910);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term865678;
        try {
            callMethod(klass, "printRecord", argTypes, term866560, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


