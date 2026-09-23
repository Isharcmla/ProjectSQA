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
import java.lang.ArrayStoreException;
import static com.fasterxml.jackson.databind.deser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;

public class BuilderBasedDeserializer_init_1465534056189 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term88149;
     Object term88407;

    public BuilderBasedDeserializer_init_1465534056189() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term87907 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        Object term88583 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        setField(term87907, term87907.getClass(), "_valueClass", null);
        setField(term87907, term87907.getClass(), "_classAnnotations", term88583);
        setField(term87907, term87907.getClass(), "_beanType", null);
        setField(term87907, term87907.getClass(), "_valueInstantiator", null);
        setField(term87907, term87907.getClass(), "_beanProperties", null);
        setField(term87907, term87907.getClass(), "_backRefs", null);
        setField(term87907, term87907.getClass(), "_ignorableProps", null);
        setBooleanField(term87907, term87907.getClass(), "_ignoreAllUnknown", false);
        setField(term87907, term87907.getClass(), "_anySetter", null);
        Object term88239 = newInstance(Class.forName("java.lang.Object"));
        Object term88277 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term88201 = new ArrayList();
        ((ArrayList) term88201).add(term88239);
        ((ArrayList) term88201).add(term88277);
        ((ArrayList) term88201).add(term88277);
        ((ArrayList) term88201).add(term88277);
        ((ArrayList) term88201).add(term88277);
        ((ArrayList) term88201).add(term88277);
        ((ArrayList) term88201).add(term88277);
        ((ArrayList) term88201).add(term88277);
        ((ArrayList) term88201).add(term88277);
        ((ArrayList) term88201).add(term88277);
        ((ArrayList) term88201).add(term88277);
        ((ArrayList) term88201).add(term88277);
        ((ArrayList) term88201).add(term88277);
        ((ArrayList) term88201).add(term88277);
        ((ArrayList) term88201).add(term88277);
        ((ArrayList) term88201).add(term88277);
        term88149 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder"));
        setField(term88149, term88149.getClass(), "_valueInstantiator", null);
        setField(term88149, term88149.getClass(), "_anySetter", null);
        setField(term88149, term88149.getClass(), "_injectables", term88201);
        term88407 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term88525 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        setField(term88407, term88407.getClass(), "_type", null);
        setField(term88525, term88525.getClass(), "_classAnnotations", term88583);
        setField(term88407, term88407.getClass(), "_classInfo", term88525);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer");
        Class<?>[] argTypes = new Class<?>[7];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.BeanDescription");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap");
        argTypes[3] = Class.forName("java.util.Map");
        argTypes[4] = Class.forName("java.util.Set");
        argTypes[5] = boolean.class;
        argTypes[6] = boolean.class;
        Object[] args = new Object[7];
        args[0] = term88149;
        args[1] = term88407;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        args[5] = true;
        args[6] = false;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (ArrayStoreException e) {
        }

    }

};


