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

public class CSVFormat_isQuoting_985448745172 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term77484;
     Object term77492;

    public CSVFormat_isQuoting_985448745172() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term77484 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setField(term77484, term77484.getClass(), "quoteChar", null);
        term77492 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term77492, term77492.getClass(), "delimiter", (char) 0);
        setField(term77492, term77492.getClass(), "quoteChar", null);
        setField(term77492, term77492.getClass(), "quotePolicy", null);
        setField(term77492, term77492.getClass(), "commentStart", null);
        setField(term77492, term77492.getClass(), "escape", null);
        setBooleanField(term77492, term77492.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term77492, term77492.getClass(), "ignoreEmptyLines", false);
        setField(term77492, term77492.getClass(), "recordSeparator", null);
        setField(term77492, term77492.getClass(), "nullString", null);
        setField(term77492, term77492.getClass(), "header", null);
        setBooleanField(term77492, term77492.getClass(), "skipHeaderRecord", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isQuoting", argTypes, term77484, args);
        assertTrue(recursiveEquals(term77484, term77492));
        assertTrue(recursiveEquals(retValue, false));
    }

};


