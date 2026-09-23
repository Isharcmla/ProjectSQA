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

public class StdTypeResolverBuilder_buildTypeSerializer_565512902368 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term395930;
     Object term396184;
     Object term397803;
     Object term397807;

    public StdTypeResolverBuilder_buildTypeSerializer_565512902368() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term397828 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term397827 = ((Class) term397828).getDeclaredField((String) "JAVA_LANG_OBJECT");
        ((Field) term397827).setAccessible(true);
        Object enum461 = ((Field) term397827).get((Object) null);
        term395930 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term395930, term395930.getClass(), "_appliesFor", enum461);
        Class<? extends Object> term396220 = Class.forName((String) "java.nio.file.attribute.AclEntry");
        term396184 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term396184, term396184.getClass(), "_class", term396220);
        Class<? extends Object> term398276 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term398275 = ((Class) term398276).getDeclaredField((String) "JAVA_LANG_OBJECT");
        ((Field) term398275).setAccessible(true);
        Object enum462 = ((Field) term398275).get((Object) null);
        term397803 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term397803, term397803.getClass(), "_appliesFor", enum462);
        setField(term397803, term397803.getClass(), "_idType", null);
        setField(term397803, term397803.getClass(), "_includeAs", null);
        setField(term397803, term397803.getClass(), "_typeProperty", null);
        setBooleanField(term397803, term397803.getClass(), "_typeIdVisible", false);
        setField(term397803, term397803.getClass(), "_defaultImpl", null);
        setField(term397803, term397803.getClass(), "_customIdResolver", null);
        Class<? extends Object> term397808 = Class.forName((String) "com.fasterxml.jackson.databind.ser.DefaultSerializerProvider");
        term397807 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term397807, term397807.getClass(), "_componentType", null);
        setField(term397807, term397807.getClass(), "_emptyArray", null);
        setField(term397807, term397807.getClass(), "_superClass", null);
        setField(term397807, term397807.getClass(), "_superInterfaces", null);
        setField(term397807, term397807.getClass(), "_bindings", null);
        setField(term397807, term397807.getClass(), "_canonicalName", null);
        setField(term397807, term397807.getClass(), "_class", term397808);
        setIntField(term397807, term397807.getClass(), "_hash", 0);
        setField(term397807, term397807.getClass(), "_valueHandler", null);
        setField(term397807, term397807.getClass(), "_typeHandler", null);
        setBooleanField(term397807, term397807.getClass(), "_asStatic", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.SerializationConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[2] = Class.forName("java.util.Collection");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term396184;
        args[2] = null;
        callMethod(klass, "buildTypeSerializer", argTypes, term395930, args);
        assertTrue(recursiveEquals(term395930, term397803));
        assertTrue(recursiveEquals(term396184, null));
    }

};


