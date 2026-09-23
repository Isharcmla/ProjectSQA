package com.fasterxml.jackson.databind.ser;

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
import static com.fasterxml.jackson.databind.ser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.fasterxml.jackson.databind.ser.EqualityUtils.*;
import java.lang.Object;

public class BeanSerializerFactory_init_116979274341 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4972;
     Object term4976;
     Object term4978;

    public BeanSerializerFactory_init_116979274341() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term4850 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        term4972 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig"));
        term4976 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        Object term4977 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig"));
        setField(term4977, term4977.getClass(), "_additionalSerializers", null);
        setField(term4977, term4977.getClass(), "_additionalKeySerializers", null);
        setField(term4977, term4977.getClass(), "_modifiers", null);
        setField(term4976, term4976.getClass(), "_factoryConfig", term4977);
        term4978 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig"));
        setField(term4978, term4978.getClass(), "_additionalSerializers", null);
        setField(term4978, term4978.getClass(), "_additionalKeySerializers", null);
        setField(term4978, term4978.getClass(), "_modifiers", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ser.BeanSerializerFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig");
        Object[] args = new Object[1];
        args[0] = term4972;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term4976));
        assertTrue(recursiveEquals(term4972, term4978));
    }

};


