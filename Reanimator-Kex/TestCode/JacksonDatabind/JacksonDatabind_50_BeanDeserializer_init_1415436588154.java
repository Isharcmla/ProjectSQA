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
import java.util.HashMap;

public class BeanDeserializer_init_1415436588154 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71357;

    public BeanDeserializer_init_1415436588154() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term71093 = Class.forName((String) "java.util.spi.ResourceBundleProvider");
        Object term71057 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term71229 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator"));
        setField(term71057, term71057.getClass(), "_valueClass", term71093);
        setField(term71057, term71057.getClass(), "_classAnnotations", null);
        setField(term71057, term71057.getClass(), "_beanType", null);
        setField(term71057, term71057.getClass(), "_valueInstantiator", term71229);
        setField(term71057, term71057.getClass(), "_delegateDeserializer", null);
        setField(term71057, term71057.getClass(), "_propertyBasedCreator", null);
        setField(term71057, term71057.getClass(), "_backRefs", null);
        setField(term71057, term71057.getClass(), "_ignorableProps", null);
        setBooleanField(term71057, term71057.getClass(), "_ignoreAllUnknown", false);
        setField(term71057, term71057.getClass(), "_anySetter", null);
        setField(term71057, term71057.getClass(), "_injectables", null);
        setBooleanField(term71057, term71057.getClass(), "_nonStandardCreation", false);
        setField(term71057, term71057.getClass(), "_unwrappedPropertyHandler", null);
        setBooleanField(term71057, term71057.getClass(), "_needViewProcesing", false);
        setField(term71057, term71057.getClass(), "_serializationShape", null);
        setBooleanField(term71057, term71057.getClass(), "_vanillaProcessing", false);
        setField(term71057, term71057.getClass(), "_objectIdReader", null);
        HashMap term71725 = new HashMap();
        Class<? extends Object> term73207 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonFormat$Shape");
        Field term73206 = ((Class) term73207).getDeclaredField((String) "ANY");
        ((Field) term73206).setAccessible(true);
        Object enum19 = ((Field) term73206).get((Object) null);
        term71357 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        Object term71449 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term71565 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        Object term71677 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term71987 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        setField(term71449, term71449.getClass(), "_class", null);
        setField(term71357, term71357.getClass(), "_beanType", term71449);
        setField(term71357, term71357.getClass(), "_classAnnotations", term71565);
        setField(term71357, term71357.getClass(), "_valueInstantiator", null);
        setField(term71357, term71357.getClass(), "_delegateDeserializer", term71677);
        setField(term71357, term71357.getClass(), "_propertyBasedCreator", null);
        setField(term71357, term71357.getClass(), "_backRefs", term71725);
        setBooleanField(term71357, term71357.getClass(), "_ignoreAllUnknown", false);
        setField(term71357, term71357.getClass(), "_anySetter", null);
        setField(term71357, term71357.getClass(), "_injectables", null);
        setBooleanField(term71357, term71357.getClass(), "_nonStandardCreation", false);
        setField(term71357, term71357.getClass(), "_unwrappedPropertyHandler", null);
        setBooleanField(term71357, term71357.getClass(), "_needViewProcesing", false);
        setField(term71357, term71357.getClass(), "_serializationShape", enum19);
        setBooleanField(term71357, term71357.getClass(), "_vanillaProcessing", false);
        setField(term71357, term71357.getClass(), "_objectIdReader", null);
        setField(term71357, term71357.getClass(), "_beanProperties", term71987);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        argTypes[1] = Class.forName("java.util.Set");
        Object[] args = new Object[2];
        args[0] = term71357;
        args[1] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


