package com.google.javascript.jscomp;

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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.jscomp.EqualityUtils.*;

public class LightweightMessageFormatter_format_413663799147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term110014;
     Object term110092;
     Object term110210;
     Object term110211;

    public LightweightMessageFormatter_format_413663799147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term110014 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        setField(term110014, term110014.getClass(), "source", null);
        term110092 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term110092, term110092.getClass(), "sourceName", "");
        setIntField(term110092, term110092.getClass(), "lineNumber", 1);
        term110210 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        setField(term110210, term110210.getClass(), "excerpt", null);
        setField(term110210, term110210.getClass(), "source", null);
        setBooleanField(term110210, term110210.getClass(), "colorize", false);
        term110211 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term110211, term110211.getClass(), "type", null);
        setField(term110211, term110211.getClass(), "description", null);
        setField(term110211, term110211.getClass(), "sourceName", "");
        setField(term110211, term110211.getClass(), "node", null);
        setIntField(term110211, term110211.getClass(), "lineNumber", 1);
        setField(term110211, term110211.getClass(), "level", null);
        setIntField(term110211, term110211.getClass(), "charno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term110092;
        args[1] = false;
        Object retValue = callMethod(klass, "format", argTypes, term110014, args);
        assertTrue(recursiveEquals(term110014, term110210));
        assertTrue(recursiveEquals(term110092, term110211));
        assertTrue(recursiveEquals(retValue, ":1: ERROR - null\n"));
    }

};


