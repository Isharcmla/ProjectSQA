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

public class BeanDeserializer_init_99674089135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45391;
     Object term45771;

    public BeanDeserializer_init_99674089135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term45263 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(term45263, term45263.getClass(), "_valueClass", null);
        setField(term45263, term45263.getClass(), "_classAnnotations", null);
        setField(term45263, term45263.getClass(), "_beanType", null);
        setField(term45263, term45263.getClass(), "_valueInstantiator", null);
        setField(term45263, term45263.getClass(), "_delegateDeserializer", null);
        setField(term45263, term45263.getClass(), "_propertyBasedCreator", null);
        setField(term45263, term45263.getClass(), "_backRefs", null);
        setField(term45263, term45263.getClass(), "_ignorableProps", null);
        setBooleanField(term45263, term45263.getClass(), "_ignoreAllUnknown", false);
        setField(term45263, term45263.getClass(), "_anySetter", null);
        setField(term45263, term45263.getClass(), "_injectables", null);
        setBooleanField(term45263, term45263.getClass(), "_nonStandardCreation", false);
        setField(term45263, term45263.getClass(), "_unwrappedPropertyHandler", null);
        setBooleanField(term45263, term45263.getClass(), "_needViewProcesing", false);
        setField(term45263, term45263.getClass(), "_serializationShape", null);
        setField(term45263, term45263.getClass(), "_objectIdReader", null);
        Class<? extends Object> term46434 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonFormat$Shape");
        Field term46433 = ((Class) term46434).getDeclaredField((String) "ARRAY");
        ((Field) term46433).setAccessible(true);
        Object enum3 = ((Field) term46433).get((Object) null);
        term45391 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        Object term45653 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        setField(term45391, term45391.getClass(), "_beanType", null);
        setField(term45391, term45391.getClass(), "_classAnnotations", null);
        setField(term45391, term45391.getClass(), "_valueInstantiator", null);
        setField(term45391, term45391.getClass(), "_delegateDeserializer", null);
        setField(term45391, term45391.getClass(), "_propertyBasedCreator", null);
        setField(term45391, term45391.getClass(), "_backRefs", null);
        setField(term45391, term45391.getClass(), "_ignorableProps", null);
        setBooleanField(term45391, term45391.getClass(), "_ignoreAllUnknown", false);
        setField(term45391, term45391.getClass(), "_anySetter", null);
        setField(term45391, term45391.getClass(), "_injectables", null);
        setBooleanField(term45391, term45391.getClass(), "_nonStandardCreation", false);
        setField(term45391, term45391.getClass(), "_unwrappedPropertyHandler", null);
        setBooleanField(term45391, term45391.getClass(), "_needViewProcesing", false);
        setField(term45391, term45391.getClass(), "_serializationShape", enum3);
        setField(term45391, term45391.getClass(), "_beanProperties", term45653);
        term45771 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        setField(term45771, term45771.getClass(), "propertyName", null);
        setField(term45771, term45771.getClass(), "_idType", null);
        setField(term45771, term45771.getClass(), "_deserializer", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader");
        Object[] args = new Object[2];
        args[0] = term45391;
        args[1] = term45771;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


