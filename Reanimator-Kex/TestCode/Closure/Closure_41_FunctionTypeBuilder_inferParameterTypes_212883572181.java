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

public class FunctionTypeBuilder_inferParameterTypes_212883572181 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56178;
     Object term56432;
     Object term56782;
     Object term56783;
     Object term56762;

    public FunctionTypeBuilder_inferParameterTypes_212883572181() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term56178 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term56248 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term56352 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term56248, term56248.getClass(), "first", null);
        setField(term56178, term56178.getClass(), "parametersNode", term56248);
        setField(term56178, term56178.getClass(), "typeRegistry", term56352);
        setField(term56178, term56178.getClass(), "templateTypeName", null);
        term56432 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term56432, term56432.getClass(), "info", null);
        term56782 = newInstance(Class.forName("com.google.common.collect.EmptyImmutableSet"));
        setField(term56782, term56782.getClass(), "asList", null);
        term56783 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term56783, term56783.getClass(), "info", null);
        setField(term56783, term56783.getClass(), "documentation", null);
        setField(term56783, term56783.getClass(), "associatedNode", null);
        setField(term56783, term56783.getClass(), "visibility", null);
        setIntField(term56783, term56783.getClass(), "bitset", 0);
        setField(term56783, term56783.getClass(), "type", null);
        setField(term56783, term56783.getClass(), "thisType", null);
        setBooleanField(term56783, term56783.getClass(), "includeDocumentation", false);
        term56762 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term56763 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object term56769 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term56762, term56762.getClass(), "fnName", null);
        setField(term56762, term56762.getClass(), "compiler", null);
        setField(term56762, term56762.getClass(), "codingConvention", null);
        setField(term56763, term56763.getClass(), "reporter", null);
        setField(term56763, term56763.getClass(), "nativeTypes", null);
        setField(term56763, term56763.getClass(), "namesToTypes", null);
        setField(term56763, term56763.getClass(), "namespaces", null);
        setField(term56763, term56763.getClass(), "nonNullableTypeNames", null);
        setField(term56763, term56763.getClass(), "forwardDeclaredTypes", null);
        setField(term56763, term56763.getClass(), "typesIndexedByProperty", null);
        setField(term56763, term56763.getClass(), "eachRefTypeIndexedByProperty", null);
        setField(term56763, term56763.getClass(), "greatestSubtypeByProperty", null);
        setField(term56763, term56763.getClass(), "interfaceToImplementors", null);
        setField(term56763, term56763.getClass(), "unresolvedNamedTypes", null);
        setField(term56763, term56763.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term56763, term56763.getClass(), "lastGeneration", false);
        setField(term56763, term56763.getClass(), "templateTypeName", null);
        setField(term56763, term56763.getClass(), "templateType", null);
        setBooleanField(term56763, term56763.getClass(), "tolerateUndefinedValues", false);
        setField(term56763, term56763.getClass(), "resolveMode", null);
        setField(term56762, term56762.getClass(), "typeRegistry", term56763);
        setField(term56762, term56762.getClass(), "errorRoot", null);
        setField(term56762, term56762.getClass(), "sourceName", null);
        setField(term56762, term56762.getClass(), "scope", null);
        setField(term56762, term56762.getClass(), "contents", null);
        setField(term56762, term56762.getClass(), "returnType", null);
        setBooleanField(term56762, term56762.getClass(), "returnTypeInferred", false);
        setField(term56762, term56762.getClass(), "implementedInterfaces", null);
        setField(term56762, term56762.getClass(), "extendedInterfaces", null);
        setField(term56762, term56762.getClass(), "baseType", null);
        setField(term56762, term56762.getClass(), "thisType", null);
        setBooleanField(term56762, term56762.getClass(), "isConstructor", false);
        setBooleanField(term56762, term56762.getClass(), "isInterface", false);
        setIntField(term56769, term56769.getClass(), "type", 83);
        setField(term56769, term56769.getClass(), "next", null);
        setField(term56769, term56769.getClass(), "first", null);
        setField(term56769, term56769.getClass(), "last", null);
        setField(term56769, term56769.getClass(), "propListHead", null);
        setIntField(term56769, term56769.getClass(), "sourcePosition", -1);
        setField(term56769, term56769.getClass(), "jsType", null);
        setField(term56769, term56769.getClass(), "parent", null);
        setField(term56762, term56762.getClass(), "parametersNode", term56769);
        setField(term56762, term56762.getClass(), "templateTypeName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term56432;
        Object retValue = callMethod(klass, "inferParameterTypes", argTypes, term56178, args);
        assertTrue(recursiveEquals(term56178, term56782));
        assertTrue(recursiveEquals(term56432, null));
        assertTrue(recursiveEquals(retValue, term56762));
    }

};


