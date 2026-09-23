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

public class FunctionTypeBuilder_inferParameterTypes_1660322551145 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term72245;
     Object term72325;
     Object term72385;
     Object term72386;
     Object term72379;

    public FunctionTypeBuilder_inferParameterTypes_1660322551145() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term72245 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        setField(term72245, term72245.getClass(), "typeRegistry", null);
        term72325 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term72325, term72325.getClass(), "info", null);
        term72385 = newInstance(Class.forName("com.google.common.collect.EmptyImmutableSet"));
        setField(term72385, term72385.getClass(), "asList", null);
        term72386 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term72386, term72386.getClass(), "info", null);
        setField(term72386, term72386.getClass(), "documentation", null);
        setField(term72386, term72386.getClass(), "sourceName", null);
        setField(term72386, term72386.getClass(), "visibility", null);
        setIntField(term72386, term72386.getClass(), "bitset", 0);
        setField(term72386, term72386.getClass(), "type", null);
        setField(term72386, term72386.getClass(), "thisType", null);
        setBooleanField(term72386, term72386.getClass(), "includeDocumentation", false);
        term72379 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term72382 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term72379, term72379.getClass(), "fnName", null);
        setField(term72379, term72379.getClass(), "compiler", null);
        setField(term72379, term72379.getClass(), "codingConvention", null);
        setField(term72379, term72379.getClass(), "typeRegistry", null);
        setField(term72379, term72379.getClass(), "errorRoot", null);
        setField(term72379, term72379.getClass(), "sourceName", null);
        setField(term72379, term72379.getClass(), "scope", null);
        setField(term72379, term72379.getClass(), "returnType", null);
        setField(term72379, term72379.getClass(), "implementedInterfaces", null);
        setField(term72379, term72379.getClass(), "baseType", null);
        setField(term72379, term72379.getClass(), "thisType", null);
        setBooleanField(term72379, term72379.getClass(), "isConstructor", false);
        setBooleanField(term72379, term72379.getClass(), "isInterface", false);
        setIntField(term72382, term72382.getClass(), "type", 83);
        setField(term72382, term72382.getClass(), "next", null);
        setField(term72382, term72382.getClass(), "first", null);
        setField(term72382, term72382.getClass(), "last", null);
        setField(term72382, term72382.getClass(), "propListHead", null);
        setIntField(term72382, term72382.getClass(), "sourcePosition", -1);
        setField(term72382, term72382.getClass(), "jsType", null);
        setField(term72382, term72382.getClass(), "parent", null);
        setField(term72379, term72379.getClass(), "parametersNode", term72382);
        setField(term72379, term72379.getClass(), "sourceNode", null);
        setField(term72379, term72379.getClass(), "templateTypeName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[1];
        args[0] = term72325;
        Object retValue = callMethod(klass, "inferParameterTypes", argTypes, term72245, args);
        assertTrue(recursiveEquals(term72245, term72385));
        assertTrue(recursiveEquals(term72325, term72386));
        assertTrue(recursiveEquals(retValue, term72379));
    }

};


