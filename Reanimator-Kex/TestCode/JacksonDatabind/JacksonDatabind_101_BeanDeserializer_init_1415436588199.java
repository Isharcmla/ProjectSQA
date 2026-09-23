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
import java.lang.reflect.InaccessibleObjectException;
import static com.fasterxml.jackson.databind.deser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class BeanDeserializer_init_1415436588199 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term89484;

    public BeanDeserializer_init_1415436588199() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term89550 = Class.forName((String) "com.fasterxml.jackson.databind.jsontype.impl.TypeIdResolverBase");
        Class<? extends Object> term90788 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonFormat$Shape");
        Field term90787 = ((Class) term90788).getDeclaredField((String) "STRING");
        ((Field) term90787).setAccessible(true);
        Object enum11 = ((Field) term90787).get((Object) null);
        Object term88729 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term88865 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator"));
        term89484 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer"));
        Object term89532 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term89681 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        setField(term88729, term88729.getClass(), "_valueClass", null);
        setField(term88729, term88729.getClass(), "_beanType", null);
        setField(term88729, term88729.getClass(), "_valueInstantiator", term88865);
        setField(term89532, term89532.getClass(), "_class", term89550);
        setField(term89484, term89484.getClass(), "_beanType", term89532);
        setField(term89484, term89484.getClass(), "_valueInstantiator", null);
        setField(term89484, term89484.getClass(), "_delegateDeserializer", term89484);
        setField(term89484, term89484.getClass(), "_propertyBasedCreator", null);
        setField(term89484, term89484.getClass(), "_backRefs", null);
        setBooleanField(term89484, term89484.getClass(), "_ignoreAllUnknown", false);
        setField(term89484, term89484.getClass(), "_anySetter", null);
        setField(term89484, term89484.getClass(), "_injectables", null);
        setBooleanField(term89484, term89484.getClass(), "_nonStandardCreation", false);
        setField(term89484, term89484.getClass(), "_unwrappedPropertyHandler", null);
        setBooleanField(term89484, term89484.getClass(), "_needViewProcesing", false);
        setField(term89484, term89484.getClass(), "_serializationShape", enum11);
        setBooleanField(term89484, term89484.getClass(), "_vanillaProcessing", false);
        setField(term89484, term89484.getClass(), "_objectIdReader", null);
        setField(term89484, term89484.getClass(), "_beanProperties", term89681);
        setField(term88729, term88729.getClass(), "_delegateDeserializer", term89484);
        setField(term88729, term88729.getClass(), "_propertyBasedCreator", null);
        setField(term88729, term88729.getClass(), "_backRefs", null);
        setField(term88729, term88729.getClass(), "_ignorableProps", null);
        setBooleanField(term88729, term88729.getClass(), "_ignoreAllUnknown", false);
        setField(term88729, term88729.getClass(), "_anySetter", null);
        setField(term88729, term88729.getClass(), "_injectables", null);
        setBooleanField(term88729, term88729.getClass(), "_nonStandardCreation", false);
        setField(term88729, term88729.getClass(), "_unwrappedPropertyHandler", null);
        setBooleanField(term88729, term88729.getClass(), "_needViewProcesing", false);
        setField(term88729, term88729.getClass(), "_serializationShape", null);
        setBooleanField(term88729, term88729.getClass(), "_vanillaProcessing", false);
        setField(term88729, term88729.getClass(), "_objectIdReader", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        argTypes[1] = Class.forName("java.util.Set");
        Object[] args = new Object[2];
        args[0] = term89484;
        args[1] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


