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

public class BuilderBasedDeserializer_init_1832622301191 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term90741;

    public BuilderBasedDeserializer_init_1832622301191() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term90613 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        setField(term90613, term90613.getClass(), "_valueClass", null);
        setField(term90613, term90613.getClass(), "_classAnnotations", null);
        setField(term90613, term90613.getClass(), "_beanType", null);
        setField(term90613, term90613.getClass(), "_valueInstantiator", null);
        setField(term90613, term90613.getClass(), "_delegateDeserializer", null);
        setField(term90613, term90613.getClass(), "_propertyBasedCreator", null);
        setField(term90613, term90613.getClass(), "_backRefs", null);
        setField(term90613, term90613.getClass(), "_ignorableProps", null);
        setBooleanField(term90613, term90613.getClass(), "_ignoreAllUnknown", false);
        setField(term90613, term90613.getClass(), "_anySetter", null);
        setField(term90613, term90613.getClass(), "_injectables", null);
        setBooleanField(term90613, term90613.getClass(), "_nonStandardCreation", false);
        setField(term90613, term90613.getClass(), "_unwrappedPropertyHandler", null);
        setBooleanField(term90613, term90613.getClass(), "_needViewProcesing", false);
        setField(term90613, term90613.getClass(), "_serializationShape", null);
        setBooleanField(term90613, term90613.getClass(), "_vanillaProcessing", false);
        setField(term90613, term90613.getClass(), "_objectIdReader", null);
        Class<? extends Object> term90883 = Class.forName((String) "java.util.Collections$SynchronizedNavigableSet");
        Class<? extends Object> term92648 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonFormat$Shape");
        Field term92647 = ((Class) term92648).getDeclaredField((String) "ARRAY");
        ((Field) term92647).setAccessible(true);
        Object enum13 = ((Field) term92647).get((Object) null);
        term90741 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        Object term90847 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term91013 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        Object term91275 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        setField(term90847, term90847.getClass(), "_class", term90883);
        setField(term90741, term90741.getClass(), "_beanType", term90847);
        setField(term90741, term90741.getClass(), "_classAnnotations", null);
        setField(term90741, term90741.getClass(), "_valueInstantiator", null);
        setField(term90741, term90741.getClass(), "_delegateDeserializer", null);
        setField(term90741, term90741.getClass(), "_propertyBasedCreator", term91013);
        setField(term90741, term90741.getClass(), "_backRefs", null);
        setBooleanField(term90741, term90741.getClass(), "_ignoreAllUnknown", false);
        setField(term90741, term90741.getClass(), "_anySetter", null);
        setField(term90741, term90741.getClass(), "_injectables", null);
        setBooleanField(term90741, term90741.getClass(), "_nonStandardCreation", false);
        setField(term90741, term90741.getClass(), "_unwrappedPropertyHandler", null);
        setBooleanField(term90741, term90741.getClass(), "_needViewProcesing", false);
        setField(term90741, term90741.getClass(), "_serializationShape", enum13);
        setBooleanField(term90741, term90741.getClass(), "_vanillaProcessing", false);
        setField(term90741, term90741.getClass(), "_objectIdReader", null);
        setField(term90741, term90741.getClass(), "_beanProperties", term91275);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer");
        argTypes[1] = Class.forName("java.util.Set");
        Object[] args = new Object[2];
        args[0] = term90741;
        args[1] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


