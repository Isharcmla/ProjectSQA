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

public class StdTypeResolverBuilder_buildTypeSerializer_565512902278 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term290228;
     Object term290490;

    public StdTypeResolverBuilder_buildTypeSerializer_565512902278() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term293593 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term293592 = ((Class) term293593).getDeclaredField((String) "NON_FINAL");
        ((Field) term293592).setAccessible(true);
        Object enum347 = ((Field) term293592).get((Object) null);
        term290228 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term290228, term290228.getClass(), "_appliesFor", enum347);
        Class<? extends Object> term290640 = Class.forName((String) "com.fasterxml.jackson.core.base.GeneratorBase");
        term290490 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term290604 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        setField(term290604, term290604.getClass(), "_class", term290640);
        setField(term290490, term290490.getClass(), "_referencedType", term290604);
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
        args[1] = term290490;
        args[2] = null;
        try {
            callMethod(klass, "buildTypeSerializer", argTypes, term290228, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


