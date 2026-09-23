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
import java.nio.BufferOverflowException;
import static org.apache.commons.csv.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class CSVPrinter_print_45574977435 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15125;

    public CSVPrinter_print_45574977435() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15125 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term15183 = newInstance(Class.forName("java.nio.DirectCharBufferS"));
        Object term15253 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term15125, term15125.getClass(), "newRecord", false);
        setField(term15125, term15125.getClass(), "out", term15183);
        setCharField(term15253, term15253.getClass(), "delimiter", (char) 0);
        setField(term15125, term15125.getClass(), "format", term15253);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.CharSequence");
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = null;
        args[2] = 0;
        args[3] = 0;
        try {
            callMethod(klass, "print", argTypes, term15125, args);
            assertTrue(false);
        }
        catch (BufferOverflowException e) {
        }

    }

};


