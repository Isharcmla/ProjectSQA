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

public class BeanDeserializer_init_1678761736161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term76944;
     Object term78163;
     Object term78165;

    public BeanDeserializer_init_1678761736161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term76832 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        term76944 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term77036 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term76944, term76944.getClass(), "_beanType", term77036);
        term78163 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term78164 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term78163, term78163.getClass(), "_nullFromCreator", null);
        setField(term78163, term78163.getClass(), "_classAnnotations", null);
        setField(term78164, term78164.getClass(), "_keyType", null);
        setField(term78164, term78164.getClass(), "_valueType", null);
        setField(term78164, term78164.getClass(), "_superClass", null);
        setField(term78164, term78164.getClass(), "_superInterfaces", null);
        setField(term78164, term78164.getClass(), "_bindings", null);
        setField(term78164, term78164.getClass(), "_canonicalName", null);
        setField(term78164, term78164.getClass(), "_class", null);
        setIntField(term78164, term78164.getClass(), "_hash", 0);
        setField(term78164, term78164.getClass(), "_valueHandler", null);
        setField(term78164, term78164.getClass(), "_typeHandler", null);
        setBooleanField(term78164, term78164.getClass(), "_asStatic", false);
        setField(term78163, term78163.getClass(), "_beanType", term78164);
        setField(term78163, term78163.getClass(), "_serializationShape", null);
        setField(term78163, term78163.getClass(), "_valueInstantiator", null);
        setField(term78163, term78163.getClass(), "_delegateDeserializer", null);
        setField(term78163, term78163.getClass(), "_arrayDelegateDeserializer", null);
        setField(term78163, term78163.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term78163, term78163.getClass(), "_nonStandardCreation", false);
        setBooleanField(term78163, term78163.getClass(), "_vanillaProcessing", false);
        setField(term78163, term78163.getClass(), "_beanProperties", null);
        setField(term78163, term78163.getClass(), "_injectables", null);
        setField(term78163, term78163.getClass(), "_anySetter", null);
        setField(term78163, term78163.getClass(), "_ignorableProps", null);
        setBooleanField(term78163, term78163.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term78163, term78163.getClass(), "_needViewProcesing", false);
        setField(term78163, term78163.getClass(), "_backRefs", null);
        setField(term78163, term78163.getClass(), "_subDeserializers", null);
        setField(term78163, term78163.getClass(), "_unwrappedPropertyHandler", null);
        setField(term78163, term78163.getClass(), "_externalTypeIdHandler", null);
        setField(term78163, term78163.getClass(), "_objectIdReader", null);
        setField(term78163, term78163.getClass(), "_valueClass", null);
        term78165 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term78166 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term78165, term78165.getClass(), "_nullFromCreator", null);
        setField(term78165, term78165.getClass(), "_classAnnotations", null);
        setField(term78166, term78166.getClass(), "_keyType", null);
        setField(term78166, term78166.getClass(), "_valueType", null);
        setField(term78166, term78166.getClass(), "_superClass", null);
        setField(term78166, term78166.getClass(), "_superInterfaces", null);
        setField(term78166, term78166.getClass(), "_bindings", null);
        setField(term78166, term78166.getClass(), "_canonicalName", null);
        setField(term78166, term78166.getClass(), "_class", null);
        setIntField(term78166, term78166.getClass(), "_hash", 0);
        setField(term78166, term78166.getClass(), "_valueHandler", null);
        setField(term78166, term78166.getClass(), "_typeHandler", null);
        setBooleanField(term78166, term78166.getClass(), "_asStatic", false);
        setField(term78165, term78165.getClass(), "_beanType", term78166);
        setField(term78165, term78165.getClass(), "_serializationShape", null);
        setField(term78165, term78165.getClass(), "_valueInstantiator", null);
        setField(term78165, term78165.getClass(), "_delegateDeserializer", null);
        setField(term78165, term78165.getClass(), "_arrayDelegateDeserializer", null);
        setField(term78165, term78165.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term78165, term78165.getClass(), "_nonStandardCreation", false);
        setBooleanField(term78165, term78165.getClass(), "_vanillaProcessing", false);
        setField(term78165, term78165.getClass(), "_beanProperties", null);
        setField(term78165, term78165.getClass(), "_injectables", null);
        setField(term78165, term78165.getClass(), "_anySetter", null);
        setField(term78165, term78165.getClass(), "_ignorableProps", null);
        setBooleanField(term78165, term78165.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term78165, term78165.getClass(), "_needViewProcesing", false);
        setField(term78165, term78165.getClass(), "_backRefs", null);
        setField(term78165, term78165.getClass(), "_subDeserializers", null);
        setField(term78165, term78165.getClass(), "_unwrappedPropertyHandler", null);
        setField(term78165, term78165.getClass(), "_externalTypeIdHandler", null);
        setField(term78165, term78165.getClass(), "_objectIdReader", null);
        setField(term78165, term78165.getClass(), "_valueClass", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
        Object[] args = new Object[2];
        args[0] = term76944;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term78163));
        assertTrue(recursiveEquals(term76944, term78165));
    }

};


