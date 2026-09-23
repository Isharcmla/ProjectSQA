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

public class BeanDeserializer_init_128587249093 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26858;
     Object term27029;
     Object term27031;

    public BeanDeserializer_init_128587249093() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term26746 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        term26858 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term26962 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term26858, term26858.getClass(), "_beanType", term26962);
        term27029 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term27030 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term27029, term27029.getClass(), "_classAnnotations", null);
        setField(term27030, term27030.getClass(), "_referencedType", null);
        setField(term27030, term27030.getClass(), "_typeParametersFor", null);
        setField(term27030, term27030.getClass(), "_typeParameters", null);
        setField(term27030, term27030.getClass(), "_typeNames", null);
        setField(term27030, term27030.getClass(), "_canonicalName", null);
        setField(term27030, term27030.getClass(), "_class", null);
        setIntField(term27030, term27030.getClass(), "_hash", 0);
        setField(term27030, term27030.getClass(), "_valueHandler", null);
        setField(term27030, term27030.getClass(), "_typeHandler", null);
        setBooleanField(term27030, term27030.getClass(), "_asStatic", false);
        setField(term27029, term27029.getClass(), "_beanType", term27030);
        setField(term27029, term27029.getClass(), "_serializationShape", null);
        setField(term27029, term27029.getClass(), "_valueInstantiator", null);
        setField(term27029, term27029.getClass(), "_delegateDeserializer", null);
        setField(term27029, term27029.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term27029, term27029.getClass(), "_nonStandardCreation", false);
        setBooleanField(term27029, term27029.getClass(), "_vanillaProcessing", false);
        setField(term27029, term27029.getClass(), "_beanProperties", null);
        setField(term27029, term27029.getClass(), "_injectables", null);
        setField(term27029, term27029.getClass(), "_anySetter", null);
        setField(term27029, term27029.getClass(), "_ignorableProps", null);
        setBooleanField(term27029, term27029.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term27029, term27029.getClass(), "_needViewProcesing", false);
        setField(term27029, term27029.getClass(), "_backRefs", null);
        setField(term27029, term27029.getClass(), "_subDeserializers", null);
        setField(term27029, term27029.getClass(), "_unwrappedPropertyHandler", null);
        setField(term27029, term27029.getClass(), "_externalTypeIdHandler", null);
        setField(term27029, term27029.getClass(), "_objectIdReader", null);
        setField(term27029, term27029.getClass(), "_valueClass", null);
        term27031 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term27032 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term27031, term27031.getClass(), "_classAnnotations", null);
        setField(term27032, term27032.getClass(), "_referencedType", null);
        setField(term27032, term27032.getClass(), "_typeParametersFor", null);
        setField(term27032, term27032.getClass(), "_typeParameters", null);
        setField(term27032, term27032.getClass(), "_typeNames", null);
        setField(term27032, term27032.getClass(), "_canonicalName", null);
        setField(term27032, term27032.getClass(), "_class", null);
        setIntField(term27032, term27032.getClass(), "_hash", 0);
        setField(term27032, term27032.getClass(), "_valueHandler", null);
        setField(term27032, term27032.getClass(), "_typeHandler", null);
        setBooleanField(term27032, term27032.getClass(), "_asStatic", false);
        setField(term27031, term27031.getClass(), "_beanType", term27032);
        setField(term27031, term27031.getClass(), "_serializationShape", null);
        setField(term27031, term27031.getClass(), "_valueInstantiator", null);
        setField(term27031, term27031.getClass(), "_delegateDeserializer", null);
        setField(term27031, term27031.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term27031, term27031.getClass(), "_nonStandardCreation", false);
        setBooleanField(term27031, term27031.getClass(), "_vanillaProcessing", false);
        setField(term27031, term27031.getClass(), "_beanProperties", null);
        setField(term27031, term27031.getClass(), "_injectables", null);
        setField(term27031, term27031.getClass(), "_anySetter", null);
        setField(term27031, term27031.getClass(), "_ignorableProps", null);
        setBooleanField(term27031, term27031.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term27031, term27031.getClass(), "_needViewProcesing", false);
        setField(term27031, term27031.getClass(), "_backRefs", null);
        setField(term27031, term27031.getClass(), "_subDeserializers", null);
        setField(term27031, term27031.getClass(), "_unwrappedPropertyHandler", null);
        setField(term27031, term27031.getClass(), "_externalTypeIdHandler", null);
        setField(term27031, term27031.getClass(), "_objectIdReader", null);
        setField(term27031, term27031.getClass(), "_valueClass", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term26858;
        args[1] = false;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term27029));
        assertTrue(recursiveEquals(term26858, term27031));
    }

};


