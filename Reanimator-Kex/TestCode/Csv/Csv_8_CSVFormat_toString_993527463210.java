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

public class CSVFormat_toString_993527463210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108076;
     Object term108649;

    public CSVFormat_toString_993527463210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term108076 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term108076, term108076.getClass(), "delimiter", (char) 0);
        setField(term108076, term108076.getClass(), "escape", null);
        setField(term108076, term108076.getClass(), "quoteChar", null);
        setField(term108076, term108076.getClass(), "commentStart", null);
        setField(term108076, term108076.getClass(), "nullString", null);
        setField(term108076, term108076.getClass(), "recordSeparator", null);
        setBooleanField(term108076, term108076.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term108076, term108076.getClass(), "ignoreSurroundingSpaces", true);
        term108649 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term108649, term108649.getClass(), "delimiter", (char) 0);
        setField(term108649, term108649.getClass(), "quoteChar", null);
        setField(term108649, term108649.getClass(), "quotePolicy", null);
        setField(term108649, term108649.getClass(), "commentStart", null);
        setField(term108649, term108649.getClass(), "escape", null);
        setBooleanField(term108649, term108649.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term108649, term108649.getClass(), "ignoreEmptyLines", false);
        setField(term108649, term108649.getClass(), "recordSeparator", null);
        setField(term108649, term108649.getClass(), "nullString", null);
        setField(term108649, term108649.getClass(), "header", null);
        setBooleanField(term108649, term108649.getClass(), "skipHeaderRecord", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toString", argTypes, term108076, args);
        assertTrue(recursiveEquals(term108076, term108649));
        assertTrue(recursiveEquals(retValue, "Delimiter=< > SurroundingSpaces:ignored SkipHeaderRecord:false"));
    }

};


