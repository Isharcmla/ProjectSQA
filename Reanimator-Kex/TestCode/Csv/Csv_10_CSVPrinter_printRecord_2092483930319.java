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

public class CSVPrinter_printRecord_2092483930319 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term398778;
     Object term397907;

    public CSVPrinter_printRecord_2092483930319() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term398900 = new Character((char) 512);
        Class<? extends Object> term399604 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term399603 = ((Class) term399604).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term399603).setAccessible(true);
        Object enum283 = ((Field) term399603).get((Object) null);
        term398778 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term398848 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term398778, term398778.getClass(), "newRecord", true);
        setField(term398848, term398848.getClass(), "quoteChar", term398900);
        setCharField(term398848, term398848.getClass(), "delimiter", (char) 1);
        setField(term398848, term398848.getClass(), "quotePolicy", enum283);
        setField(term398778, term398778.getClass(), "format", term398848);
        term397907 = (Object[]) newArray("java.lang.Object", 1);
        Object term399072 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        setElement(term397907, 0, term399072);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term397907;
        try {
            callMethod(klass, "printRecord", argTypes, term398778, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


