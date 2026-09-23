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

public class StdTypeResolverBuilder_buildTypeSerializer_565512902184 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term164848;
     Object term165104;

    public StdTypeResolverBuilder_buildTypeSerializer_565512902184() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term167491 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term167490 = ((Class) term167491).getDeclaredField((String) "NON_FINAL");
        ((Field) term167490).setAccessible(true);
        Object enum233 = ((Field) term167490).get((Object) null);
        term164848 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term164848, term164848.getClass(), "_appliesFor", enum233);
        Class<? extends Object> term165140 = Class.forName((String) "java.util.stream.SliceOps$SliceTask");
        term165104 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(term165104, term165104.getClass(), "_class", term165140);
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
        args[1] = term165104;
        args[2] = null;
        try {
            callMethod(klass, "buildTypeSerializer", argTypes, term164848, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


