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

public class FunctionTypeBuilder_inferParameterTypes_166032255184 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26233;
     Object term26313;
     Object term27507;
     Object term27508;
     Object term27500;

    public FunctionTypeBuilder_inferParameterTypes_166032255184() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26233 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        term26313 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        term27507 = newInstance(Class.forName("com.google.common.collect.EmptyImmutableSet"));
        setField(term27507, term27507.getClass(), "asList", null);
        term27508 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term27508, term27508.getClass(), "info", null);
        setField(term27508, term27508.getClass(), "documentation", null);
        setField(term27508, term27508.getClass(), "associatedNode", null);
        setField(term27508, term27508.getClass(), "visibility", null);
        setIntField(term27508, term27508.getClass(), "bitset", 0);
        setField(term27508, term27508.getClass(), "type", null);
        setField(term27508, term27508.getClass(), "thisType", null);
        setBooleanField(term27508, term27508.getClass(), "includeDocumentation", false);
        term27500 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term27504 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term27500, term27500.getClass(), "fnName", null);
        setField(term27500, term27500.getClass(), "compiler", null);
        setField(term27500, term27500.getClass(), "codingConvention", null);
        setField(term27500, term27500.getClass(), "typeRegistry", null);
        setField(term27500, term27500.getClass(), "errorRoot", null);
        setField(term27500, term27500.getClass(), "sourceName", null);
        setField(term27500, term27500.getClass(), "scope", null);
        setField(term27500, term27500.getClass(), "contents", null);
        setField(term27500, term27500.getClass(), "returnType", null);
        setBooleanField(term27500, term27500.getClass(), "returnTypeInferred", false);
        setField(term27500, term27500.getClass(), "implementedInterfaces", null);
        setField(term27500, term27500.getClass(), "extendedInterfaces", null);
        setField(term27500, term27500.getClass(), "baseType", null);
        setField(term27500, term27500.getClass(), "thisType", null);
        setBooleanField(term27500, term27500.getClass(), "isConstructor", false);
        setBooleanField(term27500, term27500.getClass(), "isInterface", false);
        setIntField(term27504, term27504.getClass(), "type", 83);
        setField(term27504, term27504.getClass(), "next", null);
        setField(term27504, term27504.getClass(), "first", null);
        setField(term27504, term27504.getClass(), "last", null);
        setField(term27504, term27504.getClass(), "propListHead", null);
        setIntField(term27504, term27504.getClass(), "sourcePosition", -1);
        setField(term27504, term27504.getClass(), "jsType", null);
        setField(term27504, term27504.getClass(), "parent", null);
        setField(term27500, term27500.getClass(), "parametersNode", term27504);
        setField(term27500, term27500.getClass(), "templateTypeName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[1];
        args[0] = term26313;
        Object retValue = callMethod(klass, "inferParameterTypes", argTypes, term26233, args);
        assertTrue(recursiveEquals(term26233, term27507));
        assertTrue(recursiveEquals(term26313, term27508));
        assertTrue(recursiveEquals(retValue, term27500));
    }

};


