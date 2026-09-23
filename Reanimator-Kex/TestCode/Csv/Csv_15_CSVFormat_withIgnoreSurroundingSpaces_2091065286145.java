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

public class CSVFormat_withIgnoreSurroundingSpaces_2091065286145 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term76892;
     Object term76902;

    public CSVFormat_withIgnoreSurroundingSpaces_2091065286145() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term76892 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term76892, term76892.getClass(), "allowMissingColumnNames", false);
        setField(term76892, term76892.getClass(), "commentMarker", null);
        setCharField(term76892, term76892.getClass(), "delimiter", (char) 0);
        setField(term76892, term76892.getClass(), "escapeCharacter", null);
        setField(term76892, term76892.getClass(), "header", null);
        setField(term76892, term76892.getClass(), "headerComments", null);
        setBooleanField(term76892, term76892.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term76892, term76892.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term76892, term76892.getClass(), "ignoreSurroundingSpaces", false);
        setField(term76892, term76892.getClass(), "nullString", null);
        setField(term76892, term76892.getClass(), "quoteCharacter", null);
        setField(term76892, term76892.getClass(), "quoteMode", null);
        setField(term76892, term76892.getClass(), "recordSeparator", null);
        setBooleanField(term76892, term76892.getClass(), "skipHeaderRecord", false);
        setBooleanField(term76892, term76892.getClass(), "trailingDelimiter", false);
        setBooleanField(term76892, term76892.getClass(), "trim", false);
        setBooleanField(term76892, term76892.getClass(), "autoFlush", false);
        term76902 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term76902;
        callMethod(klass, "withIgnoreSurroundingSpaces", argTypes, term76892, args);
    }

};


