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

public class BeanDeserializer_init_1724735634215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term126253;
     Object term126521;

    public BeanDeserializer_init_1724735634215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term126011 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term126127 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        setField(term126011, term126011.getClass(), "_valueClass", null);
        setField(term126011, term126011.getClass(), "_classAnnotations", term126127);
        setField(term126011, term126011.getClass(), "_beanType", null);
        setField(term126011, term126011.getClass(), "_valueInstantiator", null);
        setField(term126011, term126011.getClass(), "_beanProperties", null);
        setField(term126011, term126011.getClass(), "_backRefs", null);
        setField(term126011, term126011.getClass(), "_ignorableProps", null);
        setBooleanField(term126011, term126011.getClass(), "_ignoreAllUnknown", false);
        setField(term126011, term126011.getClass(), "_anySetter", null);
        setField(term126011, term126011.getClass(), "_injectables", null);
        setField(term126011, term126011.getClass(), "_objectIdReader", null);
        setField(term126011, term126011.getClass(), "_unwrappedPropertyHandler", null);
        term126253 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder"));
        Object term126391 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.CreatorCollector$Vanilla"));
        setField(term126253, term126253.getClass(), "_valueInstantiator", term126391);
        setField(term126253, term126253.getClass(), "_anySetter", null);
        setField(term126253, term126253.getClass(), "_injectables", null);
        setField(term126253, term126253.getClass(), "_objectIdReader", null);
        term126521 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term126639 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        Object term126755 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        setField(term126521, term126521.getClass(), "_type", null);
        setField(term126639, term126639.getClass(), "_classAnnotations", term126755);
        setField(term126521, term126521.getClass(), "_classInfo", term126639);
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
        args[0] = term126253;
        args[1] = term126521;
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


