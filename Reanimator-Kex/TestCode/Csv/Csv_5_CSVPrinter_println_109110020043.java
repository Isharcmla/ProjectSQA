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

public class CSVPrinter_println_109110020043 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16220;

    public CSVPrinter_println_109110020043() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16220 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term16290 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object term16330 = newInstance(Class.forName("java.io.Console$3"));
        setField(term16290, term16290.getClass(), "recordSeparator", null);
        setField(term16220, term16220.getClass(), "format", term16290);
        setField(term16220, term16220.getClass(), "out", term16330);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "println", argTypes, term16220, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


