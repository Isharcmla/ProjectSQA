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

public class CSVFormat_toString_993527463344 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term228515;
     Object term228650;

    public CSVFormat_toString_993527463344() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term228515 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term228515, term228515.getClass(), "delimiter", (char) 0);
        setField(term228515, term228515.getClass(), "escape", null);
        setField(term228515, term228515.getClass(), "quoteChar", null);
        setField(term228515, term228515.getClass(), "commentStart", null);
        setField(term228515, term228515.getClass(), "nullString", "");
        setField(term228515, term228515.getClass(), "recordSeparator", null);
        setBooleanField(term228515, term228515.getClass(), "ignoreEmptyLines", true);
        term228650 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term228650, term228650.getClass(), "delimiter", (char) 0);
        setField(term228650, term228650.getClass(), "quoteChar", null);
        setField(term228650, term228650.getClass(), "quotePolicy", null);
        setField(term228650, term228650.getClass(), "commentStart", null);
        setField(term228650, term228650.getClass(), "escape", null);
        setBooleanField(term228650, term228650.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term228650, term228650.getClass(), "ignoreEmptyLines", true);
        setField(term228650, term228650.getClass(), "recordSeparator", null);
        setField(term228650, term228650.getClass(), "nullString", "");
        setField(term228650, term228650.getClass(), "header", null);
        setBooleanField(term228650, term228650.getClass(), "skipHeaderRecord", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toString", argTypes, term228515, args);
        assertTrue(recursiveEquals(term228515, term228650));
        assertTrue(recursiveEquals(retValue, "Delimiter=< > NullString=<> EmptyLines:ignored SkipHeaderRecord:false"));
    }

};


