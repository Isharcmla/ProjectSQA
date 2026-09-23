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

public class JsonValueSerializer_init_38619238539 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10302;

    public JsonValueSerializer_init_38619238539() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term10182 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer"));
        Class<? extends Object> term14760 = Class.forName((String) "com.fasterxml.jackson.databind.ext.OptionalHandlerFactory");
        Class<? extends Object> term15071 = Class.forName((String) "com.fasterxml.jackson.databind.SerializationConfig");
        Class<? extends Object> term15113 = Class.forName((String) "com.fasterxml.jackson.databind.JavaType");
        Class<? extends Object> term15162 = Class.forName((String) "com.fasterxml.jackson.databind.BeanDescription");
        Object[] term15163 = (Object[]) newArray("java.lang.Class", 3);
        setElement(term15163, 0, term15071);
        setElement(term15163, 1, term15113);
        setElement(term15163, 2, term15162);
        Method term10574 = ((Class) term14760).getDeclaredMethod((String) "findSerializer", (Class[]) term15163);
        ((Method) term10574).setAccessible(false);
        term10302 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        Object term10420 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        Object term10520 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeFactory"));
        setField(term10420, term10420.getClass(), "_typeFactory", term10520);
        setField(term10420, term10420.getClass(), "_bindings", null);
        setField(term10302, term10302.getClass(), "_typeContext", term10420);
        setField(term10302, term10302.getClass(), "_method", term10574);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JsonSerializer");
        Object[] args = new Object[2];
        args[0] = term10302;
        args[1] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


