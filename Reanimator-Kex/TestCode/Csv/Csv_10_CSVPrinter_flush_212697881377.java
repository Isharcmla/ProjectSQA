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

public class CSVPrinter_flush_212697881377 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30959;
     Object term31012;

    public CSVPrinter_flush_212697881377() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30959 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term31003 = newInstance(Class.forName("java.io.PrintStream"));
        setField(term30959, term30959.getClass(), "out", term31003);
        term31012 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term31013 = newInstance(Class.forName("java.io.PrintStream"));
        setBooleanField(term31013, term31013.getClass(), "autoFlush", false);
        setBooleanField(term31013, term31013.getClass(), "trouble", true);
        setField(term31013, term31013.getClass(), "formatter", null);
        setField(term31013, term31013.getClass(), "textOut", null);
        setField(term31013, term31013.getClass(), "charOut", null);
        setBooleanField(term31013, term31013.getClass(), "closing", false);
        setField(term31013, term31013.getClass(), "out", null);
        setBooleanField(term31013, term31013.getClass(), "closed", false);
        setField(term31013, term31013.getClass(), "closeLock", null);
        setField(term31012, term31012.getClass(), "out", term31013);
        setField(term31012, term31012.getClass(), "format", null);
        setBooleanField(term31012, term31012.getClass(), "newRecord", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "flush", argTypes, term30959, args);
        assertTrue(recursiveEquals(term30959, term31012));
    }

};


