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

public class BeanDeserializer_init_16154342683 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16834;
     Object term17423;
     Object term17425;

    public BeanDeserializer_init_16154342683() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term16722 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        term16834 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term16930 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term16834, term16834.getClass(), "_beanType", term16930);
        term17423 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term17424 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term17423, term17423.getClass(), "_classAnnotations", null);
        setField(term17424, term17424.getClass(), "_componentType", null);
        setField(term17424, term17424.getClass(), "_emptyArray", null);
        setField(term17424, term17424.getClass(), "_canonicalName", null);
        setField(term17424, term17424.getClass(), "_class", null);
        setIntField(term17424, term17424.getClass(), "_hash", 0);
        setField(term17424, term17424.getClass(), "_valueHandler", null);
        setField(term17424, term17424.getClass(), "_typeHandler", null);
        setBooleanField(term17424, term17424.getClass(), "_asStatic", false);
        setField(term17423, term17423.getClass(), "_beanType", term17424);
        setField(term17423, term17423.getClass(), "_serializationShape", null);
        setField(term17423, term17423.getClass(), "_valueInstantiator", null);
        setField(term17423, term17423.getClass(), "_delegateDeserializer", null);
        setField(term17423, term17423.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term17423, term17423.getClass(), "_nonStandardCreation", false);
        setBooleanField(term17423, term17423.getClass(), "_vanillaProcessing", false);
        setField(term17423, term17423.getClass(), "_beanProperties", null);
        setField(term17423, term17423.getClass(), "_injectables", null);
        setField(term17423, term17423.getClass(), "_anySetter", null);
        setField(term17423, term17423.getClass(), "_ignorableProps", null);
        setBooleanField(term17423, term17423.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term17423, term17423.getClass(), "_needViewProcesing", false);
        setField(term17423, term17423.getClass(), "_backRefs", null);
        setField(term17423, term17423.getClass(), "_subDeserializers", null);
        setField(term17423, term17423.getClass(), "_unwrappedPropertyHandler", null);
        setField(term17423, term17423.getClass(), "_externalTypeIdHandler", null);
        setField(term17423, term17423.getClass(), "_objectIdReader", null);
        setField(term17423, term17423.getClass(), "_valueClass", null);
        term17425 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term17426 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term17425, term17425.getClass(), "_classAnnotations", null);
        setField(term17426, term17426.getClass(), "_componentType", null);
        setField(term17426, term17426.getClass(), "_emptyArray", null);
        setField(term17426, term17426.getClass(), "_canonicalName", null);
        setField(term17426, term17426.getClass(), "_class", null);
        setIntField(term17426, term17426.getClass(), "_hash", 0);
        setField(term17426, term17426.getClass(), "_valueHandler", null);
        setField(term17426, term17426.getClass(), "_typeHandler", null);
        setBooleanField(term17426, term17426.getClass(), "_asStatic", false);
        setField(term17425, term17425.getClass(), "_beanType", term17426);
        setField(term17425, term17425.getClass(), "_serializationShape", null);
        setField(term17425, term17425.getClass(), "_valueInstantiator", null);
        setField(term17425, term17425.getClass(), "_delegateDeserializer", null);
        setField(term17425, term17425.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term17425, term17425.getClass(), "_nonStandardCreation", false);
        setBooleanField(term17425, term17425.getClass(), "_vanillaProcessing", false);
        setField(term17425, term17425.getClass(), "_beanProperties", null);
        setField(term17425, term17425.getClass(), "_injectables", null);
        setField(term17425, term17425.getClass(), "_anySetter", null);
        setField(term17425, term17425.getClass(), "_ignorableProps", null);
        setBooleanField(term17425, term17425.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term17425, term17425.getClass(), "_needViewProcesing", false);
        setField(term17425, term17425.getClass(), "_backRefs", null);
        setField(term17425, term17425.getClass(), "_subDeserializers", null);
        setField(term17425, term17425.getClass(), "_unwrappedPropertyHandler", null);
        setField(term17425, term17425.getClass(), "_externalTypeIdHandler", null);
        setField(term17425, term17425.getClass(), "_objectIdReader", null);
        setField(term17425, term17425.getClass(), "_valueClass", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        argTypes[1] = Class.forName("java.util.HashSet");
        Object[] args = new Object[2];
        args[0] = term16834;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term17423));
        assertTrue(recursiveEquals(term16834, term17425));
    }

};


