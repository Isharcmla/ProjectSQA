package com.fasterxml.jackson.databind.deser.std;

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
import static com.fasterxml.jackson.databind.deser.std.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class StdValueInstantiator_init_1394365189235 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term228921;

    public StdValueInstantiator_init_1394365189235() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term228817 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        Class<? extends Object> term228957 = Class.forName((String) "kex.java.lang.AbstractStringBuilder");
        Class<? extends Object> term229123 = Class.forName((String) "com.fasterxml.jackson.databind.type.PlaceholderForType");
        Class<? extends Object> term229289 = Class.forName((String) "kex.java.lang.AbstractStringBuilder");
        term228921 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term229087 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term229253 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term229403 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.PlaceholderForType"));
        setField(term228921, term228921.getClass(), "_class", term228957);
        setField(term229087, term229087.getClass(), "_canonicalName", null);
        setField(term229087, term229087.getClass(), "_class", term229123);
        setField(term229253, term229253.getClass(), "_canonicalName", null);
        setField(term229253, term229253.getClass(), "_class", term229289);
        setField(term229253, term229253.getClass(), "_keyType", term229403);
        setField(term229087, term229087.getClass(), "_keyType", term229253);
        setField(term228921, term228921.getClass(), "_referencedType", term229087);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.DeserializationConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term228921;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


