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

public class CSVPrinter_printRecord_2092483930221 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term217004;
     Object term216387;

    public CSVPrinter_printRecord_2092483930221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term217126 = new Character((char) 1);
        Class<? extends Object> term217810 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term217809 = ((Class) term217810).getDeclaredField((String) "NONE");
        ((Field) term217809).setAccessible(true);
        Object enum181 = ((Field) term217809).get((Object) null);
        term217004 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term217074 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term217004, term217004.getClass(), "newRecord", true);
        setField(term217074, term217074.getClass(), "quoteChar", term217126);
        setCharField(term217074, term217074.getClass(), "delimiter", (char) 64);
        setField(term217074, term217074.getClass(), "quotePolicy", enum181);
        setField(term217004, term217004.getClass(), "format", term217074);
        term216387 = (Object[]) newArray("java.lang.Object", 1);
        Object term217298 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        setElement(term216387, 0, term217298);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term216387;
        try {
            callMethod(klass, "printRecord", argTypes, term217004, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


