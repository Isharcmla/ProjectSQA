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

public class TypeValidator_expectBitwiseable_101351708188 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21502;
     Object term21600;
     Object term21860;
     Object term21861;

    public TypeValidator_expectBitwiseable_101351708188() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21502 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        term21600 = newInstance(Class.forName("com.google.javascript.rhino.jstype.BooleanType"));
        term21860 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term21860, term21860.getClass(), "compiler", null);
        setField(term21860, term21860.getClass(), "typeRegistry", null);
        setField(term21860, term21860.getClass(), "allValueTypes", null);
        setBooleanField(term21860, term21860.getClass(), "shouldReport", false);
        setField(term21860, term21860.getClass(), "nullOrUndefined", null);
        setField(term21860, term21860.getClass(), "mismatches", null);
        term21861 = newInstance(Class.forName("com.google.javascript.rhino.jstype.BooleanType"));
        setBooleanField(term21861, term21861.getClass(), "resolved", false);
        setField(term21861, term21861.getClass(), "resolveResult", null);
        setField(term21861, term21861.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[3] = Class.forName("java.lang.String");
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = null;
        args[2] = term21600;
        args[3] = null;
        callMethod(klass, "expectBitwiseable", argTypes, term21502, args);
        assertTrue(recursiveEquals(term21502, term21860));
        assertTrue(recursiveEquals(term21600, null));
    }

};


