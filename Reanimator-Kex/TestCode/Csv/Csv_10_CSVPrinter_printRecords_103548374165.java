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

public class CSVPrinter_printRecords_103548374165 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27504;
     Object term27421;
     Object term27509;
     Object term27510;

    public CSVPrinter_printRecords_103548374165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27504 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        term27421 = (Object[]) newArray("java.lang.Object", 0);
        term27509 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        setField(term27509, term27509.getClass(), "out", null);
        setField(term27509, term27509.getClass(), "format", null);
        setBooleanField(term27509, term27509.getClass(), "newRecord", false);
        term27510 = (Object[]) newArray("java.lang.Object", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term27421;
        callMethod(klass, "printRecords", argTypes, term27504, args);
        assertTrue(recursiveEquals(term27504, term27509));
        assertTrue(recursiveEquals(term27421, term27510));
    }

};


