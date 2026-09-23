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

public class BeanDeserializer_init_128587249063 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8488;
     Object term9330;
     Object term9331;

    public BeanDeserializer_init_128587249063() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term8376 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        term8488 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        term9330 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(term9330, term9330.getClass(), "_nullFromCreator", null);
        setField(term9330, term9330.getClass(), "_classAnnotations", null);
        setField(term9330, term9330.getClass(), "_beanType", null);
        setField(term9330, term9330.getClass(), "_serializationShape", null);
        setField(term9330, term9330.getClass(), "_valueInstantiator", null);
        setField(term9330, term9330.getClass(), "_delegateDeserializer", null);
        setField(term9330, term9330.getClass(), "_arrayDelegateDeserializer", null);
        setField(term9330, term9330.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term9330, term9330.getClass(), "_nonStandardCreation", false);
        setBooleanField(term9330, term9330.getClass(), "_vanillaProcessing", false);
        setField(term9330, term9330.getClass(), "_beanProperties", null);
        setField(term9330, term9330.getClass(), "_injectables", null);
        setField(term9330, term9330.getClass(), "_anySetter", null);
        setField(term9330, term9330.getClass(), "_ignorableProps", null);
        setBooleanField(term9330, term9330.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term9330, term9330.getClass(), "_needViewProcesing", false);
        setField(term9330, term9330.getClass(), "_backRefs", null);
        setField(term9330, term9330.getClass(), "_subDeserializers", null);
        setField(term9330, term9330.getClass(), "_unwrappedPropertyHandler", null);
        setField(term9330, term9330.getClass(), "_externalTypeIdHandler", null);
        setField(term9330, term9330.getClass(), "_objectIdReader", null);
        setField(term9330, term9330.getClass(), "_valueClass", null);
        term9331 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(term9331, term9331.getClass(), "_nullFromCreator", null);
        setField(term9331, term9331.getClass(), "_classAnnotations", null);
        setField(term9331, term9331.getClass(), "_beanType", null);
        setField(term9331, term9331.getClass(), "_serializationShape", null);
        setField(term9331, term9331.getClass(), "_valueInstantiator", null);
        setField(term9331, term9331.getClass(), "_delegateDeserializer", null);
        setField(term9331, term9331.getClass(), "_arrayDelegateDeserializer", null);
        setField(term9331, term9331.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term9331, term9331.getClass(), "_nonStandardCreation", false);
        setBooleanField(term9331, term9331.getClass(), "_vanillaProcessing", false);
        setField(term9331, term9331.getClass(), "_beanProperties", null);
        setField(term9331, term9331.getClass(), "_injectables", null);
        setField(term9331, term9331.getClass(), "_anySetter", null);
        setField(term9331, term9331.getClass(), "_ignorableProps", null);
        setBooleanField(term9331, term9331.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term9331, term9331.getClass(), "_needViewProcesing", false);
        setField(term9331, term9331.getClass(), "_backRefs", null);
        setField(term9331, term9331.getClass(), "_subDeserializers", null);
        setField(term9331, term9331.getClass(), "_unwrappedPropertyHandler", null);
        setField(term9331, term9331.getClass(), "_externalTypeIdHandler", null);
        setField(term9331, term9331.getClass(), "_objectIdReader", null);
        setField(term9331, term9331.getClass(), "_valueClass", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term8488;
        args[1] = false;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term9330));
        assertTrue(recursiveEquals(term8488, term9331));
    }

};


