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

public class CSVPrinter_printRecord_2092483930130 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term101329;
     Object term101077;

    public CSVPrinter_printRecord_2092483930130() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term101451 = new Character((char) 0);
        Class<? extends Object> term113043 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term113042 = ((Class) term113043).getDeclaredField((String) "ALL");
        ((Field) term113042).setAccessible(true);
        Object enum101 = ((Field) term113042).get((Object) null);
        term101329 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term101399 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term101329, term101329.getClass(), "newRecord", true);
        setField(term101399, term101399.getClass(), "quoteChar", term101451);
        setCharField(term101399, term101399.getClass(), "delimiter", (char) 0);
        setField(term101399, term101399.getClass(), "quotePolicy", enum101);
        setField(term101329, term101329.getClass(), "format", term101399);
        term101077 = (Object[]) newArray("java.lang.Object", 2);
        Object term101627 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter$1"));
        Object term101665 = newInstance(Class.forName("java.lang.Object"));
        setElement(term101077, 0, term101627);
        setElement(term101077, 1, term101665);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term101077;
        try {
            callMethod(klass, "printRecord", argTypes, term101329, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


