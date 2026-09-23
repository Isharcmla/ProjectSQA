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

public class StdTypeResolverBuilder_buildTypeSerializer_565512902409 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term443182;
     Object term443444;

    public StdTypeResolverBuilder_buildTypeSerializer_565512902409() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term445122 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term445121 = ((Class) term445122).getDeclaredField((String) "NON_FINAL");
        ((Field) term445121).setAccessible(true);
        Object enum508 = ((Field) term445121).get((Object) null);
        term443182 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term443182, term443182.getClass(), "_appliesFor", enum508);
        Class<? extends Object> term443600 = Class.forName((String) "java.nio.channels.SeekableByteChannel");
        term443444 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term443564 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(term443564, term443564.getClass(), "_class", term443600);
        setField(term443444, term443444.getClass(), "_referencedType", term443564);
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
        args[1] = term443444;
        args[2] = null;
        try {
            callMethod(klass, "buildTypeSerializer", argTypes, term443182, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


