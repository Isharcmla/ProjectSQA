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

public class BeanDeserializer_init_141543658899 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24624;

    public BeanDeserializer_init_141543658899() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term24494 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(term24494, term24494.getClass(), "_valueClass", null);
        setField(term24494, term24494.getClass(), "_classAnnotations", null);
        setField(term24494, term24494.getClass(), "_beanType", null);
        setField(term24494, term24494.getClass(), "_valueInstantiator", null);
        setField(term24494, term24494.getClass(), "_delegateDeserializer", null);
        setField(term24494, term24494.getClass(), "_propertyBasedCreator", null);
        setField(term24494, term24494.getClass(), "_backRefs", null);
        setField(term24494, term24494.getClass(), "_ignorableProps", null);
        setBooleanField(term24494, term24494.getClass(), "_ignoreAllUnknown", false);
        setField(term24494, term24494.getClass(), "_anySetter", null);
        setField(term24494, term24494.getClass(), "_injectables", null);
        setBooleanField(term24494, term24494.getClass(), "_nonStandardCreation", false);
        setField(term24494, term24494.getClass(), "_unwrappedPropertyHandler", null);
        setBooleanField(term24494, term24494.getClass(), "_needViewProcesing", false);
        setField(term24494, term24494.getClass(), "_serializationShape", null);
        setBooleanField(term24494, term24494.getClass(), "_vanillaProcessing", false);
        setField(term24494, term24494.getClass(), "_objectIdReader", null);
        Class<? extends Object> term25775 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonFormat$Shape");
        Field term25774 = ((Class) term25775).getDeclaredField((String) "SCALAR");
        ((Field) term25774).setAccessible(true);
        Object enum3 = ((Field) term25774).get((Object) null);
        term24624 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        Object term24740 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        Object term24878 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.UnwrappedPropertyHandler"));
        Object term25140 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        setField(term24624, term24624.getClass(), "_beanType", null);
        setField(term24624, term24624.getClass(), "_classAnnotations", term24740);
        setField(term24624, term24624.getClass(), "_valueInstantiator", null);
        setField(term24624, term24624.getClass(), "_delegateDeserializer", null);
        setField(term24624, term24624.getClass(), "_propertyBasedCreator", null);
        setField(term24624, term24624.getClass(), "_backRefs", null);
        setBooleanField(term24624, term24624.getClass(), "_ignoreAllUnknown", false);
        setField(term24624, term24624.getClass(), "_anySetter", null);
        setField(term24624, term24624.getClass(), "_injectables", null);
        setBooleanField(term24624, term24624.getClass(), "_nonStandardCreation", false);
        setField(term24624, term24624.getClass(), "_unwrappedPropertyHandler", term24878);
        setBooleanField(term24624, term24624.getClass(), "_needViewProcesing", false);
        setField(term24624, term24624.getClass(), "_serializationShape", enum3);
        setBooleanField(term24624, term24624.getClass(), "_vanillaProcessing", false);
        setField(term24624, term24624.getClass(), "_objectIdReader", null);
        setField(term24624, term24624.getClass(), "_beanProperties", term25140);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        argTypes[1] = Class.forName("java.util.Set");
        Object[] args = new Object[2];
        args[0] = term24624;
        args[1] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


