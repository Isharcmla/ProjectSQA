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

public class CSVFormat_withIgnoreHeaderCase_1929024790143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term76870;
     Object term76880;

    public CSVFormat_withIgnoreHeaderCase_1929024790143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term76870 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term76870, term76870.getClass(), "allowMissingColumnNames", false);
        setField(term76870, term76870.getClass(), "commentMarker", null);
        setCharField(term76870, term76870.getClass(), "delimiter", (char) 0);
        setField(term76870, term76870.getClass(), "escapeCharacter", null);
        setField(term76870, term76870.getClass(), "header", null);
        setField(term76870, term76870.getClass(), "headerComments", null);
        setBooleanField(term76870, term76870.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term76870, term76870.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term76870, term76870.getClass(), "ignoreSurroundingSpaces", false);
        setField(term76870, term76870.getClass(), "nullString", null);
        setField(term76870, term76870.getClass(), "quoteCharacter", null);
        setField(term76870, term76870.getClass(), "quoteMode", null);
        setField(term76870, term76870.getClass(), "recordSeparator", null);
        setBooleanField(term76870, term76870.getClass(), "skipHeaderRecord", false);
        setBooleanField(term76870, term76870.getClass(), "trailingDelimiter", false);
        setBooleanField(term76870, term76870.getClass(), "trim", false);
        setBooleanField(term76870, term76870.getClass(), "autoFlush", false);
        term76880 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term76880;
        callMethod(klass, "withIgnoreHeaderCase", argTypes, term76870, args);
    }

};


