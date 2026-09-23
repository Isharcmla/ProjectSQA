package com.fasterxml.jackson.databind.deser;

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
import static com.fasterxml.jackson.databind.deser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;
import java.util.ArrayList;

public class BeanDeserializer_init_1724735634213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term109101;
     Object term109283;

    public BeanDeserializer_init_1724735634213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term108875 = Class.forName((String) "java.lang.module.Resolver");
        Object term108839 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term108975 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(term108839, term108839.getClass(), "_valueClass", term108875);
        setField(term108839, term108839.getClass(), "_beanType", term108975);
        setField(term108839, term108839.getClass(), "_valueInstantiator", null);
        setField(term108839, term108839.getClass(), "_beanProperties", null);
        setField(term108839, term108839.getClass(), "_backRefs", null);
        setField(term108839, term108839.getClass(), "_ignorableProps", null);
        setBooleanField(term108839, term108839.getClass(), "_ignoreAllUnknown", false);
        setField(term108839, term108839.getClass(), "_anySetter", null);
        ArrayList term109153 = new ArrayList();
        term109101 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder"));
        setField(term109101, term109101.getClass(), "_valueInstantiator", null);
        setField(term109101, term109101.getClass(), "_anySetter", null);
        setField(term109101, term109101.getClass(), "_injectables", term109153);
        Class<? extends Object> term109411 = Class.forName((String) "com.fasterxml.jackson.databind.introspect.AnnotatedMethodCollector$MethodBuilder");
        term109283 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term109375 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term109375, term109375.getClass(), "_class", term109411);
        setField(term109283, term109283.getClass(), "_type", term109375);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<?>[] argTypes = new Class<?>[7];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.BeanDescription");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap");
        argTypes[3] = Class.forName("java.util.Map");
        argTypes[4] = Class.forName("java.util.HashSet");
        argTypes[5] = boolean.class;
        argTypes[6] = boolean.class;
        Object[] args = new Object[7];
        args[0] = term109101;
        args[1] = term109283;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        args[5] = true;
        args[6] = false;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


