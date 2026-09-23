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

public class FunctionTypeBuilder_inferParameterTypes_212883572121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36630;
     Object term36804;
     Object term37032;
     Object term37035;
     Object term37022;

    public FunctionTypeBuilder_inferParameterTypes_212883572121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36630 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term36734 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term36630, term36630.getClass(), "parametersNode", null);
        setField(term36630, term36630.getClass(), "typeRegistry", term36734);
        setField(term36630, term36630.getClass(), "templateTypeName", null);
        term36804 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term36804, term36804.getClass(), "first", null);
        term37032 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term37033 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object term37034 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term37032, term37032.getClass(), "fnName", null);
        setField(term37032, term37032.getClass(), "compiler", null);
        setField(term37032, term37032.getClass(), "codingConvention", null);
        setField(term37033, term37033.getClass(), "reporter", null);
        setField(term37033, term37033.getClass(), "nativeTypes", null);
        setField(term37033, term37033.getClass(), "namesToTypes", null);
        setField(term37033, term37033.getClass(), "namespaces", null);
        setField(term37033, term37033.getClass(), "nonNullableTypeNames", null);
        setField(term37033, term37033.getClass(), "forwardDeclaredTypes", null);
        setField(term37033, term37033.getClass(), "typesIndexedByProperty", null);
        setField(term37033, term37033.getClass(), "eachRefTypeIndexedByProperty", null);
        setField(term37033, term37033.getClass(), "greatestSubtypeByProperty", null);
        setField(term37033, term37033.getClass(), "interfaceToImplementors", null);
        setField(term37033, term37033.getClass(), "unresolvedNamedTypes", null);
        setField(term37033, term37033.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term37033, term37033.getClass(), "lastGeneration", false);
        setField(term37033, term37033.getClass(), "templateTypeName", null);
        setField(term37033, term37033.getClass(), "templateType", null);
        setBooleanField(term37033, term37033.getClass(), "tolerateUndefinedValues", false);
        setField(term37033, term37033.getClass(), "resolveMode", null);
        setField(term37032, term37032.getClass(), "typeRegistry", term37033);
        setField(term37032, term37032.getClass(), "errorRoot", null);
        setField(term37032, term37032.getClass(), "sourceName", null);
        setField(term37032, term37032.getClass(), "scope", null);
        setField(term37032, term37032.getClass(), "contents", null);
        setField(term37032, term37032.getClass(), "returnType", null);
        setBooleanField(term37032, term37032.getClass(), "returnTypeInferred", false);
        setField(term37032, term37032.getClass(), "implementedInterfaces", null);
        setField(term37032, term37032.getClass(), "extendedInterfaces", null);
        setField(term37032, term37032.getClass(), "baseType", null);
        setField(term37032, term37032.getClass(), "thisType", null);
        setBooleanField(term37032, term37032.getClass(), "isConstructor", false);
        setBooleanField(term37032, term37032.getClass(), "isInterface", false);
        setIntField(term37034, term37034.getClass(), "type", 83);
        setField(term37034, term37034.getClass(), "next", null);
        setField(term37034, term37034.getClass(), "first", null);
        setField(term37034, term37034.getClass(), "last", null);
        setField(term37034, term37034.getClass(), "propListHead", null);
        setIntField(term37034, term37034.getClass(), "sourcePosition", -1);
        setField(term37034, term37034.getClass(), "jsType", null);
        setField(term37034, term37034.getClass(), "parent", null);
        setField(term37032, term37032.getClass(), "parametersNode", term37034);
        setField(term37032, term37032.getClass(), "templateTypeName", null);
        term37035 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term37035, term37035.getClass(), "type", 0);
        setField(term37035, term37035.getClass(), "next", null);
        setField(term37035, term37035.getClass(), "first", null);
        setField(term37035, term37035.getClass(), "last", null);
        setField(term37035, term37035.getClass(), "propListHead", null);
        setIntField(term37035, term37035.getClass(), "sourcePosition", 0);
        setField(term37035, term37035.getClass(), "jsType", null);
        setField(term37035, term37035.getClass(), "parent", null);
        term37022 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term37023 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object term37029 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term37022, term37022.getClass(), "fnName", null);
        setField(term37022, term37022.getClass(), "compiler", null);
        setField(term37022, term37022.getClass(), "codingConvention", null);
        setField(term37023, term37023.getClass(), "reporter", null);
        setField(term37023, term37023.getClass(), "nativeTypes", null);
        setField(term37023, term37023.getClass(), "namesToTypes", null);
        setField(term37023, term37023.getClass(), "namespaces", null);
        setField(term37023, term37023.getClass(), "nonNullableTypeNames", null);
        setField(term37023, term37023.getClass(), "forwardDeclaredTypes", null);
        setField(term37023, term37023.getClass(), "typesIndexedByProperty", null);
        setField(term37023, term37023.getClass(), "eachRefTypeIndexedByProperty", null);
        setField(term37023, term37023.getClass(), "greatestSubtypeByProperty", null);
        setField(term37023, term37023.getClass(), "interfaceToImplementors", null);
        setField(term37023, term37023.getClass(), "unresolvedNamedTypes", null);
        setField(term37023, term37023.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term37023, term37023.getClass(), "lastGeneration", false);
        setField(term37023, term37023.getClass(), "templateTypeName", null);
        setField(term37023, term37023.getClass(), "templateType", null);
        setBooleanField(term37023, term37023.getClass(), "tolerateUndefinedValues", false);
        setField(term37023, term37023.getClass(), "resolveMode", null);
        setField(term37022, term37022.getClass(), "typeRegistry", term37023);
        setField(term37022, term37022.getClass(), "errorRoot", null);
        setField(term37022, term37022.getClass(), "sourceName", null);
        setField(term37022, term37022.getClass(), "scope", null);
        setField(term37022, term37022.getClass(), "contents", null);
        setField(term37022, term37022.getClass(), "returnType", null);
        setBooleanField(term37022, term37022.getClass(), "returnTypeInferred", false);
        setField(term37022, term37022.getClass(), "implementedInterfaces", null);
        setField(term37022, term37022.getClass(), "extendedInterfaces", null);
        setField(term37022, term37022.getClass(), "baseType", null);
        setField(term37022, term37022.getClass(), "thisType", null);
        setBooleanField(term37022, term37022.getClass(), "isConstructor", false);
        setBooleanField(term37022, term37022.getClass(), "isInterface", false);
        setIntField(term37029, term37029.getClass(), "type", 83);
        setField(term37029, term37029.getClass(), "next", null);
        setField(term37029, term37029.getClass(), "first", null);
        setField(term37029, term37029.getClass(), "last", null);
        setField(term37029, term37029.getClass(), "propListHead", null);
        setIntField(term37029, term37029.getClass(), "sourcePosition", -1);
        setField(term37029, term37029.getClass(), "jsType", null);
        setField(term37029, term37029.getClass(), "parent", null);
        setField(term37022, term37022.getClass(), "parametersNode", term37029);
        setField(term37022, term37022.getClass(), "templateTypeName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[2];
        args[0] = term36804;
        args[1] = null;
        Object retValue = callMethod(klass, "inferParameterTypes", argTypes, term36630, args);
        assertTrue(recursiveEquals(term36630, term37032));
        assertTrue(recursiveEquals(term36804, term37035));
        assertTrue(recursiveEquals(retValue, term37022));
    }

};


