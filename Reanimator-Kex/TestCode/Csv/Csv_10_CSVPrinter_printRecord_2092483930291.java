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

public class CSVPrinter_printRecord_2092483930291 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term344287;
     Object term341848;

    public CSVPrinter_printRecord_2092483930291() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term344409 = new Character((char) 64904);
        Class<? extends Object> term345056 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term345055 = ((Class) term345056).getDeclaredField((String) "ALL");
        ((Field) term345055).setAccessible(true);
        Object enum251 = ((Field) term345055).get((Object) null);
        term344287 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term344357 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term344287, term344287.getClass(), "newRecord", true);
        setField(term344357, term344357.getClass(), "quoteChar", term344409);
        setCharField(term344357, term344357.getClass(), "delimiter", (char) 628);
        setField(term344357, term344357.getClass(), "quotePolicy", enum251);
        setField(term344287, term344287.getClass(), "format", term344357);
        term341848 = (Object[]) newArray("java.lang.Object", 1);
        Object term344581 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        setElement(term341848, 0, term344581);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term341848;
        try {
            callMethod(klass, "printRecord", argTypes, term344287, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


