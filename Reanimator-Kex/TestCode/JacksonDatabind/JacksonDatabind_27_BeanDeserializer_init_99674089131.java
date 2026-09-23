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

public class BeanDeserializer_init_99674089131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41376;
     Object term41487;
     Object term41489;

    public BeanDeserializer_init_99674089131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term41264 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        term41376 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term41468 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term41376, term41376.getClass(), "_beanType", term41468);
        term41487 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term41488 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term41487, term41487.getClass(), "_classAnnotations", null);
        setField(term41488, term41488.getClass(), "_keyType", null);
        setField(term41488, term41488.getClass(), "_valueType", null);
        setField(term41488, term41488.getClass(), "_canonicalName", null);
        setField(term41488, term41488.getClass(), "_class", null);
        setIntField(term41488, term41488.getClass(), "_hash", 0);
        setField(term41488, term41488.getClass(), "_valueHandler", null);
        setField(term41488, term41488.getClass(), "_typeHandler", null);
        setBooleanField(term41488, term41488.getClass(), "_asStatic", false);
        setField(term41487, term41487.getClass(), "_beanType", term41488);
        setField(term41487, term41487.getClass(), "_serializationShape", null);
        setField(term41487, term41487.getClass(), "_valueInstantiator", null);
        setField(term41487, term41487.getClass(), "_delegateDeserializer", null);
        setField(term41487, term41487.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term41487, term41487.getClass(), "_nonStandardCreation", false);
        setBooleanField(term41487, term41487.getClass(), "_vanillaProcessing", false);
        setField(term41487, term41487.getClass(), "_beanProperties", null);
        setField(term41487, term41487.getClass(), "_injectables", null);
        setField(term41487, term41487.getClass(), "_anySetter", null);
        setField(term41487, term41487.getClass(), "_ignorableProps", null);
        setBooleanField(term41487, term41487.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term41487, term41487.getClass(), "_needViewProcesing", false);
        setField(term41487, term41487.getClass(), "_backRefs", null);
        setField(term41487, term41487.getClass(), "_subDeserializers", null);
        setField(term41487, term41487.getClass(), "_unwrappedPropertyHandler", null);
        setField(term41487, term41487.getClass(), "_externalTypeIdHandler", null);
        setField(term41487, term41487.getClass(), "_objectIdReader", null);
        setField(term41487, term41487.getClass(), "_valueClass", null);
        term41489 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term41490 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term41489, term41489.getClass(), "_classAnnotations", null);
        setField(term41490, term41490.getClass(), "_keyType", null);
        setField(term41490, term41490.getClass(), "_valueType", null);
        setField(term41490, term41490.getClass(), "_canonicalName", null);
        setField(term41490, term41490.getClass(), "_class", null);
        setIntField(term41490, term41490.getClass(), "_hash", 0);
        setField(term41490, term41490.getClass(), "_valueHandler", null);
        setField(term41490, term41490.getClass(), "_typeHandler", null);
        setBooleanField(term41490, term41490.getClass(), "_asStatic", false);
        setField(term41489, term41489.getClass(), "_beanType", term41490);
        setField(term41489, term41489.getClass(), "_serializationShape", null);
        setField(term41489, term41489.getClass(), "_valueInstantiator", null);
        setField(term41489, term41489.getClass(), "_delegateDeserializer", null);
        setField(term41489, term41489.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term41489, term41489.getClass(), "_nonStandardCreation", false);
        setBooleanField(term41489, term41489.getClass(), "_vanillaProcessing", false);
        setField(term41489, term41489.getClass(), "_beanProperties", null);
        setField(term41489, term41489.getClass(), "_injectables", null);
        setField(term41489, term41489.getClass(), "_anySetter", null);
        setField(term41489, term41489.getClass(), "_ignorableProps", null);
        setBooleanField(term41489, term41489.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term41489, term41489.getClass(), "_needViewProcesing", false);
        setField(term41489, term41489.getClass(), "_backRefs", null);
        setField(term41489, term41489.getClass(), "_subDeserializers", null);
        setField(term41489, term41489.getClass(), "_unwrappedPropertyHandler", null);
        setField(term41489, term41489.getClass(), "_externalTypeIdHandler", null);
        setField(term41489, term41489.getClass(), "_objectIdReader", null);
        setField(term41489, term41489.getClass(), "_valueClass", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader");
        Object[] args = new Object[2];
        args[0] = term41376;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term41487));
        assertTrue(recursiveEquals(term41376, term41489));
    }

};


