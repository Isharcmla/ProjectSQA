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
     Object term104091;
     Object term101061;

    public CSVPrinter_printRecord_2092483930149() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term104213 = new Character((char) 2);
        Class<? extends Object> term104860 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term104859 = ((Class) term104860).getDeclaredField((String) "ALL");
        ((Field) term104859).setAccessible(true);
        Object enum112 = ((Field) term104859).get((Object) null);
        term104091 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term104161 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term104091, term104091.getClass(), "newRecord", true);
        setField(term104161, term104161.getClass(), "quoteChar", term104213);
        setCharField(term104161, term104161.getClass(), "delimiter", (char) 64);
        setField(term104161, term104161.getClass(), "quotePolicy", enum112);
        setField(term104091, term104091.getClass(), "format", term104161);
        term101061 = (Object[]) newArray("java.lang.Object", 1);
        Object term104385 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        setElement(term101061, 0, term104385);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term101061;
        try {
            callMethod(klass, "printRecord", argTypes, term104091, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


