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
import java.lang.reflect.InaccessibleObjectException;
import static com.fasterxml.jackson.databind.jsontype.impl.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class StdTypeResolverBuilder_buildTypeDeserializer_1703628023249 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term248134;
     Object term248390;

    public StdTypeResolverBuilder_buildTypeDeserializer_1703628023249() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term249373 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term249372 = ((Class) term249373).getDeclaredField((String) "NON_FINAL");
        ((Field) term249372).setAccessible(true);
        Object enum308 = ((Field) term249372).get((Object) null);
        term248134 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term248134, term248134.getClass(), "_appliesFor", enum308);
        Class<? extends Object> term248426 = Class.forName((String) "java.util.concurrent.ConcurrentHashMap$KeySetView");
        term248390 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(term248390, term248390.getClass(), "_class", term248426);
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
        args[1] = term248390;
        args[2] = null;
        try {
            callMethod(klass, "buildTypeDeserializer", argTypes, term248134, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


