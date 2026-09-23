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
import java.lang.Object;

public class MappingIterator_init_678306715114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66216;

    public MappingIterator_init_678306715114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term66112 = newInstance(Class.forName("com.fasterxml.jackson.databind.MappingIterator"));
        Object term66208 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term66112, term66112.getClass(), "_type", term66208);
        setField(term66112, term66112.getClass(), "_parser", null);
        setField(term66112, term66112.getClass(), "_context", null);
        setField(term66112, term66112.getClass(), "_deserializer", null);
        setBooleanField(term66112, term66112.getClass(), "_closeParser", false);
        setField(term66112, term66112.getClass(), "_updatedValue", null);
        term66216 = newInstance(Class.forName("com.fasterxml.jackson.databind.MappingIterator"));
        setField(term66216, term66216.getClass(), "_type", null);
        setField(term66216, term66216.getClass(), "_context", null);
        setField(term66216, term66216.getClass(), "_deserializer", null);
        setField(term66216, term66216.getClass(), "_parser", null);
        setField(term66216, term66216.getClass(), "_updatedValue", null);
        setBooleanField(term66216, term66216.getClass(), "_closeParser", true);
        setBooleanField(term66216, term66216.getClass(), "_hasNextChecked", false);
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
        args[4] = true;
        args[5] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term66216));
    }

};


