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
     Object term80704;
     Object term81078;

    public BeanDeserializer_init_99674089193() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term80486 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term80592 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term80486, term80486.getClass(), "_valueClass", null);
        setField(term80486, term80486.getClass(), "_beanType", term80592);
        setField(term80486, term80486.getClass(), "_valueInstantiator", null);
        setField(term80486, term80486.getClass(), "_delegateDeserializer", null);
        setField(term80486, term80486.getClass(), "_propertyBasedCreator", null);
        setField(term80486, term80486.getClass(), "_backRefs", null);
        setField(term80486, term80486.getClass(), "_ignorableProps", null);
        setBooleanField(term80486, term80486.getClass(), "_ignoreAllUnknown", false);
        setField(term80486, term80486.getClass(), "_anySetter", null);
        setField(term80486, term80486.getClass(), "_injectables", null);
        setBooleanField(term80486, term80486.getClass(), "_nonStandardCreation", false);
        setField(term80486, term80486.getClass(), "_unwrappedPropertyHandler", null);
        setBooleanField(term80486, term80486.getClass(), "_needViewProcesing", false);
        setField(term80486, term80486.getClass(), "_serializationShape", null);
        setField(term80486, term80486.getClass(), "_objectIdReader", null);
        Class<? extends Object> term81784 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonFormat$Shape");
        Field term81783 = ((Class) term81784).getDeclaredField((String) "SCALAR");
        ((Field) term81783).setAccessible(true);
        Object enum9 = ((Field) term81783).get((Object) null);
        term80704 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term80818 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.PlaceholderForType"));
        setField(term80818, term80818.getClass(), "_class", null);
        setField(term80704, term80704.getClass(), "_beanType", term80818);
        setField(term80704, term80704.getClass(), "_valueInstantiator", null);
        setField(term80704, term80704.getClass(), "_delegateDeserializer", null);
        setField(term80704, term80704.getClass(), "_propertyBasedCreator", null);
        setField(term80704, term80704.getClass(), "_backRefs", null);
        setField(term80704, term80704.getClass(), "_ignorableProps", null);
        setBooleanField(term80704, term80704.getClass(), "_ignoreAllUnknown", false);
        setField(term80704, term80704.getClass(), "_anySetter", null);
        setField(term80704, term80704.getClass(), "_injectables", null);
        setBooleanField(term80704, term80704.getClass(), "_nonStandardCreation", false);
        setField(term80704, term80704.getClass(), "_unwrappedPropertyHandler", null);
        setBooleanField(term80704, term80704.getClass(), "_needViewProcesing", false);
        setField(term80704, term80704.getClass(), "_serializationShape", enum9);
        term81078 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader");
        Object[] args = new Object[2];
        args[0] = term80704;
        args[1] = term81078;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


