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

public class StdTypeResolverBuilder_buildTypeSerializer_565512902415 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term454171;
     Object term454433;

    public StdTypeResolverBuilder_buildTypeSerializer_565512902415() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term455171 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term455170 = ((Class) term455171).getDeclaredField((String) "OBJECT_AND_NON_CONCRETE");
        ((Field) term455170).setAccessible(true);
        Object enum517 = ((Field) term455170).get((Object) null);
        term454171 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term454171, term454171.getClass(), "_appliesFor", enum517);
        term454433 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term454539 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term454433, term454433.getClass(), "_referencedType", term454539);
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
        args[1] = term454433;
        args[2] = null;
        try {
            callMethod(klass, "buildTypeSerializer", argTypes, term454171, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


