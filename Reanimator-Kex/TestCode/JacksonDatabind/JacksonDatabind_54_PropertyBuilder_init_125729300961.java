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
import java.util.HashMap;

public class PropertyBuilder_init_125729300961 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51633;
     Object term52021;

    public PropertyBuilder_init_125729300961() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term51291 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        Object term51397 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term51527 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        setField(term51291, term51291.getClass(), "_config", term51397);
        setField(term51291, term51291.getClass(), "_beanDesc", term51527);
        HashMap term51787 = new HashMap();
        term51633 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term51739 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ConfigOverrides"));
        setField(term51739, term51739.getClass(), "_overrides", term51787);
        setField(term51633, term51633.getClass(), "_configOverrides", term51739);
        setField(term51633, term51633.getClass(), "_serializationInclusion", null);
        term52021 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term52113 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term52257 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(term52113, term52113.getClass(), "_class", null);
        setField(term52021, term52021.getClass(), "_type", term52113);
        setField(term52021, term52021.getClass(), "_annotationIntrospector", term52257);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ser.PropertyBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.SerializationConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.BeanDescription");
        Object[] args = new Object[2];
        args[0] = term51633;
        args[1] = term52021;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


