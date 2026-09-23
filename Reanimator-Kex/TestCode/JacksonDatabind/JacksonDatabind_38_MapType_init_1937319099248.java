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

public class MapType_init_1937319099248 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term104768;
     Object term104864;
     Object term104978;

    public MapType_init_1937319099248() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term104732 = Class.forName((String) "java.lang.invoke.InnerClassLambdaMetafactory");
        Object term104696 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term104696, term104696.getClass(), "_class", term104732);
        term104768 = Class.forName((String) "com.fasterxml.jackson.databind.ser.ContainerSerializer");
        term104864 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setIntField(term104864, term104864.getClass(), "_hash", 0);
        term104978 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        setIntField(term104978, term104978.getClass(), "_hash", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.MapType");
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
        args[0] = term104768;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        args[4] = term104864;
        args[5] = term104978;
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


