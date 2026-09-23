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

public class BuilderBasedDeserializer_init_2095947449127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35562;
     Object term35629;
     Object term35631;

    public BuilderBasedDeserializer_init_2095947449127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35562 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        Object term35608 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term35562, term35562.getClass(), "_beanType", term35608);
        term35629 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        Object term35630 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term35629, term35629.getClass(), "_buildMethod", null);
        setField(term35629, term35629.getClass(), "_classAnnotations", null);
        setField(term35630, term35630.getClass(), "_keyType", null);
        setField(term35630, term35630.getClass(), "_valueType", null);
        setField(term35630, term35630.getClass(), "_superClass", null);
        setField(term35630, term35630.getClass(), "_superInterfaces", null);
        setField(term35630, term35630.getClass(), "_bindings", null);
        setField(term35630, term35630.getClass(), "_canonicalName", null);
        setField(term35630, term35630.getClass(), "_class", null);
        setIntField(term35630, term35630.getClass(), "_hash", 0);
        setField(term35630, term35630.getClass(), "_valueHandler", null);
        setField(term35630, term35630.getClass(), "_typeHandler", null);
        setBooleanField(term35630, term35630.getClass(), "_asStatic", false);
        setField(term35629, term35629.getClass(), "_beanType", term35630);
        setField(term35629, term35629.getClass(), "_serializationShape", null);
        setField(term35629, term35629.getClass(), "_valueInstantiator", null);
        setField(term35629, term35629.getClass(), "_delegateDeserializer", null);
        setField(term35629, term35629.getClass(), "_arrayDelegateDeserializer", null);
        setField(term35629, term35629.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term35629, term35629.getClass(), "_nonStandardCreation", false);
        setBooleanField(term35629, term35629.getClass(), "_vanillaProcessing", false);
        setField(term35629, term35629.getClass(), "_beanProperties", null);
        setField(term35629, term35629.getClass(), "_injectables", null);
        setField(term35629, term35629.getClass(), "_anySetter", null);
        setField(term35629, term35629.getClass(), "_ignorableProps", null);
        setBooleanField(term35629, term35629.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term35629, term35629.getClass(), "_needViewProcesing", false);
        setField(term35629, term35629.getClass(), "_backRefs", null);
        setField(term35629, term35629.getClass(), "_subDeserializers", null);
        setField(term35629, term35629.getClass(), "_unwrappedPropertyHandler", null);
        setField(term35629, term35629.getClass(), "_externalTypeIdHandler", null);
        setField(term35629, term35629.getClass(), "_objectIdReader", null);
        setField(term35629, term35629.getClass(), "_valueClass", null);
        term35631 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        Object term35632 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term35631, term35631.getClass(), "_buildMethod", null);
        setField(term35631, term35631.getClass(), "_classAnnotations", null);
        setField(term35632, term35632.getClass(), "_keyType", null);
        setField(term35632, term35632.getClass(), "_valueType", null);
        setField(term35632, term35632.getClass(), "_superClass", null);
        setField(term35632, term35632.getClass(), "_superInterfaces", null);
        setField(term35632, term35632.getClass(), "_bindings", null);
        setField(term35632, term35632.getClass(), "_canonicalName", null);
        setField(term35632, term35632.getClass(), "_class", null);
        setIntField(term35632, term35632.getClass(), "_hash", 0);
        setField(term35632, term35632.getClass(), "_valueHandler", null);
        setField(term35632, term35632.getClass(), "_typeHandler", null);
        setBooleanField(term35632, term35632.getClass(), "_asStatic", false);
        setField(term35631, term35631.getClass(), "_beanType", term35632);
        setField(term35631, term35631.getClass(), "_serializationShape", null);
        setField(term35631, term35631.getClass(), "_valueInstantiator", null);
        setField(term35631, term35631.getClass(), "_delegateDeserializer", null);
        setField(term35631, term35631.getClass(), "_arrayDelegateDeserializer", null);
        setField(term35631, term35631.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term35631, term35631.getClass(), "_nonStandardCreation", false);
        setBooleanField(term35631, term35631.getClass(), "_vanillaProcessing", false);
        setField(term35631, term35631.getClass(), "_beanProperties", null);
        setField(term35631, term35631.getClass(), "_injectables", null);
        setField(term35631, term35631.getClass(), "_anySetter", null);
        setField(term35631, term35631.getClass(), "_ignorableProps", null);
        setBooleanField(term35631, term35631.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term35631, term35631.getClass(), "_needViewProcesing", false);
        setField(term35631, term35631.getClass(), "_backRefs", null);
        setField(term35631, term35631.getClass(), "_subDeserializers", null);
        setField(term35631, term35631.getClass(), "_unwrappedPropertyHandler", null);
        setField(term35631, term35631.getClass(), "_externalTypeIdHandler", null);
        setField(term35631, term35631.getClass(), "_objectIdReader", null);
        setField(term35631, term35631.getClass(), "_valueClass", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
        Object[] args = new Object[2];
        args[0] = term35562;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term35629));
        assertTrue(recursiveEquals(term35562, term35631));
    }

};


