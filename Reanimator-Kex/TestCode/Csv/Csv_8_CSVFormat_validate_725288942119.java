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

public class CSVFormat_validate_725288942119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56037;
     Object term56051;

    public CSVFormat_validate_725288942119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term56037 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setField(term56037, term56037.getClass(), "quoteChar", null);
        term56051 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term56051, term56051.getClass(), "delimiter", (char) 0);
        setField(term56051, term56051.getClass(), "quoteChar", null);
        setField(term56051, term56051.getClass(), "quotePolicy", null);
        setField(term56051, term56051.getClass(), "commentStart", null);
        setField(term56051, term56051.getClass(), "escape", null);
        setBooleanField(term56051, term56051.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term56051, term56051.getClass(), "ignoreEmptyLines", false);
        setField(term56051, term56051.getClass(), "recordSeparator", null);
        setField(term56051, term56051.getClass(), "nullString", null);
        setField(term56051, term56051.getClass(), "header", null);
        setBooleanField(term56051, term56051.getClass(), "skipHeaderRecord", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "validate", argTypes, term56037, args);
        assertTrue(recursiveEquals(term56037, term56051));
    }

};


