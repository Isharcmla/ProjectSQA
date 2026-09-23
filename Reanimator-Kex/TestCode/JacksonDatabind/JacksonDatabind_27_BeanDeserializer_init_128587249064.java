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

public class BeanDeserializer_init_128587249064 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8729;
     Object term9580;
     Object term9582;

    public BeanDeserializer_init_128587249064() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term8617 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        term8729 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term8829 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(term8729, term8729.getClass(), "_beanType", term8829);
        term9580 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term9581 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(term9580, term9580.getClass(), "_classAnnotations", null);
        setField(term9581, term9581.getClass(), "_keyType", null);
        setField(term9581, term9581.getClass(), "_valueType", null);
        setField(term9581, term9581.getClass(), "_canonicalName", null);
        setField(term9581, term9581.getClass(), "_class", null);
        setIntField(term9581, term9581.getClass(), "_hash", 0);
        setField(term9581, term9581.getClass(), "_valueHandler", null);
        setField(term9581, term9581.getClass(), "_typeHandler", null);
        setBooleanField(term9581, term9581.getClass(), "_asStatic", false);
        setField(term9580, term9580.getClass(), "_beanType", term9581);
        setField(term9580, term9580.getClass(), "_serializationShape", null);
        setField(term9580, term9580.getClass(), "_valueInstantiator", null);
        setField(term9580, term9580.getClass(), "_delegateDeserializer", null);
        setField(term9580, term9580.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term9580, term9580.getClass(), "_nonStandardCreation", false);
        setBooleanField(term9580, term9580.getClass(), "_vanillaProcessing", false);
        setField(term9580, term9580.getClass(), "_beanProperties", null);
        setField(term9580, term9580.getClass(), "_injectables", null);
        setField(term9580, term9580.getClass(), "_anySetter", null);
        setField(term9580, term9580.getClass(), "_ignorableProps", null);
        setBooleanField(term9580, term9580.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term9580, term9580.getClass(), "_needViewProcesing", false);
        setField(term9580, term9580.getClass(), "_backRefs", null);
        setField(term9580, term9580.getClass(), "_subDeserializers", null);
        setField(term9580, term9580.getClass(), "_unwrappedPropertyHandler", null);
        setField(term9580, term9580.getClass(), "_externalTypeIdHandler", null);
        setField(term9580, term9580.getClass(), "_objectIdReader", null);
        setField(term9580, term9580.getClass(), "_valueClass", null);
        term9582 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term9583 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(term9582, term9582.getClass(), "_classAnnotations", null);
        setField(term9583, term9583.getClass(), "_keyType", null);
        setField(term9583, term9583.getClass(), "_valueType", null);
        setField(term9583, term9583.getClass(), "_canonicalName", null);
        setField(term9583, term9583.getClass(), "_class", null);
        setIntField(term9583, term9583.getClass(), "_hash", 0);
        setField(term9583, term9583.getClass(), "_valueHandler", null);
        setField(term9583, term9583.getClass(), "_typeHandler", null);
        setBooleanField(term9583, term9583.getClass(), "_asStatic", false);
        setField(term9582, term9582.getClass(), "_beanType", term9583);
        setField(term9582, term9582.getClass(), "_serializationShape", null);
        setField(term9582, term9582.getClass(), "_valueInstantiator", null);
        setField(term9582, term9582.getClass(), "_delegateDeserializer", null);
        setField(term9582, term9582.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term9582, term9582.getClass(), "_nonStandardCreation", false);
        setBooleanField(term9582, term9582.getClass(), "_vanillaProcessing", false);
        setField(term9582, term9582.getClass(), "_beanProperties", null);
        setField(term9582, term9582.getClass(), "_injectables", null);
        setField(term9582, term9582.getClass(), "_anySetter", null);
        setField(term9582, term9582.getClass(), "_ignorableProps", null);
        setBooleanField(term9582, term9582.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term9582, term9582.getClass(), "_needViewProcesing", false);
        setField(term9582, term9582.getClass(), "_backRefs", null);
        setField(term9582, term9582.getClass(), "_subDeserializers", null);
        setField(term9582, term9582.getClass(), "_unwrappedPropertyHandler", null);
        setField(term9582, term9582.getClass(), "_externalTypeIdHandler", null);
        setField(term9582, term9582.getClass(), "_objectIdReader", null);
        setField(term9582, term9582.getClass(), "_valueClass", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term8729;
        args[1] = false;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term9580));
        assertTrue(recursiveEquals(term8729, term9582));
    }

};


