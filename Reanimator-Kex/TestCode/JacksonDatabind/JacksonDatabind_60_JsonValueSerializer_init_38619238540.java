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

public class JsonValueSerializer_init_38619238540 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12580;

    public JsonValueSerializer_init_38619238540() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term12460 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer"));
        Class<? extends Object> term16503 = Class.forName((String) "java.util.stream.LongStream$1");
        Class<? extends Object> term16675 = Class.forName((String) "java.util.function.LongConsumer");
        Object[] term16676 = (Object[]) newArray("java.lang.Class", 1);
        setElement(term16676, 0, term16675);
        Method term12878 = ((Class) term16503).getDeclaredMethod((String) "tryAdvance", (Class[]) term16676);
        ((Method) term12878).setAccessible(false);
        term12580 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        Object term12724 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.TypeResolutionContext$Basic"));
        Object term12824 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeFactory"));
        setField(term12724, term12724.getClass(), "_typeFactory", term12824);
        setField(term12724, term12724.getClass(), "_bindings", null);
        setField(term12580, term12580.getClass(), "_typeContext", term12724);
        setField(term12580, term12580.getClass(), "_method", term12878);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JsonSerializer");
        Object[] args = new Object[2];
        args[0] = term12580;
        args[1] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


