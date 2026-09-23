package com.fasterxml.jackson.databind.ser.std;

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
import static com.fasterxml.jackson.databind.ser.std.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class JsonValueSerializer_init_38619238541 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13312;

    public JsonValueSerializer_init_38619238541() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term13192 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer"));
        Class<? extends Object> term16793 = Class.forName((String) "kex.java.lang.Number");
        Object[] term16894 = (Object[]) newArray("java.lang.Class", 0);
        Method term13366 = ((Class) term16793).getDeclaredMethod((String) "byteValue", (Class[]) term16894);
        ((Method) term13366).setAccessible(false);
        term13312 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        setField(term13312, term13312.getClass(), "_typeContext", null);
        setField(term13312, term13312.getClass(), "_method", term13366);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JsonSerializer");
        Object[] args = new Object[2];
        args[0] = term13312;
        args[1] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


