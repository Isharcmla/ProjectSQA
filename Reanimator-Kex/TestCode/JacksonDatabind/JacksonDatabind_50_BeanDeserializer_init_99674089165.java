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

public class BeanDeserializer_init_99674089165 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78851;
     Object term78976;
     Object term78978;

    public BeanDeserializer_init_99674089165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term78739 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        term78851 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term78957 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term78851, term78851.getClass(), "_beanType", term78957);
        term78976 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term78977 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term78976, term78976.getClass(), "_nullFromCreator", null);
        setField(term78976, term78976.getClass(), "_classAnnotations", null);
        setField(term78977, term78977.getClass(), "_elementType", null);
        setField(term78977, term78977.getClass(), "_superClass", null);
        setField(term78977, term78977.getClass(), "_superInterfaces", null);
        setField(term78977, term78977.getClass(), "_bindings", null);
        setField(term78977, term78977.getClass(), "_canonicalName", null);
        setField(term78977, term78977.getClass(), "_class", null);
        setIntField(term78977, term78977.getClass(), "_hash", 0);
        setField(term78977, term78977.getClass(), "_valueHandler", null);
        setField(term78977, term78977.getClass(), "_typeHandler", null);
        setBooleanField(term78977, term78977.getClass(), "_asStatic", false);
        setField(term78976, term78976.getClass(), "_beanType", term78977);
        setField(term78976, term78976.getClass(), "_serializationShape", null);
        setField(term78976, term78976.getClass(), "_valueInstantiator", null);
        setField(term78976, term78976.getClass(), "_delegateDeserializer", null);
        setField(term78976, term78976.getClass(), "_arrayDelegateDeserializer", null);
        setField(term78976, term78976.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term78976, term78976.getClass(), "_nonStandardCreation", false);
        setBooleanField(term78976, term78976.getClass(), "_vanillaProcessing", false);
        setField(term78976, term78976.getClass(), "_beanProperties", null);
        setField(term78976, term78976.getClass(), "_injectables", null);
        setField(term78976, term78976.getClass(), "_anySetter", null);
        setField(term78976, term78976.getClass(), "_ignorableProps", null);
        setBooleanField(term78976, term78976.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term78976, term78976.getClass(), "_needViewProcesing", false);
        setField(term78976, term78976.getClass(), "_backRefs", null);
        setField(term78976, term78976.getClass(), "_subDeserializers", null);
        setField(term78976, term78976.getClass(), "_unwrappedPropertyHandler", null);
        setField(term78976, term78976.getClass(), "_externalTypeIdHandler", null);
        setField(term78976, term78976.getClass(), "_objectIdReader", null);
        setField(term78976, term78976.getClass(), "_valueClass", null);
        term78978 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term78979 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term78978, term78978.getClass(), "_nullFromCreator", null);
        setField(term78978, term78978.getClass(), "_classAnnotations", null);
        setField(term78979, term78979.getClass(), "_elementType", null);
        setField(term78979, term78979.getClass(), "_superClass", null);
        setField(term78979, term78979.getClass(), "_superInterfaces", null);
        setField(term78979, term78979.getClass(), "_bindings", null);
        setField(term78979, term78979.getClass(), "_canonicalName", null);
        setField(term78979, term78979.getClass(), "_class", null);
        setIntField(term78979, term78979.getClass(), "_hash", 0);
        setField(term78979, term78979.getClass(), "_valueHandler", null);
        setField(term78979, term78979.getClass(), "_typeHandler", null);
        setBooleanField(term78979, term78979.getClass(), "_asStatic", false);
        setField(term78978, term78978.getClass(), "_beanType", term78979);
        setField(term78978, term78978.getClass(), "_serializationShape", null);
        setField(term78978, term78978.getClass(), "_valueInstantiator", null);
        setField(term78978, term78978.getClass(), "_delegateDeserializer", null);
        setField(term78978, term78978.getClass(), "_arrayDelegateDeserializer", null);
        setField(term78978, term78978.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term78978, term78978.getClass(), "_nonStandardCreation", false);
        setBooleanField(term78978, term78978.getClass(), "_vanillaProcessing", false);
        setField(term78978, term78978.getClass(), "_beanProperties", null);
        setField(term78978, term78978.getClass(), "_injectables", null);
        setField(term78978, term78978.getClass(), "_anySetter", null);
        setField(term78978, term78978.getClass(), "_ignorableProps", null);
        setBooleanField(term78978, term78978.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term78978, term78978.getClass(), "_needViewProcesing", false);
        setField(term78978, term78978.getClass(), "_backRefs", null);
        setField(term78978, term78978.getClass(), "_subDeserializers", null);
        setField(term78978, term78978.getClass(), "_unwrappedPropertyHandler", null);
        setField(term78978, term78978.getClass(), "_externalTypeIdHandler", null);
        setField(term78978, term78978.getClass(), "_objectIdReader", null);
        setField(term78978, term78978.getClass(), "_valueClass", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader");
        Object[] args = new Object[2];
        args[0] = term78851;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term78976));
        assertTrue(recursiveEquals(term78851, term78978));
    }

};


