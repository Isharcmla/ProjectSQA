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

public class PropertyBuilder_init_125729300971 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65128;
     Object term65364;

    public PropertyBuilder_init_125729300971() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term65022 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        setField(term65022, term65022.getClass(), "_config", null);
        setField(term65022, term65022.getClass(), "_beanDesc", null);
        setField(term65022, term65022.getClass(), "_defaultInclusion", null);
        term65128 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term65234 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ConfigOverrides"));
        setField(term65234, term65234.getClass(), "_overrides", null);
        setField(term65128, term65128.getClass(), "_configOverrides", term65234);
        setField(term65128, term65128.getClass(), "_serializationInclusion", null);
        setIntField(term65128, term65128.getClass(), "_mapperFeatures", -1);
        term65364 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term65456 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term65456, term65456.getClass(), "_class", null);
        setField(term65364, term65364.getClass(), "_type", term65456);
        setField(term65364, term65364.getClass(), "_annotationIntrospector", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ser.PropertyBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.SerializationConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.BeanDescription");
        Object[] args = new Object[2];
        args[0] = term65128;
        args[1] = term65364;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


