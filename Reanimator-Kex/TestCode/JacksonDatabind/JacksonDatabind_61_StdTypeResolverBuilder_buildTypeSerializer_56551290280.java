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

public class StdTypeResolverBuilder_buildTypeSerializer_56551290280 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47768;
     Object term50563;
     Object term50562;

    public StdTypeResolverBuilder_buildTypeSerializer_56551290280() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term50574 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonTypeInfo$Id");
        Field term50573 = ((Class) term50574).getDeclaredField((String) "NAME");
        ((Field) term50573).setAccessible(true);
        Object enum71 = ((Field) term50573).get((Object) null);
        Class<? extends Object> term50833 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonTypeInfo$As");
        Field term50832 = ((Class) term50833).getDeclaredField((String) "PROPERTY");
        ((Field) term50832).setAccessible(true);
        Object enum72 = ((Field) term50832).get((Object) null);
        term47768 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder"));
        Object term48056 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver"));
        setField(term47768, term47768.getClass(), "_idType", enum71);
        setField(term47768, term47768.getClass(), "_customIdResolver", term48056);
        setField(term47768, term47768.getClass(), "_includeAs", enum72);
        Class<? extends Object> term51104 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonTypeInfo$Id");
        Field term51103 = ((Class) term51104).getDeclaredField((String) "NAME");
        ((Field) term51103).setAccessible(true);
        Object enum73 = ((Field) term51103).get((Object) null);
        Class<? extends Object> term51363 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonTypeInfo$As");
        Field term51362 = ((Class) term51363).getDeclaredField((String) "PROPERTY");
        ((Field) term51362).setAccessible(true);
        Object enum74 = ((Field) term51362).get((Object) null);
        term50563 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder"));
        Object term50572 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver"));
        setField(term50563, term50563.getClass(), "_idType", enum73);
        setField(term50563, term50563.getClass(), "_includeAs", enum74);
        setField(term50563, term50563.getClass(), "_typeProperty", null);
        setBooleanField(term50563, term50563.getClass(), "_typeIdVisible", false);
        setField(term50563, term50563.getClass(), "_defaultImpl", null);
        setField(term50572, term50572.getClass(), "_basePackageName", null);
        setField(term50572, term50572.getClass(), "_basePackagePrefix", null);
        setField(term50572, term50572.getClass(), "_typeFactory", null);
        setField(term50572, term50572.getClass(), "_baseType", null);
        setField(term50563, term50563.getClass(), "_customIdResolver", term50572);
        term50562 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeSerializer"));
        Object term50557 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver"));
        setField(term50562, term50562.getClass(), "_typePropertyName", null);
        setField(term50557, term50557.getClass(), "_basePackageName", null);
        setField(term50557, term50557.getClass(), "_basePackagePrefix", null);
        setField(term50557, term50557.getClass(), "_typeFactory", null);
        setField(term50557, term50557.getClass(), "_baseType", null);
        setField(term50562, term50562.getClass(), "_idResolver", term50557);
        setField(term50562, term50562.getClass(), "_property", null);
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
        args[1] = null;
        args[2] = null;
        Object retValue = callMethod(klass, "buildTypeSerializer", argTypes, term47768, args);
        assertTrue(recursiveEquals(term47768, term50563));
        assertTrue(recursiveEquals(retValue, term50562));
    }

};


