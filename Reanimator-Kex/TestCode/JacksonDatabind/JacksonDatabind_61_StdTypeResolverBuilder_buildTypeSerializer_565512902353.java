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

public class StdTypeResolverBuilder_buildTypeSerializer_565512902353 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term377132;
     Object term378168;
     Object term378167;

    public StdTypeResolverBuilder_buildTypeSerializer_565512902353() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term378179 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonTypeInfo$Id");
        Field term378178 = ((Class) term378179).getDeclaredField((String) "MINIMAL_CLASS");
        ((Field) term378178).setAccessible(true);
        Object enum434 = ((Field) term378178).get((Object) null);
        Class<? extends Object> term378465 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonTypeInfo$As");
        Field term378464 = ((Class) term378465).getDeclaredField((String) "WRAPPER_ARRAY");
        ((Field) term378464).setAccessible(true);
        Object enum435 = ((Field) term378464).get((Object) null);
        term377132 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder"));
        Object term377406 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver"));
        setField(term377132, term377132.getClass(), "_idType", enum434);
        setField(term377132, term377132.getClass(), "_customIdResolver", term377406);
        setField(term377132, term377132.getClass(), "_includeAs", enum435);
        Class<? extends Object> term378751 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonTypeInfo$Id");
        Field term378750 = ((Class) term378751).getDeclaredField((String) "MINIMAL_CLASS");
        ((Field) term378750).setAccessible(true);
        Object enum436 = ((Field) term378750).get((Object) null);
        Class<? extends Object> term379037 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonTypeInfo$As");
        Field term379036 = ((Class) term379037).getDeclaredField((String) "WRAPPER_ARRAY");
        ((Field) term379036).setAccessible(true);
        Object enum437 = ((Field) term379036).get((Object) null);
        term378168 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder"));
        Object term378177 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver"));
        setField(term378168, term378168.getClass(), "_idType", enum436);
        setField(term378168, term378168.getClass(), "_includeAs", enum437);
        setField(term378168, term378168.getClass(), "_typeProperty", null);
        setBooleanField(term378168, term378168.getClass(), "_typeIdVisible", false);
        setField(term378168, term378168.getClass(), "_defaultImpl", null);
        setField(term378177, term378177.getClass(), "_typeFactory", null);
        setField(term378177, term378177.getClass(), "_baseType", null);
        setField(term378168, term378168.getClass(), "_customIdResolver", term378177);
        term378167 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeSerializer"));
        Object term378162 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver"));
        setField(term378162, term378162.getClass(), "_typeFactory", null);
        setField(term378162, term378162.getClass(), "_baseType", null);
        setField(term378167, term378167.getClass(), "_idResolver", term378162);
        setField(term378167, term378167.getClass(), "_property", null);
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
        Object retValue = callMethod(klass, "buildTypeSerializer", argTypes, term377132, args);
        assertTrue(recursiveEquals(term377132, term378168));
        assertTrue(recursiveEquals(retValue, term378167));
    }

};


