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
import java.lang.Boolean;

public class StdDateFormat_parseAsISO8601_136702626450 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6568;
     Object term6569;

    public StdDateFormat_parseAsISO8601_136702626450() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6568 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.StdDateFormat"));
        setField(term6568, term6568.getClass(), "_timezone", null);
        setField(term6568, term6568.getClass(), "_locale", null);
        setField(term6568, term6568.getClass(), "_lenient", null);
        setField(term6568, term6568.getClass(), "_formatRFC1123", null);
        setField(term6568, term6568.getClass(), "_formatISO8601", null);
        setField(term6568, term6568.getClass(), "_formatISO8601_z", null);
        setField(term6568, term6568.getClass(), "_formatPlain", null);
        setField(term6568, term6568.getClass(), "calendar", null);
        setField(term6568, term6568.getClass(), "numberFormat", null);
        term6569 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.util.StdDateFormat");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.text.ParsePosition");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = term6569;
        callMethod(klass, "parseAsISO8601", argTypes, term6568, args);
    }

};


