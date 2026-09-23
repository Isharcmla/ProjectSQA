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

public class BeanDeserializer_init_167876173654 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7160;
     Object term7875;
     Object term7876;

    public BeanDeserializer_init_167876173654() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term7048 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        term7160 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        term7875 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(term7875, term7875.getClass(), "_classAnnotations", null);
        setField(term7875, term7875.getClass(), "_beanType", null);
        setField(term7875, term7875.getClass(), "_serializationShape", null);
        setField(term7875, term7875.getClass(), "_valueInstantiator", null);
        setField(term7875, term7875.getClass(), "_delegateDeserializer", null);
        setField(term7875, term7875.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term7875, term7875.getClass(), "_nonStandardCreation", false);
        setBooleanField(term7875, term7875.getClass(), "_vanillaProcessing", false);
        setField(term7875, term7875.getClass(), "_beanProperties", null);
        setField(term7875, term7875.getClass(), "_injectables", null);
        setField(term7875, term7875.getClass(), "_anySetter", null);
        setField(term7875, term7875.getClass(), "_ignorableProps", null);
        setBooleanField(term7875, term7875.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term7875, term7875.getClass(), "_needViewProcesing", false);
        setField(term7875, term7875.getClass(), "_backRefs", null);
        setField(term7875, term7875.getClass(), "_subDeserializers", null);
        setField(term7875, term7875.getClass(), "_unwrappedPropertyHandler", null);
        setField(term7875, term7875.getClass(), "_externalTypeIdHandler", null);
        setField(term7875, term7875.getClass(), "_objectIdReader", null);
        setField(term7875, term7875.getClass(), "_valueClass", null);
        term7876 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(term7876, term7876.getClass(), "_classAnnotations", null);
        setField(term7876, term7876.getClass(), "_beanType", null);
        setField(term7876, term7876.getClass(), "_serializationShape", null);
        setField(term7876, term7876.getClass(), "_valueInstantiator", null);
        setField(term7876, term7876.getClass(), "_delegateDeserializer", null);
        setField(term7876, term7876.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term7876, term7876.getClass(), "_nonStandardCreation", false);
        setBooleanField(term7876, term7876.getClass(), "_vanillaProcessing", false);
        setField(term7876, term7876.getClass(), "_beanProperties", null);
        setField(term7876, term7876.getClass(), "_injectables", null);
        setField(term7876, term7876.getClass(), "_anySetter", null);
        setField(term7876, term7876.getClass(), "_ignorableProps", null);
        setBooleanField(term7876, term7876.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term7876, term7876.getClass(), "_needViewProcesing", false);
        setField(term7876, term7876.getClass(), "_backRefs", null);
        setField(term7876, term7876.getClass(), "_subDeserializers", null);
        setField(term7876, term7876.getClass(), "_unwrappedPropertyHandler", null);
        setField(term7876, term7876.getClass(), "_externalTypeIdHandler", null);
        setField(term7876, term7876.getClass(), "_objectIdReader", null);
        setField(term7876, term7876.getClass(), "_valueClass", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
        Object[] args = new Object[2];
        args[0] = term7160;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term7875));
        assertTrue(recursiveEquals(term7160, term7876));
    }

};


