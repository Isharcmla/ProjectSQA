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

public class StdTypeResolverBuilder_buildTypeSerializer_56551290255 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22769;
     Object term24889;
     Object term24888;

    public StdTypeResolverBuilder_buildTypeSerializer_56551290255() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term24900 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonTypeInfo$Id");
        Field term24899 = ((Class) term24900).getDeclaredField((String) "MINIMAL_CLASS");
        ((Field) term24899).setAccessible(true);
        Object enum33 = ((Field) term24899).get((Object) null);
        Class<? extends Object> term25186 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonTypeInfo$As");
        Field term25185 = ((Class) term25186).getDeclaredField((String) "EXISTING_PROPERTY");
        ((Field) term25185).setAccessible(true);
        Object enum34 = ((Field) term25185).get((Object) null);
        term22769 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder"));
        Object term23057 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver"));
        setField(term22769, term22769.getClass(), "_idType", enum33);
        setField(term22769, term22769.getClass(), "_customIdResolver", term23057);
        setField(term22769, term22769.getClass(), "_includeAs", enum34);
        Class<? extends Object> term25484 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonTypeInfo$Id");
        Field term25483 = ((Class) term25484).getDeclaredField((String) "MINIMAL_CLASS");
        ((Field) term25483).setAccessible(true);
        Object enum35 = ((Field) term25483).get((Object) null);
        Class<? extends Object> term25770 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonTypeInfo$As");
        Field term25769 = ((Class) term25770).getDeclaredField((String) "EXISTING_PROPERTY");
        ((Field) term25769).setAccessible(true);
        Object enum36 = ((Field) term25769).get((Object) null);
        term24889 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder"));
        Object term24898 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver"));
        setField(term24889, term24889.getClass(), "_idType", enum35);
        setField(term24889, term24889.getClass(), "_includeAs", enum36);
        setField(term24889, term24889.getClass(), "_typeProperty", null);
        setBooleanField(term24889, term24889.getClass(), "_typeIdVisible", false);
        setField(term24889, term24889.getClass(), "_defaultImpl", null);
        setField(term24898, term24898.getClass(), "_basePackageName", null);
        setField(term24898, term24898.getClass(), "_basePackagePrefix", null);
        setField(term24898, term24898.getClass(), "_typeFactory", null);
        setField(term24898, term24898.getClass(), "_baseType", null);
        setField(term24889, term24889.getClass(), "_customIdResolver", term24898);
        term24888 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsExistingPropertyTypeSerializer"));
        Object term24883 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver"));
        setField(term24888, term24888.getClass(), "_typePropertyName", null);
        setField(term24883, term24883.getClass(), "_basePackageName", null);
        setField(term24883, term24883.getClass(), "_basePackagePrefix", null);
        setField(term24883, term24883.getClass(), "_typeFactory", null);
        setField(term24883, term24883.getClass(), "_baseType", null);
        setField(term24888, term24888.getClass(), "_idResolver", term24883);
        setField(term24888, term24888.getClass(), "_property", null);
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
        Object retValue = callMethod(klass, "buildTypeSerializer", argTypes, term22769, args);
        assertTrue(recursiveEquals(term22769, term24889));
        assertTrue(recursiveEquals(retValue, term24888));
    }

};


