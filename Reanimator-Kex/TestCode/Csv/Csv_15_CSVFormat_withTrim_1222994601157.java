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

public class CSVFormat_withTrim_1222994601157 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term77022;
     Object term77032;

    public CSVFormat_withTrim_1222994601157() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term77022 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term77022, term77022.getClass(), "allowMissingColumnNames", false);
        setField(term77022, term77022.getClass(), "commentMarker", null);
        setCharField(term77022, term77022.getClass(), "delimiter", (char) 0);
        setField(term77022, term77022.getClass(), "escapeCharacter", null);
        setField(term77022, term77022.getClass(), "header", null);
        setField(term77022, term77022.getClass(), "headerComments", null);
        setBooleanField(term77022, term77022.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term77022, term77022.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term77022, term77022.getClass(), "ignoreSurroundingSpaces", false);
        setField(term77022, term77022.getClass(), "nullString", null);
        setField(term77022, term77022.getClass(), "quoteCharacter", null);
        setField(term77022, term77022.getClass(), "quoteMode", null);
        setField(term77022, term77022.getClass(), "recordSeparator", null);
        setBooleanField(term77022, term77022.getClass(), "skipHeaderRecord", false);
        setBooleanField(term77022, term77022.getClass(), "trailingDelimiter", false);
        setBooleanField(term77022, term77022.getClass(), "trim", false);
        setBooleanField(term77022, term77022.getClass(), "autoFlush", false);
        term77032 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term77032;
        callMethod(klass, "withTrim", argTypes, term77022, args);
    }

};


