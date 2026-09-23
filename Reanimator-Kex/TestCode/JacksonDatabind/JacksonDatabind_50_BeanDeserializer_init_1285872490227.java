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

public class BeanDeserializer_init_1285872490227 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term142610;
     Object term142725;
     Object term142727;

    public BeanDeserializer_init_1285872490227() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term142498 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        term142610 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term142706 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term142610, term142610.getClass(), "_beanType", term142706);
        term142725 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term142726 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term142725, term142725.getClass(), "_nullFromCreator", null);
        setField(term142725, term142725.getClass(), "_classAnnotations", null);
        setField(term142726, term142726.getClass(), "_componentType", null);
        setField(term142726, term142726.getClass(), "_emptyArray", null);
        setField(term142726, term142726.getClass(), "_superClass", null);
        setField(term142726, term142726.getClass(), "_superInterfaces", null);
        setField(term142726, term142726.getClass(), "_bindings", null);
        setField(term142726, term142726.getClass(), "_canonicalName", null);
        setField(term142726, term142726.getClass(), "_class", null);
        setIntField(term142726, term142726.getClass(), "_hash", 0);
        setField(term142726, term142726.getClass(), "_valueHandler", null);
        setField(term142726, term142726.getClass(), "_typeHandler", null);
        setBooleanField(term142726, term142726.getClass(), "_asStatic", false);
        setField(term142725, term142725.getClass(), "_beanType", term142726);
        setField(term142725, term142725.getClass(), "_serializationShape", null);
        setField(term142725, term142725.getClass(), "_valueInstantiator", null);
        setField(term142725, term142725.getClass(), "_delegateDeserializer", null);
        setField(term142725, term142725.getClass(), "_arrayDelegateDeserializer", null);
        setField(term142725, term142725.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term142725, term142725.getClass(), "_nonStandardCreation", false);
        setBooleanField(term142725, term142725.getClass(), "_vanillaProcessing", false);
        setField(term142725, term142725.getClass(), "_beanProperties", null);
        setField(term142725, term142725.getClass(), "_injectables", null);
        setField(term142725, term142725.getClass(), "_anySetter", null);
        setField(term142725, term142725.getClass(), "_ignorableProps", null);
        setBooleanField(term142725, term142725.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term142725, term142725.getClass(), "_needViewProcesing", false);
        setField(term142725, term142725.getClass(), "_backRefs", null);
        setField(term142725, term142725.getClass(), "_subDeserializers", null);
        setField(term142725, term142725.getClass(), "_unwrappedPropertyHandler", null);
        setField(term142725, term142725.getClass(), "_externalTypeIdHandler", null);
        setField(term142725, term142725.getClass(), "_objectIdReader", null);
        setField(term142725, term142725.getClass(), "_valueClass", null);
        term142727 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term142728 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term142727, term142727.getClass(), "_nullFromCreator", null);
        setField(term142727, term142727.getClass(), "_classAnnotations", null);
        setField(term142728, term142728.getClass(), "_componentType", null);
        setField(term142728, term142728.getClass(), "_emptyArray", null);
        setField(term142728, term142728.getClass(), "_superClass", null);
        setField(term142728, term142728.getClass(), "_superInterfaces", null);
        setField(term142728, term142728.getClass(), "_bindings", null);
        setField(term142728, term142728.getClass(), "_canonicalName", null);
        setField(term142728, term142728.getClass(), "_class", null);
        setIntField(term142728, term142728.getClass(), "_hash", 0);
        setField(term142728, term142728.getClass(), "_valueHandler", null);
        setField(term142728, term142728.getClass(), "_typeHandler", null);
        setBooleanField(term142728, term142728.getClass(), "_asStatic", false);
        setField(term142727, term142727.getClass(), "_beanType", term142728);
        setField(term142727, term142727.getClass(), "_serializationShape", null);
        setField(term142727, term142727.getClass(), "_valueInstantiator", null);
        setField(term142727, term142727.getClass(), "_delegateDeserializer", null);
        setField(term142727, term142727.getClass(), "_arrayDelegateDeserializer", null);
        setField(term142727, term142727.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term142727, term142727.getClass(), "_nonStandardCreation", false);
        setBooleanField(term142727, term142727.getClass(), "_vanillaProcessing", false);
        setField(term142727, term142727.getClass(), "_beanProperties", null);
        setField(term142727, term142727.getClass(), "_injectables", null);
        setField(term142727, term142727.getClass(), "_anySetter", null);
        setField(term142727, term142727.getClass(), "_ignorableProps", null);
        setBooleanField(term142727, term142727.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term142727, term142727.getClass(), "_needViewProcesing", false);
        setField(term142727, term142727.getClass(), "_backRefs", null);
        setField(term142727, term142727.getClass(), "_subDeserializers", null);
        setField(term142727, term142727.getClass(), "_unwrappedPropertyHandler", null);
        setField(term142727, term142727.getClass(), "_externalTypeIdHandler", null);
        setField(term142727, term142727.getClass(), "_objectIdReader", null);
        setField(term142727, term142727.getClass(), "_valueClass", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term142610;
        args[1] = false;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term142725));
        assertTrue(recursiveEquals(term142610, term142727));
    }

};


