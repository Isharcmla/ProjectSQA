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

public class CSVFormat_withTrim_1222993671156 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term77012;

    public CSVFormat_withTrim_1222993671156() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term77012 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term77012, term77012.getClass(), "allowMissingColumnNames", false);
        setField(term77012, term77012.getClass(), "commentMarker", null);
        setCharField(term77012, term77012.getClass(), "delimiter", (char) 0);
        setField(term77012, term77012.getClass(), "escapeCharacter", null);
        setField(term77012, term77012.getClass(), "header", null);
        setField(term77012, term77012.getClass(), "headerComments", null);
        setBooleanField(term77012, term77012.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term77012, term77012.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term77012, term77012.getClass(), "ignoreSurroundingSpaces", false);
        setField(term77012, term77012.getClass(), "nullString", null);
        setField(term77012, term77012.getClass(), "quoteCharacter", null);
        setField(term77012, term77012.getClass(), "quoteMode", null);
        setField(term77012, term77012.getClass(), "recordSeparator", null);
        setBooleanField(term77012, term77012.getClass(), "skipHeaderRecord", false);
        setBooleanField(term77012, term77012.getClass(), "trailingDelimiter", false);
        setBooleanField(term77012, term77012.getClass(), "trim", false);
        setBooleanField(term77012, term77012.getClass(), "autoFlush", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "withTrim", argTypes, term77012, args);
    }

};


