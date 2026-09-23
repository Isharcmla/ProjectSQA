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
import java.lang.NullPointerException;
import static com.fasterxml.jackson.databind.ser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class PropertyBuilder_init_125729300943 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29421;
     Object term29657;

    public PropertyBuilder_init_125729300943() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term29315 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        setField(term29315, term29315.getClass(), "_config", null);
        setField(term29315, term29315.getClass(), "_beanDesc", null);
        setField(term29315, term29315.getClass(), "_defaultInclusion", null);
        term29421 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term29527 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ConfigOverrides"));
        setField(term29527, term29527.getClass(), "_overrides", null);
        setField(term29421, term29421.getClass(), "_configOverrides", term29527);
        setField(term29421, term29421.getClass(), "_serializationInclusion", null);
        setIntField(term29421, term29421.getClass(), "_mapperFeatures", -1);
        term29657 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term29753 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term29753, term29753.getClass(), "_class", null);
        setField(term29657, term29657.getClass(), "_type", term29753);
        setField(term29657, term29657.getClass(), "_annotationIntrospector", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ser.PropertyBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.SerializationConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.BeanDescription");
        Object[] args = new Object[2];
        args[0] = term29421;
        args[1] = term29657;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


