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

public class StdTypeResolverBuilder_buildTypeDeserializer_1703628023132 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term105311;
     Object term105877;
     Object term107531;
     Object term107543;
     Object term107508;

    public StdTypeResolverBuilder_buildTypeDeserializer_1703628023132() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term107545 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonTypeInfo$Id");
        Field term107544 = ((Class) term107545).getDeclaredField((String) "CLASS");
        ((Field) term107544).setAccessible(true);
        Object enum164 = ((Field) term107544).get((Object) null);
        Class<? extends Object> term107807 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonTypeInfo$As");
        Field term107806 = ((Class) term107807).getDeclaredField((String) "EXTERNAL_PROPERTY");
        ((Field) term107806).setAccessible(true);
        Object enum165 = ((Field) term107806).get((Object) null);
        term105311 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder"));
        Object term105585 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver"));
        setField(term105311, term105311.getClass(), "_idType", enum164);
        setField(term105311, term105311.getClass(), "_customIdResolver", term105585);
        setField(term105311, term105311.getClass(), "_defaultImpl", null);
        setField(term105311, term105311.getClass(), "_includeAs", enum165);
        setField(term105311, term105311.getClass(), "_typeProperty", "WRAPPER_OBJECT");
        setBooleanField(term105311, term105311.getClass(), "_typeIdVisible", false);
        term105877 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        Class<? extends Object> term108119 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonTypeInfo$Id");
        Field term108118 = ((Class) term108119).getDeclaredField((String) "CLASS");
        ((Field) term108118).setAccessible(true);
        Object enum166 = ((Field) term108118).get((Object) null);
        Class<? extends Object> term108381 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonTypeInfo$As");
        Field term108380 = ((Class) term108381).getDeclaredField((String) "EXTERNAL_PROPERTY");
        ((Field) term108380).setAccessible(true);
        Object enum167 = ((Field) term108380).get((Object) null);
        term107531 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder"));
        Object term107542 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver"));
        setField(term107531, term107531.getClass(), "_idType", enum166);
        setField(term107531, term107531.getClass(), "_includeAs", enum167);
        setField(term107531, term107531.getClass(), "_typeProperty", "WRAPPER_OBJECT");
        setBooleanField(term107531, term107531.getClass(), "_typeIdVisible", false);
        setField(term107531, term107531.getClass(), "_defaultImpl", null);
        setField(term107542, term107542.getClass(), "_typeFactory", null);
        setField(term107542, term107542.getClass(), "_baseType", null);
        setField(term107531, term107531.getClass(), "_customIdResolver", term107542);
        term107543 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        setField(term107543, term107543.getClass(), "_elementType", null);
        setField(term107543, term107543.getClass(), "_superClass", null);
        setField(term107543, term107543.getClass(), "_superInterfaces", null);
        setField(term107543, term107543.getClass(), "_bindings", null);
        setField(term107543, term107543.getClass(), "_canonicalName", null);
        setField(term107543, term107543.getClass(), "_class", null);
        setIntField(term107543, term107543.getClass(), "_hash", 0);
        setField(term107543, term107543.getClass(), "_valueHandler", null);
        setField(term107543, term107543.getClass(), "_typeHandler", null);
        setBooleanField(term107543, term107543.getClass(), "_asStatic", false);
        term107508 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer"));
        Object term107456 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver"));
        Object term107457 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        Object term107526 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term107456, term107456.getClass(), "_typeFactory", null);
        setField(term107456, term107456.getClass(), "_baseType", null);
        setField(term107508, term107508.getClass(), "_idResolver", term107456);
        setField(term107457, term107457.getClass(), "_elementType", null);
        setField(term107457, term107457.getClass(), "_superClass", null);
        setField(term107457, term107457.getClass(), "_superInterfaces", null);
        setField(term107457, term107457.getClass(), "_bindings", null);
        setField(term107457, term107457.getClass(), "_canonicalName", null);
        setField(term107457, term107457.getClass(), "_class", null);
        setIntField(term107457, term107457.getClass(), "_hash", 0);
        setField(term107457, term107457.getClass(), "_valueHandler", null);
        setField(term107457, term107457.getClass(), "_typeHandler", null);
        setBooleanField(term107457, term107457.getClass(), "_asStatic", false);
        setField(term107508, term107508.getClass(), "_baseType", term107457);
        setField(term107508, term107508.getClass(), "_property", null);
        setField(term107508, term107508.getClass(), "_defaultImpl", null);
        setField(term107508, term107508.getClass(), "_typePropertyName", "WRAPPER_OBJECT");
        setBooleanField(term107508, term107508.getClass(), "_typeIdVisible", false);
        setField(term107526, term107526.getClass(), "table", null);
        setField(term107526, term107526.getClass(), "nextTable", null);
        setLongField(term107526, term107526.getClass(), "baseCount", 0L);
        setIntField(term107526, term107526.getClass(), "sizeCtl", 32);
        setIntField(term107526, term107526.getClass(), "transferIndex", 0);
        setIntField(term107526, term107526.getClass(), "cellsBusy", 0);
        setField(term107526, term107526.getClass(), "counterCells", null);
        setField(term107526, term107526.getClass(), "keySet", null);
        setField(term107526, term107526.getClass(), "values", null);
        setField(term107526, term107526.getClass(), "entrySet", null);
        setField(term107526, term107526.getClass(), "keySet", null);
        setField(term107526, term107526.getClass(), "values", null);
        setField(term107508, term107508.getClass(), "_deserializers", term107526);
        setField(term107508, term107508.getClass(), "_defaultImplDeserializer", null);
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
        args[1] = term105877;
        args[2] = null;
        Object retValue = callMethod(klass, "buildTypeDeserializer", argTypes, term105311, args);
        assertTrue(recursiveEquals(term105311, term107531));
        assertTrue(recursiveEquals(term105877, term107543));
        assertTrue(recursiveEquals(retValue, term107508));
    }

};


