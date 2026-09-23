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

public class FunctionTypeBuilder_inferParameterTypes_21288357287 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27885;
     Object term27955;
     Object term28035;
     Object term28092;
     Object term28093;
     Object term28094;
     Object term28085;

    public FunctionTypeBuilder_inferParameterTypes_21288357287() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27885 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        setField(term27885, term27885.getClass(), "parametersNode", null);
        setField(term27885, term27885.getClass(), "typeRegistry", null);
        term27955 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        term28035 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        term28092 = newInstance(Class.forName("com.google.common.collect.EmptyImmutableSet"));
        setField(term28092, term28092.getClass(), "asList", null);
        term28093 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term28093, term28093.getClass(), "info", null);
        setField(term28093, term28093.getClass(), "documentation", null);
        setField(term28093, term28093.getClass(), "associatedNode", null);
        setField(term28093, term28093.getClass(), "visibility", null);
        setIntField(term28093, term28093.getClass(), "bitset", 0);
        setField(term28093, term28093.getClass(), "type", null);
        setField(term28093, term28093.getClass(), "thisType", null);
        setBooleanField(term28093, term28093.getClass(), "includeDocumentation", false);
        term28094 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term28094, term28094.getClass(), "type", 0);
        setField(term28094, term28094.getClass(), "next", null);
        setField(term28094, term28094.getClass(), "first", null);
        setField(term28094, term28094.getClass(), "last", null);
        setField(term28094, term28094.getClass(), "propListHead", null);
        setIntField(term28094, term28094.getClass(), "sourcePosition", 0);
        setField(term28094, term28094.getClass(), "jsType", null);
        setField(term28094, term28094.getClass(), "parent", null);
        term28085 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term28089 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term28085, term28085.getClass(), "fnName", null);
        setField(term28085, term28085.getClass(), "compiler", null);
        setField(term28085, term28085.getClass(), "codingConvention", null);
        setField(term28085, term28085.getClass(), "typeRegistry", null);
        setField(term28085, term28085.getClass(), "errorRoot", null);
        setField(term28085, term28085.getClass(), "sourceName", null);
        setField(term28085, term28085.getClass(), "scope", null);
        setField(term28085, term28085.getClass(), "contents", null);
        setField(term28085, term28085.getClass(), "returnType", null);
        setBooleanField(term28085, term28085.getClass(), "returnTypeInferred", false);
        setField(term28085, term28085.getClass(), "implementedInterfaces", null);
        setField(term28085, term28085.getClass(), "extendedInterfaces", null);
        setField(term28085, term28085.getClass(), "baseType", null);
        setField(term28085, term28085.getClass(), "thisType", null);
        setBooleanField(term28085, term28085.getClass(), "isConstructor", false);
        setBooleanField(term28085, term28085.getClass(), "isInterface", false);
        setIntField(term28089, term28089.getClass(), "type", 83);
        setField(term28089, term28089.getClass(), "next", null);
        setField(term28089, term28089.getClass(), "first", null);
        setField(term28089, term28089.getClass(), "last", null);
        setField(term28089, term28089.getClass(), "propListHead", null);
        setIntField(term28089, term28089.getClass(), "sourcePosition", -1);
        setField(term28089, term28089.getClass(), "jsType", null);
        setField(term28089, term28089.getClass(), "parent", null);
        setField(term28085, term28085.getClass(), "parametersNode", term28089);
        setField(term28085, term28085.getClass(), "templateTypeName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[2];
        args[0] = term27955;
        args[1] = term28035;
        Object retValue = callMethod(klass, "inferParameterTypes", argTypes, term27885, args);
        assertTrue(recursiveEquals(term27885, term28092));
        assertTrue(recursiveEquals(term27955, term28093));
        assertTrue(recursiveEquals(term28035, term28094));
        assertTrue(recursiveEquals(retValue, term28085));
    }

};


