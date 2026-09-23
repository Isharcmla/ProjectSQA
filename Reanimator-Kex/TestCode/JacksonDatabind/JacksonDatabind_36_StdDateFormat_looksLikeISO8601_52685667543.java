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

public class StdDateFormat_looksLikeISO8601_52685667543 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6530;

    public StdDateFormat_looksLikeISO8601_52685667543() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6530 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.StdDateFormat"));
        setField(term6530, term6530.getClass(), "_timezone", null);
        setField(term6530, term6530.getClass(), "_locale", null);
        setField(term6530, term6530.getClass(), "_lenient", null);
        setField(term6530, term6530.getClass(), "_formatRFC1123", null);
        setField(term6530, term6530.getClass(), "_formatISO8601", null);
        setField(term6530, term6530.getClass(), "_formatISO8601_z", null);
        setField(term6530, term6530.getClass(), "_formatPlain", null);
        setField(term6530, term6530.getClass(), "calendar", null);
        setField(term6530, term6530.getClass(), "numberFormat", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.util.StdDateFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "looksLikeISO8601", argTypes, term6530, args);
    }

};


