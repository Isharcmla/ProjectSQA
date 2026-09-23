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
import java.lang.String;

public class PropertyBuilder_init_125729300963 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53600;
     Object term53942;

    public PropertyBuilder_init_125729300963() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term53258 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        Object term53364 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term53494 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        setField(term53258, term53258.getClass(), "_config", term53364);
        setField(term53258, term53258.getClass(), "_beanDesc", term53494);
        setField(term53258, term53258.getClass(), "_defaultInclusion", null);
        setBooleanField(term53258, term53258.getClass(), "_useRealPropertyDefaults", false);
        term53600 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term53706 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ConfigOverrides"));
        Object term53812 = newInstance(Class.forName("com.fasterxml.jackson.annotation.JsonInclude$Value"));
        setField(term53706, term53706.getClass(), "_overrides", null);
        setField(term53600, term53600.getClass(), "_configOverrides", term53706);
        setField(term53600, term53600.getClass(), "_serializationInclusion", term53812);
        setIntField(term53600, term53600.getClass(), "_mapperFeatures", -1);
        Class<? extends Object> term54098 = Class.forName((String) "java.nio.ShortBuffer");
        term53942 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term54062 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(term53942, term53942.getClass(), "_annotationIntrospector", null);
        setField(term54062, term54062.getClass(), "_class", term54098);
        setField(term53942, term53942.getClass(), "_type", term54062);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ser.PropertyBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.SerializationConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.BeanDescription");
        Object[] args = new Object[2];
        args[0] = term53600;
        args[1] = term53942;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


