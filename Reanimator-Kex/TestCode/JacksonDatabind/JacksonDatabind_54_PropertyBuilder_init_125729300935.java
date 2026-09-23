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

public class PropertyBuilder_init_125729300935 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20284;
     Object term20520;

    public PropertyBuilder_init_125729300935() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term20072 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        Object term20178 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(term20072, term20072.getClass(), "_config", term20178);
        setField(term20072, term20072.getClass(), "_beanDesc", null);
        term20284 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term20390 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ConfigOverrides"));
        setField(term20390, term20390.getClass(), "_overrides", null);
        setField(term20284, term20284.getClass(), "_configOverrides", term20390);
        setField(term20284, term20284.getClass(), "_serializationInclusion", null);
        Class<? extends Object> term20670 = Class.forName((String) "java.util.concurrent.DelayQueue$Itr");
        term20520 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term20634 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        Object term20814 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(term20634, term20634.getClass(), "_class", term20670);
        setField(term20520, term20520.getClass(), "_type", term20634);
        setField(term20520, term20520.getClass(), "_annotationIntrospector", term20814);
        setField(term20520, term20520.getClass(), "_classInfo", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ser.PropertyBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.SerializationConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.BeanDescription");
        Object[] args = new Object[2];
        args[0] = term20284;
        args[1] = term20520;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


