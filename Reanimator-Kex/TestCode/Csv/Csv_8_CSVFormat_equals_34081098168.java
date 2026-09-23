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

public class CSVFormat_equals_34081098168 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term76927;
     Object term76995;
     Object term77013;
     Object term77014;

    public CSVFormat_equals_34081098168() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term76927 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        term76995 = newInstance(Class.forName("java.util.stream.DoubleStream$2"));
        term77013 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term77013, term77013.getClass(), "delimiter", (char) 0);
        setField(term77013, term77013.getClass(), "quoteChar", null);
        setField(term77013, term77013.getClass(), "quotePolicy", null);
        setField(term77013, term77013.getClass(), "commentStart", null);
        setField(term77013, term77013.getClass(), "escape", null);
        setBooleanField(term77013, term77013.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term77013, term77013.getClass(), "ignoreEmptyLines", false);
        setField(term77013, term77013.getClass(), "recordSeparator", null);
        setField(term77013, term77013.getClass(), "nullString", null);
        setField(term77013, term77013.getClass(), "header", null);
        setBooleanField(term77013, term77013.getClass(), "skipHeaderRecord", false);
        term77014 = newInstance(Class.forName("java.util.stream.DoubleStream$2"));
        setDoubleField(term77014, term77014.getClass(), "prev", 0.0);
        setBooleanField(term77014, term77014.getClass(), "started", false);
        setBooleanField(term77014, term77014.getClass(), "finished", false);
        setField(term77014, term77014.getClass(), "val$next", null);
        setDoubleField(term77014, term77014.getClass(), "val$seed", 0.0);
        setField(term77014, term77014.getClass(), "val$hasNext", null);
        setIntField(term77014, term77014.getClass(), "characteristics", 0);
        setLongField(term77014, term77014.getClass(), "est", 0L);
        setIntField(term77014, term77014.getClass(), "batch", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term76995;
        Object retValue = callMethod(klass, "equals", argTypes, term76927, args);
        assertTrue(recursiveEquals(term76927, term77013));
        assertTrue(recursiveEquals(term76995, term77014));
        assertTrue(recursiveEquals(retValue, false));
    }

};


