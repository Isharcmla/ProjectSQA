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
import static com.fasterxml.jackson.databind.jsontype.impl.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class StdTypeResolverBuilder_buildTypeSerializer_565512902413 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term450479;
     Object term450741;

    public StdTypeResolverBuilder_buildTypeSerializer_565512902413() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term452403 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term452402 = ((Class) term452403).getDeclaredField((String) "NON_FINAL");
        ((Field) term452402).setAccessible(true);
        Object enum514 = ((Field) term452402).get((Object) null);
        term450479 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term450479, term450479.getClass(), "_appliesFor", enum514);
        Class<? extends Object> term450869 = Class.forName((String) "java.util.function.LongFunction");
        term450741 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term450833 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term450833, term450833.getClass(), "_class", term450869);
        setField(term450741, term450741.getClass(), "_referencedType", term450833);
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
        args[1] = term450741;
        args[2] = null;
        try {
            callMethod(klass, "buildTypeSerializer", argTypes, term450479, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


