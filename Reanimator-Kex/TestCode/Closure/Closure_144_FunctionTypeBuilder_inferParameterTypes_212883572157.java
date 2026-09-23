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

public class FunctionTypeBuilder_inferParameterTypes_212883572157 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75907;
     Object term76091;
     Object term76301;
     Object term76302;
     Object term76283;

    public FunctionTypeBuilder_inferParameterTypes_212883572157() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term75907 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term76011 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term75907, term75907.getClass(), "typeRegistry", term76011);
        setField(term75907, term75907.getClass(), "templateTypeName", null);
        term76091 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term76215 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setField(term76215, term76215.getClass(), "parameters", null);
        setField(term76091, term76091.getClass(), "info", term76215);
        term76301 = newInstance(Class.forName("com.google.common.collect.EmptyImmutableSet"));
        setField(term76301, term76301.getClass(), "asList", null);
        term76302 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term76303 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setField(term76303, term76303.getClass(), "baseType", null);
        setField(term76303, term76303.getClass(), "implementedInterfaces", null);
        setField(term76303, term76303.getClass(), "parameters", null);
        setField(term76303, term76303.getClass(), "thrownTypes", null);
        setField(term76303, term76303.getClass(), "templateTypeName", null);
        setField(term76303, term76303.getClass(), "description", null);
        setField(term76303, term76303.getClass(), "deprecated", null);
        setField(term76303, term76303.getClass(), "license", null);
        setField(term76303, term76303.getClass(), "suppressions", null);
        setField(term76302, term76302.getClass(), "info", term76303);
        setField(term76302, term76302.getClass(), "documentation", null);
        setField(term76302, term76302.getClass(), "sourceName", null);
        setField(term76302, term76302.getClass(), "visibility", null);
        setIntField(term76302, term76302.getClass(), "bitset", 0);
        setField(term76302, term76302.getClass(), "type", null);
        setField(term76302, term76302.getClass(), "thisType", null);
        setBooleanField(term76302, term76302.getClass(), "includeDocumentation", false);
        term76283 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term76284 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object term76289 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term76283, term76283.getClass(), "fnName", null);
        setField(term76283, term76283.getClass(), "compiler", null);
        setField(term76283, term76283.getClass(), "codingConvention", null);
        setField(term76284, term76284.getClass(), "reporter", null);
        setField(term76284, term76284.getClass(), "nativeTypes", null);
        setField(term76284, term76284.getClass(), "namesToTypes", null);
        setField(term76284, term76284.getClass(), "namespaces", null);
        setField(term76284, term76284.getClass(), "enumTypeNames", null);
        setField(term76284, term76284.getClass(), "forwardDeclaredTypes", null);
        setField(term76284, term76284.getClass(), "typesIndexedByProperty", null);
        setField(term76284, term76284.getClass(), "greatestSubtypeByProperty", null);
        setField(term76284, term76284.getClass(), "interfaceToImplementors", null);
        setField(term76284, term76284.getClass(), "unresolvedNamedTypes", null);
        setField(term76284, term76284.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term76284, term76284.getClass(), "lastGeneration", false);
        setField(term76284, term76284.getClass(), "templateTypeName", null);
        setField(term76284, term76284.getClass(), "templateType", null);
        setBooleanField(term76284, term76284.getClass(), "tolerateUndefinedValues", false);
        setField(term76284, term76284.getClass(), "resolveMode", null);
        setField(term76283, term76283.getClass(), "typeRegistry", term76284);
        setField(term76283, term76283.getClass(), "errorRoot", null);
        setField(term76283, term76283.getClass(), "sourceName", null);
        setField(term76283, term76283.getClass(), "scope", null);
        setField(term76283, term76283.getClass(), "returnType", null);
        setField(term76283, term76283.getClass(), "implementedInterfaces", null);
        setField(term76283, term76283.getClass(), "baseType", null);
        setField(term76283, term76283.getClass(), "thisType", null);
        setBooleanField(term76283, term76283.getClass(), "isConstructor", false);
        setBooleanField(term76283, term76283.getClass(), "isInterface", false);
        setIntField(term76289, term76289.getClass(), "type", 83);
        setField(term76289, term76289.getClass(), "next", null);
        setField(term76289, term76289.getClass(), "first", null);
        setField(term76289, term76289.getClass(), "last", null);
        setField(term76289, term76289.getClass(), "propListHead", null);
        setIntField(term76289, term76289.getClass(), "sourcePosition", -1);
        setField(term76289, term76289.getClass(), "jsType", null);
        setField(term76289, term76289.getClass(), "parent", null);
        setField(term76283, term76283.getClass(), "parametersNode", term76289);
        setField(term76283, term76283.getClass(), "sourceNode", null);
        setField(term76283, term76283.getClass(), "templateTypeName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term76091;
        Object retValue = callMethod(klass, "inferParameterTypes", argTypes, term75907, args);
        assertTrue(recursiveEquals(term75907, term76301));
        assertTrue(recursiveEquals(term76091, null));
        assertTrue(recursiveEquals(retValue, term76283));
    }

};


