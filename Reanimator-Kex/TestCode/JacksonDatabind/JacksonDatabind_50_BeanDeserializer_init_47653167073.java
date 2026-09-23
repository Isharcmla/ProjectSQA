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

public class BeanDeserializer_init_47653167073 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10161;
     Object term11306;
     Object term11307;

    public BeanDeserializer_init_47653167073() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term10049 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        term10161 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        term11306 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(term11306, term11306.getClass(), "_nullFromCreator", null);
        setField(term11306, term11306.getClass(), "_classAnnotations", null);
        setField(term11306, term11306.getClass(), "_beanType", null);
        setField(term11306, term11306.getClass(), "_serializationShape", null);
        setField(term11306, term11306.getClass(), "_valueInstantiator", null);
        setField(term11306, term11306.getClass(), "_delegateDeserializer", null);
        setField(term11306, term11306.getClass(), "_arrayDelegateDeserializer", null);
        setField(term11306, term11306.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term11306, term11306.getClass(), "_nonStandardCreation", false);
        setBooleanField(term11306, term11306.getClass(), "_vanillaProcessing", false);
        setField(term11306, term11306.getClass(), "_beanProperties", null);
        setField(term11306, term11306.getClass(), "_injectables", null);
        setField(term11306, term11306.getClass(), "_anySetter", null);
        setField(term11306, term11306.getClass(), "_ignorableProps", null);
        setBooleanField(term11306, term11306.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term11306, term11306.getClass(), "_needViewProcesing", false);
        setField(term11306, term11306.getClass(), "_backRefs", null);
        setField(term11306, term11306.getClass(), "_subDeserializers", null);
        setField(term11306, term11306.getClass(), "_unwrappedPropertyHandler", null);
        setField(term11306, term11306.getClass(), "_externalTypeIdHandler", null);
        setField(term11306, term11306.getClass(), "_objectIdReader", null);
        setField(term11306, term11306.getClass(), "_valueClass", null);
        term11307 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(term11307, term11307.getClass(), "_nullFromCreator", null);
        setField(term11307, term11307.getClass(), "_classAnnotations", null);
        setField(term11307, term11307.getClass(), "_beanType", null);
        setField(term11307, term11307.getClass(), "_serializationShape", null);
        setField(term11307, term11307.getClass(), "_valueInstantiator", null);
        setField(term11307, term11307.getClass(), "_delegateDeserializer", null);
        setField(term11307, term11307.getClass(), "_arrayDelegateDeserializer", null);
        setField(term11307, term11307.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term11307, term11307.getClass(), "_nonStandardCreation", false);
        setBooleanField(term11307, term11307.getClass(), "_vanillaProcessing", false);
        setField(term11307, term11307.getClass(), "_beanProperties", null);
        setField(term11307, term11307.getClass(), "_injectables", null);
        setField(term11307, term11307.getClass(), "_anySetter", null);
        setField(term11307, term11307.getClass(), "_ignorableProps", null);
        setBooleanField(term11307, term11307.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term11307, term11307.getClass(), "_needViewProcesing", false);
        setField(term11307, term11307.getClass(), "_backRefs", null);
        setField(term11307, term11307.getClass(), "_subDeserializers", null);
        setField(term11307, term11307.getClass(), "_unwrappedPropertyHandler", null);
        setField(term11307, term11307.getClass(), "_externalTypeIdHandler", null);
        setField(term11307, term11307.getClass(), "_objectIdReader", null);
        setField(term11307, term11307.getClass(), "_valueClass", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        Object[] args = new Object[1];
        args[0] = term10161;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term11306));
        assertTrue(recursiveEquals(term10161, term11307));
    }

};


