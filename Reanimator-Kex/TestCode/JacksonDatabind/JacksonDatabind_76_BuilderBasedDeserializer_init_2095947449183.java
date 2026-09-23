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

public class BuilderBasedDeserializer_init_2095947449183 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term83013;
     Object term83271;
     Object term83553;
     Object term83557;
     Object term83558;

    public BuilderBasedDeserializer_init_2095947449183() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term82769 = Class.forName((String) "com.fasterxml.jackson.databind.cfg.BaseSettings");
        Object term82733 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        Object term82885 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        setField(term82733, term82733.getClass(), "_valueClass", term82769);
        setField(term82733, term82733.getClass(), "_classAnnotations", term82885);
        setField(term82733, term82733.getClass(), "_beanType", null);
        setField(term82733, term82733.getClass(), "_valueInstantiator", null);
        setField(term82733, term82733.getClass(), "_delegateDeserializer", null);
        setField(term82733, term82733.getClass(), "_propertyBasedCreator", null);
        setField(term82733, term82733.getClass(), "_backRefs", null);
        setField(term82733, term82733.getClass(), "_ignorableProps", null);
        setBooleanField(term82733, term82733.getClass(), "_ignoreAllUnknown", false);
        setField(term82733, term82733.getClass(), "_anySetter", null);
        setField(term82733, term82733.getClass(), "_injectables", null);
        setField(term82733, term82733.getClass(), "_objectIdReader", null);
        setBooleanField(term82733, term82733.getClass(), "_nonStandardCreation", false);
        term83013 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        Object term83133 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        Object[] term82514 = (Object[]) newArray("com.fasterxml.jackson.databind.deser.SettableBeanProperty", 0);
        setField(term83013, term83013.getClass(), "_beanType", null);
        setField(term83013, term83013.getClass(), "_classAnnotations", null);
        setField(term83013, term83013.getClass(), "_valueInstantiator", null);
        setField(term83013, term83013.getClass(), "_delegateDeserializer", null);
        setField(term83013, term83013.getClass(), "_propertyBasedCreator", null);
        setField(term83013, term83013.getClass(), "_backRefs", null);
        setField(term83013, term83013.getClass(), "_ignorableProps", null);
        setField(term83013, term83013.getClass(), "_anySetter", null);
        setField(term83013, term83013.getClass(), "_injectables", null);
        setField(term83013, term83013.getClass(), "_objectIdReader", null);
        setBooleanField(term83013, term83013.getClass(), "_nonStandardCreation", false);
        setField(term83013, term83013.getClass(), "_unwrappedPropertyHandler", null);
        setField(term83133, term83133.getClass(), "_propsInOrder", term82514);
        setField(term83013, term83013.getClass(), "_beanProperties", term83133);
        term83271 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.NameTransformer$NopTransformer"));
        term83553 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        Object term83554 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        Object[] term83555 = (Object[]) newArray("java.lang.Object", 24);
        Object[] term83556 = (Object[]) newArray("com.fasterxml.jackson.databind.deser.SettableBeanProperty", 0);
        setField(term83553, term83553.getClass(), "_buildMethod", null);
        setField(term83553, term83553.getClass(), "_classAnnotations", null);
        setField(term83553, term83553.getClass(), "_beanType", null);
        setField(term83553, term83553.getClass(), "_serializationShape", null);
        setField(term83553, term83553.getClass(), "_valueInstantiator", null);
        setField(term83553, term83553.getClass(), "_delegateDeserializer", null);
        setField(term83553, term83553.getClass(), "_arrayDelegateDeserializer", null);
        setField(term83553, term83553.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term83553, term83553.getClass(), "_nonStandardCreation", false);
        setBooleanField(term83553, term83553.getClass(), "_vanillaProcessing", false);
        setBooleanField(term83554, term83554.getClass(), "_caseInsensitive", false);
        setIntField(term83554, term83554.getClass(), "_hashMask", 7);
        setIntField(term83554, term83554.getClass(), "_size", 0);
        setIntField(term83554, term83554.getClass(), "_spillCount", 0);
        setField(term83554, term83554.getClass(), "_hashArea", term83555);
        setField(term83554, term83554.getClass(), "_propsInOrder", term83556);
        setField(term83553, term83553.getClass(), "_beanProperties", term83554);
        setField(term83553, term83553.getClass(), "_injectables", null);
        setField(term83553, term83553.getClass(), "_anySetter", null);
        setField(term83553, term83553.getClass(), "_ignorableProps", null);
        setBooleanField(term83553, term83553.getClass(), "_ignoreAllUnknown", true);
        setBooleanField(term83553, term83553.getClass(), "_needViewProcesing", false);
        setField(term83553, term83553.getClass(), "_backRefs", null);
        setField(term83553, term83553.getClass(), "_subDeserializers", null);
        setField(term83553, term83553.getClass(), "_unwrappedPropertyHandler", null);
        setField(term83553, term83553.getClass(), "_externalTypeIdHandler", null);
        setField(term83553, term83553.getClass(), "_objectIdReader", null);
        setField(term83553, term83553.getClass(), "_valueClass", null);
        term83557 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.NameTransformer$NopTransformer"));
        term83558 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        Object term83559 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        Object[] term83560 = (Object[]) newArray("com.fasterxml.jackson.databind.deser.SettableBeanProperty", 0);
        setField(term83558, term83558.getClass(), "_buildMethod", null);
        setField(term83558, term83558.getClass(), "_classAnnotations", null);
        setField(term83558, term83558.getClass(), "_beanType", null);
        setField(term83558, term83558.getClass(), "_serializationShape", null);
        setField(term83558, term83558.getClass(), "_valueInstantiator", null);
        setField(term83558, term83558.getClass(), "_delegateDeserializer", null);
        setField(term83558, term83558.getClass(), "_arrayDelegateDeserializer", null);
        setField(term83558, term83558.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term83558, term83558.getClass(), "_nonStandardCreation", false);
        setBooleanField(term83558, term83558.getClass(), "_vanillaProcessing", false);
        setBooleanField(term83559, term83559.getClass(), "_caseInsensitive", false);
        setIntField(term83559, term83559.getClass(), "_hashMask", 0);
        setIntField(term83559, term83559.getClass(), "_size", 0);
        setIntField(term83559, term83559.getClass(), "_spillCount", 0);
        setField(term83559, term83559.getClass(), "_hashArea", null);
        setField(term83559, term83559.getClass(), "_propsInOrder", term83560);
        setField(term83558, term83558.getClass(), "_beanProperties", term83559);
        setField(term83558, term83558.getClass(), "_injectables", null);
        setField(term83558, term83558.getClass(), "_anySetter", null);
        setField(term83558, term83558.getClass(), "_ignorableProps", null);
        setBooleanField(term83558, term83558.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term83558, term83558.getClass(), "_needViewProcesing", false);
        setField(term83558, term83558.getClass(), "_backRefs", null);
        setField(term83558, term83558.getClass(), "_subDeserializers", null);
        setField(term83558, term83558.getClass(), "_unwrappedPropertyHandler", null);
        setField(term83558, term83558.getClass(), "_externalTypeIdHandler", null);
        setField(term83558, term83558.getClass(), "_objectIdReader", null);
        setField(term83558, term83558.getClass(), "_valueClass", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
        Object[] args = new Object[2];
        args[0] = term83013;
        args[1] = term83271;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term83553));
        assertTrue(recursiveEquals(term83013, term83557));
        assertTrue(recursiveEquals(term83271, term83558));
    }

};


