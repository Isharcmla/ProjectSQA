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

public class StdTypeResolverBuilder_buildTypeSerializer_56551290281 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49580;
     Object term51681;
     Object term51680;

    public StdTypeResolverBuilder_buildTypeSerializer_56551290281() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term51692 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonTypeInfo$Id");
        Field term51691 = ((Class) term51692).getDeclaredField((String) "NAME");
        ((Field) term51691).setAccessible(true);
        Object enum75 = ((Field) term51691).get((Object) null);
        Class<? extends Object> term51951 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonTypeInfo$As");
        Field term51950 = ((Class) term51951).getDeclaredField((String) "PROPERTY");
        ((Field) term51950).setAccessible(true);
        Object enum76 = ((Field) term51950).get((Object) null);
        term49580 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder"));
        Object term49854 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver"));
        setField(term49580, term49580.getClass(), "_idType", enum75);
        setField(term49580, term49580.getClass(), "_customIdResolver", term49854);
        setField(term49580, term49580.getClass(), "_includeAs", enum76);
        Class<? extends Object> term52222 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonTypeInfo$Id");
        Field term52221 = ((Class) term52222).getDeclaredField((String) "NAME");
        ((Field) term52221).setAccessible(true);
        Object enum77 = ((Field) term52221).get((Object) null);
        Class<? extends Object> term52481 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonTypeInfo$As");
        Field term52480 = ((Class) term52481).getDeclaredField((String) "PROPERTY");
        ((Field) term52480).setAccessible(true);
        Object enum78 = ((Field) term52480).get((Object) null);
        term51681 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder"));
        Object term51690 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver"));
        setField(term51681, term51681.getClass(), "_idType", enum77);
        setField(term51681, term51681.getClass(), "_includeAs", enum78);
        setField(term51681, term51681.getClass(), "_typeProperty", null);
        setBooleanField(term51681, term51681.getClass(), "_typeIdVisible", false);
        setField(term51681, term51681.getClass(), "_defaultImpl", null);
        setField(term51690, term51690.getClass(), "_typeFactory", null);
        setField(term51690, term51690.getClass(), "_baseType", null);
        setField(term51681, term51681.getClass(), "_customIdResolver", term51690);
        term51680 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeSerializer"));
        Object term51675 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver"));
        setField(term51680, term51680.getClass(), "_typePropertyName", null);
        setField(term51675, term51675.getClass(), "_typeFactory", null);
        setField(term51675, term51675.getClass(), "_baseType", null);
        setField(term51680, term51680.getClass(), "_idResolver", term51675);
        setField(term51680, term51680.getClass(), "_property", null);
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
        Object retValue = callMethod(klass, "buildTypeSerializer", argTypes, term49580, args);
        assertTrue(recursiveEquals(term49580, term51681));
        assertTrue(recursiveEquals(retValue, term51680));
    }

};


