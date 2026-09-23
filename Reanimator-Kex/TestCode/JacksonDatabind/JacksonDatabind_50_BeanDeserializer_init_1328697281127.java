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

public class BeanDeserializer_init_1328697281127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46779;
     Object term46889;
     Object term46891;

    public BeanDeserializer_init_1328697281127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term46667 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        term46779 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term46871 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term46779, term46779.getClass(), "_beanType", term46871);
        term46889 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term46890 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term46889, term46889.getClass(), "_nullFromCreator", null);
        setField(term46889, term46889.getClass(), "_classAnnotations", null);
        setField(term46890, term46890.getClass(), "_keyType", null);
        setField(term46890, term46890.getClass(), "_valueType", null);
        setField(term46890, term46890.getClass(), "_superClass", null);
        setField(term46890, term46890.getClass(), "_superInterfaces", null);
        setField(term46890, term46890.getClass(), "_bindings", null);
        setField(term46890, term46890.getClass(), "_canonicalName", null);
        setField(term46890, term46890.getClass(), "_class", null);
        setIntField(term46890, term46890.getClass(), "_hash", 0);
        setField(term46890, term46890.getClass(), "_valueHandler", null);
        setField(term46890, term46890.getClass(), "_typeHandler", null);
        setBooleanField(term46890, term46890.getClass(), "_asStatic", false);
        setField(term46889, term46889.getClass(), "_beanType", term46890);
        setField(term46889, term46889.getClass(), "_serializationShape", null);
        setField(term46889, term46889.getClass(), "_valueInstantiator", null);
        setField(term46889, term46889.getClass(), "_delegateDeserializer", null);
        setField(term46889, term46889.getClass(), "_arrayDelegateDeserializer", null);
        setField(term46889, term46889.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term46889, term46889.getClass(), "_nonStandardCreation", false);
        setBooleanField(term46889, term46889.getClass(), "_vanillaProcessing", false);
        setField(term46889, term46889.getClass(), "_beanProperties", null);
        setField(term46889, term46889.getClass(), "_injectables", null);
        setField(term46889, term46889.getClass(), "_anySetter", null);
        setField(term46889, term46889.getClass(), "_ignorableProps", null);
        setBooleanField(term46889, term46889.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term46889, term46889.getClass(), "_needViewProcesing", false);
        setField(term46889, term46889.getClass(), "_backRefs", null);
        setField(term46889, term46889.getClass(), "_subDeserializers", null);
        setField(term46889, term46889.getClass(), "_unwrappedPropertyHandler", null);
        setField(term46889, term46889.getClass(), "_externalTypeIdHandler", null);
        setField(term46889, term46889.getClass(), "_objectIdReader", null);
        setField(term46889, term46889.getClass(), "_valueClass", null);
        term46891 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term46892 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term46891, term46891.getClass(), "_nullFromCreator", null);
        setField(term46891, term46891.getClass(), "_classAnnotations", null);
        setField(term46892, term46892.getClass(), "_keyType", null);
        setField(term46892, term46892.getClass(), "_valueType", null);
        setField(term46892, term46892.getClass(), "_superClass", null);
        setField(term46892, term46892.getClass(), "_superInterfaces", null);
        setField(term46892, term46892.getClass(), "_bindings", null);
        setField(term46892, term46892.getClass(), "_canonicalName", null);
        setField(term46892, term46892.getClass(), "_class", null);
        setIntField(term46892, term46892.getClass(), "_hash", 0);
        setField(term46892, term46892.getClass(), "_valueHandler", null);
        setField(term46892, term46892.getClass(), "_typeHandler", null);
        setBooleanField(term46892, term46892.getClass(), "_asStatic", false);
        setField(term46891, term46891.getClass(), "_beanType", term46892);
        setField(term46891, term46891.getClass(), "_serializationShape", null);
        setField(term46891, term46891.getClass(), "_valueInstantiator", null);
        setField(term46891, term46891.getClass(), "_delegateDeserializer", null);
        setField(term46891, term46891.getClass(), "_arrayDelegateDeserializer", null);
        setField(term46891, term46891.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term46891, term46891.getClass(), "_nonStandardCreation", false);
        setBooleanField(term46891, term46891.getClass(), "_vanillaProcessing", false);
        setField(term46891, term46891.getClass(), "_beanProperties", null);
        setField(term46891, term46891.getClass(), "_injectables", null);
        setField(term46891, term46891.getClass(), "_anySetter", null);
        setField(term46891, term46891.getClass(), "_ignorableProps", null);
        setBooleanField(term46891, term46891.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term46891, term46891.getClass(), "_needViewProcesing", false);
        setField(term46891, term46891.getClass(), "_backRefs", null);
        setField(term46891, term46891.getClass(), "_subDeserializers", null);
        setField(term46891, term46891.getClass(), "_unwrappedPropertyHandler", null);
        setField(term46891, term46891.getClass(), "_externalTypeIdHandler", null);
        setField(term46891, term46891.getClass(), "_objectIdReader", null);
        setField(term46891, term46891.getClass(), "_valueClass", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap");
        Object[] args = new Object[2];
        args[0] = term46779;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term46889));
        assertTrue(recursiveEquals(term46779, term46891));
    }

};


