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

public class CSVPrinter_printRecord_2092483930179 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term142058;
     Object term136691;

    public CSVPrinter_printRecord_2092483930179() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term142180 = new Character((char) 63036);
        Class<? extends Object> term142902 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term142901 = ((Class) term142902).getDeclaredField((String) "NONE");
        ((Field) term142901).setAccessible(true);
        Object enum141 = ((Field) term142901).get((Object) null);
        term142058 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term142128 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term142058, term142058.getClass(), "newRecord", true);
        setField(term142128, term142128.getClass(), "quoteChar", term142180);
        setCharField(term142128, term142128.getClass(), "delimiter", (char) 2496);
        setField(term142128, term142128.getClass(), "quotePolicy", enum141);
        setField(term142058, term142058.getClass(), "format", term142128);
        term136691 = (Object[]) newArray("java.lang.Object", 2);
        Object term142352 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term142390 = newInstance(Class.forName("java.lang.Object"));
        setElement(term136691, 0, term142352);
        setElement(term136691, 1, term142390);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term136691;
        try {
            callMethod(klass, "printRecord", argTypes, term142058, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


