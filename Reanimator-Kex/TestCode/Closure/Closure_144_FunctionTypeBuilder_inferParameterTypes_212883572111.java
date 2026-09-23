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

public class FunctionTypeBuilder_inferParameterTypes_212883572111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60482;
     Object term60552;
     Object term60583;
     Object term60585;
     Object term60577;

    public FunctionTypeBuilder_inferParameterTypes_212883572111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term60482 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        term60552 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        term60583 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term60584 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term60583, term60583.getClass(), "fnName", null);
        setField(term60583, term60583.getClass(), "compiler", null);
        setField(term60583, term60583.getClass(), "codingConvention", null);
        setField(term60583, term60583.getClass(), "typeRegistry", null);
        setField(term60583, term60583.getClass(), "errorRoot", null);
        setField(term60583, term60583.getClass(), "sourceName", null);
        setField(term60583, term60583.getClass(), "scope", null);
        setField(term60583, term60583.getClass(), "returnType", null);
        setField(term60583, term60583.getClass(), "implementedInterfaces", null);
        setField(term60583, term60583.getClass(), "baseType", null);
        setField(term60583, term60583.getClass(), "thisType", null);
        setBooleanField(term60583, term60583.getClass(), "isConstructor", false);
        setBooleanField(term60583, term60583.getClass(), "isInterface", false);
        setIntField(term60584, term60584.getClass(), "type", 83);
        setField(term60584, term60584.getClass(), "next", null);
        setField(term60584, term60584.getClass(), "first", null);
        setField(term60584, term60584.getClass(), "last", null);
        setField(term60584, term60584.getClass(), "propListHead", null);
        setIntField(term60584, term60584.getClass(), "sourcePosition", -1);
        setField(term60584, term60584.getClass(), "jsType", null);
        setField(term60584, term60584.getClass(), "parent", null);
        setField(term60583, term60583.getClass(), "parametersNode", term60584);
        setField(term60583, term60583.getClass(), "sourceNode", null);
        setField(term60583, term60583.getClass(), "templateTypeName", null);
        term60585 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term60585, term60585.getClass(), "type", 0);
        setField(term60585, term60585.getClass(), "next", null);
        setField(term60585, term60585.getClass(), "first", null);
        setField(term60585, term60585.getClass(), "last", null);
        setField(term60585, term60585.getClass(), "propListHead", null);
        setIntField(term60585, term60585.getClass(), "sourcePosition", 0);
        setField(term60585, term60585.getClass(), "jsType", null);
        setField(term60585, term60585.getClass(), "parent", null);
        term60577 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term60580 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term60577, term60577.getClass(), "fnName", null);
        setField(term60577, term60577.getClass(), "compiler", null);
        setField(term60577, term60577.getClass(), "codingConvention", null);
        setField(term60577, term60577.getClass(), "typeRegistry", null);
        setField(term60577, term60577.getClass(), "errorRoot", null);
        setField(term60577, term60577.getClass(), "sourceName", null);
        setField(term60577, term60577.getClass(), "scope", null);
        setField(term60577, term60577.getClass(), "returnType", null);
        setField(term60577, term60577.getClass(), "implementedInterfaces", null);
        setField(term60577, term60577.getClass(), "baseType", null);
        setField(term60577, term60577.getClass(), "thisType", null);
        setBooleanField(term60577, term60577.getClass(), "isConstructor", false);
        setBooleanField(term60577, term60577.getClass(), "isInterface", false);
        setIntField(term60580, term60580.getClass(), "type", 83);
        setField(term60580, term60580.getClass(), "next", null);
        setField(term60580, term60580.getClass(), "first", null);
        setField(term60580, term60580.getClass(), "last", null);
        setField(term60580, term60580.getClass(), "propListHead", null);
        setIntField(term60580, term60580.getClass(), "sourcePosition", -1);
        setField(term60580, term60580.getClass(), "jsType", null);
        setField(term60580, term60580.getClass(), "parent", null);
        setField(term60577, term60577.getClass(), "parametersNode", term60580);
        setField(term60577, term60577.getClass(), "sourceNode", null);
        setField(term60577, term60577.getClass(), "templateTypeName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[2];
        args[0] = term60552;
        args[1] = null;
        Object retValue = callMethod(klass, "inferParameterTypes", argTypes, term60482, args);
        assertTrue(recursiveEquals(term60482, term60583));
        assertTrue(recursiveEquals(term60552, term60585));
        assertTrue(recursiveEquals(retValue, term60577));
    }

};


