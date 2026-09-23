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

public class BeanDeserializer_init_47653167085 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17718;
     Object term17829;
     Object term17831;

    public BeanDeserializer_init_47653167085() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term17606 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        term17718 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term17810 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setBooleanField(term17718, term17718.getClass(), "_ignoreAllUnknown", false);
        setField(term17718, term17718.getClass(), "_beanType", term17810);
        term17829 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term17830 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term17829, term17829.getClass(), "_classAnnotations", null);
        setField(term17830, term17830.getClass(), "_keyType", null);
        setField(term17830, term17830.getClass(), "_valueType", null);
        setField(term17830, term17830.getClass(), "_canonicalName", null);
        setField(term17830, term17830.getClass(), "_class", null);
        setIntField(term17830, term17830.getClass(), "_hash", 0);
        setField(term17830, term17830.getClass(), "_valueHandler", null);
        setField(term17830, term17830.getClass(), "_typeHandler", null);
        setBooleanField(term17830, term17830.getClass(), "_asStatic", false);
        setField(term17829, term17829.getClass(), "_beanType", term17830);
        setField(term17829, term17829.getClass(), "_serializationShape", null);
        setField(term17829, term17829.getClass(), "_valueInstantiator", null);
        setField(term17829, term17829.getClass(), "_delegateDeserializer", null);
        setField(term17829, term17829.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term17829, term17829.getClass(), "_nonStandardCreation", false);
        setBooleanField(term17829, term17829.getClass(), "_vanillaProcessing", false);
        setField(term17829, term17829.getClass(), "_beanProperties", null);
        setField(term17829, term17829.getClass(), "_injectables", null);
        setField(term17829, term17829.getClass(), "_anySetter", null);
        setField(term17829, term17829.getClass(), "_ignorableProps", null);
        setBooleanField(term17829, term17829.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term17829, term17829.getClass(), "_needViewProcesing", false);
        setField(term17829, term17829.getClass(), "_backRefs", null);
        setField(term17829, term17829.getClass(), "_subDeserializers", null);
        setField(term17829, term17829.getClass(), "_unwrappedPropertyHandler", null);
        setField(term17829, term17829.getClass(), "_externalTypeIdHandler", null);
        setField(term17829, term17829.getClass(), "_objectIdReader", null);
        setField(term17829, term17829.getClass(), "_valueClass", null);
        term17831 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term17832 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term17831, term17831.getClass(), "_classAnnotations", null);
        setField(term17832, term17832.getClass(), "_keyType", null);
        setField(term17832, term17832.getClass(), "_valueType", null);
        setField(term17832, term17832.getClass(), "_canonicalName", null);
        setField(term17832, term17832.getClass(), "_class", null);
        setIntField(term17832, term17832.getClass(), "_hash", 0);
        setField(term17832, term17832.getClass(), "_valueHandler", null);
        setField(term17832, term17832.getClass(), "_typeHandler", null);
        setBooleanField(term17832, term17832.getClass(), "_asStatic", false);
        setField(term17831, term17831.getClass(), "_beanType", term17832);
        setField(term17831, term17831.getClass(), "_serializationShape", null);
        setField(term17831, term17831.getClass(), "_valueInstantiator", null);
        setField(term17831, term17831.getClass(), "_delegateDeserializer", null);
        setField(term17831, term17831.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term17831, term17831.getClass(), "_nonStandardCreation", false);
        setBooleanField(term17831, term17831.getClass(), "_vanillaProcessing", false);
        setField(term17831, term17831.getClass(), "_beanProperties", null);
        setField(term17831, term17831.getClass(), "_injectables", null);
        setField(term17831, term17831.getClass(), "_anySetter", null);
        setField(term17831, term17831.getClass(), "_ignorableProps", null);
        setBooleanField(term17831, term17831.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term17831, term17831.getClass(), "_needViewProcesing", false);
        setField(term17831, term17831.getClass(), "_backRefs", null);
        setField(term17831, term17831.getClass(), "_subDeserializers", null);
        setField(term17831, term17831.getClass(), "_unwrappedPropertyHandler", null);
        setField(term17831, term17831.getClass(), "_externalTypeIdHandler", null);
        setField(term17831, term17831.getClass(), "_objectIdReader", null);
        setField(term17831, term17831.getClass(), "_valueClass", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        Object[] args = new Object[1];
        args[0] = term17718;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term17829));
        assertTrue(recursiveEquals(term17718, term17831));
    }

};


