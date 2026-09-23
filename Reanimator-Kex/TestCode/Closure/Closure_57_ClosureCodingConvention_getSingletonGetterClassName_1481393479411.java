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

public class ClosureCodingConvention_getSingletonGetterClassName_1481393479411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term145141;
     Object term145233;
     Object term145255;
     Object term145256;

    public ClosureCodingConvention_getSingletonGetterClassName_1481393479411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term145141 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term145233 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term145233, term145233.getClass(), "first", term145233);
        setIntField(term145233, term145233.getClass(), "type", 42);
        term145255 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(term145255, term145255.getClass(), "propertyTestFunctions", null);
        term145256 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term145256, term145256.getClass(), "str", null);
        setIntField(term145256, term145256.getClass(), "type", 42);
        setField(term145256, term145256.getClass(), "next", null);
        setField(term145256, term145256.getClass(), "first", term145256);
        setField(term145256, term145256.getClass(), "last", null);
        setField(term145256, term145256.getClass(), "propListHead", null);
        setIntField(term145256, term145256.getClass(), "sourcePosition", 0);
        setField(term145256, term145256.getClass(), "jsType", null);
        setField(term145256, term145256.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term145233;
        Object retValue = callMethod(klass, "getSingletonGetterClassName", argTypes, term145141, args);
        assertTrue(recursiveEquals(term145141, term145255));
        assertTrue(recursiveEquals(term145233, term145256));
        assertTrue(recursiveEquals(retValue, null));
    }

};


