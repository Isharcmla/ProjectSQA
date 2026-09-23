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

public class CSVPrinter_printRecord_2092483930343 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term983807;
     Object term982562;

    public CSVPrinter_printRecord_2092483930343() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term983929 = new Character((char) 2);
        Class<? extends Object> term984613 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term984612 = ((Class) term984613).getDeclaredField((String) "NONE");
        ((Field) term984612).setAccessible(true);
        Object enum333 = ((Field) term984612).get((Object) null);
        term983807 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term983877 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term983807, term983807.getClass(), "newRecord", true);
        setField(term983877, term983877.getClass(), "quoteChar", term983929);
        setCharField(term983877, term983877.getClass(), "delimiter", (char) 256);
        setField(term983877, term983877.getClass(), "quotePolicy", enum333);
        setField(term983807, term983807.getClass(), "format", term983877);
        term982562 = (Object[]) newArray("java.lang.Object", 1);
        Object term984101 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        setElement(term982562, 0, term984101);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term982562;
        try {
            callMethod(klass, "printRecord", argTypes, term983807, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


