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

public class StdTypeResolverBuilder_buildTypeDeserializer_1703628023103 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term76307;
     Object term77347;
     Object term77338;

    public StdTypeResolverBuilder_buildTypeDeserializer_1703628023103() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term77358 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonTypeInfo$Id");
        Field term77357 = ((Class) term77358).getDeclaredField((String) "NAME");
        ((Field) term77357).setAccessible(true);
        Object enum117 = ((Field) term77357).get((Object) null);
        Class<? extends Object> term77617 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonTypeInfo$As");
        Field term77616 = ((Class) term77617).getDeclaredField((String) "WRAPPER_OBJECT");
        ((Field) term77616).setAccessible(true);
        Object enum118 = ((Field) term77616).get((Object) null);
        term76307 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder"));
        Object term76595 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver"));
        setField(term76307, term76307.getClass(), "_idType", enum117);
        setField(term76307, term76307.getClass(), "_customIdResolver", term76595);
        setField(term76307, term76307.getClass(), "_defaultImpl", null);
        setField(term76307, term76307.getClass(), "_includeAs", enum118);
        Class<? extends Object> term77906 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonTypeInfo$Id");
        Field term77905 = ((Class) term77906).getDeclaredField((String) "NAME");
        ((Field) term77905).setAccessible(true);
        Object enum119 = ((Field) term77905).get((Object) null);
        Class<? extends Object> term78165 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonTypeInfo$As");
        Field term78164 = ((Class) term78165).getDeclaredField((String) "WRAPPER_OBJECT");
        ((Field) term78164).setAccessible(true);
        Object enum120 = ((Field) term78164).get((Object) null);
        term77347 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder"));
        Object term77356 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver"));
        setField(term77347, term77347.getClass(), "_idType", enum119);
        setField(term77347, term77347.getClass(), "_includeAs", enum120);
        setField(term77347, term77347.getClass(), "_typeProperty", null);
        setBooleanField(term77347, term77347.getClass(), "_typeIdVisible", false);
        setField(term77347, term77347.getClass(), "_defaultImpl", null);
        setField(term77356, term77356.getClass(), "_basePackageName", null);
        setField(term77356, term77356.getClass(), "_basePackagePrefix", null);
        setField(term77356, term77356.getClass(), "_typeFactory", null);
        setField(term77356, term77356.getClass(), "_baseType", null);
        setField(term77347, term77347.getClass(), "_customIdResolver", term77356);
        term77338 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        Object term77322 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver"));
        Object term77342 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term77322, term77322.getClass(), "_basePackageName", null);
        setField(term77322, term77322.getClass(), "_basePackagePrefix", null);
        setField(term77322, term77322.getClass(), "_typeFactory", null);
        setField(term77322, term77322.getClass(), "_baseType", null);
        setField(term77338, term77338.getClass(), "_idResolver", term77322);
        setField(term77338, term77338.getClass(), "_baseType", null);
        setField(term77338, term77338.getClass(), "_property", null);
        setField(term77338, term77338.getClass(), "_defaultImpl", null);
        setField(term77338, term77338.getClass(), "_typePropertyName", "");
        setBooleanField(term77338, term77338.getClass(), "_typeIdVisible", false);
        setField(term77342, term77342.getClass(), "table", null);
        setField(term77342, term77342.getClass(), "nextTable", null);
        setLongField(term77342, term77342.getClass(), "baseCount", 0L);
        setIntField(term77342, term77342.getClass(), "sizeCtl", 32);
        setIntField(term77342, term77342.getClass(), "transferIndex", 0);
        setIntField(term77342, term77342.getClass(), "cellsBusy", 0);
        setField(term77342, term77342.getClass(), "counterCells", null);
        setField(term77342, term77342.getClass(), "keySet", null);
        setField(term77342, term77342.getClass(), "values", null);
        setField(term77342, term77342.getClass(), "entrySet", null);
        setField(term77342, term77342.getClass(), "keySet", null);
        setField(term77342, term77342.getClass(), "values", null);
        setField(term77338, term77338.getClass(), "_deserializers", term77342);
        setField(term77338, term77338.getClass(), "_defaultImplDeserializer", null);
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
        Object retValue = callMethod(klass, "buildTypeDeserializer", argTypes, term76307, args);
        assertTrue(recursiveEquals(term76307, term77347));
        assertTrue(recursiveEquals(retValue, term77338));
    }

};


