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

public class BeanDeserializer_init_99674089161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40194;
     Object term40319;
     Object term40321;

    public BeanDeserializer_init_99674089161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term40082 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        term40194 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term40300 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term40194, term40194.getClass(), "_beanType", term40300);
        term40319 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term40320 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term40319, term40319.getClass(), "_nullFromCreator", null);
        setField(term40319, term40319.getClass(), "_currentlyTransforming", null);
        setField(term40320, term40320.getClass(), "_elementType", null);
        setField(term40320, term40320.getClass(), "_superClass", null);
        setField(term40320, term40320.getClass(), "_superInterfaces", null);
        setField(term40320, term40320.getClass(), "_bindings", null);
        setField(term40320, term40320.getClass(), "_canonicalName", null);
        setField(term40320, term40320.getClass(), "_class", null);
        setIntField(term40320, term40320.getClass(), "_hash", 0);
        setField(term40320, term40320.getClass(), "_valueHandler", null);
        setField(term40320, term40320.getClass(), "_typeHandler", null);
        setBooleanField(term40320, term40320.getClass(), "_asStatic", false);
        setField(term40319, term40319.getClass(), "_beanType", term40320);
        setField(term40319, term40319.getClass(), "_serializationShape", null);
        setField(term40319, term40319.getClass(), "_valueInstantiator", null);
        setField(term40319, term40319.getClass(), "_delegateDeserializer", null);
        setField(term40319, term40319.getClass(), "_arrayDelegateDeserializer", null);
        setField(term40319, term40319.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term40319, term40319.getClass(), "_nonStandardCreation", false);
        setBooleanField(term40319, term40319.getClass(), "_vanillaProcessing", false);
        setField(term40319, term40319.getClass(), "_beanProperties", null);
        setField(term40319, term40319.getClass(), "_injectables", null);
        setField(term40319, term40319.getClass(), "_anySetter", null);
        setField(term40319, term40319.getClass(), "_ignorableProps", null);
        setBooleanField(term40319, term40319.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term40319, term40319.getClass(), "_needViewProcesing", false);
        setField(term40319, term40319.getClass(), "_backRefs", null);
        setField(term40319, term40319.getClass(), "_subDeserializers", null);
        setField(term40319, term40319.getClass(), "_unwrappedPropertyHandler", null);
        setField(term40319, term40319.getClass(), "_externalTypeIdHandler", null);
        setField(term40319, term40319.getClass(), "_objectIdReader", null);
        setField(term40319, term40319.getClass(), "_valueClass", null);
        term40321 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term40322 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term40321, term40321.getClass(), "_nullFromCreator", null);
        setField(term40321, term40321.getClass(), "_currentlyTransforming", null);
        setField(term40322, term40322.getClass(), "_elementType", null);
        setField(term40322, term40322.getClass(), "_superClass", null);
        setField(term40322, term40322.getClass(), "_superInterfaces", null);
        setField(term40322, term40322.getClass(), "_bindings", null);
        setField(term40322, term40322.getClass(), "_canonicalName", null);
        setField(term40322, term40322.getClass(), "_class", null);
        setIntField(term40322, term40322.getClass(), "_hash", 0);
        setField(term40322, term40322.getClass(), "_valueHandler", null);
        setField(term40322, term40322.getClass(), "_typeHandler", null);
        setBooleanField(term40322, term40322.getClass(), "_asStatic", false);
        setField(term40321, term40321.getClass(), "_beanType", term40322);
        setField(term40321, term40321.getClass(), "_serializationShape", null);
        setField(term40321, term40321.getClass(), "_valueInstantiator", null);
        setField(term40321, term40321.getClass(), "_delegateDeserializer", null);
        setField(term40321, term40321.getClass(), "_arrayDelegateDeserializer", null);
        setField(term40321, term40321.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term40321, term40321.getClass(), "_nonStandardCreation", false);
        setBooleanField(term40321, term40321.getClass(), "_vanillaProcessing", false);
        setField(term40321, term40321.getClass(), "_beanProperties", null);
        setField(term40321, term40321.getClass(), "_injectables", null);
        setField(term40321, term40321.getClass(), "_anySetter", null);
        setField(term40321, term40321.getClass(), "_ignorableProps", null);
        setBooleanField(term40321, term40321.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term40321, term40321.getClass(), "_needViewProcesing", false);
        setField(term40321, term40321.getClass(), "_backRefs", null);
        setField(term40321, term40321.getClass(), "_subDeserializers", null);
        setField(term40321, term40321.getClass(), "_unwrappedPropertyHandler", null);
        setField(term40321, term40321.getClass(), "_externalTypeIdHandler", null);
        setField(term40321, term40321.getClass(), "_objectIdReader", null);
        setField(term40321, term40321.getClass(), "_valueClass", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader");
        Object[] args = new Object[2];
        args[0] = term40194;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term40319));
        assertTrue(recursiveEquals(term40194, term40321));
    }

};


