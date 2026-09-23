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
import java.nio.ReadOnlyBufferException;
import static org.apache.commons.csv.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class CSVPrinter_println_109110020033 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19150;

    public CSVPrinter_println_109110020033() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19150 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term19220 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object term19318 = newInstance(Class.forName("java.nio.DirectCharBufferRS"));
        setField(term19220, term19220.getClass(), "recordSeparator", "");
        setField(term19150, term19150.getClass(), "format", term19220);
        setField(term19150, term19150.getClass(), "out", term19318);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "println", argTypes, term19150, args);
            assertTrue(false);
        }
        catch (ReadOnlyBufferException e) {
        }

    }

};


