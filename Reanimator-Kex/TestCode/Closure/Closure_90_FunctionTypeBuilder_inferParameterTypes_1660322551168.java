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

public class FunctionTypeBuilder_inferParameterTypes_1660322551168 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term68518;
     Object term68842;
     Object term68959;
     Object term68960;
     Object term68949;

    public FunctionTypeBuilder_inferParameterTypes_1660322551168() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term68518 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term68588 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term68658 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term68762 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term68588, term68588.getClass(), "first", term68658);
        setField(term68518, term68518.getClass(), "parametersNode", term68588);
        setField(term68518, term68518.getClass(), "typeRegistry", term68762);
        setField(term68518, term68518.getClass(), "templateTypeName", null);
        term68842 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term68842, term68842.getClass(), "info", null);
        term68959 = newInstance(Class.forName("com.google.common.collect.EmptyImmutableSet"));
        setField(term68959, term68959.getClass(), "asList", null);
        term68960 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term68960, term68960.getClass(), "info", null);
        setField(term68960, term68960.getClass(), "documentation", null);
        setField(term68960, term68960.getClass(), "sourceName", null);
        setField(term68960, term68960.getClass(), "visibility", null);
        setIntField(term68960, term68960.getClass(), "bitset", 0);
        setField(term68960, term68960.getClass(), "type", null);
        setField(term68960, term68960.getClass(), "thisType", null);
        setBooleanField(term68960, term68960.getClass(), "includeDocumentation", false);
        term68949 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term68950 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object term68956 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term68949, term68949.getClass(), "fnName", null);
        setField(term68949, term68949.getClass(), "compiler", null);
        setField(term68949, term68949.getClass(), "codingConvention", null);
        setField(term68950, term68950.getClass(), "reporter", null);
        setField(term68950, term68950.getClass(), "nativeTypes", null);
        setField(term68950, term68950.getClass(), "namesToTypes", null);
        setField(term68950, term68950.getClass(), "namespaces", null);
        setField(term68950, term68950.getClass(), "nonNullableTypeNames", null);
        setField(term68950, term68950.getClass(), "forwardDeclaredTypes", null);
        setField(term68950, term68950.getClass(), "typesIndexedByProperty", null);
        setField(term68950, term68950.getClass(), "greatestSubtypeByProperty", null);
        setField(term68950, term68950.getClass(), "interfaceToImplementors", null);
        setField(term68950, term68950.getClass(), "unresolvedNamedTypes", null);
        setField(term68950, term68950.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term68950, term68950.getClass(), "lastGeneration", false);
        setField(term68950, term68950.getClass(), "templateTypeName", null);
        setField(term68950, term68950.getClass(), "templateType", null);
        setBooleanField(term68950, term68950.getClass(), "tolerateUndefinedValues", false);
        setField(term68950, term68950.getClass(), "resolveMode", null);
        setField(term68949, term68949.getClass(), "typeRegistry", term68950);
        setField(term68949, term68949.getClass(), "errorRoot", null);
        setField(term68949, term68949.getClass(), "sourceName", null);
        setField(term68949, term68949.getClass(), "scope", null);
        setField(term68949, term68949.getClass(), "returnType", null);
        setBooleanField(term68949, term68949.getClass(), "returnTypeInferred", false);
        setField(term68949, term68949.getClass(), "implementedInterfaces", null);
        setField(term68949, term68949.getClass(), "baseType", null);
        setField(term68949, term68949.getClass(), "thisType", null);
        setBooleanField(term68949, term68949.getClass(), "isConstructor", false);
        setBooleanField(term68949, term68949.getClass(), "isInterface", false);
        setIntField(term68956, term68956.getClass(), "type", 83);
        setField(term68956, term68956.getClass(), "next", null);
        setField(term68956, term68956.getClass(), "first", null);
        setField(term68956, term68956.getClass(), "last", null);
        setField(term68956, term68956.getClass(), "propListHead", null);
        setIntField(term68956, term68956.getClass(), "sourcePosition", -1);
        setField(term68956, term68956.getClass(), "jsType", null);
        setField(term68956, term68956.getClass(), "parent", null);
        setField(term68949, term68949.getClass(), "parametersNode", term68956);
        setField(term68949, term68949.getClass(), "sourceNode", null);
        setField(term68949, term68949.getClass(), "templateTypeName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[1];
        args[0] = term68842;
        Object retValue = callMethod(klass, "inferParameterTypes", argTypes, term68518, args);
        assertTrue(recursiveEquals(term68518, term68959));
        assertTrue(recursiveEquals(term68842, term68960));
        assertTrue(recursiveEquals(retValue, term68949));
    }

};


