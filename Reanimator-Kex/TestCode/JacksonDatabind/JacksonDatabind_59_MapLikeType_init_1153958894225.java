package com.fasterxml.jackson.databind.type;

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
import static com.fasterxml.jackson.databind.type.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.fasterxml.jackson.databind.type.EqualityUtils.*;
import java.lang.Object;
import java.lang.String;

public class MapLikeType_init_1153958894225 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term101397;
     Object term101503;
     Object term101599;
     Object term102129;
     Object term102154;
     Object term102155;
     Object term102156;

    public MapLikeType_init_1153958894225() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term101361 = Class.forName((String) "com.fasterxml.jackson.databind.ser.std.StdJdkSerializers$AtomicBooleanSerializer");
        Object term101325 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(term101325, term101325.getClass(), "_class", term101361);
        term101397 = Class.forName((String) "java.lang.IllegalArgumentException");
        term101503 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setIntField(term101503, term101503.getClass(), "_hash", 0);
        term101599 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setIntField(term101599, term101599.getClass(), "_hash", 0);
        Class<? extends Object> term102135 = Class.forName((String) "org.vorpal.research.kex.intrinsics.internal.ShortGenerator");
        term102129 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        Object term102130 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term102131 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term102132 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term102133 = (Object[]) newArray("java.lang.String", 0);
        Object[] term102134 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 0);
        setField(term102130, term102130.getClass(), "_elementType", null);
        setField(term102130, term102130.getClass(), "_superClass", null);
        setField(term102130, term102130.getClass(), "_superInterfaces", null);
        setField(term102130, term102130.getClass(), "_bindings", null);
        setField(term102130, term102130.getClass(), "_canonicalName", null);
        setField(term102130, term102130.getClass(), "_class", null);
        setIntField(term102130, term102130.getClass(), "_hash", 0);
        setField(term102130, term102130.getClass(), "_valueHandler", null);
        setField(term102130, term102130.getClass(), "_typeHandler", null);
        setBooleanField(term102130, term102130.getClass(), "_asStatic", false);
        setField(term102129, term102129.getClass(), "_keyType", term102130);
        setField(term102131, term102131.getClass(), "_componentType", null);
        setField(term102131, term102131.getClass(), "_emptyArray", null);
        setField(term102131, term102131.getClass(), "_superClass", null);
        setField(term102131, term102131.getClass(), "_superInterfaces", null);
        setField(term102131, term102131.getClass(), "_bindings", null);
        setField(term102131, term102131.getClass(), "_canonicalName", null);
        setField(term102131, term102131.getClass(), "_class", null);
        setIntField(term102131, term102131.getClass(), "_hash", 0);
        setField(term102131, term102131.getClass(), "_valueHandler", null);
        setField(term102131, term102131.getClass(), "_typeHandler", null);
        setBooleanField(term102131, term102131.getClass(), "_asStatic", false);
        setField(term102129, term102129.getClass(), "_valueType", term102131);
        setField(term102129, term102129.getClass(), "_superClass", null);
        setField(term102129, term102129.getClass(), "_superInterfaces", null);
        setField(term102132, term102132.getClass(), "_names", term102133);
        setField(term102132, term102132.getClass(), "_types", term102134);
        setField(term102132, term102132.getClass(), "_unboundVariables", null);
        setIntField(term102132, term102132.getClass(), "_hashCode", 1);
        setField(term102129, term102129.getClass(), "_bindings", term102132);
        setField(term102129, term102129.getClass(), "_canonicalName", null);
        setField(term102129, term102129.getClass(), "_class", term102135);
        setIntField(term102129, term102129.getClass(), "_hash", -1917901303);
        setField(term102129, term102129.getClass(), "_valueHandler", null);
        setField(term102129, term102129.getClass(), "_typeHandler", null);
        setBooleanField(term102129, term102129.getClass(), "_asStatic", false);
        term102154 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term102154, term102154.getClass(), "_elementType", null);
        setField(term102154, term102154.getClass(), "_superClass", null);
        setField(term102154, term102154.getClass(), "_superInterfaces", null);
        setField(term102154, term102154.getClass(), "_bindings", null);
        setField(term102154, term102154.getClass(), "_canonicalName", null);
        setField(term102154, term102154.getClass(), "_class", null);
        setIntField(term102154, term102154.getClass(), "_hash", 0);
        setField(term102154, term102154.getClass(), "_valueHandler", null);
        setField(term102154, term102154.getClass(), "_typeHandler", null);
        setBooleanField(term102154, term102154.getClass(), "_asStatic", false);
        term102155 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term102155, term102155.getClass(), "_componentType", null);
        setField(term102155, term102155.getClass(), "_emptyArray", null);
        setField(term102155, term102155.getClass(), "_superClass", null);
        setField(term102155, term102155.getClass(), "_superInterfaces", null);
        setField(term102155, term102155.getClass(), "_bindings", null);
        setField(term102155, term102155.getClass(), "_canonicalName", null);
        setField(term102155, term102155.getClass(), "_class", null);
        setIntField(term102155, term102155.getClass(), "_hash", 0);
        setField(term102155, term102155.getClass(), "_valueHandler", null);
        setField(term102155, term102155.getClass(), "_typeHandler", null);
        setBooleanField(term102155, term102155.getClass(), "_asStatic", false);
        term102156 = Class.forName((String) "org.vorpal.research.kex.intrinsics.internal.ShortGenerator");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.MapLikeType");
        Class<?>[] argTypes = new Class<?>[9];
        argTypes[0] = Class.forName("java.lang.Class");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[3] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.JavaType"), 0).getClass();
        argTypes[4] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[5] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[6] = Class.forName("java.lang.Object");
        argTypes[7] = Class.forName("java.lang.Object");
        argTypes[8] = boolean.class;
        Object[] args = new Object[9];
        args[0] = term101397;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        args[4] = term101503;
        args[5] = term101599;
        args[6] = null;
        args[7] = null;
        args[8] = false;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term102129));
        assertTrue(recursiveEquals(term101397, term102154));
        assertTrue(recursiveEquals(term101503, null));
        assertTrue(recursiveEquals(term101599, false));
    }

};


