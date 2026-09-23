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

public class CSVFormat_equals_34081098191 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term91226;
     Object term91284;
     Object term91295;
     Object term91296;

    public CSVFormat_equals_34081098191() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term91226 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        term91284 = newInstance(Class.forName("java.io.RandomAccessFile$2"));
        term91295 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term91295, term91295.getClass(), "delimiter", (char) 0);
        setField(term91295, term91295.getClass(), "quoteChar", null);
        setField(term91295, term91295.getClass(), "quotePolicy", null);
        setField(term91295, term91295.getClass(), "commentStart", null);
        setField(term91295, term91295.getClass(), "escape", null);
        setBooleanField(term91295, term91295.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term91295, term91295.getClass(), "ignoreEmptyLines", false);
        setField(term91295, term91295.getClass(), "recordSeparator", null);
        setField(term91295, term91295.getClass(), "nullString", null);
        setField(term91295, term91295.getClass(), "header", null);
        setBooleanField(term91295, term91295.getClass(), "skipHeaderRecord", false);
        term91296 = newInstance(Class.forName("java.io.RandomAccessFile$2"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term91284;
        Object retValue = callMethod(klass, "equals", argTypes, term91226, args);
        assertTrue(recursiveEquals(term91226, term91295));
        assertTrue(recursiveEquals(term91284, term91296));
        assertTrue(recursiveEquals(retValue, false));
    }

};


