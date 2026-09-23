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

public class CSVFormat_equals_34081098166 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term76683;
     Object term76692;

    public CSVFormat_equals_34081098166() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term76683 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        term76692 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term76692, term76692.getClass(), "delimiter", (char) 0);
        setField(term76692, term76692.getClass(), "quoteChar", null);
        setField(term76692, term76692.getClass(), "quotePolicy", null);
        setField(term76692, term76692.getClass(), "commentStart", null);
        setField(term76692, term76692.getClass(), "escape", null);
        setBooleanField(term76692, term76692.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term76692, term76692.getClass(), "ignoreEmptyLines", false);
        setField(term76692, term76692.getClass(), "recordSeparator", null);
        setField(term76692, term76692.getClass(), "nullString", null);
        setField(term76692, term76692.getClass(), "header", null);
        setBooleanField(term76692, term76692.getClass(), "skipHeaderRecord", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "equals", argTypes, term76683, args);
        assertTrue(recursiveEquals(term76683, term76692));
        assertTrue(recursiveEquals(retValue, false));
    }

};


