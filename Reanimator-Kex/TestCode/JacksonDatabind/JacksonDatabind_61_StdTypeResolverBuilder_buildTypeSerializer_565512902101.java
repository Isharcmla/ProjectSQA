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

public class StdTypeResolverBuilder_buildTypeSerializer_565512902101 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term74075;

    public StdTypeResolverBuilder_buildTypeSerializer_565512902101() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term74735 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonTypeInfo$Id");
        Field term74734 = ((Class) term74735).getDeclaredField((String) "NAME");
        ((Field) term74734).setAccessible(true);
        Object enum114 = ((Field) term74734).get((Object) null);
        term74075 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder"));
        setField(term74075, term74075.getClass(), "_idType", enum114);
        setField(term74075, term74075.getClass(), "_customIdResolver", null);
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
        args[1] = null;
        args[2] = null;
        try {
            callMethod(klass, "buildTypeSerializer", argTypes, term74075, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


