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

public class BeanDeserializer_init_1285872490151 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36038;
     Object term36161;
     Object term36163;

    public BeanDeserializer_init_1285872490151() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term35926 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        term36038 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term36142 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term36038, term36038.getClass(), "_beanType", term36142);
        term36161 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term36162 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term36161, term36161.getClass(), "_nullFromCreator", null);
        setField(term36161, term36161.getClass(), "_currentlyTransforming", null);
        setField(term36162, term36162.getClass(), "_referencedType", null);
        setField(term36162, term36162.getClass(), "_anchorType", null);
        setField(term36162, term36162.getClass(), "_superClass", null);
        setField(term36162, term36162.getClass(), "_superInterfaces", null);
        setField(term36162, term36162.getClass(), "_bindings", null);
        setField(term36162, term36162.getClass(), "_canonicalName", null);
        setField(term36162, term36162.getClass(), "_class", null);
        setIntField(term36162, term36162.getClass(), "_hash", 0);
        setField(term36162, term36162.getClass(), "_valueHandler", null);
        setField(term36162, term36162.getClass(), "_typeHandler", null);
        setBooleanField(term36162, term36162.getClass(), "_asStatic", false);
        setField(term36161, term36161.getClass(), "_beanType", term36162);
        setField(term36161, term36161.getClass(), "_serializationShape", null);
        setField(term36161, term36161.getClass(), "_valueInstantiator", null);
        setField(term36161, term36161.getClass(), "_delegateDeserializer", null);
        setField(term36161, term36161.getClass(), "_arrayDelegateDeserializer", null);
        setField(term36161, term36161.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term36161, term36161.getClass(), "_nonStandardCreation", false);
        setBooleanField(term36161, term36161.getClass(), "_vanillaProcessing", false);
        setField(term36161, term36161.getClass(), "_beanProperties", null);
        setField(term36161, term36161.getClass(), "_injectables", null);
        setField(term36161, term36161.getClass(), "_anySetter", null);
        setField(term36161, term36161.getClass(), "_ignorableProps", null);
        setBooleanField(term36161, term36161.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term36161, term36161.getClass(), "_needViewProcesing", false);
        setField(term36161, term36161.getClass(), "_backRefs", null);
        setField(term36161, term36161.getClass(), "_subDeserializers", null);
        setField(term36161, term36161.getClass(), "_unwrappedPropertyHandler", null);
        setField(term36161, term36161.getClass(), "_externalTypeIdHandler", null);
        setField(term36161, term36161.getClass(), "_objectIdReader", null);
        setField(term36161, term36161.getClass(), "_valueClass", null);
        term36163 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term36164 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term36163, term36163.getClass(), "_nullFromCreator", null);
        setField(term36163, term36163.getClass(), "_currentlyTransforming", null);
        setField(term36164, term36164.getClass(), "_referencedType", null);
        setField(term36164, term36164.getClass(), "_anchorType", null);
        setField(term36164, term36164.getClass(), "_superClass", null);
        setField(term36164, term36164.getClass(), "_superInterfaces", null);
        setField(term36164, term36164.getClass(), "_bindings", null);
        setField(term36164, term36164.getClass(), "_canonicalName", null);
        setField(term36164, term36164.getClass(), "_class", null);
        setIntField(term36164, term36164.getClass(), "_hash", 0);
        setField(term36164, term36164.getClass(), "_valueHandler", null);
        setField(term36164, term36164.getClass(), "_typeHandler", null);
        setBooleanField(term36164, term36164.getClass(), "_asStatic", false);
        setField(term36163, term36163.getClass(), "_beanType", term36164);
        setField(term36163, term36163.getClass(), "_serializationShape", null);
        setField(term36163, term36163.getClass(), "_valueInstantiator", null);
        setField(term36163, term36163.getClass(), "_delegateDeserializer", null);
        setField(term36163, term36163.getClass(), "_arrayDelegateDeserializer", null);
        setField(term36163, term36163.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term36163, term36163.getClass(), "_nonStandardCreation", false);
        setBooleanField(term36163, term36163.getClass(), "_vanillaProcessing", false);
        setField(term36163, term36163.getClass(), "_beanProperties", null);
        setField(term36163, term36163.getClass(), "_injectables", null);
        setField(term36163, term36163.getClass(), "_anySetter", null);
        setField(term36163, term36163.getClass(), "_ignorableProps", null);
        setBooleanField(term36163, term36163.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term36163, term36163.getClass(), "_needViewProcesing", false);
        setField(term36163, term36163.getClass(), "_backRefs", null);
        setField(term36163, term36163.getClass(), "_subDeserializers", null);
        setField(term36163, term36163.getClass(), "_unwrappedPropertyHandler", null);
        setField(term36163, term36163.getClass(), "_externalTypeIdHandler", null);
        setField(term36163, term36163.getClass(), "_objectIdReader", null);
        setField(term36163, term36163.getClass(), "_valueClass", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term36038;
        args[1] = false;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term36161));
        assertTrue(recursiveEquals(term36038, term36163));
    }

};


