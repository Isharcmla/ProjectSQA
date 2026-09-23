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
import java.lang.NullPointerException;
import static com.fasterxml.jackson.databind.deser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashSet;

public class BeanDeserializer_init_1724735634215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term112338;
     Object term112468;
     Object term112584;

    public BeanDeserializer_init_1724735634215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term112584 = new HashSet();
        Object term111908 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term112074 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        Object term112212 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.UnwrappedPropertyHandler"));
        setField(term111908, term111908.getClass(), "_valueClass", null);
        setField(term111908, term111908.getClass(), "_beanType", null);
        setField(term111908, term111908.getClass(), "_valueInstantiator", null);
        setField(term111908, term111908.getClass(), "_beanProperties", null);
        setField(term111908, term111908.getClass(), "_backRefs", null);
        setField(term111908, term111908.getClass(), "_ignorableProps", term112584);
        setBooleanField(term111908, term111908.getClass(), "_ignoreAllUnknown", false);
        setField(term111908, term111908.getClass(), "_anySetter", null);
        setField(term111908, term111908.getClass(), "_injectables", null);
        setField(term111908, term111908.getClass(), "_objectIdReader", term112074);
        setField(term111908, term111908.getClass(), "_unwrappedPropertyHandler", term112212);
        term112338 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder"));
        setField(term112338, term112338.getClass(), "_valueInstantiator", null);
        setField(term112338, term112338.getClass(), "_anySetter", null);
        setField(term112338, term112338.getClass(), "_injectables", null);
        setField(term112338, term112338.getClass(), "_objectIdReader", null);
        term112468 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term112560 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term112560, term112560.getClass(), "_class", null);
        setField(term112468, term112468.getClass(), "_type", term112560);
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
        args[0] = term112338;
        args[1] = term112468;
        args[2] = null;
        args[3] = null;
        args[4] = term112584;
        args[5] = true;
        args[6] = false;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


