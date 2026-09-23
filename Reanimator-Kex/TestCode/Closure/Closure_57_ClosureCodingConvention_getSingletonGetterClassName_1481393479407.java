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
import java.lang.Object;

public class ClosureCodingConvention_getSingletonGetterClassName_1481393479407 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term144631;
     Object term144723;
     Object term144835;
     Object term144836;

    public ClosureCodingConvention_getSingletonGetterClassName_1481393479407() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term144631 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term144723 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term144815 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term144723, term144723.getClass(), "first", term144815);
        term144835 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(term144835, term144835.getClass(), "propertyTestFunctions", null);
        term144836 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term144837 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term144836, term144836.getClass(), "number", 0.0);
        setIntField(term144836, term144836.getClass(), "type", 0);
        setField(term144836, term144836.getClass(), "next", null);
        setField(term144837, term144837.getClass(), "str", null);
        setIntField(term144837, term144837.getClass(), "type", 0);
        setField(term144837, term144837.getClass(), "next", null);
        setField(term144837, term144837.getClass(), "first", null);
        setField(term144837, term144837.getClass(), "last", null);
        setField(term144837, term144837.getClass(), "propListHead", null);
        setIntField(term144837, term144837.getClass(), "sourcePosition", 0);
        setField(term144837, term144837.getClass(), "jsType", null);
        setField(term144837, term144837.getClass(), "parent", null);
        setField(term144836, term144836.getClass(), "first", term144837);
        setField(term144836, term144836.getClass(), "last", null);
        setField(term144836, term144836.getClass(), "propListHead", null);
        setIntField(term144836, term144836.getClass(), "sourcePosition", 0);
        setField(term144836, term144836.getClass(), "jsType", null);
        setField(term144836, term144836.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term144723;
        Object retValue = callMethod(klass, "getSingletonGetterClassName", argTypes, term144631, args);
        assertTrue(recursiveEquals(term144631, term144835));
        assertTrue(recursiveEquals(term144723, term144836));
        assertTrue(recursiveEquals(retValue, null));
    }

};


