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

public class BuilderBasedDeserializer_init_170305820365 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9746;
     Object term9759;
     Object term9760;

    public BuilderBasedDeserializer_init_170305820365() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9746 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        term9759 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        setField(term9759, term9759.getClass(), "_buildMethod", null);
        setField(term9759, term9759.getClass(), "_classAnnotations", null);
        setField(term9759, term9759.getClass(), "_beanType", null);
        setField(term9759, term9759.getClass(), "_serializationShape", null);
        setField(term9759, term9759.getClass(), "_valueInstantiator", null);
        setField(term9759, term9759.getClass(), "_delegateDeserializer", null);
        setField(term9759, term9759.getClass(), "_arrayDelegateDeserializer", null);
        setField(term9759, term9759.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term9759, term9759.getClass(), "_nonStandardCreation", false);
        setBooleanField(term9759, term9759.getClass(), "_vanillaProcessing", false);
        setField(term9759, term9759.getClass(), "_beanProperties", null);
        setField(term9759, term9759.getClass(), "_injectables", null);
        setField(term9759, term9759.getClass(), "_anySetter", null);
        setField(term9759, term9759.getClass(), "_ignorableProps", null);
        setBooleanField(term9759, term9759.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term9759, term9759.getClass(), "_needViewProcesing", false);
        setField(term9759, term9759.getClass(), "_backRefs", null);
        setField(term9759, term9759.getClass(), "_subDeserializers", null);
        setField(term9759, term9759.getClass(), "_unwrappedPropertyHandler", null);
        setField(term9759, term9759.getClass(), "_externalTypeIdHandler", null);
        setField(term9759, term9759.getClass(), "_objectIdReader", null);
        setField(term9759, term9759.getClass(), "_valueClass", null);
        term9760 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        setField(term9760, term9760.getClass(), "_buildMethod", null);
        setField(term9760, term9760.getClass(), "_classAnnotations", null);
        setField(term9760, term9760.getClass(), "_beanType", null);
        setField(term9760, term9760.getClass(), "_serializationShape", null);
        setField(term9760, term9760.getClass(), "_valueInstantiator", null);
        setField(term9760, term9760.getClass(), "_delegateDeserializer", null);
        setField(term9760, term9760.getClass(), "_arrayDelegateDeserializer", null);
        setField(term9760, term9760.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term9760, term9760.getClass(), "_nonStandardCreation", false);
        setBooleanField(term9760, term9760.getClass(), "_vanillaProcessing", false);
        setField(term9760, term9760.getClass(), "_beanProperties", null);
        setField(term9760, term9760.getClass(), "_injectables", null);
        setField(term9760, term9760.getClass(), "_anySetter", null);
        setField(term9760, term9760.getClass(), "_ignorableProps", null);
        setBooleanField(term9760, term9760.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term9760, term9760.getClass(), "_needViewProcesing", false);
        setField(term9760, term9760.getClass(), "_backRefs", null);
        setField(term9760, term9760.getClass(), "_subDeserializers", null);
        setField(term9760, term9760.getClass(), "_unwrappedPropertyHandler", null);
        setField(term9760, term9760.getClass(), "_externalTypeIdHandler", null);
        setField(term9760, term9760.getClass(), "_objectIdReader", null);
        setField(term9760, term9760.getClass(), "_valueClass", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term9746;
        args[1] = false;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term9759));
        assertTrue(recursiveEquals(term9746, term9760));
    }

};


