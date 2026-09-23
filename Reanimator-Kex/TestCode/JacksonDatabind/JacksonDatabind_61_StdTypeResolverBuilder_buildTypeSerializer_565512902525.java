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

public class StdTypeResolverBuilder_buildTypeSerializer_565512902525 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term622455;
     Object term622717;

    public StdTypeResolverBuilder_buildTypeSerializer_565512902525() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term623886 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term623885 = ((Class) term623886).getDeclaredField((String) "NON_FINAL");
        ((Field) term623885).setAccessible(true);
        Object enum671 = ((Field) term623885).get((Object) null);
        term622455 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term622455, term622455.getClass(), "_appliesFor", enum671);
        Class<? extends Object> term622845 = Class.forName((String) "java.util.MissingFormatWidthException");
        term622717 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term622809 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term622809, term622809.getClass(), "_class", term622845);
        setField(term622717, term622717.getClass(), "_referencedType", term622809);
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
        args[1] = term622717;
        args[2] = null;
        try {
            callMethod(klass, "buildTypeSerializer", argTypes, term622455, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


