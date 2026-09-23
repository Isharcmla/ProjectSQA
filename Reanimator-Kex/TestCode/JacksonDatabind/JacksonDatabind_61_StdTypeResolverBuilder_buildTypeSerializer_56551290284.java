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

public class StdTypeResolverBuilder_buildTypeSerializer_56551290284 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53614;
     Object term55616;
     Object term55615;

    public StdTypeResolverBuilder_buildTypeSerializer_56551290284() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term55627 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonTypeInfo$Id");
        Field term55626 = ((Class) term55627).getDeclaredField((String) "NAME");
        ((Field) term55626).setAccessible(true);
        Object enum82 = ((Field) term55626).get((Object) null);
        Class<? extends Object> term55886 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonTypeInfo$As");
        Field term55885 = ((Class) term55886).getDeclaredField((String) "PROPERTY");
        ((Field) term55885).setAccessible(true);
        Object enum83 = ((Field) term55885).get((Object) null);
        term53614 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder"));
        Object term53902 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver"));
        setField(term53614, term53614.getClass(), "_idType", enum82);
        setField(term53614, term53614.getClass(), "_customIdResolver", term53902);
        setField(term53614, term53614.getClass(), "_includeAs", enum83);
        Class<? extends Object> term56157 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonTypeInfo$Id");
        Field term56156 = ((Class) term56157).getDeclaredField((String) "NAME");
        ((Field) term56156).setAccessible(true);
        Object enum84 = ((Field) term56156).get((Object) null);
        Class<? extends Object> term56416 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonTypeInfo$As");
        Field term56415 = ((Class) term56416).getDeclaredField((String) "PROPERTY");
        ((Field) term56415).setAccessible(true);
        Object enum85 = ((Field) term56415).get((Object) null);
        term55616 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder"));
        Object term55625 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver"));
        setField(term55616, term55616.getClass(), "_idType", enum84);
        setField(term55616, term55616.getClass(), "_includeAs", enum85);
        setField(term55616, term55616.getClass(), "_typeProperty", null);
        setBooleanField(term55616, term55616.getClass(), "_typeIdVisible", false);
        setField(term55616, term55616.getClass(), "_defaultImpl", null);
        setField(term55625, term55625.getClass(), "_basePackageName", null);
        setField(term55625, term55625.getClass(), "_basePackagePrefix", null);
        setField(term55625, term55625.getClass(), "_typeFactory", null);
        setField(term55625, term55625.getClass(), "_baseType", null);
        setField(term55616, term55616.getClass(), "_customIdResolver", term55625);
        term55615 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeSerializer"));
        Object term55610 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver"));
        setField(term55615, term55615.getClass(), "_typePropertyName", null);
        setField(term55610, term55610.getClass(), "_basePackageName", null);
        setField(term55610, term55610.getClass(), "_basePackagePrefix", null);
        setField(term55610, term55610.getClass(), "_typeFactory", null);
        setField(term55610, term55610.getClass(), "_baseType", null);
        setField(term55615, term55615.getClass(), "_idResolver", term55610);
        setField(term55615, term55615.getClass(), "_property", null);
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
        Object retValue = callMethod(klass, "buildTypeSerializer", argTypes, term53614, args);
        assertTrue(recursiveEquals(term53614, term55616));
        assertTrue(recursiveEquals(retValue, term55615));
    }

};


