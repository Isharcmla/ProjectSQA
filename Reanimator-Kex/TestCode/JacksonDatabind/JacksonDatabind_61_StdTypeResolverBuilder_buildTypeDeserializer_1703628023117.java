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

public class StdTypeResolverBuilder_buildTypeDeserializer_1703628023117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term91092;
     Object term91658;
     Object term92363;
     Object term92373;
     Object term92340;

    public StdTypeResolverBuilder_buildTypeDeserializer_1703628023117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term92375 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonTypeInfo$Id");
        Field term92374 = ((Class) term92375).getDeclaredField((String) "CUSTOM");
        ((Field) term92374).setAccessible(true);
        Object enum144 = ((Field) term92374).get((Object) null);
        Class<? extends Object> term92640 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonTypeInfo$As");
        Field term92639 = ((Class) term92640).getDeclaredField((String) "EXTERNAL_PROPERTY");
        ((Field) term92639).setAccessible(true);
        Object enum145 = ((Field) term92639).get((Object) null);
        term91092 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder"));
        Object term91380 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver"));
        setField(term91092, term91092.getClass(), "_idType", enum144);
        setField(term91092, term91092.getClass(), "_customIdResolver", term91380);
        setField(term91092, term91092.getClass(), "_defaultImpl", null);
        setField(term91092, term91092.getClass(), "_includeAs", enum145);
        setField(term91092, term91092.getClass(), "_typeProperty", "WRAPPER_OBJECT");
        setBooleanField(term91092, term91092.getClass(), "_typeIdVisible", false);
        term91658 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        Class<? extends Object> term92952 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonTypeInfo$Id");
        Field term92951 = ((Class) term92952).getDeclaredField((String) "CUSTOM");
        ((Field) term92951).setAccessible(true);
        Object enum146 = ((Field) term92951).get((Object) null);
        Class<? extends Object> term93217 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonTypeInfo$As");
        Field term93216 = ((Class) term93217).getDeclaredField((String) "EXTERNAL_PROPERTY");
        ((Field) term93216).setAccessible(true);
        Object enum147 = ((Field) term93216).get((Object) null);
        term92363 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder"));
        Object term92372 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver"));
        setField(term92363, term92363.getClass(), "_idType", enum146);
        setField(term92363, term92363.getClass(), "_includeAs", enum147);
        setField(term92363, term92363.getClass(), "_typeProperty", "WRAPPER_OBJECT");
        setBooleanField(term92363, term92363.getClass(), "_typeIdVisible", false);
        setField(term92363, term92363.getClass(), "_defaultImpl", null);
        setField(term92372, term92372.getClass(), "_basePackageName", null);
        setField(term92372, term92372.getClass(), "_basePackagePrefix", null);
        setField(term92372, term92372.getClass(), "_typeFactory", null);
        setField(term92372, term92372.getClass(), "_baseType", null);
        setField(term92363, term92363.getClass(), "_customIdResolver", term92372);
        term92373 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(term92373, term92373.getClass(), "_keyType", null);
        setField(term92373, term92373.getClass(), "_valueType", null);
        setField(term92373, term92373.getClass(), "_superClass", null);
        setField(term92373, term92373.getClass(), "_superInterfaces", null);
        setField(term92373, term92373.getClass(), "_bindings", null);
        setField(term92373, term92373.getClass(), "_canonicalName", null);
        setField(term92373, term92373.getClass(), "_class", null);
        setIntField(term92373, term92373.getClass(), "_hash", 0);
        setField(term92373, term92373.getClass(), "_valueHandler", null);
        setField(term92373, term92373.getClass(), "_typeHandler", null);
        setBooleanField(term92373, term92373.getClass(), "_asStatic", false);
        term92340 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer"));
        Object term92288 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver"));
        Object term92289 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        Object term92358 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term92288, term92288.getClass(), "_basePackageName", null);
        setField(term92288, term92288.getClass(), "_basePackagePrefix", null);
        setField(term92288, term92288.getClass(), "_typeFactory", null);
        setField(term92288, term92288.getClass(), "_baseType", null);
        setField(term92340, term92340.getClass(), "_idResolver", term92288);
        setField(term92289, term92289.getClass(), "_keyType", null);
        setField(term92289, term92289.getClass(), "_valueType", null);
        setField(term92289, term92289.getClass(), "_superClass", null);
        setField(term92289, term92289.getClass(), "_superInterfaces", null);
        setField(term92289, term92289.getClass(), "_bindings", null);
        setField(term92289, term92289.getClass(), "_canonicalName", null);
        setField(term92289, term92289.getClass(), "_class", null);
        setIntField(term92289, term92289.getClass(), "_hash", 0);
        setField(term92289, term92289.getClass(), "_valueHandler", null);
        setField(term92289, term92289.getClass(), "_typeHandler", null);
        setBooleanField(term92289, term92289.getClass(), "_asStatic", false);
        setField(term92340, term92340.getClass(), "_baseType", term92289);
        setField(term92340, term92340.getClass(), "_property", null);
        setField(term92340, term92340.getClass(), "_defaultImpl", null);
        setField(term92340, term92340.getClass(), "_typePropertyName", "WRAPPER_OBJECT");
        setBooleanField(term92340, term92340.getClass(), "_typeIdVisible", false);
        setField(term92358, term92358.getClass(), "table", null);
        setField(term92358, term92358.getClass(), "nextTable", null);
        setLongField(term92358, term92358.getClass(), "baseCount", 0L);
        setIntField(term92358, term92358.getClass(), "sizeCtl", 32);
        setIntField(term92358, term92358.getClass(), "transferIndex", 0);
        setIntField(term92358, term92358.getClass(), "cellsBusy", 0);
        setField(term92358, term92358.getClass(), "counterCells", null);
        setField(term92358, term92358.getClass(), "keySet", null);
        setField(term92358, term92358.getClass(), "values", null);
        setField(term92358, term92358.getClass(), "entrySet", null);
        setField(term92358, term92358.getClass(), "keySet", null);
        setField(term92358, term92358.getClass(), "values", null);
        setField(term92340, term92340.getClass(), "_deserializers", term92358);
        setField(term92340, term92340.getClass(), "_defaultImplDeserializer", null);
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
        args[1] = term91658;
        args[2] = null;
        Object retValue = callMethod(klass, "buildTypeDeserializer", argTypes, term91092, args);
        assertTrue(recursiveEquals(term91092, term92363));
        assertTrue(recursiveEquals(term91658, term92373));
        assertTrue(recursiveEquals(retValue, term92340));
    }

};


