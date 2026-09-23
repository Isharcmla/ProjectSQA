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

public class BeanDeserializer_init_99674089185 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term103956;
     Object term104071;
     Object term104073;

    public BeanDeserializer_init_99674089185() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term103844 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        term103956 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term104052 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term103956, term103956.getClass(), "_beanType", term104052);
        term104071 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term104072 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term104071, term104071.getClass(), "_classAnnotations", null);
        setField(term104072, term104072.getClass(), "_componentType", null);
        setField(term104072, term104072.getClass(), "_emptyArray", null);
        setField(term104072, term104072.getClass(), "_canonicalName", null);
        setField(term104072, term104072.getClass(), "_class", null);
        setIntField(term104072, term104072.getClass(), "_hash", 0);
        setField(term104072, term104072.getClass(), "_valueHandler", null);
        setField(term104072, term104072.getClass(), "_typeHandler", null);
        setBooleanField(term104072, term104072.getClass(), "_asStatic", false);
        setField(term104071, term104071.getClass(), "_beanType", term104072);
        setField(term104071, term104071.getClass(), "_serializationShape", null);
        setField(term104071, term104071.getClass(), "_valueInstantiator", null);
        setField(term104071, term104071.getClass(), "_delegateDeserializer", null);
        setField(term104071, term104071.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term104071, term104071.getClass(), "_nonStandardCreation", false);
        setBooleanField(term104071, term104071.getClass(), "_vanillaProcessing", false);
        setField(term104071, term104071.getClass(), "_beanProperties", null);
        setField(term104071, term104071.getClass(), "_injectables", null);
        setField(term104071, term104071.getClass(), "_anySetter", null);
        setField(term104071, term104071.getClass(), "_ignorableProps", null);
        setBooleanField(term104071, term104071.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term104071, term104071.getClass(), "_needViewProcesing", false);
        setField(term104071, term104071.getClass(), "_backRefs", null);
        setField(term104071, term104071.getClass(), "_subDeserializers", null);
        setField(term104071, term104071.getClass(), "_unwrappedPropertyHandler", null);
        setField(term104071, term104071.getClass(), "_externalTypeIdHandler", null);
        setField(term104071, term104071.getClass(), "_objectIdReader", null);
        setField(term104071, term104071.getClass(), "_valueClass", null);
        term104073 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term104074 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term104073, term104073.getClass(), "_classAnnotations", null);
        setField(term104074, term104074.getClass(), "_componentType", null);
        setField(term104074, term104074.getClass(), "_emptyArray", null);
        setField(term104074, term104074.getClass(), "_canonicalName", null);
        setField(term104074, term104074.getClass(), "_class", null);
        setIntField(term104074, term104074.getClass(), "_hash", 0);
        setField(term104074, term104074.getClass(), "_valueHandler", null);
        setField(term104074, term104074.getClass(), "_typeHandler", null);
        setBooleanField(term104074, term104074.getClass(), "_asStatic", false);
        setField(term104073, term104073.getClass(), "_beanType", term104074);
        setField(term104073, term104073.getClass(), "_serializationShape", null);
        setField(term104073, term104073.getClass(), "_valueInstantiator", null);
        setField(term104073, term104073.getClass(), "_delegateDeserializer", null);
        setField(term104073, term104073.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term104073, term104073.getClass(), "_nonStandardCreation", false);
        setBooleanField(term104073, term104073.getClass(), "_vanillaProcessing", false);
        setField(term104073, term104073.getClass(), "_beanProperties", null);
        setField(term104073, term104073.getClass(), "_injectables", null);
        setField(term104073, term104073.getClass(), "_anySetter", null);
        setField(term104073, term104073.getClass(), "_ignorableProps", null);
        setBooleanField(term104073, term104073.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term104073, term104073.getClass(), "_needViewProcesing", false);
        setField(term104073, term104073.getClass(), "_backRefs", null);
        setField(term104073, term104073.getClass(), "_subDeserializers", null);
        setField(term104073, term104073.getClass(), "_unwrappedPropertyHandler", null);
        setField(term104073, term104073.getClass(), "_externalTypeIdHandler", null);
        setField(term104073, term104073.getClass(), "_objectIdReader", null);
        setField(term104073, term104073.getClass(), "_valueClass", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader");
        Object[] args = new Object[2];
        args[0] = term103956;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term104071));
        assertTrue(recursiveEquals(term103956, term104073));
    }

};


