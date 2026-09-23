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

public class BeanDeserializer_init_99674089193 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100327;
     Object term100587;

    public BeanDeserializer_init_99674089193() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term100199 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(term100199, term100199.getClass(), "_valueClass", null);
        setField(term100199, term100199.getClass(), "_classAnnotations", null);
        setField(term100199, term100199.getClass(), "_beanType", null);
        setField(term100199, term100199.getClass(), "_valueInstantiator", null);
        setField(term100199, term100199.getClass(), "_delegateDeserializer", null);
        setField(term100199, term100199.getClass(), "_propertyBasedCreator", null);
        setField(term100199, term100199.getClass(), "_backRefs", null);
        setField(term100199, term100199.getClass(), "_ignorableProps", null);
        setBooleanField(term100199, term100199.getClass(), "_ignoreAllUnknown", false);
        setField(term100199, term100199.getClass(), "_anySetter", null);
        setField(term100199, term100199.getClass(), "_injectables", null);
        setBooleanField(term100199, term100199.getClass(), "_nonStandardCreation", false);
        setField(term100199, term100199.getClass(), "_unwrappedPropertyHandler", null);
        setBooleanField(term100199, term100199.getClass(), "_needViewProcesing", false);
        setField(term100199, term100199.getClass(), "_serializationShape", null);
        setField(term100199, term100199.getClass(), "_objectIdReader", null);
        Class<? extends Object> term101326 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonFormat$Shape");
        Field term101325 = ((Class) term101326).getDeclaredField((String) "OBJECT");
        ((Field) term101325).setAccessible(true);
        Object enum27 = ((Field) term101325).get((Object) null);
        term100327 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        setField(term100327, term100327.getClass(), "_beanType", null);
        setField(term100327, term100327.getClass(), "_classAnnotations", null);
        setField(term100327, term100327.getClass(), "_valueInstantiator", null);
        setField(term100327, term100327.getClass(), "_delegateDeserializer", null);
        setField(term100327, term100327.getClass(), "_propertyBasedCreator", null);
        setField(term100327, term100327.getClass(), "_backRefs", null);
        setField(term100327, term100327.getClass(), "_ignorableProps", null);
        setBooleanField(term100327, term100327.getClass(), "_ignoreAllUnknown", false);
        setField(term100327, term100327.getClass(), "_anySetter", null);
        setField(term100327, term100327.getClass(), "_injectables", null);
        setBooleanField(term100327, term100327.getClass(), "_nonStandardCreation", false);
        setField(term100327, term100327.getClass(), "_unwrappedPropertyHandler", null);
        setBooleanField(term100327, term100327.getClass(), "_needViewProcesing", false);
        setField(term100327, term100327.getClass(), "_serializationShape", enum27);
        term100587 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        Object term100679 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term100587, term100587.getClass(), "propertyName", term100679);
        setField(term100587, term100587.getClass(), "_idType", null);
        setField(term100587, term100587.getClass(), "_deserializer", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader");
        Object[] args = new Object[2];
        args[0] = term100327;
        args[1] = term100587;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


