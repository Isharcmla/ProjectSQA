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

public class CSVFormat_print_594381374116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term76572;

    public CSVFormat_print_594381374116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term76572 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term76572, term76572.getClass(), "allowMissingColumnNames", false);
        setField(term76572, term76572.getClass(), "commentMarker", null);
        setCharField(term76572, term76572.getClass(), "delimiter", (char) 0);
        setField(term76572, term76572.getClass(), "escapeCharacter", null);
        setField(term76572, term76572.getClass(), "header", null);
        setField(term76572, term76572.getClass(), "headerComments", null);
        setBooleanField(term76572, term76572.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term76572, term76572.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term76572, term76572.getClass(), "ignoreSurroundingSpaces", false);
        setField(term76572, term76572.getClass(), "nullString", null);
        setField(term76572, term76572.getClass(), "quoteCharacter", null);
        setField(term76572, term76572.getClass(), "quoteMode", null);
        setField(term76572, term76572.getClass(), "recordSeparator", null);
        setBooleanField(term76572, term76572.getClass(), "skipHeaderRecord", false);
        setBooleanField(term76572, term76572.getClass(), "trailingDelimiter", false);
        setBooleanField(term76572, term76572.getClass(), "trim", false);
        setBooleanField(term76572, term76572.getClass(), "autoFlush", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.nio.file.Path");
        argTypes[1] = Class.forName("java.nio.charset.Charset");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "print", argTypes, term76572, args);
    }

};


