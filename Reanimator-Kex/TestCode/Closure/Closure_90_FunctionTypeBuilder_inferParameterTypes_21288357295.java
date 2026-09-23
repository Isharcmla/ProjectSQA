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

public class FunctionTypeBuilder_inferParameterTypes_21288357295 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47188;
     Object term47338;
     Object term48293;
     Object term48294;
     Object term48279;

    public FunctionTypeBuilder_inferParameterTypes_21288357295() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47188 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term47258 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term47188, term47188.getClass(), "parametersNode", term47258);
        term47338 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term47338, term47338.getClass(), "info", null);
        term48293 = newInstance(Class.forName("com.google.common.collect.EmptyImmutableSet"));
        setField(term48293, term48293.getClass(), "asList", null);
        term48294 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term48294, term48294.getClass(), "info", null);
        setField(term48294, term48294.getClass(), "documentation", null);
        setField(term48294, term48294.getClass(), "sourceName", null);
        setField(term48294, term48294.getClass(), "visibility", null);
        setIntField(term48294, term48294.getClass(), "bitset", 0);
        setField(term48294, term48294.getClass(), "type", null);
        setField(term48294, term48294.getClass(), "thisType", null);
        setBooleanField(term48294, term48294.getClass(), "includeDocumentation", false);
        term48279 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term48283 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term48279, term48279.getClass(), "fnName", null);
        setField(term48279, term48279.getClass(), "compiler", null);
        setField(term48279, term48279.getClass(), "codingConvention", null);
        setField(term48279, term48279.getClass(), "typeRegistry", null);
        setField(term48279, term48279.getClass(), "errorRoot", null);
        setField(term48279, term48279.getClass(), "sourceName", null);
        setField(term48279, term48279.getClass(), "scope", null);
        setField(term48279, term48279.getClass(), "returnType", null);
        setBooleanField(term48279, term48279.getClass(), "returnTypeInferred", false);
        setField(term48279, term48279.getClass(), "implementedInterfaces", null);
        setField(term48279, term48279.getClass(), "baseType", null);
        setField(term48279, term48279.getClass(), "thisType", null);
        setBooleanField(term48279, term48279.getClass(), "isConstructor", false);
        setBooleanField(term48279, term48279.getClass(), "isInterface", false);
        setIntField(term48283, term48283.getClass(), "type", 83);
        setField(term48283, term48283.getClass(), "next", null);
        setField(term48283, term48283.getClass(), "first", null);
        setField(term48283, term48283.getClass(), "last", null);
        setField(term48283, term48283.getClass(), "propListHead", null);
        setIntField(term48283, term48283.getClass(), "sourcePosition", -1);
        setField(term48283, term48283.getClass(), "jsType", null);
        setField(term48283, term48283.getClass(), "parent", null);
        setField(term48279, term48279.getClass(), "parametersNode", term48283);
        setField(term48279, term48279.getClass(), "sourceNode", null);
        setField(term48279, term48279.getClass(), "templateTypeName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term47338;
        Object retValue = callMethod(klass, "inferParameterTypes", argTypes, term47188, args);
        assertTrue(recursiveEquals(term47188, term48293));
        assertTrue(recursiveEquals(term47338, null));
        assertTrue(recursiveEquals(retValue, term48279));
    }

};


