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
import java.lang.String;
import java.lang.Object;

public class CSVFormat_equals_34081098263 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term140842;
     Object term140977;
     Object term141338;
     Object term141344;

    public CSVFormat_equals_34081098263() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term141350 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term141349 = ((Class) term141350).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term141349).setAccessible(true);
        Object enum244 = ((Field) term141349).get((Object) null);
        term140842 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term140842, term140842.getClass(), "delimiter", (char) 0);
        setField(term140842, term140842.getClass(), "quotePolicy", enum244);
        setField(term140842, term140842.getClass(), "quoteChar", null);
        setField(term140842, term140842.getClass(), "commentStart", null);
        setField(term140842, term140842.getClass(), "escape", null);
        setField(term140842, term140842.getClass(), "nullString", "NON_NUMERIC");
        term140977 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term140977, term140977.getClass(), "delimiter", (char) 0);
        setField(term140977, term140977.getClass(), "quotePolicy", enum244);
        setField(term140977, term140977.getClass(), "quoteChar", null);
        setField(term140977, term140977.getClass(), "commentStart", null);
        setField(term140977, term140977.getClass(), "escape", null);
        Class<? extends Object> term141541 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term141540 = ((Class) term141541).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term141540).setAccessible(true);
        Object enum245 = ((Field) term141540).get((Object) null);
        term141338 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term141338, term141338.getClass(), "delimiter", (char) 0);
        setField(term141338, term141338.getClass(), "quoteChar", null);
        setField(term141338, term141338.getClass(), "quotePolicy", enum245);
        setField(term141338, term141338.getClass(), "commentStart", null);
        setField(term141338, term141338.getClass(), "escape", null);
        setBooleanField(term141338, term141338.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term141338, term141338.getClass(), "ignoreEmptyLines", false);
        setField(term141338, term141338.getClass(), "recordSeparator", null);
        setField(term141338, term141338.getClass(), "nullString", "NON_NUMERIC");
        setField(term141338, term141338.getClass(), "header", null);
        setBooleanField(term141338, term141338.getClass(), "skipHeaderRecord", false);
        Class<? extends Object> term141732 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term141731 = ((Class) term141732).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term141731).setAccessible(true);
        Object enum246 = ((Field) term141731).get((Object) null);
        term141344 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term141344, term141344.getClass(), "delimiter", (char) 0);
        setField(term141344, term141344.getClass(), "quoteChar", null);
        setField(term141344, term141344.getClass(), "quotePolicy", enum246);
        setField(term141344, term141344.getClass(), "commentStart", null);
        setField(term141344, term141344.getClass(), "escape", null);
        setBooleanField(term141344, term141344.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term141344, term141344.getClass(), "ignoreEmptyLines", false);
        setField(term141344, term141344.getClass(), "recordSeparator", null);
        setField(term141344, term141344.getClass(), "nullString", null);
        setField(term141344, term141344.getClass(), "header", null);
        setBooleanField(term141344, term141344.getClass(), "skipHeaderRecord", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term140977;
        Object retValue = callMethod(klass, "equals", argTypes, term140842, args);
        assertTrue(recursiveEquals(term140842, term141338));
        assertTrue(recursiveEquals(term140977, term141344));
        assertTrue(recursiveEquals(retValue, false));
    }

};


