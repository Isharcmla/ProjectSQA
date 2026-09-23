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

public class BuilderBasedDeserializer_init_91151156861 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8077;
     Object term8949;
     Object term8950;

    public BuilderBasedDeserializer_init_91151156861() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8077 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        term8949 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        setField(term8949, term8949.getClass(), "_buildMethod", null);
        setField(term8949, term8949.getClass(), "_classAnnotations", null);
        setField(term8949, term8949.getClass(), "_beanType", null);
        setField(term8949, term8949.getClass(), "_serializationShape", null);
        setField(term8949, term8949.getClass(), "_valueInstantiator", null);
        setField(term8949, term8949.getClass(), "_delegateDeserializer", null);
        setField(term8949, term8949.getClass(), "_arrayDelegateDeserializer", null);
        setField(term8949, term8949.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term8949, term8949.getClass(), "_nonStandardCreation", false);
        setBooleanField(term8949, term8949.getClass(), "_vanillaProcessing", false);
        setField(term8949, term8949.getClass(), "_beanProperties", null);
        setField(term8949, term8949.getClass(), "_injectables", null);
        setField(term8949, term8949.getClass(), "_anySetter", null);
        setField(term8949, term8949.getClass(), "_ignorableProps", null);
        setBooleanField(term8949, term8949.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term8949, term8949.getClass(), "_needViewProcesing", false);
        setField(term8949, term8949.getClass(), "_backRefs", null);
        setField(term8949, term8949.getClass(), "_subDeserializers", null);
        setField(term8949, term8949.getClass(), "_unwrappedPropertyHandler", null);
        setField(term8949, term8949.getClass(), "_externalTypeIdHandler", null);
        setField(term8949, term8949.getClass(), "_objectIdReader", null);
        setField(term8949, term8949.getClass(), "_valueClass", null);
        term8950 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        setField(term8950, term8950.getClass(), "_buildMethod", null);
        setField(term8950, term8950.getClass(), "_classAnnotations", null);
        setField(term8950, term8950.getClass(), "_beanType", null);
        setField(term8950, term8950.getClass(), "_serializationShape", null);
        setField(term8950, term8950.getClass(), "_valueInstantiator", null);
        setField(term8950, term8950.getClass(), "_delegateDeserializer", null);
        setField(term8950, term8950.getClass(), "_arrayDelegateDeserializer", null);
        setField(term8950, term8950.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term8950, term8950.getClass(), "_nonStandardCreation", false);
        setBooleanField(term8950, term8950.getClass(), "_vanillaProcessing", false);
        setField(term8950, term8950.getClass(), "_beanProperties", null);
        setField(term8950, term8950.getClass(), "_injectables", null);
        setField(term8950, term8950.getClass(), "_anySetter", null);
        setField(term8950, term8950.getClass(), "_ignorableProps", null);
        setBooleanField(term8950, term8950.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term8950, term8950.getClass(), "_needViewProcesing", false);
        setField(term8950, term8950.getClass(), "_backRefs", null);
        setField(term8950, term8950.getClass(), "_subDeserializers", null);
        setField(term8950, term8950.getClass(), "_unwrappedPropertyHandler", null);
        setField(term8950, term8950.getClass(), "_externalTypeIdHandler", null);
        setField(term8950, term8950.getClass(), "_objectIdReader", null);
        setField(term8950, term8950.getClass(), "_valueClass", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap");
        Object[] args = new Object[2];
        args[0] = term8077;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term8949));
        assertTrue(recursiveEquals(term8077, term8950));
    }

};


