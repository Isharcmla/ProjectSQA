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

public class BeanDeserializer_init_1678761736205 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term113036;
     Object term113294;

    public BeanDeserializer_init_1678761736205() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term112924 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(term112924, term112924.getClass(), "_valueClass", null);
        setField(term112924, term112924.getClass(), "_classAnnotations", null);
        setField(term112924, term112924.getClass(), "_beanType", null);
        setField(term112924, term112924.getClass(), "_valueInstantiator", null);
        setField(term112924, term112924.getClass(), "_delegateDeserializer", null);
        setField(term112924, term112924.getClass(), "_propertyBasedCreator", null);
        setField(term112924, term112924.getClass(), "_backRefs", null);
        setField(term112924, term112924.getClass(), "_ignorableProps", null);
        setBooleanField(term112924, term112924.getClass(), "_ignoreAllUnknown", false);
        setField(term112924, term112924.getClass(), "_anySetter", null);
        setField(term112924, term112924.getClass(), "_injectables", null);
        setField(term112924, term112924.getClass(), "_objectIdReader", null);
        setBooleanField(term112924, term112924.getClass(), "_nonStandardCreation", false);
        term113036 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term113156 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        setField(term113036, term113036.getClass(), "_beanType", null);
        setField(term113036, term113036.getClass(), "_classAnnotations", null);
        setField(term113036, term113036.getClass(), "_valueInstantiator", null);
        setField(term113036, term113036.getClass(), "_delegateDeserializer", null);
        setField(term113036, term113036.getClass(), "_propertyBasedCreator", null);
        setField(term113036, term113036.getClass(), "_backRefs", null);
        setField(term113036, term113036.getClass(), "_ignorableProps", null);
        setField(term113036, term113036.getClass(), "_anySetter", null);
        setField(term113036, term113036.getClass(), "_injectables", null);
        setField(term113036, term113036.getClass(), "_objectIdReader", null);
        setBooleanField(term113036, term113036.getClass(), "_nonStandardCreation", false);
        setField(term113036, term113036.getClass(), "_unwrappedPropertyHandler", null);
        setField(term113036, term113036.getClass(), "_beanProperties", term113156);
        term113294 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.NameTransformer$NopTransformer"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
        Object[] args = new Object[2];
        args[0] = term113036;
        args[1] = term113294;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


