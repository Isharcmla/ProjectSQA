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

public class BeanDeserializer_init_132869728164 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8721;
     Object term9343;
     Object term9344;

    public BeanDeserializer_init_132869728164() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term8609 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        term8721 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        term9343 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(term9343, term9343.getClass(), "_nullFromCreator", null);
        setField(term9343, term9343.getClass(), "_classAnnotations", null);
        setField(term9343, term9343.getClass(), "_beanType", null);
        setField(term9343, term9343.getClass(), "_serializationShape", null);
        setField(term9343, term9343.getClass(), "_valueInstantiator", null);
        setField(term9343, term9343.getClass(), "_delegateDeserializer", null);
        setField(term9343, term9343.getClass(), "_arrayDelegateDeserializer", null);
        setField(term9343, term9343.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term9343, term9343.getClass(), "_nonStandardCreation", false);
        setBooleanField(term9343, term9343.getClass(), "_vanillaProcessing", false);
        setField(term9343, term9343.getClass(), "_beanProperties", null);
        setField(term9343, term9343.getClass(), "_injectables", null);
        setField(term9343, term9343.getClass(), "_anySetter", null);
        setField(term9343, term9343.getClass(), "_ignorableProps", null);
        setBooleanField(term9343, term9343.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term9343, term9343.getClass(), "_needViewProcesing", false);
        setField(term9343, term9343.getClass(), "_backRefs", null);
        setField(term9343, term9343.getClass(), "_subDeserializers", null);
        setField(term9343, term9343.getClass(), "_unwrappedPropertyHandler", null);
        setField(term9343, term9343.getClass(), "_externalTypeIdHandler", null);
        setField(term9343, term9343.getClass(), "_objectIdReader", null);
        setField(term9343, term9343.getClass(), "_valueClass", null);
        term9344 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(term9344, term9344.getClass(), "_nullFromCreator", null);
        setField(term9344, term9344.getClass(), "_classAnnotations", null);
        setField(term9344, term9344.getClass(), "_beanType", null);
        setField(term9344, term9344.getClass(), "_serializationShape", null);
        setField(term9344, term9344.getClass(), "_valueInstantiator", null);
        setField(term9344, term9344.getClass(), "_delegateDeserializer", null);
        setField(term9344, term9344.getClass(), "_arrayDelegateDeserializer", null);
        setField(term9344, term9344.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term9344, term9344.getClass(), "_nonStandardCreation", false);
        setBooleanField(term9344, term9344.getClass(), "_vanillaProcessing", false);
        setField(term9344, term9344.getClass(), "_beanProperties", null);
        setField(term9344, term9344.getClass(), "_injectables", null);
        setField(term9344, term9344.getClass(), "_anySetter", null);
        setField(term9344, term9344.getClass(), "_ignorableProps", null);
        setBooleanField(term9344, term9344.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term9344, term9344.getClass(), "_needViewProcesing", false);
        setField(term9344, term9344.getClass(), "_backRefs", null);
        setField(term9344, term9344.getClass(), "_subDeserializers", null);
        setField(term9344, term9344.getClass(), "_unwrappedPropertyHandler", null);
        setField(term9344, term9344.getClass(), "_externalTypeIdHandler", null);
        setField(term9344, term9344.getClass(), "_objectIdReader", null);
        setField(term9344, term9344.getClass(), "_valueClass", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap");
        Object[] args = new Object[2];
        args[0] = term8721;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term9343));
        assertTrue(recursiveEquals(term8721, term9344));
    }

};


