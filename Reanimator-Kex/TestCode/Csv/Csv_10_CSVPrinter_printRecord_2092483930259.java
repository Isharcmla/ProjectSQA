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

public class CSVPrinter_printRecord_2092483930259 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term295496;
     Object term294983;

    public CSVPrinter_printRecord_2092483930259() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term295618 = new Character((char) 1024);
        Class<? extends Object> term296325 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term296324 = ((Class) term296325).getDeclaredField((String) "NONE");
        ((Field) term296324).setAccessible(true);
        Object enum219 = ((Field) term296324).get((Object) null);
        term295496 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term295566 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term295496, term295496.getClass(), "newRecord", true);
        setField(term295566, term295566.getClass(), "quoteChar", term295618);
        setCharField(term295566, term295566.getClass(), "delimiter", (char) 1);
        setField(term295566, term295566.getClass(), "quotePolicy", enum219);
        setField(term295496, term295496.getClass(), "format", term295566);
        term294983 = (Object[]) newArray("java.lang.Object", 2);
        Object term295790 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        setElement(term294983, 0, term295790);
        setElement(term294983, 1, "NONE");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term294983;
        try {
            callMethod(klass, "printRecord", argTypes, term295496, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


