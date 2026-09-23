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

public class BuilderBasedDeserializer_init_516859802115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31237;
     Object term31497;

    public BuilderBasedDeserializer_init_516859802115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term30991 = Class.forName((String) "java.util.concurrent.LinkedBlockingDeque");
        Object term30955 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        Object term31109 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        setField(term30955, term30955.getClass(), "_valueClass", term30991);
        setField(term30955, term30955.getClass(), "_classAnnotations", null);
        setField(term30955, term30955.getClass(), "_beanType", null);
        setField(term30955, term30955.getClass(), "_valueInstantiator", null);
        setField(term30955, term30955.getClass(), "_delegateDeserializer", null);
        setField(term30955, term30955.getClass(), "_propertyBasedCreator", null);
        setField(term30955, term30955.getClass(), "_backRefs", null);
        setField(term30955, term30955.getClass(), "_ignorableProps", null);
        setBooleanField(term30955, term30955.getClass(), "_ignoreAllUnknown", false);
        setField(term30955, term30955.getClass(), "_anySetter", null);
        setField(term30955, term30955.getClass(), "_injectables", null);
        setBooleanField(term30955, term30955.getClass(), "_nonStandardCreation", false);
        setField(term30955, term30955.getClass(), "_unwrappedPropertyHandler", null);
        setBooleanField(term30955, term30955.getClass(), "_needViewProcesing", false);
        setField(term30955, term30955.getClass(), "_serializationShape", null);
        setField(term30955, term30955.getClass(), "_objectIdReader", term31109);
        Class<? extends Object> term33194 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonFormat$Shape");
        Field term33193 = ((Class) term33194).getDeclaredField((String) "NUMBER_FLOAT");
        ((Field) term33193).setAccessible(true);
        Object enum1 = ((Field) term33193).get((Object) null);
        term31237 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        setField(term31237, term31237.getClass(), "_beanType", null);
        setField(term31237, term31237.getClass(), "_classAnnotations", null);
        setField(term31237, term31237.getClass(), "_valueInstantiator", null);
        setField(term31237, term31237.getClass(), "_delegateDeserializer", null);
        setField(term31237, term31237.getClass(), "_propertyBasedCreator", null);
        setField(term31237, term31237.getClass(), "_backRefs", null);
        setField(term31237, term31237.getClass(), "_ignorableProps", null);
        setBooleanField(term31237, term31237.getClass(), "_ignoreAllUnknown", false);
        setField(term31237, term31237.getClass(), "_anySetter", null);
        setField(term31237, term31237.getClass(), "_injectables", null);
        setBooleanField(term31237, term31237.getClass(), "_nonStandardCreation", false);
        setField(term31237, term31237.getClass(), "_unwrappedPropertyHandler", null);
        setBooleanField(term31237, term31237.getClass(), "_needViewProcesing", false);
        setField(term31237, term31237.getClass(), "_serializationShape", enum1);
        term31497 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader");
        Object[] args = new Object[2];
        args[0] = term31237;
        args[1] = term31497;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


