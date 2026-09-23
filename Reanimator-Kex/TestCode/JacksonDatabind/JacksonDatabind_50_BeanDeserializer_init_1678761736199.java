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

public class BeanDeserializer_init_1678761736199 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term107312;
     Object term107644;

    public BeanDeserializer_init_1678761736199() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term107200 = Class.forName((String) "java.util.concurrent.ConcurrentHashMap$ForEachTransformedValueTask");
        Object term107164 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(term107164, term107164.getClass(), "_valueClass", term107200);
        setField(term107164, term107164.getClass(), "_classAnnotations", null);
        setField(term107164, term107164.getClass(), "_beanType", null);
        setField(term107164, term107164.getClass(), "_valueInstantiator", null);
        setField(term107164, term107164.getClass(), "_delegateDeserializer", null);
        setField(term107164, term107164.getClass(), "_propertyBasedCreator", null);
        setField(term107164, term107164.getClass(), "_backRefs", null);
        setField(term107164, term107164.getClass(), "_ignorableProps", null);
        term107312 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term107416 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term107532 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        setField(term107416, term107416.getClass(), "_class", null);
        setField(term107312, term107312.getClass(), "_beanType", term107416);
        setField(term107312, term107312.getClass(), "_classAnnotations", term107532);
        setField(term107312, term107312.getClass(), "_valueInstantiator", null);
        setField(term107312, term107312.getClass(), "_delegateDeserializer", null);
        setField(term107312, term107312.getClass(), "_propertyBasedCreator", null);
        setField(term107312, term107312.getClass(), "_backRefs", null);
        setField(term107312, term107312.getClass(), "_ignorableProps", null);
        term107644 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.NameTransformer$1"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
        Object[] args = new Object[2];
        args[0] = term107312;
        args[1] = term107644;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


