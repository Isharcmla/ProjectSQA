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
import java.lang.NullPointerException;
import static com.fasterxml.jackson.databind.jsontype.impl.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class StdTypeResolverBuilder_buildTypeDeserializer_1703628023351 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term375856;

    public StdTypeResolverBuilder_buildTypeDeserializer_1703628023351() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term376516 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonTypeInfo$Id");
        Field term376515 = ((Class) term376516).getDeclaredField((String) "NAME");
        ((Field) term376515).setAccessible(true);
        Object enum431 = ((Field) term376515).get((Object) null);
        term375856 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder"));
        setField(term375856, term375856.getClass(), "_idType", enum431);
        setField(term375856, term375856.getClass(), "_customIdResolver", null);
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
        try {
            callMethod(klass, "buildTypeDeserializer", argTypes, term375856, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


