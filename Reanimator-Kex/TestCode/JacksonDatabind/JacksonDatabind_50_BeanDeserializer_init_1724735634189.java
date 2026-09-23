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

public class BeanDeserializer_init_1724735634189 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term94997;
     Object term95263;

    public BeanDeserializer_init_1724735634189() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term94767 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term94871 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term94767, term94767.getClass(), "_valueClass", null);
        setField(term94767, term94767.getClass(), "_classAnnotations", null);
        setField(term94767, term94767.getClass(), "_beanType", term94871);
        setField(term94767, term94767.getClass(), "_valueInstantiator", null);
        setField(term94767, term94767.getClass(), "_beanProperties", null);
        setField(term94767, term94767.getClass(), "_backRefs", null);
        setField(term94767, term94767.getClass(), "_ignorableProps", null);
        setBooleanField(term94767, term94767.getClass(), "_ignoreAllUnknown", false);
        setField(term94767, term94767.getClass(), "_anySetter", null);
        setField(term94767, term94767.getClass(), "_injectables", null);
        setField(term94767, term94767.getClass(), "_objectIdReader", null);
        setField(term94767, term94767.getClass(), "_unwrappedPropertyHandler", null);
        term94997 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder"));
        Object term95133 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator"));
        setField(term94997, term94997.getClass(), "_valueInstantiator", term95133);
        setField(term94997, term94997.getClass(), "_anySetter", null);
        setField(term94997, term94997.getClass(), "_injectables", null);
        setField(term94997, term94997.getClass(), "_objectIdReader", null);
        term95263 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term95381 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        Object term95497 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        setField(term95263, term95263.getClass(), "_type", null);
        setField(term95381, term95381.getClass(), "_classAnnotations", term95497);
        setField(term95263, term95263.getClass(), "_classInfo", term95381);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<?>[] argTypes = new Class<?>[7];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.BeanDescription");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap");
        argTypes[3] = Class.forName("java.util.Map");
        argTypes[4] = Class.forName("java.util.HashSet");
        argTypes[5] = boolean.class;
        argTypes[6] = boolean.class;
        Object[] args = new Object[7];
        args[0] = term94997;
        args[1] = term95263;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        args[5] = true;
        args[6] = false;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


