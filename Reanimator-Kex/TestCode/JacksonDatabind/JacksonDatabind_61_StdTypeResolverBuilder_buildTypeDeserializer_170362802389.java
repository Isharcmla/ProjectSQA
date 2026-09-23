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
import java.lang.String;
import java.lang.Object;

public class StdTypeResolverBuilder_buildTypeDeserializer_170362802389 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62133;
     Object term63159;
     Object term63150;

    public StdTypeResolverBuilder_buildTypeDeserializer_170362802389() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term63170 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonTypeInfo$Id");
        Field term63169 = ((Class) term63170).getDeclaredField((String) "NAME");
        ((Field) term63169).setAccessible(true);
        Object enum95 = ((Field) term63169).get((Object) null);
        Class<? extends Object> term63429 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonTypeInfo$As");
        Field term63428 = ((Class) term63429).getDeclaredField((String) "WRAPPER_OBJECT");
        ((Field) term63428).setAccessible(true);
        Object enum96 = ((Field) term63428).get((Object) null);
        term62133 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder"));
        Object term62407 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver"));
        setField(term62133, term62133.getClass(), "_idType", enum95);
        setField(term62133, term62133.getClass(), "_customIdResolver", term62407);
        setField(term62133, term62133.getClass(), "_defaultImpl", null);
        setField(term62133, term62133.getClass(), "_includeAs", enum96);
        Class<? extends Object> term63718 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonTypeInfo$Id");
        Field term63717 = ((Class) term63718).getDeclaredField((String) "NAME");
        ((Field) term63717).setAccessible(true);
        Object enum97 = ((Field) term63717).get((Object) null);
        Class<? extends Object> term63977 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonTypeInfo$As");
        Field term63976 = ((Class) term63977).getDeclaredField((String) "WRAPPER_OBJECT");
        ((Field) term63976).setAccessible(true);
        Object enum98 = ((Field) term63976).get((Object) null);
        term63159 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder"));
        Object term63168 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver"));
        setField(term63159, term63159.getClass(), "_idType", enum97);
        setField(term63159, term63159.getClass(), "_includeAs", enum98);
        setField(term63159, term63159.getClass(), "_typeProperty", null);
        setBooleanField(term63159, term63159.getClass(), "_typeIdVisible", false);
        setField(term63159, term63159.getClass(), "_defaultImpl", null);
        setField(term63168, term63168.getClass(), "_typeFactory", null);
        setField(term63168, term63168.getClass(), "_baseType", null);
        setField(term63159, term63159.getClass(), "_customIdResolver", term63168);
        term63150 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        Object term63134 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver"));
        Object term63154 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term63134, term63134.getClass(), "_typeFactory", null);
        setField(term63134, term63134.getClass(), "_baseType", null);
        setField(term63150, term63150.getClass(), "_idResolver", term63134);
        setField(term63150, term63150.getClass(), "_baseType", null);
        setField(term63150, term63150.getClass(), "_property", null);
        setField(term63150, term63150.getClass(), "_defaultImpl", null);
        setField(term63150, term63150.getClass(), "_typePropertyName", "");
        setBooleanField(term63150, term63150.getClass(), "_typeIdVisible", false);
        setField(term63154, term63154.getClass(), "table", null);
        setField(term63154, term63154.getClass(), "nextTable", null);
        setLongField(term63154, term63154.getClass(), "baseCount", 0L);
        setIntField(term63154, term63154.getClass(), "sizeCtl", 32);
        setIntField(term63154, term63154.getClass(), "transferIndex", 0);
        setIntField(term63154, term63154.getClass(), "cellsBusy", 0);
        setField(term63154, term63154.getClass(), "counterCells", null);
        setField(term63154, term63154.getClass(), "keySet", null);
        setField(term63154, term63154.getClass(), "values", null);
        setField(term63154, term63154.getClass(), "entrySet", null);
        setField(term63154, term63154.getClass(), "keySet", null);
        setField(term63154, term63154.getClass(), "values", null);
        setField(term63150, term63150.getClass(), "_deserializers", term63154);
        setField(term63150, term63150.getClass(), "_defaultImplDeserializer", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.DeserializationConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[2] = Class.forName("java.util.Collection");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        Object retValue = callMethod(klass, "buildTypeDeserializer", argTypes, term62133, args);
        assertTrue(recursiveEquals(term62133, term63159));
        assertTrue(recursiveEquals(retValue, term63150));
    }

};


