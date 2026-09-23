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

public class FunctionTypeBuilder_inferParameterTypes_21288357286 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45187;
     Object term45267;
     Object term45589;
     Object term45590;
     Object term45575;

    public FunctionTypeBuilder_inferParameterTypes_21288357286() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45187 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        setField(term45187, term45187.getClass(), "parametersNode", null);
        setField(term45187, term45187.getClass(), "typeRegistry", null);
        term45267 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term45267, term45267.getClass(), "info", null);
        term45589 = newInstance(Class.forName("com.google.common.collect.EmptyImmutableSet"));
        setField(term45589, term45589.getClass(), "asList", null);
        term45590 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term45590, term45590.getClass(), "info", null);
        setField(term45590, term45590.getClass(), "documentation", null);
        setField(term45590, term45590.getClass(), "sourceName", null);
        setField(term45590, term45590.getClass(), "visibility", null);
        setIntField(term45590, term45590.getClass(), "bitset", 0);
        setField(term45590, term45590.getClass(), "type", null);
        setField(term45590, term45590.getClass(), "thisType", null);
        setBooleanField(term45590, term45590.getClass(), "includeDocumentation", false);
        term45575 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term45579 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term45575, term45575.getClass(), "fnName", null);
        setField(term45575, term45575.getClass(), "compiler", null);
        setField(term45575, term45575.getClass(), "codingConvention", null);
        setField(term45575, term45575.getClass(), "typeRegistry", null);
        setField(term45575, term45575.getClass(), "errorRoot", null);
        setField(term45575, term45575.getClass(), "sourceName", null);
        setField(term45575, term45575.getClass(), "scope", null);
        setField(term45575, term45575.getClass(), "returnType", null);
        setBooleanField(term45575, term45575.getClass(), "returnTypeInferred", false);
        setField(term45575, term45575.getClass(), "implementedInterfaces", null);
        setField(term45575, term45575.getClass(), "baseType", null);
        setField(term45575, term45575.getClass(), "thisType", null);
        setBooleanField(term45575, term45575.getClass(), "isConstructor", false);
        setBooleanField(term45575, term45575.getClass(), "isInterface", false);
        setIntField(term45579, term45579.getClass(), "type", 83);
        setField(term45579, term45579.getClass(), "next", null);
        setField(term45579, term45579.getClass(), "first", null);
        setField(term45579, term45579.getClass(), "last", null);
        setField(term45579, term45579.getClass(), "propListHead", null);
        setIntField(term45579, term45579.getClass(), "sourcePosition", -1);
        setField(term45579, term45579.getClass(), "jsType", null);
        setField(term45579, term45579.getClass(), "parent", null);
        setField(term45575, term45575.getClass(), "parametersNode", term45579);
        setField(term45575, term45575.getClass(), "sourceNode", null);
        setField(term45575, term45575.getClass(), "templateTypeName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term45267;
        Object retValue = callMethod(klass, "inferParameterTypes", argTypes, term45187, args);
        assertTrue(recursiveEquals(term45187, term45589));
        assertTrue(recursiveEquals(term45267, null));
        assertTrue(recursiveEquals(retValue, term45575));
    }

};


