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

public class CSVPrinter_printRecord_2092483930357 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1012861;
     Object term1008147;

    public CSVPrinter_printRecord_2092483930357() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term1012983 = new Character((char) 8);
        Class<? extends Object> term1013918 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term1013917 = ((Class) term1013918).getDeclaredField((String) "MINIMAL");
        ((Field) term1013917).setAccessible(true);
        Object enum349 = ((Field) term1013917).get((Object) null);
        term1012861 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term1012931 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term1012861, term1012861.getClass(), "newRecord", true);
        setField(term1012931, term1012931.getClass(), "quoteChar", term1012983);
        setCharField(term1012931, term1012931.getClass(), "delimiter", (char) 16384);
        setField(term1012931, term1012931.getClass(), "quotePolicy", enum349);
        setField(term1012861, term1012861.getClass(), "format", term1012931);
        term1008147 = (Object[]) newArray("java.lang.Object", 2);
        Object term1013155 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term1013193 = newInstance(Class.forName("java.lang.Object"));
        setElement(term1008147, 0, term1013155);
        setElement(term1008147, 1, term1013193);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term1008147;
        try {
            callMethod(klass, "printRecord", argTypes, term1012861, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


