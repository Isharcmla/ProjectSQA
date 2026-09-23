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

public class CSVFormat_equals_3408109891 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53565;
     Object term53875;
     Object term53876;

    public CSVFormat_equals_3408109891() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53565 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        term53875 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term53875, term53875.getClass(), "delimiter", (char) 0);
        setField(term53875, term53875.getClass(), "quoteCharacter", null);
        setField(term53875, term53875.getClass(), "quoteMode", null);
        setField(term53875, term53875.getClass(), "commentMarker", null);
        setField(term53875, term53875.getClass(), "escapeCharacter", null);
        setBooleanField(term53875, term53875.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term53875, term53875.getClass(), "allowMissingColumnNames", false);
        setBooleanField(term53875, term53875.getClass(), "ignoreEmptyLines", false);
        setField(term53875, term53875.getClass(), "recordSeparator", null);
        setField(term53875, term53875.getClass(), "nullString", null);
        setField(term53875, term53875.getClass(), "header", null);
        setBooleanField(term53875, term53875.getClass(), "skipHeaderRecord", false);
        term53876 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term53876, term53876.getClass(), "delimiter", (char) 0);
        setField(term53876, term53876.getClass(), "quoteCharacter", null);
        setField(term53876, term53876.getClass(), "quoteMode", null);
        setField(term53876, term53876.getClass(), "commentMarker", null);
        setField(term53876, term53876.getClass(), "escapeCharacter", null);
        setBooleanField(term53876, term53876.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term53876, term53876.getClass(), "allowMissingColumnNames", false);
        setBooleanField(term53876, term53876.getClass(), "ignoreEmptyLines", false);
        setField(term53876, term53876.getClass(), "recordSeparator", null);
        setField(term53876, term53876.getClass(), "nullString", null);
        setField(term53876, term53876.getClass(), "header", null);
        setBooleanField(term53876, term53876.getClass(), "skipHeaderRecord", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term53565;
        Object retValue = callMethod(klass, "equals", argTypes, term53565, args);
        assertTrue(recursiveEquals(term53565, term53875));
        assertTrue(recursiveEquals(term53565, term53876));
        assertTrue(recursiveEquals(retValue, true));
    }

};


