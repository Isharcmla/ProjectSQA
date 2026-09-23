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

public class BeanDeserializer_init_167876173680 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14720;
     Object term15658;
     Object term15660;

    public BeanDeserializer_init_167876173680() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term14608 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        term14720 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term14834 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        setField(term14720, term14720.getClass(), "_beanType", term14834);
        term15658 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term15659 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        setField(term15658, term15658.getClass(), "_nullFromCreator", null);
        setField(term15658, term15658.getClass(), "_currentlyTransforming", null);
        setField(term15659, term15659.getClass(), "_elementType", null);
        setField(term15659, term15659.getClass(), "_superClass", null);
        setField(term15659, term15659.getClass(), "_superInterfaces", null);
        setField(term15659, term15659.getClass(), "_bindings", null);
        setField(term15659, term15659.getClass(), "_canonicalName", null);
        setField(term15659, term15659.getClass(), "_class", null);
        setIntField(term15659, term15659.getClass(), "_hash", 0);
        setField(term15659, term15659.getClass(), "_valueHandler", null);
        setField(term15659, term15659.getClass(), "_typeHandler", null);
        setBooleanField(term15659, term15659.getClass(), "_asStatic", false);
        setField(term15658, term15658.getClass(), "_beanType", term15659);
        setField(term15658, term15658.getClass(), "_serializationShape", null);
        setField(term15658, term15658.getClass(), "_valueInstantiator", null);
        setField(term15658, term15658.getClass(), "_delegateDeserializer", null);
        setField(term15658, term15658.getClass(), "_arrayDelegateDeserializer", null);
        setField(term15658, term15658.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term15658, term15658.getClass(), "_nonStandardCreation", false);
        setBooleanField(term15658, term15658.getClass(), "_vanillaProcessing", false);
        setField(term15658, term15658.getClass(), "_beanProperties", null);
        setField(term15658, term15658.getClass(), "_injectables", null);
        setField(term15658, term15658.getClass(), "_anySetter", null);
        setField(term15658, term15658.getClass(), "_ignorableProps", null);
        setBooleanField(term15658, term15658.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term15658, term15658.getClass(), "_needViewProcesing", false);
        setField(term15658, term15658.getClass(), "_backRefs", null);
        setField(term15658, term15658.getClass(), "_subDeserializers", null);
        setField(term15658, term15658.getClass(), "_unwrappedPropertyHandler", null);
        setField(term15658, term15658.getClass(), "_externalTypeIdHandler", null);
        setField(term15658, term15658.getClass(), "_objectIdReader", null);
        setField(term15658, term15658.getClass(), "_valueClass", null);
        term15660 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term15661 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        setField(term15660, term15660.getClass(), "_nullFromCreator", null);
        setField(term15660, term15660.getClass(), "_currentlyTransforming", null);
        setField(term15661, term15661.getClass(), "_elementType", null);
        setField(term15661, term15661.getClass(), "_superClass", null);
        setField(term15661, term15661.getClass(), "_superInterfaces", null);
        setField(term15661, term15661.getClass(), "_bindings", null);
        setField(term15661, term15661.getClass(), "_canonicalName", null);
        setField(term15661, term15661.getClass(), "_class", null);
        setIntField(term15661, term15661.getClass(), "_hash", 0);
        setField(term15661, term15661.getClass(), "_valueHandler", null);
        setField(term15661, term15661.getClass(), "_typeHandler", null);
        setBooleanField(term15661, term15661.getClass(), "_asStatic", false);
        setField(term15660, term15660.getClass(), "_beanType", term15661);
        setField(term15660, term15660.getClass(), "_serializationShape", null);
        setField(term15660, term15660.getClass(), "_valueInstantiator", null);
        setField(term15660, term15660.getClass(), "_delegateDeserializer", null);
        setField(term15660, term15660.getClass(), "_arrayDelegateDeserializer", null);
        setField(term15660, term15660.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term15660, term15660.getClass(), "_nonStandardCreation", false);
        setBooleanField(term15660, term15660.getClass(), "_vanillaProcessing", false);
        setField(term15660, term15660.getClass(), "_beanProperties", null);
        setField(term15660, term15660.getClass(), "_injectables", null);
        setField(term15660, term15660.getClass(), "_anySetter", null);
        setField(term15660, term15660.getClass(), "_ignorableProps", null);
        setBooleanField(term15660, term15660.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term15660, term15660.getClass(), "_needViewProcesing", false);
        setField(term15660, term15660.getClass(), "_backRefs", null);
        setField(term15660, term15660.getClass(), "_subDeserializers", null);
        setField(term15660, term15660.getClass(), "_unwrappedPropertyHandler", null);
        setField(term15660, term15660.getClass(), "_externalTypeIdHandler", null);
        setField(term15660, term15660.getClass(), "_objectIdReader", null);
        setField(term15660, term15660.getClass(), "_valueClass", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
        Object[] args = new Object[2];
        args[0] = term14720;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term15658));
        assertTrue(recursiveEquals(term14720, term15660));
    }

};


