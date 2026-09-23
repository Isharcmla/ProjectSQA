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

public class BeanSerializerFactory_init_116979274343 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5221;
     Object term5225;
     Object term5227;

    public BeanSerializerFactory_init_116979274343() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term5099 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        term5221 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig"));
        term5225 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        Object term5226 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig"));
        setField(term5226, term5226.getClass(), "_additionalSerializers", null);
        setField(term5226, term5226.getClass(), "_additionalKeySerializers", null);
        setField(term5226, term5226.getClass(), "_modifiers", null);
        setField(term5225, term5225.getClass(), "_factoryConfig", term5226);
        term5227 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig"));
        setField(term5227, term5227.getClass(), "_additionalSerializers", null);
        setField(term5227, term5227.getClass(), "_additionalKeySerializers", null);
        setField(term5227, term5227.getClass(), "_modifiers", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ser.BeanSerializerFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig");
        Object[] args = new Object[1];
        args[0] = term5221;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term5225));
        assertTrue(recursiveEquals(term5221, term5227));
    }

};


