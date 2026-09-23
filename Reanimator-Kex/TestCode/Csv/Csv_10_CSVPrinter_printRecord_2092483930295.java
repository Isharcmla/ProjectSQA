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

public class CSVPrinter_printRecord_2092483930295 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term349091;
     Object term348731;

    public CSVPrinter_printRecord_2092483930295() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term349213 = new Character((char) 0);
        Class<? extends Object> term349860 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term349859 = ((Class) term349860).getDeclaredField((String) "ALL");
        ((Field) term349859).setAccessible(true);
        Object enum255 = ((Field) term349859).get((Object) null);
        term349091 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term349161 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term349091, term349091.getClass(), "newRecord", true);
        setField(term349161, term349161.getClass(), "quoteChar", term349213);
        setCharField(term349161, term349161.getClass(), "delimiter", (char) 0);
        setField(term349161, term349161.getClass(), "quotePolicy", enum255);
        setField(term349091, term349091.getClass(), "format", term349161);
        term348731 = (Object[]) newArray("java.lang.Object", 1);
        Object term349385 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        setElement(term348731, 0, term349385);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term348731;
        try {
            callMethod(klass, "printRecord", argTypes, term349091, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


