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

public class StdTypeResolverBuilder_buildTypeSerializer_565512902551 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term661938;
     Object term662200;
     Object term662946;
     Object term662950;

    public StdTypeResolverBuilder_buildTypeSerializer_565512902551() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term662960 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term662959 = ((Class) term662960).getDeclaredField((String) "JAVA_LANG_OBJECT");
        ((Field) term662959).setAccessible(true);
        Object enum704 = ((Field) term662959).get((Object) null);
        term661938 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term661938, term661938.getClass(), "_appliesFor", enum704);
        Class<? extends Object> term662328 = Class.forName((String) "java.util.concurrent.ConcurrentHashMap$BaseIterator");
        term662200 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term662292 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term662292, term662292.getClass(), "_class", term662328);
        setField(term662200, term662200.getClass(), "_referencedType", term662292);
        Class<? extends Object> term663455 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term663454 = ((Class) term663455).getDeclaredField((String) "JAVA_LANG_OBJECT");
        ((Field) term663454).setAccessible(true);
        Object enum705 = ((Field) term663454).get((Object) null);
        term662946 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term662946, term662946.getClass(), "_appliesFor", enum705);
        setField(term662946, term662946.getClass(), "_idType", null);
        setField(term662946, term662946.getClass(), "_includeAs", null);
        setField(term662946, term662946.getClass(), "_typeProperty", null);
        setBooleanField(term662946, term662946.getClass(), "_typeIdVisible", false);
        setField(term662946, term662946.getClass(), "_defaultImpl", null);
        setField(term662946, term662946.getClass(), "_customIdResolver", null);
        Class<? extends Object> term662952 = Class.forName((String) "com.fasterxml.jackson.databind.InjectableValues$Std");
        term662950 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term662951 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term662951, term662951.getClass(), "_keyType", null);
        setField(term662951, term662951.getClass(), "_valueType", null);
        setField(term662951, term662951.getClass(), "_superClass", null);
        setField(term662951, term662951.getClass(), "_superInterfaces", null);
        setField(term662951, term662951.getClass(), "_bindings", null);
        setField(term662951, term662951.getClass(), "_canonicalName", null);
        setField(term662951, term662951.getClass(), "_class", term662952);
        setIntField(term662951, term662951.getClass(), "_hash", 0);
        setField(term662951, term662951.getClass(), "_valueHandler", null);
        setField(term662951, term662951.getClass(), "_typeHandler", null);
        setBooleanField(term662951, term662951.getClass(), "_asStatic", false);
        setField(term662950, term662950.getClass(), "_referencedType", term662951);
        setField(term662950, term662950.getClass(), "_anchorType", null);
        setField(term662950, term662950.getClass(), "_superClass", null);
        setField(term662950, term662950.getClass(), "_superInterfaces", null);
        setField(term662950, term662950.getClass(), "_bindings", null);
        setField(term662950, term662950.getClass(), "_canonicalName", null);
        setField(term662950, term662950.getClass(), "_class", null);
        setIntField(term662950, term662950.getClass(), "_hash", 0);
        setField(term662950, term662950.getClass(), "_valueHandler", null);
        setField(term662950, term662950.getClass(), "_typeHandler", null);
        setBooleanField(term662950, term662950.getClass(), "_asStatic", false);
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
        args[1] = term662200;
        args[2] = null;
        callMethod(klass, "buildTypeSerializer", argTypes, term661938, args);
        assertTrue(recursiveEquals(term661938, term662946));
        assertTrue(recursiveEquals(term662200, null));
    }

};


