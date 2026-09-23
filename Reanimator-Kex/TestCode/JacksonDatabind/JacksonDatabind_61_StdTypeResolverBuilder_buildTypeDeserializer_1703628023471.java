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

public class StdTypeResolverBuilder_buildTypeDeserializer_1703628023471 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term532239;
     Object term532501;

    public StdTypeResolverBuilder_buildTypeDeserializer_1703628023471() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term533233 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term533232 = ((Class) term533233).getDeclaredField((String) "NON_CONCRETE_AND_ARRAYS");
        ((Field) term533232).setAccessible(true);
        Object enum590 = ((Field) term533232).get((Object) null);
        term532239 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term532239, term532239.getClass(), "_appliesFor", enum590);
        term532501 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term532593 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term532501, term532501.getClass(), "_referencedType", term532593);
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
        args[1] = term532501;
        args[2] = null;
        try {
            callMethod(klass, "buildTypeDeserializer", argTypes, term532239, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


