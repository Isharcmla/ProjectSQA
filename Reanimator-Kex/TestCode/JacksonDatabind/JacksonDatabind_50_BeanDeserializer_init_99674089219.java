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

public class BeanDeserializer_init_99674089219 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term131619;
     Object term132101;

    public BeanDeserializer_init_99674089219() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term131389 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonFilter");
        Object term131353 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term131507 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        setField(term131353, term131353.getClass(), "_valueClass", term131389);
        setField(term131353, term131353.getClass(), "_classAnnotations", null);
        setField(term131353, term131353.getClass(), "_beanType", null);
        setField(term131353, term131353.getClass(), "_valueInstantiator", null);
        setField(term131353, term131353.getClass(), "_delegateDeserializer", null);
        setField(term131353, term131353.getClass(), "_propertyBasedCreator", null);
        setField(term131353, term131353.getClass(), "_backRefs", null);
        setField(term131353, term131353.getClass(), "_ignorableProps", null);
        setBooleanField(term131353, term131353.getClass(), "_ignoreAllUnknown", false);
        setField(term131353, term131353.getClass(), "_anySetter", null);
        setField(term131353, term131353.getClass(), "_injectables", null);
        setBooleanField(term131353, term131353.getClass(), "_nonStandardCreation", false);
        setField(term131353, term131353.getClass(), "_unwrappedPropertyHandler", null);
        setBooleanField(term131353, term131353.getClass(), "_needViewProcesing", false);
        setField(term131353, term131353.getClass(), "_serializationShape", null);
        setField(term131353, term131353.getClass(), "_objectIdReader", term131507);
        Class<? extends Object> term133008 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonFormat$Shape");
        Field term133007 = ((Class) term133008).getDeclaredField((String) "BOOLEAN");
        ((Field) term133007).setAccessible(true);
        Object enum35 = ((Field) term133007).get((Object) null);
        term131619 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term131725 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term131841 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        setField(term131725, term131725.getClass(), "_class", null);
        setField(term131619, term131619.getClass(), "_beanType", term131725);
        setField(term131619, term131619.getClass(), "_classAnnotations", term131841);
        setField(term131619, term131619.getClass(), "_valueInstantiator", null);
        setField(term131619, term131619.getClass(), "_delegateDeserializer", null);
        setField(term131619, term131619.getClass(), "_propertyBasedCreator", null);
        setField(term131619, term131619.getClass(), "_backRefs", null);
        setField(term131619, term131619.getClass(), "_ignorableProps", null);
        setBooleanField(term131619, term131619.getClass(), "_ignoreAllUnknown", false);
        setField(term131619, term131619.getClass(), "_anySetter", null);
        setField(term131619, term131619.getClass(), "_injectables", null);
        setBooleanField(term131619, term131619.getClass(), "_nonStandardCreation", false);
        setField(term131619, term131619.getClass(), "_unwrappedPropertyHandler", null);
        setBooleanField(term131619, term131619.getClass(), "_needViewProcesing", false);
        setField(term131619, term131619.getClass(), "_serializationShape", enum35);
        term132101 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader");
        Object[] args = new Object[2];
        args[0] = term131619;
        args[1] = term132101;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


