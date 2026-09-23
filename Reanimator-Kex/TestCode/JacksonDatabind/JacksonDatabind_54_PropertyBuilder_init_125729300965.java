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
import java.util.HashMap;
import java.lang.String;

public class PropertyBuilder_init_125729300965 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56234;
     Object term56518;

    public PropertyBuilder_init_125729300965() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term56022 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        Object term56128 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(term56022, term56022.getClass(), "_config", term56128);
        setField(term56022, term56022.getClass(), "_beanDesc", null);
        HashMap term56388 = new HashMap();
        term56234 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term56340 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ConfigOverrides"));
        setField(term56340, term56340.getClass(), "_overrides", term56388);
        setField(term56234, term56234.getClass(), "_configOverrides", term56340);
        Class<? extends Object> term56660 = Class.forName((String) "com.fasterxml.jackson.databind.node.BaseJsonNode");
        term56518 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term56624 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term56624, term56624.getClass(), "_class", term56660);
        setField(term56518, term56518.getClass(), "_type", term56624);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ser.PropertyBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.SerializationConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.BeanDescription");
        Object[] args = new Object[2];
        args[0] = term56234;
        args[1] = term56518;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


