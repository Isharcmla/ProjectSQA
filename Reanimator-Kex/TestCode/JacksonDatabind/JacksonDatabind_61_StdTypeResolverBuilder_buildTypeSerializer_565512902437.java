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

public class StdTypeResolverBuilder_buildTypeSerializer_565512902437 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term487405;
     Object term487807;

    public StdTypeResolverBuilder_buildTypeSerializer_565512902437() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term489275 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term489274 = ((Class) term489275).getDeclaredField((String) "OBJECT_AND_NON_CONCRETE");
        ((Field) term489274).setAccessible(true);
        Object enum548 = ((Field) term489274).get((Object) null);
        Class<? extends Object> term489636 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonTypeInfo$Id");
        Field term489635 = ((Class) term489636).getDeclaredField((String) "CUSTOM");
        ((Field) term489635).setAccessible(true);
        Object enum549 = ((Field) term489635).get((Object) null);
        term487405 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term487405, term487405.getClass(), "_appliesFor", enum548);
        setField(term487405, term487405.getClass(), "_idType", enum549);
        setField(term487405, term487405.getClass(), "_customIdResolver", null);
        Class<? extends Object> term487963 = Class.forName((String) "java.nio.ByteBufferAsShortBufferL");
        term487807 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term487927 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(term487927, term487927.getClass(), "_class", term487963);
        setField(term487807, term487807.getClass(), "_referencedType", term487927);
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
        args[1] = term487807;
        args[2] = null;
        try {
            callMethod(klass, "buildTypeSerializer", argTypes, term487405, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


