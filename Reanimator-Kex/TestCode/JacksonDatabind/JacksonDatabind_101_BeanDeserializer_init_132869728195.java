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

public class BeanDeserializer_init_132869728195 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18858;
     Object term19358;
     Object term19360;

    public BeanDeserializer_init_132869728195() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term18746 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        term18858 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term18964 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term18858, term18858.getClass(), "_beanType", term18964);
        term19358 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term19359 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term19358, term19358.getClass(), "_nullFromCreator", null);
        setField(term19358, term19358.getClass(), "_currentlyTransforming", null);
        setField(term19359, term19359.getClass(), "_elementType", null);
        setField(term19359, term19359.getClass(), "_superClass", null);
        setField(term19359, term19359.getClass(), "_superInterfaces", null);
        setField(term19359, term19359.getClass(), "_bindings", null);
        setField(term19359, term19359.getClass(), "_canonicalName", null);
        setField(term19359, term19359.getClass(), "_class", null);
        setIntField(term19359, term19359.getClass(), "_hash", 0);
        setField(term19359, term19359.getClass(), "_valueHandler", null);
        setField(term19359, term19359.getClass(), "_typeHandler", null);
        setBooleanField(term19359, term19359.getClass(), "_asStatic", false);
        setField(term19358, term19358.getClass(), "_beanType", term19359);
        setField(term19358, term19358.getClass(), "_serializationShape", null);
        setField(term19358, term19358.getClass(), "_valueInstantiator", null);
        setField(term19358, term19358.getClass(), "_delegateDeserializer", null);
        setField(term19358, term19358.getClass(), "_arrayDelegateDeserializer", null);
        setField(term19358, term19358.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term19358, term19358.getClass(), "_nonStandardCreation", false);
        setBooleanField(term19358, term19358.getClass(), "_vanillaProcessing", false);
        setField(term19358, term19358.getClass(), "_beanProperties", null);
        setField(term19358, term19358.getClass(), "_injectables", null);
        setField(term19358, term19358.getClass(), "_anySetter", null);
        setField(term19358, term19358.getClass(), "_ignorableProps", null);
        setBooleanField(term19358, term19358.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term19358, term19358.getClass(), "_needViewProcesing", false);
        setField(term19358, term19358.getClass(), "_backRefs", null);
        setField(term19358, term19358.getClass(), "_subDeserializers", null);
        setField(term19358, term19358.getClass(), "_unwrappedPropertyHandler", null);
        setField(term19358, term19358.getClass(), "_externalTypeIdHandler", null);
        setField(term19358, term19358.getClass(), "_objectIdReader", null);
        setField(term19358, term19358.getClass(), "_valueClass", null);
        term19360 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term19361 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term19360, term19360.getClass(), "_nullFromCreator", null);
        setField(term19360, term19360.getClass(), "_currentlyTransforming", null);
        setField(term19361, term19361.getClass(), "_elementType", null);
        setField(term19361, term19361.getClass(), "_superClass", null);
        setField(term19361, term19361.getClass(), "_superInterfaces", null);
        setField(term19361, term19361.getClass(), "_bindings", null);
        setField(term19361, term19361.getClass(), "_canonicalName", null);
        setField(term19361, term19361.getClass(), "_class", null);
        setIntField(term19361, term19361.getClass(), "_hash", 0);
        setField(term19361, term19361.getClass(), "_valueHandler", null);
        setField(term19361, term19361.getClass(), "_typeHandler", null);
        setBooleanField(term19361, term19361.getClass(), "_asStatic", false);
        setField(term19360, term19360.getClass(), "_beanType", term19361);
        setField(term19360, term19360.getClass(), "_serializationShape", null);
        setField(term19360, term19360.getClass(), "_valueInstantiator", null);
        setField(term19360, term19360.getClass(), "_delegateDeserializer", null);
        setField(term19360, term19360.getClass(), "_arrayDelegateDeserializer", null);
        setField(term19360, term19360.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term19360, term19360.getClass(), "_nonStandardCreation", false);
        setBooleanField(term19360, term19360.getClass(), "_vanillaProcessing", false);
        setField(term19360, term19360.getClass(), "_beanProperties", null);
        setField(term19360, term19360.getClass(), "_injectables", null);
        setField(term19360, term19360.getClass(), "_anySetter", null);
        setField(term19360, term19360.getClass(), "_ignorableProps", null);
        setBooleanField(term19360, term19360.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term19360, term19360.getClass(), "_needViewProcesing", false);
        setField(term19360, term19360.getClass(), "_backRefs", null);
        setField(term19360, term19360.getClass(), "_subDeserializers", null);
        setField(term19360, term19360.getClass(), "_unwrappedPropertyHandler", null);
        setField(term19360, term19360.getClass(), "_externalTypeIdHandler", null);
        setField(term19360, term19360.getClass(), "_objectIdReader", null);
        setField(term19360, term19360.getClass(), "_valueClass", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap");
        Object[] args = new Object[2];
        args[0] = term18858;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term19358));
        assertTrue(recursiveEquals(term18858, term19360));
    }

};


