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

public class CSVFormat_equals_34081098146 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term69123;
     Object term70829;
     Object term70830;

    public CSVFormat_equals_34081098146() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term69123 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        term70829 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term70829, term70829.getClass(), "delimiter", (char) 0);
        setField(term70829, term70829.getClass(), "quoteChar", null);
        setField(term70829, term70829.getClass(), "quotePolicy", null);
        setField(term70829, term70829.getClass(), "commentStart", null);
        setField(term70829, term70829.getClass(), "escape", null);
        setBooleanField(term70829, term70829.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term70829, term70829.getClass(), "ignoreEmptyLines", false);
        setField(term70829, term70829.getClass(), "recordSeparator", null);
        setField(term70829, term70829.getClass(), "nullString", null);
        setField(term70829, term70829.getClass(), "header", null);
        setBooleanField(term70829, term70829.getClass(), "skipHeaderRecord", false);
        term70830 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term70830, term70830.getClass(), "delimiter", (char) 0);
        setField(term70830, term70830.getClass(), "quoteChar", null);
        setField(term70830, term70830.getClass(), "quotePolicy", null);
        setField(term70830, term70830.getClass(), "commentStart", null);
        setField(term70830, term70830.getClass(), "escape", null);
        setBooleanField(term70830, term70830.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term70830, term70830.getClass(), "ignoreEmptyLines", false);
        setField(term70830, term70830.getClass(), "recordSeparator", null);
        setField(term70830, term70830.getClass(), "nullString", null);
        setField(term70830, term70830.getClass(), "header", null);
        setBooleanField(term70830, term70830.getClass(), "skipHeaderRecord", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term69123;
        Object retValue = callMethod(klass, "equals", argTypes, term69123, args);
        assertTrue(recursiveEquals(term69123, term70829));
        assertTrue(recursiveEquals(term69123, term70830));
        assertTrue(recursiveEquals(retValue, true));
    }

};


