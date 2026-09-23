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
import java.util.HashMap;
import java.lang.String;

public class BeanDeserializer_init_99674089221 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term135059;
     Object term135319;

    public BeanDeserializer_init_99674089221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term134947 = new HashMap();
        Object term134899 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(term134899, term134899.getClass(), "_valueClass", null);
        setField(term134899, term134899.getClass(), "_classAnnotations", null);
        setField(term134899, term134899.getClass(), "_beanType", null);
        setField(term134899, term134899.getClass(), "_valueInstantiator", null);
        setField(term134899, term134899.getClass(), "_delegateDeserializer", null);
        setField(term134899, term134899.getClass(), "_propertyBasedCreator", null);
        setField(term134899, term134899.getClass(), "_backRefs", term134947);
        setField(term134899, term134899.getClass(), "_ignorableProps", null);
        setBooleanField(term134899, term134899.getClass(), "_ignoreAllUnknown", false);
        setField(term134899, term134899.getClass(), "_anySetter", null);
        setField(term134899, term134899.getClass(), "_injectables", null);
        setBooleanField(term134899, term134899.getClass(), "_nonStandardCreation", false);
        setField(term134899, term134899.getClass(), "_unwrappedPropertyHandler", null);
        setBooleanField(term134899, term134899.getClass(), "_needViewProcesing", false);
        setField(term134899, term134899.getClass(), "_serializationShape", null);
        setField(term134899, term134899.getClass(), "_objectIdReader", null);
        Class<? extends Object> term136175 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonFormat$Shape");
        Field term136174 = ((Class) term136175).getDeclaredField((String) "SCALAR");
        ((Field) term136174).setAccessible(true);
        Object enum37 = ((Field) term136174).get((Object) null);
        term135059 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(term135059, term135059.getClass(), "_beanType", null);
        setField(term135059, term135059.getClass(), "_classAnnotations", null);
        setField(term135059, term135059.getClass(), "_valueInstantiator", null);
        setField(term135059, term135059.getClass(), "_delegateDeserializer", null);
        setField(term135059, term135059.getClass(), "_propertyBasedCreator", null);
        setField(term135059, term135059.getClass(), "_backRefs", null);
        setField(term135059, term135059.getClass(), "_ignorableProps", null);
        setBooleanField(term135059, term135059.getClass(), "_ignoreAllUnknown", false);
        setField(term135059, term135059.getClass(), "_anySetter", null);
        setField(term135059, term135059.getClass(), "_injectables", null);
        setBooleanField(term135059, term135059.getClass(), "_nonStandardCreation", false);
        setField(term135059, term135059.getClass(), "_unwrappedPropertyHandler", null);
        setBooleanField(term135059, term135059.getClass(), "_needViewProcesing", false);
        setField(term135059, term135059.getClass(), "_serializationShape", enum37);
        term135319 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        Object term135411 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term135411, term135411.getClass(), "_simpleName", "NUMBER");
        setField(term135319, term135319.getClass(), "propertyName", term135411);
        setField(term135319, term135319.getClass(), "_idType", null);
        setField(term135319, term135319.getClass(), "_deserializer", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader");
        Object[] args = new Object[2];
        args[0] = term135059;
        args[1] = term135319;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


