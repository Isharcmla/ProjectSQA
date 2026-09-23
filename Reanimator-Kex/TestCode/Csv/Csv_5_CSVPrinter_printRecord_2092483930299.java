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

public class CSVPrinter_printRecord_2092483930299 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term896605;
     Object term895869;

    public CSVPrinter_printRecord_2092483930299() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term896727 = new Character((char) 8);
        Class<? extends Object> term897374 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term897373 = ((Class) term897374).getDeclaredField((String) "ALL");
        ((Field) term897373).setAccessible(true);
        Object enum291 = ((Field) term897373).get((Object) null);
        term896605 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term896675 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term896605, term896605.getClass(), "newRecord", true);
        setField(term896675, term896675.getClass(), "quoteChar", term896727);
        setCharField(term896675, term896675.getClass(), "delimiter", (char) 57327);
        setField(term896675, term896675.getClass(), "quotePolicy", enum291);
        setField(term896605, term896605.getClass(), "format", term896675);
        term895869 = (Object[]) newArray("java.lang.Object", 1);
        Object term896899 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        setElement(term895869, 0, term896899);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term895869;
        try {
            callMethod(klass, "printRecord", argTypes, term896605, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


