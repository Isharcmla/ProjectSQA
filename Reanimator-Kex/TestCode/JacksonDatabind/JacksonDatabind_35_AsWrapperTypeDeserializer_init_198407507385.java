package com.fasterxml.jackson.databind.jsontype.impl;

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
import static com.fasterxml.jackson.databind.jsontype.impl.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.fasterxml.jackson.databind.jsontype.impl.EqualityUtils.*;
import java.lang.Object;
import java.lang.String;
import java.util.HashMap;

public class AsWrapperTypeDeserializer_init_198407507385 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70743;
     Object term70913;
     Object term72052;
     Object term72068;
     Object term72075;

    public AsWrapperTypeDeserializer_init_198407507385() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term70637 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        setField(term70637, term70637.getClass(), "_baseType", null);
        setField(term70637, term70637.getClass(), "_idResolver", null);
        setField(term70637, term70637.getClass(), "_typePropertyName", null);
        setBooleanField(term70637, term70637.getClass(), "_typeIdVisible", false);
        setField(term70637, term70637.getClass(), "_deserializers", null);
        term70743 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term70839 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term70743, term70743.getClass(), "_class", null);
        setField(term70743, term70743.getClass(), "_elementType", term70839);
        setField(term70743, term70743.getClass(), "_valueHandler", "byte");
        setField(term70743, term70743.getClass(), "_typeHandler", null);
        setBooleanField(term70743, term70743.getClass(), "_asStatic", false);
        term70913 = Class.forName((String) "com.fasterxml.jackson.core.sym.Name1");
        Class<? extends Object> term72058 = Class.forName((String) "kex.java.util.concurrent.atomic.AtomicStampedReference");
        HashMap term72067 = new HashMap();
        term72052 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        Object term72053 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term72054 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term72057 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term72052, term72052.getClass(), "_idResolver", null);
        setField(term72054, term72054.getClass(), "_componentType", null);
        setField(term72054, term72054.getClass(), "_emptyArray", null);
        setField(term72054, term72054.getClass(), "_canonicalName", null);
        setField(term72054, term72054.getClass(), "_class", null);
        setIntField(term72054, term72054.getClass(), "_hash", 0);
        setField(term72054, term72054.getClass(), "_valueHandler", null);
        setField(term72054, term72054.getClass(), "_typeHandler", null);
        setBooleanField(term72054, term72054.getClass(), "_asStatic", false);
        setField(term72053, term72053.getClass(), "_elementType", term72054);
        setField(term72053, term72053.getClass(), "_canonicalName", null);
        setField(term72053, term72053.getClass(), "_class", null);
        setIntField(term72053, term72053.getClass(), "_hash", 0);
        setField(term72053, term72053.getClass(), "_valueHandler", "byte");
        setField(term72053, term72053.getClass(), "_typeHandler", null);
        setBooleanField(term72053, term72053.getClass(), "_asStatic", false);
        setField(term72052, term72052.getClass(), "_baseType", term72053);
        setField(term72052, term72052.getClass(), "_property", null);
        setField(term72057, term72057.getClass(), "_elementType", term72054);
        setField(term72057, term72057.getClass(), "_canonicalName", null);
        setField(term72057, term72057.getClass(), "_class", term72058);
        setIntField(term72057, term72057.getClass(), "_hash", 367926928);
        setField(term72057, term72057.getClass(), "_valueHandler", "byte");
        setField(term72057, term72057.getClass(), "_typeHandler", null);
        setBooleanField(term72057, term72057.getClass(), "_asStatic", false);
        setField(term72052, term72052.getClass(), "_defaultImpl", term72057);
        setField(term72052, term72052.getClass(), "_typePropertyName", null);
        setBooleanField(term72052, term72052.getClass(), "_typeIdVisible", true);
        setField(term72052, term72052.getClass(), "_deserializers", term72067);
        setField(term72052, term72052.getClass(), "_defaultImplDeserializer", null);
        term72068 = Class.forName((String) "kex.java.util.concurrent.atomic.AtomicStampedReference");
        term72075 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term72076 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term72076, term72076.getClass(), "_componentType", null);
        setField(term72076, term72076.getClass(), "_emptyArray", null);
        setField(term72076, term72076.getClass(), "_canonicalName", null);
        setField(term72076, term72076.getClass(), "_class", null);
        setIntField(term72076, term72076.getClass(), "_hash", 0);
        setField(term72076, term72076.getClass(), "_valueHandler", null);
        setField(term72076, term72076.getClass(), "_typeHandler", null);
        setBooleanField(term72076, term72076.getClass(), "_asStatic", false);
        setField(term72075, term72075.getClass(), "_elementType", term72076);
        setField(term72075, term72075.getClass(), "_canonicalName", null);
        setField(term72075, term72075.getClass(), "_class", null);
        setIntField(term72075, term72075.getClass(), "_hash", 0);
        setField(term72075, term72075.getClass(), "_valueHandler", "byte");
        setField(term72075, term72075.getClass(), "_typeHandler", null);
        setBooleanField(term72075, term72075.getClass(), "_asStatic", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.jsontype.TypeIdResolver");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = boolean.class;
        argTypes[4] = Class.forName("java.lang.Class");
        Object[] args = new Object[5];
        args[0] = term70743;
        args[1] = null;
        args[2] = null;
        args[3] = true;
        args[4] = term70913;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term72052));
        assertTrue(recursiveEquals(term70743, term72068));
        assertTrue(recursiveEquals(term70913, true));
    }

};


