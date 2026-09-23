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

public class BeanDeserializer_init_161543426101 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28432;
     Object term28556;
     Object term28558;

    public BeanDeserializer_init_161543426101() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term28320 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        term28432 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term28538 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term28432, term28432.getClass(), "_beanType", term28538);
        term28556 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term28557 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term28556, term28556.getClass(), "_classAnnotations", null);
        setField(term28557, term28557.getClass(), "_elementType", null);
        setField(term28557, term28557.getClass(), "_canonicalName", null);
        setField(term28557, term28557.getClass(), "_class", null);
        setIntField(term28557, term28557.getClass(), "_hash", 0);
        setField(term28557, term28557.getClass(), "_valueHandler", null);
        setField(term28557, term28557.getClass(), "_typeHandler", null);
        setBooleanField(term28557, term28557.getClass(), "_asStatic", false);
        setField(term28556, term28556.getClass(), "_beanType", term28557);
        setField(term28556, term28556.getClass(), "_serializationShape", null);
        setField(term28556, term28556.getClass(), "_valueInstantiator", null);
        setField(term28556, term28556.getClass(), "_delegateDeserializer", null);
        setField(term28556, term28556.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term28556, term28556.getClass(), "_nonStandardCreation", false);
        setBooleanField(term28556, term28556.getClass(), "_vanillaProcessing", false);
        setField(term28556, term28556.getClass(), "_beanProperties", null);
        setField(term28556, term28556.getClass(), "_injectables", null);
        setField(term28556, term28556.getClass(), "_anySetter", null);
        setField(term28556, term28556.getClass(), "_ignorableProps", null);
        setBooleanField(term28556, term28556.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term28556, term28556.getClass(), "_needViewProcesing", false);
        setField(term28556, term28556.getClass(), "_backRefs", null);
        setField(term28556, term28556.getClass(), "_subDeserializers", null);
        setField(term28556, term28556.getClass(), "_unwrappedPropertyHandler", null);
        setField(term28556, term28556.getClass(), "_externalTypeIdHandler", null);
        setField(term28556, term28556.getClass(), "_objectIdReader", null);
        setField(term28556, term28556.getClass(), "_valueClass", null);
        term28558 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term28559 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term28558, term28558.getClass(), "_classAnnotations", null);
        setField(term28559, term28559.getClass(), "_elementType", null);
        setField(term28559, term28559.getClass(), "_canonicalName", null);
        setField(term28559, term28559.getClass(), "_class", null);
        setIntField(term28559, term28559.getClass(), "_hash", 0);
        setField(term28559, term28559.getClass(), "_valueHandler", null);
        setField(term28559, term28559.getClass(), "_typeHandler", null);
        setBooleanField(term28559, term28559.getClass(), "_asStatic", false);
        setField(term28558, term28558.getClass(), "_beanType", term28559);
        setField(term28558, term28558.getClass(), "_serializationShape", null);
        setField(term28558, term28558.getClass(), "_valueInstantiator", null);
        setField(term28558, term28558.getClass(), "_delegateDeserializer", null);
        setField(term28558, term28558.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term28558, term28558.getClass(), "_nonStandardCreation", false);
        setBooleanField(term28558, term28558.getClass(), "_vanillaProcessing", false);
        setField(term28558, term28558.getClass(), "_beanProperties", null);
        setField(term28558, term28558.getClass(), "_injectables", null);
        setField(term28558, term28558.getClass(), "_anySetter", null);
        setField(term28558, term28558.getClass(), "_ignorableProps", null);
        setBooleanField(term28558, term28558.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term28558, term28558.getClass(), "_needViewProcesing", false);
        setField(term28558, term28558.getClass(), "_backRefs", null);
        setField(term28558, term28558.getClass(), "_subDeserializers", null);
        setField(term28558, term28558.getClass(), "_unwrappedPropertyHandler", null);
        setField(term28558, term28558.getClass(), "_externalTypeIdHandler", null);
        setField(term28558, term28558.getClass(), "_objectIdReader", null);
        setField(term28558, term28558.getClass(), "_valueClass", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        argTypes[1] = Class.forName("java.util.HashSet");
        Object[] args = new Object[2];
        args[0] = term28432;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term28556));
        assertTrue(recursiveEquals(term28432, term28558));
    }

};


