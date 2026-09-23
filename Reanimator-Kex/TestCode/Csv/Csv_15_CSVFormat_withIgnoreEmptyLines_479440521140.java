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

public class CSVFormat_withIgnoreEmptyLines_479440521140 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term76838;

    public CSVFormat_withIgnoreEmptyLines_479440521140() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term76838 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term76838, term76838.getClass(), "allowMissingColumnNames", false);
        setField(term76838, term76838.getClass(), "commentMarker", null);
        setCharField(term76838, term76838.getClass(), "delimiter", (char) 0);
        setField(term76838, term76838.getClass(), "escapeCharacter", null);
        setField(term76838, term76838.getClass(), "header", null);
        setField(term76838, term76838.getClass(), "headerComments", null);
        setBooleanField(term76838, term76838.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term76838, term76838.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term76838, term76838.getClass(), "ignoreSurroundingSpaces", false);
        setField(term76838, term76838.getClass(), "nullString", null);
        setField(term76838, term76838.getClass(), "quoteCharacter", null);
        setField(term76838, term76838.getClass(), "quoteMode", null);
        setField(term76838, term76838.getClass(), "recordSeparator", null);
        setBooleanField(term76838, term76838.getClass(), "skipHeaderRecord", false);
        setBooleanField(term76838, term76838.getClass(), "trailingDelimiter", false);
        setBooleanField(term76838, term76838.getClass(), "trim", false);
        setBooleanField(term76838, term76838.getClass(), "autoFlush", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "withIgnoreEmptyLines", argTypes, term76838, args);
    }

};


