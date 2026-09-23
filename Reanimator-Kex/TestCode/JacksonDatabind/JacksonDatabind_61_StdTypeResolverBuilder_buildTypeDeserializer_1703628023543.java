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

public class StdTypeResolverBuilder_buildTypeDeserializer_1703628023543 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term648448;
     Object term648710;

    public StdTypeResolverBuilder_buildTypeDeserializer_1703628023543() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term649434 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term649433 = ((Class) term649434).getDeclaredField((String) "OBJECT_AND_NON_CONCRETE");
        ((Field) term649433).setAccessible(true);
        Object enum692 = ((Field) term649433).get((Object) null);
        term648448 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term648448, term648448.getClass(), "_appliesFor", enum692);
        term648710 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term648802 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term648710, term648710.getClass(), "_referencedType", term648802);
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
        args[1] = term648710;
        args[2] = null;
        try {
            callMethod(klass, "buildTypeDeserializer", argTypes, term648448, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


