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

public class BuilderBasedDeserializer_init_1465534056211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term115414;
     Object term115850;

    public BuilderBasedDeserializer_init_1465534056211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term115288 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        setField(term115288, term115288.getClass(), "_valueClass", null);
        setField(term115288, term115288.getClass(), "_classAnnotations", null);
        setField(term115288, term115288.getClass(), "_beanType", null);
        setField(term115288, term115288.getClass(), "_valueInstantiator", null);
        setField(term115288, term115288.getClass(), "_beanProperties", null);
        setField(term115288, term115288.getClass(), "_backRefs", null);
        setField(term115288, term115288.getClass(), "_ignorableProps", null);
        setBooleanField(term115288, term115288.getClass(), "_ignoreAllUnknown", false);
        setField(term115288, term115288.getClass(), "_anySetter", null);
        setField(term115288, term115288.getClass(), "_injectables", null);
        setField(term115288, term115288.getClass(), "_objectIdReader", null);
        setField(term115288, term115288.getClass(), "_unwrappedPropertyHandler", null);
        ArrayList term115720 = new ArrayList();
        term115414 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder"));
        Object term115550 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator"));
        Object term115668 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.SettableAnyProperty"));
        setField(term115414, term115414.getClass(), "_valueInstantiator", term115550);
        setField(term115414, term115414.getClass(), "_anySetter", term115668);
        setField(term115414, term115414.getClass(), "_injectables", term115720);
        setField(term115414, term115414.getClass(), "_objectIdReader", null);
        term115850 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term115968 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        setField(term115850, term115850.getClass(), "_type", null);
        setField(term115968, term115968.getClass(), "_classAnnotations", null);
        setField(term115850, term115850.getClass(), "_classInfo", term115968);
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
        args[0] = term115414;
        args[1] = term115850;
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


