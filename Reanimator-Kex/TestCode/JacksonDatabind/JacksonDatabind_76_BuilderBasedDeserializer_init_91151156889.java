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

public class BuilderBasedDeserializer_init_91151156889 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17493;
     Object term17557;
     Object term17559;

    public BuilderBasedDeserializer_init_91151156889() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17493 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        Object term17539 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term17493, term17493.getClass(), "_beanType", term17539);
        term17557 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        Object term17558 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term17557, term17557.getClass(), "_buildMethod", null);
        setField(term17557, term17557.getClass(), "_classAnnotations", null);
        setField(term17558, term17558.getClass(), "_keyType", null);
        setField(term17558, term17558.getClass(), "_valueType", null);
        setField(term17558, term17558.getClass(), "_superClass", null);
        setField(term17558, term17558.getClass(), "_superInterfaces", null);
        setField(term17558, term17558.getClass(), "_bindings", null);
        setField(term17558, term17558.getClass(), "_canonicalName", null);
        setField(term17558, term17558.getClass(), "_class", null);
        setIntField(term17558, term17558.getClass(), "_hash", 0);
        setField(term17558, term17558.getClass(), "_valueHandler", null);
        setField(term17558, term17558.getClass(), "_typeHandler", null);
        setBooleanField(term17558, term17558.getClass(), "_asStatic", false);
        setField(term17557, term17557.getClass(), "_beanType", term17558);
        setField(term17557, term17557.getClass(), "_serializationShape", null);
        setField(term17557, term17557.getClass(), "_valueInstantiator", null);
        setField(term17557, term17557.getClass(), "_delegateDeserializer", null);
        setField(term17557, term17557.getClass(), "_arrayDelegateDeserializer", null);
        setField(term17557, term17557.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term17557, term17557.getClass(), "_nonStandardCreation", false);
        setBooleanField(term17557, term17557.getClass(), "_vanillaProcessing", false);
        setField(term17557, term17557.getClass(), "_beanProperties", null);
        setField(term17557, term17557.getClass(), "_injectables", null);
        setField(term17557, term17557.getClass(), "_anySetter", null);
        setField(term17557, term17557.getClass(), "_ignorableProps", null);
        setBooleanField(term17557, term17557.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term17557, term17557.getClass(), "_needViewProcesing", false);
        setField(term17557, term17557.getClass(), "_backRefs", null);
        setField(term17557, term17557.getClass(), "_subDeserializers", null);
        setField(term17557, term17557.getClass(), "_unwrappedPropertyHandler", null);
        setField(term17557, term17557.getClass(), "_externalTypeIdHandler", null);
        setField(term17557, term17557.getClass(), "_objectIdReader", null);
        setField(term17557, term17557.getClass(), "_valueClass", null);
        term17559 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        Object term17560 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term17559, term17559.getClass(), "_buildMethod", null);
        setField(term17559, term17559.getClass(), "_classAnnotations", null);
        setField(term17560, term17560.getClass(), "_keyType", null);
        setField(term17560, term17560.getClass(), "_valueType", null);
        setField(term17560, term17560.getClass(), "_superClass", null);
        setField(term17560, term17560.getClass(), "_superInterfaces", null);
        setField(term17560, term17560.getClass(), "_bindings", null);
        setField(term17560, term17560.getClass(), "_canonicalName", null);
        setField(term17560, term17560.getClass(), "_class", null);
        setIntField(term17560, term17560.getClass(), "_hash", 0);
        setField(term17560, term17560.getClass(), "_valueHandler", null);
        setField(term17560, term17560.getClass(), "_typeHandler", null);
        setBooleanField(term17560, term17560.getClass(), "_asStatic", false);
        setField(term17559, term17559.getClass(), "_beanType", term17560);
        setField(term17559, term17559.getClass(), "_serializationShape", null);
        setField(term17559, term17559.getClass(), "_valueInstantiator", null);
        setField(term17559, term17559.getClass(), "_delegateDeserializer", null);
        setField(term17559, term17559.getClass(), "_arrayDelegateDeserializer", null);
        setField(term17559, term17559.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term17559, term17559.getClass(), "_nonStandardCreation", false);
        setBooleanField(term17559, term17559.getClass(), "_vanillaProcessing", false);
        setField(term17559, term17559.getClass(), "_beanProperties", null);
        setField(term17559, term17559.getClass(), "_injectables", null);
        setField(term17559, term17559.getClass(), "_anySetter", null);
        setField(term17559, term17559.getClass(), "_ignorableProps", null);
        setBooleanField(term17559, term17559.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term17559, term17559.getClass(), "_needViewProcesing", false);
        setField(term17559, term17559.getClass(), "_backRefs", null);
        setField(term17559, term17559.getClass(), "_subDeserializers", null);
        setField(term17559, term17559.getClass(), "_unwrappedPropertyHandler", null);
        setField(term17559, term17559.getClass(), "_externalTypeIdHandler", null);
        setField(term17559, term17559.getClass(), "_objectIdReader", null);
        setField(term17559, term17559.getClass(), "_valueClass", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap");
        Object[] args = new Object[2];
        args[0] = term17493;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term17557));
        assertTrue(recursiveEquals(term17493, term17559));
    }

};


