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

public class FunctionTypeBuilder_inferParameterTypes_21288357296 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48034;
     Object term48218;
     Object term48381;
     Object term48382;
     Object term48361;

    public FunctionTypeBuilder_inferParameterTypes_21288357296() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48034 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term48138 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term48034, term48034.getClass(), "parametersNode", null);
        setField(term48034, term48034.getClass(), "typeRegistry", term48138);
        setField(term48034, term48034.getClass(), "templateTypeName", null);
        term48218 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term48218, term48218.getClass(), "info", null);
        term48381 = newInstance(Class.forName("com.google.common.collect.EmptyImmutableSet"));
        setField(term48381, term48381.getClass(), "asList", null);
        term48382 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term48382, term48382.getClass(), "info", null);
        setField(term48382, term48382.getClass(), "documentation", null);
        setField(term48382, term48382.getClass(), "sourceName", null);
        setField(term48382, term48382.getClass(), "visibility", null);
        setIntField(term48382, term48382.getClass(), "bitset", 0);
        setField(term48382, term48382.getClass(), "type", null);
        setField(term48382, term48382.getClass(), "thisType", null);
        setBooleanField(term48382, term48382.getClass(), "includeDocumentation", false);
        term48361 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term48362 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object term48368 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term48361, term48361.getClass(), "fnName", null);
        setField(term48361, term48361.getClass(), "compiler", null);
        setField(term48361, term48361.getClass(), "codingConvention", null);
        setField(term48362, term48362.getClass(), "reporter", null);
        setField(term48362, term48362.getClass(), "nativeTypes", null);
        setField(term48362, term48362.getClass(), "namesToTypes", null);
        setField(term48362, term48362.getClass(), "namespaces", null);
        setField(term48362, term48362.getClass(), "nonNullableTypeNames", null);
        setField(term48362, term48362.getClass(), "forwardDeclaredTypes", null);
        setField(term48362, term48362.getClass(), "typesIndexedByProperty", null);
        setField(term48362, term48362.getClass(), "greatestSubtypeByProperty", null);
        setField(term48362, term48362.getClass(), "interfaceToImplementors", null);
        setField(term48362, term48362.getClass(), "unresolvedNamedTypes", null);
        setField(term48362, term48362.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term48362, term48362.getClass(), "lastGeneration", false);
        setField(term48362, term48362.getClass(), "templateTypeName", null);
        setField(term48362, term48362.getClass(), "templateType", null);
        setBooleanField(term48362, term48362.getClass(), "tolerateUndefinedValues", false);
        setField(term48362, term48362.getClass(), "resolveMode", null);
        setField(term48361, term48361.getClass(), "typeRegistry", term48362);
        setField(term48361, term48361.getClass(), "errorRoot", null);
        setField(term48361, term48361.getClass(), "sourceName", null);
        setField(term48361, term48361.getClass(), "scope", null);
        setField(term48361, term48361.getClass(), "returnType", null);
        setBooleanField(term48361, term48361.getClass(), "returnTypeInferred", false);
        setField(term48361, term48361.getClass(), "implementedInterfaces", null);
        setField(term48361, term48361.getClass(), "baseType", null);
        setField(term48361, term48361.getClass(), "thisType", null);
        setBooleanField(term48361, term48361.getClass(), "isConstructor", false);
        setBooleanField(term48361, term48361.getClass(), "isInterface", false);
        setIntField(term48368, term48368.getClass(), "type", 83);
        setField(term48368, term48368.getClass(), "next", null);
        setField(term48368, term48368.getClass(), "first", null);
        setField(term48368, term48368.getClass(), "last", null);
        setField(term48368, term48368.getClass(), "propListHead", null);
        setIntField(term48368, term48368.getClass(), "sourcePosition", -1);
        setField(term48368, term48368.getClass(), "jsType", null);
        setField(term48368, term48368.getClass(), "parent", null);
        setField(term48361, term48361.getClass(), "parametersNode", term48368);
        setField(term48361, term48361.getClass(), "sourceNode", null);
        setField(term48361, term48361.getClass(), "templateTypeName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term48218;
        Object retValue = callMethod(klass, "inferParameterTypes", argTypes, term48034, args);
        assertTrue(recursiveEquals(term48034, term48381));
        assertTrue(recursiveEquals(term48218, null));
        assertTrue(recursiveEquals(retValue, term48361));
    }

};


