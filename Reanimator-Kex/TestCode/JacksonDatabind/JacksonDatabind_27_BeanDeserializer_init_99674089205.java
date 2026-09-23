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

public class BeanDeserializer_init_99674089205 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term129604;
     Object term129864;

    public BeanDeserializer_init_99674089205() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term129492 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(term129492, term129492.getClass(), "_valueClass", null);
        setField(term129492, term129492.getClass(), "_classAnnotations", null);
        setField(term129492, term129492.getClass(), "_beanType", null);
        setField(term129492, term129492.getClass(), "_valueInstantiator", null);
        setField(term129492, term129492.getClass(), "_delegateDeserializer", null);
        setField(term129492, term129492.getClass(), "_propertyBasedCreator", null);
        setField(term129492, term129492.getClass(), "_backRefs", null);
        setField(term129492, term129492.getClass(), "_ignorableProps", null);
        setBooleanField(term129492, term129492.getClass(), "_ignoreAllUnknown", false);
        setField(term129492, term129492.getClass(), "_anySetter", null);
        setField(term129492, term129492.getClass(), "_injectables", null);
        setBooleanField(term129492, term129492.getClass(), "_nonStandardCreation", false);
        setField(term129492, term129492.getClass(), "_unwrappedPropertyHandler", null);
        setBooleanField(term129492, term129492.getClass(), "_needViewProcesing", false);
        setField(term129492, term129492.getClass(), "_serializationShape", null);
        setField(term129492, term129492.getClass(), "_objectIdReader", null);
        Class<? extends Object> term130751 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonFormat$Shape");
        Field term130750 = ((Class) term130751).getDeclaredField((String) "STRING");
        ((Field) term130750).setAccessible(true);
        Object enum13 = ((Field) term130750).get((Object) null);
        term129604 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(term129604, term129604.getClass(), "_beanType", null);
        setField(term129604, term129604.getClass(), "_classAnnotations", null);
        setField(term129604, term129604.getClass(), "_valueInstantiator", null);
        setField(term129604, term129604.getClass(), "_delegateDeserializer", null);
        setField(term129604, term129604.getClass(), "_propertyBasedCreator", null);
        setField(term129604, term129604.getClass(), "_backRefs", null);
        setField(term129604, term129604.getClass(), "_ignorableProps", null);
        setBooleanField(term129604, term129604.getClass(), "_ignoreAllUnknown", false);
        setField(term129604, term129604.getClass(), "_anySetter", null);
        setField(term129604, term129604.getClass(), "_injectables", null);
        setBooleanField(term129604, term129604.getClass(), "_nonStandardCreation", false);
        setField(term129604, term129604.getClass(), "_unwrappedPropertyHandler", null);
        setBooleanField(term129604, term129604.getClass(), "_needViewProcesing", false);
        setField(term129604, term129604.getClass(), "_serializationShape", enum13);
        term129864 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        Object term129956 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term129956, term129956.getClass(), "_simpleName", "NUMBER_INT");
        setField(term129864, term129864.getClass(), "propertyName", term129956);
        setField(term129864, term129864.getClass(), "_idType", null);
        setField(term129864, term129864.getClass(), "_deserializer", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader");
        Object[] args = new Object[2];
        args[0] = term129604;
        args[1] = term129864;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


