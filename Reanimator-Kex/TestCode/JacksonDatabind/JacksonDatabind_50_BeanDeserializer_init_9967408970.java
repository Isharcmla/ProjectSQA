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

public class BeanDeserializer_init_9967408970 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9846;
     Object term10539;
     Object term10540;

    public BeanDeserializer_init_9967408970() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term9734 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        term9846 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        term10539 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(term10539, term10539.getClass(), "_nullFromCreator", null);
        setField(term10539, term10539.getClass(), "_classAnnotations", null);
        setField(term10539, term10539.getClass(), "_beanType", null);
        setField(term10539, term10539.getClass(), "_serializationShape", null);
        setField(term10539, term10539.getClass(), "_valueInstantiator", null);
        setField(term10539, term10539.getClass(), "_delegateDeserializer", null);
        setField(term10539, term10539.getClass(), "_arrayDelegateDeserializer", null);
        setField(term10539, term10539.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term10539, term10539.getClass(), "_nonStandardCreation", false);
        setBooleanField(term10539, term10539.getClass(), "_vanillaProcessing", false);
        setField(term10539, term10539.getClass(), "_beanProperties", null);
        setField(term10539, term10539.getClass(), "_injectables", null);
        setField(term10539, term10539.getClass(), "_anySetter", null);
        setField(term10539, term10539.getClass(), "_ignorableProps", null);
        setBooleanField(term10539, term10539.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term10539, term10539.getClass(), "_needViewProcesing", false);
        setField(term10539, term10539.getClass(), "_backRefs", null);
        setField(term10539, term10539.getClass(), "_subDeserializers", null);
        setField(term10539, term10539.getClass(), "_unwrappedPropertyHandler", null);
        setField(term10539, term10539.getClass(), "_externalTypeIdHandler", null);
        setField(term10539, term10539.getClass(), "_objectIdReader", null);
        setField(term10539, term10539.getClass(), "_valueClass", null);
        term10540 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(term10540, term10540.getClass(), "_nullFromCreator", null);
        setField(term10540, term10540.getClass(), "_classAnnotations", null);
        setField(term10540, term10540.getClass(), "_beanType", null);
        setField(term10540, term10540.getClass(), "_serializationShape", null);
        setField(term10540, term10540.getClass(), "_valueInstantiator", null);
        setField(term10540, term10540.getClass(), "_delegateDeserializer", null);
        setField(term10540, term10540.getClass(), "_arrayDelegateDeserializer", null);
        setField(term10540, term10540.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term10540, term10540.getClass(), "_nonStandardCreation", false);
        setBooleanField(term10540, term10540.getClass(), "_vanillaProcessing", false);
        setField(term10540, term10540.getClass(), "_beanProperties", null);
        setField(term10540, term10540.getClass(), "_injectables", null);
        setField(term10540, term10540.getClass(), "_anySetter", null);
        setField(term10540, term10540.getClass(), "_ignorableProps", null);
        setBooleanField(term10540, term10540.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term10540, term10540.getClass(), "_needViewProcesing", false);
        setField(term10540, term10540.getClass(), "_backRefs", null);
        setField(term10540, term10540.getClass(), "_subDeserializers", null);
        setField(term10540, term10540.getClass(), "_unwrappedPropertyHandler", null);
        setField(term10540, term10540.getClass(), "_externalTypeIdHandler", null);
        setField(term10540, term10540.getClass(), "_objectIdReader", null);
        setField(term10540, term10540.getClass(), "_valueClass", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader");
        Object[] args = new Object[2];
        args[0] = term9846;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term10539));
        assertTrue(recursiveEquals(term9846, term10540));
    }

};


