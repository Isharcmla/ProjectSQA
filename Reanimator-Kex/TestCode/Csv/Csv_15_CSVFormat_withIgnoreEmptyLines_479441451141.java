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
import java.lang.Boolean;

public class CSVFormat_withIgnoreEmptyLines_479441451141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term76848;
     Object term76858;

    public CSVFormat_withIgnoreEmptyLines_479441451141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term76848 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term76848, term76848.getClass(), "allowMissingColumnNames", false);
        setField(term76848, term76848.getClass(), "commentMarker", null);
        setCharField(term76848, term76848.getClass(), "delimiter", (char) 0);
        setField(term76848, term76848.getClass(), "escapeCharacter", null);
        setField(term76848, term76848.getClass(), "header", null);
        setField(term76848, term76848.getClass(), "headerComments", null);
        setBooleanField(term76848, term76848.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term76848, term76848.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term76848, term76848.getClass(), "ignoreSurroundingSpaces", false);
        setField(term76848, term76848.getClass(), "nullString", null);
        setField(term76848, term76848.getClass(), "quoteCharacter", null);
        setField(term76848, term76848.getClass(), "quoteMode", null);
        setField(term76848, term76848.getClass(), "recordSeparator", null);
        setBooleanField(term76848, term76848.getClass(), "skipHeaderRecord", false);
        setBooleanField(term76848, term76848.getClass(), "trailingDelimiter", false);
        setBooleanField(term76848, term76848.getClass(), "trim", false);
        setBooleanField(term76848, term76848.getClass(), "autoFlush", false);
        term76858 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term76858;
        callMethod(klass, "withIgnoreEmptyLines", argTypes, term76848, args);
    }

};


