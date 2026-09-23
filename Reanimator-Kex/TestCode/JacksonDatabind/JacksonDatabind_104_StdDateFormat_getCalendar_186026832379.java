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

public class StdDateFormat_getCalendar_186026832379 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8624;

    public StdDateFormat_getCalendar_186026832379() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8624 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.StdDateFormat"));
        setField(term8624, term8624.getClass(), "_timezone", null);
        setField(term8624, term8624.getClass(), "_locale", null);
        setField(term8624, term8624.getClass(), "_lenient", null);
        setField(term8624, term8624.getClass(), "_calendar", null);
        setField(term8624, term8624.getClass(), "_formatRFC1123", null);
        setBooleanField(term8624, term8624.getClass(), "_tzSerializedWithColon", false);
        setField(term8624, term8624.getClass(), "calendar", null);
        setField(term8624, term8624.getClass(), "numberFormat", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.util.StdDateFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.TimeZone");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "_getCalendar", argTypes, term8624, args);
    }

};


