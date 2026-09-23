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

public class FunctionTypeBuilder_inferParameterTypes_1660322551269 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term102254;
     Object term102420;
     Object term102494;
     Object term102495;
     Object term102487;

    public FunctionTypeBuilder_inferParameterTypes_1660322551269() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term102254 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term102340 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term102254, term102254.getClass(), "parametersNode", term102340);
        term102420 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term102420, term102420.getClass(), "info", null);
        term102494 = newInstance(Class.forName("com.google.common.collect.EmptyImmutableSet"));
        setField(term102494, term102494.getClass(), "asList", null);
        term102495 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term102495, term102495.getClass(), "info", null);
        setField(term102495, term102495.getClass(), "documentation", null);
        setField(term102495, term102495.getClass(), "sourceName", null);
        setField(term102495, term102495.getClass(), "visibility", null);
        setIntField(term102495, term102495.getClass(), "bitset", 0);
        setField(term102495, term102495.getClass(), "type", null);
        setField(term102495, term102495.getClass(), "thisType", null);
        setBooleanField(term102495, term102495.getClass(), "includeDocumentation", false);
        term102487 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term102491 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term102487, term102487.getClass(), "fnName", null);
        setField(term102487, term102487.getClass(), "compiler", null);
        setField(term102487, term102487.getClass(), "codingConvention", null);
        setField(term102487, term102487.getClass(), "typeRegistry", null);
        setField(term102487, term102487.getClass(), "errorRoot", null);
        setField(term102487, term102487.getClass(), "sourceName", null);
        setField(term102487, term102487.getClass(), "scope", null);
        setField(term102487, term102487.getClass(), "returnType", null);
        setBooleanField(term102487, term102487.getClass(), "returnTypeInferred", false);
        setField(term102487, term102487.getClass(), "implementedInterfaces", null);
        setField(term102487, term102487.getClass(), "baseType", null);
        setField(term102487, term102487.getClass(), "thisType", null);
        setBooleanField(term102487, term102487.getClass(), "isConstructor", false);
        setBooleanField(term102487, term102487.getClass(), "isInterface", false);
        setIntField(term102491, term102491.getClass(), "type", 83);
        setField(term102491, term102491.getClass(), "next", null);
        setField(term102491, term102491.getClass(), "first", null);
        setField(term102491, term102491.getClass(), "last", null);
        setField(term102491, term102491.getClass(), "propListHead", null);
        setIntField(term102491, term102491.getClass(), "sourcePosition", -1);
        setField(term102491, term102491.getClass(), "jsType", null);
        setField(term102491, term102491.getClass(), "parent", null);
        setField(term102487, term102487.getClass(), "parametersNode", term102491);
        setField(term102487, term102487.getClass(), "sourceNode", null);
        setField(term102487, term102487.getClass(), "templateTypeName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[1];
        args[0] = term102420;
        Object retValue = callMethod(klass, "inferParameterTypes", argTypes, term102254, args);
        assertTrue(recursiveEquals(term102254, term102494));
        assertTrue(recursiveEquals(term102420, term102495));
        assertTrue(recursiveEquals(retValue, term102487));
    }

};


