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

public class CSVPrinter_printRecord_2092483930207 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term203726;
     Object term200464;

    public CSVPrinter_printRecord_2092483930207() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term203848 = new Character((char) 8192);
        Class<? extends Object> term204783 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term204782 = ((Class) term204783).getDeclaredField((String) "MINIMAL");
        ((Field) term204782).setAccessible(true);
        Object enum169 = ((Field) term204782).get((Object) null);
        term203726 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term203796 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term203726, term203726.getClass(), "newRecord", true);
        setField(term203796, term203796.getClass(), "quoteChar", term203848);
        setCharField(term203796, term203796.getClass(), "delimiter", (char) 256);
        setField(term203796, term203796.getClass(), "quotePolicy", enum169);
        setField(term203726, term203726.getClass(), "format", term203796);
        term200464 = (Object[]) newArray("java.lang.Object", 2);
        Object term204020 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term204058 = newInstance(Class.forName("java.lang.Object"));
        setElement(term200464, 0, term204020);
        setElement(term200464, 1, term204058);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term200464;
        try {
            callMethod(klass, "printRecord", argTypes, term203726, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


