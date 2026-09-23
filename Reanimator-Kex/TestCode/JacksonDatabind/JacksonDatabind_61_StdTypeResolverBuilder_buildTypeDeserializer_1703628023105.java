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

public class StdTypeResolverBuilder_buildTypeDeserializer_1703628023105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79271;
     Object term80286;
     Object term80277;

    public StdTypeResolverBuilder_buildTypeDeserializer_1703628023105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term80295 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonTypeInfo$Id");
        Field term80294 = ((Class) term80295).getDeclaredField((String) "CUSTOM");
        ((Field) term80294).setAccessible(true);
        Object enum123 = ((Field) term80294).get((Object) null);
        Class<? extends Object> term80560 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonTypeInfo$As");
        Field term80559 = ((Class) term80560).getDeclaredField((String) "PROPERTY");
        ((Field) term80559).setAccessible(true);
        Object enum124 = ((Field) term80559).get((Object) null);
        term79271 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder"));
        Object term79545 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver"));
        setField(term79271, term79271.getClass(), "_idType", enum123);
        setField(term79271, term79271.getClass(), "_customIdResolver", term79545);
        setField(term79271, term79271.getClass(), "_defaultImpl", null);
        setField(term79271, term79271.getClass(), "_includeAs", enum124);
        Class<? extends Object> term80831 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonTypeInfo$Id");
        Field term80830 = ((Class) term80831).getDeclaredField((String) "CUSTOM");
        ((Field) term80830).setAccessible(true);
        Object enum125 = ((Field) term80830).get((Object) null);
        Class<? extends Object> term81096 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonTypeInfo$As");
        Field term81095 = ((Class) term81096).getDeclaredField((String) "PROPERTY");
        ((Field) term81095).setAccessible(true);
        Object enum126 = ((Field) term81095).get((Object) null);
        term80286 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder"));
        Object term80293 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver"));
        setField(term80286, term80286.getClass(), "_idType", enum125);
        setField(term80286, term80286.getClass(), "_includeAs", enum126);
        setField(term80286, term80286.getClass(), "_typeProperty", null);
        setBooleanField(term80286, term80286.getClass(), "_typeIdVisible", false);
        setField(term80286, term80286.getClass(), "_defaultImpl", null);
        setField(term80293, term80293.getClass(), "_typeFactory", null);
        setField(term80293, term80293.getClass(), "_baseType", null);
        setField(term80286, term80286.getClass(), "_customIdResolver", term80293);
        Class<? extends Object> term81367 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonTypeInfo$As");
        Field term81366 = ((Class) term81367).getDeclaredField((String) "PROPERTY");
        ((Field) term81366).setAccessible(true);
        Object enum127 = ((Field) term81366).get((Object) null);
        term80277 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        Object term80249 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver"));
        Object term80281 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term80277, term80277.getClass(), "_inclusion", enum127);
        setField(term80249, term80249.getClass(), "_typeFactory", null);
        setField(term80249, term80249.getClass(), "_baseType", null);
        setField(term80277, term80277.getClass(), "_idResolver", term80249);
        setField(term80277, term80277.getClass(), "_baseType", null);
        setField(term80277, term80277.getClass(), "_property", null);
        setField(term80277, term80277.getClass(), "_defaultImpl", null);
        setField(term80277, term80277.getClass(), "_typePropertyName", "");
        setBooleanField(term80277, term80277.getClass(), "_typeIdVisible", false);
        setField(term80281, term80281.getClass(), "table", null);
        setField(term80281, term80281.getClass(), "nextTable", null);
        setLongField(term80281, term80281.getClass(), "baseCount", 0L);
        setIntField(term80281, term80281.getClass(), "sizeCtl", 32);
        setIntField(term80281, term80281.getClass(), "transferIndex", 0);
        setIntField(term80281, term80281.getClass(), "cellsBusy", 0);
        setField(term80281, term80281.getClass(), "counterCells", null);
        setField(term80281, term80281.getClass(), "keySet", null);
        setField(term80281, term80281.getClass(), "values", null);
        setField(term80281, term80281.getClass(), "entrySet", null);
        setField(term80281, term80281.getClass(), "keySet", null);
        setField(term80281, term80281.getClass(), "values", null);
        setField(term80277, term80277.getClass(), "_deserializers", term80281);
        setField(term80277, term80277.getClass(), "_defaultImplDeserializer", null);
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
        Object retValue = callMethod(klass, "buildTypeDeserializer", argTypes, term79271, args);
        assertTrue(recursiveEquals(term79271, term80286));
        assertTrue(recursiveEquals(retValue, term80277));
    }

};


