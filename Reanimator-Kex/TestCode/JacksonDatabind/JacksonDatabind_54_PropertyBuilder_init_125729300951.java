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

public class PropertyBuilder_init_125729300951 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40254;
     Object term40628;

    public PropertyBuilder_init_125729300951() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term40148 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        setField(term40148, term40148.getClass(), "_config", null);
        setField(term40148, term40148.getClass(), "_beanDesc", null);
        setField(term40148, term40148.getClass(), "_defaultInclusion", null);
        HashMap term40408 = new HashMap();
        term40254 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term40360 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ConfigOverrides"));
        setField(term40360, term40360.getClass(), "_overrides", term40408);
        setField(term40254, term40254.getClass(), "_configOverrides", term40360);
        setField(term40254, term40254.getClass(), "_serializationInclusion", null);
        setIntField(term40254, term40254.getClass(), "_mapperFeatures", -1);
        term40628 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term40742 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        setField(term40742, term40742.getClass(), "_class", null);
        setField(term40628, term40628.getClass(), "_type", term40742);
        setField(term40628, term40628.getClass(), "_annotationIntrospector", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ser.PropertyBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.SerializationConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.BeanDescription");
        Object[] args = new Object[2];
        args[0] = term40254;
        args[1] = term40628;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


