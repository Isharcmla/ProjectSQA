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
import java.util.HashMap;

public class BuilderBasedDeserializer_init_209594744967 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10969;
     Object term11225;
     Object term11228;

    public BuilderBasedDeserializer_init_209594744967() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term10601 = Class.forName((String) "java.lang.StackWalker$Option");
        Object term10565 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        Object term10717 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        Object term11031 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.ValueInstantiator$Base"));
        setField(term10565, term10565.getClass(), "_valueClass", term10601);
        setField(term10565, term10565.getClass(), "_classAnnotations", term10717);
        setField(term10565, term10565.getClass(), "_beanType", null);
        setField(term10565, term10565.getClass(), "_valueInstantiator", term11031);
        setField(term10565, term10565.getClass(), "_delegateDeserializer", null);
        setField(term10565, term10565.getClass(), "_propertyBasedCreator", null);
        setField(term10565, term10565.getClass(), "_backRefs", null);
        setField(term10565, term10565.getClass(), "_ignorableProps", null);
        HashMap term11079 = new HashMap();
        term10969 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        setField(term10969, term10969.getClass(), "_beanType", null);
        setField(term10969, term10969.getClass(), "_classAnnotations", null);
        setField(term10969, term10969.getClass(), "_valueInstantiator", term11031);
        setField(term10969, term10969.getClass(), "_delegateDeserializer", null);
        setField(term10969, term10969.getClass(), "_propertyBasedCreator", null);
        setField(term10969, term10969.getClass(), "_backRefs", term11079);
        setField(term10969, term10969.getClass(), "_ignorableProps", null);
        setBooleanField(term10969, term10969.getClass(), "_ignoreAllUnknown", true);
        HashMap term11227 = new HashMap();
        term11225 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        Object term11226 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.ValueInstantiator$Base"));
        setField(term11225, term11225.getClass(), "_buildMethod", null);
        setField(term11225, term11225.getClass(), "_classAnnotations", null);
        setField(term11225, term11225.getClass(), "_beanType", null);
        setField(term11225, term11225.getClass(), "_serializationShape", null);
        setField(term11226, term11226.getClass(), "_valueType", null);
        setField(term11225, term11225.getClass(), "_valueInstantiator", term11226);
        setField(term11225, term11225.getClass(), "_delegateDeserializer", null);
        setField(term11225, term11225.getClass(), "_arrayDelegateDeserializer", null);
        setField(term11225, term11225.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term11225, term11225.getClass(), "_nonStandardCreation", false);
        setBooleanField(term11225, term11225.getClass(), "_vanillaProcessing", false);
        setField(term11225, term11225.getClass(), "_beanProperties", null);
        setField(term11225, term11225.getClass(), "_injectables", null);
        setField(term11225, term11225.getClass(), "_anySetter", null);
        setField(term11225, term11225.getClass(), "_ignorableProps", null);
        setBooleanField(term11225, term11225.getClass(), "_ignoreAllUnknown", true);
        setBooleanField(term11225, term11225.getClass(), "_needViewProcesing", false);
        setField(term11225, term11225.getClass(), "_backRefs", term11227);
        setField(term11225, term11225.getClass(), "_subDeserializers", null);
        setField(term11225, term11225.getClass(), "_unwrappedPropertyHandler", null);
        setField(term11225, term11225.getClass(), "_externalTypeIdHandler", null);
        setField(term11225, term11225.getClass(), "_objectIdReader", null);
        setField(term11225, term11225.getClass(), "_valueClass", null);
        HashMap term11230 = new HashMap();
        term11228 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        Object term11229 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.ValueInstantiator$Base"));
        setField(term11228, term11228.getClass(), "_buildMethod", null);
        setField(term11228, term11228.getClass(), "_classAnnotations", null);
        setField(term11228, term11228.getClass(), "_beanType", null);
        setField(term11228, term11228.getClass(), "_serializationShape", null);
        setField(term11229, term11229.getClass(), "_valueType", null);
        setField(term11228, term11228.getClass(), "_valueInstantiator", term11229);
        setField(term11228, term11228.getClass(), "_delegateDeserializer", null);
        setField(term11228, term11228.getClass(), "_arrayDelegateDeserializer", null);
        setField(term11228, term11228.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term11228, term11228.getClass(), "_nonStandardCreation", false);
        setBooleanField(term11228, term11228.getClass(), "_vanillaProcessing", false);
        setField(term11228, term11228.getClass(), "_beanProperties", null);
        setField(term11228, term11228.getClass(), "_injectables", null);
        setField(term11228, term11228.getClass(), "_anySetter", null);
        setField(term11228, term11228.getClass(), "_ignorableProps", null);
        setBooleanField(term11228, term11228.getClass(), "_ignoreAllUnknown", true);
        setBooleanField(term11228, term11228.getClass(), "_needViewProcesing", false);
        setField(term11228, term11228.getClass(), "_backRefs", term11230);
        setField(term11228, term11228.getClass(), "_subDeserializers", null);
        setField(term11228, term11228.getClass(), "_unwrappedPropertyHandler", null);
        setField(term11228, term11228.getClass(), "_externalTypeIdHandler", null);
        setField(term11228, term11228.getClass(), "_objectIdReader", null);
        setField(term11228, term11228.getClass(), "_valueClass", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
        Object[] args = new Object[2];
        args[0] = term10969;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term11225));
        assertTrue(recursiveEquals(term10969, term11228));
    }

};


