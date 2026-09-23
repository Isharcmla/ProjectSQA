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

public class FunctionTypeBuilder_inferParameterTypes_212883572235 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term76799;
     Object term77078;
     Object term77158;
     Object term77221;
     Object term77222;
     Object term77223;
     Object term77211;

    public FunctionTypeBuilder_inferParameterTypes_212883572235() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term76799 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term76869 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        term77078 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term77043 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term77078, term77078.getClass(), "first", null);
        setField(term76869, term76869.getClass(), "first", term77078);
        setField(term76799, term76799.getClass(), "parametersNode", term76869);
        setField(term76799, term76799.getClass(), "typeRegistry", term77043);
        term77158 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term77158, term77158.getClass(), "info", null);
        term77221 = newInstance(Class.forName("com.google.common.collect.EmptyImmutableSet"));
        setField(term77221, term77221.getClass(), "asList", null);
        term77222 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term77222, term77222.getClass(), "info", null);
        setField(term77222, term77222.getClass(), "documentation", null);
        setField(term77222, term77222.getClass(), "associatedNode", null);
        setField(term77222, term77222.getClass(), "visibility", null);
        setIntField(term77222, term77222.getClass(), "bitset", 0);
        setField(term77222, term77222.getClass(), "type", null);
        setField(term77222, term77222.getClass(), "thisType", null);
        setBooleanField(term77222, term77222.getClass(), "includeDocumentation", false);
        term77223 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term77223, term77223.getClass(), "type", 0);
        setField(term77223, term77223.getClass(), "next", null);
        setField(term77223, term77223.getClass(), "first", null);
        setField(term77223, term77223.getClass(), "last", null);
        setField(term77223, term77223.getClass(), "propListHead", null);
        setIntField(term77223, term77223.getClass(), "sourcePosition", 0);
        setField(term77223, term77223.getClass(), "jsType", null);
        setField(term77223, term77223.getClass(), "parent", null);
        term77211 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term77212 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object term77218 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term77211, term77211.getClass(), "fnName", null);
        setField(term77211, term77211.getClass(), "compiler", null);
        setField(term77211, term77211.getClass(), "codingConvention", null);
        setField(term77212, term77212.getClass(), "reporter", null);
        setField(term77212, term77212.getClass(), "nativeTypes", null);
        setField(term77212, term77212.getClass(), "namesToTypes", null);
        setField(term77212, term77212.getClass(), "namespaces", null);
        setField(term77212, term77212.getClass(), "nonNullableTypeNames", null);
        setField(term77212, term77212.getClass(), "forwardDeclaredTypes", null);
        setField(term77212, term77212.getClass(), "typesIndexedByProperty", null);
        setField(term77212, term77212.getClass(), "eachRefTypeIndexedByProperty", null);
        setField(term77212, term77212.getClass(), "greatestSubtypeByProperty", null);
        setField(term77212, term77212.getClass(), "interfaceToImplementors", null);
        setField(term77212, term77212.getClass(), "unresolvedNamedTypes", null);
        setField(term77212, term77212.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term77212, term77212.getClass(), "lastGeneration", false);
        setField(term77212, term77212.getClass(), "templateTypeName", null);
        setField(term77212, term77212.getClass(), "templateType", null);
        setBooleanField(term77212, term77212.getClass(), "tolerateUndefinedValues", false);
        setField(term77212, term77212.getClass(), "resolveMode", null);
        setField(term77211, term77211.getClass(), "typeRegistry", term77212);
        setField(term77211, term77211.getClass(), "errorRoot", null);
        setField(term77211, term77211.getClass(), "sourceName", null);
        setField(term77211, term77211.getClass(), "scope", null);
        setField(term77211, term77211.getClass(), "contents", null);
        setField(term77211, term77211.getClass(), "returnType", null);
        setBooleanField(term77211, term77211.getClass(), "returnTypeInferred", false);
        setField(term77211, term77211.getClass(), "implementedInterfaces", null);
        setField(term77211, term77211.getClass(), "extendedInterfaces", null);
        setField(term77211, term77211.getClass(), "baseType", null);
        setField(term77211, term77211.getClass(), "thisType", null);
        setBooleanField(term77211, term77211.getClass(), "isConstructor", false);
        setBooleanField(term77211, term77211.getClass(), "isInterface", false);
        setIntField(term77218, term77218.getClass(), "type", 83);
        setField(term77218, term77218.getClass(), "next", null);
        setField(term77218, term77218.getClass(), "first", null);
        setField(term77218, term77218.getClass(), "last", null);
        setField(term77218, term77218.getClass(), "propListHead", null);
        setIntField(term77218, term77218.getClass(), "sourcePosition", -1);
        setField(term77218, term77218.getClass(), "jsType", null);
        setField(term77218, term77218.getClass(), "parent", null);
        setField(term77211, term77211.getClass(), "parametersNode", term77218);
        setField(term77211, term77211.getClass(), "templateTypeName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[2];
        args[0] = term77078;
        args[1] = term77158;
        Object retValue = callMethod(klass, "inferParameterTypes", argTypes, term76799, args);
        assertTrue(recursiveEquals(term76799, term77221));
        assertTrue(recursiveEquals(term77078, term77222));
        assertTrue(recursiveEquals(term77158, term77223));
        assertTrue(recursiveEquals(retValue, term77211));
    }

};


