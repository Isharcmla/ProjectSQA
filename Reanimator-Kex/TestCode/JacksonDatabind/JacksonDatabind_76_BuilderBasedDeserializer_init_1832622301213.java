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

public class BuilderBasedDeserializer_init_1832622301213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term118151;

    public BuilderBasedDeserializer_init_1832622301213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term118023 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        setField(term118023, term118023.getClass(), "_valueClass", null);
        setField(term118023, term118023.getClass(), "_classAnnotations", null);
        setField(term118023, term118023.getClass(), "_beanType", null);
        setField(term118023, term118023.getClass(), "_valueInstantiator", null);
        setField(term118023, term118023.getClass(), "_delegateDeserializer", null);
        setField(term118023, term118023.getClass(), "_propertyBasedCreator", null);
        setField(term118023, term118023.getClass(), "_backRefs", null);
        setField(term118023, term118023.getClass(), "_ignorableProps", null);
        setBooleanField(term118023, term118023.getClass(), "_ignoreAllUnknown", false);
        setField(term118023, term118023.getClass(), "_anySetter", null);
        setField(term118023, term118023.getClass(), "_injectables", null);
        setBooleanField(term118023, term118023.getClass(), "_nonStandardCreation", false);
        setField(term118023, term118023.getClass(), "_unwrappedPropertyHandler", null);
        setBooleanField(term118023, term118023.getClass(), "_needViewProcesing", false);
        setField(term118023, term118023.getClass(), "_serializationShape", null);
        setBooleanField(term118023, term118023.getClass(), "_vanillaProcessing", false);
        setField(term118023, term118023.getClass(), "_objectIdReader", null);
        Class<? extends Object> term119156 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonFormat$Shape");
        Field term119155 = ((Class) term119156).getDeclaredField((String) "ANY");
        ((Field) term119155).setAccessible(true);
        Object enum17 = ((Field) term119155).get((Object) null);
        term118151 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        Object term118265 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        Object term118527 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        setField(term118265, term118265.getClass(), "_class", null);
        setField(term118151, term118151.getClass(), "_beanType", term118265);
        setField(term118151, term118151.getClass(), "_classAnnotations", null);
        setField(term118151, term118151.getClass(), "_valueInstantiator", null);
        setField(term118151, term118151.getClass(), "_delegateDeserializer", null);
        setField(term118151, term118151.getClass(), "_propertyBasedCreator", null);
        setField(term118151, term118151.getClass(), "_backRefs", null);
        setBooleanField(term118151, term118151.getClass(), "_ignoreAllUnknown", false);
        setField(term118151, term118151.getClass(), "_anySetter", null);
        setField(term118151, term118151.getClass(), "_injectables", null);
        setBooleanField(term118151, term118151.getClass(), "_nonStandardCreation", false);
        setField(term118151, term118151.getClass(), "_unwrappedPropertyHandler", null);
        setBooleanField(term118151, term118151.getClass(), "_needViewProcesing", false);
        setField(term118151, term118151.getClass(), "_serializationShape", enum17);
        setBooleanField(term118151, term118151.getClass(), "_vanillaProcessing", false);
        setField(term118151, term118151.getClass(), "_objectIdReader", null);
        setField(term118151, term118151.getClass(), "_beanProperties", term118527);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer");
        argTypes[1] = Class.forName("java.util.Set");
        Object[] args = new Object[2];
        args[0] = term118151;
        args[1] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


