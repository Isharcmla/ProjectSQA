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

public class CSVPrinter_printRecord_2092483930381 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1056168;
     Object term1054790;

    public CSVPrinter_printRecord_2092483930381() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term1056290 = new Character((char) 31707);
        Class<? extends Object> term1056975 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term1056974 = ((Class) term1056975).getDeclaredField((String) "ALL");
        ((Field) term1056974).setAccessible(true);
        Object enum374 = ((Field) term1056974).get((Object) null);
        term1056168 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term1056238 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term1056168, term1056168.getClass(), "newRecord", true);
        setField(term1056238, term1056238.getClass(), "quoteChar", term1056290);
        setCharField(term1056238, term1056238.getClass(), "delimiter", (char) 1024);
        setField(term1056238, term1056238.getClass(), "quotePolicy", enum374);
        setField(term1056168, term1056168.getClass(), "format", term1056238);
        term1054790 = (Object[]) newArray("java.lang.Object", 2);
        Object term1056462 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term1056500 = newInstance(Class.forName("java.lang.Object"));
        setElement(term1054790, 0, term1056462);
        setElement(term1054790, 1, term1056500);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term1054790;
        try {
            callMethod(klass, "printRecord", argTypes, term1056168, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


