package com.fasterxml.jackson.databind;

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
import static com.fasterxml.jackson.databind.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.fasterxml.jackson.databind.EqualityUtils.*;
import java.lang.Boolean;
import java.lang.Object;

public class MappingIterator_init_67830671517 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term3;
     Object term2976;
     Object term2978;

    public MappingIterator_init_67830671517() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = new Boolean(false);
        term3 = newInstance(Class.forName("java.lang.Object"));
        term2976 = newInstance(Class.forName("com.fasterxml.jackson.databind.MappingIterator"));
        Object term2977 = newInstance(Class.forName("java.lang.Object"));
        setField(term2976, term2976.getClass(), "_type", null);
        setField(term2976, term2976.getClass(), "_context", null);
        setField(term2976, term2976.getClass(), "_deserializer", null);
        setField(term2976, term2976.getClass(), "_parser", null);
        setField(term2976, term2976.getClass(), "_updatedValue", term2977);
        setBooleanField(term2976, term2976.getClass(), "_closeParser", false);
        setBooleanField(term2976, term2976.getClass(), "_hasNextChecked", false);
        term2978 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.MappingIterator");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[1] = Class.forName("com.fasterxml.jackson.core.JsonParser");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        argTypes[3] = Class.forName("com.fasterxml.jackson.databind.JsonDeserializer");
        argTypes[4] = boolean.class;
        argTypes[5] = Class.forName("java.lang.Object");
        Object[] args = new Object[6];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        args[4] = term1;
        args[5] = term3;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term2976));
        assertTrue(recursiveEquals(term1, false));
        assertTrue(recursiveEquals(term3, term2978));
    }

};


