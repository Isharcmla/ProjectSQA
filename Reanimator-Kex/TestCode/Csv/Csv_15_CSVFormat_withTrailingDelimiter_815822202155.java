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

public class CSVFormat_withTrailingDelimiter_815822202155 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term77000;
     Object term77010;

    public CSVFormat_withTrailingDelimiter_815822202155() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term77000 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term77000, term77000.getClass(), "allowMissingColumnNames", false);
        setField(term77000, term77000.getClass(), "commentMarker", null);
        setCharField(term77000, term77000.getClass(), "delimiter", (char) 0);
        setField(term77000, term77000.getClass(), "escapeCharacter", null);
        setField(term77000, term77000.getClass(), "header", null);
        setField(term77000, term77000.getClass(), "headerComments", null);
        setBooleanField(term77000, term77000.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term77000, term77000.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term77000, term77000.getClass(), "ignoreSurroundingSpaces", false);
        setField(term77000, term77000.getClass(), "nullString", null);
        setField(term77000, term77000.getClass(), "quoteCharacter", null);
        setField(term77000, term77000.getClass(), "quoteMode", null);
        setField(term77000, term77000.getClass(), "recordSeparator", null);
        setBooleanField(term77000, term77000.getClass(), "skipHeaderRecord", false);
        setBooleanField(term77000, term77000.getClass(), "trailingDelimiter", false);
        setBooleanField(term77000, term77000.getClass(), "trim", false);
        setBooleanField(term77000, term77000.getClass(), "autoFlush", false);
        term77010 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term77010;
        callMethod(klass, "withTrailingDelimiter", argTypes, term77000, args);
    }

};


