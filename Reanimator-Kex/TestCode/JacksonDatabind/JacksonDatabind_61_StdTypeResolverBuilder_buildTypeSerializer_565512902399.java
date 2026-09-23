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

public class StdTypeResolverBuilder_buildTypeSerializer_565512902399 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term428101;
     Object term428363;

    public StdTypeResolverBuilder_buildTypeSerializer_565512902399() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term429775 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term429774 = ((Class) term429775).getDeclaredField((String) "NON_CONCRETE_AND_ARRAYS");
        ((Field) term429774).setAccessible(true);
        Object enum497 = ((Field) term429774).get((Object) null);
        term428101 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term428101, term428101.getClass(), "_appliesFor", enum497);
        term428363 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term428455 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term428363, term428363.getClass(), "_referencedType", term428455);
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
        args[1] = term428363;
        args[2] = null;
        try {
            callMethod(klass, "buildTypeSerializer", argTypes, term428101, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


