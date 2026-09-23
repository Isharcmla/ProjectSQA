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

public class CSVFormat_withHeader_269759087138 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term76818;

    public CSVFormat_withHeader_269759087138() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term76818 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term76818, term76818.getClass(), "allowMissingColumnNames", false);
        setField(term76818, term76818.getClass(), "commentMarker", null);
        setCharField(term76818, term76818.getClass(), "delimiter", (char) 0);
        setField(term76818, term76818.getClass(), "escapeCharacter", null);
        setField(term76818, term76818.getClass(), "header", null);
        setField(term76818, term76818.getClass(), "headerComments", null);
        setBooleanField(term76818, term76818.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term76818, term76818.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term76818, term76818.getClass(), "ignoreSurroundingSpaces", false);
        setField(term76818, term76818.getClass(), "nullString", null);
        setField(term76818, term76818.getClass(), "quoteCharacter", null);
        setField(term76818, term76818.getClass(), "quoteMode", null);
        setField(term76818, term76818.getClass(), "recordSeparator", null);
        setBooleanField(term76818, term76818.getClass(), "skipHeaderRecord", false);
        setBooleanField(term76818, term76818.getClass(), "trailingDelimiter", false);
        setBooleanField(term76818, term76818.getClass(), "trim", false);
        setBooleanField(term76818, term76818.getClass(), "autoFlush", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "withHeader", argTypes, term76818, args);
    }

};


