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

public class BeanDeserializer_init_47653167059 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7860;
     Object term8450;
     Object term8451;

    public BeanDeserializer_init_47653167059() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term7748 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        term7860 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        term8450 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(term8450, term8450.getClass(), "_classAnnotations", null);
        setField(term8450, term8450.getClass(), "_beanType", null);
        setField(term8450, term8450.getClass(), "_serializationShape", null);
        setField(term8450, term8450.getClass(), "_valueInstantiator", null);
        setField(term8450, term8450.getClass(), "_delegateDeserializer", null);
        setField(term8450, term8450.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term8450, term8450.getClass(), "_nonStandardCreation", false);
        setBooleanField(term8450, term8450.getClass(), "_vanillaProcessing", false);
        setField(term8450, term8450.getClass(), "_beanProperties", null);
        setField(term8450, term8450.getClass(), "_injectables", null);
        setField(term8450, term8450.getClass(), "_anySetter", null);
        setField(term8450, term8450.getClass(), "_ignorableProps", null);
        setBooleanField(term8450, term8450.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term8450, term8450.getClass(), "_needViewProcesing", false);
        setField(term8450, term8450.getClass(), "_backRefs", null);
        setField(term8450, term8450.getClass(), "_subDeserializers", null);
        setField(term8450, term8450.getClass(), "_unwrappedPropertyHandler", null);
        setField(term8450, term8450.getClass(), "_externalTypeIdHandler", null);
        setField(term8450, term8450.getClass(), "_objectIdReader", null);
        setField(term8450, term8450.getClass(), "_valueClass", null);
        term8451 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(term8451, term8451.getClass(), "_classAnnotations", null);
        setField(term8451, term8451.getClass(), "_beanType", null);
        setField(term8451, term8451.getClass(), "_serializationShape", null);
        setField(term8451, term8451.getClass(), "_valueInstantiator", null);
        setField(term8451, term8451.getClass(), "_delegateDeserializer", null);
        setField(term8451, term8451.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term8451, term8451.getClass(), "_nonStandardCreation", false);
        setBooleanField(term8451, term8451.getClass(), "_vanillaProcessing", false);
        setField(term8451, term8451.getClass(), "_beanProperties", null);
        setField(term8451, term8451.getClass(), "_injectables", null);
        setField(term8451, term8451.getClass(), "_anySetter", null);
        setField(term8451, term8451.getClass(), "_ignorableProps", null);
        setBooleanField(term8451, term8451.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term8451, term8451.getClass(), "_needViewProcesing", false);
        setField(term8451, term8451.getClass(), "_backRefs", null);
        setField(term8451, term8451.getClass(), "_subDeserializers", null);
        setField(term8451, term8451.getClass(), "_unwrappedPropertyHandler", null);
        setField(term8451, term8451.getClass(), "_externalTypeIdHandler", null);
        setField(term8451, term8451.getClass(), "_objectIdReader", null);
        setField(term8451, term8451.getClass(), "_valueClass", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        Object[] args = new Object[1];
        args[0] = term7860;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term8450));
        assertTrue(recursiveEquals(term7860, term8451));
    }

};


