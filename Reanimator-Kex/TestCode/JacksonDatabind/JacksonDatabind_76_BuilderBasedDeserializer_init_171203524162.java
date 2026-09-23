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

public class BuilderBasedDeserializer_init_171203524162 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8275;
     Object term9153;
     Object term9154;

    public BuilderBasedDeserializer_init_171203524162() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8275 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        term9153 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        setField(term9153, term9153.getClass(), "_buildMethod", null);
        setField(term9153, term9153.getClass(), "_classAnnotations", null);
        setField(term9153, term9153.getClass(), "_beanType", null);
        setField(term9153, term9153.getClass(), "_serializationShape", null);
        setField(term9153, term9153.getClass(), "_valueInstantiator", null);
        setField(term9153, term9153.getClass(), "_delegateDeserializer", null);
        setField(term9153, term9153.getClass(), "_arrayDelegateDeserializer", null);
        setField(term9153, term9153.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term9153, term9153.getClass(), "_nonStandardCreation", false);
        setBooleanField(term9153, term9153.getClass(), "_vanillaProcessing", false);
        setField(term9153, term9153.getClass(), "_beanProperties", null);
        setField(term9153, term9153.getClass(), "_injectables", null);
        setField(term9153, term9153.getClass(), "_anySetter", null);
        setField(term9153, term9153.getClass(), "_ignorableProps", null);
        setBooleanField(term9153, term9153.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term9153, term9153.getClass(), "_needViewProcesing", false);
        setField(term9153, term9153.getClass(), "_backRefs", null);
        setField(term9153, term9153.getClass(), "_subDeserializers", null);
        setField(term9153, term9153.getClass(), "_unwrappedPropertyHandler", null);
        setField(term9153, term9153.getClass(), "_externalTypeIdHandler", null);
        setField(term9153, term9153.getClass(), "_objectIdReader", null);
        setField(term9153, term9153.getClass(), "_valueClass", null);
        term9154 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        setField(term9154, term9154.getClass(), "_buildMethod", null);
        setField(term9154, term9154.getClass(), "_classAnnotations", null);
        setField(term9154, term9154.getClass(), "_beanType", null);
        setField(term9154, term9154.getClass(), "_serializationShape", null);
        setField(term9154, term9154.getClass(), "_valueInstantiator", null);
        setField(term9154, term9154.getClass(), "_delegateDeserializer", null);
        setField(term9154, term9154.getClass(), "_arrayDelegateDeserializer", null);
        setField(term9154, term9154.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term9154, term9154.getClass(), "_nonStandardCreation", false);
        setBooleanField(term9154, term9154.getClass(), "_vanillaProcessing", false);
        setField(term9154, term9154.getClass(), "_beanProperties", null);
        setField(term9154, term9154.getClass(), "_injectables", null);
        setField(term9154, term9154.getClass(), "_anySetter", null);
        setField(term9154, term9154.getClass(), "_ignorableProps", null);
        setBooleanField(term9154, term9154.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term9154, term9154.getClass(), "_needViewProcesing", false);
        setField(term9154, term9154.getClass(), "_backRefs", null);
        setField(term9154, term9154.getClass(), "_subDeserializers", null);
        setField(term9154, term9154.getClass(), "_unwrappedPropertyHandler", null);
        setField(term9154, term9154.getClass(), "_externalTypeIdHandler", null);
        setField(term9154, term9154.getClass(), "_objectIdReader", null);
        setField(term9154, term9154.getClass(), "_valueClass", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer");
        Object[] args = new Object[1];
        args[0] = term8275;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term9153));
        assertTrue(recursiveEquals(term8275, term9154));
    }

};


