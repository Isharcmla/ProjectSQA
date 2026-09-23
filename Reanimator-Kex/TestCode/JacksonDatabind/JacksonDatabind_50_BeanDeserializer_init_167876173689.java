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
import java.lang.String;

public class BeanDeserializer_init_167876173689 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18069;
     Object term18176;
     Object term18177;

    public BeanDeserializer_init_167876173689() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term17841 = Class.forName((String) "java.util.stream.SpinedBuffer$OfInt$1Splitr");
        Object term17805 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term17957 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        setField(term17805, term17805.getClass(), "_valueClass", term17841);
        setField(term17805, term17805.getClass(), "_classAnnotations", term17957);
        setField(term17805, term17805.getClass(), "_beanType", null);
        setField(term17805, term17805.getClass(), "_valueInstantiator", null);
        setField(term17805, term17805.getClass(), "_delegateDeserializer", null);
        setField(term17805, term17805.getClass(), "_propertyBasedCreator", null);
        setField(term17805, term17805.getClass(), "_backRefs", null);
        setField(term17805, term17805.getClass(), "_ignorableProps", null);
        term18069 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(term18069, term18069.getClass(), "_beanType", null);
        setField(term18069, term18069.getClass(), "_classAnnotations", null);
        setField(term18069, term18069.getClass(), "_valueInstantiator", null);
        setField(term18069, term18069.getClass(), "_delegateDeserializer", null);
        setField(term18069, term18069.getClass(), "_propertyBasedCreator", null);
        setField(term18069, term18069.getClass(), "_backRefs", null);
        setField(term18069, term18069.getClass(), "_ignorableProps", null);
        setBooleanField(term18069, term18069.getClass(), "_ignoreAllUnknown", true);
        term18176 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(term18176, term18176.getClass(), "_nullFromCreator", null);
        setField(term18176, term18176.getClass(), "_classAnnotations", null);
        setField(term18176, term18176.getClass(), "_beanType", null);
        setField(term18176, term18176.getClass(), "_serializationShape", null);
        setField(term18176, term18176.getClass(), "_valueInstantiator", null);
        setField(term18176, term18176.getClass(), "_delegateDeserializer", null);
        setField(term18176, term18176.getClass(), "_arrayDelegateDeserializer", null);
        setField(term18176, term18176.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term18176, term18176.getClass(), "_nonStandardCreation", false);
        setBooleanField(term18176, term18176.getClass(), "_vanillaProcessing", false);
        setField(term18176, term18176.getClass(), "_beanProperties", null);
        setField(term18176, term18176.getClass(), "_injectables", null);
        setField(term18176, term18176.getClass(), "_anySetter", null);
        setField(term18176, term18176.getClass(), "_ignorableProps", null);
        setBooleanField(term18176, term18176.getClass(), "_ignoreAllUnknown", true);
        setBooleanField(term18176, term18176.getClass(), "_needViewProcesing", false);
        setField(term18176, term18176.getClass(), "_backRefs", null);
        setField(term18176, term18176.getClass(), "_subDeserializers", null);
        setField(term18176, term18176.getClass(), "_unwrappedPropertyHandler", null);
        setField(term18176, term18176.getClass(), "_externalTypeIdHandler", null);
        setField(term18176, term18176.getClass(), "_objectIdReader", null);
        setField(term18176, term18176.getClass(), "_valueClass", null);
        term18177 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(term18177, term18177.getClass(), "_nullFromCreator", null);
        setField(term18177, term18177.getClass(), "_classAnnotations", null);
        setField(term18177, term18177.getClass(), "_beanType", null);
        setField(term18177, term18177.getClass(), "_serializationShape", null);
        setField(term18177, term18177.getClass(), "_valueInstantiator", null);
        setField(term18177, term18177.getClass(), "_delegateDeserializer", null);
        setField(term18177, term18177.getClass(), "_arrayDelegateDeserializer", null);
        setField(term18177, term18177.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term18177, term18177.getClass(), "_nonStandardCreation", false);
        setBooleanField(term18177, term18177.getClass(), "_vanillaProcessing", false);
        setField(term18177, term18177.getClass(), "_beanProperties", null);
        setField(term18177, term18177.getClass(), "_injectables", null);
        setField(term18177, term18177.getClass(), "_anySetter", null);
        setField(term18177, term18177.getClass(), "_ignorableProps", null);
        setBooleanField(term18177, term18177.getClass(), "_ignoreAllUnknown", true);
        setBooleanField(term18177, term18177.getClass(), "_needViewProcesing", false);
        setField(term18177, term18177.getClass(), "_backRefs", null);
        setField(term18177, term18177.getClass(), "_subDeserializers", null);
        setField(term18177, term18177.getClass(), "_unwrappedPropertyHandler", null);
        setField(term18177, term18177.getClass(), "_externalTypeIdHandler", null);
        setField(term18177, term18177.getClass(), "_objectIdReader", null);
        setField(term18177, term18177.getClass(), "_valueClass", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
        Object[] args = new Object[2];
        args[0] = term18069;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term18176));
        assertTrue(recursiveEquals(term18069, term18177));
    }

};


