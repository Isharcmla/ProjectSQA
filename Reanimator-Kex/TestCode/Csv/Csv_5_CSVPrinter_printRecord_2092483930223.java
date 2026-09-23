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

public class CSVPrinter_printRecord_2092483930223 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term313203;
     Object term307291;

    public CSVPrinter_printRecord_2092483930223() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term313325 = new Character((char) 32768);
        Class<? extends Object> term313976 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term313975 = ((Class) term313976).getDeclaredField((String) "ALL");
        ((Field) term313975).setAccessible(true);
        Object enum202 = ((Field) term313975).get((Object) null);
        term313203 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term313273 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term313203, term313203.getClass(), "newRecord", true);
        setField(term313273, term313273.getClass(), "quoteChar", term313325);
        setCharField(term313273, term313273.getClass(), "delimiter", (char) 16384);
        setField(term313273, term313273.getClass(), "quotePolicy", enum202);
        setField(term313203, term313203.getClass(), "format", term313273);
        term307291 = (Object[]) newArray("java.lang.Object", 1);
        Object term313501 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter$1"));
        setElement(term307291, 0, term313501);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term307291;
        try {
            callMethod(klass, "printRecord", argTypes, term313203, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


