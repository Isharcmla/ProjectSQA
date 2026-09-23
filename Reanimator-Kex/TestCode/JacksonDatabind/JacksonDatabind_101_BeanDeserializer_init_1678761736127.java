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

public class BeanDeserializer_init_1678761736127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28819;
     Object term28946;
     Object term28948;

    public BeanDeserializer_init_1678761736127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term28707 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        term28819 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term28925 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term28819, term28819.getClass(), "_beanType", term28925);
        term28946 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term28947 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term28946, term28946.getClass(), "_nullFromCreator", null);
        setField(term28946, term28946.getClass(), "_currentlyTransforming", null);
        setField(term28947, term28947.getClass(), "_elementType", null);
        setField(term28947, term28947.getClass(), "_superClass", null);
        setField(term28947, term28947.getClass(), "_superInterfaces", null);
        setField(term28947, term28947.getClass(), "_bindings", null);
        setField(term28947, term28947.getClass(), "_canonicalName", null);
        setField(term28947, term28947.getClass(), "_class", null);
        setIntField(term28947, term28947.getClass(), "_hash", 0);
        setField(term28947, term28947.getClass(), "_valueHandler", null);
        setField(term28947, term28947.getClass(), "_typeHandler", null);
        setBooleanField(term28947, term28947.getClass(), "_asStatic", false);
        setField(term28946, term28946.getClass(), "_beanType", term28947);
        setField(term28946, term28946.getClass(), "_serializationShape", null);
        setField(term28946, term28946.getClass(), "_valueInstantiator", null);
        setField(term28946, term28946.getClass(), "_delegateDeserializer", null);
        setField(term28946, term28946.getClass(), "_arrayDelegateDeserializer", null);
        setField(term28946, term28946.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term28946, term28946.getClass(), "_nonStandardCreation", false);
        setBooleanField(term28946, term28946.getClass(), "_vanillaProcessing", false);
        setField(term28946, term28946.getClass(), "_beanProperties", null);
        setField(term28946, term28946.getClass(), "_injectables", null);
        setField(term28946, term28946.getClass(), "_anySetter", null);
        setField(term28946, term28946.getClass(), "_ignorableProps", null);
        setBooleanField(term28946, term28946.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term28946, term28946.getClass(), "_needViewProcesing", false);
        setField(term28946, term28946.getClass(), "_backRefs", null);
        setField(term28946, term28946.getClass(), "_subDeserializers", null);
        setField(term28946, term28946.getClass(), "_unwrappedPropertyHandler", null);
        setField(term28946, term28946.getClass(), "_externalTypeIdHandler", null);
        setField(term28946, term28946.getClass(), "_objectIdReader", null);
        setField(term28946, term28946.getClass(), "_valueClass", null);
        term28948 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term28949 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term28948, term28948.getClass(), "_nullFromCreator", null);
        setField(term28948, term28948.getClass(), "_currentlyTransforming", null);
        setField(term28949, term28949.getClass(), "_elementType", null);
        setField(term28949, term28949.getClass(), "_superClass", null);
        setField(term28949, term28949.getClass(), "_superInterfaces", null);
        setField(term28949, term28949.getClass(), "_bindings", null);
        setField(term28949, term28949.getClass(), "_canonicalName", null);
        setField(term28949, term28949.getClass(), "_class", null);
        setIntField(term28949, term28949.getClass(), "_hash", 0);
        setField(term28949, term28949.getClass(), "_valueHandler", null);
        setField(term28949, term28949.getClass(), "_typeHandler", null);
        setBooleanField(term28949, term28949.getClass(), "_asStatic", false);
        setField(term28948, term28948.getClass(), "_beanType", term28949);
        setField(term28948, term28948.getClass(), "_serializationShape", null);
        setField(term28948, term28948.getClass(), "_valueInstantiator", null);
        setField(term28948, term28948.getClass(), "_delegateDeserializer", null);
        setField(term28948, term28948.getClass(), "_arrayDelegateDeserializer", null);
        setField(term28948, term28948.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term28948, term28948.getClass(), "_nonStandardCreation", false);
        setBooleanField(term28948, term28948.getClass(), "_vanillaProcessing", false);
        setField(term28948, term28948.getClass(), "_beanProperties", null);
        setField(term28948, term28948.getClass(), "_injectables", null);
        setField(term28948, term28948.getClass(), "_anySetter", null);
        setField(term28948, term28948.getClass(), "_ignorableProps", null);
        setBooleanField(term28948, term28948.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term28948, term28948.getClass(), "_needViewProcesing", false);
        setField(term28948, term28948.getClass(), "_backRefs", null);
        setField(term28948, term28948.getClass(), "_subDeserializers", null);
        setField(term28948, term28948.getClass(), "_unwrappedPropertyHandler", null);
        setField(term28948, term28948.getClass(), "_externalTypeIdHandler", null);
        setField(term28948, term28948.getClass(), "_objectIdReader", null);
        setField(term28948, term28948.getClass(), "_valueClass", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
        Object[] args = new Object[2];
        args[0] = term28819;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term28946));
        assertTrue(recursiveEquals(term28819, term28948));
    }

};


