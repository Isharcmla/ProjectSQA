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
import static com.fasterxml.jackson.databind.ser.std.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class JsonValueSerializer_init_38619238550 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24366;

    public JsonValueSerializer_init_38619238550() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term24246 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer"));
        Class<? extends Object> term24667 = Class.forName((String) "java.nio.HeapDoubleBufferR");
        Class term24788 = double.class;
        Object[] term24789 = (Object[]) newArray("java.lang.Class", 1);
        setElement(term24789, 0, term24788);
        Method term24638 = ((Class) term24667).getDeclaredMethod((String) "put", (Class[]) term24789);
        ((Method) term24638).setAccessible(false);
        term24366 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        Object term24484 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        Object term24584 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeFactory"));
        setField(term24484, term24484.getClass(), "_typeFactory", term24584);
        setField(term24484, term24484.getClass(), "_bindings", null);
        setField(term24366, term24366.getClass(), "_typeContext", term24484);
        setField(term24366, term24366.getClass(), "_method", term24638);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JsonSerializer");
        Object[] args = new Object[2];
        args[0] = term24366;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


