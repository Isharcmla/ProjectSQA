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

public class StdTypeResolverBuilder_buildTypeDeserializer_1703628023371 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term400185;
     Object term400447;

    public StdTypeResolverBuilder_buildTypeDeserializer_1703628023371() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term401193 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term401192 = ((Class) term401193).getDeclaredField((String) "NON_CONCRETE_AND_ARRAYS");
        ((Field) term401192).setAccessible(true);
        Object enum465 = ((Field) term401192).get((Object) null);
        term400185 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term400185, term400185.getClass(), "_appliesFor", enum465);
        term400447 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term400553 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term400447, term400447.getClass(), "_referencedType", term400553);
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
        args[1] = term400447;
        args[2] = null;
        try {
            callMethod(klass, "buildTypeDeserializer", argTypes, term400185, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


