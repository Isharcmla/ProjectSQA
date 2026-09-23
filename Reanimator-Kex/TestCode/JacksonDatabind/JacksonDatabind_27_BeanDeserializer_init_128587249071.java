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

public class BeanDeserializer_init_128587249071 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12153;
     Object term12264;
     Object term12266;

    public BeanDeserializer_init_128587249071() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term12041 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        term12153 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term12245 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term12153, term12153.getClass(), "_beanType", term12245);
        term12264 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term12265 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term12264, term12264.getClass(), "_classAnnotations", null);
        setField(term12265, term12265.getClass(), "_keyType", null);
        setField(term12265, term12265.getClass(), "_valueType", null);
        setField(term12265, term12265.getClass(), "_canonicalName", null);
        setField(term12265, term12265.getClass(), "_class", null);
        setIntField(term12265, term12265.getClass(), "_hash", 0);
        setField(term12265, term12265.getClass(), "_valueHandler", null);
        setField(term12265, term12265.getClass(), "_typeHandler", null);
        setBooleanField(term12265, term12265.getClass(), "_asStatic", false);
        setField(term12264, term12264.getClass(), "_beanType", term12265);
        setField(term12264, term12264.getClass(), "_serializationShape", null);
        setField(term12264, term12264.getClass(), "_valueInstantiator", null);
        setField(term12264, term12264.getClass(), "_delegateDeserializer", null);
        setField(term12264, term12264.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term12264, term12264.getClass(), "_nonStandardCreation", false);
        setBooleanField(term12264, term12264.getClass(), "_vanillaProcessing", false);
        setField(term12264, term12264.getClass(), "_beanProperties", null);
        setField(term12264, term12264.getClass(), "_injectables", null);
        setField(term12264, term12264.getClass(), "_anySetter", null);
        setField(term12264, term12264.getClass(), "_ignorableProps", null);
        setBooleanField(term12264, term12264.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term12264, term12264.getClass(), "_needViewProcesing", false);
        setField(term12264, term12264.getClass(), "_backRefs", null);
        setField(term12264, term12264.getClass(), "_subDeserializers", null);
        setField(term12264, term12264.getClass(), "_unwrappedPropertyHandler", null);
        setField(term12264, term12264.getClass(), "_externalTypeIdHandler", null);
        setField(term12264, term12264.getClass(), "_objectIdReader", null);
        setField(term12264, term12264.getClass(), "_valueClass", null);
        term12266 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term12267 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term12266, term12266.getClass(), "_classAnnotations", null);
        setField(term12267, term12267.getClass(), "_keyType", null);
        setField(term12267, term12267.getClass(), "_valueType", null);
        setField(term12267, term12267.getClass(), "_canonicalName", null);
        setField(term12267, term12267.getClass(), "_class", null);
        setIntField(term12267, term12267.getClass(), "_hash", 0);
        setField(term12267, term12267.getClass(), "_valueHandler", null);
        setField(term12267, term12267.getClass(), "_typeHandler", null);
        setBooleanField(term12267, term12267.getClass(), "_asStatic", false);
        setField(term12266, term12266.getClass(), "_beanType", term12267);
        setField(term12266, term12266.getClass(), "_serializationShape", null);
        setField(term12266, term12266.getClass(), "_valueInstantiator", null);
        setField(term12266, term12266.getClass(), "_delegateDeserializer", null);
        setField(term12266, term12266.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term12266, term12266.getClass(), "_nonStandardCreation", false);
        setBooleanField(term12266, term12266.getClass(), "_vanillaProcessing", false);
        setField(term12266, term12266.getClass(), "_beanProperties", null);
        setField(term12266, term12266.getClass(), "_injectables", null);
        setField(term12266, term12266.getClass(), "_anySetter", null);
        setField(term12266, term12266.getClass(), "_ignorableProps", null);
        setBooleanField(term12266, term12266.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term12266, term12266.getClass(), "_needViewProcesing", false);
        setField(term12266, term12266.getClass(), "_backRefs", null);
        setField(term12266, term12266.getClass(), "_subDeserializers", null);
        setField(term12266, term12266.getClass(), "_unwrappedPropertyHandler", null);
        setField(term12266, term12266.getClass(), "_externalTypeIdHandler", null);
        setField(term12266, term12266.getClass(), "_objectIdReader", null);
        setField(term12266, term12266.getClass(), "_valueClass", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term12153;
        args[1] = false;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term12264));
        assertTrue(recursiveEquals(term12153, term12266));
    }

};


