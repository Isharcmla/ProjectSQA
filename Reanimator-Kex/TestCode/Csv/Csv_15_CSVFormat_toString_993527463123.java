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

public class CSVFormat_toString_993527463123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term76660;

    public CSVFormat_toString_993527463123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term76660 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term76660, term76660.getClass(), "allowMissingColumnNames", false);
        setField(term76660, term76660.getClass(), "commentMarker", null);
        setCharField(term76660, term76660.getClass(), "delimiter", (char) 0);
        setField(term76660, term76660.getClass(), "escapeCharacter", null);
        setField(term76660, term76660.getClass(), "header", null);
        setField(term76660, term76660.getClass(), "headerComments", null);
        setBooleanField(term76660, term76660.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term76660, term76660.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term76660, term76660.getClass(), "ignoreSurroundingSpaces", false);
        setField(term76660, term76660.getClass(), "nullString", null);
        setField(term76660, term76660.getClass(), "quoteCharacter", null);
        setField(term76660, term76660.getClass(), "quoteMode", null);
        setField(term76660, term76660.getClass(), "recordSeparator", null);
        setBooleanField(term76660, term76660.getClass(), "skipHeaderRecord", false);
        setBooleanField(term76660, term76660.getClass(), "trailingDelimiter", false);
        setBooleanField(term76660, term76660.getClass(), "trim", false);
        setBooleanField(term76660, term76660.getClass(), "autoFlush", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term76660, args);
    }

};


