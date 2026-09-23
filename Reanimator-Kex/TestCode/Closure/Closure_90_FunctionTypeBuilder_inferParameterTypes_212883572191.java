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

public class FunctionTypeBuilder_inferParameterTypes_212883572191 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term76298;
     Object term76368;
     Object term76448;
     Object term76892;
     Object term76893;
     Object term76894;
     Object term76885;

    public FunctionTypeBuilder_inferParameterTypes_212883572191() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term76298 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        setField(term76298, term76298.getClass(), "parametersNode", null);
        setField(term76298, term76298.getClass(), "typeRegistry", null);
        term76368 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        term76448 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        term76892 = newInstance(Class.forName("com.google.common.collect.EmptyImmutableSet"));
        setField(term76892, term76892.getClass(), "asList", null);
        term76893 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term76893, term76893.getClass(), "info", null);
        setField(term76893, term76893.getClass(), "documentation", null);
        setField(term76893, term76893.getClass(), "sourceName", null);
        setField(term76893, term76893.getClass(), "visibility", null);
        setIntField(term76893, term76893.getClass(), "bitset", 0);
        setField(term76893, term76893.getClass(), "type", null);
        setField(term76893, term76893.getClass(), "thisType", null);
        setBooleanField(term76893, term76893.getClass(), "includeDocumentation", false);
        term76894 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term76894, term76894.getClass(), "type", 0);
        setField(term76894, term76894.getClass(), "next", null);
        setField(term76894, term76894.getClass(), "first", null);
        setField(term76894, term76894.getClass(), "last", null);
        setField(term76894, term76894.getClass(), "propListHead", null);
        setIntField(term76894, term76894.getClass(), "sourcePosition", 0);
        setField(term76894, term76894.getClass(), "jsType", null);
        setField(term76894, term76894.getClass(), "parent", null);
        term76885 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term76889 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term76885, term76885.getClass(), "fnName", null);
        setField(term76885, term76885.getClass(), "compiler", null);
        setField(term76885, term76885.getClass(), "codingConvention", null);
        setField(term76885, term76885.getClass(), "typeRegistry", null);
        setField(term76885, term76885.getClass(), "errorRoot", null);
        setField(term76885, term76885.getClass(), "sourceName", null);
        setField(term76885, term76885.getClass(), "scope", null);
        setField(term76885, term76885.getClass(), "returnType", null);
        setBooleanField(term76885, term76885.getClass(), "returnTypeInferred", false);
        setField(term76885, term76885.getClass(), "implementedInterfaces", null);
        setField(term76885, term76885.getClass(), "baseType", null);
        setField(term76885, term76885.getClass(), "thisType", null);
        setBooleanField(term76885, term76885.getClass(), "isConstructor", false);
        setBooleanField(term76885, term76885.getClass(), "isInterface", false);
        setIntField(term76889, term76889.getClass(), "type", 83);
        setField(term76889, term76889.getClass(), "next", null);
        setField(term76889, term76889.getClass(), "first", null);
        setField(term76889, term76889.getClass(), "last", null);
        setField(term76889, term76889.getClass(), "propListHead", null);
        setIntField(term76889, term76889.getClass(), "sourcePosition", -1);
        setField(term76889, term76889.getClass(), "jsType", null);
        setField(term76889, term76889.getClass(), "parent", null);
        setField(term76885, term76885.getClass(), "parametersNode", term76889);
        setField(term76885, term76885.getClass(), "sourceNode", null);
        setField(term76885, term76885.getClass(), "templateTypeName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[2];
        args[0] = term76368;
        args[1] = term76448;
        Object retValue = callMethod(klass, "inferParameterTypes", argTypes, term76298, args);
        assertTrue(recursiveEquals(term76298, term76892));
        assertTrue(recursiveEquals(term76368, term76893));
        assertTrue(recursiveEquals(term76448, term76894));
        assertTrue(recursiveEquals(retValue, term76885));
    }

};


