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

public class BeanSerializerFactory_init_116979274320 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44;

    public BeanSerializerFactory_init_116979274320() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term44 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        Object term45 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig"));
        Object[] term46 = (Object[]) newArray("com.fasterxml.jackson.databind.ser.Serializers", 0);
        Object[] term47 = (Object[]) newArray("com.fasterxml.jackson.databind.ser.Serializers", 0);
        Object[] term48 = (Object[]) newArray("com.fasterxml.jackson.databind.ser.BeanSerializerModifier", 0);
        setField(term45, term45.getClass(), "_additionalSerializers", term46);
        setField(term45, term45.getClass(), "_additionalKeySerializers", term47);
        setField(term45, term45.getClass(), "_modifiers", term48);
        setField(term44, term44.getClass(), "_factoryConfig", term45);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ser.BeanSerializerFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig");
        Object[] args = new Object[1];
        args[0] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term44));
    }

};


