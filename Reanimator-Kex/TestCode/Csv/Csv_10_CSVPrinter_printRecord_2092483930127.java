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
     Object term73298;
     Object term72053;

    public CSVPrinter_printRecord_2092483930127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term73420 = new Character((char) 2);
        Class<? extends Object> term74104 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term74103 = ((Class) term74104).getDeclaredField((String) "NONE");
        ((Field) term74103).setAccessible(true);
        Object enum90 = ((Field) term74103).get((Object) null);
        term73298 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term73368 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term73298, term73298.getClass(), "newRecord", true);
        setField(term73368, term73368.getClass(), "quoteChar", term73420);
        setCharField(term73368, term73368.getClass(), "delimiter", (char) 256);
        setField(term73368, term73368.getClass(), "quotePolicy", enum90);
        setField(term73298, term73298.getClass(), "format", term73368);
        term72053 = (Object[]) newArray("java.lang.Object", 1);
        Object term73592 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        setElement(term72053, 0, term73592);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term72053;
        try {
            callMethod(klass, "printRecord", argTypes, term73298, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


