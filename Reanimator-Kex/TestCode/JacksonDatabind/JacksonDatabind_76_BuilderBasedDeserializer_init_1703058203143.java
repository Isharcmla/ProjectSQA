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

public class BuilderBasedDeserializer_init_1703058203143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45523;
     Object term45588;
     Object term45590;

    public BuilderBasedDeserializer_init_1703058203143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45523 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        Object term45569 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term45523, term45523.getClass(), "_beanType", term45569);
        term45588 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        Object term45589 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term45588, term45588.getClass(), "_buildMethod", null);
        setField(term45588, term45588.getClass(), "_classAnnotations", null);
        setField(term45589, term45589.getClass(), "_keyType", null);
        setField(term45589, term45589.getClass(), "_valueType", null);
        setField(term45589, term45589.getClass(), "_superClass", null);
        setField(term45589, term45589.getClass(), "_superInterfaces", null);
        setField(term45589, term45589.getClass(), "_bindings", null);
        setField(term45589, term45589.getClass(), "_canonicalName", null);
        setField(term45589, term45589.getClass(), "_class", null);
        setIntField(term45589, term45589.getClass(), "_hash", 0);
        setField(term45589, term45589.getClass(), "_valueHandler", null);
        setField(term45589, term45589.getClass(), "_typeHandler", null);
        setBooleanField(term45589, term45589.getClass(), "_asStatic", false);
        setField(term45588, term45588.getClass(), "_beanType", term45589);
        setField(term45588, term45588.getClass(), "_serializationShape", null);
        setField(term45588, term45588.getClass(), "_valueInstantiator", null);
        setField(term45588, term45588.getClass(), "_delegateDeserializer", null);
        setField(term45588, term45588.getClass(), "_arrayDelegateDeserializer", null);
        setField(term45588, term45588.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term45588, term45588.getClass(), "_nonStandardCreation", false);
        setBooleanField(term45588, term45588.getClass(), "_vanillaProcessing", false);
        setField(term45588, term45588.getClass(), "_beanProperties", null);
        setField(term45588, term45588.getClass(), "_injectables", null);
        setField(term45588, term45588.getClass(), "_anySetter", null);
        setField(term45588, term45588.getClass(), "_ignorableProps", null);
        setBooleanField(term45588, term45588.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term45588, term45588.getClass(), "_needViewProcesing", false);
        setField(term45588, term45588.getClass(), "_backRefs", null);
        setField(term45588, term45588.getClass(), "_subDeserializers", null);
        setField(term45588, term45588.getClass(), "_unwrappedPropertyHandler", null);
        setField(term45588, term45588.getClass(), "_externalTypeIdHandler", null);
        setField(term45588, term45588.getClass(), "_objectIdReader", null);
        setField(term45588, term45588.getClass(), "_valueClass", null);
        term45590 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        Object term45591 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term45590, term45590.getClass(), "_buildMethod", null);
        setField(term45590, term45590.getClass(), "_classAnnotations", null);
        setField(term45591, term45591.getClass(), "_keyType", null);
        setField(term45591, term45591.getClass(), "_valueType", null);
        setField(term45591, term45591.getClass(), "_superClass", null);
        setField(term45591, term45591.getClass(), "_superInterfaces", null);
        setField(term45591, term45591.getClass(), "_bindings", null);
        setField(term45591, term45591.getClass(), "_canonicalName", null);
        setField(term45591, term45591.getClass(), "_class", null);
        setIntField(term45591, term45591.getClass(), "_hash", 0);
        setField(term45591, term45591.getClass(), "_valueHandler", null);
        setField(term45591, term45591.getClass(), "_typeHandler", null);
        setBooleanField(term45591, term45591.getClass(), "_asStatic", false);
        setField(term45590, term45590.getClass(), "_beanType", term45591);
        setField(term45590, term45590.getClass(), "_serializationShape", null);
        setField(term45590, term45590.getClass(), "_valueInstantiator", null);
        setField(term45590, term45590.getClass(), "_delegateDeserializer", null);
        setField(term45590, term45590.getClass(), "_arrayDelegateDeserializer", null);
        setField(term45590, term45590.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term45590, term45590.getClass(), "_nonStandardCreation", false);
        setBooleanField(term45590, term45590.getClass(), "_vanillaProcessing", false);
        setField(term45590, term45590.getClass(), "_beanProperties", null);
        setField(term45590, term45590.getClass(), "_injectables", null);
        setField(term45590, term45590.getClass(), "_anySetter", null);
        setField(term45590, term45590.getClass(), "_ignorableProps", null);
        setBooleanField(term45590, term45590.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term45590, term45590.getClass(), "_needViewProcesing", false);
        setField(term45590, term45590.getClass(), "_backRefs", null);
        setField(term45590, term45590.getClass(), "_subDeserializers", null);
        setField(term45590, term45590.getClass(), "_unwrappedPropertyHandler", null);
        setField(term45590, term45590.getClass(), "_externalTypeIdHandler", null);
        setField(term45590, term45590.getClass(), "_objectIdReader", null);
        setField(term45590, term45590.getClass(), "_valueClass", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term45523;
        args[1] = false;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term45588));
        assertTrue(recursiveEquals(term45523, term45590));
    }

};


