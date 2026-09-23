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
import java.lang.String;

public class BeanDeserializer_init_1724735634151 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term68704;
     Object term68834;
     Object term69072;

    public BeanDeserializer_init_1724735634151() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term68316 = Class.forName((String) "java.lang.invoke.InvokeDynamic");
        Object term68280 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term68440 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.ValueInstantiator$Base"));
        Object term68578 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.UnwrappedPropertyHandler"));
        setField(term68280, term68280.getClass(), "_valueClass", term68316);
        setField(term68280, term68280.getClass(), "_classAnnotations", null);
        setField(term68280, term68280.getClass(), "_beanType", null);
        setField(term68280, term68280.getClass(), "_valueInstantiator", term68440);
        setField(term68280, term68280.getClass(), "_beanProperties", null);
        setField(term68280, term68280.getClass(), "_backRefs", null);
        setField(term68280, term68280.getClass(), "_ignorableProps", null);
        setBooleanField(term68280, term68280.getClass(), "_ignoreAllUnknown", false);
        setField(term68280, term68280.getClass(), "_anySetter", null);
        setField(term68280, term68280.getClass(), "_injectables", null);
        setField(term68280, term68280.getClass(), "_objectIdReader", null);
        setField(term68280, term68280.getClass(), "_unwrappedPropertyHandler", term68578);
        term68704 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder"));
        setField(term68704, term68704.getClass(), "_valueInstantiator", null);
        setField(term68704, term68704.getClass(), "_anySetter", null);
        setField(term68704, term68704.getClass(), "_injectables", null);
        setField(term68704, term68704.getClass(), "_objectIdReader", null);
        term68834 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term68952 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        setField(term68834, term68834.getClass(), "_type", null);
        setField(term68952, term68952.getClass(), "_classAnnotations", null);
        setField(term68952, term68952.getClass(), "_annotationIntrospector", null);
        setField(term68834, term68834.getClass(), "_classInfo", term68952);
        term69072 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
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
        args[0] = term68704;
        args[1] = term68834;
        args[2] = term69072;
        args[3] = null;
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


