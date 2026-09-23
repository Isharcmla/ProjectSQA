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

public class CSVPrinter_printRecords_103548374131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13966;
     Object term13883;
     Object term13971;
     Object term13972;

    public CSVPrinter_printRecords_103548374131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13966 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        term13883 = (Object[]) newArray("java.lang.Object", 0);
        term13971 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        setField(term13971, term13971.getClass(), "out", null);
        setField(term13971, term13971.getClass(), "format", null);
        setBooleanField(term13971, term13971.getClass(), "newRecord", false);
        term13972 = (Object[]) newArray("java.lang.Object", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term13883;
        callMethod(klass, "printRecords", argTypes, term13966, args);
        assertTrue(recursiveEquals(term13966, term13971));
        assertTrue(recursiveEquals(term13883, term13972));
    }

};


