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

public class StdTypeResolverBuilder_buildTypeDeserializer_1703628023477 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term540057;
     Object term540319;

    public StdTypeResolverBuilder_buildTypeDeserializer_1703628023477() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term541048 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term541047 = ((Class) term541048).getDeclaredField((String) "OBJECT_AND_NON_CONCRETE");
        ((Field) term541047).setAccessible(true);
        Object enum596 = ((Field) term541047).get((Object) null);
        term540057 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term540057, term540057.getClass(), "_appliesFor", enum596);
        term540319 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term540423 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term540319, term540319.getClass(), "_referencedType", term540423);
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
        args[1] = term540319;
        args[2] = null;
        try {
            callMethod(klass, "buildTypeDeserializer", argTypes, term540057, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


