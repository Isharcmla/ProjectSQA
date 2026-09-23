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

public class FunctionTypeBuilder_inferParameterTypes_212883572164 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term67665;
     Object term67839;
     Object term67932;
     Object term67935;
     Object term67922;

    public FunctionTypeBuilder_inferParameterTypes_212883572164() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term67665 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term67769 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term67665, term67665.getClass(), "parametersNode", null);
        setField(term67665, term67665.getClass(), "typeRegistry", term67769);
        setField(term67665, term67665.getClass(), "templateTypeName", null);
        term67839 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term67839, term67839.getClass(), "first", null);
        term67932 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term67933 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object term67934 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term67932, term67932.getClass(), "fnName", null);
        setField(term67932, term67932.getClass(), "compiler", null);
        setField(term67932, term67932.getClass(), "codingConvention", null);
        setField(term67933, term67933.getClass(), "reporter", null);
        setField(term67933, term67933.getClass(), "nativeTypes", null);
        setField(term67933, term67933.getClass(), "namesToTypes", null);
        setField(term67933, term67933.getClass(), "namespaces", null);
        setField(term67933, term67933.getClass(), "nonNullableTypeNames", null);
        setField(term67933, term67933.getClass(), "forwardDeclaredTypes", null);
        setField(term67933, term67933.getClass(), "typesIndexedByProperty", null);
        setField(term67933, term67933.getClass(), "greatestSubtypeByProperty", null);
        setField(term67933, term67933.getClass(), "interfaceToImplementors", null);
        setField(term67933, term67933.getClass(), "unresolvedNamedTypes", null);
        setField(term67933, term67933.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term67933, term67933.getClass(), "lastGeneration", false);
        setField(term67933, term67933.getClass(), "templateTypeName", null);
        setField(term67933, term67933.getClass(), "templateType", null);
        setBooleanField(term67933, term67933.getClass(), "tolerateUndefinedValues", false);
        setField(term67933, term67933.getClass(), "resolveMode", null);
        setField(term67932, term67932.getClass(), "typeRegistry", term67933);
        setField(term67932, term67932.getClass(), "errorRoot", null);
        setField(term67932, term67932.getClass(), "sourceName", null);
        setField(term67932, term67932.getClass(), "scope", null);
        setField(term67932, term67932.getClass(), "returnType", null);
        setBooleanField(term67932, term67932.getClass(), "returnTypeInferred", false);
        setField(term67932, term67932.getClass(), "implementedInterfaces", null);
        setField(term67932, term67932.getClass(), "baseType", null);
        setField(term67932, term67932.getClass(), "thisType", null);
        setBooleanField(term67932, term67932.getClass(), "isConstructor", false);
        setBooleanField(term67932, term67932.getClass(), "isInterface", false);
        setIntField(term67934, term67934.getClass(), "type", 83);
        setField(term67934, term67934.getClass(), "next", null);
        setField(term67934, term67934.getClass(), "first", null);
        setField(term67934, term67934.getClass(), "last", null);
        setField(term67934, term67934.getClass(), "propListHead", null);
        setIntField(term67934, term67934.getClass(), "sourcePosition", -1);
        setField(term67934, term67934.getClass(), "jsType", null);
        setField(term67934, term67934.getClass(), "parent", null);
        setField(term67932, term67932.getClass(), "parametersNode", term67934);
        setField(term67932, term67932.getClass(), "sourceNode", null);
        setField(term67932, term67932.getClass(), "templateTypeName", null);
        term67935 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term67935, term67935.getClass(), "type", 0);
        setField(term67935, term67935.getClass(), "next", null);
        setField(term67935, term67935.getClass(), "first", null);
        setField(term67935, term67935.getClass(), "last", null);
        setField(term67935, term67935.getClass(), "propListHead", null);
        setIntField(term67935, term67935.getClass(), "sourcePosition", 0);
        setField(term67935, term67935.getClass(), "jsType", null);
        setField(term67935, term67935.getClass(), "parent", null);
        term67922 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term67923 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object term67929 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term67922, term67922.getClass(), "fnName", null);
        setField(term67922, term67922.getClass(), "compiler", null);
        setField(term67922, term67922.getClass(), "codingConvention", null);
        setField(term67923, term67923.getClass(), "reporter", null);
        setField(term67923, term67923.getClass(), "nativeTypes", null);
        setField(term67923, term67923.getClass(), "namesToTypes", null);
        setField(term67923, term67923.getClass(), "namespaces", null);
        setField(term67923, term67923.getClass(), "nonNullableTypeNames", null);
        setField(term67923, term67923.getClass(), "forwardDeclaredTypes", null);
        setField(term67923, term67923.getClass(), "typesIndexedByProperty", null);
        setField(term67923, term67923.getClass(), "greatestSubtypeByProperty", null);
        setField(term67923, term67923.getClass(), "interfaceToImplementors", null);
        setField(term67923, term67923.getClass(), "unresolvedNamedTypes", null);
        setField(term67923, term67923.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term67923, term67923.getClass(), "lastGeneration", false);
        setField(term67923, term67923.getClass(), "templateTypeName", null);
        setField(term67923, term67923.getClass(), "templateType", null);
        setBooleanField(term67923, term67923.getClass(), "tolerateUndefinedValues", false);
        setField(term67923, term67923.getClass(), "resolveMode", null);
        setField(term67922, term67922.getClass(), "typeRegistry", term67923);
        setField(term67922, term67922.getClass(), "errorRoot", null);
        setField(term67922, term67922.getClass(), "sourceName", null);
        setField(term67922, term67922.getClass(), "scope", null);
        setField(term67922, term67922.getClass(), "returnType", null);
        setBooleanField(term67922, term67922.getClass(), "returnTypeInferred", false);
        setField(term67922, term67922.getClass(), "implementedInterfaces", null);
        setField(term67922, term67922.getClass(), "baseType", null);
        setField(term67922, term67922.getClass(), "thisType", null);
        setBooleanField(term67922, term67922.getClass(), "isConstructor", false);
        setBooleanField(term67922, term67922.getClass(), "isInterface", false);
        setIntField(term67929, term67929.getClass(), "type", 83);
        setField(term67929, term67929.getClass(), "next", null);
        setField(term67929, term67929.getClass(), "first", null);
        setField(term67929, term67929.getClass(), "last", null);
        setField(term67929, term67929.getClass(), "propListHead", null);
        setIntField(term67929, term67929.getClass(), "sourcePosition", -1);
        setField(term67929, term67929.getClass(), "jsType", null);
        setField(term67929, term67929.getClass(), "parent", null);
        setField(term67922, term67922.getClass(), "parametersNode", term67929);
        setField(term67922, term67922.getClass(), "sourceNode", null);
        setField(term67922, term67922.getClass(), "templateTypeName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[2];
        args[0] = term67839;
        args[1] = null;
        Object retValue = callMethod(klass, "inferParameterTypes", argTypes, term67665, args);
        assertTrue(recursiveEquals(term67665, term67932));
        assertTrue(recursiveEquals(term67839, term67935));
        assertTrue(recursiveEquals(retValue, term67922));
    }

};


