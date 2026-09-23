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

public class CSVFormat_equals_34081098176 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78451;
     Object term78486;
     Object term78517;
     Object term78518;

    public CSVFormat_equals_34081098176() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term78451 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        term78486 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        term78517 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term78517, term78517.getClass(), "delimiter", (char) 0);
        setField(term78517, term78517.getClass(), "quoteChar", null);
        setField(term78517, term78517.getClass(), "quotePolicy", null);
        setField(term78517, term78517.getClass(), "commentStart", null);
        setField(term78517, term78517.getClass(), "escape", null);
        setBooleanField(term78517, term78517.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term78517, term78517.getClass(), "ignoreEmptyLines", false);
        setField(term78517, term78517.getClass(), "recordSeparator", null);
        setField(term78517, term78517.getClass(), "nullString", null);
        setField(term78517, term78517.getClass(), "header", null);
        setBooleanField(term78517, term78517.getClass(), "skipHeaderRecord", false);
        term78518 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term78518, term78518.getClass(), "delimiter", (char) 0);
        setField(term78518, term78518.getClass(), "quoteChar", null);
        setField(term78518, term78518.getClass(), "quotePolicy", null);
        setField(term78518, term78518.getClass(), "commentStart", null);
        setField(term78518, term78518.getClass(), "escape", null);
        setBooleanField(term78518, term78518.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term78518, term78518.getClass(), "ignoreEmptyLines", false);
        setField(term78518, term78518.getClass(), "recordSeparator", null);
        setField(term78518, term78518.getClass(), "nullString", null);
        setField(term78518, term78518.getClass(), "header", null);
        setBooleanField(term78518, term78518.getClass(), "skipHeaderRecord", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term78486;
        Object retValue = callMethod(klass, "equals", argTypes, term78451, args);
        assertTrue(recursiveEquals(term78451, term78517));
        assertTrue(recursiveEquals(term78486, term78518));
        assertTrue(recursiveEquals(retValue, true));
    }

};


