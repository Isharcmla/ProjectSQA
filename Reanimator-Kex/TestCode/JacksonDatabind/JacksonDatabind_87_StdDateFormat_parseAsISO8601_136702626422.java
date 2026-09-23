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

public class StdDateFormat_parseAsISO8601_136702626422 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1682;
     Object term1685;

    public StdDateFormat_parseAsISO8601_136702626422() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1682 = newInstance(Class.forName("java.text.ParsePosition"));
        setIntField(term1682, term1682.getClass(), "index", -1955890973);
        setIntField(term1682, term1682.getClass(), "errorIndex", -2038273078);
        term1685 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.util.StdDateFormat");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.text.ParsePosition");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = "EGtDIRbSSb";
        args[1] = term1682;
        args[2] = term1685;
        callMethod(klass, "parseAsISO8601", argTypes, null, args);
    }

};


