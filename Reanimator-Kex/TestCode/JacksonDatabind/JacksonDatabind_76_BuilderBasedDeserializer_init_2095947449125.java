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

public class BuilderBasedDeserializer_init_2095947449125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35128;
     Object term35209;
     Object term35211;

    public BuilderBasedDeserializer_init_2095947449125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35128 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        Object term35188 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(term35128, term35128.getClass(), "_beanType", term35188);
        term35209 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        Object term35210 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(term35209, term35209.getClass(), "_buildMethod", null);
        setField(term35209, term35209.getClass(), "_classAnnotations", null);
        setField(term35210, term35210.getClass(), "_referencedType", null);
        setField(term35210, term35210.getClass(), "_superClass", null);
        setField(term35210, term35210.getClass(), "_superInterfaces", null);
        setField(term35210, term35210.getClass(), "_bindings", null);
        setField(term35210, term35210.getClass(), "_canonicalName", null);
        setField(term35210, term35210.getClass(), "_class", null);
        setIntField(term35210, term35210.getClass(), "_hash", 0);
        setField(term35210, term35210.getClass(), "_valueHandler", null);
        setField(term35210, term35210.getClass(), "_typeHandler", null);
        setBooleanField(term35210, term35210.getClass(), "_asStatic", false);
        setField(term35209, term35209.getClass(), "_beanType", term35210);
        setField(term35209, term35209.getClass(), "_serializationShape", null);
        setField(term35209, term35209.getClass(), "_valueInstantiator", null);
        setField(term35209, term35209.getClass(), "_delegateDeserializer", null);
        setField(term35209, term35209.getClass(), "_arrayDelegateDeserializer", null);
        setField(term35209, term35209.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term35209, term35209.getClass(), "_nonStandardCreation", false);
        setBooleanField(term35209, term35209.getClass(), "_vanillaProcessing", false);
        setField(term35209, term35209.getClass(), "_beanProperties", null);
        setField(term35209, term35209.getClass(), "_injectables", null);
        setField(term35209, term35209.getClass(), "_anySetter", null);
        setField(term35209, term35209.getClass(), "_ignorableProps", null);
        setBooleanField(term35209, term35209.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term35209, term35209.getClass(), "_needViewProcesing", false);
        setField(term35209, term35209.getClass(), "_backRefs", null);
        setField(term35209, term35209.getClass(), "_subDeserializers", null);
        setField(term35209, term35209.getClass(), "_unwrappedPropertyHandler", null);
        setField(term35209, term35209.getClass(), "_externalTypeIdHandler", null);
        setField(term35209, term35209.getClass(), "_objectIdReader", null);
        setField(term35209, term35209.getClass(), "_valueClass", null);
        term35211 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        Object term35212 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(term35211, term35211.getClass(), "_buildMethod", null);
        setField(term35211, term35211.getClass(), "_classAnnotations", null);
        setField(term35212, term35212.getClass(), "_referencedType", null);
        setField(term35212, term35212.getClass(), "_superClass", null);
        setField(term35212, term35212.getClass(), "_superInterfaces", null);
        setField(term35212, term35212.getClass(), "_bindings", null);
        setField(term35212, term35212.getClass(), "_canonicalName", null);
        setField(term35212, term35212.getClass(), "_class", null);
        setIntField(term35212, term35212.getClass(), "_hash", 0);
        setField(term35212, term35212.getClass(), "_valueHandler", null);
        setField(term35212, term35212.getClass(), "_typeHandler", null);
        setBooleanField(term35212, term35212.getClass(), "_asStatic", false);
        setField(term35211, term35211.getClass(), "_beanType", term35212);
        setField(term35211, term35211.getClass(), "_serializationShape", null);
        setField(term35211, term35211.getClass(), "_valueInstantiator", null);
        setField(term35211, term35211.getClass(), "_delegateDeserializer", null);
        setField(term35211, term35211.getClass(), "_arrayDelegateDeserializer", null);
        setField(term35211, term35211.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term35211, term35211.getClass(), "_nonStandardCreation", false);
        setBooleanField(term35211, term35211.getClass(), "_vanillaProcessing", false);
        setField(term35211, term35211.getClass(), "_beanProperties", null);
        setField(term35211, term35211.getClass(), "_injectables", null);
        setField(term35211, term35211.getClass(), "_anySetter", null);
        setField(term35211, term35211.getClass(), "_ignorableProps", null);
        setBooleanField(term35211, term35211.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term35211, term35211.getClass(), "_needViewProcesing", false);
        setField(term35211, term35211.getClass(), "_backRefs", null);
        setField(term35211, term35211.getClass(), "_subDeserializers", null);
        setField(term35211, term35211.getClass(), "_unwrappedPropertyHandler", null);
        setField(term35211, term35211.getClass(), "_externalTypeIdHandler", null);
        setField(term35211, term35211.getClass(), "_objectIdReader", null);
        setField(term35211, term35211.getClass(), "_valueClass", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
        Object[] args = new Object[2];
        args[0] = term35128;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term35209));
        assertTrue(recursiveEquals(term35128, term35211));
    }

};


