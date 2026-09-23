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

public class BeanDeserializer_init_476531670117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35148;
     Object term35267;
     Object term35269;

    public BeanDeserializer_init_476531670117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term35036 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        term35148 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term35248 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        setBooleanField(term35148, term35148.getClass(), "_ignoreAllUnknown", false);
        setField(term35148, term35148.getClass(), "_beanType", term35248);
        term35267 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term35268 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(term35267, term35267.getClass(), "_nullFromCreator", null);
        setField(term35267, term35267.getClass(), "_classAnnotations", null);
        setField(term35268, term35268.getClass(), "_keyType", null);
        setField(term35268, term35268.getClass(), "_valueType", null);
        setField(term35268, term35268.getClass(), "_superClass", null);
        setField(term35268, term35268.getClass(), "_superInterfaces", null);
        setField(term35268, term35268.getClass(), "_bindings", null);
        setField(term35268, term35268.getClass(), "_canonicalName", null);
        setField(term35268, term35268.getClass(), "_class", null);
        setIntField(term35268, term35268.getClass(), "_hash", 0);
        setField(term35268, term35268.getClass(), "_valueHandler", null);
        setField(term35268, term35268.getClass(), "_typeHandler", null);
        setBooleanField(term35268, term35268.getClass(), "_asStatic", false);
        setField(term35267, term35267.getClass(), "_beanType", term35268);
        setField(term35267, term35267.getClass(), "_serializationShape", null);
        setField(term35267, term35267.getClass(), "_valueInstantiator", null);
        setField(term35267, term35267.getClass(), "_delegateDeserializer", null);
        setField(term35267, term35267.getClass(), "_arrayDelegateDeserializer", null);
        setField(term35267, term35267.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term35267, term35267.getClass(), "_nonStandardCreation", false);
        setBooleanField(term35267, term35267.getClass(), "_vanillaProcessing", false);
        setField(term35267, term35267.getClass(), "_beanProperties", null);
        setField(term35267, term35267.getClass(), "_injectables", null);
        setField(term35267, term35267.getClass(), "_anySetter", null);
        setField(term35267, term35267.getClass(), "_ignorableProps", null);
        setBooleanField(term35267, term35267.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term35267, term35267.getClass(), "_needViewProcesing", false);
        setField(term35267, term35267.getClass(), "_backRefs", null);
        setField(term35267, term35267.getClass(), "_subDeserializers", null);
        setField(term35267, term35267.getClass(), "_unwrappedPropertyHandler", null);
        setField(term35267, term35267.getClass(), "_externalTypeIdHandler", null);
        setField(term35267, term35267.getClass(), "_objectIdReader", null);
        setField(term35267, term35267.getClass(), "_valueClass", null);
        term35269 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term35270 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(term35269, term35269.getClass(), "_nullFromCreator", null);
        setField(term35269, term35269.getClass(), "_classAnnotations", null);
        setField(term35270, term35270.getClass(), "_keyType", null);
        setField(term35270, term35270.getClass(), "_valueType", null);
        setField(term35270, term35270.getClass(), "_superClass", null);
        setField(term35270, term35270.getClass(), "_superInterfaces", null);
        setField(term35270, term35270.getClass(), "_bindings", null);
        setField(term35270, term35270.getClass(), "_canonicalName", null);
        setField(term35270, term35270.getClass(), "_class", null);
        setIntField(term35270, term35270.getClass(), "_hash", 0);
        setField(term35270, term35270.getClass(), "_valueHandler", null);
        setField(term35270, term35270.getClass(), "_typeHandler", null);
        setBooleanField(term35270, term35270.getClass(), "_asStatic", false);
        setField(term35269, term35269.getClass(), "_beanType", term35270);
        setField(term35269, term35269.getClass(), "_serializationShape", null);
        setField(term35269, term35269.getClass(), "_valueInstantiator", null);
        setField(term35269, term35269.getClass(), "_delegateDeserializer", null);
        setField(term35269, term35269.getClass(), "_arrayDelegateDeserializer", null);
        setField(term35269, term35269.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term35269, term35269.getClass(), "_nonStandardCreation", false);
        setBooleanField(term35269, term35269.getClass(), "_vanillaProcessing", false);
        setField(term35269, term35269.getClass(), "_beanProperties", null);
        setField(term35269, term35269.getClass(), "_injectables", null);
        setField(term35269, term35269.getClass(), "_anySetter", null);
        setField(term35269, term35269.getClass(), "_ignorableProps", null);
        setBooleanField(term35269, term35269.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term35269, term35269.getClass(), "_needViewProcesing", false);
        setField(term35269, term35269.getClass(), "_backRefs", null);
        setField(term35269, term35269.getClass(), "_subDeserializers", null);
        setField(term35269, term35269.getClass(), "_unwrappedPropertyHandler", null);
        setField(term35269, term35269.getClass(), "_externalTypeIdHandler", null);
        setField(term35269, term35269.getClass(), "_objectIdReader", null);
        setField(term35269, term35269.getClass(), "_valueClass", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        Object[] args = new Object[1];
        args[0] = term35148;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term35267));
        assertTrue(recursiveEquals(term35148, term35269));
    }

};


