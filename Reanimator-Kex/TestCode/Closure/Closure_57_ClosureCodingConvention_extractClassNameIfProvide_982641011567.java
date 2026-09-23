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

public class ClosureCodingConvention_extractClassNameIfProvide_982641011567 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term183231;
     Object term183323;
     Object term183415;
     Object term193875;
     Object term193876;
     Object term193878;

    public ClosureCodingConvention_extractClassNameIfProvide_982641011567() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term183231 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term183323 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        term183415 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term183507 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term183415, term183415.getClass(), "type", 130);
        setIntField(term183507, term183507.getClass(), "type", 37);
        setField(term183415, term183415.getClass(), "first", term183507);
        term193875 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(term193875, term193875.getClass(), "propertyTestFunctions", null);
        term193876 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term193877 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term193876, term193876.getClass(), "str", null);
        setIntField(term193876, term193876.getClass(), "type", 130);
        setField(term193876, term193876.getClass(), "next", null);
        setDoubleField(term193877, term193877.getClass(), "number", 0.0);
        setIntField(term193877, term193877.getClass(), "type", 37);
        setField(term193877, term193877.getClass(), "next", null);
        setField(term193877, term193877.getClass(), "first", null);
        setField(term193877, term193877.getClass(), "last", null);
        setField(term193877, term193877.getClass(), "propListHead", null);
        setIntField(term193877, term193877.getClass(), "sourcePosition", 0);
        setField(term193877, term193877.getClass(), "jsType", null);
        setField(term193877, term193877.getClass(), "parent", null);
        setField(term193876, term193876.getClass(), "first", term193877);
        setField(term193876, term193876.getClass(), "last", null);
        setField(term193876, term193876.getClass(), "propListHead", null);
        setIntField(term193876, term193876.getClass(), "sourcePosition", 0);
        setField(term193876, term193876.getClass(), "jsType", null);
        setField(term193876, term193876.getClass(), "parent", null);
        term193878 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term193878, term193878.getClass(), "number", 0.0);
        setIntField(term193878, term193878.getClass(), "type", 0);
        setField(term193878, term193878.getClass(), "next", null);
        setField(term193878, term193878.getClass(), "first", null);
        setField(term193878, term193878.getClass(), "last", null);
        setField(term193878, term193878.getClass(), "propListHead", null);
        setIntField(term193878, term193878.getClass(), "sourcePosition", 0);
        setField(term193878, term193878.getClass(), "jsType", null);
        setField(term193878, term193878.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term183323;
        args[1] = term183415;
        Object retValue = callMethod(klass, "extractClassNameIfProvide", argTypes, term183231, args);
        assertTrue(recursiveEquals(term183231, term193875));
        assertTrue(recursiveEquals(term183323, term193876));
        assertTrue(recursiveEquals(term183415, term193878));
        assertTrue(recursiveEquals(retValue, null));
    }

};


