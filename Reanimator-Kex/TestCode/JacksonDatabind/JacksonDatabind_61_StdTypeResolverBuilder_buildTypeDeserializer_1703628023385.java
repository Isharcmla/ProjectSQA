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

public class StdTypeResolverBuilder_buildTypeDeserializer_1703628023385 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term413233;
     Object term413495;

    public StdTypeResolverBuilder_buildTypeDeserializer_1703628023385() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term414951 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term414950 = ((Class) term414951).getDeclaredField((String) "OBJECT_AND_NON_CONCRETE");
        ((Field) term414950).setAccessible(true);
        Object enum482 = ((Field) term414950).get((Object) null);
        term413233 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term413233, term413233.getClass(), "_appliesFor", enum482);
        term413495 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term413593 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(term413495, term413495.getClass(), "_referencedType", term413593);
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
        args[1] = term413495;
        args[2] = null;
        try {
            callMethod(klass, "buildTypeDeserializer", argTypes, term413233, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


