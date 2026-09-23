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

public class JsonValueSerializer_init_38619238553 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25953;

    public JsonValueSerializer_init_38619238553() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term25833 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer"));
        Class<? extends Object> term27098 = Class.forName((String) "java.util.TimerThread");
        Object[] term27191 = (Object[]) newArray("java.lang.Class", 0);
        Method term26225 = ((Class) term27098).getDeclaredMethod((String) "run", (Class[]) term27191);
        ((Method) term26225).setAccessible(false);
        term25953 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        Object term26071 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        Object term26171 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeFactory"));
        setField(term26071, term26071.getClass(), "_typeFactory", term26171);
        setField(term26071, term26071.getClass(), "_bindings", null);
        setField(term25953, term25953.getClass(), "_typeContext", term26071);
        setField(term25953, term25953.getClass(), "_method", term26225);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JsonSerializer");
        Object[] args = new Object[2];
        args[0] = term25953;
        args[1] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


