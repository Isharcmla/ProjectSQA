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

public class CSVPrinter_printRecord_2092483930269 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term312646;
     Object term305709;

    public CSVPrinter_printRecord_2092483930269() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term312768 = new Character((char) 65535);
        Class<? extends Object> term313746 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term313745 = ((Class) term313746).getDeclaredField((String) "MINIMAL");
        ((Field) term313745).setAccessible(true);
        Object enum231 = ((Field) term313745).get((Object) null);
        term312646 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term312716 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term312646, term312646.getClass(), "newRecord", true);
        setField(term312716, term312716.getClass(), "quoteChar", term312768);
        setCharField(term312716, term312716.getClass(), "delimiter", (char) 65535);
        setField(term312716, term312716.getClass(), "quotePolicy", enum231);
        setField(term312646, term312646.getClass(), "format", term312716);
        term305709 = (Object[]) newArray("java.lang.Object", 1);
        Object term312940 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        setElement(term305709, 0, term312940);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term305709;
        try {
            callMethod(klass, "printRecord", argTypes, term312646, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


