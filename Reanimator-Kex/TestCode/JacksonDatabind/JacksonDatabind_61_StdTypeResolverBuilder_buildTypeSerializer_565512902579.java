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

public class StdTypeResolverBuilder_buildTypeSerializer_565512902579 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term702781;
     Object term703183;
     Object term704233;
     Object term704242;

    public StdTypeResolverBuilder_buildTypeSerializer_565512902579() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term704252 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term704251 = ((Class) term704252).getDeclaredField((String) "JAVA_LANG_OBJECT");
        ((Field) term704251).setAccessible(true);
        Object enum744 = ((Field) term704251).get((Object) null);
        Class<? extends Object> term704592 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonTypeInfo$Id");
        Field term704591 = ((Class) term704592).getDeclaredField((String) "MINIMAL_CLASS");
        ((Field) term704591).setAccessible(true);
        Object enum745 = ((Field) term704591).get((Object) null);
        term702781 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term702781, term702781.getClass(), "_appliesFor", enum744);
        setField(term702781, term702781.getClass(), "_idType", enum745);
        setField(term702781, term702781.getClass(), "_customIdResolver", null);
        Class<? extends Object> term703311 = Class.forName((String) "java.util.stream.ReduceOps$CountingSink$OfDouble");
        term703183 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term703275 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term703275, term703275.getClass(), "_class", term703311);
        setField(term703183, term703183.getClass(), "_referencedType", term703275);
        Class<? extends Object> term705024 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term705023 = ((Class) term705024).getDeclaredField((String) "JAVA_LANG_OBJECT");
        ((Field) term705023).setAccessible(true);
        Object enum746 = ((Field) term705023).get((Object) null);
        Class<? extends Object> term705364 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonTypeInfo$Id");
        Field term705363 = ((Class) term705364).getDeclaredField((String) "MINIMAL_CLASS");
        ((Field) term705363).setAccessible(true);
        Object enum747 = ((Field) term705363).get((Object) null);
        term704233 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term704233, term704233.getClass(), "_appliesFor", enum746);
        setField(term704233, term704233.getClass(), "_idType", enum747);
        setField(term704233, term704233.getClass(), "_includeAs", null);
        setField(term704233, term704233.getClass(), "_typeProperty", null);
        setBooleanField(term704233, term704233.getClass(), "_typeIdVisible", false);
        setField(term704233, term704233.getClass(), "_defaultImpl", null);
        setField(term704233, term704233.getClass(), "_customIdResolver", null);
        Class<? extends Object> term704244 = Class.forName((String) "kex.java.util.concurrent.atomic.AtomicIntegerArray");
        term704242 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term704243 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term704243, term704243.getClass(), "_keyType", null);
        setField(term704243, term704243.getClass(), "_valueType", null);
        setField(term704243, term704243.getClass(), "_superClass", null);
        setField(term704243, term704243.getClass(), "_superInterfaces", null);
        setField(term704243, term704243.getClass(), "_bindings", null);
        setField(term704243, term704243.getClass(), "_canonicalName", null);
        setField(term704243, term704243.getClass(), "_class", term704244);
        setIntField(term704243, term704243.getClass(), "_hash", 0);
        setField(term704243, term704243.getClass(), "_valueHandler", null);
        setField(term704243, term704243.getClass(), "_typeHandler", null);
        setBooleanField(term704243, term704243.getClass(), "_asStatic", false);
        setField(term704242, term704242.getClass(), "_referencedType", term704243);
        setField(term704242, term704242.getClass(), "_anchorType", null);
        setField(term704242, term704242.getClass(), "_superClass", null);
        setField(term704242, term704242.getClass(), "_superInterfaces", null);
        setField(term704242, term704242.getClass(), "_bindings", null);
        setField(term704242, term704242.getClass(), "_canonicalName", null);
        setField(term704242, term704242.getClass(), "_class", null);
        setIntField(term704242, term704242.getClass(), "_hash", 0);
        setField(term704242, term704242.getClass(), "_valueHandler", null);
        setField(term704242, term704242.getClass(), "_typeHandler", null);
        setBooleanField(term704242, term704242.getClass(), "_asStatic", false);
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
        args[1] = term703183;
        args[2] = null;
        callMethod(klass, "buildTypeSerializer", argTypes, term702781, args);
        assertTrue(recursiveEquals(term702781, term704233));
        assertTrue(recursiveEquals(term703183, null));
    }

};


