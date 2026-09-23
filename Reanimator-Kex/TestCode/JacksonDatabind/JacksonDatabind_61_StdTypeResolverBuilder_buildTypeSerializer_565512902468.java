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

public class StdTypeResolverBuilder_buildTypeSerializer_565512902468 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term528049;
     Object term528311;

    public StdTypeResolverBuilder_buildTypeSerializer_565512902468() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term530508 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term530507 = ((Class) term530508).getDeclaredField((String) "OBJECT_AND_NON_CONCRETE");
        ((Field) term530507).setAccessible(true);
        Object enum586 = ((Field) term530507).get((Object) null);
        term528049 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term528049, term528049.getClass(), "_appliesFor", enum586);
        term528311 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term528403 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term528311, term528311.getClass(), "_referencedType", term528403);
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
        args[1] = term528311;
        args[2] = null;
        try {
            callMethod(klass, "buildTypeSerializer", argTypes, term528049, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


