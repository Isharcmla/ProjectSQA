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

public class StdTypeResolverBuilder_buildTypeSerializer_56551290277 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44856;
     Object term45837;
     Object term45836;

    public StdTypeResolverBuilder_buildTypeSerializer_56551290277() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term45848 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonTypeInfo$Id");
        Field term45847 = ((Class) term45848).getDeclaredField((String) "NAME");
        ((Field) term45847).setAccessible(true);
        Object enum63 = ((Field) term45847).get((Object) null);
        Class<? extends Object> term46107 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonTypeInfo$As");
        Field term46106 = ((Class) term46107).getDeclaredField((String) "PROPERTY");
        ((Field) term46106).setAccessible(true);
        Object enum64 = ((Field) term46106).get((Object) null);
        term44856 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder"));
        Object term45128 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.TypeNameIdResolver"));
        setField(term44856, term44856.getClass(), "_idType", enum63);
        setField(term44856, term44856.getClass(), "_customIdResolver", term45128);
        setField(term44856, term44856.getClass(), "_includeAs", enum64);
        Class<? extends Object> term46378 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonTypeInfo$Id");
        Field term46377 = ((Class) term46378).getDeclaredField((String) "NAME");
        ((Field) term46377).setAccessible(true);
        Object enum65 = ((Field) term46377).get((Object) null);
        Class<? extends Object> term46637 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonTypeInfo$As");
        Field term46636 = ((Class) term46637).getDeclaredField((String) "PROPERTY");
        ((Field) term46636).setAccessible(true);
        Object enum66 = ((Field) term46636).get((Object) null);
        term45837 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder"));
        Object term45846 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.TypeNameIdResolver"));
        setField(term45837, term45837.getClass(), "_idType", enum65);
        setField(term45837, term45837.getClass(), "_includeAs", enum66);
        setField(term45837, term45837.getClass(), "_typeProperty", null);
        setBooleanField(term45837, term45837.getClass(), "_typeIdVisible", false);
        setField(term45837, term45837.getClass(), "_defaultImpl", null);
        setField(term45846, term45846.getClass(), "_config", null);
        setField(term45846, term45846.getClass(), "_typeToId", null);
        setField(term45846, term45846.getClass(), "_idToType", null);
        setField(term45846, term45846.getClass(), "_typeFactory", null);
        setField(term45846, term45846.getClass(), "_baseType", null);
        setField(term45837, term45837.getClass(), "_customIdResolver", term45846);
        term45836 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeSerializer"));
        Object term45831 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.TypeNameIdResolver"));
        setField(term45836, term45836.getClass(), "_typePropertyName", null);
        setField(term45831, term45831.getClass(), "_config", null);
        setField(term45831, term45831.getClass(), "_typeToId", null);
        setField(term45831, term45831.getClass(), "_idToType", null);
        setField(term45831, term45831.getClass(), "_typeFactory", null);
        setField(term45831, term45831.getClass(), "_baseType", null);
        setField(term45836, term45836.getClass(), "_idResolver", term45831);
        setField(term45836, term45836.getClass(), "_property", null);
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
        Object retValue = callMethod(klass, "buildTypeSerializer", argTypes, term44856, args);
        assertTrue(recursiveEquals(term44856, term45837));
        assertTrue(recursiveEquals(retValue, term45836));
    }

};


