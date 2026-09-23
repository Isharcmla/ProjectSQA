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

public class BeanDeserializer_init_99674089201 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term92684;
     Object term93050;

    public BeanDeserializer_init_99674089201() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term92350 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term92448 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        Object term92572 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.ValueInstantiator$Base"));
        setField(term92350, term92350.getClass(), "_valueClass", null);
        setField(term92350, term92350.getClass(), "_beanType", term92448);
        setField(term92350, term92350.getClass(), "_valueInstantiator", term92572);
        setField(term92350, term92350.getClass(), "_delegateDeserializer", null);
        setField(term92350, term92350.getClass(), "_propertyBasedCreator", null);
        setField(term92350, term92350.getClass(), "_backRefs", null);
        setField(term92350, term92350.getClass(), "_ignorableProps", null);
        setBooleanField(term92350, term92350.getClass(), "_ignoreAllUnknown", false);
        setField(term92350, term92350.getClass(), "_anySetter", null);
        setField(term92350, term92350.getClass(), "_injectables", null);
        setBooleanField(term92350, term92350.getClass(), "_nonStandardCreation", false);
        setField(term92350, term92350.getClass(), "_unwrappedPropertyHandler", null);
        setBooleanField(term92350, term92350.getClass(), "_needViewProcesing", false);
        setField(term92350, term92350.getClass(), "_serializationShape", null);
        setField(term92350, term92350.getClass(), "_objectIdReader", null);
        Class<? extends Object> term93719 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonFormat$Shape");
        Field term93718 = ((Class) term93719).getDeclaredField((String) "NUMBER_FLOAT");
        ((Field) term93718).setAccessible(true);
        Object enum13 = ((Field) term93718).get((Object) null);
        term92684 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term92790 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term92790, term92790.getClass(), "_class", null);
        setField(term92684, term92684.getClass(), "_beanType", term92790);
        setField(term92684, term92684.getClass(), "_valueInstantiator", null);
        setField(term92684, term92684.getClass(), "_delegateDeserializer", null);
        setField(term92684, term92684.getClass(), "_propertyBasedCreator", null);
        setField(term92684, term92684.getClass(), "_backRefs", null);
        setField(term92684, term92684.getClass(), "_ignorableProps", null);
        setBooleanField(term92684, term92684.getClass(), "_ignoreAllUnknown", false);
        setField(term92684, term92684.getClass(), "_anySetter", null);
        setField(term92684, term92684.getClass(), "_injectables", null);
        setBooleanField(term92684, term92684.getClass(), "_nonStandardCreation", false);
        setField(term92684, term92684.getClass(), "_unwrappedPropertyHandler", null);
        setBooleanField(term92684, term92684.getClass(), "_needViewProcesing", false);
        setField(term92684, term92684.getClass(), "_serializationShape", enum13);
        term93050 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader");
        Object[] args = new Object[2];
        args[0] = term92684;
        args[1] = term93050;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


