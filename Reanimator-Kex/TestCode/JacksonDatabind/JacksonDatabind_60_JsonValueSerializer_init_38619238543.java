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
import java.lang.reflect.InaccessibleObjectException;
import static com.fasterxml.jackson.databind.ser.std.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class JsonValueSerializer_init_38619238543 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17268;

    public JsonValueSerializer_init_38619238543() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term17148 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer"));
        Class<? extends Object> term18523 = Class.forName((String) "com.fasterxml.jackson.databind.type.ClassStack");
        Class<? extends Object> term18801 = Class.forName((String) "com.fasterxml.jackson.databind.type.ResolvedRecursiveType");
        Object[] term18802 = (Object[]) newArray("java.lang.Class", 1);
        setElement(term18802, 0, term18801);
        Method term17566 = ((Class) term18523).getDeclaredMethod((String) "addSelfReference", (Class[]) term18802);
        ((Method) term17566).setAccessible(false);
        term17268 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        Object term17412 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.TypeResolutionContext$Basic"));
        Object term17512 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeFactory"));
        setField(term17412, term17412.getClass(), "_typeFactory", term17512);
        setField(term17412, term17412.getClass(), "_bindings", null);
        setField(term17268, term17268.getClass(), "_typeContext", term17412);
        setField(term17268, term17268.getClass(), "_method", term17566);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JsonSerializer");
        Object[] args = new Object[2];
        args[0] = term17268;
        args[1] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


