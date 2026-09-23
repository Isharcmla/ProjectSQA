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
import java.util.HashMap;

public class BeanDeserializer_init_1724735634172 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81635;
     Object term81889;
     Object term82243;
     Object term82291;

    public BeanDeserializer_init_1724735634172() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term81509 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(term81509, term81509.getClass(), "_valueClass", null);
        setField(term81509, term81509.getClass(), "_classAnnotations", null);
        setField(term81509, term81509.getClass(), "_beanType", null);
        setField(term81509, term81509.getClass(), "_valueInstantiator", null);
        setField(term81509, term81509.getClass(), "_beanProperties", null);
        setField(term81509, term81509.getClass(), "_backRefs", null);
        setField(term81509, term81509.getClass(), "_ignorableProps", null);
        setBooleanField(term81509, term81509.getClass(), "_ignoreAllUnknown", false);
        setField(term81509, term81509.getClass(), "_anySetter", null);
        setField(term81509, term81509.getClass(), "_injectables", null);
        setField(term81509, term81509.getClass(), "_objectIdReader", null);
        setField(term81509, term81509.getClass(), "_unwrappedPropertyHandler", null);
        term81635 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder"));
        Object term81759 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.ValueInstantiator$Base"));
        setField(term81635, term81635.getClass(), "_valueInstantiator", term81759);
        setField(term81635, term81635.getClass(), "_anySetter", null);
        setField(term81635, term81635.getClass(), "_injectables", null);
        setField(term81635, term81635.getClass(), "_objectIdReader", null);
        term81889 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term82007 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        Object term82123 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        setField(term81889, term81889.getClass(), "_type", null);
        setField(term82007, term82007.getClass(), "_classAnnotations", term82123);
        setField(term81889, term81889.getClass(), "_classInfo", term82007);
        term82243 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        term82291 = new HashMap();
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
        args[0] = term81635;
        args[1] = term81889;
        args[2] = term82243;
        args[3] = term82291;
        args[4] = null;
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


