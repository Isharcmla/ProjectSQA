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

public class CSVPrinter_printRecord_2092483930149 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term137409;
     Object term134368;

    public CSVPrinter_printRecord_2092483930149() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term137531 = new Character((char) 32768);
        Class<? extends Object> term138182 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term138181 = ((Class) term138182).getDeclaredField((String) "ALL");
        ((Field) term138181).setAccessible(true);
        Object enum124 = ((Field) term138181).get((Object) null);
        term137409 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term137479 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term137409, term137409.getClass(), "newRecord", true);
        setField(term137479, term137479.getClass(), "quoteChar", term137531);
        setCharField(term137479, term137479.getClass(), "delimiter", (char) 8);
        setField(term137479, term137479.getClass(), "quotePolicy", enum124);
        setField(term137409, term137409.getClass(), "format", term137479);
        term134368 = (Object[]) newArray("java.lang.Object", 1);
        Object term137707 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter$1"));
        setElement(term134368, 0, term137707);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term134368;
        try {
            callMethod(klass, "printRecord", argTypes, term137409, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


