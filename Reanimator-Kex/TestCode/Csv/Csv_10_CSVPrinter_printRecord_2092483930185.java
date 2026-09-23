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

public class CSVPrinter_printRecord_2092483930185 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term152378;
     Object term150333;

    public CSVPrinter_printRecord_2092483930185() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term152500 = new Character((char) 49132);
        Class<? extends Object> term153197 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term153196 = ((Class) term153197).getDeclaredField((String) "ALL");
        ((Field) term153196).setAccessible(true);
        Object enum147 = ((Field) term153196).get((Object) null);
        term152378 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term152448 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term152378, term152378.getClass(), "newRecord", true);
        setField(term152448, term152448.getClass(), "quoteChar", term152500);
        setCharField(term152448, term152448.getClass(), "delimiter", (char) 16402);
        setField(term152448, term152448.getClass(), "quotePolicy", enum147);
        setField(term152378, term152378.getClass(), "format", term152448);
        term150333 = (Object[]) newArray("java.lang.Object", 2);
        Object term152672 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        setElement(term150333, 0, term152672);
        setElement(term150333, 1, enum147);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term150333;
        try {
            callMethod(klass, "printRecord", argTypes, term152378, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


