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

public class BuilderBasedDeserializer_init_91151156870 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11620;
     Object term12064;
     Object term12066;

    public BuilderBasedDeserializer_init_91151156870() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11620 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        Object term11670 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(term11620, term11620.getClass(), "_beanType", term11670);
        term12064 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        Object term12065 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(term12064, term12064.getClass(), "_buildMethod", null);
        setField(term12064, term12064.getClass(), "_classAnnotations", null);
        setField(term12065, term12065.getClass(), "_keyType", null);
        setField(term12065, term12065.getClass(), "_valueType", null);
        setField(term12065, term12065.getClass(), "_superClass", null);
        setField(term12065, term12065.getClass(), "_superInterfaces", null);
        setField(term12065, term12065.getClass(), "_bindings", null);
        setField(term12065, term12065.getClass(), "_canonicalName", null);
        setField(term12065, term12065.getClass(), "_class", null);
        setIntField(term12065, term12065.getClass(), "_hash", 0);
        setField(term12065, term12065.getClass(), "_valueHandler", null);
        setField(term12065, term12065.getClass(), "_typeHandler", null);
        setBooleanField(term12065, term12065.getClass(), "_asStatic", false);
        setField(term12064, term12064.getClass(), "_beanType", term12065);
        setField(term12064, term12064.getClass(), "_serializationShape", null);
        setField(term12064, term12064.getClass(), "_valueInstantiator", null);
        setField(term12064, term12064.getClass(), "_delegateDeserializer", null);
        setField(term12064, term12064.getClass(), "_arrayDelegateDeserializer", null);
        setField(term12064, term12064.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term12064, term12064.getClass(), "_nonStandardCreation", false);
        setBooleanField(term12064, term12064.getClass(), "_vanillaProcessing", false);
        setField(term12064, term12064.getClass(), "_beanProperties", null);
        setField(term12064, term12064.getClass(), "_injectables", null);
        setField(term12064, term12064.getClass(), "_anySetter", null);
        setField(term12064, term12064.getClass(), "_ignorableProps", null);
        setBooleanField(term12064, term12064.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term12064, term12064.getClass(), "_needViewProcesing", false);
        setField(term12064, term12064.getClass(), "_backRefs", null);
        setField(term12064, term12064.getClass(), "_subDeserializers", null);
        setField(term12064, term12064.getClass(), "_unwrappedPropertyHandler", null);
        setField(term12064, term12064.getClass(), "_externalTypeIdHandler", null);
        setField(term12064, term12064.getClass(), "_objectIdReader", null);
        setField(term12064, term12064.getClass(), "_valueClass", null);
        term12066 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        Object term12067 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(term12066, term12066.getClass(), "_buildMethod", null);
        setField(term12066, term12066.getClass(), "_classAnnotations", null);
        setField(term12067, term12067.getClass(), "_keyType", null);
        setField(term12067, term12067.getClass(), "_valueType", null);
        setField(term12067, term12067.getClass(), "_superClass", null);
        setField(term12067, term12067.getClass(), "_superInterfaces", null);
        setField(term12067, term12067.getClass(), "_bindings", null);
        setField(term12067, term12067.getClass(), "_canonicalName", null);
        setField(term12067, term12067.getClass(), "_class", null);
        setIntField(term12067, term12067.getClass(), "_hash", 0);
        setField(term12067, term12067.getClass(), "_valueHandler", null);
        setField(term12067, term12067.getClass(), "_typeHandler", null);
        setBooleanField(term12067, term12067.getClass(), "_asStatic", false);
        setField(term12066, term12066.getClass(), "_beanType", term12067);
        setField(term12066, term12066.getClass(), "_serializationShape", null);
        setField(term12066, term12066.getClass(), "_valueInstantiator", null);
        setField(term12066, term12066.getClass(), "_delegateDeserializer", null);
        setField(term12066, term12066.getClass(), "_arrayDelegateDeserializer", null);
        setField(term12066, term12066.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term12066, term12066.getClass(), "_nonStandardCreation", false);
        setBooleanField(term12066, term12066.getClass(), "_vanillaProcessing", false);
        setField(term12066, term12066.getClass(), "_beanProperties", null);
        setField(term12066, term12066.getClass(), "_injectables", null);
        setField(term12066, term12066.getClass(), "_anySetter", null);
        setField(term12066, term12066.getClass(), "_ignorableProps", null);
        setBooleanField(term12066, term12066.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term12066, term12066.getClass(), "_needViewProcesing", false);
        setField(term12066, term12066.getClass(), "_backRefs", null);
        setField(term12066, term12066.getClass(), "_subDeserializers", null);
        setField(term12066, term12066.getClass(), "_unwrappedPropertyHandler", null);
        setField(term12066, term12066.getClass(), "_externalTypeIdHandler", null);
        setField(term12066, term12066.getClass(), "_objectIdReader", null);
        setField(term12066, term12066.getClass(), "_valueClass", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap");
        Object[] args = new Object[2];
        args[0] = term11620;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term12064));
        assertTrue(recursiveEquals(term11620, term12066));
    }

};


