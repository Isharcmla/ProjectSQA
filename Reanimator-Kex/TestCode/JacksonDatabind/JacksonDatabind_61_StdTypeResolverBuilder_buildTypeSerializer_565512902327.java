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

public class StdTypeResolverBuilder_buildTypeSerializer_565512902327 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term350662;
     Object term350924;

    public StdTypeResolverBuilder_buildTypeSerializer_565512902327() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term351654 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term351653 = ((Class) term351654).getDeclaredField((String) "OBJECT_AND_NON_CONCRETE");
        ((Field) term351653).setAccessible(true);
        Object enum405 = ((Field) term351653).get((Object) null);
        term350662 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term350662, term350662.getClass(), "_appliesFor", enum405);
        term350924 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term351022 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(term350924, term350924.getClass(), "_referencedType", term351022);
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
        args[1] = term350924;
        args[2] = null;
        try {
            callMethod(klass, "buildTypeSerializer", argTypes, term350662, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


