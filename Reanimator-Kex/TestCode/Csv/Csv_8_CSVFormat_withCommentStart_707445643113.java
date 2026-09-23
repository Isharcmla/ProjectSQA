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
import static org.apache.commons.csv.EqualityUtils.*;

public class CSVFormat_withCommentStart_707445643113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53923;
     Object term53946;
     Object term53933;

    public CSVFormat_withCommentStart_707445643113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53923 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        term53946 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term53946, term53946.getClass(), "delimiter", (char) 0);
        setField(term53946, term53946.getClass(), "quoteChar", null);
        setField(term53946, term53946.getClass(), "quotePolicy", null);
        setField(term53946, term53946.getClass(), "commentStart", null);
        setField(term53946, term53946.getClass(), "escape", null);
        setBooleanField(term53946, term53946.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term53946, term53946.getClass(), "ignoreEmptyLines", false);
        setField(term53946, term53946.getClass(), "recordSeparator", null);
        setField(term53946, term53946.getClass(), "nullString", null);
        setField(term53946, term53946.getClass(), "header", null);
        setBooleanField(term53946, term53946.getClass(), "skipHeaderRecord", false);
        term53933 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term53933, term53933.getClass(), "delimiter", (char) 0);
        setField(term53933, term53933.getClass(), "quoteChar", null);
        setField(term53933, term53933.getClass(), "quotePolicy", null);
        setField(term53933, term53933.getClass(), "commentStart", null);
        setField(term53933, term53933.getClass(), "escape", null);
        setBooleanField(term53933, term53933.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term53933, term53933.getClass(), "ignoreEmptyLines", false);
        setField(term53933, term53933.getClass(), "recordSeparator", null);
        setField(term53933, term53933.getClass(), "nullString", null);
        setField(term53933, term53933.getClass(), "header", null);
        setBooleanField(term53933, term53933.getClass(), "skipHeaderRecord", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Character");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "withCommentStart", argTypes, term53923, args);
        assertTrue(recursiveEquals(term53923, term53946));
        assertTrue(recursiveEquals(retValue, term53933));
    }

};


