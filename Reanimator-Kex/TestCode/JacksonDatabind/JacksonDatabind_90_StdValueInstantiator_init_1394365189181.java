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

public class StdValueInstantiator_init_1394365189181 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term134896;

    public StdValueInstantiator_init_1394365189181() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term134792 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        Class<? extends Object> term134932 = Class.forName((String) "java.lang.Class");
        Class<? extends Object> term135110 = Class.forName((String) "kex.java.lang.AbstractStringBuilder");
        term134896 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term135074 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term135246 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(term134896, term134896.getClass(), "_class", term134932);
        setField(term135074, term135074.getClass(), "_canonicalName", null);
        setField(term135074, term135074.getClass(), "_class", term135110);
        setField(term135074, term135074.getClass(), "_referencedType", term135246);
        setField(term134896, term134896.getClass(), "_referencedType", term135074);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.DeserializationConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term134896;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


