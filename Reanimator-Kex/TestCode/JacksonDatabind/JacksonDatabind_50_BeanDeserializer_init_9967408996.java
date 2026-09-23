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

public class BeanDeserializer_init_9967408996 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21122;
     Object term21498;

    public BeanDeserializer_init_9967408996() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term20776 = Class.forName((String) "java.util.function.LongSupplier");
        Object term20740 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term20892 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        Object term21010 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.SettableAnyProperty"));
        setField(term20740, term20740.getClass(), "_valueClass", term20776);
        setField(term20740, term20740.getClass(), "_classAnnotations", term20892);
        setField(term20740, term20740.getClass(), "_beanType", null);
        setField(term20740, term20740.getClass(), "_valueInstantiator", null);
        setField(term20740, term20740.getClass(), "_delegateDeserializer", null);
        setField(term20740, term20740.getClass(), "_propertyBasedCreator", null);
        setField(term20740, term20740.getClass(), "_backRefs", null);
        setField(term20740, term20740.getClass(), "_ignorableProps", null);
        setBooleanField(term20740, term20740.getClass(), "_ignoreAllUnknown", false);
        setField(term20740, term20740.getClass(), "_anySetter", term21010);
        setField(term20740, term20740.getClass(), "_injectables", null);
        setBooleanField(term20740, term20740.getClass(), "_nonStandardCreation", false);
        setField(term20740, term20740.getClass(), "_unwrappedPropertyHandler", null);
        setBooleanField(term20740, term20740.getClass(), "_needViewProcesing", false);
        setField(term20740, term20740.getClass(), "_serializationShape", null);
        setField(term20740, term20740.getClass(), "_objectIdReader", null);
        Class<? extends Object> term22853 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonFormat$Shape");
        Field term22852 = ((Class) term22853).getDeclaredField((String) "NUMBER_INT");
        ((Field) term22852).setAccessible(true);
        Object enum1 = ((Field) term22852).get((Object) null);
        term21122 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term21238 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        setField(term21122, term21122.getClass(), "_beanType", null);
        setField(term21122, term21122.getClass(), "_classAnnotations", term21238);
        setField(term21122, term21122.getClass(), "_valueInstantiator", null);
        setField(term21122, term21122.getClass(), "_delegateDeserializer", null);
        setField(term21122, term21122.getClass(), "_propertyBasedCreator", null);
        setField(term21122, term21122.getClass(), "_backRefs", null);
        setField(term21122, term21122.getClass(), "_ignorableProps", null);
        setBooleanField(term21122, term21122.getClass(), "_ignoreAllUnknown", false);
        setField(term21122, term21122.getClass(), "_anySetter", null);
        setField(term21122, term21122.getClass(), "_injectables", null);
        setBooleanField(term21122, term21122.getClass(), "_nonStandardCreation", false);
        setField(term21122, term21122.getClass(), "_unwrappedPropertyHandler", null);
        setBooleanField(term21122, term21122.getClass(), "_needViewProcesing", false);
        setField(term21122, term21122.getClass(), "_serializationShape", enum1);
        term21498 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader");
        Object[] args = new Object[2];
        args[0] = term21122;
        args[1] = term21498;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


