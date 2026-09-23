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
import static org.apache.commons.csv.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.csv.EqualityUtils.*;
import java.lang.Object;

public class CSVPrinter_flush_212697881371 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29047;
     Object term29866;

    public CSVPrinter_flush_212697881371() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29047 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term29091 = newInstance(Class.forName("java.io.PrintStream"));
        setField(term29047, term29047.getClass(), "out", term29091);
        term29866 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term29867 = newInstance(Class.forName("java.io.PrintStream"));
        setBooleanField(term29867, term29867.getClass(), "autoFlush", false);
        setBooleanField(term29867, term29867.getClass(), "trouble", true);
        setField(term29867, term29867.getClass(), "formatter", null);
        setField(term29867, term29867.getClass(), "textOut", null);
        setField(term29867, term29867.getClass(), "charOut", null);
        setBooleanField(term29867, term29867.getClass(), "closing", false);
        setField(term29867, term29867.getClass(), "out", null);
        setBooleanField(term29867, term29867.getClass(), "closed", false);
        setField(term29867, term29867.getClass(), "closeLock", null);
        setField(term29866, term29866.getClass(), "out", term29867);
        setField(term29866, term29866.getClass(), "format", null);
        setBooleanField(term29866, term29866.getClass(), "newRecord", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "flush", argTypes, term29047, args);
        assertTrue(recursiveEquals(term29047, term29866));
    }

};


