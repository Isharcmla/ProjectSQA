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
import java.lang.NullPointerException;
import static com.fasterxml.jackson.databind.deser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class BeanDeserializer_init_99674089247 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term160425;
     Object term160799;

    public BeanDeserializer_init_99674089247() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term160313 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(term160313, term160313.getClass(), "_valueClass", null);
        setField(term160313, term160313.getClass(), "_beanType", null);
        setField(term160313, term160313.getClass(), "_valueInstantiator", null);
        setField(term160313, term160313.getClass(), "_delegateDeserializer", null);
        setField(term160313, term160313.getClass(), "_propertyBasedCreator", null);
        setField(term160313, term160313.getClass(), "_backRefs", null);
        setField(term160313, term160313.getClass(), "_ignorableProps", null);
        setBooleanField(term160313, term160313.getClass(), "_ignoreAllUnknown", false);
        setField(term160313, term160313.getClass(), "_anySetter", null);
        setField(term160313, term160313.getClass(), "_injectables", null);
        setBooleanField(term160313, term160313.getClass(), "_nonStandardCreation", false);
        setField(term160313, term160313.getClass(), "_unwrappedPropertyHandler", null);
        setBooleanField(term160313, term160313.getClass(), "_needViewProcesing", false);
        setField(term160313, term160313.getClass(), "_serializationShape", null);
        setField(term160313, term160313.getClass(), "_objectIdReader", null);
        Class<? extends Object> term162386 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonFormat$Shape");
        Field term162385 = ((Class) term162386).getDeclaredField((String) "NUMBER");
        ((Field) term162385).setAccessible(true);
        Object enum26 = ((Field) term162385).get((Object) null);
        term160425 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term160539 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.PlaceholderForType"));
        setField(term160539, term160539.getClass(), "_class", null);
        setField(term160425, term160425.getClass(), "_beanType", term160539);
        setField(term160425, term160425.getClass(), "_valueInstantiator", null);
        setField(term160425, term160425.getClass(), "_delegateDeserializer", null);
        setField(term160425, term160425.getClass(), "_propertyBasedCreator", null);
        setField(term160425, term160425.getClass(), "_backRefs", null);
        setField(term160425, term160425.getClass(), "_ignorableProps", null);
        setBooleanField(term160425, term160425.getClass(), "_ignoreAllUnknown", false);
        setField(term160425, term160425.getClass(), "_anySetter", null);
        setField(term160425, term160425.getClass(), "_injectables", null);
        setBooleanField(term160425, term160425.getClass(), "_nonStandardCreation", false);
        setField(term160425, term160425.getClass(), "_unwrappedPropertyHandler", null);
        setBooleanField(term160425, term160425.getClass(), "_needViewProcesing", false);
        setField(term160425, term160425.getClass(), "_serializationShape", enum26);
        term160799 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        Object term160891 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term160799, term160799.getClass(), "propertyName", term160891);
        setField(term160799, term160799.getClass(), "_idType", null);
        setField(term160799, term160799.getClass(), "_deserializer", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader");
        Object[] args = new Object[2];
        args[0] = term160425;
        args[1] = term160799;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


