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
import java.util.ArrayList;

public class BuilderBasedDeserializer_init_1465534056203 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term104356;
     Object term104666;

    public BuilderBasedDeserializer_init_1465534056203() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term103996 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        Object term104112 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        Object term104230 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.SettableAnyProperty"));
        setField(term103996, term103996.getClass(), "_valueClass", null);
        setField(term103996, term103996.getClass(), "_classAnnotations", term104112);
        setField(term103996, term103996.getClass(), "_beanType", null);
        setField(term103996, term103996.getClass(), "_valueInstantiator", null);
        setField(term103996, term103996.getClass(), "_beanProperties", null);
        setField(term103996, term103996.getClass(), "_backRefs", null);
        setField(term103996, term103996.getClass(), "_ignorableProps", null);
        setBooleanField(term103996, term103996.getClass(), "_ignoreAllUnknown", false);
        setField(term103996, term103996.getClass(), "_anySetter", term104230);
        setField(term103996, term103996.getClass(), "_injectables", null);
        setField(term103996, term103996.getClass(), "_objectIdReader", null);
        setField(term103996, term103996.getClass(), "_unwrappedPropertyHandler", null);
        ArrayList term104536 = new ArrayList();
        term104356 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder"));
        Object term104484 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        setField(term104356, term104356.getClass(), "_valueInstantiator", term104484);
        setField(term104356, term104356.getClass(), "_anySetter", null);
        setField(term104356, term104356.getClass(), "_injectables", term104536);
        setField(term104356, term104356.getClass(), "_objectIdReader", null);
        term104666 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term104784 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        setField(term104666, term104666.getClass(), "_type", null);
        setField(term104784, term104784.getClass(), "_classAnnotations", null);
        setField(term104666, term104666.getClass(), "_classInfo", term104784);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer");
        Class<?>[] argTypes = new Class<?>[7];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.BeanDescription");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap");
        argTypes[3] = Class.forName("java.util.Map");
        argTypes[4] = Class.forName("java.util.Set");
        argTypes[5] = boolean.class;
        argTypes[6] = boolean.class;
        Object[] args = new Object[7];
        args[0] = term104356;
        args[1] = term104666;
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


