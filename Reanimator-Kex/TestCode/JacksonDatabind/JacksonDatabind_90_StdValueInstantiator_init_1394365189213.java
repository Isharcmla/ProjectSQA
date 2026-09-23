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

public class StdValueInstantiator_init_1394365189213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term190264;

    public StdValueInstantiator_init_1394365189213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term190160 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        Class term190300 = char.class;
        Class<? extends Object> term190466 = Class.forName((String) "com.fasterxml.jackson.databind.JavaType");
        term190264 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term190430 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term190624 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(term190264, term190264.getClass(), "_class", term190300);
        setField(term190430, term190430.getClass(), "_canonicalName", null);
        setField(term190430, term190430.getClass(), "_class", term190466);
        setField(term190624, term190624.getClass(), "_canonicalName", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator");
        setField(term190430, term190430.getClass(), "_keyType", term190624);
        setField(term190264, term190264.getClass(), "_referencedType", term190430);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.DeserializationConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term190264;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


