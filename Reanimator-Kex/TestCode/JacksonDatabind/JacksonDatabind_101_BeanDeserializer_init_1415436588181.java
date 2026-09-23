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
import java.util.HashMap;

public class BeanDeserializer_init_1415436588181 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term64767;

    public BeanDeserializer_init_1415436588181() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term64889 = Class.forName((String) "java.util.ImmutableCollections$AbstractImmutableMap");
        Object term64501 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term64655 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        setField(term64501, term64501.getClass(), "_valueClass", term64889);
        setField(term64501, term64501.getClass(), "_beanType", null);
        setField(term64501, term64501.getClass(), "_valueInstantiator", null);
        setField(term64501, term64501.getClass(), "_delegateDeserializer", null);
        setField(term64501, term64501.getClass(), "_propertyBasedCreator", null);
        setField(term64501, term64501.getClass(), "_backRefs", null);
        setField(term64501, term64501.getClass(), "_ignorableProps", null);
        setBooleanField(term64501, term64501.getClass(), "_ignoreAllUnknown", false);
        setField(term64501, term64501.getClass(), "_anySetter", null);
        setField(term64501, term64501.getClass(), "_injectables", null);
        setBooleanField(term64501, term64501.getClass(), "_nonStandardCreation", false);
        setField(term64501, term64501.getClass(), "_unwrappedPropertyHandler", null);
        setBooleanField(term64501, term64501.getClass(), "_needViewProcesing", false);
        setField(term64501, term64501.getClass(), "_serializationShape", null);
        setBooleanField(term64501, term64501.getClass(), "_vanillaProcessing", false);
        setField(term64501, term64501.getClass(), "_objectIdReader", term64655);
        HashMap term64937 = new HashMap();
        Class<? extends Object> term66267 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonFormat$Shape");
        Field term66266 = ((Class) term66267).getDeclaredField((String) "ANY");
        ((Field) term66266).setAccessible(true);
        Object enum7 = ((Field) term66266).get((Object) null);
        term64767 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term64871 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term65199 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        setField(term64871, term64871.getClass(), "_class", term64889);
        setField(term64767, term64767.getClass(), "_beanType", term64871);
        setField(term64767, term64767.getClass(), "_valueInstantiator", null);
        setField(term64767, term64767.getClass(), "_delegateDeserializer", null);
        setField(term64767, term64767.getClass(), "_propertyBasedCreator", null);
        setField(term64767, term64767.getClass(), "_backRefs", term64937);
        setBooleanField(term64767, term64767.getClass(), "_ignoreAllUnknown", false);
        setField(term64767, term64767.getClass(), "_anySetter", null);
        setField(term64767, term64767.getClass(), "_injectables", null);
        setBooleanField(term64767, term64767.getClass(), "_nonStandardCreation", false);
        setField(term64767, term64767.getClass(), "_unwrappedPropertyHandler", null);
        setBooleanField(term64767, term64767.getClass(), "_needViewProcesing", false);
        setField(term64767, term64767.getClass(), "_serializationShape", enum7);
        setBooleanField(term64767, term64767.getClass(), "_vanillaProcessing", false);
        setField(term64767, term64767.getClass(), "_objectIdReader", null);
        setField(term64767, term64767.getClass(), "_beanProperties", term65199);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        argTypes[1] = Class.forName("java.util.Set");
        Object[] args = new Object[2];
        args[0] = term64767;
        args[1] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


