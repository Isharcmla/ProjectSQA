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

public class CSVFormat_withAutoFlush_1157510992158 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term77034;
     Object term77044;

    public CSVFormat_withAutoFlush_1157510992158() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term77034 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term77034, term77034.getClass(), "allowMissingColumnNames", false);
        setField(term77034, term77034.getClass(), "commentMarker", null);
        setCharField(term77034, term77034.getClass(), "delimiter", (char) 0);
        setField(term77034, term77034.getClass(), "escapeCharacter", null);
        setField(term77034, term77034.getClass(), "header", null);
        setField(term77034, term77034.getClass(), "headerComments", null);
        setBooleanField(term77034, term77034.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term77034, term77034.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term77034, term77034.getClass(), "ignoreSurroundingSpaces", false);
        setField(term77034, term77034.getClass(), "nullString", null);
        setField(term77034, term77034.getClass(), "quoteCharacter", null);
        setField(term77034, term77034.getClass(), "quoteMode", null);
        setField(term77034, term77034.getClass(), "recordSeparator", null);
        setBooleanField(term77034, term77034.getClass(), "skipHeaderRecord", false);
        setBooleanField(term77034, term77034.getClass(), "trailingDelimiter", false);
        setBooleanField(term77034, term77034.getClass(), "trim", false);
        setBooleanField(term77034, term77034.getClass(), "autoFlush", false);
        term77044 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term77044;
        callMethod(klass, "withAutoFlush", argTypes, term77034, args);
    }

};


