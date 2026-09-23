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
import java.util.HashSet;

public class BeanDeserializer_init_1678761736126 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37540;
     Object term38058;

    public BeanDeserializer_init_1678761736126() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term37734 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(term37734, term37734.getClass(), "_valueClass", null);
        setField(term37734, term37734.getClass(), "_classAnnotations", null);
        setField(term37734, term37734.getClass(), "_beanType", null);
        setField(term37734, term37734.getClass(), "_valueInstantiator", null);
        setField(term37734, term37734.getClass(), "_delegateDeserializer", null);
        setField(term37734, term37734.getClass(), "_propertyBasedCreator", null);
        setField(term37734, term37734.getClass(), "_backRefs", null);
        setField(term37734, term37734.getClass(), "_ignorableProps", null);
        setBooleanField(term37734, term37734.getClass(), "_ignoreAllUnknown", false);
        setField(term37734, term37734.getClass(), "_anySetter", null);
        setField(term37734, term37734.getClass(), "_injectables", null);
        setField(term37734, term37734.getClass(), "_objectIdReader", null);
        setBooleanField(term37734, term37734.getClass(), "_nonStandardCreation", false);
        HashSet term37782 = new HashSet();
        term37540 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        Object term37678 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.CreatorCollector$Vanilla"));
        Object term37920 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.UnwrappedPropertyHandler"));
        setField(term37540, term37540.getClass(), "_beanType", null);
        setField(term37540, term37540.getClass(), "_classAnnotations", null);
        setField(term37540, term37540.getClass(), "_valueInstantiator", term37678);
        setField(term37540, term37540.getClass(), "_delegateDeserializer", term37734);
        setField(term37540, term37540.getClass(), "_propertyBasedCreator", null);
        setField(term37540, term37540.getClass(), "_backRefs", null);
        setField(term37540, term37540.getClass(), "_ignorableProps", term37782);
        setField(term37540, term37540.getClass(), "_anySetter", null);
        setField(term37540, term37540.getClass(), "_injectables", null);
        setField(term37540, term37540.getClass(), "_objectIdReader", null);
        setBooleanField(term37540, term37540.getClass(), "_nonStandardCreation", false);
        setField(term37540, term37540.getClass(), "_unwrappedPropertyHandler", term37920);
        term38058 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.NameTransformer$NopTransformer"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
        Object[] args = new Object[2];
        args[0] = term37540;
        args[1] = term38058;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


