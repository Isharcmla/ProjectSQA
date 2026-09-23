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

public class BeanDeserializer_init_476531670175 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term86054;
     Object term86261;
     Object term86263;

    public BeanDeserializer_init_476531670175() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term85942 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        term86054 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term86160 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setBooleanField(term86054, term86054.getClass(), "_ignoreAllUnknown", false);
        setField(term86054, term86054.getClass(), "_beanType", term86160);
        term86261 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term86262 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term86261, term86261.getClass(), "_nullFromCreator", null);
        setField(term86261, term86261.getClass(), "_classAnnotations", null);
        setField(term86262, term86262.getClass(), "_elementType", null);
        setField(term86262, term86262.getClass(), "_superClass", null);
        setField(term86262, term86262.getClass(), "_superInterfaces", null);
        setField(term86262, term86262.getClass(), "_bindings", null);
        setField(term86262, term86262.getClass(), "_canonicalName", null);
        setField(term86262, term86262.getClass(), "_class", null);
        setIntField(term86262, term86262.getClass(), "_hash", 0);
        setField(term86262, term86262.getClass(), "_valueHandler", null);
        setField(term86262, term86262.getClass(), "_typeHandler", null);
        setBooleanField(term86262, term86262.getClass(), "_asStatic", false);
        setField(term86261, term86261.getClass(), "_beanType", term86262);
        setField(term86261, term86261.getClass(), "_serializationShape", null);
        setField(term86261, term86261.getClass(), "_valueInstantiator", null);
        setField(term86261, term86261.getClass(), "_delegateDeserializer", null);
        setField(term86261, term86261.getClass(), "_arrayDelegateDeserializer", null);
        setField(term86261, term86261.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term86261, term86261.getClass(), "_nonStandardCreation", false);
        setBooleanField(term86261, term86261.getClass(), "_vanillaProcessing", false);
        setField(term86261, term86261.getClass(), "_beanProperties", null);
        setField(term86261, term86261.getClass(), "_injectables", null);
        setField(term86261, term86261.getClass(), "_anySetter", null);
        setField(term86261, term86261.getClass(), "_ignorableProps", null);
        setBooleanField(term86261, term86261.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term86261, term86261.getClass(), "_needViewProcesing", false);
        setField(term86261, term86261.getClass(), "_backRefs", null);
        setField(term86261, term86261.getClass(), "_subDeserializers", null);
        setField(term86261, term86261.getClass(), "_unwrappedPropertyHandler", null);
        setField(term86261, term86261.getClass(), "_externalTypeIdHandler", null);
        setField(term86261, term86261.getClass(), "_objectIdReader", null);
        setField(term86261, term86261.getClass(), "_valueClass", null);
        term86263 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term86264 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term86263, term86263.getClass(), "_nullFromCreator", null);
        setField(term86263, term86263.getClass(), "_classAnnotations", null);
        setField(term86264, term86264.getClass(), "_elementType", null);
        setField(term86264, term86264.getClass(), "_superClass", null);
        setField(term86264, term86264.getClass(), "_superInterfaces", null);
        setField(term86264, term86264.getClass(), "_bindings", null);
        setField(term86264, term86264.getClass(), "_canonicalName", null);
        setField(term86264, term86264.getClass(), "_class", null);
        setIntField(term86264, term86264.getClass(), "_hash", 0);
        setField(term86264, term86264.getClass(), "_valueHandler", null);
        setField(term86264, term86264.getClass(), "_typeHandler", null);
        setBooleanField(term86264, term86264.getClass(), "_asStatic", false);
        setField(term86263, term86263.getClass(), "_beanType", term86264);
        setField(term86263, term86263.getClass(), "_serializationShape", null);
        setField(term86263, term86263.getClass(), "_valueInstantiator", null);
        setField(term86263, term86263.getClass(), "_delegateDeserializer", null);
        setField(term86263, term86263.getClass(), "_arrayDelegateDeserializer", null);
        setField(term86263, term86263.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term86263, term86263.getClass(), "_nonStandardCreation", false);
        setBooleanField(term86263, term86263.getClass(), "_vanillaProcessing", false);
        setField(term86263, term86263.getClass(), "_beanProperties", null);
        setField(term86263, term86263.getClass(), "_injectables", null);
        setField(term86263, term86263.getClass(), "_anySetter", null);
        setField(term86263, term86263.getClass(), "_ignorableProps", null);
        setBooleanField(term86263, term86263.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term86263, term86263.getClass(), "_needViewProcesing", false);
        setField(term86263, term86263.getClass(), "_backRefs", null);
        setField(term86263, term86263.getClass(), "_subDeserializers", null);
        setField(term86263, term86263.getClass(), "_unwrappedPropertyHandler", null);
        setField(term86263, term86263.getClass(), "_externalTypeIdHandler", null);
        setField(term86263, term86263.getClass(), "_objectIdReader", null);
        setField(term86263, term86263.getClass(), "_valueClass", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        Object[] args = new Object[1];
        args[0] = term86054;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term86261));
        assertTrue(recursiveEquals(term86054, term86263));
    }

};


