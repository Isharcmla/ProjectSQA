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
import static com.fasterxml.jackson.databind.deser.std.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.fasterxml.jackson.databind.deser.std.EqualityUtils.*;
import java.lang.Integer;

public class StdKeyDeserializer_init_89657686811 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3;
     Object term3134;

    public StdKeyDeserializer_init_89657686811() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3 = new Integer(1162663216);
        term3134 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer"));
        setIntField(term3134, term3134.getClass(), "_kind", 1162663216);
        setField(term3134, term3134.getClass(), "_keyClass", null);
        setField(term3134, term3134.getClass(), "_deser", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("java.lang.Class");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.deser.std.FromStringDeserializer");
        Object[] args = new Object[3];
        args[0] = term3;
        args[1] = null;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term3134));
        assertTrue(recursiveEquals(term3, 1162663216));
    }

};


