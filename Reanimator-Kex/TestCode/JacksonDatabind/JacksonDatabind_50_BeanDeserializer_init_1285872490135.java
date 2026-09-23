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

public class BeanDeserializer_init_1285872490135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52126;
     Object term52251;
     Object term52253;

    public BeanDeserializer_init_1285872490135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term52014 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        term52126 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term52232 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term52126, term52126.getClass(), "_beanType", term52232);
        term52251 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term52252 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term52251, term52251.getClass(), "_nullFromCreator", null);
        setField(term52251, term52251.getClass(), "_classAnnotations", null);
        setField(term52252, term52252.getClass(), "_elementType", null);
        setField(term52252, term52252.getClass(), "_superClass", null);
        setField(term52252, term52252.getClass(), "_superInterfaces", null);
        setField(term52252, term52252.getClass(), "_bindings", null);
        setField(term52252, term52252.getClass(), "_canonicalName", null);
        setField(term52252, term52252.getClass(), "_class", null);
        setIntField(term52252, term52252.getClass(), "_hash", 0);
        setField(term52252, term52252.getClass(), "_valueHandler", null);
        setField(term52252, term52252.getClass(), "_typeHandler", null);
        setBooleanField(term52252, term52252.getClass(), "_asStatic", false);
        setField(term52251, term52251.getClass(), "_beanType", term52252);
        setField(term52251, term52251.getClass(), "_serializationShape", null);
        setField(term52251, term52251.getClass(), "_valueInstantiator", null);
        setField(term52251, term52251.getClass(), "_delegateDeserializer", null);
        setField(term52251, term52251.getClass(), "_arrayDelegateDeserializer", null);
        setField(term52251, term52251.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term52251, term52251.getClass(), "_nonStandardCreation", false);
        setBooleanField(term52251, term52251.getClass(), "_vanillaProcessing", false);
        setField(term52251, term52251.getClass(), "_beanProperties", null);
        setField(term52251, term52251.getClass(), "_injectables", null);
        setField(term52251, term52251.getClass(), "_anySetter", null);
        setField(term52251, term52251.getClass(), "_ignorableProps", null);
        setBooleanField(term52251, term52251.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term52251, term52251.getClass(), "_needViewProcesing", false);
        setField(term52251, term52251.getClass(), "_backRefs", null);
        setField(term52251, term52251.getClass(), "_subDeserializers", null);
        setField(term52251, term52251.getClass(), "_unwrappedPropertyHandler", null);
        setField(term52251, term52251.getClass(), "_externalTypeIdHandler", null);
        setField(term52251, term52251.getClass(), "_objectIdReader", null);
        setField(term52251, term52251.getClass(), "_valueClass", null);
        term52253 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term52254 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term52253, term52253.getClass(), "_nullFromCreator", null);
        setField(term52253, term52253.getClass(), "_classAnnotations", null);
        setField(term52254, term52254.getClass(), "_elementType", null);
        setField(term52254, term52254.getClass(), "_superClass", null);
        setField(term52254, term52254.getClass(), "_superInterfaces", null);
        setField(term52254, term52254.getClass(), "_bindings", null);
        setField(term52254, term52254.getClass(), "_canonicalName", null);
        setField(term52254, term52254.getClass(), "_class", null);
        setIntField(term52254, term52254.getClass(), "_hash", 0);
        setField(term52254, term52254.getClass(), "_valueHandler", null);
        setField(term52254, term52254.getClass(), "_typeHandler", null);
        setBooleanField(term52254, term52254.getClass(), "_asStatic", false);
        setField(term52253, term52253.getClass(), "_beanType", term52254);
        setField(term52253, term52253.getClass(), "_serializationShape", null);
        setField(term52253, term52253.getClass(), "_valueInstantiator", null);
        setField(term52253, term52253.getClass(), "_delegateDeserializer", null);
        setField(term52253, term52253.getClass(), "_arrayDelegateDeserializer", null);
        setField(term52253, term52253.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term52253, term52253.getClass(), "_nonStandardCreation", false);
        setBooleanField(term52253, term52253.getClass(), "_vanillaProcessing", false);
        setField(term52253, term52253.getClass(), "_beanProperties", null);
        setField(term52253, term52253.getClass(), "_injectables", null);
        setField(term52253, term52253.getClass(), "_anySetter", null);
        setField(term52253, term52253.getClass(), "_ignorableProps", null);
        setBooleanField(term52253, term52253.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term52253, term52253.getClass(), "_needViewProcesing", false);
        setField(term52253, term52253.getClass(), "_backRefs", null);
        setField(term52253, term52253.getClass(), "_subDeserializers", null);
        setField(term52253, term52253.getClass(), "_unwrappedPropertyHandler", null);
        setField(term52253, term52253.getClass(), "_externalTypeIdHandler", null);
        setField(term52253, term52253.getClass(), "_objectIdReader", null);
        setField(term52253, term52253.getClass(), "_valueClass", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term52126;
        args[1] = false;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term52251));
        assertTrue(recursiveEquals(term52126, term52253));
    }

};


