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

public class BuilderBasedDeserializer_init_51685980275 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13778;
     Object term14387;
     Object term14389;

    public BuilderBasedDeserializer_init_51685980275() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13778 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        Object term13835 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        setField(term13778, term13778.getClass(), "_beanType", term13835);
        term14387 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        Object term14388 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        setField(term14387, term14387.getClass(), "_buildMethod", null);
        setField(term14387, term14387.getClass(), "_classAnnotations", null);
        setField(term14388, term14388.getClass(), "_elementType", null);
        setField(term14388, term14388.getClass(), "_superClass", null);
        setField(term14388, term14388.getClass(), "_superInterfaces", null);
        setField(term14388, term14388.getClass(), "_bindings", null);
        setField(term14388, term14388.getClass(), "_canonicalName", null);
        setField(term14388, term14388.getClass(), "_class", null);
        setIntField(term14388, term14388.getClass(), "_hash", 0);
        setField(term14388, term14388.getClass(), "_valueHandler", null);
        setField(term14388, term14388.getClass(), "_typeHandler", null);
        setBooleanField(term14388, term14388.getClass(), "_asStatic", false);
        setField(term14387, term14387.getClass(), "_beanType", term14388);
        setField(term14387, term14387.getClass(), "_serializationShape", null);
        setField(term14387, term14387.getClass(), "_valueInstantiator", null);
        setField(term14387, term14387.getClass(), "_delegateDeserializer", null);
        setField(term14387, term14387.getClass(), "_arrayDelegateDeserializer", null);
        setField(term14387, term14387.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term14387, term14387.getClass(), "_nonStandardCreation", false);
        setBooleanField(term14387, term14387.getClass(), "_vanillaProcessing", false);
        setField(term14387, term14387.getClass(), "_beanProperties", null);
        setField(term14387, term14387.getClass(), "_injectables", null);
        setField(term14387, term14387.getClass(), "_anySetter", null);
        setField(term14387, term14387.getClass(), "_ignorableProps", null);
        setBooleanField(term14387, term14387.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term14387, term14387.getClass(), "_needViewProcesing", false);
        setField(term14387, term14387.getClass(), "_backRefs", null);
        setField(term14387, term14387.getClass(), "_subDeserializers", null);
        setField(term14387, term14387.getClass(), "_unwrappedPropertyHandler", null);
        setField(term14387, term14387.getClass(), "_externalTypeIdHandler", null);
        setField(term14387, term14387.getClass(), "_objectIdReader", null);
        setField(term14387, term14387.getClass(), "_valueClass", null);
        term14389 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        Object term14390 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        setField(term14389, term14389.getClass(), "_buildMethod", null);
        setField(term14389, term14389.getClass(), "_classAnnotations", null);
        setField(term14390, term14390.getClass(), "_elementType", null);
        setField(term14390, term14390.getClass(), "_superClass", null);
        setField(term14390, term14390.getClass(), "_superInterfaces", null);
        setField(term14390, term14390.getClass(), "_bindings", null);
        setField(term14390, term14390.getClass(), "_canonicalName", null);
        setField(term14390, term14390.getClass(), "_class", null);
        setIntField(term14390, term14390.getClass(), "_hash", 0);
        setField(term14390, term14390.getClass(), "_valueHandler", null);
        setField(term14390, term14390.getClass(), "_typeHandler", null);
        setBooleanField(term14390, term14390.getClass(), "_asStatic", false);
        setField(term14389, term14389.getClass(), "_beanType", term14390);
        setField(term14389, term14389.getClass(), "_serializationShape", null);
        setField(term14389, term14389.getClass(), "_valueInstantiator", null);
        setField(term14389, term14389.getClass(), "_delegateDeserializer", null);
        setField(term14389, term14389.getClass(), "_arrayDelegateDeserializer", null);
        setField(term14389, term14389.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term14389, term14389.getClass(), "_nonStandardCreation", false);
        setBooleanField(term14389, term14389.getClass(), "_vanillaProcessing", false);
        setField(term14389, term14389.getClass(), "_beanProperties", null);
        setField(term14389, term14389.getClass(), "_injectables", null);
        setField(term14389, term14389.getClass(), "_anySetter", null);
        setField(term14389, term14389.getClass(), "_ignorableProps", null);
        setBooleanField(term14389, term14389.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term14389, term14389.getClass(), "_needViewProcesing", false);
        setField(term14389, term14389.getClass(), "_backRefs", null);
        setField(term14389, term14389.getClass(), "_subDeserializers", null);
        setField(term14389, term14389.getClass(), "_unwrappedPropertyHandler", null);
        setField(term14389, term14389.getClass(), "_externalTypeIdHandler", null);
        setField(term14389, term14389.getClass(), "_objectIdReader", null);
        setField(term14389, term14389.getClass(), "_valueClass", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader");
        Object[] args = new Object[2];
        args[0] = term13778;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term14387));
        assertTrue(recursiveEquals(term13778, term14389));
    }

};


