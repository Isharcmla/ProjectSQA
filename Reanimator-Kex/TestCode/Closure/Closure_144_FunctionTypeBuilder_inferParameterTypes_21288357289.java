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

public class FunctionTypeBuilder_inferParameterTypes_21288357289 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54495;
     Object term54679;
     Object term54827;
     Object term54828;
     Object term54809;

    public FunctionTypeBuilder_inferParameterTypes_21288357289() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term54495 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term54599 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term54495, term54495.getClass(), "typeRegistry", term54599);
        term54679 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term54679, term54679.getClass(), "info", null);
        term54827 = newInstance(Class.forName("com.google.common.collect.EmptyImmutableSet"));
        setField(term54827, term54827.getClass(), "asList", null);
        term54828 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term54828, term54828.getClass(), "info", null);
        setField(term54828, term54828.getClass(), "documentation", null);
        setField(term54828, term54828.getClass(), "sourceName", null);
        setField(term54828, term54828.getClass(), "visibility", null);
        setIntField(term54828, term54828.getClass(), "bitset", 0);
        setField(term54828, term54828.getClass(), "type", null);
        setField(term54828, term54828.getClass(), "thisType", null);
        setBooleanField(term54828, term54828.getClass(), "includeDocumentation", false);
        term54809 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term54810 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object term54815 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term54809, term54809.getClass(), "fnName", null);
        setField(term54809, term54809.getClass(), "compiler", null);
        setField(term54809, term54809.getClass(), "codingConvention", null);
        setField(term54810, term54810.getClass(), "reporter", null);
        setField(term54810, term54810.getClass(), "nativeTypes", null);
        setField(term54810, term54810.getClass(), "namesToTypes", null);
        setField(term54810, term54810.getClass(), "namespaces", null);
        setField(term54810, term54810.getClass(), "enumTypeNames", null);
        setField(term54810, term54810.getClass(), "forwardDeclaredTypes", null);
        setField(term54810, term54810.getClass(), "typesIndexedByProperty", null);
        setField(term54810, term54810.getClass(), "greatestSubtypeByProperty", null);
        setField(term54810, term54810.getClass(), "interfaceToImplementors", null);
        setField(term54810, term54810.getClass(), "unresolvedNamedTypes", null);
        setField(term54810, term54810.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term54810, term54810.getClass(), "lastGeneration", false);
        setField(term54810, term54810.getClass(), "templateTypeName", null);
        setField(term54810, term54810.getClass(), "templateType", null);
        setBooleanField(term54810, term54810.getClass(), "tolerateUndefinedValues", false);
        setField(term54810, term54810.getClass(), "resolveMode", null);
        setField(term54809, term54809.getClass(), "typeRegistry", term54810);
        setField(term54809, term54809.getClass(), "errorRoot", null);
        setField(term54809, term54809.getClass(), "sourceName", null);
        setField(term54809, term54809.getClass(), "scope", null);
        setField(term54809, term54809.getClass(), "returnType", null);
        setField(term54809, term54809.getClass(), "implementedInterfaces", null);
        setField(term54809, term54809.getClass(), "baseType", null);
        setField(term54809, term54809.getClass(), "thisType", null);
        setBooleanField(term54809, term54809.getClass(), "isConstructor", false);
        setBooleanField(term54809, term54809.getClass(), "isInterface", false);
        setIntField(term54815, term54815.getClass(), "type", 83);
        setField(term54815, term54815.getClass(), "next", null);
        setField(term54815, term54815.getClass(), "first", null);
        setField(term54815, term54815.getClass(), "last", null);
        setField(term54815, term54815.getClass(), "propListHead", null);
        setIntField(term54815, term54815.getClass(), "sourcePosition", -1);
        setField(term54815, term54815.getClass(), "jsType", null);
        setField(term54815, term54815.getClass(), "parent", null);
        setField(term54809, term54809.getClass(), "parametersNode", term54815);
        setField(term54809, term54809.getClass(), "sourceNode", null);
        setField(term54809, term54809.getClass(), "templateTypeName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term54679;
        Object retValue = callMethod(klass, "inferParameterTypes", argTypes, term54495, args);
        assertTrue(recursiveEquals(term54495, term54827));
        assertTrue(recursiveEquals(term54679, null));
        assertTrue(recursiveEquals(retValue, term54809));
    }

};


