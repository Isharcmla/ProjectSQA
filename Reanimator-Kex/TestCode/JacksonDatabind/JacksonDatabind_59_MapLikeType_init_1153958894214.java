package com.fasterxml.jackson.databind.type;

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
import static com.fasterxml.jackson.databind.type.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class MapLikeType_init_1153958894214 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term93019;
     Object term93123;
     Object term93237;

    public MapLikeType_init_1153958894214() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term92983 = Class.forName((String) "com.fasterxml.jackson.databind.ser.PropertyBuilder");
        Object term92947 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(term92947, term92947.getClass(), "_class", term92983);
        term93019 = Class.forName((String) "java.util.concurrent.CompletableFuture$DelayedCompleter");
        term93123 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setIntField(term93123, term93123.getClass(), "_hash", 0);
        term93237 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        setIntField(term93237, term93237.getClass(), "_hash", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.MapLikeType");
        Class<?>[] argTypes = new Class<?>[9];
        argTypes[0] = Class.forName("java.lang.Class");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[3] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.JavaType"), 0).getClass();
        argTypes[4] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[5] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[6] = Class.forName("java.lang.Object");
        argTypes[7] = Class.forName("java.lang.Object");
        argTypes[8] = boolean.class;
        Object[] args = new Object[9];
        args[0] = term93019;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        args[4] = term93123;
        args[5] = term93237;
        args[6] = null;
        args[7] = null;
        args[8] = false;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


