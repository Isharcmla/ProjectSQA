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

public class StdTypeResolverBuilder_buildTypeSerializer_565512902115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term87725;
     Object term88711;
     Object term88710;

    public StdTypeResolverBuilder_buildTypeSerializer_565512902115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term88722 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonTypeInfo$Id");
        Field term88721 = ((Class) term88722).getDeclaredField((String) "CLASS");
        ((Field) term88721).setAccessible(true);
        Object enum138 = ((Field) term88721).get((Object) null);
        Class<? extends Object> term88984 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonTypeInfo$As");
        Field term88983 = ((Class) term88984).getDeclaredField((String) "PROPERTY");
        ((Field) term88983).setAccessible(true);
        Object enum139 = ((Field) term88983).get((Object) null);
        term87725 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder"));
        Object term87997 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.TypeNameIdResolver"));
        setField(term87725, term87725.getClass(), "_idType", enum138);
        setField(term87725, term87725.getClass(), "_customIdResolver", term87997);
        setField(term87725, term87725.getClass(), "_includeAs", enum139);
        Class<? extends Object> term89255 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonTypeInfo$Id");
        Field term89254 = ((Class) term89255).getDeclaredField((String) "CLASS");
        ((Field) term89254).setAccessible(true);
        Object enum140 = ((Field) term89254).get((Object) null);
        Class<? extends Object> term89517 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonTypeInfo$As");
        Field term89516 = ((Class) term89517).getDeclaredField((String) "PROPERTY");
        ((Field) term89516).setAccessible(true);
        Object enum141 = ((Field) term89516).get((Object) null);
        term88711 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder"));
        Object term88720 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.TypeNameIdResolver"));
        setField(term88711, term88711.getClass(), "_idType", enum140);
        setField(term88711, term88711.getClass(), "_includeAs", enum141);
        setField(term88711, term88711.getClass(), "_typeProperty", null);
        setBooleanField(term88711, term88711.getClass(), "_typeIdVisible", false);
        setField(term88711, term88711.getClass(), "_defaultImpl", null);
        setField(term88720, term88720.getClass(), "_config", null);
        setField(term88720, term88720.getClass(), "_typeToId", null);
        setField(term88720, term88720.getClass(), "_idToType", null);
        setField(term88720, term88720.getClass(), "_typeFactory", null);
        setField(term88720, term88720.getClass(), "_baseType", null);
        setField(term88711, term88711.getClass(), "_customIdResolver", term88720);
        term88710 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeSerializer"));
        Object term88705 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.TypeNameIdResolver"));
        setField(term88710, term88710.getClass(), "_typePropertyName", null);
        setField(term88705, term88705.getClass(), "_config", null);
        setField(term88705, term88705.getClass(), "_typeToId", null);
        setField(term88705, term88705.getClass(), "_idToType", null);
        setField(term88705, term88705.getClass(), "_typeFactory", null);
        setField(term88705, term88705.getClass(), "_baseType", null);
        setField(term88710, term88710.getClass(), "_idResolver", term88705);
        setField(term88710, term88710.getClass(), "_property", null);
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
        Object retValue = callMethod(klass, "buildTypeSerializer", argTypes, term87725, args);
        assertTrue(recursiveEquals(term87725, term88711));
        assertTrue(recursiveEquals(retValue, term88710));
    }

};


