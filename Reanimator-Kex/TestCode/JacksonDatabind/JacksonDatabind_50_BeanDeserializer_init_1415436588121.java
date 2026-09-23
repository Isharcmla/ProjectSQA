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

public class BeanDeserializer_init_1415436588121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39515;

    public BeanDeserializer_init_1415436588121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term39243 = Class.forName((String) "kex.java.lang.Double");
        Class<? extends Object> term42254 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonFormat$Shape");
        Field term42253 = ((Class) term42254).getDeclaredField((String) "ANY");
        ((Field) term42253).setAccessible(true);
        Object enum8 = ((Field) term42253).get((Object) null);
        Object term39207 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(term39207, term39207.getClass(), "_valueClass", term39243);
        setField(term39207, term39207.getClass(), "_classAnnotations", null);
        setField(term39207, term39207.getClass(), "_beanType", null);
        setField(term39207, term39207.getClass(), "_valueInstantiator", null);
        setField(term39207, term39207.getClass(), "_delegateDeserializer", null);
        setField(term39207, term39207.getClass(), "_propertyBasedCreator", null);
        setField(term39207, term39207.getClass(), "_backRefs", null);
        setField(term39207, term39207.getClass(), "_ignorableProps", null);
        setBooleanField(term39207, term39207.getClass(), "_ignoreAllUnknown", false);
        setField(term39207, term39207.getClass(), "_anySetter", null);
        setField(term39207, term39207.getClass(), "_injectables", null);
        setBooleanField(term39207, term39207.getClass(), "_nonStandardCreation", false);
        setField(term39207, term39207.getClass(), "_unwrappedPropertyHandler", null);
        setBooleanField(term39207, term39207.getClass(), "_needViewProcesing", false);
        setField(term39207, term39207.getClass(), "_serializationShape", enum8);
        setBooleanField(term39207, term39207.getClass(), "_vanillaProcessing", false);
        setField(term39207, term39207.getClass(), "_objectIdReader", null);
        Class<? extends Object> term39671 = Class.forName((String) "com.fasterxml.jackson.databind.DeserializationFeature");
        Class<? extends Object> term42676 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonFormat$Shape");
        Field term42675 = ((Class) term42676).getDeclaredField((String) "NUMBER");
        ((Field) term42675).setAccessible(true);
        Object enum9 = ((Field) term42675).get((Object) null);
        term39515 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        Object term39635 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term39809 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.UnwrappedPropertyHandler"));
        Object term40071 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        setField(term39635, term39635.getClass(), "_class", term39671);
        setField(term39515, term39515.getClass(), "_beanType", term39635);
        setField(term39515, term39515.getClass(), "_classAnnotations", null);
        setField(term39515, term39515.getClass(), "_valueInstantiator", null);
        setField(term39515, term39515.getClass(), "_delegateDeserializer", null);
        setField(term39515, term39515.getClass(), "_propertyBasedCreator", null);
        setField(term39515, term39515.getClass(), "_backRefs", null);
        setBooleanField(term39515, term39515.getClass(), "_ignoreAllUnknown", false);
        setField(term39515, term39515.getClass(), "_anySetter", null);
        setField(term39515, term39515.getClass(), "_injectables", null);
        setBooleanField(term39515, term39515.getClass(), "_nonStandardCreation", false);
        setField(term39515, term39515.getClass(), "_unwrappedPropertyHandler", term39809);
        setBooleanField(term39515, term39515.getClass(), "_needViewProcesing", false);
        setField(term39515, term39515.getClass(), "_serializationShape", enum9);
        setBooleanField(term39515, term39515.getClass(), "_vanillaProcessing", false);
        setField(term39515, term39515.getClass(), "_objectIdReader", null);
        setField(term39515, term39515.getClass(), "_beanProperties", term40071);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        argTypes[1] = Class.forName("java.util.Set");
        Object[] args = new Object[2];
        args[0] = term39515;
        args[1] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


