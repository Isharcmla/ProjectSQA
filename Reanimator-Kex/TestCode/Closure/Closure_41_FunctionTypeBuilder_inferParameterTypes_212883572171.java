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

public class FunctionTypeBuilder_inferParameterTypes_212883572171 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51034;
     Object term51348;
     Object term51396;
     Object term51399;
     Object term51386;

    public FunctionTypeBuilder_inferParameterTypes_212883572171() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term51034 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term51104 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term51174 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term51278 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term51104, term51104.getClass(), "first", term51174);
        setField(term51034, term51034.getClass(), "parametersNode", term51104);
        setField(term51034, term51034.getClass(), "typeRegistry", term51278);
        setField(term51034, term51034.getClass(), "templateTypeName", null);
        term51348 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term51348, term51348.getClass(), "first", null);
        term51396 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term51397 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object term51398 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term51396, term51396.getClass(), "fnName", null);
        setField(term51396, term51396.getClass(), "compiler", null);
        setField(term51396, term51396.getClass(), "codingConvention", null);
        setField(term51397, term51397.getClass(), "reporter", null);
        setField(term51397, term51397.getClass(), "nativeTypes", null);
        setField(term51397, term51397.getClass(), "namesToTypes", null);
        setField(term51397, term51397.getClass(), "namespaces", null);
        setField(term51397, term51397.getClass(), "nonNullableTypeNames", null);
        setField(term51397, term51397.getClass(), "forwardDeclaredTypes", null);
        setField(term51397, term51397.getClass(), "typesIndexedByProperty", null);
        setField(term51397, term51397.getClass(), "eachRefTypeIndexedByProperty", null);
        setField(term51397, term51397.getClass(), "greatestSubtypeByProperty", null);
        setField(term51397, term51397.getClass(), "interfaceToImplementors", null);
        setField(term51397, term51397.getClass(), "unresolvedNamedTypes", null);
        setField(term51397, term51397.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term51397, term51397.getClass(), "lastGeneration", false);
        setField(term51397, term51397.getClass(), "templateTypeName", null);
        setField(term51397, term51397.getClass(), "templateType", null);
        setBooleanField(term51397, term51397.getClass(), "tolerateUndefinedValues", false);
        setField(term51397, term51397.getClass(), "resolveMode", null);
        setField(term51396, term51396.getClass(), "typeRegistry", term51397);
        setField(term51396, term51396.getClass(), "errorRoot", null);
        setField(term51396, term51396.getClass(), "sourceName", null);
        setField(term51396, term51396.getClass(), "scope", null);
        setField(term51396, term51396.getClass(), "contents", null);
        setField(term51396, term51396.getClass(), "returnType", null);
        setBooleanField(term51396, term51396.getClass(), "returnTypeInferred", false);
        setField(term51396, term51396.getClass(), "implementedInterfaces", null);
        setField(term51396, term51396.getClass(), "extendedInterfaces", null);
        setField(term51396, term51396.getClass(), "baseType", null);
        setField(term51396, term51396.getClass(), "thisType", null);
        setBooleanField(term51396, term51396.getClass(), "isConstructor", false);
        setBooleanField(term51396, term51396.getClass(), "isInterface", false);
        setIntField(term51398, term51398.getClass(), "type", 83);
        setField(term51398, term51398.getClass(), "next", null);
        setField(term51398, term51398.getClass(), "first", null);
        setField(term51398, term51398.getClass(), "last", null);
        setField(term51398, term51398.getClass(), "propListHead", null);
        setIntField(term51398, term51398.getClass(), "sourcePosition", -1);
        setField(term51398, term51398.getClass(), "jsType", null);
        setField(term51398, term51398.getClass(), "parent", null);
        setField(term51396, term51396.getClass(), "parametersNode", term51398);
        setField(term51396, term51396.getClass(), "templateTypeName", null);
        term51399 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term51399, term51399.getClass(), "type", 0);
        setField(term51399, term51399.getClass(), "next", null);
        setField(term51399, term51399.getClass(), "first", null);
        setField(term51399, term51399.getClass(), "last", null);
        setField(term51399, term51399.getClass(), "propListHead", null);
        setIntField(term51399, term51399.getClass(), "sourcePosition", 0);
        setField(term51399, term51399.getClass(), "jsType", null);
        setField(term51399, term51399.getClass(), "parent", null);
        term51386 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term51387 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object term51393 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term51386, term51386.getClass(), "fnName", null);
        setField(term51386, term51386.getClass(), "compiler", null);
        setField(term51386, term51386.getClass(), "codingConvention", null);
        setField(term51387, term51387.getClass(), "reporter", null);
        setField(term51387, term51387.getClass(), "nativeTypes", null);
        setField(term51387, term51387.getClass(), "namesToTypes", null);
        setField(term51387, term51387.getClass(), "namespaces", null);
        setField(term51387, term51387.getClass(), "nonNullableTypeNames", null);
        setField(term51387, term51387.getClass(), "forwardDeclaredTypes", null);
        setField(term51387, term51387.getClass(), "typesIndexedByProperty", null);
        setField(term51387, term51387.getClass(), "eachRefTypeIndexedByProperty", null);
        setField(term51387, term51387.getClass(), "greatestSubtypeByProperty", null);
        setField(term51387, term51387.getClass(), "interfaceToImplementors", null);
        setField(term51387, term51387.getClass(), "unresolvedNamedTypes", null);
        setField(term51387, term51387.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term51387, term51387.getClass(), "lastGeneration", false);
        setField(term51387, term51387.getClass(), "templateTypeName", null);
        setField(term51387, term51387.getClass(), "templateType", null);
        setBooleanField(term51387, term51387.getClass(), "tolerateUndefinedValues", false);
        setField(term51387, term51387.getClass(), "resolveMode", null);
        setField(term51386, term51386.getClass(), "typeRegistry", term51387);
        setField(term51386, term51386.getClass(), "errorRoot", null);
        setField(term51386, term51386.getClass(), "sourceName", null);
        setField(term51386, term51386.getClass(), "scope", null);
        setField(term51386, term51386.getClass(), "contents", null);
        setField(term51386, term51386.getClass(), "returnType", null);
        setBooleanField(term51386, term51386.getClass(), "returnTypeInferred", false);
        setField(term51386, term51386.getClass(), "implementedInterfaces", null);
        setField(term51386, term51386.getClass(), "extendedInterfaces", null);
        setField(term51386, term51386.getClass(), "baseType", null);
        setField(term51386, term51386.getClass(), "thisType", null);
        setBooleanField(term51386, term51386.getClass(), "isConstructor", false);
        setBooleanField(term51386, term51386.getClass(), "isInterface", false);
        setIntField(term51393, term51393.getClass(), "type", 83);
        setField(term51393, term51393.getClass(), "next", null);
        setField(term51393, term51393.getClass(), "first", null);
        setField(term51393, term51393.getClass(), "last", null);
        setField(term51393, term51393.getClass(), "propListHead", null);
        setIntField(term51393, term51393.getClass(), "sourcePosition", -1);
        setField(term51393, term51393.getClass(), "jsType", null);
        setField(term51393, term51393.getClass(), "parent", null);
        setField(term51386, term51386.getClass(), "parametersNode", term51393);
        setField(term51386, term51386.getClass(), "templateTypeName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[2];
        args[0] = term51348;
        args[1] = null;
        Object retValue = callMethod(klass, "inferParameterTypes", argTypes, term51034, args);
        assertTrue(recursiveEquals(term51034, term51396));
        assertTrue(recursiveEquals(term51348, term51399));
        assertTrue(recursiveEquals(retValue, term51386));
    }

};


