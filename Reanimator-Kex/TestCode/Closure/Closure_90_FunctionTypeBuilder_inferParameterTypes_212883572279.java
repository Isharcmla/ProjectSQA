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

public class FunctionTypeBuilder_inferParameterTypes_212883572279 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term105407;
     Object term105487;
     Object term105810;
     Object term105811;
     Object term105796;

    public FunctionTypeBuilder_inferParameterTypes_212883572279() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term105407 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        setField(term105407, term105407.getClass(), "parametersNode", null);
        setField(term105407, term105407.getClass(), "typeRegistry", null);
        term105487 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term105487, term105487.getClass(), "info", null);
        term105810 = newInstance(Class.forName("com.google.common.collect.EmptyImmutableSet"));
        setField(term105810, term105810.getClass(), "asList", null);
        term105811 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term105811, term105811.getClass(), "info", null);
        setField(term105811, term105811.getClass(), "documentation", null);
        setField(term105811, term105811.getClass(), "sourceName", null);
        setField(term105811, term105811.getClass(), "visibility", null);
        setIntField(term105811, term105811.getClass(), "bitset", 0);
        setField(term105811, term105811.getClass(), "type", null);
        setField(term105811, term105811.getClass(), "thisType", null);
        setBooleanField(term105811, term105811.getClass(), "includeDocumentation", false);
        term105796 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term105800 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term105796, term105796.getClass(), "fnName", null);
        setField(term105796, term105796.getClass(), "compiler", null);
        setField(term105796, term105796.getClass(), "codingConvention", null);
        setField(term105796, term105796.getClass(), "typeRegistry", null);
        setField(term105796, term105796.getClass(), "errorRoot", null);
        setField(term105796, term105796.getClass(), "sourceName", null);
        setField(term105796, term105796.getClass(), "scope", null);
        setField(term105796, term105796.getClass(), "returnType", null);
        setBooleanField(term105796, term105796.getClass(), "returnTypeInferred", false);
        setField(term105796, term105796.getClass(), "implementedInterfaces", null);
        setField(term105796, term105796.getClass(), "baseType", null);
        setField(term105796, term105796.getClass(), "thisType", null);
        setBooleanField(term105796, term105796.getClass(), "isConstructor", false);
        setBooleanField(term105796, term105796.getClass(), "isInterface", false);
        setIntField(term105800, term105800.getClass(), "type", 83);
        setField(term105800, term105800.getClass(), "next", null);
        setField(term105800, term105800.getClass(), "first", null);
        setField(term105800, term105800.getClass(), "last", null);
        setField(term105800, term105800.getClass(), "propListHead", null);
        setIntField(term105800, term105800.getClass(), "sourcePosition", -1);
        setField(term105800, term105800.getClass(), "jsType", null);
        setField(term105800, term105800.getClass(), "parent", null);
        setField(term105796, term105796.getClass(), "parametersNode", term105800);
        setField(term105796, term105796.getClass(), "sourceNode", null);
        setField(term105796, term105796.getClass(), "templateTypeName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term105487;
        Object retValue = callMethod(klass, "inferParameterTypes", argTypes, term105407, args);
        assertTrue(recursiveEquals(term105407, term105810));
        assertTrue(recursiveEquals(term105487, null));
        assertTrue(recursiveEquals(retValue, term105796));
    }

};


