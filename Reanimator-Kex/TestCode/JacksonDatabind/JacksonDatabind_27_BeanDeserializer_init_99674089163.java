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
import java.lang.String;
import java.lang.Object;

public class BeanDeserializer_init_99674089163 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term73841;
     Object term74104;

    public BeanDeserializer_init_99674089163() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term73859 = Class.forName((String) "com.fasterxml.jackson.databind.ext.DOMDeserializer$NodeDeserializer");
        Class<? extends Object> term75156 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonFormat$Shape");
        Field term75155 = ((Class) term75156).getDeclaredField((String) "ANY");
        ((Field) term75155).setAccessible(true);
        Object enum5 = ((Field) term75155).get((Object) null);
        term73841 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term73915 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(term73841, term73841.getClass(), "_beanType", null);
        setField(term73841, term73841.getClass(), "_valueClass", term73859);
        setField(term73841, term73841.getClass(), "_classAnnotations", null);
        setField(term73841, term73841.getClass(), "_valueInstantiator", null);
        setField(term73841, term73841.getClass(), "_delegateDeserializer", term73915);
        setField(term73841, term73841.getClass(), "_propertyBasedCreator", null);
        setField(term73841, term73841.getClass(), "_backRefs", null);
        setField(term73841, term73841.getClass(), "_ignorableProps", null);
        setBooleanField(term73841, term73841.getClass(), "_ignoreAllUnknown", false);
        setField(term73841, term73841.getClass(), "_anySetter", null);
        setField(term73841, term73841.getClass(), "_injectables", null);
        setBooleanField(term73841, term73841.getClass(), "_nonStandardCreation", false);
        setField(term73841, term73841.getClass(), "_unwrappedPropertyHandler", null);
        setBooleanField(term73841, term73841.getClass(), "_needViewProcesing", false);
        setField(term73841, term73841.getClass(), "_serializationShape", enum5);
        setField(term73841, term73841.getClass(), "_objectIdReader", null);
        term74104 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        Object term74196 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term74104, term74104.getClass(), "propertyName", term74196);
        setField(term74104, term74104.getClass(), "_idType", null);
        setField(term74104, term74104.getClass(), "_deserializer", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader");
        Object[] args = new Object[2];
        args[0] = term73841;
        args[1] = term74104;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


