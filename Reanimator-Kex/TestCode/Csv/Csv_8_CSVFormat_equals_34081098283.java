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

public class CSVFormat_equals_34081098283 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term152955;
     Object term152990;
     Object term153006;
     Object term153007;

    public CSVFormat_equals_34081098283() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term152955 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term152955, term152955.getClass(), "delimiter", (char) 1);
        term152990 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term152990, term152990.getClass(), "delimiter", (char) 0);
        term153006 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term153006, term153006.getClass(), "delimiter", (char) 1);
        setField(term153006, term153006.getClass(), "quoteChar", null);
        setField(term153006, term153006.getClass(), "quotePolicy", null);
        setField(term153006, term153006.getClass(), "commentStart", null);
        setField(term153006, term153006.getClass(), "escape", null);
        setBooleanField(term153006, term153006.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term153006, term153006.getClass(), "ignoreEmptyLines", false);
        setField(term153006, term153006.getClass(), "recordSeparator", null);
        setField(term153006, term153006.getClass(), "nullString", null);
        setField(term153006, term153006.getClass(), "header", null);
        setBooleanField(term153006, term153006.getClass(), "skipHeaderRecord", false);
        term153007 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term153007, term153007.getClass(), "delimiter", (char) 0);
        setField(term153007, term153007.getClass(), "quoteChar", null);
        setField(term153007, term153007.getClass(), "quotePolicy", null);
        setField(term153007, term153007.getClass(), "commentStart", null);
        setField(term153007, term153007.getClass(), "escape", null);
        setBooleanField(term153007, term153007.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term153007, term153007.getClass(), "ignoreEmptyLines", false);
        setField(term153007, term153007.getClass(), "recordSeparator", null);
        setField(term153007, term153007.getClass(), "nullString", null);
        setField(term153007, term153007.getClass(), "header", null);
        setBooleanField(term153007, term153007.getClass(), "skipHeaderRecord", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term152990;
        Object retValue = callMethod(klass, "equals", argTypes, term152955, args);
        assertTrue(recursiveEquals(term152955, term153006));
        assertTrue(recursiveEquals(term152990, term153007));
        assertTrue(recursiveEquals(retValue, false));
    }

};


