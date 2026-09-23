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

public class BeanDeserializer_init_128587249099 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28063;
     Object term28188;
     Object term28190;

    public BeanDeserializer_init_128587249099() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term27951 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        term28063 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term28169 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term28063, term28063.getClass(), "_beanType", term28169);
        term28188 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term28189 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term28188, term28188.getClass(), "_classAnnotations", null);
        setField(term28189, term28189.getClass(), "_elementType", null);
        setField(term28189, term28189.getClass(), "_canonicalName", null);
        setField(term28189, term28189.getClass(), "_class", null);
        setIntField(term28189, term28189.getClass(), "_hash", 0);
        setField(term28189, term28189.getClass(), "_valueHandler", null);
        setField(term28189, term28189.getClass(), "_typeHandler", null);
        setBooleanField(term28189, term28189.getClass(), "_asStatic", false);
        setField(term28188, term28188.getClass(), "_beanType", term28189);
        setField(term28188, term28188.getClass(), "_serializationShape", null);
        setField(term28188, term28188.getClass(), "_valueInstantiator", null);
        setField(term28188, term28188.getClass(), "_delegateDeserializer", null);
        setField(term28188, term28188.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term28188, term28188.getClass(), "_nonStandardCreation", false);
        setBooleanField(term28188, term28188.getClass(), "_vanillaProcessing", false);
        setField(term28188, term28188.getClass(), "_beanProperties", null);
        setField(term28188, term28188.getClass(), "_injectables", null);
        setField(term28188, term28188.getClass(), "_anySetter", null);
        setField(term28188, term28188.getClass(), "_ignorableProps", null);
        setBooleanField(term28188, term28188.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term28188, term28188.getClass(), "_needViewProcesing", false);
        setField(term28188, term28188.getClass(), "_backRefs", null);
        setField(term28188, term28188.getClass(), "_subDeserializers", null);
        setField(term28188, term28188.getClass(), "_unwrappedPropertyHandler", null);
        setField(term28188, term28188.getClass(), "_externalTypeIdHandler", null);
        setField(term28188, term28188.getClass(), "_objectIdReader", null);
        setField(term28188, term28188.getClass(), "_valueClass", null);
        term28190 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term28191 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term28190, term28190.getClass(), "_classAnnotations", null);
        setField(term28191, term28191.getClass(), "_elementType", null);
        setField(term28191, term28191.getClass(), "_canonicalName", null);
        setField(term28191, term28191.getClass(), "_class", null);
        setIntField(term28191, term28191.getClass(), "_hash", 0);
        setField(term28191, term28191.getClass(), "_valueHandler", null);
        setField(term28191, term28191.getClass(), "_typeHandler", null);
        setBooleanField(term28191, term28191.getClass(), "_asStatic", false);
        setField(term28190, term28190.getClass(), "_beanType", term28191);
        setField(term28190, term28190.getClass(), "_serializationShape", null);
        setField(term28190, term28190.getClass(), "_valueInstantiator", null);
        setField(term28190, term28190.getClass(), "_delegateDeserializer", null);
        setField(term28190, term28190.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term28190, term28190.getClass(), "_nonStandardCreation", false);
        setBooleanField(term28190, term28190.getClass(), "_vanillaProcessing", false);
        setField(term28190, term28190.getClass(), "_beanProperties", null);
        setField(term28190, term28190.getClass(), "_injectables", null);
        setField(term28190, term28190.getClass(), "_anySetter", null);
        setField(term28190, term28190.getClass(), "_ignorableProps", null);
        setBooleanField(term28190, term28190.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term28190, term28190.getClass(), "_needViewProcesing", false);
        setField(term28190, term28190.getClass(), "_backRefs", null);
        setField(term28190, term28190.getClass(), "_subDeserializers", null);
        setField(term28190, term28190.getClass(), "_unwrappedPropertyHandler", null);
        setField(term28190, term28190.getClass(), "_externalTypeIdHandler", null);
        setField(term28190, term28190.getClass(), "_objectIdReader", null);
        setField(term28190, term28190.getClass(), "_valueClass", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term28063;
        args[1] = false;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term28188));
        assertTrue(recursiveEquals(term28063, term28190));
    }

};


