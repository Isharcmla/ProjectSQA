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

public class FunctionTypeBuilder_inferParameterTypes_21288357259 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39150;
     Object term39230;
     Object term39882;
     Object term39883;
     Object term39868;

    public FunctionTypeBuilder_inferParameterTypes_21288357259() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39150 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        term39230 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        term39882 = newInstance(Class.forName("com.google.common.collect.EmptyImmutableSet"));
        setField(term39882, term39882.getClass(), "asList", null);
        term39883 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term39883, term39883.getClass(), "info", null);
        setField(term39883, term39883.getClass(), "documentation", null);
        setField(term39883, term39883.getClass(), "sourceName", null);
        setField(term39883, term39883.getClass(), "visibility", null);
        setIntField(term39883, term39883.getClass(), "bitset", 0);
        setField(term39883, term39883.getClass(), "type", null);
        setField(term39883, term39883.getClass(), "thisType", null);
        setBooleanField(term39883, term39883.getClass(), "includeDocumentation", false);
        term39868 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term39872 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term39868, term39868.getClass(), "fnName", null);
        setField(term39868, term39868.getClass(), "compiler", null);
        setField(term39868, term39868.getClass(), "codingConvention", null);
        setField(term39868, term39868.getClass(), "typeRegistry", null);
        setField(term39868, term39868.getClass(), "errorRoot", null);
        setField(term39868, term39868.getClass(), "sourceName", null);
        setField(term39868, term39868.getClass(), "scope", null);
        setField(term39868, term39868.getClass(), "returnType", null);
        setBooleanField(term39868, term39868.getClass(), "returnTypeInferred", false);
        setField(term39868, term39868.getClass(), "implementedInterfaces", null);
        setField(term39868, term39868.getClass(), "baseType", null);
        setField(term39868, term39868.getClass(), "thisType", null);
        setBooleanField(term39868, term39868.getClass(), "isConstructor", false);
        setBooleanField(term39868, term39868.getClass(), "isInterface", false);
        setIntField(term39872, term39872.getClass(), "type", 83);
        setField(term39872, term39872.getClass(), "next", null);
        setField(term39872, term39872.getClass(), "first", null);
        setField(term39872, term39872.getClass(), "last", null);
        setField(term39872, term39872.getClass(), "propListHead", null);
        setIntField(term39872, term39872.getClass(), "sourcePosition", -1);
        setField(term39872, term39872.getClass(), "jsType", null);
        setField(term39872, term39872.getClass(), "parent", null);
        setField(term39868, term39868.getClass(), "parametersNode", term39872);
        setField(term39868, term39868.getClass(), "sourceNode", null);
        setField(term39868, term39868.getClass(), "templateTypeName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term39230;
        Object retValue = callMethod(klass, "inferParameterTypes", argTypes, term39150, args);
        assertTrue(recursiveEquals(term39150, term39882));
        assertTrue(recursiveEquals(term39230, null));
        assertTrue(recursiveEquals(retValue, term39868));
    }

};


