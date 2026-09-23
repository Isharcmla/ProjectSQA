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

public class StdTypeResolverBuilder_buildTypeSerializer_565512902195 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term177137;
     Object term177409;

    public StdTypeResolverBuilder_buildTypeSerializer_565512902195() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term178033 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term178032 = ((Class) term178033).getDeclaredField((String) "OBJECT_AND_NON_CONCRETE");
        ((Field) term178032).setAccessible(true);
        Object enum244 = ((Field) term178032).get((Object) null);
        term177137 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term177137, term177137.getClass(), "_appliesFor", enum244);
        term177409 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
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
        args[1] = term177409;
        args[2] = null;
        try {
            callMethod(klass, "buildTypeSerializer", argTypes, term177137, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


