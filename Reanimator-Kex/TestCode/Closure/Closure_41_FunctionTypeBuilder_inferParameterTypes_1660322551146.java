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

public class FunctionTypeBuilder_inferParameterTypes_1660322551146 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43036;
     Object term43220;
     Object term43619;
     Object term43620;
     Object term43609;

    public FunctionTypeBuilder_inferParameterTypes_1660322551146() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43036 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term43140 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term43036, term43036.getClass(), "parametersNode", null);
        setField(term43036, term43036.getClass(), "typeRegistry", term43140);
        setField(term43036, term43036.getClass(), "templateTypeName", null);
        term43220 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term43220, term43220.getClass(), "info", null);
        term43619 = newInstance(Class.forName("com.google.common.collect.EmptyImmutableSet"));
        setField(term43619, term43619.getClass(), "asList", null);
        term43620 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term43620, term43620.getClass(), "info", null);
        setField(term43620, term43620.getClass(), "documentation", null);
        setField(term43620, term43620.getClass(), "associatedNode", null);
        setField(term43620, term43620.getClass(), "visibility", null);
        setIntField(term43620, term43620.getClass(), "bitset", 0);
        setField(term43620, term43620.getClass(), "type", null);
        setField(term43620, term43620.getClass(), "thisType", null);
        setBooleanField(term43620, term43620.getClass(), "includeDocumentation", false);
        term43609 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term43610 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object term43616 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term43609, term43609.getClass(), "fnName", null);
        setField(term43609, term43609.getClass(), "compiler", null);
        setField(term43609, term43609.getClass(), "codingConvention", null);
        setField(term43610, term43610.getClass(), "reporter", null);
        setField(term43610, term43610.getClass(), "nativeTypes", null);
        setField(term43610, term43610.getClass(), "namesToTypes", null);
        setField(term43610, term43610.getClass(), "namespaces", null);
        setField(term43610, term43610.getClass(), "nonNullableTypeNames", null);
        setField(term43610, term43610.getClass(), "forwardDeclaredTypes", null);
        setField(term43610, term43610.getClass(), "typesIndexedByProperty", null);
        setField(term43610, term43610.getClass(), "eachRefTypeIndexedByProperty", null);
        setField(term43610, term43610.getClass(), "greatestSubtypeByProperty", null);
        setField(term43610, term43610.getClass(), "interfaceToImplementors", null);
        setField(term43610, term43610.getClass(), "unresolvedNamedTypes", null);
        setField(term43610, term43610.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term43610, term43610.getClass(), "lastGeneration", false);
        setField(term43610, term43610.getClass(), "templateTypeName", null);
        setField(term43610, term43610.getClass(), "templateType", null);
        setBooleanField(term43610, term43610.getClass(), "tolerateUndefinedValues", false);
        setField(term43610, term43610.getClass(), "resolveMode", null);
        setField(term43609, term43609.getClass(), "typeRegistry", term43610);
        setField(term43609, term43609.getClass(), "errorRoot", null);
        setField(term43609, term43609.getClass(), "sourceName", null);
        setField(term43609, term43609.getClass(), "scope", null);
        setField(term43609, term43609.getClass(), "contents", null);
        setField(term43609, term43609.getClass(), "returnType", null);
        setBooleanField(term43609, term43609.getClass(), "returnTypeInferred", false);
        setField(term43609, term43609.getClass(), "implementedInterfaces", null);
        setField(term43609, term43609.getClass(), "extendedInterfaces", null);
        setField(term43609, term43609.getClass(), "baseType", null);
        setField(term43609, term43609.getClass(), "thisType", null);
        setBooleanField(term43609, term43609.getClass(), "isConstructor", false);
        setBooleanField(term43609, term43609.getClass(), "isInterface", false);
        setIntField(term43616, term43616.getClass(), "type", 83);
        setField(term43616, term43616.getClass(), "next", null);
        setField(term43616, term43616.getClass(), "first", null);
        setField(term43616, term43616.getClass(), "last", null);
        setField(term43616, term43616.getClass(), "propListHead", null);
        setIntField(term43616, term43616.getClass(), "sourcePosition", -1);
        setField(term43616, term43616.getClass(), "jsType", null);
        setField(term43616, term43616.getClass(), "parent", null);
        setField(term43609, term43609.getClass(), "parametersNode", term43616);
        setField(term43609, term43609.getClass(), "templateTypeName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[1];
        args[0] = term43220;
        Object retValue = callMethod(klass, "inferParameterTypes", argTypes, term43036, args);
        assertTrue(recursiveEquals(term43036, term43619));
        assertTrue(recursiveEquals(term43220, term43620));
        assertTrue(recursiveEquals(retValue, term43609));
    }

};


