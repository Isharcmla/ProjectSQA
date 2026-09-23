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

public class BeanDeserializer_init_1678761736141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33436;
     Object term33573;
     Object term33575;

    public BeanDeserializer_init_1678761736141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term33324 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        term33436 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term33550 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.PlaceholderForType"));
        setField(term33436, term33436.getClass(), "_beanType", term33550);
        term33573 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term33574 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.PlaceholderForType"));
        setField(term33573, term33573.getClass(), "_nullFromCreator", null);
        setField(term33573, term33573.getClass(), "_currentlyTransforming", null);
        setIntField(term33574, term33574.getClass(), "_ordinal", 0);
        setField(term33574, term33574.getClass(), "_actualType", null);
        setField(term33574, term33574.getClass(), "_superClass", null);
        setField(term33574, term33574.getClass(), "_superInterfaces", null);
        setField(term33574, term33574.getClass(), "_bindings", null);
        setField(term33574, term33574.getClass(), "_canonicalName", null);
        setField(term33574, term33574.getClass(), "_class", null);
        setIntField(term33574, term33574.getClass(), "_hash", 0);
        setField(term33574, term33574.getClass(), "_valueHandler", null);
        setField(term33574, term33574.getClass(), "_typeHandler", null);
        setBooleanField(term33574, term33574.getClass(), "_asStatic", false);
        setField(term33573, term33573.getClass(), "_beanType", term33574);
        setField(term33573, term33573.getClass(), "_serializationShape", null);
        setField(term33573, term33573.getClass(), "_valueInstantiator", null);
        setField(term33573, term33573.getClass(), "_delegateDeserializer", null);
        setField(term33573, term33573.getClass(), "_arrayDelegateDeserializer", null);
        setField(term33573, term33573.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term33573, term33573.getClass(), "_nonStandardCreation", false);
        setBooleanField(term33573, term33573.getClass(), "_vanillaProcessing", false);
        setField(term33573, term33573.getClass(), "_beanProperties", null);
        setField(term33573, term33573.getClass(), "_injectables", null);
        setField(term33573, term33573.getClass(), "_anySetter", null);
        setField(term33573, term33573.getClass(), "_ignorableProps", null);
        setBooleanField(term33573, term33573.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term33573, term33573.getClass(), "_needViewProcesing", false);
        setField(term33573, term33573.getClass(), "_backRefs", null);
        setField(term33573, term33573.getClass(), "_subDeserializers", null);
        setField(term33573, term33573.getClass(), "_unwrappedPropertyHandler", null);
        setField(term33573, term33573.getClass(), "_externalTypeIdHandler", null);
        setField(term33573, term33573.getClass(), "_objectIdReader", null);
        setField(term33573, term33573.getClass(), "_valueClass", null);
        term33575 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term33576 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.PlaceholderForType"));
        setField(term33575, term33575.getClass(), "_nullFromCreator", null);
        setField(term33575, term33575.getClass(), "_currentlyTransforming", null);
        setIntField(term33576, term33576.getClass(), "_ordinal", 0);
        setField(term33576, term33576.getClass(), "_actualType", null);
        setField(term33576, term33576.getClass(), "_superClass", null);
        setField(term33576, term33576.getClass(), "_superInterfaces", null);
        setField(term33576, term33576.getClass(), "_bindings", null);
        setField(term33576, term33576.getClass(), "_canonicalName", null);
        setField(term33576, term33576.getClass(), "_class", null);
        setIntField(term33576, term33576.getClass(), "_hash", 0);
        setField(term33576, term33576.getClass(), "_valueHandler", null);
        setField(term33576, term33576.getClass(), "_typeHandler", null);
        setBooleanField(term33576, term33576.getClass(), "_asStatic", false);
        setField(term33575, term33575.getClass(), "_beanType", term33576);
        setField(term33575, term33575.getClass(), "_serializationShape", null);
        setField(term33575, term33575.getClass(), "_valueInstantiator", null);
        setField(term33575, term33575.getClass(), "_delegateDeserializer", null);
        setField(term33575, term33575.getClass(), "_arrayDelegateDeserializer", null);
        setField(term33575, term33575.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term33575, term33575.getClass(), "_nonStandardCreation", false);
        setBooleanField(term33575, term33575.getClass(), "_vanillaProcessing", false);
        setField(term33575, term33575.getClass(), "_beanProperties", null);
        setField(term33575, term33575.getClass(), "_injectables", null);
        setField(term33575, term33575.getClass(), "_anySetter", null);
        setField(term33575, term33575.getClass(), "_ignorableProps", null);
        setBooleanField(term33575, term33575.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term33575, term33575.getClass(), "_needViewProcesing", false);
        setField(term33575, term33575.getClass(), "_backRefs", null);
        setField(term33575, term33575.getClass(), "_subDeserializers", null);
        setField(term33575, term33575.getClass(), "_unwrappedPropertyHandler", null);
        setField(term33575, term33575.getClass(), "_externalTypeIdHandler", null);
        setField(term33575, term33575.getClass(), "_objectIdReader", null);
        setField(term33575, term33575.getClass(), "_valueClass", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
        Object[] args = new Object[2];
        args[0] = term33436;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term33573));
        assertTrue(recursiveEquals(term33436, term33575));
    }

};


