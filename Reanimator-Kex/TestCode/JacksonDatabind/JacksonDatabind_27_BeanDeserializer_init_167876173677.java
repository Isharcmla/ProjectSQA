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
import java.util.HashSet;

public class BeanDeserializer_init_167876173677 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14174;
     Object term14562;

    public BeanDeserializer_init_167876173677() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term13846 = Class.forName((String) "java.util.stream.StreamSpliterators$DistinctSpliterator");
        Object term13810 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term13962 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        Object term14062 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(term13810, term13810.getClass(), "_valueClass", term13846);
        setField(term13810, term13810.getClass(), "_classAnnotations", term13962);
        setField(term13810, term13810.getClass(), "_beanType", term14062);
        setField(term13810, term13810.getClass(), "_valueInstantiator", null);
        setField(term13810, term13810.getClass(), "_delegateDeserializer", null);
        setField(term13810, term13810.getClass(), "_propertyBasedCreator", null);
        setField(term13810, term13810.getClass(), "_backRefs", null);
        setField(term13810, term13810.getClass(), "_ignorableProps", null);
        HashSet term14450 = new HashSet();
        term14174 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term14290 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        Object term14402 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(term14174, term14174.getClass(), "_beanType", null);
        setField(term14174, term14174.getClass(), "_classAnnotations", term14290);
        setField(term14174, term14174.getClass(), "_valueInstantiator", null);
        setField(term14174, term14174.getClass(), "_delegateDeserializer", term14402);
        setField(term14174, term14174.getClass(), "_propertyBasedCreator", null);
        setField(term14174, term14174.getClass(), "_backRefs", null);
        setField(term14174, term14174.getClass(), "_ignorableProps", term14450);
        term14562 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.NameTransformer$1"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
        Object[] args = new Object[2];
        args[0] = term14174;
        args[1] = term14562;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


