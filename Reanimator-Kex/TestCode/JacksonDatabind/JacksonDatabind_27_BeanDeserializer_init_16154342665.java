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

public class BeanDeserializer_init_16154342665 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9068;
     Object term9716;
     Object term9718;

    public BeanDeserializer_init_16154342665() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term8956 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        term9068 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term9182 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        setField(term9068, term9068.getClass(), "_beanType", term9182);
        term9716 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term9717 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        setField(term9716, term9716.getClass(), "_classAnnotations", null);
        setField(term9717, term9717.getClass(), "_elementType", null);
        setField(term9717, term9717.getClass(), "_canonicalName", null);
        setField(term9717, term9717.getClass(), "_class", null);
        setIntField(term9717, term9717.getClass(), "_hash", 0);
        setField(term9717, term9717.getClass(), "_valueHandler", null);
        setField(term9717, term9717.getClass(), "_typeHandler", null);
        setBooleanField(term9717, term9717.getClass(), "_asStatic", false);
        setField(term9716, term9716.getClass(), "_beanType", term9717);
        setField(term9716, term9716.getClass(), "_serializationShape", null);
        setField(term9716, term9716.getClass(), "_valueInstantiator", null);
        setField(term9716, term9716.getClass(), "_delegateDeserializer", null);
        setField(term9716, term9716.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term9716, term9716.getClass(), "_nonStandardCreation", false);
        setBooleanField(term9716, term9716.getClass(), "_vanillaProcessing", false);
        setField(term9716, term9716.getClass(), "_beanProperties", null);
        setField(term9716, term9716.getClass(), "_injectables", null);
        setField(term9716, term9716.getClass(), "_anySetter", null);
        setField(term9716, term9716.getClass(), "_ignorableProps", null);
        setBooleanField(term9716, term9716.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term9716, term9716.getClass(), "_needViewProcesing", false);
        setField(term9716, term9716.getClass(), "_backRefs", null);
        setField(term9716, term9716.getClass(), "_subDeserializers", null);
        setField(term9716, term9716.getClass(), "_unwrappedPropertyHandler", null);
        setField(term9716, term9716.getClass(), "_externalTypeIdHandler", null);
        setField(term9716, term9716.getClass(), "_objectIdReader", null);
        setField(term9716, term9716.getClass(), "_valueClass", null);
        term9718 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term9719 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        setField(term9718, term9718.getClass(), "_classAnnotations", null);
        setField(term9719, term9719.getClass(), "_elementType", null);
        setField(term9719, term9719.getClass(), "_canonicalName", null);
        setField(term9719, term9719.getClass(), "_class", null);
        setIntField(term9719, term9719.getClass(), "_hash", 0);
        setField(term9719, term9719.getClass(), "_valueHandler", null);
        setField(term9719, term9719.getClass(), "_typeHandler", null);
        setBooleanField(term9719, term9719.getClass(), "_asStatic", false);
        setField(term9718, term9718.getClass(), "_beanType", term9719);
        setField(term9718, term9718.getClass(), "_serializationShape", null);
        setField(term9718, term9718.getClass(), "_valueInstantiator", null);
        setField(term9718, term9718.getClass(), "_delegateDeserializer", null);
        setField(term9718, term9718.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term9718, term9718.getClass(), "_nonStandardCreation", false);
        setBooleanField(term9718, term9718.getClass(), "_vanillaProcessing", false);
        setField(term9718, term9718.getClass(), "_beanProperties", null);
        setField(term9718, term9718.getClass(), "_injectables", null);
        setField(term9718, term9718.getClass(), "_anySetter", null);
        setField(term9718, term9718.getClass(), "_ignorableProps", null);
        setBooleanField(term9718, term9718.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term9718, term9718.getClass(), "_needViewProcesing", false);
        setField(term9718, term9718.getClass(), "_backRefs", null);
        setField(term9718, term9718.getClass(), "_subDeserializers", null);
        setField(term9718, term9718.getClass(), "_unwrappedPropertyHandler", null);
        setField(term9718, term9718.getClass(), "_externalTypeIdHandler", null);
        setField(term9718, term9718.getClass(), "_objectIdReader", null);
        setField(term9718, term9718.getClass(), "_valueClass", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        argTypes[1] = Class.forName("java.util.HashSet");
        Object[] args = new Object[2];
        args[0] = term9068;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term9716));
        assertTrue(recursiveEquals(term9068, term9718));
    }

};


