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

public class BeanDeserializer_init_16154342679 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15489;
     Object term15611;
     Object term15613;

    public BeanDeserializer_init_16154342679() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term15377 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        term15489 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term15593 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term15489, term15489.getClass(), "_beanType", term15593);
        term15611 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term15612 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term15611, term15611.getClass(), "_classAnnotations", null);
        setField(term15612, term15612.getClass(), "_referencedType", null);
        setField(term15612, term15612.getClass(), "_typeParametersFor", null);
        setField(term15612, term15612.getClass(), "_typeParameters", null);
        setField(term15612, term15612.getClass(), "_typeNames", null);
        setField(term15612, term15612.getClass(), "_canonicalName", null);
        setField(term15612, term15612.getClass(), "_class", null);
        setIntField(term15612, term15612.getClass(), "_hash", 0);
        setField(term15612, term15612.getClass(), "_valueHandler", null);
        setField(term15612, term15612.getClass(), "_typeHandler", null);
        setBooleanField(term15612, term15612.getClass(), "_asStatic", false);
        setField(term15611, term15611.getClass(), "_beanType", term15612);
        setField(term15611, term15611.getClass(), "_serializationShape", null);
        setField(term15611, term15611.getClass(), "_valueInstantiator", null);
        setField(term15611, term15611.getClass(), "_delegateDeserializer", null);
        setField(term15611, term15611.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term15611, term15611.getClass(), "_nonStandardCreation", false);
        setBooleanField(term15611, term15611.getClass(), "_vanillaProcessing", false);
        setField(term15611, term15611.getClass(), "_beanProperties", null);
        setField(term15611, term15611.getClass(), "_injectables", null);
        setField(term15611, term15611.getClass(), "_anySetter", null);
        setField(term15611, term15611.getClass(), "_ignorableProps", null);
        setBooleanField(term15611, term15611.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term15611, term15611.getClass(), "_needViewProcesing", false);
        setField(term15611, term15611.getClass(), "_backRefs", null);
        setField(term15611, term15611.getClass(), "_subDeserializers", null);
        setField(term15611, term15611.getClass(), "_unwrappedPropertyHandler", null);
        setField(term15611, term15611.getClass(), "_externalTypeIdHandler", null);
        setField(term15611, term15611.getClass(), "_objectIdReader", null);
        setField(term15611, term15611.getClass(), "_valueClass", null);
        term15613 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term15614 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term15613, term15613.getClass(), "_classAnnotations", null);
        setField(term15614, term15614.getClass(), "_referencedType", null);
        setField(term15614, term15614.getClass(), "_typeParametersFor", null);
        setField(term15614, term15614.getClass(), "_typeParameters", null);
        setField(term15614, term15614.getClass(), "_typeNames", null);
        setField(term15614, term15614.getClass(), "_canonicalName", null);
        setField(term15614, term15614.getClass(), "_class", null);
        setIntField(term15614, term15614.getClass(), "_hash", 0);
        setField(term15614, term15614.getClass(), "_valueHandler", null);
        setField(term15614, term15614.getClass(), "_typeHandler", null);
        setBooleanField(term15614, term15614.getClass(), "_asStatic", false);
        setField(term15613, term15613.getClass(), "_beanType", term15614);
        setField(term15613, term15613.getClass(), "_serializationShape", null);
        setField(term15613, term15613.getClass(), "_valueInstantiator", null);
        setField(term15613, term15613.getClass(), "_delegateDeserializer", null);
        setField(term15613, term15613.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term15613, term15613.getClass(), "_nonStandardCreation", false);
        setBooleanField(term15613, term15613.getClass(), "_vanillaProcessing", false);
        setField(term15613, term15613.getClass(), "_beanProperties", null);
        setField(term15613, term15613.getClass(), "_injectables", null);
        setField(term15613, term15613.getClass(), "_anySetter", null);
        setField(term15613, term15613.getClass(), "_ignorableProps", null);
        setBooleanField(term15613, term15613.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term15613, term15613.getClass(), "_needViewProcesing", false);
        setField(term15613, term15613.getClass(), "_backRefs", null);
        setField(term15613, term15613.getClass(), "_subDeserializers", null);
        setField(term15613, term15613.getClass(), "_unwrappedPropertyHandler", null);
        setField(term15613, term15613.getClass(), "_externalTypeIdHandler", null);
        setField(term15613, term15613.getClass(), "_objectIdReader", null);
        setField(term15613, term15613.getClass(), "_valueClass", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        argTypes[1] = Class.forName("java.util.HashSet");
        Object[] args = new Object[2];
        args[0] = term15489;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term15611));
        assertTrue(recursiveEquals(term15489, term15613));
    }

};


