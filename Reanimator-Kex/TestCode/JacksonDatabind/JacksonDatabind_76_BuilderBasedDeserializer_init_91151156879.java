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

public class BuilderBasedDeserializer_init_91151156879 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15077;
     Object term15148;
     Object term15150;

    public BuilderBasedDeserializer_init_91151156879() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15077 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        Object term15130 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term15077, term15077.getClass(), "_beanType", term15130);
        term15148 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        Object term15149 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term15148, term15148.getClass(), "_buildMethod", null);
        setField(term15148, term15148.getClass(), "_classAnnotations", null);
        setField(term15149, term15149.getClass(), "_elementType", null);
        setField(term15149, term15149.getClass(), "_superClass", null);
        setField(term15149, term15149.getClass(), "_superInterfaces", null);
        setField(term15149, term15149.getClass(), "_bindings", null);
        setField(term15149, term15149.getClass(), "_canonicalName", null);
        setField(term15149, term15149.getClass(), "_class", null);
        setIntField(term15149, term15149.getClass(), "_hash", 0);
        setField(term15149, term15149.getClass(), "_valueHandler", null);
        setField(term15149, term15149.getClass(), "_typeHandler", null);
        setBooleanField(term15149, term15149.getClass(), "_asStatic", false);
        setField(term15148, term15148.getClass(), "_beanType", term15149);
        setField(term15148, term15148.getClass(), "_serializationShape", null);
        setField(term15148, term15148.getClass(), "_valueInstantiator", null);
        setField(term15148, term15148.getClass(), "_delegateDeserializer", null);
        setField(term15148, term15148.getClass(), "_arrayDelegateDeserializer", null);
        setField(term15148, term15148.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term15148, term15148.getClass(), "_nonStandardCreation", false);
        setBooleanField(term15148, term15148.getClass(), "_vanillaProcessing", false);
        setField(term15148, term15148.getClass(), "_beanProperties", null);
        setField(term15148, term15148.getClass(), "_injectables", null);
        setField(term15148, term15148.getClass(), "_anySetter", null);
        setField(term15148, term15148.getClass(), "_ignorableProps", null);
        setBooleanField(term15148, term15148.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term15148, term15148.getClass(), "_needViewProcesing", false);
        setField(term15148, term15148.getClass(), "_backRefs", null);
        setField(term15148, term15148.getClass(), "_subDeserializers", null);
        setField(term15148, term15148.getClass(), "_unwrappedPropertyHandler", null);
        setField(term15148, term15148.getClass(), "_externalTypeIdHandler", null);
        setField(term15148, term15148.getClass(), "_objectIdReader", null);
        setField(term15148, term15148.getClass(), "_valueClass", null);
        term15150 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        Object term15151 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term15150, term15150.getClass(), "_buildMethod", null);
        setField(term15150, term15150.getClass(), "_classAnnotations", null);
        setField(term15151, term15151.getClass(), "_elementType", null);
        setField(term15151, term15151.getClass(), "_superClass", null);
        setField(term15151, term15151.getClass(), "_superInterfaces", null);
        setField(term15151, term15151.getClass(), "_bindings", null);
        setField(term15151, term15151.getClass(), "_canonicalName", null);
        setField(term15151, term15151.getClass(), "_class", null);
        setIntField(term15151, term15151.getClass(), "_hash", 0);
        setField(term15151, term15151.getClass(), "_valueHandler", null);
        setField(term15151, term15151.getClass(), "_typeHandler", null);
        setBooleanField(term15151, term15151.getClass(), "_asStatic", false);
        setField(term15150, term15150.getClass(), "_beanType", term15151);
        setField(term15150, term15150.getClass(), "_serializationShape", null);
        setField(term15150, term15150.getClass(), "_valueInstantiator", null);
        setField(term15150, term15150.getClass(), "_delegateDeserializer", null);
        setField(term15150, term15150.getClass(), "_arrayDelegateDeserializer", null);
        setField(term15150, term15150.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term15150, term15150.getClass(), "_nonStandardCreation", false);
        setBooleanField(term15150, term15150.getClass(), "_vanillaProcessing", false);
        setField(term15150, term15150.getClass(), "_beanProperties", null);
        setField(term15150, term15150.getClass(), "_injectables", null);
        setField(term15150, term15150.getClass(), "_anySetter", null);
        setField(term15150, term15150.getClass(), "_ignorableProps", null);
        setBooleanField(term15150, term15150.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term15150, term15150.getClass(), "_needViewProcesing", false);
        setField(term15150, term15150.getClass(), "_backRefs", null);
        setField(term15150, term15150.getClass(), "_subDeserializers", null);
        setField(term15150, term15150.getClass(), "_unwrappedPropertyHandler", null);
        setField(term15150, term15150.getClass(), "_externalTypeIdHandler", null);
        setField(term15150, term15150.getClass(), "_objectIdReader", null);
        setField(term15150, term15150.getClass(), "_valueClass", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap");
        Object[] args = new Object[2];
        args[0] = term15077;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term15148));
        assertTrue(recursiveEquals(term15077, term15150));
    }

};


