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

public class PropertyBuilder_init_125729300971 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62488;
     Object term62724;

    public PropertyBuilder_init_125729300971() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term62276 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        Object term62382 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(term62276, term62276.getClass(), "_config", term62382);
        setField(term62276, term62276.getClass(), "_beanDesc", null);
        term62488 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term62594 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ConfigOverrides"));
        setField(term62488, term62488.getClass(), "_configOverrides", term62594);
        Class<? extends Object> term62866 = Class.forName((String) "java.lang.invoke.MethodHandleImpl$ArrayAccessor$1");
        term62724 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term62830 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term62724, term62724.getClass(), "_annotationIntrospector", null);
        setField(term62830, term62830.getClass(), "_class", term62866);
        setField(term62724, term62724.getClass(), "_type", term62830);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ser.PropertyBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.SerializationConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.BeanDescription");
        Object[] args = new Object[2];
        args[0] = term62488;
        args[1] = term62724;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


