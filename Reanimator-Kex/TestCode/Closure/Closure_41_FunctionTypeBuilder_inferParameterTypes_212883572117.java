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

public class FunctionTypeBuilder_inferParameterTypes_212883572117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35549;
     Object term35733;
     Object term35874;
     Object term35875;
     Object term35854;

    public FunctionTypeBuilder_inferParameterTypes_212883572117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35549 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term35653 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term35549, term35549.getClass(), "parametersNode", null);
        setField(term35549, term35549.getClass(), "typeRegistry", term35653);
        setField(term35549, term35549.getClass(), "templateTypeName", null);
        term35733 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term35733, term35733.getClass(), "info", null);
        term35874 = newInstance(Class.forName("com.google.common.collect.EmptyImmutableSet"));
        setField(term35874, term35874.getClass(), "asList", null);
        term35875 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term35875, term35875.getClass(), "info", null);
        setField(term35875, term35875.getClass(), "documentation", null);
        setField(term35875, term35875.getClass(), "associatedNode", null);
        setField(term35875, term35875.getClass(), "visibility", null);
        setIntField(term35875, term35875.getClass(), "bitset", 0);
        setField(term35875, term35875.getClass(), "type", null);
        setField(term35875, term35875.getClass(), "thisType", null);
        setBooleanField(term35875, term35875.getClass(), "includeDocumentation", false);
        term35854 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term35855 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object term35861 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term35854, term35854.getClass(), "fnName", null);
        setField(term35854, term35854.getClass(), "compiler", null);
        setField(term35854, term35854.getClass(), "codingConvention", null);
        setField(term35855, term35855.getClass(), "reporter", null);
        setField(term35855, term35855.getClass(), "nativeTypes", null);
        setField(term35855, term35855.getClass(), "namesToTypes", null);
        setField(term35855, term35855.getClass(), "namespaces", null);
        setField(term35855, term35855.getClass(), "nonNullableTypeNames", null);
        setField(term35855, term35855.getClass(), "forwardDeclaredTypes", null);
        setField(term35855, term35855.getClass(), "typesIndexedByProperty", null);
        setField(term35855, term35855.getClass(), "eachRefTypeIndexedByProperty", null);
        setField(term35855, term35855.getClass(), "greatestSubtypeByProperty", null);
        setField(term35855, term35855.getClass(), "interfaceToImplementors", null);
        setField(term35855, term35855.getClass(), "unresolvedNamedTypes", null);
        setField(term35855, term35855.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term35855, term35855.getClass(), "lastGeneration", false);
        setField(term35855, term35855.getClass(), "templateTypeName", null);
        setField(term35855, term35855.getClass(), "templateType", null);
        setBooleanField(term35855, term35855.getClass(), "tolerateUndefinedValues", false);
        setField(term35855, term35855.getClass(), "resolveMode", null);
        setField(term35854, term35854.getClass(), "typeRegistry", term35855);
        setField(term35854, term35854.getClass(), "errorRoot", null);
        setField(term35854, term35854.getClass(), "sourceName", null);
        setField(term35854, term35854.getClass(), "scope", null);
        setField(term35854, term35854.getClass(), "contents", null);
        setField(term35854, term35854.getClass(), "returnType", null);
        setBooleanField(term35854, term35854.getClass(), "returnTypeInferred", false);
        setField(term35854, term35854.getClass(), "implementedInterfaces", null);
        setField(term35854, term35854.getClass(), "extendedInterfaces", null);
        setField(term35854, term35854.getClass(), "baseType", null);
        setField(term35854, term35854.getClass(), "thisType", null);
        setBooleanField(term35854, term35854.getClass(), "isConstructor", false);
        setBooleanField(term35854, term35854.getClass(), "isInterface", false);
        setIntField(term35861, term35861.getClass(), "type", 83);
        setField(term35861, term35861.getClass(), "next", null);
        setField(term35861, term35861.getClass(), "first", null);
        setField(term35861, term35861.getClass(), "last", null);
        setField(term35861, term35861.getClass(), "propListHead", null);
        setIntField(term35861, term35861.getClass(), "sourcePosition", -1);
        setField(term35861, term35861.getClass(), "jsType", null);
        setField(term35861, term35861.getClass(), "parent", null);
        setField(term35854, term35854.getClass(), "parametersNode", term35861);
        setField(term35854, term35854.getClass(), "templateTypeName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term35733;
        Object retValue = callMethod(klass, "inferParameterTypes", argTypes, term35549, args);
        assertTrue(recursiveEquals(term35549, term35874));
        assertTrue(recursiveEquals(term35733, null));
        assertTrue(recursiveEquals(retValue, term35854));
    }

};


