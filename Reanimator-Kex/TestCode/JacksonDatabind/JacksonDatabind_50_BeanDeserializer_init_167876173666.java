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

public class BeanDeserializer_init_167876173666 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8954;
     Object term9612;
     Object term9613;

    public BeanDeserializer_init_167876173666() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term8842 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        term8954 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        term9612 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(term9612, term9612.getClass(), "_nullFromCreator", null);
        setField(term9612, term9612.getClass(), "_classAnnotations", null);
        setField(term9612, term9612.getClass(), "_beanType", null);
        setField(term9612, term9612.getClass(), "_serializationShape", null);
        setField(term9612, term9612.getClass(), "_valueInstantiator", null);
        setField(term9612, term9612.getClass(), "_delegateDeserializer", null);
        setField(term9612, term9612.getClass(), "_arrayDelegateDeserializer", null);
        setField(term9612, term9612.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term9612, term9612.getClass(), "_nonStandardCreation", false);
        setBooleanField(term9612, term9612.getClass(), "_vanillaProcessing", false);
        setField(term9612, term9612.getClass(), "_beanProperties", null);
        setField(term9612, term9612.getClass(), "_injectables", null);
        setField(term9612, term9612.getClass(), "_anySetter", null);
        setField(term9612, term9612.getClass(), "_ignorableProps", null);
        setBooleanField(term9612, term9612.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term9612, term9612.getClass(), "_needViewProcesing", false);
        setField(term9612, term9612.getClass(), "_backRefs", null);
        setField(term9612, term9612.getClass(), "_subDeserializers", null);
        setField(term9612, term9612.getClass(), "_unwrappedPropertyHandler", null);
        setField(term9612, term9612.getClass(), "_externalTypeIdHandler", null);
        setField(term9612, term9612.getClass(), "_objectIdReader", null);
        setField(term9612, term9612.getClass(), "_valueClass", null);
        term9613 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(term9613, term9613.getClass(), "_nullFromCreator", null);
        setField(term9613, term9613.getClass(), "_classAnnotations", null);
        setField(term9613, term9613.getClass(), "_beanType", null);
        setField(term9613, term9613.getClass(), "_serializationShape", null);
        setField(term9613, term9613.getClass(), "_valueInstantiator", null);
        setField(term9613, term9613.getClass(), "_delegateDeserializer", null);
        setField(term9613, term9613.getClass(), "_arrayDelegateDeserializer", null);
        setField(term9613, term9613.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term9613, term9613.getClass(), "_nonStandardCreation", false);
        setBooleanField(term9613, term9613.getClass(), "_vanillaProcessing", false);
        setField(term9613, term9613.getClass(), "_beanProperties", null);
        setField(term9613, term9613.getClass(), "_injectables", null);
        setField(term9613, term9613.getClass(), "_anySetter", null);
        setField(term9613, term9613.getClass(), "_ignorableProps", null);
        setBooleanField(term9613, term9613.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term9613, term9613.getClass(), "_needViewProcesing", false);
        setField(term9613, term9613.getClass(), "_backRefs", null);
        setField(term9613, term9613.getClass(), "_subDeserializers", null);
        setField(term9613, term9613.getClass(), "_unwrappedPropertyHandler", null);
        setField(term9613, term9613.getClass(), "_externalTypeIdHandler", null);
        setField(term9613, term9613.getClass(), "_objectIdReader", null);
        setField(term9613, term9613.getClass(), "_valueClass", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
        Object[] args = new Object[2];
        args[0] = term8954;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term9612));
        assertTrue(recursiveEquals(term8954, term9613));
    }

};


