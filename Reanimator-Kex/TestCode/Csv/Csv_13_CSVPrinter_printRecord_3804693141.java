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

public class CSVPrinter_printRecord_3804693141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22243;
     Object term22309;

    public CSVPrinter_printRecord_3804693141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22243 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        term22309 = newInstance(Class.forName("java.util.WeakHashMap$EntrySet"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Iterable");
        Object[] args = new Object[1];
        args[0] = term22309;
        try {
            callMethod(klass, "printRecord", argTypes, term22243, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


