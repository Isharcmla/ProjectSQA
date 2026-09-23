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

public class StdTypeResolverBuilder_buildTypeDeserializer_170362802387 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58641;
     Object term59667;
     Object term59658;

    public StdTypeResolverBuilder_buildTypeDeserializer_170362802387() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term59678 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonTypeInfo$Id");
        Field term59677 = ((Class) term59678).getDeclaredField((String) "NAME");
        ((Field) term59677).setAccessible(true);
        Object enum89 = ((Field) term59677).get((Object) null);
        Class<? extends Object> term59937 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonTypeInfo$As");
        Field term59936 = ((Class) term59937).getDeclaredField((String) "WRAPPER_OBJECT");
        ((Field) term59936).setAccessible(true);
        Object enum90 = ((Field) term59936).get((Object) null);
        term58641 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder"));
        Object term58915 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver"));
        setField(term58641, term58641.getClass(), "_idType", enum89);
        setField(term58641, term58641.getClass(), "_customIdResolver", term58915);
        setField(term58641, term58641.getClass(), "_defaultImpl", null);
        setField(term58641, term58641.getClass(), "_includeAs", enum90);
        Class<? extends Object> term60226 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonTypeInfo$Id");
        Field term60225 = ((Class) term60226).getDeclaredField((String) "NAME");
        ((Field) term60225).setAccessible(true);
        Object enum91 = ((Field) term60225).get((Object) null);
        Class<? extends Object> term60485 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonTypeInfo$As");
        Field term60484 = ((Class) term60485).getDeclaredField((String) "WRAPPER_OBJECT");
        ((Field) term60484).setAccessible(true);
        Object enum92 = ((Field) term60484).get((Object) null);
        term59667 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder"));
        Object term59676 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver"));
        setField(term59667, term59667.getClass(), "_idType", enum91);
        setField(term59667, term59667.getClass(), "_includeAs", enum92);
        setField(term59667, term59667.getClass(), "_typeProperty", null);
        setBooleanField(term59667, term59667.getClass(), "_typeIdVisible", false);
        setField(term59667, term59667.getClass(), "_defaultImpl", null);
        setField(term59676, term59676.getClass(), "_typeFactory", null);
        setField(term59676, term59676.getClass(), "_baseType", null);
        setField(term59667, term59667.getClass(), "_customIdResolver", term59676);
        term59658 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        Object term59642 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver"));
        Object term59662 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term59642, term59642.getClass(), "_typeFactory", null);
        setField(term59642, term59642.getClass(), "_baseType", null);
        setField(term59658, term59658.getClass(), "_idResolver", term59642);
        setField(term59658, term59658.getClass(), "_baseType", null);
        setField(term59658, term59658.getClass(), "_property", null);
        setField(term59658, term59658.getClass(), "_defaultImpl", null);
        setField(term59658, term59658.getClass(), "_typePropertyName", "");
        setBooleanField(term59658, term59658.getClass(), "_typeIdVisible", false);
        setField(term59662, term59662.getClass(), "table", null);
        setField(term59662, term59662.getClass(), "nextTable", null);
        setLongField(term59662, term59662.getClass(), "baseCount", 0L);
        setIntField(term59662, term59662.getClass(), "sizeCtl", 32);
        setIntField(term59662, term59662.getClass(), "transferIndex", 0);
        setIntField(term59662, term59662.getClass(), "cellsBusy", 0);
        setField(term59662, term59662.getClass(), "counterCells", null);
        setField(term59662, term59662.getClass(), "keySet", null);
        setField(term59662, term59662.getClass(), "values", null);
        setField(term59662, term59662.getClass(), "entrySet", null);
        setField(term59662, term59662.getClass(), "keySet", null);
        setField(term59662, term59662.getClass(), "values", null);
        setField(term59658, term59658.getClass(), "_deserializers", term59662);
        setField(term59658, term59658.getClass(), "_defaultImplDeserializer", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.DeserializationConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[2] = Class.forName("java.util.Collection");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        Object retValue = callMethod(klass, "buildTypeDeserializer", argTypes, term58641, args);
        assertTrue(recursiveEquals(term58641, term59667));
        assertTrue(recursiveEquals(retValue, term59658));
    }

};


