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
import java.util.ArrayList;

public class BeanDeserializer_init_1724735634142 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52049;
     Object term52231;
     Object term52469;

    public BeanDeserializer_init_1724735634142() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term51779 = Class.forName((String) "java.util.stream.Nodes$SizedCollectorTask$OfDouble");
        HashMap term51923 = new HashMap();
        Object term51743 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term51875 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term51743, term51743.getClass(), "_valueClass", term51779);
        setField(term51743, term51743.getClass(), "_classAnnotations", null);
        setField(term51743, term51743.getClass(), "_beanType", term51875);
        setField(term51743, term51743.getClass(), "_valueInstantiator", null);
        setField(term51743, term51743.getClass(), "_beanProperties", null);
        setField(term51743, term51743.getClass(), "_backRefs", term51923);
        setField(term51743, term51743.getClass(), "_ignorableProps", null);
        setBooleanField(term51743, term51743.getClass(), "_ignoreAllUnknown", false);
        setField(term51743, term51743.getClass(), "_anySetter", null);
        ArrayList term52101 = new ArrayList();
        term52049 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder"));
        setField(term52049, term52049.getClass(), "_valueInstantiator", null);
        setField(term52049, term52049.getClass(), "_anySetter", null);
        setField(term52049, term52049.getClass(), "_injectables", term52101);
        term52231 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term52349 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        setField(term52231, term52231.getClass(), "_type", null);
        setField(term52349, term52349.getClass(), "_classAnnotations", null);
        setField(term52349, term52349.getClass(), "_annotationIntrospector", null);
        setField(term52231, term52231.getClass(), "_classInfo", term52349);
        term52469 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
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
        args[0] = term52049;
        args[1] = term52231;
        args[2] = term52469;
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


