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

public class BeanDeserializer_init_476531670115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31138;
     Object term31253;
     Object term31255;

    public BeanDeserializer_init_476531670115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term31026 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        term31138 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term31234 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setBooleanField(term31138, term31138.getClass(), "_ignoreAllUnknown", false);
        setField(term31138, term31138.getClass(), "_beanType", term31234);
        term31253 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term31254 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term31253, term31253.getClass(), "_classAnnotations", null);
        setField(term31254, term31254.getClass(), "_componentType", null);
        setField(term31254, term31254.getClass(), "_emptyArray", null);
        setField(term31254, term31254.getClass(), "_canonicalName", null);
        setField(term31254, term31254.getClass(), "_class", null);
        setIntField(term31254, term31254.getClass(), "_hash", 0);
        setField(term31254, term31254.getClass(), "_valueHandler", null);
        setField(term31254, term31254.getClass(), "_typeHandler", null);
        setBooleanField(term31254, term31254.getClass(), "_asStatic", false);
        setField(term31253, term31253.getClass(), "_beanType", term31254);
        setField(term31253, term31253.getClass(), "_serializationShape", null);
        setField(term31253, term31253.getClass(), "_valueInstantiator", null);
        setField(term31253, term31253.getClass(), "_delegateDeserializer", null);
        setField(term31253, term31253.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term31253, term31253.getClass(), "_nonStandardCreation", false);
        setBooleanField(term31253, term31253.getClass(), "_vanillaProcessing", false);
        setField(term31253, term31253.getClass(), "_beanProperties", null);
        setField(term31253, term31253.getClass(), "_injectables", null);
        setField(term31253, term31253.getClass(), "_anySetter", null);
        setField(term31253, term31253.getClass(), "_ignorableProps", null);
        setBooleanField(term31253, term31253.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term31253, term31253.getClass(), "_needViewProcesing", false);
        setField(term31253, term31253.getClass(), "_backRefs", null);
        setField(term31253, term31253.getClass(), "_subDeserializers", null);
        setField(term31253, term31253.getClass(), "_unwrappedPropertyHandler", null);
        setField(term31253, term31253.getClass(), "_externalTypeIdHandler", null);
        setField(term31253, term31253.getClass(), "_objectIdReader", null);
        setField(term31253, term31253.getClass(), "_valueClass", null);
        term31255 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term31256 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term31255, term31255.getClass(), "_classAnnotations", null);
        setField(term31256, term31256.getClass(), "_componentType", null);
        setField(term31256, term31256.getClass(), "_emptyArray", null);
        setField(term31256, term31256.getClass(), "_canonicalName", null);
        setField(term31256, term31256.getClass(), "_class", null);
        setIntField(term31256, term31256.getClass(), "_hash", 0);
        setField(term31256, term31256.getClass(), "_valueHandler", null);
        setField(term31256, term31256.getClass(), "_typeHandler", null);
        setBooleanField(term31256, term31256.getClass(), "_asStatic", false);
        setField(term31255, term31255.getClass(), "_beanType", term31256);
        setField(term31255, term31255.getClass(), "_serializationShape", null);
        setField(term31255, term31255.getClass(), "_valueInstantiator", null);
        setField(term31255, term31255.getClass(), "_delegateDeserializer", null);
        setField(term31255, term31255.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term31255, term31255.getClass(), "_nonStandardCreation", false);
        setBooleanField(term31255, term31255.getClass(), "_vanillaProcessing", false);
        setField(term31255, term31255.getClass(), "_beanProperties", null);
        setField(term31255, term31255.getClass(), "_injectables", null);
        setField(term31255, term31255.getClass(), "_anySetter", null);
        setField(term31255, term31255.getClass(), "_ignorableProps", null);
        setBooleanField(term31255, term31255.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term31255, term31255.getClass(), "_needViewProcesing", false);
        setField(term31255, term31255.getClass(), "_backRefs", null);
        setField(term31255, term31255.getClass(), "_subDeserializers", null);
        setField(term31255, term31255.getClass(), "_unwrappedPropertyHandler", null);
        setField(term31255, term31255.getClass(), "_externalTypeIdHandler", null);
        setField(term31255, term31255.getClass(), "_objectIdReader", null);
        setField(term31255, term31255.getClass(), "_valueClass", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        Object[] args = new Object[1];
        args[0] = term31138;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term31253));
        assertTrue(recursiveEquals(term31138, term31255));
    }

};


