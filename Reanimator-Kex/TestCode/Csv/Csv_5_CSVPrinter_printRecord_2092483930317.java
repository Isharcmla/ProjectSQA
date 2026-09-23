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

public class CSVPrinter_printRecord_2092483930317 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term926283;
     Object term926003;

    public CSVPrinter_printRecord_2092483930317() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term926405 = new Character((char) 2);
        Class<? extends Object> term927302 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term927301 = ((Class) term927302).getDeclaredField((String) "MINIMAL");
        ((Field) term927301).setAccessible(true);
        Object enum309 = ((Field) term927301).get((Object) null);
        term926283 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term926353 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term926283, term926283.getClass(), "newRecord", true);
        setField(term926353, term926353.getClass(), "quoteChar", term926405);
        setCharField(term926353, term926353.getClass(), "delimiter", (char) 2048);
        setField(term926353, term926353.getClass(), "quotePolicy", enum309);
        setField(term926283, term926283.getClass(), "format", term926353);
        term926003 = (Object[]) newArray("java.lang.Object", 1);
        Object term926577 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        setElement(term926003, 0, term926577);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term926003;
        try {
            callMethod(klass, "printRecord", argTypes, term926283, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


