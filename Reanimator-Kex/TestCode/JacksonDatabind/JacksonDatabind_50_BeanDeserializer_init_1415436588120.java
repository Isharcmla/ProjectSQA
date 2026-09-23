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

public class BeanDeserializer_init_1415436588120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36853;

    public BeanDeserializer_init_1415436588120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term36723 = Class.forName((String) "kex.java.util.LinkedHashMap$LinkedValues");
        Object term36687 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(term36687, term36687.getClass(), "_valueClass", term36723);
        setField(term36687, term36687.getClass(), "_classAnnotations", null);
        setField(term36687, term36687.getClass(), "_beanType", null);
        setField(term36687, term36687.getClass(), "_valueInstantiator", null);
        setField(term36687, term36687.getClass(), "_delegateDeserializer", null);
        setField(term36687, term36687.getClass(), "_propertyBasedCreator", null);
        setField(term36687, term36687.getClass(), "_backRefs", null);
        setField(term36687, term36687.getClass(), "_ignorableProps", null);
        setBooleanField(term36687, term36687.getClass(), "_ignoreAllUnknown", false);
        setField(term36687, term36687.getClass(), "_anySetter", null);
        setField(term36687, term36687.getClass(), "_injectables", null);
        setBooleanField(term36687, term36687.getClass(), "_nonStandardCreation", false);
        setField(term36687, term36687.getClass(), "_unwrappedPropertyHandler", null);
        setBooleanField(term36687, term36687.getClass(), "_needViewProcesing", false);
        setField(term36687, term36687.getClass(), "_serializationShape", null);
        setBooleanField(term36687, term36687.getClass(), "_vanillaProcessing", false);
        setField(term36687, term36687.getClass(), "_objectIdReader", null);
        HashMap term37007 = new HashMap();
        Class<? extends Object> term41363 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonFormat$Shape");
        Field term41362 = ((Class) term41363).getDeclaredField((String) "NUMBER_INT");
        ((Field) term41362).setAccessible(true);
        Object enum7 = ((Field) term41362).get((Object) null);
        term36853 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        Object term36959 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term37125 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.SettableAnyProperty"));
        Object term37387 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        setField(term36959, term36959.getClass(), "_class", null);
        setField(term36853, term36853.getClass(), "_beanType", term36959);
        setField(term36853, term36853.getClass(), "_classAnnotations", null);
        setField(term36853, term36853.getClass(), "_valueInstantiator", null);
        setField(term36853, term36853.getClass(), "_delegateDeserializer", null);
        setField(term36853, term36853.getClass(), "_propertyBasedCreator", null);
        setField(term36853, term36853.getClass(), "_backRefs", term37007);
        setBooleanField(term36853, term36853.getClass(), "_ignoreAllUnknown", false);
        setField(term36853, term36853.getClass(), "_anySetter", term37125);
        setField(term36853, term36853.getClass(), "_injectables", null);
        setBooleanField(term36853, term36853.getClass(), "_nonStandardCreation", false);
        setField(term36853, term36853.getClass(), "_unwrappedPropertyHandler", null);
        setBooleanField(term36853, term36853.getClass(), "_needViewProcesing", false);
        setField(term36853, term36853.getClass(), "_serializationShape", enum7);
        setBooleanField(term36853, term36853.getClass(), "_vanillaProcessing", false);
        setField(term36853, term36853.getClass(), "_objectIdReader", null);
        setField(term36853, term36853.getClass(), "_beanProperties", term37387);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        argTypes[1] = Class.forName("java.util.Set");
        Object[] args = new Object[2];
        args[0] = term36853;
        args[1] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


