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
import static com.fasterxml.jackson.databind.deser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.fasterxml.jackson.databind.deser.EqualityUtils.*;
import java.lang.Object;

public class BeanDeserializer_init_128587249056 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7627;
     Object term7902;
     Object term7903;

    public BeanDeserializer_init_128587249056() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term7515 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        term7627 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        term7902 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(term7902, term7902.getClass(), "_classAnnotations", null);
        setField(term7902, term7902.getClass(), "_beanType", null);
        setField(term7902, term7902.getClass(), "_serializationShape", null);
        setField(term7902, term7902.getClass(), "_valueInstantiator", null);
        setField(term7902, term7902.getClass(), "_delegateDeserializer", null);
        setField(term7902, term7902.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term7902, term7902.getClass(), "_nonStandardCreation", false);
        setBooleanField(term7902, term7902.getClass(), "_vanillaProcessing", false);
        setField(term7902, term7902.getClass(), "_beanProperties", null);
        setField(term7902, term7902.getClass(), "_injectables", null);
        setField(term7902, term7902.getClass(), "_anySetter", null);
        setField(term7902, term7902.getClass(), "_ignorableProps", null);
        setBooleanField(term7902, term7902.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term7902, term7902.getClass(), "_needViewProcesing", false);
        setField(term7902, term7902.getClass(), "_backRefs", null);
        setField(term7902, term7902.getClass(), "_subDeserializers", null);
        setField(term7902, term7902.getClass(), "_unwrappedPropertyHandler", null);
        setField(term7902, term7902.getClass(), "_externalTypeIdHandler", null);
        setField(term7902, term7902.getClass(), "_objectIdReader", null);
        setField(term7902, term7902.getClass(), "_valueClass", null);
        term7903 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(term7903, term7903.getClass(), "_classAnnotations", null);
        setField(term7903, term7903.getClass(), "_beanType", null);
        setField(term7903, term7903.getClass(), "_serializationShape", null);
        setField(term7903, term7903.getClass(), "_valueInstantiator", null);
        setField(term7903, term7903.getClass(), "_delegateDeserializer", null);
        setField(term7903, term7903.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term7903, term7903.getClass(), "_nonStandardCreation", false);
        setBooleanField(term7903, term7903.getClass(), "_vanillaProcessing", false);
        setField(term7903, term7903.getClass(), "_beanProperties", null);
        setField(term7903, term7903.getClass(), "_injectables", null);
        setField(term7903, term7903.getClass(), "_anySetter", null);
        setField(term7903, term7903.getClass(), "_ignorableProps", null);
        setBooleanField(term7903, term7903.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term7903, term7903.getClass(), "_needViewProcesing", false);
        setField(term7903, term7903.getClass(), "_backRefs", null);
        setField(term7903, term7903.getClass(), "_subDeserializers", null);
        setField(term7903, term7903.getClass(), "_unwrappedPropertyHandler", null);
        setField(term7903, term7903.getClass(), "_externalTypeIdHandler", null);
        setField(term7903, term7903.getClass(), "_objectIdReader", null);
        setField(term7903, term7903.getClass(), "_valueClass", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term7627;
        args[1] = false;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term7902));
        assertTrue(recursiveEquals(term7627, term7903));
    }

};


