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

public class BeanDeserializer_init_476531670155 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term72625;
     Object term73535;
     Object term73537;

    public BeanDeserializer_init_476531670155() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term72513 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        term72625 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term72729 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setBooleanField(term72625, term72625.getClass(), "_ignoreAllUnknown", false);
        setField(term72625, term72625.getClass(), "_beanType", term72729);
        term73535 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term73536 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term73535, term73535.getClass(), "_nullFromCreator", null);
        setField(term73535, term73535.getClass(), "_classAnnotations", null);
        setField(term73536, term73536.getClass(), "_referencedType", null);
        setField(term73536, term73536.getClass(), "_anchorType", null);
        setField(term73536, term73536.getClass(), "_superClass", null);
        setField(term73536, term73536.getClass(), "_superInterfaces", null);
        setField(term73536, term73536.getClass(), "_bindings", null);
        setField(term73536, term73536.getClass(), "_canonicalName", null);
        setField(term73536, term73536.getClass(), "_class", null);
        setIntField(term73536, term73536.getClass(), "_hash", 0);
        setField(term73536, term73536.getClass(), "_valueHandler", null);
        setField(term73536, term73536.getClass(), "_typeHandler", null);
        setBooleanField(term73536, term73536.getClass(), "_asStatic", false);
        setField(term73535, term73535.getClass(), "_beanType", term73536);
        setField(term73535, term73535.getClass(), "_serializationShape", null);
        setField(term73535, term73535.getClass(), "_valueInstantiator", null);
        setField(term73535, term73535.getClass(), "_delegateDeserializer", null);
        setField(term73535, term73535.getClass(), "_arrayDelegateDeserializer", null);
        setField(term73535, term73535.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term73535, term73535.getClass(), "_nonStandardCreation", false);
        setBooleanField(term73535, term73535.getClass(), "_vanillaProcessing", false);
        setField(term73535, term73535.getClass(), "_beanProperties", null);
        setField(term73535, term73535.getClass(), "_injectables", null);
        setField(term73535, term73535.getClass(), "_anySetter", null);
        setField(term73535, term73535.getClass(), "_ignorableProps", null);
        setBooleanField(term73535, term73535.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term73535, term73535.getClass(), "_needViewProcesing", false);
        setField(term73535, term73535.getClass(), "_backRefs", null);
        setField(term73535, term73535.getClass(), "_subDeserializers", null);
        setField(term73535, term73535.getClass(), "_unwrappedPropertyHandler", null);
        setField(term73535, term73535.getClass(), "_externalTypeIdHandler", null);
        setField(term73535, term73535.getClass(), "_objectIdReader", null);
        setField(term73535, term73535.getClass(), "_valueClass", null);
        term73537 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term73538 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term73537, term73537.getClass(), "_nullFromCreator", null);
        setField(term73537, term73537.getClass(), "_classAnnotations", null);
        setField(term73538, term73538.getClass(), "_referencedType", null);
        setField(term73538, term73538.getClass(), "_anchorType", null);
        setField(term73538, term73538.getClass(), "_superClass", null);
        setField(term73538, term73538.getClass(), "_superInterfaces", null);
        setField(term73538, term73538.getClass(), "_bindings", null);
        setField(term73538, term73538.getClass(), "_canonicalName", null);
        setField(term73538, term73538.getClass(), "_class", null);
        setIntField(term73538, term73538.getClass(), "_hash", 0);
        setField(term73538, term73538.getClass(), "_valueHandler", null);
        setField(term73538, term73538.getClass(), "_typeHandler", null);
        setBooleanField(term73538, term73538.getClass(), "_asStatic", false);
        setField(term73537, term73537.getClass(), "_beanType", term73538);
        setField(term73537, term73537.getClass(), "_serializationShape", null);
        setField(term73537, term73537.getClass(), "_valueInstantiator", null);
        setField(term73537, term73537.getClass(), "_delegateDeserializer", null);
        setField(term73537, term73537.getClass(), "_arrayDelegateDeserializer", null);
        setField(term73537, term73537.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term73537, term73537.getClass(), "_nonStandardCreation", false);
        setBooleanField(term73537, term73537.getClass(), "_vanillaProcessing", false);
        setField(term73537, term73537.getClass(), "_beanProperties", null);
        setField(term73537, term73537.getClass(), "_injectables", null);
        setField(term73537, term73537.getClass(), "_anySetter", null);
        setField(term73537, term73537.getClass(), "_ignorableProps", null);
        setBooleanField(term73537, term73537.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term73537, term73537.getClass(), "_needViewProcesing", false);
        setField(term73537, term73537.getClass(), "_backRefs", null);
        setField(term73537, term73537.getClass(), "_subDeserializers", null);
        setField(term73537, term73537.getClass(), "_unwrappedPropertyHandler", null);
        setField(term73537, term73537.getClass(), "_externalTypeIdHandler", null);
        setField(term73537, term73537.getClass(), "_objectIdReader", null);
        setField(term73537, term73537.getClass(), "_valueClass", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        Object[] args = new Object[1];
        args[0] = term72625;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term73535));
        assertTrue(recursiveEquals(term72625, term73537));
    }

};


