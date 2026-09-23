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

public class FunctionTypeBuilder_inferParameterTypes_1660322551283 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term106620;
     Object term106770;
     Object term106836;
     Object term106837;
     Object term106829;

    public FunctionTypeBuilder_inferParameterTypes_1660322551283() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term106620 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term106690 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term106690, term106690.getClass(), "first", null);
        setField(term106620, term106620.getClass(), "parametersNode", term106690);
        setField(term106620, term106620.getClass(), "typeRegistry", null);
        term106770 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term106770, term106770.getClass(), "info", null);
        term106836 = newInstance(Class.forName("com.google.common.collect.EmptyImmutableSet"));
        setField(term106836, term106836.getClass(), "asList", null);
        term106837 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term106837, term106837.getClass(), "info", null);
        setField(term106837, term106837.getClass(), "documentation", null);
        setField(term106837, term106837.getClass(), "sourceName", null);
        setField(term106837, term106837.getClass(), "visibility", null);
        setIntField(term106837, term106837.getClass(), "bitset", 0);
        setField(term106837, term106837.getClass(), "type", null);
        setField(term106837, term106837.getClass(), "thisType", null);
        setBooleanField(term106837, term106837.getClass(), "includeDocumentation", false);
        term106829 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term106833 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term106829, term106829.getClass(), "fnName", null);
        setField(term106829, term106829.getClass(), "compiler", null);
        setField(term106829, term106829.getClass(), "codingConvention", null);
        setField(term106829, term106829.getClass(), "typeRegistry", null);
        setField(term106829, term106829.getClass(), "errorRoot", null);
        setField(term106829, term106829.getClass(), "sourceName", null);
        setField(term106829, term106829.getClass(), "scope", null);
        setField(term106829, term106829.getClass(), "returnType", null);
        setBooleanField(term106829, term106829.getClass(), "returnTypeInferred", false);
        setField(term106829, term106829.getClass(), "implementedInterfaces", null);
        setField(term106829, term106829.getClass(), "baseType", null);
        setField(term106829, term106829.getClass(), "thisType", null);
        setBooleanField(term106829, term106829.getClass(), "isConstructor", false);
        setBooleanField(term106829, term106829.getClass(), "isInterface", false);
        setIntField(term106833, term106833.getClass(), "type", 83);
        setField(term106833, term106833.getClass(), "next", null);
        setField(term106833, term106833.getClass(), "first", null);
        setField(term106833, term106833.getClass(), "last", null);
        setField(term106833, term106833.getClass(), "propListHead", null);
        setIntField(term106833, term106833.getClass(), "sourcePosition", -1);
        setField(term106833, term106833.getClass(), "jsType", null);
        setField(term106833, term106833.getClass(), "parent", null);
        setField(term106829, term106829.getClass(), "parametersNode", term106833);
        setField(term106829, term106829.getClass(), "sourceNode", null);
        setField(term106829, term106829.getClass(), "templateTypeName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[1];
        args[0] = term106770;
        Object retValue = callMethod(klass, "inferParameterTypes", argTypes, term106620, args);
        assertTrue(recursiveEquals(term106620, term106836));
        assertTrue(recursiveEquals(term106770, term106837));
        assertTrue(recursiveEquals(retValue, term106829));
    }

};


