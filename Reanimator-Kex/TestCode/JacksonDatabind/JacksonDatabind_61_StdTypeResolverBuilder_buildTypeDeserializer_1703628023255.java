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

public class StdTypeResolverBuilder_buildTypeDeserializer_1703628023255 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term258188;
     Object term258438;

    public StdTypeResolverBuilder_buildTypeDeserializer_1703628023255() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term259546 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term259545 = ((Class) term259546).getDeclaredField((String) "OBJECT_AND_NON_CONCRETE");
        ((Field) term259545).setAccessible(true);
        Object enum317 = ((Field) term259545).get((Object) null);
        term258188 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term258188, term258188.getClass(), "_appliesFor", enum317);
        Class<? extends Object> term258474 = Class.forName((String) "java.lang.invoke.DirectMethodHandle$Constructor");
        term258438 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term258438, term258438.getClass(), "_class", term258474);
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
        args[1] = term258438;
        args[2] = null;
        try {
            callMethod(klass, "buildTypeDeserializer", argTypes, term258188, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


