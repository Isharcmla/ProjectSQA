package com.google.javascript.rhino.jstype;

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
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.rhino.jstype.EqualityUtils.*;
import java.lang.Object;

public class ArrowType_init_181064513933 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5261;
     Object term5331;
     Object term5425;
     Object term5522;
     Object term5526;
     Object term5527;
     Object term5528;

    public ArrowType_init_181064513933() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term4871 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term4983 = newInstance(Class.forName("com.google.javascript.rhino.jstype.InstanceObjectType"));
        Object term5087 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object term5157 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setBooleanField(term4871, term4871.getClass(), "resolved", false);
        setField(term4871, term4871.getClass(), "resolveResult", term4983);
        setField(term4871, term4871.getClass(), "registry", term5087);
        setField(term4871, term4871.getClass(), "parameters", term5157);
        term5261 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        term5331 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        term5425 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        term5522 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term5523 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5524 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term5525 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setIntField(term5523, term5523.getClass(), "type", 0);
        setField(term5523, term5523.getClass(), "next", null);
        setField(term5523, term5523.getClass(), "first", null);
        setField(term5523, term5523.getClass(), "last", null);
        setField(term5523, term5523.getClass(), "propListHead", null);
        setIntField(term5523, term5523.getClass(), "sourcePosition", 0);
        setField(term5523, term5523.getClass(), "jsType", null);
        setField(term5523, term5523.getClass(), "parent", null);
        setField(term5522, term5522.getClass(), "parameters", term5523);
        setField(term5524, term5524.getClass(), "parameters", null);
        setField(term5524, term5524.getClass(), "returnType", null);
        setBooleanField(term5524, term5524.getClass(), "returnTypeInferred", false);
        setBooleanField(term5524, term5524.getClass(), "resolved", false);
        setField(term5524, term5524.getClass(), "resolveResult", null);
        setField(term5524, term5524.getClass(), "registry", null);
        setField(term5522, term5522.getClass(), "returnType", term5524);
        setBooleanField(term5522, term5522.getClass(), "returnTypeInferred", false);
        setBooleanField(term5522, term5522.getClass(), "resolved", false);
        setField(term5522, term5522.getClass(), "resolveResult", null);
        setField(term5525, term5525.getClass(), "reporter", null);
        setField(term5525, term5525.getClass(), "nativeTypes", null);
        setField(term5525, term5525.getClass(), "namesToTypes", null);
        setField(term5525, term5525.getClass(), "namespaces", null);
        setField(term5525, term5525.getClass(), "nonNullableTypeNames", null);
        setField(term5525, term5525.getClass(), "forwardDeclaredTypes", null);
        setField(term5525, term5525.getClass(), "typesIndexedByProperty", null);
        setField(term5525, term5525.getClass(), "eachRefTypeIndexedByProperty", null);
        setField(term5525, term5525.getClass(), "greatestSubtypeByProperty", null);
        setField(term5525, term5525.getClass(), "interfaceToImplementors", null);
        setField(term5525, term5525.getClass(), "unresolvedNamedTypes", null);
        setField(term5525, term5525.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term5525, term5525.getClass(), "lastGeneration", false);
        setField(term5525, term5525.getClass(), "templateTypeName", null);
        setField(term5525, term5525.getClass(), "templateType", null);
        setBooleanField(term5525, term5525.getClass(), "tolerateUndefinedValues", false);
        setField(term5525, term5525.getClass(), "resolveMode", null);
        setField(term5522, term5522.getClass(), "registry", term5525);
        term5526 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term5526, term5526.getClass(), "reporter", null);
        setField(term5526, term5526.getClass(), "nativeTypes", null);
        setField(term5526, term5526.getClass(), "namesToTypes", null);
        setField(term5526, term5526.getClass(), "namespaces", null);
        setField(term5526, term5526.getClass(), "nonNullableTypeNames", null);
        setField(term5526, term5526.getClass(), "forwardDeclaredTypes", null);
        setField(term5526, term5526.getClass(), "typesIndexedByProperty", null);
        setField(term5526, term5526.getClass(), "eachRefTypeIndexedByProperty", null);
        setField(term5526, term5526.getClass(), "greatestSubtypeByProperty", null);
        setField(term5526, term5526.getClass(), "interfaceToImplementors", null);
        setField(term5526, term5526.getClass(), "unresolvedNamedTypes", null);
        setField(term5526, term5526.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term5526, term5526.getClass(), "lastGeneration", false);
        setField(term5526, term5526.getClass(), "templateTypeName", null);
        setField(term5526, term5526.getClass(), "templateType", null);
        setBooleanField(term5526, term5526.getClass(), "tolerateUndefinedValues", false);
        setField(term5526, term5526.getClass(), "resolveMode", null);
        term5527 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term5527, term5527.getClass(), "type", 0);
        setField(term5527, term5527.getClass(), "next", null);
        setField(term5527, term5527.getClass(), "first", null);
        setField(term5527, term5527.getClass(), "last", null);
        setField(term5527, term5527.getClass(), "propListHead", null);
        setIntField(term5527, term5527.getClass(), "sourcePosition", 0);
        setField(term5527, term5527.getClass(), "jsType", null);
        setField(term5527, term5527.getClass(), "parent", null);
        term5528 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term5528, term5528.getClass(), "parameters", null);
        setField(term5528, term5528.getClass(), "returnType", null);
        setBooleanField(term5528, term5528.getClass(), "returnTypeInferred", false);
        setBooleanField(term5528, term5528.getClass(), "resolved", false);
        setField(term5528, term5528.getClass(), "resolveResult", null);
        setField(term5528, term5528.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.ArrowType");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[3] = boolean.class;
        Object[] args = new Object[4];
        args[0] = term5261;
        args[1] = term5331;
        args[2] = term5425;
        args[3] = false;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term5522));
        assertTrue(recursiveEquals(term5261, term5526));
        assertTrue(recursiveEquals(term5331, term5527));
        assertTrue(recursiveEquals(term5425, term5528));
    }

};


