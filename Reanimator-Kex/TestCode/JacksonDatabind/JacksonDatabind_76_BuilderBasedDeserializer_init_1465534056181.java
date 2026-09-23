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
import java.util.ArrayList;

public class BuilderBasedDeserializer_init_1465534056181 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80134;
     Object term80440;

    public BuilderBasedDeserializer_init_1465534056181() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term79754 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonSubTypes");
        Object term79718 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        Object term79870 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        Object term80008 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.UnwrappedPropertyHandler"));
        setField(term79718, term79718.getClass(), "_valueClass", term79754);
        setField(term79718, term79718.getClass(), "_classAnnotations", term79870);
        setField(term79718, term79718.getClass(), "_beanType", null);
        setField(term79718, term79718.getClass(), "_valueInstantiator", null);
        setField(term79718, term79718.getClass(), "_beanProperties", null);
        setField(term79718, term79718.getClass(), "_backRefs", null);
        setField(term79718, term79718.getClass(), "_ignorableProps", null);
        setBooleanField(term79718, term79718.getClass(), "_ignoreAllUnknown", false);
        setField(term79718, term79718.getClass(), "_anySetter", null);
        setField(term79718, term79718.getClass(), "_injectables", null);
        setField(term79718, term79718.getClass(), "_objectIdReader", null);
        setField(term79718, term79718.getClass(), "_unwrappedPropertyHandler", term80008);
        ArrayList term80310 = new ArrayList();
        term80134 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder"));
        Object term80258 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.ValueInstantiator$Base"));
        setField(term80134, term80134.getClass(), "_valueInstantiator", term80258);
        setField(term80134, term80134.getClass(), "_anySetter", null);
        setField(term80134, term80134.getClass(), "_injectables", term80310);
        setField(term80134, term80134.getClass(), "_objectIdReader", null);
        term80440 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term80558 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        Object term80674 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        setField(term80440, term80440.getClass(), "_type", null);
        setField(term80558, term80558.getClass(), "_classAnnotations", term80674);
        setField(term80440, term80440.getClass(), "_classInfo", term80558);
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
        args[0] = term80134;
        args[1] = term80440;
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


