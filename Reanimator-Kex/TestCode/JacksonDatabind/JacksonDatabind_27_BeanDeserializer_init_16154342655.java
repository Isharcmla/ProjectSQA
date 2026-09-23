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

public class BeanDeserializer_init_16154342655 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7393;
     Object term7888;
     Object term7889;

    public BeanDeserializer_init_16154342655() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term7281 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        term7393 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        term7888 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(term7888, term7888.getClass(), "_classAnnotations", null);
        setField(term7888, term7888.getClass(), "_beanType", null);
        setField(term7888, term7888.getClass(), "_serializationShape", null);
        setField(term7888, term7888.getClass(), "_valueInstantiator", null);
        setField(term7888, term7888.getClass(), "_delegateDeserializer", null);
        setField(term7888, term7888.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term7888, term7888.getClass(), "_nonStandardCreation", false);
        setBooleanField(term7888, term7888.getClass(), "_vanillaProcessing", false);
        setField(term7888, term7888.getClass(), "_beanProperties", null);
        setField(term7888, term7888.getClass(), "_injectables", null);
        setField(term7888, term7888.getClass(), "_anySetter", null);
        setField(term7888, term7888.getClass(), "_ignorableProps", null);
        setBooleanField(term7888, term7888.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term7888, term7888.getClass(), "_needViewProcesing", false);
        setField(term7888, term7888.getClass(), "_backRefs", null);
        setField(term7888, term7888.getClass(), "_subDeserializers", null);
        setField(term7888, term7888.getClass(), "_unwrappedPropertyHandler", null);
        setField(term7888, term7888.getClass(), "_externalTypeIdHandler", null);
        setField(term7888, term7888.getClass(), "_objectIdReader", null);
        setField(term7888, term7888.getClass(), "_valueClass", null);
        term7889 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(term7889, term7889.getClass(), "_classAnnotations", null);
        setField(term7889, term7889.getClass(), "_beanType", null);
        setField(term7889, term7889.getClass(), "_serializationShape", null);
        setField(term7889, term7889.getClass(), "_valueInstantiator", null);
        setField(term7889, term7889.getClass(), "_delegateDeserializer", null);
        setField(term7889, term7889.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term7889, term7889.getClass(), "_nonStandardCreation", false);
        setBooleanField(term7889, term7889.getClass(), "_vanillaProcessing", false);
        setField(term7889, term7889.getClass(), "_beanProperties", null);
        setField(term7889, term7889.getClass(), "_injectables", null);
        setField(term7889, term7889.getClass(), "_anySetter", null);
        setField(term7889, term7889.getClass(), "_ignorableProps", null);
        setBooleanField(term7889, term7889.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term7889, term7889.getClass(), "_needViewProcesing", false);
        setField(term7889, term7889.getClass(), "_backRefs", null);
        setField(term7889, term7889.getClass(), "_subDeserializers", null);
        setField(term7889, term7889.getClass(), "_unwrappedPropertyHandler", null);
        setField(term7889, term7889.getClass(), "_externalTypeIdHandler", null);
        setField(term7889, term7889.getClass(), "_objectIdReader", null);
        setField(term7889, term7889.getClass(), "_valueClass", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        argTypes[1] = Class.forName("java.util.HashSet");
        Object[] args = new Object[2];
        args[0] = term7393;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term7888));
        assertTrue(recursiveEquals(term7393, term7889));
    }

};


