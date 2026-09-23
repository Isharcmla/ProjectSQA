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

public class CSVPrinter_printRecord_2092483930101 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52943;
     Object term52592;

    public CSVPrinter_printRecord_2092483930101() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term53065 = new Character((char) 0);
        Class<? extends Object> term53714 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term53713 = ((Class) term53714).getDeclaredField((String) "ALL");
        ((Field) term53713).setAccessible(true);
        Object enum72 = ((Field) term53713).get((Object) null);
        term52943 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term53013 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term52943, term52943.getClass(), "newRecord", true);
        setField(term53013, term53013.getClass(), "quoteChar", term53065);
        setCharField(term53013, term53013.getClass(), "delimiter", (char) 0);
        setField(term53013, term53013.getClass(), "quotePolicy", enum72);
        setField(term52943, term52943.getClass(), "format", term53013);
        term52592 = (Object[]) newArray("java.lang.Object", 1);
        Object term53241 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter$1"));
        setElement(term52592, 0, term53241);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term52592;
        try {
            callMethod(klass, "printRecord", argTypes, term52943, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


