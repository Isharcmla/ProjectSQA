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

public class BuilderBasedDeserializer_init_911511568116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32281;
     Object term33498;
     Object term33500;

    public BuilderBasedDeserializer_init_911511568116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32281 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        Object term32329 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term32281, term32281.getClass(), "_beanType", term32329);
        term33498 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        Object term33499 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term33498, term33498.getClass(), "_buildMethod", null);
        setField(term33498, term33498.getClass(), "_classAnnotations", null);
        setField(term33499, term33499.getClass(), "_componentType", null);
        setField(term33499, term33499.getClass(), "_emptyArray", null);
        setField(term33499, term33499.getClass(), "_superClass", null);
        setField(term33499, term33499.getClass(), "_superInterfaces", null);
        setField(term33499, term33499.getClass(), "_bindings", null);
        setField(term33499, term33499.getClass(), "_canonicalName", null);
        setField(term33499, term33499.getClass(), "_class", null);
        setIntField(term33499, term33499.getClass(), "_hash", 0);
        setField(term33499, term33499.getClass(), "_valueHandler", null);
        setField(term33499, term33499.getClass(), "_typeHandler", null);
        setBooleanField(term33499, term33499.getClass(), "_asStatic", false);
        setField(term33498, term33498.getClass(), "_beanType", term33499);
        setField(term33498, term33498.getClass(), "_serializationShape", null);
        setField(term33498, term33498.getClass(), "_valueInstantiator", null);
        setField(term33498, term33498.getClass(), "_delegateDeserializer", null);
        setField(term33498, term33498.getClass(), "_arrayDelegateDeserializer", null);
        setField(term33498, term33498.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term33498, term33498.getClass(), "_nonStandardCreation", false);
        setBooleanField(term33498, term33498.getClass(), "_vanillaProcessing", false);
        setField(term33498, term33498.getClass(), "_beanProperties", null);
        setField(term33498, term33498.getClass(), "_injectables", null);
        setField(term33498, term33498.getClass(), "_anySetter", null);
        setField(term33498, term33498.getClass(), "_ignorableProps", null);
        setBooleanField(term33498, term33498.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term33498, term33498.getClass(), "_needViewProcesing", false);
        setField(term33498, term33498.getClass(), "_backRefs", null);
        setField(term33498, term33498.getClass(), "_subDeserializers", null);
        setField(term33498, term33498.getClass(), "_unwrappedPropertyHandler", null);
        setField(term33498, term33498.getClass(), "_externalTypeIdHandler", null);
        setField(term33498, term33498.getClass(), "_objectIdReader", null);
        setField(term33498, term33498.getClass(), "_valueClass", null);
        term33500 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        Object term33501 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term33500, term33500.getClass(), "_buildMethod", null);
        setField(term33500, term33500.getClass(), "_classAnnotations", null);
        setField(term33501, term33501.getClass(), "_componentType", null);
        setField(term33501, term33501.getClass(), "_emptyArray", null);
        setField(term33501, term33501.getClass(), "_superClass", null);
        setField(term33501, term33501.getClass(), "_superInterfaces", null);
        setField(term33501, term33501.getClass(), "_bindings", null);
        setField(term33501, term33501.getClass(), "_canonicalName", null);
        setField(term33501, term33501.getClass(), "_class", null);
        setIntField(term33501, term33501.getClass(), "_hash", 0);
        setField(term33501, term33501.getClass(), "_valueHandler", null);
        setField(term33501, term33501.getClass(), "_typeHandler", null);
        setBooleanField(term33501, term33501.getClass(), "_asStatic", false);
        setField(term33500, term33500.getClass(), "_beanType", term33501);
        setField(term33500, term33500.getClass(), "_serializationShape", null);
        setField(term33500, term33500.getClass(), "_valueInstantiator", null);
        setField(term33500, term33500.getClass(), "_delegateDeserializer", null);
        setField(term33500, term33500.getClass(), "_arrayDelegateDeserializer", null);
        setField(term33500, term33500.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term33500, term33500.getClass(), "_nonStandardCreation", false);
        setBooleanField(term33500, term33500.getClass(), "_vanillaProcessing", false);
        setField(term33500, term33500.getClass(), "_beanProperties", null);
        setField(term33500, term33500.getClass(), "_injectables", null);
        setField(term33500, term33500.getClass(), "_anySetter", null);
        setField(term33500, term33500.getClass(), "_ignorableProps", null);
        setBooleanField(term33500, term33500.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term33500, term33500.getClass(), "_needViewProcesing", false);
        setField(term33500, term33500.getClass(), "_backRefs", null);
        setField(term33500, term33500.getClass(), "_subDeserializers", null);
        setField(term33500, term33500.getClass(), "_unwrappedPropertyHandler", null);
        setField(term33500, term33500.getClass(), "_externalTypeIdHandler", null);
        setField(term33500, term33500.getClass(), "_objectIdReader", null);
        setField(term33500, term33500.getClass(), "_valueClass", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap");
        Object[] args = new Object[2];
        args[0] = term32281;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term33498));
        assertTrue(recursiveEquals(term32281, term33500));
    }

};


