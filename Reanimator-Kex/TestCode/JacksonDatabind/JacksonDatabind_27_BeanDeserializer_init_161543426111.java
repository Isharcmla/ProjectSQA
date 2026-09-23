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

public class BeanDeserializer_init_161543426111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30371;
     Object term30493;
     Object term30495;

    public BeanDeserializer_init_161543426111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term30259 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        term30371 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term30475 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term30371, term30371.getClass(), "_beanType", term30475);
        term30493 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term30494 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term30493, term30493.getClass(), "_classAnnotations", null);
        setField(term30494, term30494.getClass(), "_referencedType", null);
        setField(term30494, term30494.getClass(), "_typeParametersFor", null);
        setField(term30494, term30494.getClass(), "_typeParameters", null);
        setField(term30494, term30494.getClass(), "_typeNames", null);
        setField(term30494, term30494.getClass(), "_canonicalName", null);
        setField(term30494, term30494.getClass(), "_class", null);
        setIntField(term30494, term30494.getClass(), "_hash", 0);
        setField(term30494, term30494.getClass(), "_valueHandler", null);
        setField(term30494, term30494.getClass(), "_typeHandler", null);
        setBooleanField(term30494, term30494.getClass(), "_asStatic", false);
        setField(term30493, term30493.getClass(), "_beanType", term30494);
        setField(term30493, term30493.getClass(), "_serializationShape", null);
        setField(term30493, term30493.getClass(), "_valueInstantiator", null);
        setField(term30493, term30493.getClass(), "_delegateDeserializer", null);
        setField(term30493, term30493.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term30493, term30493.getClass(), "_nonStandardCreation", false);
        setBooleanField(term30493, term30493.getClass(), "_vanillaProcessing", false);
        setField(term30493, term30493.getClass(), "_beanProperties", null);
        setField(term30493, term30493.getClass(), "_injectables", null);
        setField(term30493, term30493.getClass(), "_anySetter", null);
        setField(term30493, term30493.getClass(), "_ignorableProps", null);
        setBooleanField(term30493, term30493.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term30493, term30493.getClass(), "_needViewProcesing", false);
        setField(term30493, term30493.getClass(), "_backRefs", null);
        setField(term30493, term30493.getClass(), "_subDeserializers", null);
        setField(term30493, term30493.getClass(), "_unwrappedPropertyHandler", null);
        setField(term30493, term30493.getClass(), "_externalTypeIdHandler", null);
        setField(term30493, term30493.getClass(), "_objectIdReader", null);
        setField(term30493, term30493.getClass(), "_valueClass", null);
        term30495 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term30496 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term30495, term30495.getClass(), "_classAnnotations", null);
        setField(term30496, term30496.getClass(), "_referencedType", null);
        setField(term30496, term30496.getClass(), "_typeParametersFor", null);
        setField(term30496, term30496.getClass(), "_typeParameters", null);
        setField(term30496, term30496.getClass(), "_typeNames", null);
        setField(term30496, term30496.getClass(), "_canonicalName", null);
        setField(term30496, term30496.getClass(), "_class", null);
        setIntField(term30496, term30496.getClass(), "_hash", 0);
        setField(term30496, term30496.getClass(), "_valueHandler", null);
        setField(term30496, term30496.getClass(), "_typeHandler", null);
        setBooleanField(term30496, term30496.getClass(), "_asStatic", false);
        setField(term30495, term30495.getClass(), "_beanType", term30496);
        setField(term30495, term30495.getClass(), "_serializationShape", null);
        setField(term30495, term30495.getClass(), "_valueInstantiator", null);
        setField(term30495, term30495.getClass(), "_delegateDeserializer", null);
        setField(term30495, term30495.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term30495, term30495.getClass(), "_nonStandardCreation", false);
        setBooleanField(term30495, term30495.getClass(), "_vanillaProcessing", false);
        setField(term30495, term30495.getClass(), "_beanProperties", null);
        setField(term30495, term30495.getClass(), "_injectables", null);
        setField(term30495, term30495.getClass(), "_anySetter", null);
        setField(term30495, term30495.getClass(), "_ignorableProps", null);
        setBooleanField(term30495, term30495.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term30495, term30495.getClass(), "_needViewProcesing", false);
        setField(term30495, term30495.getClass(), "_backRefs", null);
        setField(term30495, term30495.getClass(), "_subDeserializers", null);
        setField(term30495, term30495.getClass(), "_unwrappedPropertyHandler", null);
        setField(term30495, term30495.getClass(), "_externalTypeIdHandler", null);
        setField(term30495, term30495.getClass(), "_objectIdReader", null);
        setField(term30495, term30495.getClass(), "_valueClass", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        argTypes[1] = Class.forName("java.util.HashSet");
        Object[] args = new Object[2];
        args[0] = term30371;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term30493));
        assertTrue(recursiveEquals(term30371, term30495));
    }

};


