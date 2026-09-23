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

public class CSVPrinter_printRecord_2092483930135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term120403;
     Object term119828;

    public CSVPrinter_printRecord_2092483930135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term120525 = new Character((char) 4096);
        Class<? extends Object> term121233 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term121232 = ((Class) term121233).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term121232).setAccessible(true);
        Object enum108 = ((Field) term121232).get((Object) null);
        term120403 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term120473 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term120403, term120403.getClass(), "newRecord", true);
        setField(term120473, term120473.getClass(), "quoteChar", term120525);
        setCharField(term120473, term120473.getClass(), "delimiter", (char) 16);
        setField(term120473, term120473.getClass(), "quotePolicy", enum108);
        setField(term120403, term120403.getClass(), "format", term120473);
        term119828 = (Object[]) newArray("java.lang.Object", 1);
        Object term120701 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter$1"));
        setElement(term119828, 0, term120701);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term119828;
        try {
            callMethod(klass, "printRecord", argTypes, term120403, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


