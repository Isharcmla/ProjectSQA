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

public class BeanDeserializer_init_1328697281125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28451;
     Object term28575;
     Object term28577;

    public BeanDeserializer_init_1328697281125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term28339 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        term28451 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term28557 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term28451, term28451.getClass(), "_beanType", term28557);
        term28575 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term28576 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term28575, term28575.getClass(), "_nullFromCreator", null);
        setField(term28575, term28575.getClass(), "_currentlyTransforming", null);
        setField(term28576, term28576.getClass(), "_elementType", null);
        setField(term28576, term28576.getClass(), "_superClass", null);
        setField(term28576, term28576.getClass(), "_superInterfaces", null);
        setField(term28576, term28576.getClass(), "_bindings", null);
        setField(term28576, term28576.getClass(), "_canonicalName", null);
        setField(term28576, term28576.getClass(), "_class", null);
        setIntField(term28576, term28576.getClass(), "_hash", 0);
        setField(term28576, term28576.getClass(), "_valueHandler", null);
        setField(term28576, term28576.getClass(), "_typeHandler", null);
        setBooleanField(term28576, term28576.getClass(), "_asStatic", false);
        setField(term28575, term28575.getClass(), "_beanType", term28576);
        setField(term28575, term28575.getClass(), "_serializationShape", null);
        setField(term28575, term28575.getClass(), "_valueInstantiator", null);
        setField(term28575, term28575.getClass(), "_delegateDeserializer", null);
        setField(term28575, term28575.getClass(), "_arrayDelegateDeserializer", null);
        setField(term28575, term28575.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term28575, term28575.getClass(), "_nonStandardCreation", false);
        setBooleanField(term28575, term28575.getClass(), "_vanillaProcessing", false);
        setField(term28575, term28575.getClass(), "_beanProperties", null);
        setField(term28575, term28575.getClass(), "_injectables", null);
        setField(term28575, term28575.getClass(), "_anySetter", null);
        setField(term28575, term28575.getClass(), "_ignorableProps", null);
        setBooleanField(term28575, term28575.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term28575, term28575.getClass(), "_needViewProcesing", false);
        setField(term28575, term28575.getClass(), "_backRefs", null);
        setField(term28575, term28575.getClass(), "_subDeserializers", null);
        setField(term28575, term28575.getClass(), "_unwrappedPropertyHandler", null);
        setField(term28575, term28575.getClass(), "_externalTypeIdHandler", null);
        setField(term28575, term28575.getClass(), "_objectIdReader", null);
        setField(term28575, term28575.getClass(), "_valueClass", null);
        term28577 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term28578 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term28577, term28577.getClass(), "_nullFromCreator", null);
        setField(term28577, term28577.getClass(), "_currentlyTransforming", null);
        setField(term28578, term28578.getClass(), "_elementType", null);
        setField(term28578, term28578.getClass(), "_superClass", null);
        setField(term28578, term28578.getClass(), "_superInterfaces", null);
        setField(term28578, term28578.getClass(), "_bindings", null);
        setField(term28578, term28578.getClass(), "_canonicalName", null);
        setField(term28578, term28578.getClass(), "_class", null);
        setIntField(term28578, term28578.getClass(), "_hash", 0);
        setField(term28578, term28578.getClass(), "_valueHandler", null);
        setField(term28578, term28578.getClass(), "_typeHandler", null);
        setBooleanField(term28578, term28578.getClass(), "_asStatic", false);
        setField(term28577, term28577.getClass(), "_beanType", term28578);
        setField(term28577, term28577.getClass(), "_serializationShape", null);
        setField(term28577, term28577.getClass(), "_valueInstantiator", null);
        setField(term28577, term28577.getClass(), "_delegateDeserializer", null);
        setField(term28577, term28577.getClass(), "_arrayDelegateDeserializer", null);
        setField(term28577, term28577.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term28577, term28577.getClass(), "_nonStandardCreation", false);
        setBooleanField(term28577, term28577.getClass(), "_vanillaProcessing", false);
        setField(term28577, term28577.getClass(), "_beanProperties", null);
        setField(term28577, term28577.getClass(), "_injectables", null);
        setField(term28577, term28577.getClass(), "_anySetter", null);
        setField(term28577, term28577.getClass(), "_ignorableProps", null);
        setBooleanField(term28577, term28577.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term28577, term28577.getClass(), "_needViewProcesing", false);
        setField(term28577, term28577.getClass(), "_backRefs", null);
        setField(term28577, term28577.getClass(), "_subDeserializers", null);
        setField(term28577, term28577.getClass(), "_unwrappedPropertyHandler", null);
        setField(term28577, term28577.getClass(), "_externalTypeIdHandler", null);
        setField(term28577, term28577.getClass(), "_objectIdReader", null);
        setField(term28577, term28577.getClass(), "_valueClass", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap");
        Object[] args = new Object[2];
        args[0] = term28451;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term28575));
        assertTrue(recursiveEquals(term28451, term28577));
    }

};


