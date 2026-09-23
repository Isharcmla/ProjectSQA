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

public class BeanDeserializer_init_1724735634203 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term126839;
     Object term127021;

    public BeanDeserializer_init_1724735634203() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term126493 = Class.forName((String) "java.util.concurrent.ConcurrentHashMap$EntrySetView");
        Object term126457 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term126609 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        Object term126713 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term126457, term126457.getClass(), "_valueClass", term126493);
        setField(term126457, term126457.getClass(), "_classAnnotations", term126609);
        setField(term126457, term126457.getClass(), "_beanType", term126713);
        setField(term126457, term126457.getClass(), "_valueInstantiator", null);
        setField(term126457, term126457.getClass(), "_beanProperties", null);
        setField(term126457, term126457.getClass(), "_backRefs", null);
        setField(term126457, term126457.getClass(), "_ignorableProps", null);
        setBooleanField(term126457, term126457.getClass(), "_ignoreAllUnknown", false);
        setField(term126457, term126457.getClass(), "_anySetter", null);
        ArrayList term126891 = new ArrayList();
        term126839 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder"));
        setField(term126839, term126839.getClass(), "_valueInstantiator", null);
        setField(term126839, term126839.getClass(), "_anySetter", null);
        setField(term126839, term126839.getClass(), "_injectables", term126891);
        term127021 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term127139 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        Object term127255 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        setField(term127021, term127021.getClass(), "_type", null);
        setField(term127139, term127139.getClass(), "_classAnnotations", term127255);
        setField(term127021, term127021.getClass(), "_classInfo", term127139);
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
        args[0] = term126839;
        args[1] = term127021;
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


