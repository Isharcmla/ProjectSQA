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

public class ClosureCodingConvention_extractClassNameIfRequire_262514769568 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term183643;
     Object term183713;
     Object term183783;
     Object term193916;
     Object term193917;
     Object term193919;

    public ClosureCodingConvention_extractClassNameIfRequire_262514769568() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term183643 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term183713 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        term183783 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term183853 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term183783, term183783.getClass(), "type", 130);
        setIntField(term183853, term183853.getClass(), "type", 37);
        setField(term183783, term183783.getClass(), "first", term183853);
        term193916 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(term193916, term193916.getClass(), "propertyTestFunctions", null);
        term193917 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term193918 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term193917, term193917.getClass(), "type", 130);
        setField(term193917, term193917.getClass(), "next", null);
        setIntField(term193918, term193918.getClass(), "type", 37);
        setField(term193918, term193918.getClass(), "next", null);
        setField(term193918, term193918.getClass(), "first", null);
        setField(term193918, term193918.getClass(), "last", null);
        setField(term193918, term193918.getClass(), "propListHead", null);
        setIntField(term193918, term193918.getClass(), "sourcePosition", 0);
        setField(term193918, term193918.getClass(), "jsType", null);
        setField(term193918, term193918.getClass(), "parent", null);
        setField(term193917, term193917.getClass(), "first", term193918);
        setField(term193917, term193917.getClass(), "last", null);
        setField(term193917, term193917.getClass(), "propListHead", null);
        setIntField(term193917, term193917.getClass(), "sourcePosition", 0);
        setField(term193917, term193917.getClass(), "jsType", null);
        setField(term193917, term193917.getClass(), "parent", null);
        term193919 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term193919, term193919.getClass(), "type", 0);
        setField(term193919, term193919.getClass(), "next", null);
        setField(term193919, term193919.getClass(), "first", null);
        setField(term193919, term193919.getClass(), "last", null);
        setField(term193919, term193919.getClass(), "propListHead", null);
        setIntField(term193919, term193919.getClass(), "sourcePosition", 0);
        setField(term193919, term193919.getClass(), "jsType", null);
        setField(term193919, term193919.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term183713;
        args[1] = term183783;
        Object retValue = callMethod(klass, "extractClassNameIfRequire", argTypes, term183643, args);
        assertTrue(recursiveEquals(term183643, term193916));
        assertTrue(recursiveEquals(term183713, term193917));
        assertTrue(recursiveEquals(term183783, term193919));
        assertTrue(recursiveEquals(retValue, null));
    }

};


