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

public class ClosureCodingConvention_extractClassNameIfProvide_982641011375 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term139159;
     Object term139251;
     Object term139380;
     Object term139381;

    public ClosureCodingConvention_extractClassNameIfProvide_982641011375() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term139159 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term139251 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term139343 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term139251, term139251.getClass(), "type", 130);
        setField(term139251, term139251.getClass(), "first", term139343);
        term139380 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(term139380, term139380.getClass(), "propertyTestFunctions", null);
        term139381 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term139382 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term139381, term139381.getClass(), "str", null);
        setIntField(term139381, term139381.getClass(), "type", 130);
        setField(term139381, term139381.getClass(), "next", null);
        setDoubleField(term139382, term139382.getClass(), "number", 0.0);
        setIntField(term139382, term139382.getClass(), "type", 0);
        setField(term139382, term139382.getClass(), "next", null);
        setField(term139382, term139382.getClass(), "first", null);
        setField(term139382, term139382.getClass(), "last", null);
        setField(term139382, term139382.getClass(), "propListHead", null);
        setIntField(term139382, term139382.getClass(), "sourcePosition", 0);
        setField(term139382, term139382.getClass(), "jsType", null);
        setField(term139382, term139382.getClass(), "parent", null);
        setField(term139381, term139381.getClass(), "first", term139382);
        setField(term139381, term139381.getClass(), "last", null);
        setField(term139381, term139381.getClass(), "propListHead", null);
        setIntField(term139381, term139381.getClass(), "sourcePosition", 0);
        setField(term139381, term139381.getClass(), "jsType", null);
        setField(term139381, term139381.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term139251;
        Object retValue = callMethod(klass, "extractClassNameIfProvide", argTypes, term139159, args);
        assertTrue(recursiveEquals(term139159, term139380));
        assertTrue(recursiveEquals(term139251, null));
        assertTrue(recursiveEquals(retValue, null));
    }

};


