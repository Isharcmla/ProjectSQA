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

public class FunctionTypeBuilder_inferParameterTypes_212883572143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60844;
     Object term61098;
     Object term61603;
     Object term61604;
     Object term61583;

    public FunctionTypeBuilder_inferParameterTypes_212883572143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term60844 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term60914 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term61018 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term60914, term60914.getClass(), "first", null);
        setField(term60844, term60844.getClass(), "parametersNode", term60914);
        setField(term60844, term60844.getClass(), "typeRegistry", term61018);
        term61098 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term61098, term61098.getClass(), "info", null);
        term61603 = newInstance(Class.forName("com.google.common.collect.EmptyImmutableSet"));
        setField(term61603, term61603.getClass(), "asList", null);
        term61604 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term61604, term61604.getClass(), "info", null);
        setField(term61604, term61604.getClass(), "documentation", null);
        setField(term61604, term61604.getClass(), "sourceName", null);
        setField(term61604, term61604.getClass(), "visibility", null);
        setIntField(term61604, term61604.getClass(), "bitset", 0);
        setField(term61604, term61604.getClass(), "type", null);
        setField(term61604, term61604.getClass(), "thisType", null);
        setBooleanField(term61604, term61604.getClass(), "includeDocumentation", false);
        term61583 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term61584 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object term61590 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term61583, term61583.getClass(), "fnName", null);
        setField(term61583, term61583.getClass(), "compiler", null);
        setField(term61583, term61583.getClass(), "codingConvention", null);
        setField(term61584, term61584.getClass(), "reporter", null);
        setField(term61584, term61584.getClass(), "nativeTypes", null);
        setField(term61584, term61584.getClass(), "namesToTypes", null);
        setField(term61584, term61584.getClass(), "namespaces", null);
        setField(term61584, term61584.getClass(), "nonNullableTypeNames", null);
        setField(term61584, term61584.getClass(), "forwardDeclaredTypes", null);
        setField(term61584, term61584.getClass(), "typesIndexedByProperty", null);
        setField(term61584, term61584.getClass(), "greatestSubtypeByProperty", null);
        setField(term61584, term61584.getClass(), "interfaceToImplementors", null);
        setField(term61584, term61584.getClass(), "unresolvedNamedTypes", null);
        setField(term61584, term61584.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term61584, term61584.getClass(), "lastGeneration", false);
        setField(term61584, term61584.getClass(), "templateTypeName", null);
        setField(term61584, term61584.getClass(), "templateType", null);
        setBooleanField(term61584, term61584.getClass(), "tolerateUndefinedValues", false);
        setField(term61584, term61584.getClass(), "resolveMode", null);
        setField(term61583, term61583.getClass(), "typeRegistry", term61584);
        setField(term61583, term61583.getClass(), "errorRoot", null);
        setField(term61583, term61583.getClass(), "sourceName", null);
        setField(term61583, term61583.getClass(), "scope", null);
        setField(term61583, term61583.getClass(), "returnType", null);
        setBooleanField(term61583, term61583.getClass(), "returnTypeInferred", false);
        setField(term61583, term61583.getClass(), "implementedInterfaces", null);
        setField(term61583, term61583.getClass(), "baseType", null);
        setField(term61583, term61583.getClass(), "thisType", null);
        setBooleanField(term61583, term61583.getClass(), "isConstructor", false);
        setBooleanField(term61583, term61583.getClass(), "isInterface", false);
        setIntField(term61590, term61590.getClass(), "type", 83);
        setField(term61590, term61590.getClass(), "next", null);
        setField(term61590, term61590.getClass(), "first", null);
        setField(term61590, term61590.getClass(), "last", null);
        setField(term61590, term61590.getClass(), "propListHead", null);
        setIntField(term61590, term61590.getClass(), "sourcePosition", -1);
        setField(term61590, term61590.getClass(), "jsType", null);
        setField(term61590, term61590.getClass(), "parent", null);
        setField(term61583, term61583.getClass(), "parametersNode", term61590);
        setField(term61583, term61583.getClass(), "sourceNode", null);
        setField(term61583, term61583.getClass(), "templateTypeName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term61098;
        Object retValue = callMethod(klass, "inferParameterTypes", argTypes, term60844, args);
        assertTrue(recursiveEquals(term60844, term61603));
        assertTrue(recursiveEquals(term61098, null));
        assertTrue(recursiveEquals(retValue, term61583));
    }

};


