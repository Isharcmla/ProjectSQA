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
import java.lang.reflect.InaccessibleObjectException;
import static com.fasterxml.jackson.databind.ser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class PropertyBuilder_init_125729300937 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22564;
     Object term22800;

    public PropertyBuilder_init_125729300937() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term22246 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        Object term22352 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term22458 = newInstance(Class.forName("com.fasterxml.jackson.annotation.JsonInclude$Value"));
        setField(term22246, term22246.getClass(), "_config", term22352);
        setField(term22246, term22246.getClass(), "_beanDesc", null);
        setField(term22246, term22246.getClass(), "_defaultInclusion", term22458);
        term22564 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term22670 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ConfigOverrides"));
        setField(term22670, term22670.getClass(), "_overrides", null);
        setField(term22564, term22564.getClass(), "_configOverrides", term22670);
        setField(term22564, term22564.getClass(), "_serializationInclusion", null);
        Class<? extends Object> term22956 = Class.forName((String) "java.lang.reflect.ProxyGenerator$ConstantPool$ValueEntry");
        term22800 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term22920 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(term22800, term22800.getClass(), "_annotationIntrospector", null);
        setField(term22920, term22920.getClass(), "_class", term22956);
        setField(term22800, term22800.getClass(), "_type", term22920);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ser.PropertyBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.SerializationConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.BeanDescription");
        Object[] args = new Object[2];
        args[0] = term22564;
        args[1] = term22800;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


