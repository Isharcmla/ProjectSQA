package com.fasterxml.jackson.databind.util;

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
import static com.fasterxml.jackson.databind.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class StdDateFormat_parseAsRFC1123_200755782245 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6534;

    public StdDateFormat_parseAsRFC1123_200755782245() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6534 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.StdDateFormat"));
        setField(term6534, term6534.getClass(), "_timezone", null);
        setField(term6534, term6534.getClass(), "_locale", null);
        setField(term6534, term6534.getClass(), "_lenient", null);
        setField(term6534, term6534.getClass(), "_formatRFC1123", null);
        setField(term6534, term6534.getClass(), "_formatISO8601", null);
        setField(term6534, term6534.getClass(), "_formatISO8601_z", null);
        setField(term6534, term6534.getClass(), "_formatPlain", null);
        setField(term6534, term6534.getClass(), "calendar", null);
        setField(term6534, term6534.getClass(), "numberFormat", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.util.StdDateFormat");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.text.ParsePosition");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "parseAsRFC1123", argTypes, term6534, args);
    }

};


