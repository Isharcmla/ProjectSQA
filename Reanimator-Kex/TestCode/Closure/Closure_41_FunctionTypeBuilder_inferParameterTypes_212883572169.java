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

public class FunctionTypeBuilder_inferParameterTypes_212883572169 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50366;
     Object term50620;
     Object term50714;
     Object term50715;
     Object term50694;

    public FunctionTypeBuilder_inferParameterTypes_212883572169() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50366 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term50436 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term50540 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term50436, term50436.getClass(), "first", null);
        setField(term50366, term50366.getClass(), "parametersNode", term50436);
        setField(term50366, term50366.getClass(), "typeRegistry", term50540);
        term50620 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term50620, term50620.getClass(), "info", null);
        term50714 = newInstance(Class.forName("com.google.common.collect.EmptyImmutableSet"));
        setField(term50714, term50714.getClass(), "asList", null);
        term50715 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term50715, term50715.getClass(), "info", null);
        setField(term50715, term50715.getClass(), "documentation", null);
        setField(term50715, term50715.getClass(), "associatedNode", null);
        setField(term50715, term50715.getClass(), "visibility", null);
        setIntField(term50715, term50715.getClass(), "bitset", 0);
        setField(term50715, term50715.getClass(), "type", null);
        setField(term50715, term50715.getClass(), "thisType", null);
        setBooleanField(term50715, term50715.getClass(), "includeDocumentation", false);
        term50694 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term50695 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object term50701 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term50694, term50694.getClass(), "fnName", null);
        setField(term50694, term50694.getClass(), "compiler", null);
        setField(term50694, term50694.getClass(), "codingConvention", null);
        setField(term50695, term50695.getClass(), "reporter", null);
        setField(term50695, term50695.getClass(), "nativeTypes", null);
        setField(term50695, term50695.getClass(), "namesToTypes", null);
        setField(term50695, term50695.getClass(), "namespaces", null);
        setField(term50695, term50695.getClass(), "nonNullableTypeNames", null);
        setField(term50695, term50695.getClass(), "forwardDeclaredTypes", null);
        setField(term50695, term50695.getClass(), "typesIndexedByProperty", null);
        setField(term50695, term50695.getClass(), "eachRefTypeIndexedByProperty", null);
        setField(term50695, term50695.getClass(), "greatestSubtypeByProperty", null);
        setField(term50695, term50695.getClass(), "interfaceToImplementors", null);
        setField(term50695, term50695.getClass(), "unresolvedNamedTypes", null);
        setField(term50695, term50695.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term50695, term50695.getClass(), "lastGeneration", false);
        setField(term50695, term50695.getClass(), "templateTypeName", null);
        setField(term50695, term50695.getClass(), "templateType", null);
        setBooleanField(term50695, term50695.getClass(), "tolerateUndefinedValues", false);
        setField(term50695, term50695.getClass(), "resolveMode", null);
        setField(term50694, term50694.getClass(), "typeRegistry", term50695);
        setField(term50694, term50694.getClass(), "errorRoot", null);
        setField(term50694, term50694.getClass(), "sourceName", null);
        setField(term50694, term50694.getClass(), "scope", null);
        setField(term50694, term50694.getClass(), "contents", null);
        setField(term50694, term50694.getClass(), "returnType", null);
        setBooleanField(term50694, term50694.getClass(), "returnTypeInferred", false);
        setField(term50694, term50694.getClass(), "implementedInterfaces", null);
        setField(term50694, term50694.getClass(), "extendedInterfaces", null);
        setField(term50694, term50694.getClass(), "baseType", null);
        setField(term50694, term50694.getClass(), "thisType", null);
        setBooleanField(term50694, term50694.getClass(), "isConstructor", false);
        setBooleanField(term50694, term50694.getClass(), "isInterface", false);
        setIntField(term50701, term50701.getClass(), "type", 83);
        setField(term50701, term50701.getClass(), "next", null);
        setField(term50701, term50701.getClass(), "first", null);
        setField(term50701, term50701.getClass(), "last", null);
        setField(term50701, term50701.getClass(), "propListHead", null);
        setIntField(term50701, term50701.getClass(), "sourcePosition", -1);
        setField(term50701, term50701.getClass(), "jsType", null);
        setField(term50701, term50701.getClass(), "parent", null);
        setField(term50694, term50694.getClass(), "parametersNode", term50701);
        setField(term50694, term50694.getClass(), "templateTypeName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term50620;
        Object retValue = callMethod(klass, "inferParameterTypes", argTypes, term50366, args);
        assertTrue(recursiveEquals(term50366, term50714));
        assertTrue(recursiveEquals(term50620, null));
        assertTrue(recursiveEquals(retValue, term50694));
    }

};


