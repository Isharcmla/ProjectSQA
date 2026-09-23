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

public class ClosureCodingConvention_getObjectLiteralCast_148496234436 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term148896;
     Object term148988;
     Object term149425;
     Object term149426;

    public ClosureCodingConvention_getObjectLiteralCast_148496234436() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term148896 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term148988 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term149080 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term148988, term148988.getClass(), "type", 37);
        setField(term148988, term148988.getClass(), "first", term149080);
        term149425 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(term149425, term149425.getClass(), "propertyTestFunctions", null);
        term149426 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term149427 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term149426, term149426.getClass(), "str", null);
        setIntField(term149426, term149426.getClass(), "type", 37);
        setField(term149426, term149426.getClass(), "next", null);
        setField(term149427, term149427.getClass(), "str", null);
        setIntField(term149427, term149427.getClass(), "type", 0);
        setField(term149427, term149427.getClass(), "next", null);
        setField(term149427, term149427.getClass(), "first", null);
        setField(term149427, term149427.getClass(), "last", null);
        setField(term149427, term149427.getClass(), "propListHead", null);
        setIntField(term149427, term149427.getClass(), "sourcePosition", 0);
        setField(term149427, term149427.getClass(), "jsType", null);
        setField(term149427, term149427.getClass(), "parent", null);
        setField(term149426, term149426.getClass(), "first", term149427);
        setField(term149426, term149426.getClass(), "last", null);
        setField(term149426, term149426.getClass(), "propListHead", null);
        setIntField(term149426, term149426.getClass(), "sourcePosition", 0);
        setField(term149426, term149426.getClass(), "jsType", null);
        setField(term149426, term149426.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term148988;
        Object retValue = callMethod(klass, "getObjectLiteralCast", argTypes, term148896, args);
        assertTrue(recursiveEquals(term148896, term149425));
        assertTrue(recursiveEquals(term148988, null));
        assertTrue(recursiveEquals(retValue, null));
    }

};


