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
import java.lang.Integer;

public class StdDateFormat_pad2_121618332963 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8582;
     Object term8584;

    public StdDateFormat_pad2_121618332963() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8582 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.StdDateFormat"));
        setField(term8582, term8582.getClass(), "_timezone", null);
        setField(term8582, term8582.getClass(), "_locale", null);
        setField(term8582, term8582.getClass(), "_lenient", null);
        setField(term8582, term8582.getClass(), "_calendar", null);
        setField(term8582, term8582.getClass(), "_formatRFC1123", null);
        setBooleanField(term8582, term8582.getClass(), "_tzSerializedWithColon", false);
        setField(term8582, term8582.getClass(), "calendar", null);
        setField(term8582, term8582.getClass(), "numberFormat", null);
        term8584 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.util.StdDateFormat");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.StringBuffer");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term8584;
        callMethod(klass, "pad2", argTypes, term8582, args);
    }

};


