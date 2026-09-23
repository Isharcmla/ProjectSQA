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

public class FunctionTypeBuilder_inferParameterTypes_212883572193 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term89062;
     Object term89132;
     Object term89212;
     Object term89383;
     Object term89384;
     Object term89386;
     Object term89377;

    public FunctionTypeBuilder_inferParameterTypes_212883572193() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term89062 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        setField(term89062, term89062.getClass(), "typeRegistry", null);
        term89132 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        term89212 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term89336 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setField(term89212, term89212.getClass(), "info", term89336);
        term89383 = newInstance(Class.forName("com.google.common.collect.EmptyImmutableSet"));
        setField(term89383, term89383.getClass(), "asList", null);
        term89384 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term89385 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setField(term89385, term89385.getClass(), "baseType", null);
        setField(term89385, term89385.getClass(), "implementedInterfaces", null);
        setField(term89385, term89385.getClass(), "parameters", null);
        setField(term89385, term89385.getClass(), "thrownTypes", null);
        setField(term89385, term89385.getClass(), "templateTypeName", null);
        setField(term89385, term89385.getClass(), "description", null);
        setField(term89385, term89385.getClass(), "deprecated", null);
        setField(term89385, term89385.getClass(), "license", null);
        setField(term89385, term89385.getClass(), "suppressions", null);
        setField(term89384, term89384.getClass(), "info", term89385);
        setField(term89384, term89384.getClass(), "documentation", null);
        setField(term89384, term89384.getClass(), "sourceName", null);
        setField(term89384, term89384.getClass(), "visibility", null);
        setIntField(term89384, term89384.getClass(), "bitset", 0);
        setField(term89384, term89384.getClass(), "type", null);
        setField(term89384, term89384.getClass(), "thisType", null);
        setBooleanField(term89384, term89384.getClass(), "includeDocumentation", false);
        term89386 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term89386, term89386.getClass(), "type", 0);
        setField(term89386, term89386.getClass(), "next", null);
        setField(term89386, term89386.getClass(), "first", null);
        setField(term89386, term89386.getClass(), "last", null);
        setField(term89386, term89386.getClass(), "propListHead", null);
        setIntField(term89386, term89386.getClass(), "sourcePosition", 0);
        setField(term89386, term89386.getClass(), "jsType", null);
        setField(term89386, term89386.getClass(), "parent", null);
        term89377 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term89380 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term89377, term89377.getClass(), "fnName", null);
        setField(term89377, term89377.getClass(), "compiler", null);
        setField(term89377, term89377.getClass(), "codingConvention", null);
        setField(term89377, term89377.getClass(), "typeRegistry", null);
        setField(term89377, term89377.getClass(), "errorRoot", null);
        setField(term89377, term89377.getClass(), "sourceName", null);
        setField(term89377, term89377.getClass(), "scope", null);
        setField(term89377, term89377.getClass(), "returnType", null);
        setField(term89377, term89377.getClass(), "implementedInterfaces", null);
        setField(term89377, term89377.getClass(), "baseType", null);
        setField(term89377, term89377.getClass(), "thisType", null);
        setBooleanField(term89377, term89377.getClass(), "isConstructor", false);
        setBooleanField(term89377, term89377.getClass(), "isInterface", false);
        setIntField(term89380, term89380.getClass(), "type", 83);
        setField(term89380, term89380.getClass(), "next", null);
        setField(term89380, term89380.getClass(), "first", null);
        setField(term89380, term89380.getClass(), "last", null);
        setField(term89380, term89380.getClass(), "propListHead", null);
        setIntField(term89380, term89380.getClass(), "sourcePosition", -1);
        setField(term89380, term89380.getClass(), "jsType", null);
        setField(term89380, term89380.getClass(), "parent", null);
        setField(term89377, term89377.getClass(), "parametersNode", term89380);
        setField(term89377, term89377.getClass(), "sourceNode", null);
        setField(term89377, term89377.getClass(), "templateTypeName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[2];
        args[0] = term89132;
        args[1] = term89212;
        Object retValue = callMethod(klass, "inferParameterTypes", argTypes, term89062, args);
        assertTrue(recursiveEquals(term89062, term89383));
        assertTrue(recursiveEquals(term89132, term89384));
        assertTrue(recursiveEquals(term89212, term89386));
        assertTrue(recursiveEquals(retValue, term89377));
    }

};


