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

public class BeanDeserializer_init_9967408963 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8389;
     Object term9560;
     Object term9561;

    public BeanDeserializer_init_9967408963() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term8277 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        term8389 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        term9560 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(term9560, term9560.getClass(), "_classAnnotations", null);
        setField(term9560, term9560.getClass(), "_beanType", null);
        setField(term9560, term9560.getClass(), "_serializationShape", null);
        setField(term9560, term9560.getClass(), "_valueInstantiator", null);
        setField(term9560, term9560.getClass(), "_delegateDeserializer", null);
        setField(term9560, term9560.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term9560, term9560.getClass(), "_nonStandardCreation", false);
        setBooleanField(term9560, term9560.getClass(), "_vanillaProcessing", false);
        setField(term9560, term9560.getClass(), "_beanProperties", null);
        setField(term9560, term9560.getClass(), "_injectables", null);
        setField(term9560, term9560.getClass(), "_anySetter", null);
        setField(term9560, term9560.getClass(), "_ignorableProps", null);
        setBooleanField(term9560, term9560.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term9560, term9560.getClass(), "_needViewProcesing", false);
        setField(term9560, term9560.getClass(), "_backRefs", null);
        setField(term9560, term9560.getClass(), "_subDeserializers", null);
        setField(term9560, term9560.getClass(), "_unwrappedPropertyHandler", null);
        setField(term9560, term9560.getClass(), "_externalTypeIdHandler", null);
        setField(term9560, term9560.getClass(), "_objectIdReader", null);
        setField(term9560, term9560.getClass(), "_valueClass", null);
        term9561 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(term9561, term9561.getClass(), "_classAnnotations", null);
        setField(term9561, term9561.getClass(), "_beanType", null);
        setField(term9561, term9561.getClass(), "_serializationShape", null);
        setField(term9561, term9561.getClass(), "_valueInstantiator", null);
        setField(term9561, term9561.getClass(), "_delegateDeserializer", null);
        setField(term9561, term9561.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term9561, term9561.getClass(), "_nonStandardCreation", false);
        setBooleanField(term9561, term9561.getClass(), "_vanillaProcessing", false);
        setField(term9561, term9561.getClass(), "_beanProperties", null);
        setField(term9561, term9561.getClass(), "_injectables", null);
        setField(term9561, term9561.getClass(), "_anySetter", null);
        setField(term9561, term9561.getClass(), "_ignorableProps", null);
        setBooleanField(term9561, term9561.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term9561, term9561.getClass(), "_needViewProcesing", false);
        setField(term9561, term9561.getClass(), "_backRefs", null);
        setField(term9561, term9561.getClass(), "_subDeserializers", null);
        setField(term9561, term9561.getClass(), "_unwrappedPropertyHandler", null);
        setField(term9561, term9561.getClass(), "_externalTypeIdHandler", null);
        setField(term9561, term9561.getClass(), "_objectIdReader", null);
        setField(term9561, term9561.getClass(), "_valueClass", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader");
        Object[] args = new Object[2];
        args[0] = term8389;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term9560));
        assertTrue(recursiveEquals(term8389, term9561));
    }

};


