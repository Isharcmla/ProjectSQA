package com.google.gson.internal.bind.util;

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
import static com.google.gson.internal.bind.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.gson.internal.bind.util.EqualityUtils.*;
import java.lang.Boolean;

public class ISO8601Utils_format_114072248511 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3;
     Object term5;
     Object term413;

    public ISO8601Utils_format_114072248511() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3 = newInstance(Class.forName("java.util.Date"));
        setLongField(term3, term3.getClass(), "fastTime", 1480456351369L);
        setField(term3, term3.getClass(), "cdate", null);
        term5 = new Boolean(false);
        term413 = newInstance(Class.forName("java.util.Date"));
        setLongField(term413, term413.getClass(), "fastTime", 1480456351369L);
        setField(term413, term413.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.util.ISO8601Utils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.Date");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term3;
        args[1] = term5;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term3, term413));
        assertTrue(recursiveEquals(term5, false));
        assertTrue(recursiveEquals(retValue, "2016-11-29T21:52:31Z"));
    }

};


