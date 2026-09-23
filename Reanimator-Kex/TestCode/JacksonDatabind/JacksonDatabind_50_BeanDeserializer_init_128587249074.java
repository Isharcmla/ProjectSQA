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

public class BeanDeserializer_init_128587249074 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10780;
     Object term11354;
     Object term11356;

    public BeanDeserializer_init_128587249074() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term10668 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        term10780 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term10878 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(term10780, term10780.getClass(), "_beanType", term10878);
        term11354 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term11355 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(term11354, term11354.getClass(), "_nullFromCreator", null);
        setField(term11354, term11354.getClass(), "_classAnnotations", null);
        setField(term11355, term11355.getClass(), "_superClass", null);
        setField(term11355, term11355.getClass(), "_superInterfaces", null);
        setField(term11355, term11355.getClass(), "_bindings", null);
        setField(term11355, term11355.getClass(), "_canonicalName", null);
        setField(term11355, term11355.getClass(), "_class", null);
        setIntField(term11355, term11355.getClass(), "_hash", 0);
        setField(term11355, term11355.getClass(), "_valueHandler", null);
        setField(term11355, term11355.getClass(), "_typeHandler", null);
        setBooleanField(term11355, term11355.getClass(), "_asStatic", false);
        setField(term11354, term11354.getClass(), "_beanType", term11355);
        setField(term11354, term11354.getClass(), "_serializationShape", null);
        setField(term11354, term11354.getClass(), "_valueInstantiator", null);
        setField(term11354, term11354.getClass(), "_delegateDeserializer", null);
        setField(term11354, term11354.getClass(), "_arrayDelegateDeserializer", null);
        setField(term11354, term11354.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term11354, term11354.getClass(), "_nonStandardCreation", false);
        setBooleanField(term11354, term11354.getClass(), "_vanillaProcessing", false);
        setField(term11354, term11354.getClass(), "_beanProperties", null);
        setField(term11354, term11354.getClass(), "_injectables", null);
        setField(term11354, term11354.getClass(), "_anySetter", null);
        setField(term11354, term11354.getClass(), "_ignorableProps", null);
        setBooleanField(term11354, term11354.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term11354, term11354.getClass(), "_needViewProcesing", false);
        setField(term11354, term11354.getClass(), "_backRefs", null);
        setField(term11354, term11354.getClass(), "_subDeserializers", null);
        setField(term11354, term11354.getClass(), "_unwrappedPropertyHandler", null);
        setField(term11354, term11354.getClass(), "_externalTypeIdHandler", null);
        setField(term11354, term11354.getClass(), "_objectIdReader", null);
        setField(term11354, term11354.getClass(), "_valueClass", null);
        term11356 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term11357 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(term11356, term11356.getClass(), "_nullFromCreator", null);
        setField(term11356, term11356.getClass(), "_classAnnotations", null);
        setField(term11357, term11357.getClass(), "_superClass", null);
        setField(term11357, term11357.getClass(), "_superInterfaces", null);
        setField(term11357, term11357.getClass(), "_bindings", null);
        setField(term11357, term11357.getClass(), "_canonicalName", null);
        setField(term11357, term11357.getClass(), "_class", null);
        setIntField(term11357, term11357.getClass(), "_hash", 0);
        setField(term11357, term11357.getClass(), "_valueHandler", null);
        setField(term11357, term11357.getClass(), "_typeHandler", null);
        setBooleanField(term11357, term11357.getClass(), "_asStatic", false);
        setField(term11356, term11356.getClass(), "_beanType", term11357);
        setField(term11356, term11356.getClass(), "_serializationShape", null);
        setField(term11356, term11356.getClass(), "_valueInstantiator", null);
        setField(term11356, term11356.getClass(), "_delegateDeserializer", null);
        setField(term11356, term11356.getClass(), "_arrayDelegateDeserializer", null);
        setField(term11356, term11356.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term11356, term11356.getClass(), "_nonStandardCreation", false);
        setBooleanField(term11356, term11356.getClass(), "_vanillaProcessing", false);
        setField(term11356, term11356.getClass(), "_beanProperties", null);
        setField(term11356, term11356.getClass(), "_injectables", null);
        setField(term11356, term11356.getClass(), "_anySetter", null);
        setField(term11356, term11356.getClass(), "_ignorableProps", null);
        setBooleanField(term11356, term11356.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term11356, term11356.getClass(), "_needViewProcesing", false);
        setField(term11356, term11356.getClass(), "_backRefs", null);
        setField(term11356, term11356.getClass(), "_subDeserializers", null);
        setField(term11356, term11356.getClass(), "_unwrappedPropertyHandler", null);
        setField(term11356, term11356.getClass(), "_externalTypeIdHandler", null);
        setField(term11356, term11356.getClass(), "_objectIdReader", null);
        setField(term11356, term11356.getClass(), "_valueClass", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term10780;
        args[1] = false;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term11354));
        assertTrue(recursiveEquals(term10780, term11356));
    }

};


