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

public class StdTypeResolverBuilder_buildTypeDeserializer_1703628023315 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term335942;
     Object term336198;

    public StdTypeResolverBuilder_buildTypeDeserializer_1703628023315() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term336822 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term336821 = ((Class) term336822).getDeclaredField((String) "OBJECT_AND_NON_CONCRETE");
        ((Field) term336821).setAccessible(true);
        Object enum388 = ((Field) term336821).get((Object) null);
        term335942 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term335942, term335942.getClass(), "_appliesFor", enum388);
        term336198 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
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
        args[1] = term336198;
        args[2] = null;
        try {
            callMethod(klass, "buildTypeDeserializer", argTypes, term335942, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


