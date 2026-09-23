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

public class BeanDeserializer_init_1724735634195 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term103216;
     Object term103484;

    public BeanDeserializer_init_1724735634195() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term103090 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(term103090, term103090.getClass(), "_valueClass", null);
        setField(term103090, term103090.getClass(), "_classAnnotations", null);
        setField(term103090, term103090.getClass(), "_beanType", null);
        setField(term103090, term103090.getClass(), "_valueInstantiator", null);
        setField(term103090, term103090.getClass(), "_beanProperties", null);
        setField(term103090, term103090.getClass(), "_backRefs", null);
        setField(term103090, term103090.getClass(), "_ignorableProps", null);
        setBooleanField(term103090, term103090.getClass(), "_ignoreAllUnknown", false);
        setField(term103090, term103090.getClass(), "_anySetter", null);
        setField(term103090, term103090.getClass(), "_injectables", null);
        setField(term103090, term103090.getClass(), "_objectIdReader", null);
        setField(term103090, term103090.getClass(), "_unwrappedPropertyHandler", null);
        term103216 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder"));
        Object term103354 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.CreatorCollector$Vanilla"));
        setField(term103216, term103216.getClass(), "_valueInstantiator", term103354);
        setField(term103216, term103216.getClass(), "_anySetter", null);
        setField(term103216, term103216.getClass(), "_injectables", null);
        setField(term103216, term103216.getClass(), "_objectIdReader", null);
        term103484 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term103602 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        Object term103718 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        setField(term103484, term103484.getClass(), "_type", null);
        setField(term103602, term103602.getClass(), "_classAnnotations", term103718);
        setField(term103484, term103484.getClass(), "_classInfo", term103602);
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
        args[0] = term103216;
        args[1] = term103484;
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


