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

public class BeanDeserializer_init_99674089127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38299;
     Object term38840;
     Object term38842;

    public BeanDeserializer_init_99674089127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term38187 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        term38299 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term38405 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term38299, term38299.getClass(), "_beanType", term38405);
        term38840 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term38841 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term38840, term38840.getClass(), "_classAnnotations", null);
        setField(term38841, term38841.getClass(), "_elementType", null);
        setField(term38841, term38841.getClass(), "_canonicalName", null);
        setField(term38841, term38841.getClass(), "_class", null);
        setIntField(term38841, term38841.getClass(), "_hash", 0);
        setField(term38841, term38841.getClass(), "_valueHandler", null);
        setField(term38841, term38841.getClass(), "_typeHandler", null);
        setBooleanField(term38841, term38841.getClass(), "_asStatic", false);
        setField(term38840, term38840.getClass(), "_beanType", term38841);
        setField(term38840, term38840.getClass(), "_serializationShape", null);
        setField(term38840, term38840.getClass(), "_valueInstantiator", null);
        setField(term38840, term38840.getClass(), "_delegateDeserializer", null);
        setField(term38840, term38840.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term38840, term38840.getClass(), "_nonStandardCreation", false);
        setBooleanField(term38840, term38840.getClass(), "_vanillaProcessing", false);
        setField(term38840, term38840.getClass(), "_beanProperties", null);
        setField(term38840, term38840.getClass(), "_injectables", null);
        setField(term38840, term38840.getClass(), "_anySetter", null);
        setField(term38840, term38840.getClass(), "_ignorableProps", null);
        setBooleanField(term38840, term38840.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term38840, term38840.getClass(), "_needViewProcesing", false);
        setField(term38840, term38840.getClass(), "_backRefs", null);
        setField(term38840, term38840.getClass(), "_subDeserializers", null);
        setField(term38840, term38840.getClass(), "_unwrappedPropertyHandler", null);
        setField(term38840, term38840.getClass(), "_externalTypeIdHandler", null);
        setField(term38840, term38840.getClass(), "_objectIdReader", null);
        setField(term38840, term38840.getClass(), "_valueClass", null);
        term38842 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term38843 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term38842, term38842.getClass(), "_classAnnotations", null);
        setField(term38843, term38843.getClass(), "_elementType", null);
        setField(term38843, term38843.getClass(), "_canonicalName", null);
        setField(term38843, term38843.getClass(), "_class", null);
        setIntField(term38843, term38843.getClass(), "_hash", 0);
        setField(term38843, term38843.getClass(), "_valueHandler", null);
        setField(term38843, term38843.getClass(), "_typeHandler", null);
        setBooleanField(term38843, term38843.getClass(), "_asStatic", false);
        setField(term38842, term38842.getClass(), "_beanType", term38843);
        setField(term38842, term38842.getClass(), "_serializationShape", null);
        setField(term38842, term38842.getClass(), "_valueInstantiator", null);
        setField(term38842, term38842.getClass(), "_delegateDeserializer", null);
        setField(term38842, term38842.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term38842, term38842.getClass(), "_nonStandardCreation", false);
        setBooleanField(term38842, term38842.getClass(), "_vanillaProcessing", false);
        setField(term38842, term38842.getClass(), "_beanProperties", null);
        setField(term38842, term38842.getClass(), "_injectables", null);
        setField(term38842, term38842.getClass(), "_anySetter", null);
        setField(term38842, term38842.getClass(), "_ignorableProps", null);
        setBooleanField(term38842, term38842.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term38842, term38842.getClass(), "_needViewProcesing", false);
        setField(term38842, term38842.getClass(), "_backRefs", null);
        setField(term38842, term38842.getClass(), "_subDeserializers", null);
        setField(term38842, term38842.getClass(), "_unwrappedPropertyHandler", null);
        setField(term38842, term38842.getClass(), "_externalTypeIdHandler", null);
        setField(term38842, term38842.getClass(), "_objectIdReader", null);
        setField(term38842, term38842.getClass(), "_valueClass", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader");
        Object[] args = new Object[2];
        args[0] = term38299;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term38840));
        assertTrue(recursiveEquals(term38299, term38842));
    }

};


