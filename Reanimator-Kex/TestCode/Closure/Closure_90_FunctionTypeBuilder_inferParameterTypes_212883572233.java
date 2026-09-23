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

public class FunctionTypeBuilder_inferParameterTypes_212883572233 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term89683;
     Object term89927;
     Object term90259;
     Object term90262;
     Object term90249;

    public FunctionTypeBuilder_inferParameterTypes_212883572233() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term89683 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term89753 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term89857 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term89753, term89753.getClass(), "first", null);
        setField(term89683, term89683.getClass(), "parametersNode", term89753);
        setField(term89683, term89683.getClass(), "typeRegistry", term89857);
        term89927 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term89927, term89927.getClass(), "first", null);
        term90259 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term90260 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object term90261 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term90259, term90259.getClass(), "fnName", null);
        setField(term90259, term90259.getClass(), "compiler", null);
        setField(term90259, term90259.getClass(), "codingConvention", null);
        setField(term90260, term90260.getClass(), "reporter", null);
        setField(term90260, term90260.getClass(), "nativeTypes", null);
        setField(term90260, term90260.getClass(), "namesToTypes", null);
        setField(term90260, term90260.getClass(), "namespaces", null);
        setField(term90260, term90260.getClass(), "nonNullableTypeNames", null);
        setField(term90260, term90260.getClass(), "forwardDeclaredTypes", null);
        setField(term90260, term90260.getClass(), "typesIndexedByProperty", null);
        setField(term90260, term90260.getClass(), "greatestSubtypeByProperty", null);
        setField(term90260, term90260.getClass(), "interfaceToImplementors", null);
        setField(term90260, term90260.getClass(), "unresolvedNamedTypes", null);
        setField(term90260, term90260.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term90260, term90260.getClass(), "lastGeneration", false);
        setField(term90260, term90260.getClass(), "templateTypeName", null);
        setField(term90260, term90260.getClass(), "templateType", null);
        setBooleanField(term90260, term90260.getClass(), "tolerateUndefinedValues", false);
        setField(term90260, term90260.getClass(), "resolveMode", null);
        setField(term90259, term90259.getClass(), "typeRegistry", term90260);
        setField(term90259, term90259.getClass(), "errorRoot", null);
        setField(term90259, term90259.getClass(), "sourceName", null);
        setField(term90259, term90259.getClass(), "scope", null);
        setField(term90259, term90259.getClass(), "returnType", null);
        setBooleanField(term90259, term90259.getClass(), "returnTypeInferred", false);
        setField(term90259, term90259.getClass(), "implementedInterfaces", null);
        setField(term90259, term90259.getClass(), "baseType", null);
        setField(term90259, term90259.getClass(), "thisType", null);
        setBooleanField(term90259, term90259.getClass(), "isConstructor", false);
        setBooleanField(term90259, term90259.getClass(), "isInterface", false);
        setIntField(term90261, term90261.getClass(), "type", 83);
        setField(term90261, term90261.getClass(), "next", null);
        setField(term90261, term90261.getClass(), "first", null);
        setField(term90261, term90261.getClass(), "last", null);
        setField(term90261, term90261.getClass(), "propListHead", null);
        setIntField(term90261, term90261.getClass(), "sourcePosition", -1);
        setField(term90261, term90261.getClass(), "jsType", null);
        setField(term90261, term90261.getClass(), "parent", null);
        setField(term90259, term90259.getClass(), "parametersNode", term90261);
        setField(term90259, term90259.getClass(), "sourceNode", null);
        setField(term90259, term90259.getClass(), "templateTypeName", null);
        term90262 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term90262, term90262.getClass(), "type", 0);
        setField(term90262, term90262.getClass(), "next", null);
        setField(term90262, term90262.getClass(), "first", null);
        setField(term90262, term90262.getClass(), "last", null);
        setField(term90262, term90262.getClass(), "propListHead", null);
        setIntField(term90262, term90262.getClass(), "sourcePosition", 0);
        setField(term90262, term90262.getClass(), "jsType", null);
        setField(term90262, term90262.getClass(), "parent", null);
        term90249 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term90250 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object term90256 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term90249, term90249.getClass(), "fnName", null);
        setField(term90249, term90249.getClass(), "compiler", null);
        setField(term90249, term90249.getClass(), "codingConvention", null);
        setField(term90250, term90250.getClass(), "reporter", null);
        setField(term90250, term90250.getClass(), "nativeTypes", null);
        setField(term90250, term90250.getClass(), "namesToTypes", null);
        setField(term90250, term90250.getClass(), "namespaces", null);
        setField(term90250, term90250.getClass(), "nonNullableTypeNames", null);
        setField(term90250, term90250.getClass(), "forwardDeclaredTypes", null);
        setField(term90250, term90250.getClass(), "typesIndexedByProperty", null);
        setField(term90250, term90250.getClass(), "greatestSubtypeByProperty", null);
        setField(term90250, term90250.getClass(), "interfaceToImplementors", null);
        setField(term90250, term90250.getClass(), "unresolvedNamedTypes", null);
        setField(term90250, term90250.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term90250, term90250.getClass(), "lastGeneration", false);
        setField(term90250, term90250.getClass(), "templateTypeName", null);
        setField(term90250, term90250.getClass(), "templateType", null);
        setBooleanField(term90250, term90250.getClass(), "tolerateUndefinedValues", false);
        setField(term90250, term90250.getClass(), "resolveMode", null);
        setField(term90249, term90249.getClass(), "typeRegistry", term90250);
        setField(term90249, term90249.getClass(), "errorRoot", null);
        setField(term90249, term90249.getClass(), "sourceName", null);
        setField(term90249, term90249.getClass(), "scope", null);
        setField(term90249, term90249.getClass(), "returnType", null);
        setBooleanField(term90249, term90249.getClass(), "returnTypeInferred", false);
        setField(term90249, term90249.getClass(), "implementedInterfaces", null);
        setField(term90249, term90249.getClass(), "baseType", null);
        setField(term90249, term90249.getClass(), "thisType", null);
        setBooleanField(term90249, term90249.getClass(), "isConstructor", false);
        setBooleanField(term90249, term90249.getClass(), "isInterface", false);
        setIntField(term90256, term90256.getClass(), "type", 83);
        setField(term90256, term90256.getClass(), "next", null);
        setField(term90256, term90256.getClass(), "first", null);
        setField(term90256, term90256.getClass(), "last", null);
        setField(term90256, term90256.getClass(), "propListHead", null);
        setIntField(term90256, term90256.getClass(), "sourcePosition", -1);
        setField(term90256, term90256.getClass(), "jsType", null);
        setField(term90256, term90256.getClass(), "parent", null);
        setField(term90249, term90249.getClass(), "parametersNode", term90256);
        setField(term90249, term90249.getClass(), "sourceNode", null);
        setField(term90249, term90249.getClass(), "templateTypeName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[2];
        args[0] = term89927;
        args[1] = null;
        Object retValue = callMethod(klass, "inferParameterTypes", argTypes, term89683, args);
        assertTrue(recursiveEquals(term89683, term90259));
        assertTrue(recursiveEquals(term89927, term90262));
        assertTrue(recursiveEquals(retValue, term90249));
    }

};


