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

public class FunctionTypeBuilder_inferParameterTypes_212883572159 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term76489;
     Object term76559;
     Object term76639;
     Object term76684;
     Object term76685;
     Object term76686;
     Object term76678;

    public FunctionTypeBuilder_inferParameterTypes_212883572159() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term76489 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        setField(term76489, term76489.getClass(), "typeRegistry", null);
        term76559 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term76559, term76559.getClass(), "first", null);
        term76639 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term76639, term76639.getClass(), "info", null);
        term76684 = newInstance(Class.forName("com.google.common.collect.EmptyImmutableSet"));
        setField(term76684, term76684.getClass(), "asList", null);
        term76685 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term76685, term76685.getClass(), "info", null);
        setField(term76685, term76685.getClass(), "documentation", null);
        setField(term76685, term76685.getClass(), "sourceName", null);
        setField(term76685, term76685.getClass(), "visibility", null);
        setIntField(term76685, term76685.getClass(), "bitset", 0);
        setField(term76685, term76685.getClass(), "type", null);
        setField(term76685, term76685.getClass(), "thisType", null);
        setBooleanField(term76685, term76685.getClass(), "includeDocumentation", false);
        term76686 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term76686, term76686.getClass(), "type", 0);
        setField(term76686, term76686.getClass(), "next", null);
        setField(term76686, term76686.getClass(), "first", null);
        setField(term76686, term76686.getClass(), "last", null);
        setField(term76686, term76686.getClass(), "propListHead", null);
        setIntField(term76686, term76686.getClass(), "sourcePosition", 0);
        setField(term76686, term76686.getClass(), "jsType", null);
        setField(term76686, term76686.getClass(), "parent", null);
        term76678 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term76681 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term76678, term76678.getClass(), "fnName", null);
        setField(term76678, term76678.getClass(), "compiler", null);
        setField(term76678, term76678.getClass(), "codingConvention", null);
        setField(term76678, term76678.getClass(), "typeRegistry", null);
        setField(term76678, term76678.getClass(), "errorRoot", null);
        setField(term76678, term76678.getClass(), "sourceName", null);
        setField(term76678, term76678.getClass(), "scope", null);
        setField(term76678, term76678.getClass(), "returnType", null);
        setField(term76678, term76678.getClass(), "implementedInterfaces", null);
        setField(term76678, term76678.getClass(), "baseType", null);
        setField(term76678, term76678.getClass(), "thisType", null);
        setBooleanField(term76678, term76678.getClass(), "isConstructor", false);
        setBooleanField(term76678, term76678.getClass(), "isInterface", false);
        setIntField(term76681, term76681.getClass(), "type", 83);
        setField(term76681, term76681.getClass(), "next", null);
        setField(term76681, term76681.getClass(), "first", null);
        setField(term76681, term76681.getClass(), "last", null);
        setField(term76681, term76681.getClass(), "propListHead", null);
        setIntField(term76681, term76681.getClass(), "sourcePosition", -1);
        setField(term76681, term76681.getClass(), "jsType", null);
        setField(term76681, term76681.getClass(), "parent", null);
        setField(term76678, term76678.getClass(), "parametersNode", term76681);
        setField(term76678, term76678.getClass(), "sourceNode", null);
        setField(term76678, term76678.getClass(), "templateTypeName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[2];
        args[0] = term76559;
        args[1] = term76639;
        Object retValue = callMethod(klass, "inferParameterTypes", argTypes, term76489, args);
        assertTrue(recursiveEquals(term76489, term76684));
        assertTrue(recursiveEquals(term76559, term76685));
        assertTrue(recursiveEquals(term76639, term76686));
        assertTrue(recursiveEquals(retValue, term76678));
    }

};


